# Springboot-Multi-ViewResolver
Springboot 1.5.2 Multi-view multiple ViewResolver by ContentNegotiatingViewResolver .jsp .xml .json

run senyintapplication main 

visit http://localhost:8888/test   resolve by  InternalResourceViewResolver contenttype TEXT_HTML  --jsp 
visit http://localhost:8888/test.xml   resolve by  ThymeleafViewResolver   contenttype TEXT_XML  --xml
visit http://localhost:8888/test.html   resolve by  ThymeleafViewResolver contenttype APPLICATION_XHTML_XML   --html 
visit http://localhost:8888/test.json   resolve by  MappingJackson2JsonView contenttype APPLICATION_JSON   --json


###### 1、外部系统通过http调用排队叫号系统(his 核医学等外部业务系统)，
2、数据过来之后，通过字典表redis缓存，
先保存redis(使用redis的list集合保存每个科室的队列情况?-通过系统key+医院key+院区key+科室key) 
保存超时或者redis挂掉(超时设置?) 
之后保存数据库.
2、在redis无法使用时候保证系统可以使用数据库正常工作。
3、超时打印日志，使用apache storm进行日志分析。
4、设计表不光考虑到科室 院区 还考虑到医院 名称  为区域化设计做准备；
5、患者标识设计 急诊 军？ vip？不应设置不同字段flag 
不方便扩展，使用一个字段type无法支持多状态 即急诊又vip又军人
6、患者被叫过之后数据应落地 加入到mq消息队列(mq问题时容错?) 
做持久化或数据库已被查询等？
mq解耦 系统在拆分？ 业务处理？  查询处理系统？
7、缓存穿透  缓存失效? 系统启动加载缓存 虽然系统小也考虑进去
7、管理者领导查看院区队列情况？不同权限查看不同级别 医院-院区-科室-...

springboot + vue? or thymeleaf? + druid + mysql?+oracle + 
rabbitmq + redis + swgger2? + 

入口考虑多支持? http 插库 socket连接? webservice?

排队叫号终端支持?
sQueue