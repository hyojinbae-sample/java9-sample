module usemodule.application {
   requires usemodule.api;
   exports com.hyojinbae.sample.java9.application;

   uses com.hyojinbae.sample.java9.api.HelloService;
}