package com.zykj.mistake.feature.ask;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.collection.list.AbstractC4704c0;
import com.zykj.mistake.feature.notebook.list.AbstractC4953i1;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.ask.i0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4527i0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6251a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6252b;

    /* renamed from: c */
    public final /* synthetic */ Modifier f6253c;

    /* renamed from: d */
    public final /* synthetic */ int f6254d;

    public /* synthetic */ C4527i0(boolean z8, Modifier modifier, int i, int i8) {
        this.f6251a = i8;
        this.f6252b = z8;
        this.f6253c = modifier;
        this.f6254d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6251a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4539o0.m4013k(this.f6252b, this.f6253c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6254d | 1));
                break;
            case 1:
                AbstractC4704c0.m4093a(this.f6252b, this.f6253c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6254d | 1));
                break;
            default:
                AbstractC4953i1.m4312i(this.f6252b, this.f6253c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6254d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
