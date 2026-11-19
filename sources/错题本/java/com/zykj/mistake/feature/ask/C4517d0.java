package com.zykj.mistake.feature.ask;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.ask.d0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4517d0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6223a;

    /* renamed from: b */
    public final /* synthetic */ C4550z f6224b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f6225c;

    /* renamed from: d */
    public final /* synthetic */ int f6226d;

    public /* synthetic */ C4517d0(C4550z c4550z, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f6223a = i8;
        this.f6224b = c4550z;
        this.f6225c = interfaceC6471c;
        this.f6226d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6223a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4539o0.m4012j(this.f6224b, this.f6225c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6226d | 1));
                break;
            case 1:
                AbstractC4539o0.m4005c(this.f6224b, this.f6225c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6226d | 1));
                break;
            case 2:
                AbstractC4539o0.m4006d(this.f6224b, this.f6225c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6226d | 1));
                break;
            case 3:
                AbstractC4539o0.m4008f(this.f6224b, this.f6225c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6226d | 1));
                break;
            default:
                AbstractC4539o0.m4003a(this.f6224b, this.f6225c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6226d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
