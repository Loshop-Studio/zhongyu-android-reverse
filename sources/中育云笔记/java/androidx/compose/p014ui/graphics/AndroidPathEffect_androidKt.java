package androidx.compose.p014ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import androidx.compose.p014ui.graphics.StampedPathEffectStyle;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class AndroidPathEffect_androidKt {
    public static final PathEffect actualChainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
        AbstractC9979u.m20292e(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        PathEffect nativePathEffect = ((AndroidPathEffect) pathEffect).getNativePathEffect();
        AbstractC9979u.m20292e(pathEffect2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new AndroidPathEffect(new ComposePathEffect(nativePathEffect, ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    public static final PathEffect actualCornerPathEffect(float f10) {
        return new AndroidPathEffect(new CornerPathEffect(f10));
    }

    public static final PathEffect actualDashPathEffect(float[] fArr, float f10) {
        return new AndroidPathEffect(new DashPathEffect(fArr, f10));
    }

    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final PathEffect m30774actualStampedPathEffect7aD1DOk(Path path, float f10, float f11, int i10) {
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f10, f11, m30775toAndroidPathDashPathEffectStyleoQv6xUo(i10)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final PathEffect asAndroidPathEffect(PathEffect pathEffect) {
        AbstractC9979u.m20292e(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final PathDashPathEffect.Style m30775toAndroidPathDashPathEffectStyleoQv6xUo(int i10) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        return StampedPathEffectStyle.m31217equalsimpl0(i10, companion.m31221getMorphYpspkwk()) ? PathDashPathEffect.Style.MORPH : StampedPathEffectStyle.m31217equalsimpl0(i10, companion.m31222getRotateYpspkwk()) ? PathDashPathEffect.Style.ROTATE : StampedPathEffectStyle.m31217equalsimpl0(i10, companion.m31223getTranslateYpspkwk()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    public static final PathEffect toComposePathEffect(PathEffect pathEffect) {
        return new AndroidPathEffect(pathEffect);
    }
}
