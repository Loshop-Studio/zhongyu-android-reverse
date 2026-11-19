package com.zykj.mistake.feature.collection.filter;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.detail.AbstractC4798g0;
import com.zykj.mistake.feature.notebook.detail.AbstractC4875t;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6775g;

/* renamed from: com.zykj.mistake.feature.collection.filter.w0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4684w0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6726a;

    /* renamed from: b */
    public final /* synthetic */ Modifier f6727b;

    /* renamed from: c */
    public final /* synthetic */ int f6728c;

    public /* synthetic */ C4684w0(Modifier modifier, int i, int i8) {
        this.f6726a = i8;
        this.f6727b = modifier;
        this.f6728c = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6726a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4688y0.m4084b(this.f6727b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6728c | 1));
                break;
            case 1:
                AbstractC4875t.m4259o(this.f6727b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6728c | 1));
                break;
            case 2:
                AbstractC4798g0.m4196j(this.f6727b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6728c | 1));
                break;
            default:
                AbstractC6775g.m6461a(this.f6727b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6728c | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
