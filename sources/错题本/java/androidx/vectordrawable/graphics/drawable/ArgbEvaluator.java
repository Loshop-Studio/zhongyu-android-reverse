package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class ArgbEvaluator implements TypeEvaluator {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f7 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f8 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM77b = AbstractC0037f.m77b(f8, f7, f, f7);
        float fM77b2 = AbstractC0037f.m77b(fPow4, fPow, f, fPow);
        float fM77b3 = AbstractC0037f.m77b(fPow5, fPow2, f, fPow2);
        float fM77b4 = AbstractC0037f.m77b(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM77b2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM77b3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM77b4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM77b * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
