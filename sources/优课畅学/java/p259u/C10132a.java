package p259u;

import android.content.res.Resources;
import p116h0.AbstractC8706j;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;

/* renamed from: u.a */
/* loaded from: classes3.dex */
public class C10132a implements InterfaceC9231e {

    /* renamed from: a */
    public final InterfaceC9231e f20246a;

    /* renamed from: b */
    public final Resources f20247b;

    public C10132a(Resources resources, InterfaceC9231e interfaceC9231e) {
        this.f20247b = (Resources) AbstractC8706j.m14181d(resources);
        this.f20246a = (InterfaceC9231e) AbstractC8706j.m14181d(interfaceC9231e);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: a */
    public InterfaceC9357j mo3061a(Object obj, int i10, int i11, C9230d c9230d) {
        return C10161y.m19023c(this.f20247b, this.f20246a.mo3061a(obj, i10, i11, c9230d));
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: b */
    public boolean mo3062b(Object obj, C9230d c9230d) {
        return this.f20246a.mo3062b(obj, c9230d);
    }
}
