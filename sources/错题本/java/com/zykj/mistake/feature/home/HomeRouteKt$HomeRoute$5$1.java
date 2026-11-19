package com.zykj.mistake.feature.home;

import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.feature.review.ReviewViewModel;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.C5901a0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.home.HomeRouteKt$HomeRoute$5$1", m5303f = "HomeRoute.kt", m5304i = {}, m5305l = {113}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class HomeRouteKt$HomeRoute$5$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MistakeCollectionViewModel $collectionViewModel;
    final /* synthetic */ MistakeNotebookViewModel $notebookViewModel;
    final /* synthetic */ ReviewViewModel $reviewViewModel;
    final /* synthetic */ MainShellViewModel $shellViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRouteKt$HomeRoute$5$1(MainShellViewModel mainShellViewModel, MistakeNotebookViewModel mistakeNotebookViewModel, MistakeCollectionViewModel mistakeCollectionViewModel, ReviewViewModel reviewViewModel, InterfaceC5631c<? super HomeRouteKt$HomeRoute$5$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$shellViewModel = mainShellViewModel;
        this.$notebookViewModel = mistakeNotebookViewModel;
        this.$collectionViewModel = mistakeCollectionViewModel;
        this.$reviewViewModel = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new HomeRouteKt$HomeRoute$5$1(this.$shellViewModel, this.$notebookViewModel, this.$collectionViewModel, this.$reviewViewModel, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            MainShellViewModel mainShellViewModel = this.$shellViewModel;
            C5901a0 c5901a0 = mainShellViewModel.f7814f;
            C4735h c4735h = new C4735h(mainShellViewModel, this.$notebookViewModel, this.$collectionViewModel, this.$reviewViewModel);
            this.label = 1;
            if (c5901a0.f9347a.collect(c4735h, this) == coroutineSingletons) {
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
        return ((HomeRouteKt$HomeRoute$5$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
