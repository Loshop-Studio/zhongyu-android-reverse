package androidx.compose.p013ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import androidx.compose.p013ui.graphics.StampedPathEffectStyle;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class AndroidPathEffect_androidKt {
    public static final PathEffect actualChainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
        AbstractC9133u.m16131e(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        PathEffect nativePathEffect = ((AndroidPathEffect) pathEffect).getNativePathEffect();
        AbstractC9133u.m16131e(pathEffect2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new AndroidPathEffect(new ComposePathEffect(nativePathEffect, ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    public static final PathEffect actualCornerPathEffect(float f10) {
        return new AndroidPathEffect(new CornerPathEffect(f10));
    }

    public static final PathEffect actualDashPathEffect(float[] fArr, float f10) {
        return new AndroidPathEffect(new DashPathEffect(fArr, f10));
    }

    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final PathEffect m24172actualStampedPathEffect7aD1DOk(Path path, float f10, float f11, int i10) {
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f10, f11, m24173toAndroidPathDashPathEffectStyleoQv6xUo(i10)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final PathEffect asAndroidPathEffect(PathEffect pathEffect) {
        AbstractC9133u.m16131e(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final PathDashPathEffect.Style m24173toAndroidPathDashPathEffectStyleoQv6xUo(int i10) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        return StampedPathEffectStyle.m24615equalsimpl0(i10, companion.m24619getMorphYpspkwk()) ? PathDashPathEffect.Style.MORPH : StampedPathEffectStyle.m24615equalsimpl0(i10, companion.m24620getRotateYpspkwk()) ? PathDashPathEffect.Style.ROTATE : StampedPathEffectStyle.m24615equalsimpl0(i10, companion.m24621getTranslateYpspkwk()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    public static final PathEffect toComposePathEffect(PathEffect pathEffect) {
        return new AndroidPathEffect(pathEffect);
    }
}
