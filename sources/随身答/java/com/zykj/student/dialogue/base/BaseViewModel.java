package com.zykj.student.dialogue.base;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p128h6.AbstractC8102a;
import p128h6.AbstractC8103b;
import p128h6.C8104c;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJÓ\u0001\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2)\b\u0002\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u00152)\b\u0002\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u001521\b\u0002\u0010\u001a\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00152'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R+\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020&8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,¨\u0006."}, m13413d2 = {"Lcom/zykj/student/dialogue/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "k", "c", "l", "d", "Lh6/b;", "commonEvent", "g", "(Lh6/b;)V", "", "customToastMsg", "", "isRefreshStyle", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onStart", "onComplete", "Lkotlin/Function3;", "", "onError", "onTask", "e", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "isShowProgress", "i", "(Z)V", "isShowRefresh", "j", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "a", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lh6/c;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "()Lh6/c;", "h", "(Lh6/c;)V", "loadingUiState", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseViewModel.kt\ncom/zykj/student/dialogue/base/BaseViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,127:1\n85#2:128\n113#2,2:129\n*S KotlinDebug\n*F\n+ 1 BaseViewModel.kt\ncom/zykj/student/dialogue/base/BaseViewModel\n*L\n22#1:128\n22#1:129,2\n*E\n"})
/* loaded from: classes5.dex */
public abstract class BaseViewModel extends ViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableSharedFlow commonEvent = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableState loadingUiState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C8104c(false, false, 3, null), null, 2, null);

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.base.BaseViewModel$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {89}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.base.BaseViewModel$1 */
    public static final class C74481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10322a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lh6/b;", "it", "", "<anonymous>", "(Lh6/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.base.BaseViewModel$1$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.base.BaseViewModel$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC8103b, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10324a;

            /* renamed from: b */
            public /* synthetic */ Object f10325b;

            public AnonymousClass1(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC8103b abstractC8103b, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC8103b, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.f10325b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC8103b abstractC8103b = (AbstractC8103b) this.f10325b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10324a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AbstractC8102a.m12946a(abstractC8103b);
                return Unit.INSTANCE;
            }
        }

        public C74481(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BaseViewModel.this.new C74481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10322a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = BaseViewModel.this.commonEvent;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.f10322a = 1;
                if (FlowKt.collectLatest(mutableSharedFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C74481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BaseViewModel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C74481(null), 3, null);
    }

    /* renamed from: f */
    public static /* synthetic */ void m9917f(BaseViewModel baseViewModel, String str, boolean z9, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i9, Object obj) {
        Function3 function32;
        Function2 function24;
        Function2 function25;
        Function2 function26;
        String str2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchData");
        }
        if ((i9 & 1) != 0) {
            str = "";
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        if ((i9 & 4) != 0) {
            function2 = new BaseViewModel$launchData$1(z9, baseViewModel, null);
        }
        if ((i9 & 8) != 0) {
            function22 = new BaseViewModel$launchData$2(z9, baseViewModel, null);
        }
        if ((i9 & 16) != 0) {
            function32 = null;
            function25 = function2;
            function24 = function23;
            str2 = str;
            function26 = function22;
        } else {
            function32 = function3;
            function24 = function23;
            function25 = function2;
            function26 = function22;
            str2 = str;
        }
        baseViewModel.m9921e(str2, z9, function25, function26, function32, function24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C8104c m9918b() {
        return (C8104c) this.loadingUiState.getValue();
    }

    /* renamed from: c */
    public final void m9919c() {
        m9924i(false);
    }

    /* renamed from: d */
    public final void m9920d() {
        m9925j(false);
    }

    /* renamed from: e */
    public final void m9921e(String customToastMsg, boolean isRefreshStyle, Function2 onStart, Function2 onComplete, Function3 onError, Function2 onTask) {
        Intrinsics.checkNotNullParameter(customToastMsg, "customToastMsg");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onTask, "onTask");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseViewModel$launchData$3(onStart, onTask, onError, customToastMsg, onComplete, null), 3, null);
    }

    /* renamed from: g */
    public final void m9922g(AbstractC8103b commonEvent) {
        Intrinsics.checkNotNullParameter(commonEvent, "commonEvent");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseViewModel$onCommonEvent$1(this, commonEvent, null), 3, null);
    }

    /* renamed from: h */
    public final void m9923h(C8104c c8104c) {
        this.loadingUiState.setValue(c8104c);
    }

    /* renamed from: i */
    public final void m9924i(boolean isShowProgress) {
        m9923h(C8104c.m12950b(m9918b(), isShowProgress, false, 2, null));
    }

    /* renamed from: j */
    public final void m9925j(boolean isShowRefresh) {
        m9923h(C8104c.m12950b(m9918b(), false, isShowRefresh, 1, null));
    }

    /* renamed from: k */
    public final void m9926k() {
        m9924i(true);
    }

    /* renamed from: l */
    public final void m9927l() {
        m9925j(true);
    }
}
