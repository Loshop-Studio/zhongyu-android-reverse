package com.zykj.mistake.feature.collection.component;

import androidx.compose.runtime.State;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.component.MistakeQuestionGridKt$MistakeQuestionGrid$1$1", m5303f = "MistakeQuestionGrid.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeQuestionGridKt$MistakeQuestionGrid$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $hasMore;
    final /* synthetic */ boolean $isLoadingMore;
    final /* synthetic */ boolean $isRefreshing;
    final /* synthetic */ List<C6383b> $items;
    final /* synthetic */ InterfaceC6469a $onLoadMore;
    final /* synthetic */ State<Boolean> $shouldLoadMore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeQuestionGridKt$MistakeQuestionGrid$1$1(State<Boolean> state, boolean z8, boolean z9, boolean z10, List<C6383b> list, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super MistakeQuestionGridKt$MistakeQuestionGrid$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$shouldLoadMore = state;
        this.$isRefreshing = z8;
        this.$isLoadingMore = z9;
        this.$hasMore = z10;
        this.$items = list;
        this.$onLoadMore = interfaceC6469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeQuestionGridKt$MistakeQuestionGrid$1$1(this.$shouldLoadMore, this.$isRefreshing, this.$isLoadingMore, this.$hasMore, this.$items, this.$onLoadMore, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        if (this.$shouldLoadMore.getValue().booleanValue() && !this.$isRefreshing && !this.$isLoadingMore && this.$hasMore && !this.$items.isEmpty()) {
            this.$onLoadMore.invoke();
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeQuestionGridKt$MistakeQuestionGrid$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
