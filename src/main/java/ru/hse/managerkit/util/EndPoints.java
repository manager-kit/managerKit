package ru.hse.managerkit.util;

public final class EndPoints {
    public static final String BASE = "/api";
    public static final String BASE_USER = BASE + "/user";
    public static final String GET = "/get";
    public static final String BY_ID = "/{id}";


    public static final String SIGN_IN = BASE + "/signin";
    public static final String LOGIN = BASE + "/login";


    public static final String GET_CURRENT_USER = BASE_USER + GET;
    public static final String USER_BY_ID = BASE_USER + BY_ID;

}
