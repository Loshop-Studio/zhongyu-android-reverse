package com.zykj.blackboard.core.canvas;

import com.zykj.blackboard.core.edit.BoardControl;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.blackboard.core.canvas.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4256c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5187a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5188b;

    /* renamed from: c */
    public final /* synthetic */ Object f5189c;

    public /* synthetic */ RunnableC4256c(SketchPlayView sketchPlayView, InterfaceC6471c interfaceC6471c) {
        this.f5189c = sketchPlayView;
        this.f5188b = interfaceC6471c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5187a) {
            case 0:
                SketchRecorderView$ready$2$1$1.m13754invoke$lambda0(this.f5188b, (BoardControl) this.f5189c);
                break;
            default:
                SketchPlayView.m13749ready$lambda2((SketchPlayView) this.f5189c, this.f5188b);
                break;
        }
    }

    public /* synthetic */ RunnableC4256c(BoardControl boardControl, InterfaceC6471c interfaceC6471c) {
        this.f5188b = interfaceC6471c;
        this.f5189c = boardControl;
    }
}
