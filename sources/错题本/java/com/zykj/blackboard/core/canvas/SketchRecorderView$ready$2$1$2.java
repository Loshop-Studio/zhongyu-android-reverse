package com.zykj.blackboard.core.canvas;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SketchRecorderView$ready$2$1$2 extends Lambda implements InterfaceC6471c {
    final /* synthetic */ InterfaceC6471c $error;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$2$1$2(SketchRecorderView sketchRecorderView, InterfaceC6471c interfaceC6471c) {
        super(1);
        this.this$0 = sketchRecorderView;
        this.$error = interfaceC6471c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m13755invoke$lambda0(InterfaceC6471c error, Throwable it) {
        AbstractC5830k.m5330g(error, "$error");
        AbstractC5830k.m5330g(it, "$it");
        error.invoke(it);
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C5443s.f8405a;
    }

    public final void invoke(@NotNull Throwable it) {
        AbstractC5830k.m5330g(it, "it");
        this.this$0.post(new RunnableC4255b(this.$error, it, 1));
    }
}
