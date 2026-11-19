package com.zykj.blackboard.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Lcom/zykj/blackboard/utils/TimeCountTestUtils;", "", "<init>", "()V", "Ld6/s;", "startTest", "", "tag", "endTest", "(Ljava/lang/String;)V", "", "startTime", "J", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TimeCountTestUtils {

    @NotNull
    public static final TimeCountTestUtils INSTANCE = new TimeCountTestUtils();
    private static long startTime = System.nanoTime();

    private TimeCountTestUtils() {
    }

    public static /* synthetic */ void endTest$default(TimeCountTestUtils timeCountTestUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "耗时";
        }
        timeCountTestUtils.endTest(str);
    }

    public final void endTest(@NotNull String tag) {
        AbstractC5830k.m5330g(tag, "tag");
        System.out.println((Object) ("TimeCountTestUtils " + tag + ' ' + (System.nanoTime() - startTime)));
    }

    public final void startTest() {
        startTime = System.nanoTime();
    }
}
