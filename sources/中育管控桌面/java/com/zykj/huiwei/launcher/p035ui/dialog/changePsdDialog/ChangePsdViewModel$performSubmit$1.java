package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.huiwei.launcher.bean.req.UpdatePwdReq;
import com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog.AbstractC6129c;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import p043d4.C6237q;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdViewModel$performSubmit$1", m7918f = "ChangePsdViewModel.kt", m7919i = {}, m7920l = {125}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nChangePsdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,141:1\n230#2,5:142\n230#2,5:147\n*S KotlinDebug\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1\n*L\n122#1:142,5\n132#1:147,5\n*E\n"})
/* loaded from: classes4.dex */
public final class ChangePsdViewModel$performSubmit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6544a;

    /* renamed from: b */
    public final /* synthetic */ ChangePsdViewModel f6545b;

    /* renamed from: c */
    public final /* synthetic */ C6237q f6546c;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdViewModel$performSubmit$1$a */
    public static final class C6119a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ ChangePsdViewModel f6547a;

        public C6119a(ChangePsdViewModel changePsdViewModel) {
            this.f6547a = changePsdViewModel;
        }

        /* renamed from: a */
        public final Object m5765a(boolean z6, Continuation continuation) {
            Object value;
            if (z6) {
                MutableStateFlow mutableStateFlow = this.f6547a._uiState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, C6237q.m6326b((C6237q) value, null, null, null, false, false, null, false, false, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, null)));
                this.f6547a.m5763i(AbstractC6129c.b.f6576a);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m5765a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePsdViewModel$performSubmit$1(ChangePsdViewModel changePsdViewModel, C6237q c6237q, Continuation continuation) {
        super(2, continuation);
        this.f6545b = changePsdViewModel;
        this.f6546c = c6237q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangePsdViewModel$performSubmit$1(this.f6545b, this.f6546c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6544a;
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = this.f6545b._uiState;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, C6237q.m6326b((C6237q) value2, null, null, null, true, false, null, false, false, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, null)));
                Flow flowM5435d = this.f6545b.userRepository.m5435d(new UpdatePwdReq(this.f6546c.m6332g(), this.f6546c.m6331f()));
                C6119a c6119a = new C6119a(this.f6545b);
                this.f6544a = 1;
                if (flowM5435d.collect(c6119a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e6) {
            MutableStateFlow mutableStateFlow2 = this.f6545b._uiState;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, C6237q.m6326b((C6237q) value, null, null, null, false, false, null, false, false, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, null)));
            ChangePsdViewModel changePsdViewModel = this.f6545b;
            String message = e6.getMessage();
            if (message == null) {
                message = "未知错误";
            }
            changePsdViewModel.m5763i(new AbstractC6129c.a(message));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChangePsdViewModel$performSubmit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
