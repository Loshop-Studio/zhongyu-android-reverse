package com.zykj.mistake.feature.collection.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.list.x */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4725x implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6793a;

    /* renamed from: b */
    public final /* synthetic */ C4723v f6794b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f6795c;

    /* renamed from: d */
    public final /* synthetic */ int f6796d;

    public /* synthetic */ C4725x(C4723v c4723v, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f6793a = i8;
        this.f6794b = c4723v;
        this.f6795c = interfaceC6471c;
        this.f6796d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6793a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4704c0.m4097e(this.f6794b, this.f6795c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6796d | 1));
                break;
            default:
                AbstractC4704c0.m4098f(this.f6794b, this.f6795c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6796d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
