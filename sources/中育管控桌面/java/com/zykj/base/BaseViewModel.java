package com.zykj.base;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kunminx.architecture.p031ui.callback.UnPeekLiveData;
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
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

@Keep
@Metadata(m7879d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e¢\u0006\u0002\b\u0013¢\u0006\u0002\u0010\u0014J^\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e¢\u0006\u0002\b\u0013¢\u0006\u0002\u0010\u0017JX\u0010\u0018\u001a\u00020\f2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e¢\u0006\u0002\b\u0013¢\u0006\u0002\u0010\u0014Jc\u0010\u0019\u001a\u0004\u0018\u0001H\u001a\"\u0004\b\u0000\u0010\u001a2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e¢\u0006\u0002\b\u0013H\u0086@¢\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u001f"}, m7880d2 = {"Lcom/zykj/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "isDialogVisible", "Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;", "", "()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;", "toastLiveData", "Lcom/zykj/base/bean/toast/ToastMessage;", "getToastLiveData", "launch", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchAsync", "Lkotlinx/coroutines/Deferred;", "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "launchData", "launchAsyncData", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlerThrowable", "e", "", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseViewModel extends ViewModel {
    private final UnPeekLiveData<Boolean> isDialogVisible = new UnPeekLiveData<>();
    private final UnPeekLiveData<ToastMessage> toastLiveData = new UnPeekLiveData<>();

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launch$1", m7918f = "BaseViewModel.kt", m7919i = {3}, m7920l = {47, 51, 59, 55, 59, 59}, m7921m = "invokeSuspend", m7922n = {"e"}, m7923s = {"L$0"})
    /* renamed from: com.zykj.base.BaseViewModel$launch$1 */
    public static final class C59881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f5563a;

        /* renamed from: b */
        public int f5564b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f5565c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f5566d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f5567e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f5568f;

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launch$1$1", m7918f = "BaseViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5569a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f5570b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f5570b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f5570b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5569a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f5570b;
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

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launch$1$2", m7918f = "BaseViewModel.kt", m7919i = {0}, m7920l = {52}, m7921m = "invokeSuspend", m7922n = {"$this$withContext"}, m7923s = {"L$0"})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5571a;

            /* renamed from: b */
            public /* synthetic */ Object f5572b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f5573c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f5573c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f5573c, continuation);
                anonymousClass2.f5572b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f5572b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f5571a;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = this.f5573c;
                    this.f5572b = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.f5571a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launch$1$3", m7918f = "BaseViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5574a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f5575b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f5576c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f5577d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f5575b = baseViewModel;
                this.f5576c = th;
                this.f5577d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f5575b, this.f5576c, this.f5577d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5574a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f5575b.handlerThrowable(this.f5576c, this.f5577d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launch$1$4", m7918f = "BaseViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5578a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f5579b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f5579b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f5579b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5578a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f5579b;
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
        public C59881(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f5565c = unPeekLiveData;
            this.f5566d = function2;
            this.f5567e = baseViewModel;
            this.f5568f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C59881(this.f5565c, this.f5566d, this.f5567e, this.f5568f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) != r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
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
                int r1 = r6.f5564b
                r2 = 0
                switch(r1) {
                    case 0: goto L36;
                    case 1: goto L32;
                    case 2: goto L2c;
                    case 3: goto L27;
                    case 4: goto L1b;
                    case 5: goto L27;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L12:
                java.lang.Object r0 = r6.f5563a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lc8
            L1b:
                java.lang.Object r1 = r6.f5563a
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L24
                goto L96
            L24:
                r7 = move-exception
                goto Lb0
            L27:
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lad
            L2c:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L30
                goto L64
            L30:
                r7 = move-exception
                goto L79
            L32:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L4f
            L36:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$1 r1 = new com.zykj.base.BaseViewModel$launch$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f5565c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f5564b = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L4f
                goto Lc6
            L4f:
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L30
                com.zykj.base.BaseViewModel$launch$1$2 r1 = new com.zykj.base.BaseViewModel$launch$1$2     // Catch: java.lang.Throwable -> L30
                kotlin.jvm.functions.Function2 r3 = r6.f5566d     // Catch: java.lang.Throwable -> L30
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L30
                r3 = 2
                r6.f5564b = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)     // Catch: java.lang.Throwable -> L30
                if (r7 != r0) goto L64
                goto Lc6
            L64:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f5565c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f5564b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            L79:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel$launch$1$3 r3 = new com.zykj.base.BaseViewModel$launch$1$3     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel r4 = r6.f5567e     // Catch: java.lang.Throwable -> L24
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f5568f     // Catch: java.lang.Throwable -> L24
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)     // Catch: java.lang.Throwable -> L24
                r6.f5563a = r7     // Catch: java.lang.Throwable -> L24
                r7 = 4
                r6.f5564b = r7     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L24
                if (r7 != r0) goto L96
                goto Lc6
            L96:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f5565c
                r1.<init>(r3, r2)
                r6.f5563a = r2
                r2 = 5
                r6.f5564b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            Lad:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            Lb0:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launch$1$4 r3 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f5565c
                r3.<init>(r4, r2)
                r6.f5563a = r7
                r2 = 6
                r6.f5564b = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lc7
            Lc6:
                return r0
            Lc7:
                r0 = r7
            Lc8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C59881.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/base/BaseViewModel$launch$1.smali:164
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C59881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launchAsync$1", m7918f = "BaseViewModel.kt", m7919i = {3}, m7920l = {70, 74, 82, 78, 82, 82}, m7921m = "invokeSuspend", m7922n = {"e"}, m7923s = {"L$0"})
    /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1 */
    public static final class C59891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f5580a;

        /* renamed from: b */
        public int f5581b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f5582c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f5583d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f5584e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f5585f;

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launchAsync$1$1", m7918f = "BaseViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5586a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f5587b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f5587b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f5587b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5586a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f5587b;
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

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launchAsync$1$2", m7918f = "BaseViewModel.kt", m7919i = {0}, m7920l = {75}, m7921m = "invokeSuspend", m7922n = {"$this$withContext"}, m7923s = {"L$0"})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5588a;

            /* renamed from: b */
            public /* synthetic */ Object f5589b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f5590c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f5590c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f5590c, continuation);
                anonymousClass2.f5589b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f5589b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f5588a;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = this.f5590c;
                    this.f5589b = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.f5588a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launchAsync$1$3", m7918f = "BaseViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5591a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f5592b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f5593c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f5594d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f5592b = baseViewModel;
                this.f5593c = th;
                this.f5594d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f5592b, this.f5593c, this.f5594d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5591a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f5592b.handlerThrowable(this.f5593c, this.f5594d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launchAsync$1$4", m7918f = "BaseViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5595a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f5596b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, Continuation continuation) {
                super(2, continuation);
                this.f5596b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f5596b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5595a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnPeekLiveData unPeekLiveData = this.f5596b;
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
        public C59891(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f5582c = unPeekLiveData;
            this.f5583d = function2;
            this.f5584e = baseViewModel;
            this.f5585f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C59891(this.f5582c, this.f5583d, this.f5584e, this.f5585f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) != r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
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
                int r1 = r6.f5581b
                r2 = 0
                switch(r1) {
                    case 0: goto L36;
                    case 1: goto L32;
                    case 2: goto L2c;
                    case 3: goto L27;
                    case 4: goto L1b;
                    case 5: goto L27;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L12:
                java.lang.Object r0 = r6.f5580a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lc8
            L1b:
                java.lang.Object r1 = r6.f5580a
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L24
                goto L96
            L24:
                r7 = move-exception
                goto Lb0
            L27:
                kotlin.ResultKt.throwOnFailure(r7)
                goto Lad
            L2c:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L30
                goto L64
            L30:
                r7 = move-exception
                goto L79
            L32:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L4f
            L36:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$1 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f5582c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f5581b = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L4f
                goto Lc6
            L4f:
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L30
                com.zykj.base.BaseViewModel$launchAsync$1$2 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$2     // Catch: java.lang.Throwable -> L30
                kotlin.jvm.functions.Function2 r3 = r6.f5583d     // Catch: java.lang.Throwable -> L30
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L30
                r3 = 2
                r6.f5581b = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)     // Catch: java.lang.Throwable -> L30
                if (r7 != r0) goto L64
                goto Lc6
            L64:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f5582c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f5581b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            L79:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel$launchAsync$1$3 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$3     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel r4 = r6.f5584e     // Catch: java.lang.Throwable -> L24
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f5585f     // Catch: java.lang.Throwable -> L24
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)     // Catch: java.lang.Throwable -> L24
                r6.f5580a = r7     // Catch: java.lang.Throwable -> L24
                r7 = 4
                r6.f5581b = r7     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)     // Catch: java.lang.Throwable -> L24
                if (r7 != r0) goto L96
                goto Lc6
            L96:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f5582c
                r1.<init>(r3, r2)
                r6.f5580a = r2
                r2 = 5
                r6.f5581b = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            Lad:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            Lb0:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f5582c
                r3.<init>(r4, r2)
                r6.f5580a = r7
                r2 = 6
                r6.f5581b = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r1 != r0) goto Lc7
            Lc6:
                return r0
            Lc7:
                r0 = r7
            Lc8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C59891.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/base/BaseViewModel$launchAsync$1.smali:164
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C59891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel", m7918f = "BaseViewModel.kt", m7919i = {0, 0, 0, 0}, m7920l = {125}, m7921m = "launchAsyncData", m7922n = {"toastLiveData", "isDialogVisible", "block", "async"}, m7923s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.zykj.base.BaseViewModel$launchAsyncData$1 */
    public static final class C59901<T> extends ContinuationImpl {

        /* renamed from: a */
        public Object f5597a;

        /* renamed from: b */
        public Object f5598b;

        /* renamed from: c */
        public Object f5599c;

        /* renamed from: d */
        public Object f5600d;

        /* renamed from: e */
        public /* synthetic */ Object f5601e;

        /* renamed from: g */
        public int f5603g;

        public C59901(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5601e = obj;
            this.f5603g |= Integer.MIN_VALUE;
            return BaseViewModel.this.launchAsyncData(null, null, null, this);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launchData$1", m7918f = "BaseViewModel.kt", m7919i = {0}, m7920l = {100}, m7921m = "invokeSuspend", m7922n = {"$this$launch"}, m7923s = {"L$0"})
    /* renamed from: com.zykj.base.BaseViewModel$launchData$1 */
    public static final class C59911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f5607a;

        /* renamed from: b */
        public /* synthetic */ Object f5608b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f5609c;

        /* renamed from: d */
        public final /* synthetic */ Function2 f5610d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f5611e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f5612f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59911(UnPeekLiveData unPeekLiveData, Function2 function2, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, Continuation continuation) {
            super(2, continuation);
            this.f5609c = unPeekLiveData;
            this.f5610d = function2;
            this.f5611e = baseViewModel;
            this.f5612f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C59911 c59911 = new C59911(this.f5609c, this.f5610d, this.f5611e, this.f5612f, continuation);
            c59911.f5608b = obj;
            return c59911;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnPeekLiveData unPeekLiveData;
            UnPeekLiveData unPeekLiveData2;
            CoroutineScope coroutineScope = (CoroutineScope) this.f5608b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f5607a;
            try {
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UnPeekLiveData unPeekLiveData3 = this.f5609c;
                    if (unPeekLiveData3 != null) {
                        unPeekLiveData3.setValue(Boxing.boxBoolean(true));
                    }
                    Function2 function2 = this.f5610d;
                    this.f5608b = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.f5607a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                try {
                    this.f5611e.handlerThrowable(th, this.f5612f);
                    unPeekLiveData2 = this.f5609c;
                    if (unPeekLiveData2 != null) {
                    }
                } finally {
                    unPeekLiveData = this.f5609c;
                    if (unPeekLiveData != null) {
                        unPeekLiveData.setValue(Boxing.boxBoolean(false));
                    }
                }
            }
            if (unPeekLiveData != null) {
                unPeekLiveData2.setValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C59911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handlerThrowable$default(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlerThrowable");
        }
        if ((i6 & 2) != 0) {
            unPeekLiveData = null;
        }
        baseViewModel.handlerThrowable(th, unPeekLiveData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job launch$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i6 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i6 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launch(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Deferred launchAsync$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsync");
        }
        if ((i6 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i6 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsync(unPeekLiveData, unPeekLiveData2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchAsyncData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, Continuation continuation, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsyncData");
        }
        if ((i6 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i6 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsyncData(unPeekLiveData, unPeekLiveData2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job launchData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, Function2 function2, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchData");
        }
        if ((i6 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i6 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchData(unPeekLiveData, unPeekLiveData2, function2);
    }

    public final UnPeekLiveData<ToastMessage> getToastLiveData() {
        return this.toastLiveData;
    }

    public final void handlerThrowable(Throwable e6, UnPeekLiveData<ToastMessage> toastLiveData) {
        Intrinsics.checkNotNullParameter(e6, "e");
        if (e6 instanceof CancellationException) {
            return;
        }
        RemoteCodeException remoteCodeExceptionHandleException = ExceptionHandle.INSTANCE.handleException(e6);
        if (toastLiveData != null) {
            toastLiveData.setValue(new ToastErrorCodeMessage(remoteCodeExceptionHandleException.getErrorCodeInfo()));
        }
    }

    public final UnPeekLiveData<Boolean> isDialogVisible() {
        return this.isDialogVisible;
    }

    public final Job launch(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C59881(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    public final Deferred<Unit> launchAsync(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new C59891(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object launchAsyncData(com.kunminx.architecture.p031ui.callback.UnPeekLiveData<com.zykj.base.bean.toast.ToastMessage> r15, com.kunminx.architecture.p031ui.callback.UnPeekLiveData<java.lang.Boolean> r16, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r17, kotlin.coroutines.Continuation<? super T> r18) {
        /*
            r14 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof com.zykj.base.BaseViewModel.C59901
            if (r2 == 0) goto L17
            r2 = r0
            com.zykj.base.BaseViewModel$launchAsyncData$1 r2 = (com.zykj.base.BaseViewModel.C59901) r2
            int r3 = r2.f5603g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f5603g = r3
            goto L1c
        L17:
            com.zykj.base.BaseViewModel$launchAsyncData$1 r2 = new com.zykj.base.BaseViewModel$launchAsyncData$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f5601e
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f5603g
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L4a
            if (r4 != r7) goto L42
            java.lang.Object r1 = r2.f5600d
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            java.lang.Object r1 = r2.f5599c
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.lang.Object r1 = r2.f5598b
            com.kunminx.architecture.ui.callback.UnPeekLiveData r1 = (com.kunminx.architecture.p031ui.callback.UnPeekLiveData) r1
            java.lang.Object r2 = r2.f5597a
            com.kunminx.architecture.ui.callback.UnPeekLiveData r2 = (com.kunminx.architecture.p031ui.callback.UnPeekLiveData) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3f
            goto L83
        L3f:
            r0 = move-exception
            r8 = r2
            goto L91
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4a:
            kotlin.ResultKt.throwOnFailure(r0)
            if (r1 == 0) goto L56
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            r1.setValue(r0)
        L56:
            kotlinx.coroutines.CoroutineScope r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r14)     // Catch: java.lang.Throwable -> L8f
            com.zykj.base.BaseViewModel$launchAsyncData$async$1 r11 = new com.zykj.base.BaseViewModel$launchAsyncData$async$1     // Catch: java.lang.Throwable -> L8f
            r0 = r17
            r11.<init>(r0, r5)     // Catch: java.lang.Throwable -> L8f
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            kotlinx.coroutines.Deferred r4 = kotlinx.coroutines.BuildersKt.async$default(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8f
            r8 = r15
            r2.f5597a = r8     // Catch: java.lang.Throwable -> L8d
            r2.f5598b = r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L8d
            r2.f5599c = r0     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Throwable -> L8d
            r2.f5600d = r0     // Catch: java.lang.Throwable -> L8d
            r2.f5603g = r7     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r4.await(r2)     // Catch: java.lang.Throwable -> L8d
            if (r0 != r3) goto L83
            return r3
        L83:
            if (r1 == 0) goto L8c
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r1.setValue(r2)
        L8c:
            return r0
        L8d:
            r0 = move-exception
            goto L91
        L8f:
            r0 = move-exception
            r8 = r15
        L91:
            r14.handlerThrowable(r0, r8)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L9d
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r1.setValue(r0)
        L9d:
            return r5
        L9e:
            r0 = move-exception
            if (r1 == 0) goto La8
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r1.setValue(r2)
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.launchAsyncData(com.kunminx.architecture.ui.callback.UnPeekLiveData, com.kunminx.architecture.ui.callback.UnPeekLiveData, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/base/BaseViewModel.smali:720
    }

    public final Job launchData(UnPeekLiveData<ToastMessage> toastLiveData, UnPeekLiveData<Boolean> isDialogVisible, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C59911(isDialogVisible, block, this, toastLiveData, null), 3, null);
    }
}
