package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC0739m0 extends AbstractC0750v {

    /* renamed from: a */
    private static final String[] f4444a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    private static int m3904d(C0752x c0752x, int i4) {
        int[] iArr;
        if (c0752x == null || (iArr = (int[]) c0752x.f4482a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i4];
    }

    @Override // androidx.transition.AbstractC0750v
    /* renamed from: a */
    public void mo3905a(C0752x c0752x) {
        View view = c0752x.f4483b;
        Integer numValueOf = (Integer) c0752x.f4482a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        c0752x.f4482a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        c0752x.f4482a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.AbstractC0750v
    /* renamed from: b */
    public String[] mo3906b() {
        return f4444a;
    }

    /* renamed from: e */
    public int m3907e(C0752x c0752x) {
        Integer num;
        if (c0752x == null || (num = (Integer) c0752x.f4482a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int m3908f(C0752x c0752x) {
        return m3904d(c0752x, 0);
    }

    /* renamed from: g */
    public int m3909g(C0752x c0752x) {
        return m3904d(c0752x, 1);
    }
}
