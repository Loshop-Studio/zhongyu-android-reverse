package com.blankj.utilcode.util;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class CloneUtils {
    private CloneUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> T deepClone(T t3, Type type) {
        try {
            return (T) UtilsBridge.fromJson(UtilsBridge.toJson(t3), type);
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
