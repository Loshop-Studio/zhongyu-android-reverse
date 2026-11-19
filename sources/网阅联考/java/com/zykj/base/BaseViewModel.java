package com.zykj.base;

import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kunminx.architecture.p039ui.callback.UnPeekLiveData;
import com.p040uc.crashsdk.export.ExitType;
import com.tencent.mars.xlog.Log;
import com.umeng.umcrash.UMCrash;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.utils.ExceptionHandle;
import com.zykj.http.exception.RemoteCodeException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Keep
@Metadata(m5174d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004J[\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016Ja\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0019Jf\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\u0004\b\u0000\u0010\u001b2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ[\u0010\u001d\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J^\u0010\u001e\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ^\u0010\u001f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m5175d2 = {"Lcom/zykj/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "isDialogVisible", "Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;", "", "()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;", "toastLiveData", "Lcom/zykj/base/bean/toast/ToastMessage;", "getToastLiveData", "handlerThrowable", "", "e", "", "launch", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchAsync", "Lkotlinx/coroutines/Deferred;", "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "launchAsyncData", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchData", "launchIO", "launchMain", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class BaseViewModel extends ViewModel {
    private final UnPeekLiveData<Boolean> isDialogVisible = new UnPeekLiveData<>();
    private final UnPeekLiveData<ToastMessage> toastLiveData = new UnPeekLiveData<>();

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
    @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launch$1", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {31, 35, 43, 39, 43, 43}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launch$1 */
    public static final class C36451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f4011a;

        /* renamed from: b */
        public int f4012b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f4013c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f4014d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f4015e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f4016f;

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launch$1$1", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4017a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f4018b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4018b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f4018b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4017a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f4018b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launch$1$2", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {36}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4019a;

            /* renamed from: b */
            public /* synthetic */ Object f4020b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f4021c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f4021c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4021c, continuation);
                anonymousClass2.f4020b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.f4019a;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f4020b;
                    Function2 function2 = this.f4021c;
                    this.f4019a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launch$1$3", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4022a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f4023b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f4024c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f4025d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4023b = baseViewModel;
                this.f4024c = th;
                this.f4025d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f4023b, this.f4024c, this.f4025d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4022a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f4023b.handlerThrowable(this.f4024c, this.f4025d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launch$1$4", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4026a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f4027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4027b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f4027b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4026a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f4027b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36451(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f4013c = unPeekLiveData;
            this.f4014d = function2;
            this.f4015e = baseViewModel;
            this.f4016f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C36451(this.f4013c, this.f4014d, this.f4015e, this.f4016f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f4012b
                r2 = 0
                switch(r1) {
                    case 0: goto L31;
                    case 1: goto L2d;
                    case 2: goto L27;
                    case 3: goto L22;
                    case 4: goto L1b;
                    case 5: goto L22;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L12:
                java.lang.Object r0 = r6.f4011a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lba
            L1b:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L1f
                goto L8a
            L1f:
                r7 = move-exception
                goto La2
            L22:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L9f
            L27:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2b
                goto L5e
            L2b:
                r7 = move-exception
                goto L73
            L2d:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L49
            L31:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$1 r1 = new com.zykj.base.BaseViewModel$launch$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4013c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f4012b = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L49
                return r0
            L49:
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L2b
                com.zykj.base.BaseViewModel$launch$1$2 r1 = new com.zykj.base.BaseViewModel$launch$1$2     // Catch: java.lang.Throwable -> L2b
                kotlin.jvm.functions.Function2 r3 = r6.f4014d     // Catch: java.lang.Throwable -> L2b
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2b
                r3 = 2
                r6.f4012b = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)     // Catch: java.lang.Throwable -> L2b
                if (r7 != r0) goto L5e
                return r0
            L5e:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4013c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f4012b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L9f
                return r0
            L73:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L1f
                com.zykj.base.BaseViewModel$launch$1$3 r3 = new com.zykj.base.BaseViewModel$launch$1$3     // Catch: java.lang.Throwable -> L1f
                com.zykj.base.BaseViewModel r4 = r6.f4015e     // Catch: java.lang.Throwable -> L1f
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f4016f     // Catch: java.lang.Throwable -> L1f
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L1f
                r7 = 4
                r6.f4012b = r7     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L1f
                if (r7 != r0) goto L8a
                return r0
            L8a:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4013c
                r1.<init>(r3, r2)
                r2 = 5
                r6.f4012b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L9f
                return r0
            L9f:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            La2:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r3 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f4013c
                r3.<init>(r4, r2)
                r6.f4011a = r7
                r2 = 6
                r6.f4012b = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lb9
                return r0
            Lb9:
                r0 = r7
            Lba:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C36451.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/网阅联考/smali_classes2/com/zykj/base/BaseViewModel$launch$1.smali:159
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C36451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
    @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchAsync$1", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {54, 58, 66, 62, 66, 66}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1 */
    public static final class C36461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f4028a;

        /* renamed from: b */
        public int f4029b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f4030c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f4031d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f4032e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f4033f;

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchAsync$1$1", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4034a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f4035b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4035b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f4035b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4034a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f4035b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchAsync$1$2", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {59}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4036a;

            /* renamed from: b */
            public /* synthetic */ Object f4037b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f4038c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f4038c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4038c, continuation);
                anonymousClass2.f4037b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.f4036a;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f4037b;
                    Function2 function2 = this.f4038c;
                    this.f4036a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchAsync$1$3", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4039a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f4040b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f4041c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f4042d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4040b = baseViewModel;
                this.f4041c = th;
                this.f4042d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f4040b, this.f4041c, this.f4042d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4039a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f4040b.handlerThrowable(this.f4041c, this.f4042d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchAsync$1$4", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4043a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f4044b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4044b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f4044b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4043a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f4044b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36461(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f4030c = unPeekLiveData;
            this.f4031d = function2;
            this.f4032e = baseViewModel;
            this.f4033f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C36461(this.f4030c, this.f4031d, this.f4032e, this.f4033f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f4029b
                r2 = 0
                switch(r1) {
                    case 0: goto L31;
                    case 1: goto L2d;
                    case 2: goto L27;
                    case 3: goto L22;
                    case 4: goto L1b;
                    case 5: goto L22;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L12:
                java.lang.Object r0 = r6.f4028a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lba
            L1b:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L1f
                goto L8a
            L1f:
                r7 = move-exception
                goto La2
            L22:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L9f
            L27:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2b
                goto L5e
            L2b:
                r7 = move-exception
                goto L73
            L2d:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L49
            L31:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$1 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4030c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f4029b = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L49
                return r0
            L49:
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L2b
                com.zykj.base.BaseViewModel$launchAsync$1$2 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$2     // Catch: java.lang.Throwable -> L2b
                kotlin.jvm.functions.Function2 r3 = r6.f4031d     // Catch: java.lang.Throwable -> L2b
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2b
                r3 = 2
                r6.f4029b = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)     // Catch: java.lang.Throwable -> L2b
                if (r7 != r0) goto L5e
                return r0
            L5e:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4030c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f4029b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L9f
                return r0
            L73:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L1f
                com.zykj.base.BaseViewModel$launchAsync$1$3 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$3     // Catch: java.lang.Throwable -> L1f
                com.zykj.base.BaseViewModel r4 = r6.f4032e     // Catch: java.lang.Throwable -> L1f
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f4033f     // Catch: java.lang.Throwable -> L1f
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L1f
                r7 = 4
                r6.f4029b = r7     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L1f
                if (r7 != r0) goto L8a
                return r0
            L8a:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4030c
                r1.<init>(r3, r2)
                r2 = 5
                r6.f4029b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L9f
                return r0
            L9f:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            La2:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f4030c
                r3.<init>(r4, r2)
                r6.f4028a = r7
                r2 = 6
                r6.f4029b = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lb9
                return r0
            Lb9:
                r0 = r7
            Lba:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C36461.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/网阅联考/smali_classes2/com/zykj/base/BaseViewModel$launchAsync$1.smali:159
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C36461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel", m5192f = "BaseViewModel.kt", m5193i = {0, 0, 0}, m5194l = {162}, m5195m = "launchAsyncData", m5196n = {"this", "toastLiveData", "isDialogVisible"}, m5197s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.zykj.base.BaseViewModel$launchAsyncData$1 */
    public static final class C36471<T> extends ContinuationImpl {

        /* renamed from: a */
        public Object f4045a;

        /* renamed from: b */
        public Object f4046b;

        /* renamed from: c */
        public Object f4047c;

        /* renamed from: d */
        public /* synthetic */ Object f4048d;

        /* renamed from: f */
        public int f4050f;

        public C36471(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4048d = obj;
            this.f4050f |= Integer.MIN_VALUE;
            return BaseViewModel.this.launchAsyncData(null, null, null, this);
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
    @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchData$1", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {137}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launchData$1 */
    public static final class C36481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f4054a;

        /* renamed from: b */
        public /* synthetic */ Object f4055b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f4056c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f4057d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f4058e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f4059f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36481(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f4056c = unPeekLiveData;
            this.f4057d = function2;
            this.f4058e = baseViewModel;
            this.f4059f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C36481 c36481 = new C36481(this.f4056c, this.f4057d, this.f4058e, this.f4059f, continuation);
            c36481.f4055b = obj;
            return c36481;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnPeekLiveData unPeekLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f4054a;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f4055b;
                    UnPeekLiveData unPeekLiveData2 = this.f4056c;
                    if (unPeekLiveData2 != null) {
                        unPeekLiveData2.setValue(Boxing.boxBoolean(true));
                    }
                    Function2 function2 = this.f4057d;
                    this.f4054a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                unPeekLiveData = this.f4056c;
            } catch (Throwable th) {
                try {
                    this.f4058e.handlerThrowable(th, this.f4059f);
                } finally {
                    UnPeekLiveData unPeekLiveData3 = this.f4056c;
                    if (unPeekLiveData3 != null) {
                        unPeekLiveData3.setValue(Boxing.boxBoolean(false));
                    }
                }
            }
            if (unPeekLiveData != null) {
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C36481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
    @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchIO$2", m5192f = "BaseViewModel.kt", m5193i = {0}, m5194l = {ExitType.UNEXP_BACKGROUND_CRASH, 102, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 104, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m5195m = "invokeSuspend", m5196n = {"$this$withContext"}, m5197s = {"L$0"})
    /* renamed from: com.zykj.base.BaseViewModel$launchIO$2 */
    public static final class C36492 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f4060a;

        /* renamed from: b */
        public /* synthetic */ Object f4061b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f4062c;

        /* renamed from: d */
        public final /* synthetic */ UnPeekLiveData f4063d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f4064e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f4065f;

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchIO$2$1", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchIO$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4066a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f4067b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4067b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f4067b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4066a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f4067b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchIO$2$2", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchIO$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4068a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f4069b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f4070c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f4071d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4069b = baseViewModel;
                this.f4070c = th;
                this.f4071d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f4069b, this.f4070c, this.f4071d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4068a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f4069b.handlerThrowable(this.f4070c, this.f4071d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
        @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchIO$2$3", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchIO$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f4072a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f4073b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f4073b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f4073b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4072a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f4073b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36492(Function2 function2, UnPeekLiveData unPeekLiveData, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f4062c = function2;
            this.f4063d = unPeekLiveData;
            this.f4064e = baseViewModel;
            this.f4065f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C36492 c36492 = new C36492(this.f4062c, this.f4063d, this.f4064e, this.f4065f, continuation);
            c36492.f4061b = obj;
            return c36492;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f4060a
                r2 = 0
                switch(r1) {
                    case 0: goto L36;
                    case 1: goto L2e;
                    case 2: goto L28;
                    case 3: goto L23;
                    case 4: goto L1b;
                    case 5: goto L23;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L12:
                java.lang.Object r0 = r6.f4061b
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lc1
            L1b:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L20
                goto L91
            L20:
                r7 = move-exception
                goto La9
            L23:
                kotlin.ResultKt.throwOnFailure(r7)
                goto La6
            L28:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2c
                goto L63
            L2c:
                r7 = move-exception
                goto L78
            L2e:
                java.lang.Object r1 = r6.f4061b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r7)
                goto L55
            L36:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.f4061b
                r1 = r7
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$1 r3 = new com.zykj.base.BaseViewModel$launchIO$2$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f4063d
                r3.<init>(r4, r2)
                r6.f4061b = r1
                r4 = 1
                r6.f4060a = r4
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r3, r6)
                if (r7 != r0) goto L55
                return r0
            L55:
                kotlin.jvm.functions.Function2 r7 = r6.f4062c     // Catch: java.lang.Throwable -> L2c
                r6.f4061b = r2     // Catch: java.lang.Throwable -> L2c
                r3 = 2
                r6.f4060a = r3     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r7 = r7.invoke(r1, r6)     // Catch: java.lang.Throwable -> L2c
                if (r7 != r0) goto L63
                return r0
            L63:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$3 r1 = new com.zykj.base.BaseViewModel$launchIO$2$3
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4063d
                r1.<init>(r3, r2)
                r2 = 3
                r6.f4060a = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La6
                return r0
            L78:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel$launchIO$2$2 r3 = new com.zykj.base.BaseViewModel$launchIO$2$2     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel r4 = r6.f4064e     // Catch: java.lang.Throwable -> L20
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f4065f     // Catch: java.lang.Throwable -> L20
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L20
                r6.f4061b = r2     // Catch: java.lang.Throwable -> L20
                r7 = 4
                r6.f4060a = r7     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L20
                if (r7 != r0) goto L91
                return r0
            L91:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$3 r1 = new com.zykj.base.BaseViewModel$launchIO$2$3
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f4063d
                r1.<init>(r3, r2)
                r2 = 5
                r6.f4060a = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La6
                return r0
            La6:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            La9:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$3 r3 = new com.zykj.base.BaseViewModel$launchIO$2$3
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f4063d
                r3.<init>(r4, r2)
                r6.f4061b = r7
                r2 = 6
                r6.f4060a = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lc0
                return r0
            Lc0:
                r0 = r7
            Lc1:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C36492.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/网阅联考/smali_classes2/com/zykj/base/BaseViewModel$launchIO$2.smali:167
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C36492) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
    @DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchMain$2", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {82}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launchMain$2 */
    public static final class C36502 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f4074a;

        /* renamed from: b */
        public /* synthetic */ Object f4075b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f4076c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f4077d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f4078e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f4079f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36502(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f4076c = unPeekLiveData;
            this.f4077d = function2;
            this.f4078e = baseViewModel;
            this.f4079f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C36502 c36502 = new C36502(this.f4076c, this.f4077d, this.f4078e, this.f4079f, continuation);
            c36502.f4075b = obj;
            return c36502;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnPeekLiveData unPeekLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f4074a;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f4075b;
                    UnPeekLiveData unPeekLiveData2 = this.f4076c;
                    if (unPeekLiveData2 != null) {
                        unPeekLiveData2.setValue(Boxing.boxBoolean(true));
                    }
                    Function2 function2 = this.f4077d;
                    this.f4074a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                unPeekLiveData = this.f4076c;
            } catch (Throwable th) {
                try {
                    this.f4078e.handlerThrowable(th, this.f4079f);
                } finally {
                    UnPeekLiveData unPeekLiveData3 = this.f4076c;
                    if (unPeekLiveData3 != null) {
                        unPeekLiveData3.setValue(Boxing.boxBoolean(false));
                    }
                }
            }
            if (unPeekLiveData != null) {
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C36502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handlerThrowable$default(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlerThrowable");
        }
        if ((i4 & 2) != 0) {
            unPeekLiveData = null;
        }
        baseViewModel.handlerThrowable(th, unPeekLiveData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job launch$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i4 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i4 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launch(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Deferred launchAsync$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsync");
        }
        if ((i4 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i4 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsync(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchAsyncData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsyncData");
        }
        if ((i4 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i4 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsyncData(unPeekLiveData, unPeekLiveData2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job launchData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchData");
        }
        if ((i4 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i4 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchData(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchIO$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchIO");
        }
        if ((i4 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i4 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchIO(unPeekLiveData, unPeekLiveData2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchMain$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchMain");
        }
        if ((i4 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i4 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchMain(unPeekLiveData, unPeekLiveData2, function2, continuation);
    }

    public final UnPeekLiveData<ToastMessage> getToastLiveData() {
        return this.toastLiveData;
    }

    public final void handlerThrowable(Throwable e4, UnPeekLiveData<ToastMessage> toastLiveData) {
        Intrinsics.checkNotNullParameter(e4, "e");
        String simpleName = getClass().getSimpleName();
        if (simpleName.length() > 20) {
            simpleName = simpleName.substring(0, 20);
            Intrinsics.checkNotNullExpressionValue(simpleName, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        Log.m2266e(simpleName, String.valueOf(e4));
        if (e4 instanceof CancellationException) {
            return;
        }
        RemoteCodeException remoteCodeExceptionHandleException = ExceptionHandle.INSTANCE.handleException(e4);
        UMCrash.generateCustomLog(e4, "view_model");
        if (toastLiveData == null) {
            return;
        }
        toastLiveData.setValue(new ToastErrorCodeMessage(remoteCodeExceptionHandleException.getErrorCodeInfo()));
    }

    public final UnPeekLiveData<Boolean> isDialogVisible() {
        return this.isDialogVisible;
    }

    public final Job launch(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36451(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    public final Deferred<Unit> launchAsync(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new C36461(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object launchAsyncData(com.kunminx.architecture.p039ui.callback.UnPeekLiveData<com.zykj.base.bean.toast.ToastMessage> r16, com.kunminx.architecture.p039ui.callback.UnPeekLiveData<java.lang.Boolean> r17, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r18, kotlin.coroutines.Continuation<? super T> r19) {
        /*
            r15 = this;
            r1 = r15
            r2 = r17
            r0 = r19
            boolean r3 = r0 instanceof com.zykj.base.BaseViewModel.C36471
            if (r3 == 0) goto L18
            r3 = r0
            com.zykj.base.BaseViewModel$launchAsyncData$1 r3 = (com.zykj.base.BaseViewModel.C36471) r3
            int r4 = r3.f4050f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f4050f = r4
            goto L1d
        L18:
            com.zykj.base.BaseViewModel$launchAsyncData$1 r3 = new com.zykj.base.BaseViewModel$launchAsyncData$1
            r3.<init>(r0)
        L1d:
            java.lang.Object r0 = r3.f4048d
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.f4050f
            r6 = 0
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L47
            if (r5 != r8) goto L3f
            java.lang.Object r2 = r3.f4047c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r2 = (com.kunminx.architecture.p039ui.callback.UnPeekLiveData) r2
            java.lang.Object r4 = r3.f4046b
            com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = (com.kunminx.architecture.p039ui.callback.UnPeekLiveData) r4
            java.lang.Object r3 = r3.f4045a
            com.zykj.base.BaseViewModel r3 = (com.zykj.base.BaseViewModel) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3c
            goto L78
        L3c:
            r0 = move-exception
            r5 = r4
            goto L8a
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L47:
            kotlin.ResultKt.throwOnFailure(r0)
            if (r2 != 0) goto L4d
            goto L54
        L4d:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            r2.setValue(r0)
        L54:
            kotlinx.coroutines.CoroutineScope r9 = androidx.lifecycle.ViewModelKt.getViewModelScope(r15)     // Catch: java.lang.Throwable -> L86
            r10 = 0
            r11 = 0
            com.zykj.base.BaseViewModel$launchAsyncData$async$1 r12 = new com.zykj.base.BaseViewModel$launchAsyncData$async$1     // Catch: java.lang.Throwable -> L86
            r0 = r18
            r12.<init>(r0, r6)     // Catch: java.lang.Throwable -> L86
            r13 = 3
            r14 = 0
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async$default(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L86
            r3.f4045a = r1     // Catch: java.lang.Throwable -> L86
            r5 = r16
            r3.f4046b = r5     // Catch: java.lang.Throwable -> L84
            r3.f4047c = r2     // Catch: java.lang.Throwable -> L84
            r3.f4050f = r8     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.await(r3)     // Catch: java.lang.Throwable -> L84
            if (r0 != r4) goto L78
            return r4
        L78:
            if (r2 != 0) goto L7b
            goto L82
        L7b:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            r2.setValue(r3)
        L82:
            r6 = r0
            goto L97
        L84:
            r0 = move-exception
            goto L89
        L86:
            r0 = move-exception
            r5 = r16
        L89:
            r3 = r1
        L8a:
            r3.handlerThrowable(r0, r5)     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L90
            goto L97
        L90:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            r2.setValue(r0)
        L97:
            return r6
        L98:
            r0 = move-exception
            r3 = r0
            if (r2 != 0) goto L9d
            goto La4
        L9d:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            r2.setValue(r0)
        La4:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.launchAsyncData(com.kunminx.architecture.ui.callback.UnPeekLiveData, com.kunminx.architecture.ui.callback.UnPeekLiveData, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/网阅联考/smali_classes2/com/zykj/base/BaseViewModel.smali:926
    }

    public final Job launchData(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36481(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    public final Object launchIO(UnPeekLiveData<ToastMessage> unPeekLiveData, UnPeekLiveData<Boolean> unPeekLiveData2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C36492(function2, unPeekLiveData2, this, unPeekLiveData, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final Object launchMain(UnPeekLiveData<ToastMessage> unPeekLiveData, UnPeekLiveData<Boolean> unPeekLiveData2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C36502(unPeekLiveData2, function2, this, unPeekLiveData, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
