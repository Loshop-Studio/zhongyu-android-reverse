package com.zykj.mistake.feature.collection.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.detail.d1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4586d1 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6468a;

    /* renamed from: b */
    public final /* synthetic */ C4632z0 f6469b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f6470c;

    /* renamed from: d */
    public final /* synthetic */ int f6471d;

    public /* synthetic */ C4586d1(C4632z0 c4632z0, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f6468a = i8;
        this.f6469b = c4632z0;
        this.f6470c = interfaceC6471c;
        this.f6471d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6468a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4592f1.m4041d(this.f6469b, this.f6470c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6471d | 1));
                break;
            default:
                AbstractC4592f1.m4040c(this.f6469b, this.f6470c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6471d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
