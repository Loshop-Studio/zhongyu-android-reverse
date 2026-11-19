package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4809i implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7016a;

    /* renamed from: b */
    public final /* synthetic */ String f7017b;

    /* renamed from: c */
    public final /* synthetic */ List f7018c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f7019d;

    /* renamed from: e */
    public final /* synthetic */ int f7020e;

    public /* synthetic */ C4809i(String str, List list, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f7016a = i8;
        this.f7017b = str;
        this.f7018c = list;
        this.f7019d = interfaceC6471c;
        this.f7020e = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7016a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4875t.m4261q(this.f7017b, this.f7018c, this.f7019d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7020e | 1));
                break;
            case 1:
                AbstractC4875t.m4261q(this.f7017b, this.f7018c, this.f7019d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7020e | 1));
                break;
            case 2:
                AbstractC4875t.m4264t(this.f7017b, this.f7018c, this.f7019d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7020e | 1));
                break;
            default:
                AbstractC4875t.m4264t(this.f7017b, this.f7018c, this.f7019d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7020e | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
