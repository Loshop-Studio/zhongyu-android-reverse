package com.zykj.view.board.evaluation;

/* renamed from: com.zykj.view.board.evaluation.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5337d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8273a;

    /* renamed from: b */
    public final /* synthetic */ BlackboardEvaluationFragment f8274b;

    public /* synthetic */ RunnableC5337d(BlackboardEvaluationFragment blackboardEvaluationFragment, int i) {
        this.f8273a = i;
        this.f8274b = blackboardEvaluationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8273a) {
            case 0:
                BlackboardEvaluationFragment.initTranslationConfig$lambda$6(this.f8274b);
                break;
            default:
                BlackboardEvaluationFragment.initTranslationConfig$lambda$6$lambda$5(this.f8274b);
                break;
        }
    }
}
