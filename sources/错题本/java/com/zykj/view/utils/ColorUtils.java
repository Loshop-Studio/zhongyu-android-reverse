package com.zykj.view.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/view/utils/ColorUtils;", "", "<init>", "()V", "isLight", "", "", "(I)Z", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ColorUtils {

    @NotNull
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    public final boolean isLight(int i) {
        return (((double) (i & 255)) * 0.114d) + ((((double) ((i >> 8) & 255)) * 0.578d) + (((double) ((i >> 16) & 255)) * 0.299d)) >= 192.0d;
    }
}
