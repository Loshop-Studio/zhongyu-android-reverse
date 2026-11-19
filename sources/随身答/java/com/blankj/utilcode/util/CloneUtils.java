package com.blankj.utilcode.util;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class CloneUtils {
    private CloneUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> T deepClone(T t9, Type type) {
        try {
            return (T) UtilsBridge.fromJson(UtilsBridge.toJson(t9), type);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
