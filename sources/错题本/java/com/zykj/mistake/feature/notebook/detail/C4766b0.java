package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.b0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4766b0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6913a;

    /* renamed from: b */
    public final /* synthetic */ int f6914b;

    /* renamed from: c */
    public final /* synthetic */ String f6915c;

    /* renamed from: d */
    public final /* synthetic */ Modifier f6916d;

    /* renamed from: e */
    public final /* synthetic */ boolean f6917e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6469a f6918f;

    /* renamed from: g */
    public final /* synthetic */ int f6919g;

    /* renamed from: h */
    public final /* synthetic */ int f6920h;

    public /* synthetic */ C4766b0(int i, String str, Modifier modifier, boolean z8, InterfaceC6469a interfaceC6469a, int i8, int i9, int i10) {
        this.f6913a = i10;
        this.f6914b = i;
        this.f6915c = str;
        this.f6916d = modifier;
        this.f6917e = z8;
        this.f6918f = interfaceC6469a;
        this.f6919g = i8;
        this.f6920h = i9;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6913a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4798g0.m4194h(this.f6914b, this.f6915c, this.f6916d, this.f6917e, this.f6918f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6919g | 1), this.f6920h);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4874s4.m4241a(this.f6914b, this.f6915c, this.f6916d, this.f6917e, this.f6918f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6919g | 1), this.f6920h);
                break;
        }
        return C5443s.f8405a;
    }
}
