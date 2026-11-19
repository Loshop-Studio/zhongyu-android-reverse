package p000a.p005b.p006c;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0277z;
import p000a.p031h.p043j.InterfaceC0262k;

/* renamed from: a.b.c.k */
/* loaded from: classes.dex */
public class C0025k implements InterfaceC0262k {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0024j f149a;

    public C0025k(LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j) {
        this.f149a = layoutInflaterFactory2C0024j;
    }

    @Override // p000a.p031h.p043j.InterfaceC0262k
    /* renamed from: a */
    public C0277z mo96a(View view, C0277z c0277z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iM899d = c0277z.m899d();
        int iM78X = this.f149a.m78X(c0277z, null);
        if (iM899d != iM78X) {
            c0277z = c0277z.m901g(c0277z.m897b(), iM78X, c0277z.m898c(), c0277z.m896a());
        }
        return C0266o.m870i(view, c0277z);
    }
}
