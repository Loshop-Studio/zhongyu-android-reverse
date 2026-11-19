package com.zykj.mistake.feature.review;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore", m5303f = "ReviewPracticeSessionStore.kt", m5304i = {0, 0, 0, 0}, m5305l = {68}, m5306m = "requestNextRound", m5307n = {"sessionId", "session", "continueNextRound", "numericSessionId"}, m5308s = {"L$0", "L$1", "Z$0", "J$0"})
/* loaded from: classes3.dex */
final class ReviewPracticeSessionStore$requestNextRound$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5009q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPracticeSessionStore$requestNextRound$1(C5009q c5009q, InterfaceC5631c<? super ReviewPracticeSessionStore$requestNextRound$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c5009q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4328c(null, false, this);
    }
}
