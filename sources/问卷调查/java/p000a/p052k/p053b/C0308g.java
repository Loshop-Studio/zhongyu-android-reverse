package p000a.p052k.p053b;

import android.view.View;
import android.view.ViewGroup;
import p000a.p031h.p039f.C0217a;
import p000a.p052k.p053b.C0300c;

/* renamed from: a.k.b.g */
/* loaded from: classes.dex */
public class C0308g implements C0217a.a {

    /* renamed from: a */
    public final /* synthetic */ View f1873a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f1874b;

    /* renamed from: c */
    public final /* synthetic */ C0300c.b f1875c;

    public C0308g(C0300c c0300c, View view, ViewGroup viewGroup, C0300c.b bVar) {
        this.f1873a = view;
        this.f1874b = viewGroup;
        this.f1875c = bVar;
    }

    @Override // p000a.p031h.p039f.C0217a.a
    /* renamed from: a */
    public void mo790a() {
        this.f1873a.clearAnimation();
        this.f1874b.endViewTransition(this.f1873a);
        this.f1875c.m1002a();
    }
}
