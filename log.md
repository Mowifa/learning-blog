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
* 