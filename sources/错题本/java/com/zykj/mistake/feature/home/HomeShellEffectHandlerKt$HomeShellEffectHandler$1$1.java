package com.zykj.mistake.feature.home;

import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.C5960z;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.home.HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1", m5303f = "HomeShellEffectHandler.kt", m5304i = {}, m5305l = {20}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MistakeCollectionViewModel $collectionViewModel;
    final /* synthetic */ MistakeNotebookViewModel $notebookViewModel;
    final /* synthetic */ MainShellViewModel $shellViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1(MainShellViewModel mainShellViewModel, MistakeNotebookViewModel mistakeNotebookViewModel, MistakeCollectionViewModel mistakeCollectionViewModel, InterfaceC5631c<? super HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$shellViewModel = mainShellViewModel;
        this.$notebookViewModel = mistakeNotebookViewModel;
        this.$collectionViewModel = mistakeCollectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1(this.$shellViewModel, this.$notebookViewModel, this.$collectionViewModel, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5960z c5960z = this.$shellViewModel.f7812d;
            C4734g c4734g = new C4734g(this.$notebookViewModel, this.$collectionViewModel, 1);
            this.label = 1;
            if (c5960z.f9446a.collect(c4734g, this) == coroutineSingletons) {
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
        return ((HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
