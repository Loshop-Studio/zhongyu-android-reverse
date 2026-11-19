package p021b5;

import com.zykj.mistake.activity.MistakeListActivity;
import com.zykj.mistake.presenter.MistakeListPresenter;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;

/* renamed from: b5.f */
/* loaded from: classes3.dex */
public final class C3194f extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ MistakeListPresenter f1723a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1724b;

    public C3194f(MistakeListPresenter mistakeListPresenter, boolean z8) {
        this.f1723a = mistakeListPresenter;
        this.f1724b = z8;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        AbstractC5830k.m5330g(e, "e");
        MistakeListActivity mistakeListActivity = (MistakeListActivity) this.f1723a.f6001c;
        if (mistakeListActivity != null) {
            mistakeListActivity.mo3962b(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0194, code lost:
    
        r1.add(r14);
        r6 = r16;
     */
    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo16n(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b5.C3194f.mo16n(java.lang.Object):void");
    }
}
