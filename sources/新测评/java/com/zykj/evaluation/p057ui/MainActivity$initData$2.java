package com.zykj.evaluation.p057ui;

import android.content.ComponentName;
import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.MainActivity$initData$2;
import com.zykj.http.bean.HeaderBean;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p189o5.AbstractC8712h;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.MainActivity$initData$2", m13596f = "MainActivity.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class MainActivity$initData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f8991a;

    /* renamed from: b */
    public /* synthetic */ Object f8992b;

    /* renamed from: c */
    public final /* synthetic */ MainActivity f8993c;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.MainActivity$initData$2$1", m13596f = "MainActivity.kt", m13597i = {}, m13598l = {61}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.MainActivity$initData$2$1 */
    public static final class C68791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8994a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f8995b;

        @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13558d2 = {"<anonymous>", "", "it", "Lcom/zykj/http/bean/HeaderBean;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.evaluation.ui.MainActivity$initData$2$1$2", m13596f = "MainActivity.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.evaluation.ui.MainActivity$initData$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<HeaderBean, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8996a;

            /* renamed from: b */
            public final /* synthetic */ MainActivity f8997b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MainActivity mainActivity, Continuation continuation) {
                super(2, continuation);
                this.f8997b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(HeaderBean headerBean, Continuation continuation) {
                return ((AnonymousClass2) create(headerBean, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f8997b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8996a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f8997b.getWindow().setBackgroundDrawable(ResourcesCompat.getDrawable(this.f8997b.getResources(), R.drawable.bg_white, null));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68791(MainActivity mainActivity, Continuation continuation) {
            super(2, continuation);
            this.f8995b = mainActivity;
        }

        /* renamed from: f */
        public static final String m8847f(HeaderBean headerBean) {
            return headerBean.getServerUrl();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68791(this.f8995b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8994a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f8995b.m8844v().getHeaderBeanFlow(), new Function1() { // from class: com.zykj.evaluation.ui.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MainActivity$initData$2.C68791.m8847f((HeaderBean) obj2);
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f8995b, null);
                this.f8994a = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.MainActivity$initData$2$2", m13596f = "MainActivity.kt", m13597i = {}, m13598l = {73}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.MainActivity$initData$2$2 */
    public static final class C68802 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8998a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f8999b;

        @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13558d2 = {"<anonymous>", "", "it", "Lcom/zykj/lib/error/code/ErrorCode;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.evaluation.ui.MainActivity$initData$2$2$1", m13596f = "MainActivity.kt", m13597i = {}, m13598l = {84}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.evaluation.ui.MainActivity$initData$2$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ErrorCode, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f9000a;

            /* renamed from: b */
            public final /* synthetic */ MainActivity f9001b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, Continuation continuation) {
                super(2, continuation);
                this.f9001b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ErrorCode errorCode, Continuation continuation) {
                return ((AnonymousClass1) create(errorCode, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f9001b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f9000a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC8712h.m14351d(new ToastErrorMessage(Boxing.boxInt(TypedValues.CycleType.TYPE_CURVE_FIT), "登录已过期,请重新登录", null, 4, null), null, 2, null);
                    MainActivity mainActivity = this.f9001b;
                    Intent intent = new Intent();
                    intent.setAction("com.zykj.action.zykj.LOGOUT");
                    intent.setComponent(new ComponentName("com.zykj.manage", "com.zykj.center.receiver.LogoutReceiver"));
                    mainActivity.sendBroadcast(intent);
                    this.f9000a = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68802(MainActivity mainActivity, Continuation continuation) {
            super(2, continuation);
            this.f8999b = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68802(this.f8999b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8998a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow unauthorizedFlow = this.f8999b.m8844v().getUnauthorizedFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8999b, null);
                this.f8998a = 1;
                if (FlowKt.collectLatest(unauthorizedFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$initData$2(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f8993c = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainActivity$initData$2 mainActivity$initData$2 = new MainActivity$initData$2(this.f8993c, continuation);
        mainActivity$initData$2.f8992b = obj;
        return mainActivity$initData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f8992b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f8991a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C68791(this.f8993c, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C68802(this.f8993c, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainActivity$initData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
