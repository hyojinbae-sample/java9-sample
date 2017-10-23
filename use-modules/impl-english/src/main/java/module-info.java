module usemodule.impl.english {
    requires usemodule.api;

    provides com.hyojinbae.sample.java9.api.HelloService
            with com.hyojinbae.sample.java9.impl.english.EnglishImpl;
}