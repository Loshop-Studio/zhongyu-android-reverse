package com.zykj.blackboard.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/blackboard/utils/StringUtils;", "", "()V", "matchLong", "", "str", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class StringUtils {

    @NotNull
    public static final StringUtils INSTANCE = new StringUtils();

    private StringUtils() {
    }

    @Nullable
    public final String matchLong(@NotNull String str) {
        AbstractC5830k.m5330g(str, "str");
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        matcher.find();
        return matcher.group();
    }
}
