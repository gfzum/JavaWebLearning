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



## Simple JQuery

虽然基本过时了，但为了能简单看懂源码还是了解一下

```javascript
//引入jquery库
$(function (){
    var $obj = $("objId");
})
```

### 核心函数 $

- 传参 函数：window.onload
- 传参 html字符串：创建节点对象
- 传参 选择器字符串：查找对象
- 传参 DOM对象：包装为jQuery对象

JQuery对象时dom对象的数组 + 一系列功能函数



## Servlet

JavaWeb三大组件：Servlet程序、Filter过滤器、Listener监听器

Servlet：运行在服务器上的java程序，接受客户端的请求并响应数据

### 1、基础说明

#### 程序配置

```xml
<!--在不使用Java EE注解的情况下需要在web.xml中对写好的servlet程序进行配置-->

<!-- name是别名 class是类全名-->
<servlet>
    <servlet-name>hello</servlet-name>
    <servlet-class>com.gfzum.web_begin.HelloServlet</servlet-class>
</servlet>

<!--将name与url进行对应，/ 代表工程路径 -->
<servlet-mapping>
    <servlet-name>hello</servlet-name>
    <url-pattern>/hello</url-pattern>
</servlet-mapping>"
```

```java
//JavaEE annotated class
@WebServlet(name = "ServletName", value = "/ServletName")
```

#### 生命周期

1. 执行Servlet构造器方法，创建程序时调用
2. 执行`init`初始化方法，创建程序时调用
3. 执行`service`方法，每次访问都会调用
4. 执行`destory`方法，停止时调用
5. 可以通过`<load-on-startup>`设置servlet启动的先后顺序，数字越小启动越靠前

#### 继承体系

<img src="/img/servlet继承体系.png" style="zoom: 67%;" />

#### ServletConfig 

获取程序别名servlet-name、servlet的初始化参数init-param、ServletContext对象

#### ServletContext

- 一个接口，表示Servlet上下文对象
- 一个Web工程只有一个实例，在工程部署启动时创建、停止时销毁
- 域对象：可以像Map一样存取数据的对象，域指存取数据的操作范围（整个web工程）
- 获取web.xml中配置的context-param、当前工程路径、工程部署后的绝对路径

```java
ServletContext context = getServletConfig().getServletContext();
System.out.println(context.getRealPath("/")); //映射到webapp目录

context.setAttribute("key", "value");
```

### 2、HTTP协议

- 请求：客户端向服务器发送数据

- 响应：服务器向客户端发送数据

- **GET**：从服务器端获取数据

  **POST**：将数据保存到服务器端

  **PUT**：命令服务器对数据执行更新

  **DELETE**：命令服务器删除数据

####  GET请求

- 请求行：请求方式 + 资源路径[+?+请求参数] + 协议版本号
- 请求头：key : value
  - Accept：客户端可接受的数据类型
  - Host：请求服务器ip地址及端口
  - Connnection：连接如何处理
    - Keep-Alive：回传数据后保持一段时间连接
    - Closed：马上关闭
- a标签、link标签引入css、script标签引入js、img、iframe、输入地址后回车

####  POST请求

- 请求行
- 请求头 + 空行
  - Referer：发起请求时的地址
  - Content-Type：发送的数据类型
    - application/x-www-form-urlencoded：提交数据格式为name=value&，然后进行url编码
    - multipart/form-data：以多段形式提交数据给服务器（流形式，用于上传）
  - Cache-Control：控制缓存
- **请求体**：发送给服务器的数据

#### HTTP响应格式

- 响应行：协议和版本号 + 状态码 + 状态描述符
- 响应头：key : value + 空行
  - Server：服务器信息
  - Content-Type：响应体数据类型
- 响应体：回传给客户端的数据

常见响应（状态）码：

- 200：请求成功
- 302：请求重定向
- 404：服务器收到，但数据不存在（地址错误）
- 500：服务器收到，但内部有错误（代码错误）

#### MIME类型说明

HTTP协议中的数据类型，格式：”大类型/小类型“，与某种文件的扩展名相对应

| 文件     | MIME类型   |
| -------- | ---------- |
| html文本 | text/html  |
| JPEG图像 | image/ipeg |

### 3、HttpServletRequest类

每当有请求进入Tomcat服务器，服务器会把http协议信息封装入Request对象，传递到service方法中。可以通过HttpServerRequest对象获取所有请求的信息。

- URI: Uniform Resource Identifier 资源标志符
- URL: Uniform Resource Locator 资源定位符（绝对路径）

获取post请求的参数时，须**在获取参数前**使用`setCharacterEncoding("UTF-8")`设置字符集

#### 请求转发

- 服务器收到请求后，从一个资源跳转到另一个资源
- 一次请求，共享Request域中的数据，资源地址一直是转发前的地址
- 可以转发到WEB-INF中（浏览器无法访问该文件夹）
- 无法访问工程外的资源

```java
//servlet1中
request.setAtrribute("key", "value"); //设置标识

//请求转发，以‘/’打头
RequesetDispatcher dispatcher = request.getRequestDispatcher("/servlet2"); 
RequesetDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.html"); 
dispatcher.forward(requst, response); //转发

//servlet2中
Object key1 = req.getAttribute("key");
```

`base`标签可以设置页面**相对路径**工作时参照的地址（以防通过请求转发进行跳转后出现错误）

```html
<head>
    <base href = "path" />
</head>
```

对于 `/`，其为一种绝对路径：

- 被浏览器解析：`http://ip:port/`
- 被服务器解析：`http://ip:port/工程路径`
- 特殊情况：`response.sendRedirect("/")` 把 `/` 发送给浏览器解析

### 4、HttpServletResponse类

每次请求服务器都会创建一个HttpServletResponse对象，可通过其设置返回给客户端的信息

#### 两种输出流

- 字节流：`getOutputStream()` 常用于下载（传递二进制数据） 
- 字符流：`getWriter()` 常用于回传字符串（常用）
- 只能同时使用一个

```java
PrintWriter writer = resp.getWriter();
writer.write("hello");
```

服务器默认字符集为`ISO-8859-1`，须进行更改：

```java
response.setCharacterEncoding("UTF-8") //服务器字符集
response.setHeader("Content-Type", "text/html; charset=UTF-8"); //设置响应头更改浏览器字符集

//同时设置服务器和客户端，要在获取流对象之前调用
response.setContentType("Content-Type", "text/html; charset=UTF-8")；
```

#### 请求重定向 302

客户端给服务器发送请求时，服务器将请求重定向至新的地址（应用于地址更改情况）

```java
//设置响应状态码表示重定向、响应头说明新地址
response.setStatus(302);
response.setHeader("Location", "path");
//替换写法，注意该地址是发送给浏览器解析
response.sendRedirect("path");
```

- 浏览器地址栏变化
- 两次请求，不共享Request域中的数据
- 无法访问到WEB-INF文件夹
- 可以访问工程外的资源

**重定向和转发都不会立即执行，会把Servlet中所有的代码都执行完毕以后再发生跳转**。

### 5、Cookie 

- cookie是servlet发送给web浏览器的键值对信息，cookie值可以唯一表示客户端，常用于会话管理
- 有了cookie后，每次请求客户端会发送回服务器
- 每个cookie大小不超过4kb

```java
//创建cookie
Cookie cookie = new Cookie("key", "value");
response.addCookie(cookie);

//获取cookie数组，查找指定cookie须单独判断
Cookie[] cookies = request.getCookies();
```

更改cookie值的两种方法：

- 创建新的同key值cookie，写入新value
- 使用`setValue()`修改原cookie的值

#### Cookie生命控制

`setMaxAge(int expiry)` 设置cookie最大生存时间，单位为秒

- 参数为正：在指定秒数后删除cookie
- 负数：浏览器退出时删除cookie（默认，session级别）
- 0：直接删除cookie

#### Cookie的有效路径Path

通过请求来对发送给服务器的cookie进行过滤

```java
cookie2.setPath(req.getContextPath() + "/test"); //在创建cookie时设置path

cookie1 path = / （默认）
cookie2 path = /test
在/下，只有cookie1会被发送
```

### 6、Session

Http无状态：服务器无法判断两次请求是否属于同一个客户端，可以通过会话跟踪技术解决

