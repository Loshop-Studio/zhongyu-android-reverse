package com.zykj.mistake.main.drawer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.main.AbstractC5057l;
import com.zykj.mistake.main.C5066p;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.main.drawer.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5033d implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7859a = 0;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6469a f7860b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6469a f7861c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f7862d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6469a f7863e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6469a f7864f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC6471c f7865g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6471c f7866h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC6471c f7867i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC6469a f7868j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC6469a f7869k;

    /* renamed from: l */
    public final /* synthetic */ int f7870l;

    /* renamed from: m */
    public final /* synthetic */ int f7871m;

    /* renamed from: n */
    public final /* synthetic */ Object f7872n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC5428d f7873o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC5428d f7874p;

    public /* synthetic */ C5033d(AbstractC5057l abstractC5057l, InterfaceC6469a interfaceC6469a, InterfaceC6473e interfaceC6473e, InterfaceC6469a interfaceC6469a2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6469a interfaceC6469a3, InterfaceC6469a interfaceC6469a4, InterfaceC6473e interfaceC6473e2, InterfaceC6471c interfaceC6471c4, InterfaceC6469a interfaceC6469a5, InterfaceC6469a interfaceC6469a6, int i, int i8) {
        this.f7872n = abstractC5057l;
        this.f7860b = interfaceC6469a;
        this.f7873o = interfaceC6473e;
        this.f7861c = interfaceC6469a2;
        this.f7862d = interfaceC6471c;
        this.f7865g = interfaceC6471c2;
        this.f7866h = interfaceC6471c3;
        this.f7863e = interfaceC6469a3;
        this.f7864f = interfaceC6469a4;
        this.f7874p = interfaceC6473e2;
        this.f7867i = interfaceC6471c4;
        this.f7868j = interfaceC6469a5;
        this.f7869k = interfaceC6469a6;
        this.f7870l = i;
        this.f7871m = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7859a) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f7870l | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f7871m);
                AbstractC5034e.m4362a((AbstractC5057l) this.f7872n, this.f7860b, (InterfaceC6473e) this.f7873o, this.f7861c, this.f7862d, this.f7865g, this.f7866h, this.f7863e, this.f7864f, (InterfaceC6473e) this.f7874p, this.f7867i, this.f7868j, this.f7869k, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f7870l | 1);
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.f7871m);
                AbstractC5036g.m4364a((C5066p) this.f7872n, this.f7860b, this.f7861c, this.f7862d, this.f7863e, this.f7864f, this.f7865g, this.f7866h, this.f7867i, (InterfaceC6471c) this.f7873o, this.f7868j, this.f7869k, (InterfaceC6471c) this.f7874p, (Composer) obj, iUpdateChangedFlags3, iUpdateChangedFlags4);
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C5033d(C5066p c5066p, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a3, InterfaceC6469a interfaceC6469a4, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6469a interfaceC6469a5, InterfaceC6469a interfaceC6469a6, InterfaceC6471c interfaceC6471c6, int i, int i8) {
        this.f7872n = c5066p;
        this.f7860b = interfaceC6469a;
        this.f7861c = interfaceC6469a2;
        this.f7862d = interfaceC6471c;
        this.f7863e = interfaceC6469a3;
        this.f7864f = interfaceC6469a4;
        this.f7865g = interfaceC6471c2;
        this.f7866h = interfaceC6471c3;
        this.f7867i = interfaceC6471c4;
        this.f7873o = interfaceC6471c5;
        this.f7868j = interfaceC6469a5;
        this.f7869k = interfaceC6469a6;
        this.f7874p = interfaceC6471c6;
        this.f7870l = i;
        this.f7871m = i8;
    }
}
