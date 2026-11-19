package com.zykj.sketch.core.player;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class SketchPlayerView$loadData$1$1$1 extends Lambda implements InterfaceC10570l {
    final /* synthetic */ InterfaceC10570l $onSuccess;
    final /* synthetic */ SketchPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayerView$loadData$1$1$1(SketchPlayerView sketchPlayerView, InterfaceC10570l interfaceC10570l) {
        super(1);
        this.this$0 = sketchPlayerView;
        this.$onSuccess = interfaceC10570l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m27533invoke$lambda1(SketchPlayerView this$0, final InterfaceC10570l onSuccess, final int i10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.t
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView$loadData$1$1$1.m27534invoke$lambda1$lambda0(onSuccess, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
    public static final void m27534invoke$lambda1$lambda0(InterfaceC10570l onSuccess, int i10) {
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i10));
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C8736p.f16368a;
    }

    public final void invoke(final int i10) {
        final SketchPlayerView sketchPlayerView = this.this$0;
        final InterfaceC10570l interfaceC10570l = this.$onSuccess;
        sketchPlayerView.post(new Runnable() { // from class: com.zykj.sketch.core.player.u
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView$loadData$1$1$1.m27533invoke$lambda1(sketchPlayerView, interfaceC10570l, i10);
            }
        });
    }
}
