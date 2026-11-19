package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.view.LayoutInflater;
import p000a.p005b.p012g.p013i.InterfaceC0060m;

/* renamed from: a.b.g.i.b */
/* loaded from: classes.dex */
public abstract class AbstractC0049b implements InterfaceC0060m {

    /* renamed from: b */
    public Context f371b;

    /* renamed from: c */
    public Context f372c;

    /* renamed from: d */
    public C0054g f373d;

    /* renamed from: e */
    public LayoutInflater f374e;

    /* renamed from: f */
    public InterfaceC0060m.a f375f;

    /* renamed from: g */
    public int f376g;

    /* renamed from: h */
    public int f377h;

    /* renamed from: i */
    public InterfaceC0061n f378i;

    public AbstractC0049b(Context context, int i, int i2) {
        this.f371b = context;
        this.f374e = LayoutInflater.from(context);
        this.f376g = i;
        this.f377h = i2;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: d */
    public boolean mo166d(C0054g c0054g, C0056i c0056i) {
        return false;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: e */
    public void mo167e(InterfaceC0060m.a aVar) {
        this.f375f = aVar;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: k */
    public boolean mo168k(C0054g c0054g, C0056i c0056i) {
        return false;
    }
}
