package com.zykj.blackboard.utils;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class TimeCountTestUtils {
    public static final TimeCountTestUtils INSTANCE = new TimeCountTestUtils();
    private static long startTime = System.nanoTime();

    private TimeCountTestUtils() {
    }

    public static /* synthetic */ void endTest$default(TimeCountTestUtils timeCountTestUtils, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "耗时";
        }
        timeCountTestUtils.endTest(str);
    }

    public final void endTest(String tag) {
        AbstractC9133u.m16133g(tag, "tag");
        System.out.println((Object) ("TimeCountTestUtils " + tag + ' ' + (System.nanoTime() - startTime)));
    }

    public final void startTest() {
        startTime = System.nanoTime();
    }
}
