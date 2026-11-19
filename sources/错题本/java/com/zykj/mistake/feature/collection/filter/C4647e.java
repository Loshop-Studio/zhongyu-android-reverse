package com.zykj.mistake.feature.collection.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.detail.AbstractC4840n0;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerResult;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.filter.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4647e implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6595a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6596b;

    /* renamed from: c */
    public final /* synthetic */ boolean f6597c;

    /* renamed from: d */
    public final /* synthetic */ boolean f6598d;

    /* renamed from: e */
    public final /* synthetic */ int f6599e;

    /* renamed from: f */
    public final /* synthetic */ Object f6600f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC5428d f6601g;

    public /* synthetic */ C4647e(Object obj, boolean z8, boolean z9, boolean z10, InterfaceC5428d interfaceC5428d, int i, int i8) {
        this.f6595a = i8;
        this.f6600f = obj;
        this.f6596b = z8;
        this.f6597c = z9;
        this.f6598d = z10;
        this.f6601g = interfaceC5428d;
        this.f6599e = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6595a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4655i.m4076b((String) this.f6600f, this.f6596b, this.f6597c, this.f6598d, (InterfaceC6469a) this.f6601g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6599e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4840n0.m4218b((MistakeDetailNewContract$AnswerResult) this.f6600f, this.f6596b, this.f6597c, this.f6598d, (InterfaceC6471c) this.f6601g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6599e | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
