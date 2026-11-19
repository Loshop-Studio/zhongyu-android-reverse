package com.zykj.mistake.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.utils.AskMaterialImageResolver", m5303f = "AskMaterialImageResolver.kt", m5304i = {0, 0, 0, 1, 1, 1, 1}, m5305l = {113, 115}, m5306m = "downloadImage", m5307n = {"url", "id", "request", "url", "id", "request", "result"}, m5308s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class AskMaterialImageResolver$downloadImage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5098c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialImageResolver$downloadImage$1(C5098c c5098c, InterfaceC5631c<? super AskMaterialImageResolver$downloadImage$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c5098c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C5098c.m4446b(this.this$0, null, null, this);
    }
}
