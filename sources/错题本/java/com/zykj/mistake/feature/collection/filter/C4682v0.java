package com.zykj.mistake.feature.collection.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.filter.v0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4682v0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6720a;

    /* renamed from: b */
    public final /* synthetic */ C4676s0 f6721b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f6722c;

    /* renamed from: d */
    public final /* synthetic */ int f6723d;

    public /* synthetic */ C4682v0(C4676s0 c4676s0, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f6720a = i8;
        this.f6721b = c4676s0;
        this.f6722c = interfaceC6471c;
        this.f6723d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6720a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4688y0.m4087e(this.f6721b, this.f6722c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6723d | 1));
                break;
            case 1:
                AbstractC4688y0.m4088f(this.f6721b, this.f6722c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6723d | 1));
                break;
            default:
                AbstractC4688y0.m4083a(this.f6721b, this.f6722c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6723d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
