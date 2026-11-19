package com.zykj.huiwei.launcher.ext;

import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.AbstractC4668s;
import com.zykj.base.BaseViewModel;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.http.exception.RemoteCodeException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1", m7918f = "ViewModelExt.kt", m7919i = {}, m7920l = {108}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class ViewModelExtKt$flowLaunchWithLoading$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6096a;

    /* renamed from: b */
    public final /* synthetic */ Flow f6097b;

    /* renamed from: c */
    public final /* synthetic */ Function1 f6098c;

    /* renamed from: d */
    public final /* synthetic */ BaseViewModel f6099d;

    /* renamed from: e */
    public final /* synthetic */ Function1 f6100e;

    /* renamed from: f */
    public final /* synthetic */ Function2 f6101f;

    /* renamed from: g */
    public final /* synthetic */ Function2 f6102g;

    @Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$1", m7918f = "ViewModelExt.kt", m7919i = {}, m7920l = {89}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    @SourceDebugExtension({"SMAP\nViewModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelExt.kt\ncom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
    /* renamed from: com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$1 */
    public static final class C60571 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6103a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f6104b;

        /* renamed from: c */
        public final /* synthetic */ BaseViewModel f6105c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60571(Function1 function1, BaseViewModel baseViewModel, Continuation continuation) {
            super(2, continuation);
            this.f6104b = function1;
            this.f6105c = baseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C60571(this.f6104b, this.f6105c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6103a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f6104b;
                if (function1 != null) {
                    this.f6103a = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.f6105c.isDialogVisible().setValue(Boxing.boxBoolean(boolBoxBoolean.booleanValue()));
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
        public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
            return ((C60571) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m7880d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$2", m7918f = "ViewModelExt.kt", m7919i = {}, m7920l = {91}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    @SourceDebugExtension({"SMAP\nViewModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelExt.kt\ncom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
    /* renamed from: com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$2 */
    public static final class C60582 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6106a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f6107b;

        /* renamed from: c */
        public final /* synthetic */ BaseViewModel f6108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60582(Function1 function1, BaseViewModel baseViewModel, Continuation continuation) {
            super(3, continuation);
            this.f6107b = function1;
            this.f6108c = baseViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector) flowCollector, th, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6106a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f6107b;
                if (function1 != null) {
                    this.f6106a = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                    this.f6108c.isDialogVisible().setValue(Boxing.boxBoolean(boolBoxBoolean.booleanValue()));
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
        public final Object invoke2(FlowCollector flowCollector, Throwable th, Continuation continuation) {
            return new C60582(this.f6107b, this.f6108c, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m7880d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$3", m7918f = "ViewModelExt.kt", m7919i = {0, 0}, m7920l = {103}, m7921m = "invokeSuspend", m7922n = {"it", "toastMessage"}, m7923s = {"L$0", "L$1"})
    /* renamed from: com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$3 */
    public static final class C60593 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f6109a;

        /* renamed from: b */
        public int f6110b;

        /* renamed from: c */
        public /* synthetic */ Object f6111c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f6112d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f6113e;

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$3$1", m7918f = "ViewModelExt.kt", m7919i = {}, m7920l = {104}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f6114a;

            /* renamed from: b */
            public final /* synthetic */ Function2 f6115b;

            /* renamed from: c */
            public final /* synthetic */ ToastMessage f6116c;

            /* renamed from: d */
            public final /* synthetic */ BaseViewModel f6117d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Function2 function2, ToastMessage toastMessage, BaseViewModel baseViewModel, Continuation continuation) {
                super(2, continuation);
                this.f6115b = function2;
                this.f6116c = toastMessage;
                this.f6117d = baseViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f6115b, this.f6116c, this.f6117d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f6114a;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = this.f6115b;
                    if (function2 != null) {
                        ToastMessage toastMessage = this.f6116c;
                        this.f6114a = 1;
                        if (function2.invoke(toastMessage, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        this.f6117d.getToastLiveData().setValue(this.f6116c);
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
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60593(Function2 function2, BaseViewModel baseViewModel, Continuation continuation) {
            super(3, continuation);
            this.f6112d = function2;
            this.f6113e = baseViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector) flowCollector, th, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.f6111c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6110b;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC4668s.m2379k("flow.catch--->" + Thread.currentThread().getName());
                Throwable cause = th.getCause();
                if (cause != null) {
                    cause.printStackTrace();
                }
                ToastMessage toastErrorCodeMessage = th instanceof RemoteCodeException ? new ToastErrorCodeMessage(((RemoteCodeException) th).getErrorCodeInfo()) : new ToastErrorMessage(Boxing.boxInt(-1), "未知错误", null, 4, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6112d, toastErrorCodeMessage, this.f6113e, null);
                this.f6111c = SpillingKt.nullOutSpilledVariable(th);
                this.f6109a = SpillingKt.nullOutSpilledVariable(toastErrorCodeMessage);
                this.f6110b = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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
        public final Object invoke2(FlowCollector flowCollector, Throwable th, Continuation continuation) {
            C60593 c60593 = new C60593(this.f6112d, this.f6113e, continuation);
            c60593.f6111c = th;
            return c60593.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelExtKt$flowLaunchWithLoading$1(Flow flow, Function1 function1, BaseViewModel baseViewModel, Function1 function12, Function2 function2, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.f6097b = flow;
        this.f6098c = function1;
        this.f6099d = baseViewModel;
        this.f6100e = function12;
        this.f6101f = function2;
        this.f6102g = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewModelExtKt$flowLaunchWithLoading$1(this.f6097b, this.f6098c, this.f6099d, this.f6100e, this.f6101f, this.f6102g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6096a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowM18689catch = FlowKt.m18689catch(FlowKt.onCompletion(FlowKt.onStart(FlowKt.flowOn(this.f6097b, Dispatchers.getIO()), new C60571(this.f6098c, this.f6099d, null)), new C60582(this.f6100e, this.f6099d, null)), new C60593(this.f6101f, this.f6099d, null));
            final Function2 function2 = this.f6102g;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1.4

                @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$4$1", m7918f = "ViewModelExt.kt", m7919i = {}, m7920l = {110}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
                /* renamed from: com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$4$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f6119a;

                    /* renamed from: b */
                    public final /* synthetic */ Function2 f6120b;

                    /* renamed from: c */
                    public final /* synthetic */ Object f6121c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Function2 function2, Object obj, Continuation continuation) {
                        super(2, continuation);
                        this.f6120b = function2;
                        this.f6121c = obj;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f6120b, this.f6121c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return invoke2(coroutineScope, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i6 = this.f6119a;
                        if (i6 == 0) {
                            ResultKt.throwOnFailure(obj);
                            Function2 function2 = this.f6120b;
                            if (function2 != null) {
                                Object obj2 = this.f6121c;
                                this.f6119a = 1;
                                if (function2.invoke(obj2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(function2, obj2, null), continuation);
                    return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                }
            };
            this.f6096a = 1;
            if (flowM18689catch.collect(flowCollector, this) == coroutine_suspended) {
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
        return ((ViewModelExtKt$flowLaunchWithLoading$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
