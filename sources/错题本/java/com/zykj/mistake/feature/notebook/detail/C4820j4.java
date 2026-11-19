package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.j4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4820j4 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7044a;

    /* renamed from: b */
    public final /* synthetic */ List f7045b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7046c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6469a f7047d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6471c f7048e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6471c f7049f;

    /* renamed from: g */
    public final /* synthetic */ int f7050g;

    public /* synthetic */ C4820j4(List list, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, int i8) {
        this.f7044a = i8;
        this.f7045b = list;
        this.f7046c = z8;
        this.f7047d = interfaceC6469a;
        this.f7048e = interfaceC6471c;
        this.f7049f = interfaceC6471c2;
        this.f7050g = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7044a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC4862q4.m4228b(this.f7045b, this.f7046c, this.f7047d, this.f7048e, this.f7049f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7050g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC4862q4.m4233g(this.f7045b, this.f7046c, this.f7047d, this.f7048e, this.f7049f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7050g | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
