package com.zykj.view.board.evaluation;

import android.net.Uri;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.board.evaluation.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5338e implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8275a;

    /* renamed from: b */
    public final /* synthetic */ BlackboardEvaluationFragment f8276b;

    public /* synthetic */ C5338e(BlackboardEvaluationFragment blackboardEvaluationFragment, int i) {
        this.f8275a = i;
        this.f8276b = blackboardEvaluationFragment;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8275a) {
            case 0:
                return BlackboardEvaluationFragment.initBlackboard$lambda$33(this.f8276b, (Throwable) obj);
            case 1:
                return BlackboardEvaluationFragment.capture$lambda$39(this.f8276b, (Uri) obj);
            case 2:
                return BlackboardEvaluationFragment.setSelectEditColorChangeListenerCompat$lambda$59$lambda$58(this.f8276b, ((Integer) obj).intValue());
            default:
                return BlackboardEvaluationFragment.initClickListener$lambda$27$lambda$25(this.f8276b, (String) obj);
        }
    }
}
