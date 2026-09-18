# Spring boot
## 前置
### 首先,我的程序到底如何运转?底层逻辑是:controller>>service>>mapper(dao)>>database.
而其中每一个部分究竟有什么用?
* Controller:用于接收http请求,比如用户浏览器想要东西,它就会接收到
* service:专门干活的,controller只负责告诉你用户需要什么,而service是真正处理业务的部分
* mapper:保存数据的,用户的信息,记录等等都保存在这
* pojo,这个名词很长一段时间没搞明白,后来查了它的英文:plain old java object,于是产生新的疑问,我要这个东西来干嘛?其实就是面向对象的思想,pojo用来封装用户信息,返回的信息一类的普通对象.
### 具体到项目中,每个部分都写些什么?
* Controller:负责接受请求,调用service,返回数据,不写任何业务
* Service:所有具体的业务逻辑
* Mapper:负责和数据库交互,简单的增删改查之类的
* tip:不同用途的数据对象不要混在一起:数据库里的用户用User;接受请求用ReviewRequest;返回结果用ReviewResponse
## 一些
* RestController?  
其实它就是说,请求的东西不是网页,而是JSON,要直接返回给客户端
* 跟Controller的区别?  
Controller接收到请求会去找html,rest可以帮我调用jackson,返回json
### 到这里有一个新的问题,怎么处理用户发送的数据?  
答:用户发送json后,spring boot把json变成pojo,然后再由controller接收,service处理,返回的信息再给pojo,spring boot再变回json返回给用户  
学到这里不禁觉得,是我误会pojo了,原来是这么有用的东西...
## Spring boot 自动装配原理
* pom.xml:核心依赖
* 写或者引入依赖时,不需要指定版本,因为有版本仓库
## 启动器:starter
* spring boot的启动场景,比如springboot-starter-web,会自动导入web环境所有依赖,会将所有web需要的场景变成启动器
## 主程序
### 注解
* @SpringBootApplication:标注这个类是一个springboot的应用,且启动类下的所有资源都被导入   

* ...源码还是有很多看不懂的地方,之后再来看吧
## 启动:run
* run并非运行了一个main方法,而是启动了一个服务.   
在做DemoApplication.run时,其实做了四件事:   
1.推断应用的类型是普通类还是Web项目   
2.查找并加载所有可用的初始化器,设置到initializers属性中  
3.找出所有应用程序监听器,设置到listeners属性中,用于监听上下文和组件  
4.推断并设置main方法的定义类,找到运行的主类  