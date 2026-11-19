package p122t;

import android.content.res.Resources;
import p062g0.AbstractC3749i;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;

/* renamed from: t.a */
/* loaded from: classes2.dex */
public class C4551a implements InterfaceC3795e {

    /* renamed from: a */
    public final InterfaceC3795e f5713a;

    /* renamed from: b */
    public final Resources f5714b;

    public C4551a(Resources resources, InterfaceC3795e interfaceC3795e) {
        this.f5714b = (Resources) AbstractC3749i.m4768d(resources);
        this.f5713a = (InterfaceC3795e) AbstractC3749i.m4768d(interfaceC3795e);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: a */
    public boolean mo1965a(Object obj, C3794d c3794d) {
        return this.f5713a.mo1965a(obj, c3794d);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: b */
    public InterfaceC4361j mo1966b(Object obj, int i4, int i5, C3794d c3794d) {
        return C4578x.m6304d(this.f5714b, this.f5713a.mo1966b(obj, i4, i5, c3794d));
    }
}
