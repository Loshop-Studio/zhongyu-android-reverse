package com.zykj.base;

import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kunminx.architecture.p058ui.callback.UnPeekLiveData;
import com.p071uc.crashsdk.export.ExitType;
import com.taobao.sophix.PatchStatus;
import com.tencent.mars.xlog.Log;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.utils.ExceptionHandle;
import com.zykj.http.exception.RemoteCodeException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import p021b3.AbstractC5107a;

@Keep
@Metadata(m13412d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004J[\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016Ja\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0019Jf\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\u0004\b\u0000\u0010\u001b2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ[\u0010\u001d\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J^\u0010\u001e\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ^\u0010\u001f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0002\b\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m13413d2 = {"Lcom/zykj/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "isDialogVisible", "Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;", "", "()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;", "toastLiveData", "Lcom/zykj/base/bean/toast/ToastMessage;", "getToastLiveData", "handlerThrowable", "", "e", "", "launch", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchAsync", "Lkotlinx/coroutines/Deferred;", "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "launchAsyncData", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchData", "launchIO", "launchMain", "base_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseViewModel extends ViewModel {
    private final UnPeekLiveData<Boolean> isDialogVisible = new UnPeekLiveData<>();
    private final UnPeekLiveData<ToastMessage> toastLiveData = new UnPeekLiveData<>();

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launch$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {31, 35, 43, 39, 43, 43}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launch$1 */
    public static final class C69261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f8082a;

        /* renamed from: b */
        public int f8083b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f8084c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f8085d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8086e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8087f;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launch$1$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8088a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8089b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8089b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f8089b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8088a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f8089b;
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

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launch$1$2", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {36}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8090a;

            /* renamed from: b */
            public /* synthetic */ Object f8091b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f8092c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f8092c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f8092c, continuation);
                anonymousClass2.f8091b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f8090a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f8091b;
                    Function2 function2 = this.f8092c;
                    this.f8090a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launch$1$3", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8093a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f8094b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f8095c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f8096d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8094b = baseViewModel;
                this.f8095c = th;
                this.f8096d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f8094b, this.f8095c, this.f8096d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8093a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f8094b.handlerThrowable(this.f8095c, this.f8096d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launch$1$4", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8097a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8098b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8098b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f8098b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8097a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f8098b;
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
        public C69261(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f8084c = unPeekLiveData;
            this.f8085d = function2;
            this.f8086e = baseViewModel;
            this.f8087f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69261(this.f8084c, this.f8085d, this.f8086e, this.f8087f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation] */
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
                int r1 = r6.f8083b
                r2 = 0
                switch(r1) {
                    case 0: goto L32;
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
                java.lang.Object r0 = r6.f8082a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lbb
            L1b:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L20
                goto L8b
            L20:
                r7 = move-exception
                goto La3
            L23:
                kotlin.ResultKt.throwOnFailure(r7)
                goto La0
            L28:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2c
                goto L5f
            L2c:
                r7 = move-exception
                goto L74
            L2e:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L4a
            L32:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$1 r1 = new com.zykj.base.BaseViewModel$launch$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8084c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f8083b = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L4a
                goto Lb9
            L4a:
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L2c
                com.zykj.base.BaseViewModel$launch$1$2 r1 = new com.zykj.base.BaseViewModel$launch$1$2     // Catch: java.lang.Throwable -> L2c
                kotlin.jvm.functions.Function2 r3 = r6.f8085d     // Catch: java.lang.Throwable -> L2c
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2c
                r3 = 2
                r6.f8083b = r3     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)     // Catch: java.lang.Throwable -> L2c
                if (r7 != r0) goto L5f
                goto Lb9
            L5f:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8084c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f8083b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La0
                goto Lb9
            L74:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel$launch$1$3 r3 = new com.zykj.base.BaseViewModel$launch$1$3     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel r4 = r6.f8086e     // Catch: java.lang.Throwable -> L20
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f8087f     // Catch: java.lang.Throwable -> L20
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L20
                r7 = 4
                r6.f8083b = r7     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L20
                if (r7 != r0) goto L8b
                goto Lb9
            L8b:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8084c
                r1.<init>(r3, r2)
                r2 = 5
                r6.f8083b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La0
                goto Lb9
            La0:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            La3:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r3 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f8084c
                r3.<init>(r4, r2)
                r6.f8082a = r7
                r2 = 6
                r6.f8083b = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lba
            Lb9:
                return r0
            Lba:
                r0 = r7
            Lbb:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C69261.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/base/BaseViewModel$launch$1.smali:158
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchAsync$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE, 58, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 62, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1 */
    public static final class C69271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f8099a;

        /* renamed from: b */
        public int f8100b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f8101c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f8102d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8103e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8104f;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchAsync$1$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8105a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8106b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8106b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f8106b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8105a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f8106b;
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

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchAsync$1$2", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {59}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8107a;

            /* renamed from: b */
            public /* synthetic */ Object f8108b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f8109c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f8109c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f8109c, continuation);
                anonymousClass2.f8108b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f8107a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f8108b;
                    Function2 function2 = this.f8109c;
                    this.f8107a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchAsync$1$3", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8110a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f8111b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f8112c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f8113d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8111b = baseViewModel;
                this.f8112c = th;
                this.f8113d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f8111b, this.f8112c, this.f8113d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8110a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f8111b.handlerThrowable(this.f8112c, this.f8113d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchAsync$1$4", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8114a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8115b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8115b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f8115b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8114a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f8115b;
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
        public C69271(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f8101c = unPeekLiveData;
            this.f8102d = function2;
            this.f8103e = baseViewModel;
            this.f8104f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69271(this.f8101c, this.f8102d, this.f8103e, this.f8104f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation] */
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
                int r1 = r6.f8100b
                r2 = 0
                switch(r1) {
                    case 0: goto L32;
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
                java.lang.Object r0 = r6.f8099a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lbb
            L1b:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L20
                goto L8b
            L20:
                r7 = move-exception
                goto La3
            L23:
                kotlin.ResultKt.throwOnFailure(r7)
                goto La0
            L28:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2c
                goto L5f
            L2c:
                r7 = move-exception
                goto L74
            L2e:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L4a
            L32:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$1 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8101c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f8100b = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L4a
                goto Lb9
            L4a:
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L2c
                com.zykj.base.BaseViewModel$launchAsync$1$2 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$2     // Catch: java.lang.Throwable -> L2c
                kotlin.jvm.functions.Function2 r3 = r6.f8102d     // Catch: java.lang.Throwable -> L2c
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2c
                r3 = 2
                r6.f8100b = r3     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)     // Catch: java.lang.Throwable -> L2c
                if (r7 != r0) goto L5f
                goto Lb9
            L5f:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8101c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f8100b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La0
                goto Lb9
            L74:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel$launchAsync$1$3 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$3     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel r4 = r6.f8103e     // Catch: java.lang.Throwable -> L20
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f8104f     // Catch: java.lang.Throwable -> L20
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L20
                r7 = 4
                r6.f8100b = r7     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L20
                if (r7 != r0) goto L8b
                goto Lb9
            L8b:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8101c
                r1.<init>(r3, r2)
                r2 = 5
                r6.f8100b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La0
                goto Lb9
            La0:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            La3:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f8101c
                r3.<init>(r4, r2)
                r6.f8099a = r7
                r2 = 6
                r6.f8100b = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lba
            Lb9:
                return r0
            Lba:
                r0 = r7
            Lbb:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C69271.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/base/BaseViewModel$launchAsync$1.smali:158
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel", m13451f = "BaseViewModel.kt", m13452i = {0, 0, 0}, m13453l = {162}, m13454m = "launchAsyncData", m13455n = {"this", "toastLiveData", "isDialogVisible"}, m13456s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.zykj.base.BaseViewModel$launchAsyncData$1 */
    public static final class C69281<T> extends ContinuationImpl {

        /* renamed from: a */
        public Object f8116a;

        /* renamed from: b */
        public Object f8117b;

        /* renamed from: c */
        public Object f8118c;

        /* renamed from: d */
        public /* synthetic */ Object f8119d;

        /* renamed from: f */
        public int f8121f;

        public C69281(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8119d = obj;
            this.f8121f |= Integer.MIN_VALUE;
            return BaseViewModel.this.launchAsyncData(null, null, null, this);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchData$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_LIB_NS}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launchData$1 */
    public static final class C69291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8125a;

        /* renamed from: b */
        public /* synthetic */ Object f8126b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f8127c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f8128d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8129e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8130f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69291(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f8127c = unPeekLiveData;
            this.f8128d = function2;
            this.f8129e = baseViewModel;
            this.f8130f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C69291 c69291 = new C69291(this.f8127c, this.f8128d, this.f8129e, this.f8130f, continuation);
            c69291.f8126b = obj;
            return c69291;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnPeekLiveData unPeekLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f8125a;
            try {
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f8126b;
                    UnPeekLiveData unPeekLiveData2 = this.f8127c;
                    if (unPeekLiveData2 != null) {
                        unPeekLiveData2.setValue(Boxing.boxBoolean(true));
                    }
                    Function2 function2 = this.f8128d;
                    this.f8125a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                unPeekLiveData = this.f8127c;
            } catch (Throwable th) {
                try {
                    this.f8129e.handlerThrowable(th, this.f8130f);
                } finally {
                    UnPeekLiveData unPeekLiveData3 = this.f8127c;
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
            return ((C69291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchIO$2", m13451f = "BaseViewModel.kt", m13452i = {0}, m13453l = {ExitType.UNEXP_BACKGROUND_CRASH, 102, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 104, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m13454m = "invokeSuspend", m13455n = {"$this$withContext"}, m13456s = {"L$0"})
    /* renamed from: com.zykj.base.BaseViewModel$launchIO$2 */
    public static final class C69302 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8131a;

        /* renamed from: b */
        public /* synthetic */ Object f8132b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f8133c;

        /* renamed from: d */
        public final /* synthetic */ UnPeekLiveData f8134d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8135e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8136f;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchIO$2$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchIO$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8137a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8138b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8138b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f8138b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8137a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f8138b;
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

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchIO$2$2", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchIO$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8139a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f8140b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f8141c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f8142d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8140b = baseViewModel;
                this.f8141c = th;
                this.f8142d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f8140b, this.f8141c, this.f8142d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8139a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f8140b.handlerThrowable(this.f8141c, this.f8142d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchIO$2$3", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchIO$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f8143a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8144b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f8144b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f8144b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8143a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f8144b;
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
        public C69302(Function2 function2, UnPeekLiveData unPeekLiveData, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f8133c = function2;
            this.f8134d = unPeekLiveData;
            this.f8135e = baseViewModel;
            this.f8136f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C69302 c69302 = new C69302(this.f8133c, this.f8134d, this.f8135e, this.f8136f, continuation);
            c69302.f8132b = obj;
            return c69302;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
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
                int r1 = r6.f8131a
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
                java.lang.Object r0 = r6.f8132b
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
                java.lang.Object r1 = r6.f8132b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r7)
                goto L55
            L36:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.f8132b
                r1 = r7
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$1 r3 = new com.zykj.base.BaseViewModel$launchIO$2$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f8134d
                r3.<init>(r4, r2)
                r6.f8132b = r1
                r4 = 1
                r6.f8131a = r4
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r3, r6)
                if (r7 != r0) goto L55
                goto Lbf
            L55:
                kotlin.jvm.functions.Function2 r7 = r6.f8133c     // Catch: java.lang.Throwable -> L2c
                r6.f8132b = r2     // Catch: java.lang.Throwable -> L2c
                r3 = 2
                r6.f8131a = r3     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r7 = r7.invoke(r1, r6)     // Catch: java.lang.Throwable -> L2c
                if (r7 != r0) goto L63
                goto Lbf
            L63:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$3 r1 = new com.zykj.base.BaseViewModel$launchIO$2$3
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8134d
                r1.<init>(r3, r2)
                r2 = 3
                r6.f8131a = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La6
                goto Lbf
            L78:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel$launchIO$2$2 r3 = new com.zykj.base.BaseViewModel$launchIO$2$2     // Catch: java.lang.Throwable -> L20
                com.zykj.base.BaseViewModel r4 = r6.f8135e     // Catch: java.lang.Throwable -> L20
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f8136f     // Catch: java.lang.Throwable -> L20
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L20
                r6.f8132b = r2     // Catch: java.lang.Throwable -> L20
                r7 = 4
                r6.f8131a = r7     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L20
                if (r7 != r0) goto L91
                goto Lbf
            L91:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$3 r1 = new com.zykj.base.BaseViewModel$launchIO$2$3
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8134d
                r1.<init>(r3, r2)
                r2 = 5
                r6.f8131a = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto La6
                goto Lbf
            La6:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            La9:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchIO$2$3 r3 = new com.zykj.base.BaseViewModel$launchIO$2$3
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f8134d
                r3.<init>(r4, r2)
                r6.f8132b = r7
                r2 = 6
                r6.f8131a = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lc0
            Lbf:
                return r0
            Lc0:
                r0 = r7
            Lc1:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C69302.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/base/BaseViewModel$launchIO$2.smali:166
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchMain$2", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_FIND_CLASS}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.base.BaseViewModel$launchMain$2 */
    public static final class C69312 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8145a;

        /* renamed from: b */
        public /* synthetic */ Object f8146b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f8147c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f8148d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8149e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8150f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69312(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f8147c = unPeekLiveData;
            this.f8148d = function2;
            this.f8149e = baseViewModel;
            this.f8150f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C69312 c69312 = new C69312(this.f8147c, this.f8148d, this.f8149e, this.f8150f, continuation);
            c69312.f8146b = obj;
            return c69312;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnPeekLiveData unPeekLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f8145a;
            try {
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f8146b;
                    UnPeekLiveData unPeekLiveData2 = this.f8147c;
                    if (unPeekLiveData2 != null) {
                        unPeekLiveData2.setValue(Boxing.boxBoolean(true));
                    }
                    Function2 function2 = this.f8148d;
                    this.f8145a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                unPeekLiveData = this.f8147c;
            } catch (Throwable th) {
                try {
                    this.f8149e.handlerThrowable(th, this.f8150f);
                } finally {
                    UnPeekLiveData unPeekLiveData3 = this.f8147c;
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
            return ((C69312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handlerThrowable$default(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlerThrowable");
        }
        if ((i9 & 2) != 0) {
            unPeekLiveData = null;
        }
        baseViewModel.handlerThrowable(th, unPeekLiveData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job launch$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i9 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i9 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launch(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Deferred launchAsync$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsync");
        }
        if ((i9 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i9 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsync(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchAsyncData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, Continuation continuation, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsyncData");
        }
        if ((i9 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i9 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsyncData(unPeekLiveData, unPeekLiveData2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job launchData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchData");
        }
        if ((i9 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i9 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchData(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchIO$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, Continuation continuation, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchIO");
        }
        if ((i9 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i9 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchIO(unPeekLiveData, unPeekLiveData2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchMain$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, Continuation continuation, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchMain");
        }
        if ((i9 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i9 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchMain(unPeekLiveData, unPeekLiveData2, function2, continuation);
    }

    public final UnPeekLiveData<ToastMessage> getToastLiveData() {
        return this.toastLiveData;
    }

    public final void handlerThrowable(Throwable e10, UnPeekLiveData<ToastMessage> toastLiveData) {
        Intrinsics.checkNotNullParameter(e10, "e");
        String simpleName = getClass().getSimpleName();
        if (simpleName.length() > 20) {
            simpleName = simpleName.substring(0, 20);
            Intrinsics.checkNotNullExpressionValue(simpleName, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        Log.m5510e(simpleName, String.valueOf(e10));
        if (e10 instanceof CancellationException) {
            return;
        }
        RemoteCodeException remoteCodeExceptionHandleException = ExceptionHandle.INSTANCE.handleException(e10);
        AbstractC5107a.m2165a(e10, "view_model");
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
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C69261(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    public final Deferred<Unit> launchAsync(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new C69271(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object launchAsyncData(com.kunminx.architecture.p058ui.callback.UnPeekLiveData<com.zykj.base.bean.toast.ToastMessage> r15, com.kunminx.architecture.p058ui.callback.UnPeekLiveData<java.lang.Boolean> r16, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r17, kotlin.coroutines.Continuation<? super T> r18) {
        /*
            r14 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof com.zykj.base.BaseViewModel.C69281
            if (r2 == 0) goto L17
            r2 = r0
            com.zykj.base.BaseViewModel$launchAsyncData$1 r2 = (com.zykj.base.BaseViewModel.C69281) r2
            int r3 = r2.f8121f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8121f = r3
            goto L1c
        L17:
            com.zykj.base.BaseViewModel$launchAsyncData$1 r2 = new com.zykj.base.BaseViewModel$launchAsyncData$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f8119d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f8121f
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L46
            if (r4 != r7) goto L3e
            java.lang.Object r1 = r2.f8118c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r1 = (com.kunminx.architecture.p058ui.callback.UnPeekLiveData) r1
            java.lang.Object r3 = r2.f8117b
            com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = (com.kunminx.architecture.p058ui.callback.UnPeekLiveData) r3
            java.lang.Object r2 = r2.f8116a
            com.zykj.base.BaseViewModel r2 = (com.zykj.base.BaseViewModel) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3b
            goto L76
        L3b:
            r0 = move-exception
            r4 = r3
            goto L87
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L46:
            kotlin.ResultKt.throwOnFailure(r0)
            if (r1 != 0) goto L4c
            goto L53
        L4c:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            r1.setValue(r0)
        L53:
            kotlinx.coroutines.CoroutineScope r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r14)     // Catch: java.lang.Throwable -> L84
            com.zykj.base.BaseViewModel$launchAsyncData$async$1 r11 = new com.zykj.base.BaseViewModel$launchAsyncData$async$1     // Catch: java.lang.Throwable -> L84
            r0 = r17
            r11.<init>(r0, r5)     // Catch: java.lang.Throwable -> L84
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async$default(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L84
            r2.f8116a = r14     // Catch: java.lang.Throwable -> L84
            r4 = r15
            r2.f8117b = r4     // Catch: java.lang.Throwable -> L81
            r2.f8118c = r1     // Catch: java.lang.Throwable -> L81
            r2.f8121f = r7     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r0.await(r2)     // Catch: java.lang.Throwable -> L81
            if (r0 != r3) goto L76
            return r3
        L76:
            if (r1 != 0) goto L79
            return r0
        L79:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r1.setValue(r2)
            return r0
        L81:
            r0 = move-exception
        L82:
            r2 = r14
            goto L87
        L84:
            r0 = move-exception
            r4 = r15
            goto L82
        L87:
            r2.handlerThrowable(r0, r4)     // Catch: java.lang.Throwable -> L95
            if (r1 != 0) goto L8d
            goto L94
        L8d:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r1.setValue(r0)
        L94:
            return r5
        L95:
            r0 = move-exception
            if (r1 != 0) goto L99
            goto La0
        L99:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r1.setValue(r2)
        La0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.launchAsyncData(com.kunminx.architecture.ui.callback.UnPeekLiveData, com.kunminx.architecture.ui.callback.UnPeekLiveData, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/base/BaseViewModel.smali:925
    }

    public final Job launchData(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C69291(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    public final Object launchIO(UnPeekLiveData<ToastMessage> unPeekLiveData, UnPeekLiveData<Boolean> unPeekLiveData2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C69302(function2, unPeekLiveData2, this, unPeekLiveData, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final Object launchMain(UnPeekLiveData<ToastMessage> unPeekLiveData, UnPeekLiveData<Boolean> unPeekLiveData2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C69312(unPeekLiveData2, function2, this, unPeekLiveData, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
