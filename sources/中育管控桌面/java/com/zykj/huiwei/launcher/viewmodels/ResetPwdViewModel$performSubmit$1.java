package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.repository.UserRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p101l4.C7315g;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.ResetPwdViewModel$performSubmit$1", m7918f = "ResetPwdViewModel.kt", m7919i = {}, m7920l = {101}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nResetPwdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n230#2,5:156\n230#2,5:161\n230#2,5:166\n*S KotlinDebug\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1\n*L\n99#1:156,5\n102#1:161,5\n104#1:166,5\n*E\n"})
/* loaded from: classes4.dex */
public final class ResetPwdViewModel$performSubmit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7307a;

    /* renamed from: b */
    public final /* synthetic */ ResetPwdViewModel f7308b;

    /* renamed from: c */
    public final /* synthetic */ C7315g f7309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPwdViewModel$performSubmit$1(ResetPwdViewModel resetPwdViewModel, C7315g c7315g, Continuation continuation) {
        super(2, continuation);
        this.f7308b = resetPwdViewModel;
        this.f7309c = c7315g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ResetPwdViewModel$performSubmit$1(this.f7308b, this.f7309c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        C7315g c7315g;
        String message;
        Object value2;
        Object value3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7307a;
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = this.f7308b._uiState;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, C7315g.m8297b((C7315g) value2, null, null, true, false, null, false, null, false, false, null, 955, null)));
                UserRepository userRepository = this.f7308b.userRepository;
                String strM8303g = this.f7309c.m8303g();
                this.f7307a = 1;
                if (userRepository.m5433b(strM8303g, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableStateFlow mutableStateFlow2 = this.f7308b._uiState;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, C7315g.m8297b((C7315g) value3, null, null, false, false, null, true, null, false, false, null, 987, null)));
        } catch (Exception e6) {
            MutableStateFlow mutableStateFlow3 = this.f7308b._uiState;
            do {
                value = mutableStateFlow3.getValue();
                c7315g = (C7315g) value;
                message = e6.getMessage();
                if (message == null) {
                    message = "提交失败";
                }
            } while (!mutableStateFlow3.compareAndSet(value, C7315g.m8297b(c7315g, null, null, false, false, null, false, message, false, false, null, 955, null)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ResetPwdViewModel$performSubmit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
