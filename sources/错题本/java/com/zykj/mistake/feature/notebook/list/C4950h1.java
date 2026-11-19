package com.zykj.mistake.feature.notebook.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.list.h1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4950h1 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7560a;

    /* renamed from: b */
    public final /* synthetic */ C4941e1 f7561b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f7562c;

    /* renamed from: d */
    public final /* synthetic */ int f7563d;

    public /* synthetic */ C4950h1(C4941e1 c4941e1, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f7560a = i8;
        this.f7561b = c4941e1;
        this.f7562c = interfaceC6471c;
        this.f7563d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7560a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4953i1.m4308e(this.f7561b, this.f7562c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7563d | 1));
                break;
            default:
                AbstractC4953i1.m4307d(this.f7561b, this.f7562c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7563d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
