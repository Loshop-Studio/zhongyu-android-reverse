package com.zykj.blackboard.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class StringUtils {
    public static final StringUtils INSTANCE = new StringUtils();

    private StringUtils() {
    }

    public final String matchLong(String str) {
        AbstractC9133u.m16133g(str, "str");
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        matcher.find();
        return matcher.group();
    }
}
