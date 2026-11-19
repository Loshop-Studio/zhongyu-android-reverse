package com.zykj.blackboard.core.canvas;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes5.dex */
public final class SketchRecorderView$ready$1$1$2 extends Lambda implements InterfaceC9540l {

    /* renamed from: c */
    public final /* synthetic */ SketchRecorderView f17943c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9540l f17944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$2(SketchRecorderView sketchRecorderView, InterfaceC9540l interfaceC9540l) {
        super(1);
        this.f17943c = sketchRecorderView;
        this.f17944d = interfaceC9540l;
    }

    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m34003invoke$lambda0(InterfaceC9540l error, Throwable it) {
        AbstractC9979u.m20294g(error, "$error");
        AbstractC9979u.m20294g(it, "$it");
        error.invoke(it);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C10786q.f26013a;
    }

    public final void invoke(final Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        SketchRecorderView sketchRecorderView = this.f17943c;
        final InterfaceC9540l interfaceC9540l = this.f17944d;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.b
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$2.m34003invoke$lambda0(interfaceC9540l, it);
            }
        });
    }
}
