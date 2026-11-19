package com.zykj.mistake.feature.collection.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavBackStackEntry;
import com.zykj.mistake.feature.collection.filter.AbstractC4641b;
import com.zykj.mistake.feature.notebook.detail.AbstractC4868r4;
import com.zykj.mistake.main.MainShellViewModel;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.detail.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4578b implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6444a;

    /* renamed from: b */
    public final /* synthetic */ NavBackStackEntry f6445b;

    /* renamed from: c */
    public final /* synthetic */ MainShellViewModel f6446c;

    /* renamed from: d */
    public final /* synthetic */ int f6447d;

    public /* synthetic */ C4578b(NavBackStackEntry navBackStackEntry, MainShellViewModel mainShellViewModel, int i, int i8) {
        this.f6444a = i8;
        this.f6445b = navBackStackEntry;
        this.f6446c = mainShellViewModel;
        this.f6447d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6444a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4587e.m4036a(this.f6445b, this.f6446c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6447d | 1));
                break;
            case 1:
                AbstractC4641b.m4074a(this.f6445b, this.f6446c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6447d | 1));
                break;
            default:
                AbstractC4868r4.m4237a(this.f6445b, this.f6446c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6447d | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
