package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.main.drawer.AbstractC5041l;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.u3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4885u3 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7339a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f7340b;

    /* renamed from: c */
    public final /* synthetic */ int f7341c;

    /* renamed from: d */
    public final /* synthetic */ int f7342d;

    /* renamed from: e */
    public final /* synthetic */ Object f7343e;

    /* renamed from: f */
    public final /* synthetic */ Object f7344f;

    /* renamed from: g */
    public final /* synthetic */ Object f7345g;

    public /* synthetic */ C4885u3(C4831l3 c4831l3, boolean z8, int i, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i8) {
        this.f7343e = c4831l3;
        this.f7340b = z8;
        this.f7341c = i;
        this.f7344f = interfaceC6469a;
        this.f7345g = interfaceC6469a2;
        this.f7342d = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7339a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC4903x3.m4281k((C4831l3) this.f7343e, this.f7340b, this.f7341c, (InterfaceC6469a) this.f7344f, (InterfaceC6469a) this.f7345g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7342d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4862q4.m4231e((String) this.f7343e, (Modifier) this.f7344f, this.f7345g, this.f7340b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7341c | 1), this.f7342d);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC5041l.m4372d((String) this.f7343e, this.f7340b, (InterfaceC6469a) this.f7344f, (InterfaceC6469a) this.f7345g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7341c | 1), this.f7342d);
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4885u3(String str, Modifier modifier, Object obj, boolean z8, int i, int i8) {
        this.f7343e = str;
        this.f7344f = modifier;
        this.f7345g = obj;
        this.f7340b = z8;
        this.f7341c = i;
        this.f7342d = i8;
    }

    public /* synthetic */ C4885u3(String str, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, int i8) {
        this.f7343e = str;
        this.f7340b = z8;
        this.f7344f = interfaceC6469a;
        this.f7345g = interfaceC6469a2;
        this.f7341c = i;
        this.f7342d = i8;
    }
}
