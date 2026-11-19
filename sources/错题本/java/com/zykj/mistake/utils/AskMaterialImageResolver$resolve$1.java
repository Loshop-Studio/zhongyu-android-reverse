package com.zykj.mistake.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.utils.AskMaterialImageResolver", m5303f = "AskMaterialImageResolver.kt", m5304i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m5305l = {33, 34, 35}, m5306m = "resolve", m5307n = {"items", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "item", "$i$f$map", "$i$f$mapTo", "$i$a$-map-AskMaterialImageResolver$resolve$2", "items", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "item", "$i$f$map", "$i$f$mapTo", "$i$a$-map-AskMaterialImageResolver$resolve$2", "items", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "item", "$i$f$map", "$i$f$mapTo", "$i$a$-map-AskMaterialImageResolver$resolve$2"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2"})
/* loaded from: classes3.dex */
final class AskMaterialImageResolver$resolve$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5098c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialImageResolver$resolve$1(C5098c c5098c, InterfaceC5631c<? super AskMaterialImageResolver$resolve$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c5098c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4449e(null, this);
    }
}
