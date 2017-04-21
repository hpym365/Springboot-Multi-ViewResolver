# Springboot-Multi-ViewResolver
Springboot 1.5.2 Multi-view multiple ViewResolver by ContentNegotiatingViewResolver .jsp .xml .json

run senyintapplication main 

visit http://localhost:8888/test   resolve by  InternalResourceViewResolver contenttype TEXT_HTML  --jsp 
visit http://localhost:8888/test.xml   resolve by  ThymeleafViewResolver   contenttype TEXT_XML  --xml
visit http://localhost:8888/test.html   resolve by  ThymeleafViewResolver contenttype APPLICATION_XHTML_XML   --html 
visit http://localhost:8888/test.json   resolve by  MappingJackson2JsonView contenttype APPLICATION_JSON   --json
