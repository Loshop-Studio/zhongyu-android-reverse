package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import com.zykj.mistake.main.AbstractC5055k;
import com.zykj.mistake.main.MainShellViewModel;
import java.util.List;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p129o2.C6268a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4821k implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7051a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f7052b;

    /* renamed from: c */
    public final /* synthetic */ int f7053c;

    /* renamed from: d */
    public final /* synthetic */ Object f7054d;

    /* renamed from: e */
    public final /* synthetic */ Object f7055e;

    /* renamed from: f */
    public final /* synthetic */ Object f7056f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC5428d f7057g;

    /* renamed from: h */
    public final /* synthetic */ Object f7058h;

    public /* synthetic */ C4821k(NavHostController navHostController, MainShellViewModel mainShellViewModel, C6268a c6268a, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i) {
        this.f7054d = navHostController;
        this.f7055e = mainShellViewModel;
        this.f7056f = c6268a;
        this.f7052b = z8;
        this.f7057g = interfaceC6469a;
        this.f7058h = interfaceC6469a2;
        this.f7053c = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7051a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4875t.m4248d((String) this.f7054d, (List) this.f7055e, (InterfaceC6471c) this.f7056f, (C4852p0) this.f7058h, (InterfaceC6471c) this.f7057g, this.f7052b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7053c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC5055k.m4376a((NavHostController) this.f7054d, (MainShellViewModel) this.f7055e, (C6268a) this.f7056f, this.f7052b, (InterfaceC6469a) this.f7057g, (InterfaceC6469a) this.f7058h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f7053c | 1));
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4821k(String str, List list, InterfaceC6471c interfaceC6471c, C4852p0 c4852p0, InterfaceC6471c interfaceC6471c2, boolean z8, int i) {
        this.f7054d = str;
        this.f7055e = list;
        this.f7056f = interfaceC6471c;
        this.f7058h = c4852p0;
        this.f7057g = interfaceC6471c2;
        this.f7052b = z8;
        this.f7053c = i;
    }
}
