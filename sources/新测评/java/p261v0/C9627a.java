package p261v0;

import android.content.res.Resources;
import p117i1.AbstractC7651j;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;

/* renamed from: v0.a */
/* loaded from: classes3.dex */
public class C9627a implements InterfaceC8540e {

    /* renamed from: a */
    public final InterfaceC8540e f16812a;

    /* renamed from: b */
    public final Resources f16813b;

    public C9627a(Resources resources, InterfaceC8540e interfaceC8540e) {
        this.f16813b = (Resources) AbstractC7651j.m12683d(resources);
        this.f16812a = (InterfaceC8540e) AbstractC7651j.m12683d(interfaceC8540e);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: a */
    public boolean mo3616a(Object obj, C8539d c8539d) {
        return this.f16812a.mo3616a(obj, c8539d);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: b */
    public InterfaceC8690j mo3617b(Object obj, int i10, int i11, C8539d c8539d) {
        return C9649v.m16026c(this.f16813b, this.f16812a.mo3617b(obj, i10, i11, c8539d));
    }
}
