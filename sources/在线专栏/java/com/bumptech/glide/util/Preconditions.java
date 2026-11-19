package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T> T checkNotNull(T t3) {
        return (T) checkNotNull(t3, "Argument must not be null");
    }

    public static <T> T checkNotNull(T t3, String str) {
        Objects.requireNonNull(t3, str);
        return t3;
    }

    public static <T extends Collection<Y>, Y> T checkNotEmpty(T t3) {
        if (t3.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t3;
    }
}
