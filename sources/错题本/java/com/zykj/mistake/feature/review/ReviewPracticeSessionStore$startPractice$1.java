package com.zykj.mistake.feature.review;

import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore", m5303f = "ReviewPracticeSessionStore.kt", m5304i = {0, 1, 1, 1, 1}, m5305l = {186, ComposerKt.providerValuesKey}, m5306m = "startPractice", m5307n = {"mode", "start", "sessionId", "scene", "mode"}, m5308s = {"I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class ReviewPracticeSessionStore$startPractice$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5009q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPracticeSessionStore$startPractice$1(C5009q c5009q, InterfaceC5631c<? super ReviewPracticeSessionStore$startPractice$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c5009q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5009q c5009q = this.this$0;
        C5009q c5009q2 = C5009q.f7711a;
        return c5009q.m4329d(0, this);
    }
}
