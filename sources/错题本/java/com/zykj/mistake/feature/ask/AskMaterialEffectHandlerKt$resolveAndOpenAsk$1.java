package com.zykj.mistake.feature.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt", m5303f = "AskMaterialEffectHandler.kt", m5304i = {0, 0, 0, 0, 0, 0}, m5305l = {110}, m5306m = "resolveAndOpenAsk", m5307n = {"items", "environment", "platformBridge", "resolveGate", "container", "$i$a$-runCatching-AskMaterialEffectHandlerKt$resolveAndOpenAsk$result$1"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* loaded from: classes3.dex */
final class AskMaterialEffectHandlerKt$resolveAndOpenAsk$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public AskMaterialEffectHandlerKt$resolveAndOpenAsk$1(InterfaceC5631c<? super AskMaterialEffectHandlerKt$resolveAndOpenAsk$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4510a.m3999c(null, null, null, null, this);
    }
}
