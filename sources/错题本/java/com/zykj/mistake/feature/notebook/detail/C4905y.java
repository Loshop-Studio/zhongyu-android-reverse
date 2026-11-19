package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p137p4.C6390i;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6773e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.y */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4905y implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7404a;

    /* renamed from: b */
    public final /* synthetic */ C6390i f7405b;

    /* renamed from: c */
    public final /* synthetic */ int f7406c;

    public /* synthetic */ C4905y(C6390i c6390i, int i, int i8) {
        this.f7404a = i8;
        this.f7405b = c6390i;
        this.f7406c = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7404a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4798g0.m4190d(this.f7405b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7406c | 1));
                break;
            default:
                AbstractC6773e.m6459c(this.f7405b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7406c | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
