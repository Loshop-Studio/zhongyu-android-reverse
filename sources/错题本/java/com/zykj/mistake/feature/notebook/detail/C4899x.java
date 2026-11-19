package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.list.AbstractC4953i1;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6773e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.x */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4899x implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7398a;

    /* renamed from: b */
    public final /* synthetic */ int f7399b;

    public /* synthetic */ C4899x(int i, int i8) {
        this.f7398a = i8;
        this.f7399b = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7398a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4798g0.m4187a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f7399b | 1));
                break;
            case 1:
                AbstractC4903x3.m4273c(composer, RecomposeScopeImplKt.updateChangedFlags(this.f7399b | 1));
                break;
            case 2:
                AbstractC4953i1.m4311h(composer, RecomposeScopeImplKt.updateChangedFlags(this.f7399b | 1));
                break;
            default:
                AbstractC6773e.m6457a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f7399b | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
