package com.zykj.sketch.core.player;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "invoke", "(I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SketchPlayerView$loadData$1$1$1 extends Lambda implements InterfaceC6471c {
    final /* synthetic */ InterfaceC6471c $onSuccess;
    final /* synthetic */ SketchPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayerView$loadData$1$1$1(SketchPlayerView sketchPlayerView, InterfaceC6471c interfaceC6471c) {
        super(1);
        this.this$0 = sketchPlayerView;
        this.$onSuccess = interfaceC6471c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m13874invoke$lambda1(SketchPlayerView this$0, InterfaceC6471c onSuccess, int i) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new RunnableC5193d(i, 0, onSuccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
    public static final void m13875invoke$lambda1$lambda0(InterfaceC6471c onSuccess, int i) {
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i));
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C5443s.f8405a;
    }

    public final void invoke(int i) {
        SketchPlayerView sketchPlayerView = this.this$0;
        sketchPlayerView.post(new RunnableC5194e(sketchPlayerView, this.$onSuccess, i, 0));
    }
}
