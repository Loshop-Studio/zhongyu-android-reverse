package com.zykj.blackboard.core.canvas;

import com.zykj.blackboard.core.edit.BoardControl;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Ld6/s;", "invoke", "(ZJ)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SketchRecorderView$ready$2$1$1 extends Lambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6471c $callBack;
    final /* synthetic */ BoardControl $this_apply;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$2$1$1(SketchRecorderView sketchRecorderView, InterfaceC6471c interfaceC6471c, BoardControl boardControl) {
        super(2);
        this.this$0 = sketchRecorderView;
        this.$callBack = interfaceC6471c;
        this.$this_apply = boardControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m13754invoke$lambda0(InterfaceC6471c callBack, BoardControl this_apply) {
        AbstractC5830k.m5330g(callBack, "$callBack");
        AbstractC5830k.m5330g(this_apply, "$this_apply");
        callBack.invoke(this_apply);
    }

    @Override // p152r6.InterfaceC6473e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
        return C5443s.f8405a;
    }

    public final void invoke(boolean z8, long j7) {
        this.this$0.post(new RunnableC4256c(this.$this_apply, this.$callBack));
    }
}
