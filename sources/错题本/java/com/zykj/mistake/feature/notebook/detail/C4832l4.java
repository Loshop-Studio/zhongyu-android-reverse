package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.list.AbstractC4954j;
import com.zykj.mistake.main.drawer.AbstractC5041l;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.l4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4832l4 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7105a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6469a f7106b;

    /* renamed from: c */
    public final /* synthetic */ int f7107c;

    public /* synthetic */ C4832l4(int i, int i8, InterfaceC6469a interfaceC6469a) {
        this.f7105a = i8;
        this.f7106b = interfaceC6469a;
        this.f7107c = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7105a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4862q4.m4227a(this.f7106b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7107c | 1));
                break;
            case 1:
                AbstractC4954j.m4317e(this.f7106b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7107c | 1));
                break;
            default:
                AbstractC5041l.m4371c(this.f7106b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7107c | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
