# miniBlog

## 简介

**miniBlog**，采用Spring Boot进行开发，利用服务端课程相关知识进行构建。

所用知识点：
- 依赖注入
- AOP
- Spring MVC(前后端不分离thymeleaf)
- JPA
- Spring Security
- ~~REST API范式~~
- Docker

前两天看到开源项目halo，几乎使用上述知识点就已经完成了其1.0版本的开发，所以也想要参考着做一个个人博客的项目。

~~说来，大二刚开学的时候一个学长就建议我尝试前后端分离做一个博客项目，但自己也一直没有去进行学习和尝试，甚至Spring Boot是这学期服务端课程才开始正式学习，Vue却是寒假才开始接触。
不过细想来，这些技术不论是大二上的计网、大二下的软工二、大二暑假的云原生、本学期的服务端、移动互联网软件工程其实都有讲解。
还是自身的惰性，只是局限于听了、作业做了，课后也不去自己找课程、找项目进行实践。~~

## 需求分析

### 产品功能

- 博客后端
- 后台管理系统，进行相关内容的管理
- 前台展示页面，展示博客信息

### 界面设计&&功能需求

#### 前台展示页面

- 主页：展示博客封面以及其他信息，可以仿照Hexo或者最简洁的halo
- 博客详情页：渲染markdown文章内容
- 归档管理页：只依据最简单的发帖时间进行文章归档

#### 后台管理页面

- 文章管理：包括对于文章的增删改查
- 登陆注册：初始化唯一的管理员账户和密码

## 已实现功能

- 基于**Spring Security**的管理员身份认证以及登录
- 基于**AOP**的切面注入，例如AdminAspect中将Boolean切入return结果
- 基于**thymeleaf**的MVC开发框架，前后端采取不分离开发
- 基于**JPA**的数据库CRUD，现阶段采用H2数据库做持久化
- 基于**CommandLineRunner**方式的初始化数据库
- 采用editormd作为markdown编辑器、渲染器
- 采用docker进行容器化部署

预览图：

![img.png](https://s2.loli.net/2024/03/01/be4lHwIVnG5iJaN.png)

![img2.png](https://s2.loli.net/2024/03/01/SYLtBsp4FZoAKkj.png)

![img3.png](https://s2.loli.net/2024/03/01/rqV6MHBzW29lond.png)

![img4.png](https://s2.loli.net/2024/03/01/eJmPdY16EMOkguA.png)

![img5.png](https://s2.loli.net/2024/03/01/7XdBN6Jf8eRzc1T.png)

## 使用

### 1. 配置

初始化管理员名称及密码均为admin

可访问对应ip，如果是本地就是localhost:8080加上后缀/console，即localhost:8080/console，即可进入管理后台修改用户名以及密码。

h2数据库做了持久化，在系统用户文件夹中.miniBlog/db/blog应该能够看到，想要直接操纵数据库，可输入localhost:8080/h2-console，可进行上述身份认证后，输入正确数据库地址以及用户名密码，配置文件中为admin和123456。

### 2. 查看

直接输入localhost:8080或者对应ip在浏览器中，就可直接浏览博客内容，无需身份认证。

## 杂谈

- 服务器被挖矿病毒攻击、网络故障、镜像错误、删库跑路、vscode远程连接操作系统不再适用...