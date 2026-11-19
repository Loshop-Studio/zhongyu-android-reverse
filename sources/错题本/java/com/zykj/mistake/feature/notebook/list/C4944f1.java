package com.zykj.mistake.feature.notebook.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6774f;

/* renamed from: com.zykj.mistake.feature.notebook.list.f1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4944f1 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7536a;

    /* renamed from: b */
    public final /* synthetic */ int f7537b;

    /* renamed from: c */
    public final /* synthetic */ String f7538c;

    /* renamed from: d */
    public final /* synthetic */ float f7539d;

    /* renamed from: e */
    public final /* synthetic */ boolean f7540e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6469a f7541f;

    /* renamed from: g */
    public final /* synthetic */ int f7542g;

    /* renamed from: h */
    public final /* synthetic */ int f7543h;

    public /* synthetic */ C4944f1(int i, String str, float f, boolean z8, InterfaceC6469a interfaceC6469a, int i8, int i9, int i10) {
        this.f7536a = i10;
        this.f7537b = i;
        this.f7538c = str;
        this.f7539d = f;
        this.f7540e = z8;
        this.f7541f = interfaceC6469a;
        this.f7542g = i8;
        this.f7543h = i9;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7536a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4953i1.m4305b(this.f7537b, this.f7538c, this.f7539d, this.f7540e, this.f7541f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7542g | 1), this.f7543h);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC6774f.m6460a(this.f7537b, this.f7538c, this.f7539d, this.f7540e, this.f7541f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7542g | 1), this.f7543h);
                break;
        }
        return C5443s.f8405a;
    }
}
