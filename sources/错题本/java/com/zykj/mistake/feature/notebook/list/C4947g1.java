package com.zykj.mistake.feature.notebook.list;

import com.zykj.mistake.feature.review.C4997e;
import com.zykj.mistake.feature.review.C4998f;
import com.zykj.mistake.feature.review.C4999g;
import com.zykj.mistake.feature.review.ReviewContract$PracticePoolType;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.notebook.list.g1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4947g1 implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f7555a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f7556b;

    public /* synthetic */ C4947g1(InterfaceC6471c interfaceC6471c, int i) {
        this.f7555a = i;
        this.f7556b = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f7555a) {
            case 0:
                this.f7556b.invoke(C4949h0.f7559a);
                break;
            case 1:
                this.f7556b.invoke(C4967n0.f7588a);
                break;
            case 2:
                this.f7556b.invoke(C4985w0.f7621a);
                break;
            case 3:
                this.f7556b.invoke(C4931b0.f7487a);
                break;
            case 4:
                this.f7556b.invoke(C4937d0.f7493a);
                break;
            case 5:
                this.f7556b.invoke(C4934c0.f7490a);
                break;
            case 6:
                this.f7556b.invoke(C4940e0.f7500a);
                break;
            case 7:
                this.f7556b.invoke(C4999g.f7646a);
                break;
            case 8:
                this.f7556b.invoke(C4997e.f7644a);
                break;
            case 9:
                this.f7556b.invoke(new C4998f(ReviewContract$PracticePoolType.STRENGTHENING));
                break;
            case 10:
                this.f7556b.invoke(new C4998f(ReviewContract$PracticePoolType.CONSOLIDATING));
                break;
            case 11:
                this.f7556b.invoke(new C4998f(ReviewContract$PracticePoolType.MASTERED));
                break;
            case 12:
                this.f7556b.invoke(new C4959k1(10));
                break;
            case 13:
                this.f7556b.invoke(new C4959k1(12));
                break;
            default:
                this.f7556b.invoke(new C4959k1(11));
                break;
        }
        return C5443s.f8405a;
    }
}
