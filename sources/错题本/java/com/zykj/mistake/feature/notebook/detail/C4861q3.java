package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.q3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4861q3 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7268a;

    /* renamed from: b */
    public final /* synthetic */ C4831l3 f7269b;

    /* renamed from: c */
    public final /* synthetic */ Modifier f7270c;

    /* renamed from: d */
    public final /* synthetic */ int f7271d;

    public /* synthetic */ C4861q3(C4831l3 c4831l3, Modifier modifier, int i, int i8) {
        this.f7268a = i8;
        this.f7269b = c4831l3;
        this.f7270c = modifier;
        this.f7271d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7268a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4903x3.m4277g(this.f7269b, this.f7270c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7271d | 1));
                break;
            case 1:
                AbstractC4903x3.m4274d(this.f7269b, this.f7270c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7271d | 1));
                break;
            case 2:
                AbstractC4903x3.m4274d(this.f7269b, this.f7270c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7271d | 1));
                break;
            default:
                AbstractC4903x3.m4280j(this.f7269b, this.f7270c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7271d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
