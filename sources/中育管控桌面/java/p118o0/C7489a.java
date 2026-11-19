package p118o0;

import android.content.res.Resources;
import p016b1.AbstractC4408j;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;

/* renamed from: o0.a */
/* loaded from: classes3.dex */
public class C7489a implements InterfaceC6286e {

    /* renamed from: a */
    public final InterfaceC6286e f9669a;

    /* renamed from: b */
    public final Resources f9670b;

    public C7489a(Resources resources, InterfaceC6286e interfaceC6286e) {
        this.f9670b = (Resources) AbstractC4408j.m1438d(resources);
        this.f9669a = (InterfaceC6286e) AbstractC4408j.m1438d(interfaceC6286e);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: a */
    public InterfaceC6440j mo2796a(Object obj, int i6, int i7, C6285d c6285d) {
        return C7511v.m8643c(this.f9670b, this.f9669a.mo2796a(obj, i6, i7, c6285d));
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: b */
    public boolean mo2797b(Object obj, C6285d c6285d) {
        return this.f9669a.mo2797b(obj, c6285d);
    }
}
