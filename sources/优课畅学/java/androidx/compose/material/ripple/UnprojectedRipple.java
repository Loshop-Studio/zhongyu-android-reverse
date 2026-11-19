package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;

/* loaded from: classes2.dex */
final class UnprojectedRipple extends RippleDrawable {
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched;
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;
    private Integer rippleRadius;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    @RequiresApi(23)
    public static final class MRadiusHelper {
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        public final void setRadius(RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    public UnprojectedRipple(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.bounded = z10;
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m21730calculateRippleColor5vOe2sY(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return Color.m24275copywmQWz5c$default(j10, AbstractC8323h.m13512g(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m21731setColorDxMtmZc(long j10, float f10) {
        long jM21730calculateRippleColor5vOe2sY = m21730calculateRippleColor5vOe2sY(j10, f10);
        Color color = this.rippleColor;
        if (color == null ? false : Color.m24277equalsimpl0(color.m24286unboximpl(), jM21730calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m24266boximpl(jM21730calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m24330toArgb8_81llA(jM21730calculateRippleColor5vOe2sY)));
    }

    public final void trySetRadius(int i10) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.rippleRadius = Integer.valueOf(i10);
        MRadiusHelper.INSTANCE.setRadius(this, i10);
    }
}
