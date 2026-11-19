package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.list.AbstractC4953i1;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.z */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4911z implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7420a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7421b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6469a f7422c;

    /* renamed from: d */
    public final /* synthetic */ int f7423d;

    public /* synthetic */ C4911z(boolean z8, InterfaceC6469a interfaceC6469a, int i, int i8) {
        this.f7420a = i8;
        this.f7421b = z8;
        this.f7422c = interfaceC6469a;
        this.f7423d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7420a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4798g0.m4191e(this.f7421b, this.f7422c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7423d | 1));
                break;
            default:
                AbstractC4953i1.m4306c(this.f7421b, this.f7422c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7423d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
