module usemodule.impl.korean {
    requires usemodule.api;

    provides com.hyojinbae.sample.java9.api.HelloService
            with com.hyojinbae.sample.java9.impl.korean.KoreanImpl;
}