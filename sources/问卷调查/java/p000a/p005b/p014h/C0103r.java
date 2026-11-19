package p000a.p005b.p014h;

import android.annotation.SuppressLint;
import android.view.View;
import p000a.p005b.p012g.p013i.InterfaceC0063p;
import p000a.p005b.p014h.C0105s;

/* renamed from: a.b.h.r */
/* loaded from: classes.dex */
public class C0103r extends AbstractViewOnTouchListenerC0078e0 {

    /* renamed from: k */
    public final /* synthetic */ C0105s.d f757k;

    /* renamed from: l */
    public final /* synthetic */ C0105s f758l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103r(C0105s c0105s, View view, C0105s.d dVar) {
        super(view);
        this.f758l = c0105s;
        this.f757k = dVar;
    }

    @Override // p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0
    /* renamed from: b */
    public InterfaceC0063p mo293b() {
        return this.f757k;
    }

    @Override // p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public boolean mo294c() {
        if (this.f758l.getInternalPopup().mo385a()) {
            return true;
        }
        this.f758l.m384b();
        return true;
    }
}
