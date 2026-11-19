package androidx.compose.p014ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final RenderEffect m31188createBlurEffect8A3gB4(RenderEffect renderEffect, float f10, float f11, int i10) {
        return (f10 == 0.0f && f11 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : renderEffect == null ? RenderEffect.createBlurEffect(f10, f11, AndroidTileMode_androidKt.m30783toAndroidTileMode0vamqd0(i10)) : RenderEffect.createBlurEffect(f10, f11, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m30783toAndroidTileMode0vamqd0(i10));
    }

    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final RenderEffect m31189createOffsetEffectUv8p0NA(RenderEffect renderEffect, long j10) {
        return renderEffect == null ? RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L))) : RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), renderEffect.asAndroidRenderEffect());
    }
}
