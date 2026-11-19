package com.zykj.huiwei.launcher.server;

import com.zykj.huiwei.launcher.server.AbstractC6086b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.server.MyFloatingToolService$startGlobalEventListening$1", m7918f = "MyFloatingToolService.kt", m7919i = {}, m7920l = {482}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MyFloatingToolService$startGlobalEventListening$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6241a;

    /* renamed from: b */
    public final /* synthetic */ MyFloatingToolService f6242b;

    /* renamed from: com.zykj.huiwei.launcher.server.MyFloatingToolService$startGlobalEventListening$1$a */
    public static final class C6083a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ MyFloatingToolService f6243a;

        public C6083a(MyFloatingToolService myFloatingToolService) {
            this.f6243a = myFloatingToolService;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC6086b abstractC6086b, Continuation continuation) {
            if (!(abstractC6086b instanceof AbstractC6086b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            OverlayToastManager overlayToastManager = this.f6243a.overlayToastManager;
            if (overlayToastManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("overlayToastManager");
                overlayToastManager = null;
            }
            OverlayToastManager.m5498i(overlayToastManager, ((AbstractC6086b.a) abstractC6086b).m5510a(), 0L, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFloatingToolService$startGlobalEventListening$1(MyFloatingToolService myFloatingToolService, Continuation continuation) {
        super(2, continuation);
        this.f6242b = myFloatingToolService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyFloatingToolService$startGlobalEventListening$1(this.f6242b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6241a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowM5508a = C6085a.f6279a.m5508a();
            C6083a c6083a = new C6083a(this.f6242b);
            this.f6241a = 1;
            if (flowM5508a.collect(c6083a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MyFloatingToolService$startGlobalEventListening$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
