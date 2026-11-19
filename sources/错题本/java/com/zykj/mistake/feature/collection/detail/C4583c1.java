package com.zykj.mistake.feature.collection.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.home.AbstractC4729b;
import com.zykj.mistake.feature.home.HomeTab;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.detail.c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4583c1 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6458a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f6459b;

    /* renamed from: c */
    public final /* synthetic */ int f6460c;

    /* renamed from: d */
    public final /* synthetic */ int f6461d;

    /* renamed from: e */
    public final /* synthetic */ Object f6462e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC5428d f6463f;

    public /* synthetic */ C4583c1(int i, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i8) {
        this.f6460c = i;
        this.f6459b = z8;
        this.f6462e = interfaceC6469a;
        this.f6463f = interfaceC6469a2;
        this.f6461d = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6458a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC4592f1.m4042e(this.f6460c, this.f6459b, (InterfaceC6469a) this.f6462e, (InterfaceC6469a) this.f6463f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6461d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4729b.m4101a((HomeTab) this.f6462e, this.f6459b, (InterfaceC6471c) this.f6463f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6460c | 1), this.f6461d);
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4583c1(HomeTab homeTab, boolean z8, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f6462e = homeTab;
        this.f6459b = z8;
        this.f6463f = interfaceC6471c;
        this.f6460c = i;
        this.f6461d = i8;
    }
}
