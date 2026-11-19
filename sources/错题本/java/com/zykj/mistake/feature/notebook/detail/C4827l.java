package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4827l implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7085a;

    /* renamed from: b */
    public final /* synthetic */ C4837m3 f7086b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f7087c;

    /* renamed from: d */
    public final /* synthetic */ Modifier f7088d;

    /* renamed from: e */
    public final /* synthetic */ int f7089e;

    public /* synthetic */ C4827l(C4837m3 c4837m3, InterfaceC6471c interfaceC6471c, Modifier modifier, int i, int i8) {
        this.f7085a = i8;
        this.f7086b = c4837m3;
        this.f7087c = interfaceC6471c;
        this.f7088d = modifier;
        this.f7089e = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7085a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4875t.m4251g(this.f7086b, this.f7087c, this.f7088d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7089e | 1));
                break;
            default:
                AbstractC4875t.m4252h(this.f7086b, this.f7087c, this.f7088d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7089e | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
