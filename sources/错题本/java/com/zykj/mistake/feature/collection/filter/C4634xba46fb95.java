package com.zykj.mistake.feature.collection.filter;

import com.zykj.mistake.feature.collection.detail.C4590f;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.CollectionFilterResultShellEffectHandlerKt$CollectionFilterResultShellEffectHandler$1$1", m5303f = "CollectionFilterResultShellEffectHandler.kt", m5304i = {}, m5305l = {15}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* renamed from: com.zykj.mistake.feature.collection.filter.CollectionFilterResultShellEffectHandlerKt$CollectionFilterResultShellEffectHandler$1$1 */
/* loaded from: classes3.dex */
final class C4634xba46fb95 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MainShellViewModel $shellViewModel;
    final /* synthetic */ MistakeCollectionFilterResultViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4634xba46fb95(MainShellViewModel mainShellViewModel, MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, InterfaceC5631c<? super C4634xba46fb95> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$shellViewModel = mainShellViewModel;
        this.$viewModel = mistakeCollectionFilterResultViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new C4634xba46fb95(this.$shellViewModel, this.$viewModel, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5960z c5960z = this.$shellViewModel.f7812d;
            C4590f c4590f = new C4590f(this.$viewModel, 1);
            this.label = 1;
            if (c5960z.f9446a.collect(c4590f, this) == coroutineSingletons) {
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
        return ((C4634xba46fb95) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
