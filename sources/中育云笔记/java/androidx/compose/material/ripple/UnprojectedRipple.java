package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9972n;
import p265nd.AbstractC10410o;

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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
        super(ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK), null, z10 ? new ColorDrawable(-1) : null);
        this.bounded = z10;
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m28332calculateRippleColor5vOe2sY(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return Color.m30877copywmQWz5c$default(j10, AbstractC10410o.m21755h(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
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
    public final void m28333setColorDxMtmZc(long j10, float f10) {
        long jM28332calculateRippleColor5vOe2sY = m28332calculateRippleColor5vOe2sY(j10, f10);
        Color color = this.rippleColor;
        if (color == null ? false : Color.m30879equalsimpl0(color.m30888unboximpl(), jM28332calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m30868boximpl(jM28332calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m30932toArgb8_81llA(jM28332calculateRippleColor5vOe2sY)));
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
