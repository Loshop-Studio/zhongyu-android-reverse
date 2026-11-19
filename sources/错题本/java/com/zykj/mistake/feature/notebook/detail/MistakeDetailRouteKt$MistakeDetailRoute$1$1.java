package com.zykj.mistake.feature.notebook.detail;

import android.content.Context;
import com.zykj.mistake.utils.AbstractC5099d;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p167t4.C6595h;
import p175u4.C6620g;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailRouteKt$MistakeDetailRoute$1$1", m5303f = "MistakeDetailRoute.kt", m5304i = {}, m5305l = {39}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailRouteKt$MistakeDetailRoute$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6620g $args;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $initializeSession;
    final /* synthetic */ MistakeDetailNewViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailRouteKt$MistakeDetailRoute$1$1(boolean z8, Context context, MistakeDetailNewViewModel mistakeDetailNewViewModel, C6620g c6620g, InterfaceC5631c<? super MistakeDetailRouteKt$MistakeDetailRoute$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$initializeSession = z8;
        this.$context = context;
        this.$viewModel = mistakeDetailNewViewModel;
        this.$args = c6620g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailRouteKt$MistakeDetailRoute$1$1(this.$initializeSession, this.$context, this.$viewModel, this.$args, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            if (this.$initializeSession) {
                Context context = this.$context;
                this.label = 1;
                if (AbstractC5099d.m4452b(context, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C5443s.f8405a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        MistakeDetailNewViewModel mistakeDetailNewViewModel = this.$viewModel;
        C6620g c6620g = this.$args;
        int i8 = c6620g.f11072a;
        int i9 = c6620g.f11073b;
        long j7 = c6620g.f11074c;
        String str = c6620g.f11075d;
        String str2 = c6620g.f11076e;
        String str3 = c6620g.f11077f;
        String str4 = c6620g.f11078g;
        boolean z8 = c6620g.f11079h;
        boolean z9 = c6620g.f11080i;
        boolean z10 = c6620g.f11081j;
        List list2 = c6620g.f11082k;
        C6595h c6595h = C6595h.f11010a;
        String key = c6620g.f11083l;
        synchronized (c6595h) {
            AbstractC5830k.m5330g(key, "key");
            list = (List) C6595h.f11011b.get(key);
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
        }
        mistakeDetailNewViewModel.m4162t(new C4824k2(i8, i9, j7, str, str2, str3, str4, z8, z9, z10, list2, list, c6620g.f11084m, c6620g.f11085n, c6620g.f11086o, c6620g.f11087p, c6620g.f11088q, c6620g.f11089r));
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailRouteKt$MistakeDetailRoute$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
