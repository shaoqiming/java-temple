# java-temple
权限管理java版本

#### 2018-6-7
- Spring mvc 返回json格式的时候 需要使用ResponseBody 注解
- 使用ResponseBody 注解的时候 需要手动的引入jackson的jar包


#### 2018-6-8
- mybatis-spring的jar包是在哪个项目中 :放到service中，web端可能有多个，放到service中可以共用
- properties 是写在哪里的 src main的resource里面
- 如何配置 开发模式和发布模式的 maven配置
- mybatis的事务是如何配置的
- 事务的传播途径 7中 和事务的隔离级别


#### 2018-6-12
- 研究日志系统 (基础配置完成)
- 完成数据库的设计（完成）
- - 生成数据库表结构 
- 生成底层的代码结构



#### 后面开发的问题和目标
- 研究如何在mybaits 提交的时候 可以将当前登录人信息的操作放到数据库中去。
- 使用hibernate来进行dao的替换
- 使用redis进行缓存的处理(为了业务而业务)
- 使用shiro进行权限的控制
- 使用durid 进行sql监控和数据库连接池
