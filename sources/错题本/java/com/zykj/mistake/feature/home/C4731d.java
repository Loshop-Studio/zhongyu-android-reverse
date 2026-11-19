package com.zykj.mistake.feature.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.main.AbstractC5057l;
import com.zykj.mistake.main.MainShellViewModel;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.home.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4731d implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6825a;

    /* renamed from: b */
    public final /* synthetic */ MainShellViewModel f6826b;

    /* renamed from: c */
    public final /* synthetic */ int f6827c;

    public /* synthetic */ C4731d(MainShellViewModel mainShellViewModel, int i, int i8) {
        this.f6825a = i8;
        this.f6826b = mainShellViewModel;
        this.f6827c = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6825a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4737j.m4103a(this.f6826b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6827c | 1));
                break;
            default:
                AbstractC5057l.m4377a(this.f6826b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6827c | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
