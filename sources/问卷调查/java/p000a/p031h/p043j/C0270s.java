package p000a.p031h.p043j;

import android.view.View;
import p000a.p031h.p043j.C0266o;

/* renamed from: a.h.j.s */
/* loaded from: classes.dex */
public class C0270s extends C0266o.b<Boolean> {
    public C0270s(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // p000a.p031h.p043j.C0266o.b
    /* renamed from: b */
    public Boolean mo878b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    /* renamed from: d */
    public void m883d(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    /* renamed from: e */
    public boolean m884e(Object obj, Object obj2) {
        return !m877a((Boolean) obj, (Boolean) obj2);
    }
}
