package com.zykj.sketch.core.player;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class SketchPlayerView$loadData$1$1$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ InterfaceC9540l $onSuccess;
    final /* synthetic */ SketchPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayerView$loadData$1$1$1(SketchPlayerView sketchPlayerView, InterfaceC9540l interfaceC9540l) {
        super(1);
        this.this$0 = sketchPlayerView;
        this.$onSuccess = interfaceC9540l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m34077invoke$lambda1(SketchPlayerView this$0, final InterfaceC9540l onSuccess, final int i10) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.t
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView$loadData$1$1$1.m34078invoke$lambda1$lambda0(onSuccess, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
    public static final void m34078invoke$lambda1$lambda0(InterfaceC9540l onSuccess, int i10) {
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i10));
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C10786q.f26013a;
    }

    public final void invoke(final int i10) {
        final SketchPlayerView sketchPlayerView = this.this$0;
        final InterfaceC9540l interfaceC9540l = this.$onSuccess;
        sketchPlayerView.post(new Runnable() { // from class: com.zykj.sketch.core.player.u
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView$loadData$1$1$1.m34077invoke$lambda1(sketchPlayerView, interfaceC9540l, i10);
            }
        });
    }
}
