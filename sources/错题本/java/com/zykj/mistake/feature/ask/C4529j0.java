package com.zykj.mistake.feature.ask;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.detail.AbstractC4875t;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.ask.j0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4529j0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6255a;

    /* renamed from: b */
    public final /* synthetic */ String f6256b;

    /* renamed from: c */
    public final /* synthetic */ Modifier f6257c;

    /* renamed from: d */
    public final /* synthetic */ int f6258d;

    public /* synthetic */ C4529j0(String str, Modifier modifier, int i, int i8) {
        this.f6255a = i8;
        this.f6256b = str;
        this.f6257c = modifier;
        this.f6258d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6255a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4539o0.m4015m(this.f6256b, this.f6257c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6258d | 1));
                break;
            case 1:
                AbstractC4539o0.m4010h(this.f6256b, this.f6257c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6258d | 1));
                break;
            default:
                AbstractC4875t.m4257m(this.f6256b, this.f6257c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6258d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
