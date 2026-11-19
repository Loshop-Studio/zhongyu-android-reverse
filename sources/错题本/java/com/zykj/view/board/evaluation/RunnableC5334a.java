package com.zykj.view.board.evaluation;

import com.zykj.blackboard.core.graph.group.ImageGraph;

/* renamed from: com.zykj.view.board.evaluation.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5334a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8267a;

    /* renamed from: b */
    public final /* synthetic */ ImageGraph f8268b;

    /* renamed from: c */
    public final /* synthetic */ BlackboardEvaluationFragment f8269c;

    public /* synthetic */ RunnableC5334a(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment, int i) {
        this.f8267a = i;
        this.f8268b = imageGraph;
        this.f8269c = blackboardEvaluationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8267a) {
            case 0:
                BlackboardEvaluationFragment.addImage$lambda$41$lambda$40(this.f8268b, this.f8269c);
                break;
            default:
                BlackboardEvaluationFragment.capture$lambda$39$lambda$38$lambda$37(this.f8268b, this.f8269c);
                break;
        }
    }
}
