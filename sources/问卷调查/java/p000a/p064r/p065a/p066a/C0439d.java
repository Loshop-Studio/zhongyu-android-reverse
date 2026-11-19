package p000a.p064r.p065a.p066a;

import android.animation.TypeEvaluator;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.r.a.a.d */
/* loaded from: classes.dex */
public class C0439d implements TypeEvaluator {

    /* renamed from: a */
    public static final C0439d f2501a = new C0439d();

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f2, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f3 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f4 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM2073a = C0561a.m2073a(f4, f3, f2, f3);
        float fM2073a2 = C0561a.m2073a(fPow4, fPow, f2, fPow);
        float fM2073a3 = C0561a.m2073a(fPow5, fPow2, f2, fPow2);
        float fM2073a4 = C0561a.m2073a(fPow6, fPow3, f2, fPow3);
        float fPow7 = ((float) Math.pow(fM2073a2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM2073a3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM2073a4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM2073a * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
