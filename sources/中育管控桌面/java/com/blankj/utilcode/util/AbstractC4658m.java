package com.blankj.utilcode.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.m */
/* loaded from: classes3.dex */
public abstract class AbstractC4658m {

    /* renamed from: a */
    public static final Map f2090a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Gson m2258a() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }

    /* renamed from: b */
    public static Object m2259b(Gson gson, String str, Type type) {
        return gson.fromJson(str, type);
    }

    /* renamed from: c */
    public static Object m2260c(String str, Type type) {
        return m2259b(m2261d(), str, type);
    }

    /* renamed from: d */
    public static Gson m2261d() {
        Map map = f2090a;
        Gson gson = (Gson) map.get("delegateGson");
        if (gson != null) {
            return gson;
        }
        Gson gson2 = (Gson) map.get("defaultGson");
        if (gson2 != null) {
            return gson2;
        }
        Gson gsonM2258a = m2258a();
        map.put("defaultGson", gsonM2258a);
        return gsonM2258a;
    }

    /* renamed from: e */
    public static Gson m2262e() {
        Map map = f2090a;
        Gson gson = (Gson) map.get("logUtilsGson");
        if (gson != null) {
            return gson;
        }
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        map.put("logUtilsGson", gsonCreate);
        return gsonCreate;
    }

    /* renamed from: f */
    public static Type m2263f(Type type) {
        return TypeToken.getParameterized(List.class, type).getType();
    }

    /* renamed from: g */
    public static String m2264g(Gson gson, Object obj) {
        return gson.toJson(obj);
    }

    /* renamed from: h */
    public static String m2265h(Object obj) {
        return m2264g(m2261d(), obj);
    }
}
