package com.zykj.mistake.feature.collection.list;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.detail.AbstractC4875t;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.list.z */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4727z implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6802a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6469a f6803b;

    /* renamed from: c */
    public final /* synthetic */ Modifier f6804c;

    /* renamed from: d */
    public final /* synthetic */ int f6805d;

    public /* synthetic */ C4727z(InterfaceC6469a interfaceC6469a, Modifier modifier, int i, int i8) {
        this.f6802a = i8;
        this.f6803b = interfaceC6469a;
        this.f6804c = modifier;
        this.f6805d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6802a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4704c0.m4095c(this.f6803b, this.f6804c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6805d | 1));
                break;
            default:
                AbstractC4875t.m4245a(this.f6803b, this.f6804c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6805d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
