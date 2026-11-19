package com.zykj.blackboard.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0004¨\u0006\b"}, m5110d2 = {"Lcom/zykj/blackboard/utils/ColorUtils;", "", "()V", "toAlphaColor", "", "alpha", "", "toNoAlphaColor", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ColorUtils {

    @NotNull
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    public final int toAlphaColor(int i, float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f * 255)) << 24);
    }

    public final int toNoAlphaColor(int i) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ViewCompat.MEASURED_STATE_MASK;
    }
}
