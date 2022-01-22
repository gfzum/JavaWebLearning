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

- 双标签<name> </name>
- 单标签<name />
- 大小写不敏感
- 属性
  - 基本属性：bgcolor
  - 事件属性：`onclick = "alert("1");"`

### 3、特殊字符

- 空格 `&nbsp` 一般空格即换行会被过滤（多个保留一个）
- 大于 > `&gt`
- 小于 <  `&lt`
- 引号 ‘’ `&quot`
- 撇号 ‘ `&apos`

### 4、常用标签

h、a(href, target可以指定iframe名)、font?、img(src, alt)、table(tr, td, border, cellspacing, row/colspan)、form(action=ip, method=get/post)、input(type=text, radio, checkbox, submit, reset, hidden...)、select(option)、div、span、p

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

