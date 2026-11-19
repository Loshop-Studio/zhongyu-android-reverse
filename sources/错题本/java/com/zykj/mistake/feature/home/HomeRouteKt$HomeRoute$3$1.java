package com.zykj.mistake.feature.home;

import android.view.SavedStateHandle;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
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
import p167t4.C6592e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.home.HomeRouteKt$HomeRoute$3$1", m5303f = "HomeRoute.kt", m5304i = {0}, m5305l = {94}, m5306m = "invokeSuspend", m5307n = {"savedStateHandle"}, m5308s = {"L$0"})
/* loaded from: classes3.dex */
final class HomeRouteKt$HomeRoute$3$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ MistakeNotebookViewModel $notebookViewModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRouteKt$HomeRoute$3$1(C6592e c6592e, MistakeNotebookViewModel mistakeNotebookViewModel, InterfaceC5631c<? super HomeRouteKt$HomeRoute$3$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$mainNavController = c6592e;
        this.$notebookViewModel = mistakeNotebookViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new HomeRouteKt$HomeRoute$3$1(this.$mainNavController, this.$notebookViewModel, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            SavedStateHandle savedStateHandleM6223b = this.$mainNavController.m6223b();
            if (savedStateHandleM6223b == null) {
                return C5443s.f8405a;
            }
            InterfaceC5944m0 stateFlow = savedStateHandleM6223b.getStateFlow("nav_result_notebook_removed_item_id", null);
            C4733f c4733f = new C4733f(this.$notebookViewModel, savedStateHandleM6223b, 1);
            this.L$0 = null;
            this.label = 1;
            if (stateFlow.collect(c4733f, this) == coroutineSingletons) {
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
        return ((HomeRouteKt$HomeRoute$3$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
