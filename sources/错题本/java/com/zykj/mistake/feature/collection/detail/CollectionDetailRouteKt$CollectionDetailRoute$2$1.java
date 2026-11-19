package com.zykj.mistake.feature.collection.detail;

import androidx.navigation.NavBackStackEntry;
import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.CollectionDetailRouteKt$CollectionDetailRoute$2$1", m5303f = "CollectionDetailRoute.kt", m5304i = {}, m5305l = {34}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class CollectionDetailRouteKt$CollectionDetailRoute$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ MistakeCollectionDetailViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDetailRouteKt$CollectionDetailRoute$2$1(NavBackStackEntry navBackStackEntry, MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, InterfaceC5631c<? super CollectionDetailRouteKt$CollectionDetailRoute$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$backStackEntry = navBackStackEntry;
        this.$viewModel = mistakeCollectionDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new CollectionDetailRouteKt$CollectionDetailRoute$2$1(this.$backStackEntry, this.$viewModel, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC5944m0 stateFlow = this.$backStackEntry.getSavedStateHandle().getStateFlow("nav_result_collection_detail_refresh", Boolean.FALSE);
            C4581c c4581c = new C4581c(this.$backStackEntry, this.$viewModel);
            this.label = 1;
            if (stateFlow.collect(c4581c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((CollectionDetailRouteKt$CollectionDetailRoute$2$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
