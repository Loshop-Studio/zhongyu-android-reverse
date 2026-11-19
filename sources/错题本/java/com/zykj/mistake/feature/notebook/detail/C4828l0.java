package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.l0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4828l0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7090a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f7091b;

    /* renamed from: c */
    public final /* synthetic */ long f7092c;

    /* renamed from: d */
    public final /* synthetic */ long f7093d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6469a f7094e;

    /* renamed from: f */
    public final /* synthetic */ int f7095f;

    /* renamed from: g */
    public final /* synthetic */ Object f7096g;

    public /* synthetic */ C4828l0(String str, long j7, long j8, RoundedCornerShape roundedCornerShape, InterfaceC6469a interfaceC6469a, int i) {
        this.f7091b = str;
        this.f7092c = j7;
        this.f7093d = j8;
        this.f7096g = roundedCornerShape;
        this.f7094e = interfaceC6469a;
        this.f7095f = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7090a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC4840n0.m4219c(this.f7091b, this.f7092c, this.f7093d, (RoundedCornerShape) this.f7096g, this.f7094e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7095f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4903x3.m4272b(this.f7091b, this.f7092c, this.f7093d, this.f7094e, (Modifier) this.f7096g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7095f | 1));
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4828l0(String str, long j7, long j8, InterfaceC6469a interfaceC6469a, Modifier modifier, int i) {
        this.f7091b = str;
        this.f7092c = j7;
        this.f7093d = j8;
        this.f7094e = interfaceC6469a;
        this.f7096g = modifier;
        this.f7095f = i;
    }
}
