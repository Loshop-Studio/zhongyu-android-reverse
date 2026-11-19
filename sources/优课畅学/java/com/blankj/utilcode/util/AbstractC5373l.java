package com.blankj.utilcode.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5373l {

    /* renamed from: a */
    public static final Map f2730a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Gson m2574a() {
        Map map = f2730a;
        Gson gson = (Gson) map.get("logUtilsGson");
        if (gson != null) {
            return gson;
        }
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        map.put("logUtilsGson", gsonCreate);
        return gsonCreate;
    }
}
