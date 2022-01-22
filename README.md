# JavaWeb

From 尚硅谷

- JavaSE C/S Client Server 
- JaveEE B/S Browser Serve

## Simple HTML

### 1、书写规范

```html
<html>
<head>
    <title> </title>
    <!-- others -->
</head>
<body> </body>
</html>
```

### 2、标签介绍

- 双标签 `<name> </name>`
- 单标签 `<name />`
- 大小写不敏感
- 属性
  - 基本属性：bgcolor等
  - 事件属性：`onclick = "alert("1");"`

### 3、特殊字符

- 空格 `&nbsp` 一般空格即换行会被过滤（多个保留一个）
- 大于 > `&gt`
- 小于 <  `&lt`
- 引号 ‘’ `&quot`
- 撇号 ‘ `&apos`

### 4、常用标签

`a(href, target可以指定iframe名)`、`img(src, alt)`、`table(tr, td, border, cellspacing, row/colspan)`、`form(action=ip, method=get/post)`、`input(type=text, radio, checkbox, submit, reset, hidden...)`、`select(option)`、`div`、`span`、`p`

- 相对路径
  - . html文件当前目录
  - .. 上一级目录
  - 文件名 当前目录所在目录的文件，相当于./文件名
- 绝对路径
  - http://ip:port/project_name/src



## Simple CSS

### 1、语法规则

```css
/* 标签名选择器 */
body{
    color:red;
    font-size:30px;
}
```

### 2、CSS与Html的结合

- 标签中加入style
- 在head中用css定义style标签
- 写单独的css文件，通过link标签引入复用

### 3、选择器

- 标签名选择器 `p{name:value;}`
- ID选择器 `#id{name:value;}`  不可重复
- class类型选择器 `.classid{name:value;}`  可重复
- 组合选择器：`s1, s2, sn{name:value;}` 让多个选择器共用同一个代码

### 4、常用样式

```css
/* div居中 */
margin-left: auto;
margin-right: auto;

/* 文字居中 */
text-align: center

/* 超链接去下划线 */
text-decoration: none

/* table边框合并 */
border-collapse: collapse
```



## Simple JavaScript

### 1、js和html结合的方式

- 在head或body中用script标签书写
- 使用script引入写好的 代码

### 2、变量和运算

- 函数类型 function
- undefined 未定义，变量未赋初始值时默认
- null 空值；
- NAN Not a Number

#### 关系运算

== 等于； ===全等于：除了字面值的比较之外，还会比较两个变量的数据类型

#### 逻辑运算

所有的变量都可以作为一个boolean类型变量，0、null、undefined、空串“”为假

**返回能确定结果的值**

- && 且运算
  - 当表达式全为真的时候。返回最后一个表达式的值
  - 当表达式中有一个为假的时候，返回第一个为假的表达式的值
-  || 或运算
  - 当表达式全为假时，返回最后一个表达式的值
  - 只要有一个表达式为真，就会把回第一个为真的表达式的值
- 有短路，当运算有结果了之后，后面的表达式不再执行

### 3、数组和函数

通过数组下标**赋值**后，最大的下标值会自动给数组扩容

```javascript
//不用声明变量和返回值类型
function fun(a, b){
    return a + b;
}

var fun_name = function(a){}
```

函数的**arguments隐形参数**：不需要定义，可用来获取传入参数的值，故JS函数不允许重载（甚至不用定义传入参数）

### 4、自定义对象

```javascript
//定义
var a = new Object();
a.name = "a_name";
a.age = 19;
a.fun = function(){};

var a = {
	name : value,
    age : value,
    fun : function(){}
};
```

