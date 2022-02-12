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

`a(href, target可以指定iframe名)`、`img(src, alt)`、`table(tr, td, border, cellspacing, row/colspan)`、`form(action=ip, method=get/post)`、`input(type=text, radio, checkbox, submit, reset, hidden...)`、`select(option)`、`div`、`span`（不换行块标签）、`p`

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

/* 盒子模型 */
border margin padding

/* 定位和浮动 */
position float
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

通过数组下标**赋值**后，最大的下标值会自动给数组扩容，未赋值的位置值为undefined

函数：

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

### 5、事件

 电脑设备与页面进行交互的响应

- `onload` 页面加载完成，常用于页面代码初始化
- `onclick` 单击事件
- `onmouseover` `onmouseout` 鼠标悬浮/离开
- `onblur` 失去焦点，常用于输入框失去焦点后验证内容
- `onchange` 内容发生改变，常用于下拉列表和输入框内容发生改变后
- `onsubmit` 表单提交，注意要加在form标签而非submit标签上

和table配合时，可能出现事件传递(tr -> td)

#### 事件的注册（绑定）

事件响应后要执行的代码

- 静态注册：通过html标签的事件属性直接赋予事件响应后的代码
- 动态注册：先通过js代码得到标签的dom对象，通过dom对象.事件名=function赋予代码

```javascript
//动态注册 代码写在页面加载完之后
window.onload = function(){
    //获取标签对象
    var obj = document.getElementById(id);
    //标签对象.事件名=function
    obj.onclick = function(){}
}
```

### 6、DOM模型

Document Object Model 把文档中的标签、属性、文本（换行符也算一个节点）转换成对象来管理

#### Document对象

管理了所有html文档内容，通过树结构存储信息，把所有的标签、属性、文本对象化，可以用来访问页面所有元素

方法：

- `getElementById`  返回对拥有指定id的第一个对象的引用，故要求id不能相同?
- `getElementByName` 返回带有指定名称的对象集合 
- `getElementByTagName` 返回带有指定标签名的对象集合
- 优先顺序：id > name > tag
- `creatElement`  

#### RegExp 正则对象

```javascript
 //创建方式
var patt = new RegExp(pattern, modifiers);
var patt = /pattern/modifiers;

//匹配包含
patt.test(string);
```

- 任意字符：`[abc]` `[a-z]` `[^abc]`（不包含）
- 元字符
  - `\w` 单词字符，包括a-z、A-Z、0-9、下划线_
  - `\W` 非单词字符
  - `\d` 数字  `\s` 空白字符
- 量词
  - `n+` 是否包含至少一个n
  - `n*` 是否包含零个或多个n
  - `n?` 是否包含零个或一个n 
  - `n{X}` 是否包含连续X个n
  - `n{X, Y}` 是否包含 至少连续X个n， 至多连续Y个n
  - `n{X,}` 是否包含至少连续X个n
  - `n$` 以n结尾
  - `^n` 以n开头 
- **注意**
  - 当用`/.../`匹配时，上述“包含”条件，只要满足一项即会匹配成功，如对于aaa，`/a{1,2}/` 会匹配成功
  - 当用`/^...$/`匹配时，会扫描完整个字符串后再进行条件匹配，需要字符串从头到尾都满足条件

###  7、节点

可认为节点就是标签对象（实际上文字、注释也都是节点） 

常用方法：

- `getElementByTagName` 获取当前节点的指定标签名的孩子节点
- `appendChild` 添加一个子节点

常用属性：childNodes, firstChild, parentNode, nextSibling, className, innerHTML等