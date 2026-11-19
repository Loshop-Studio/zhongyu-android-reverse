package com.zykj.base;

import androidx.annotation.Keep;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.utils.ExceptionHandle;
import com.zykj.http.exception.RemoteCodeException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8831e0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public abstract class BaseViewModel extends ViewModel {
    private final UnPeekLiveData<Boolean> isDialogVisible = new UnPeekLiveData<>();
    private final UnPeekLiveData<ToastMessage> toastLiveData = new UnPeekLiveData<>();

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launch$1", m17801f = "BaseViewModel.kt", m17802l = {47, 51, C3721BR.viewModel, 55, C3721BR.viewModel, C3721BR.viewModel}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseViewModel$launch$1 */
    public static final class C70371 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f8614a;

        /* renamed from: b */
        public int f8615b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f8616c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC10574p f8617d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8618e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8619f;

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launch$1$1", m17801f = "BaseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8620a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8621b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8621b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f8621b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f8620a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                UnPeekLiveData unPeekLiveData = this.f8621b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(AbstractC9536a.m17796a(false));
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launch$1$2", m17801f = "BaseViewModel.kt", m17802l = {52}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8622a;

            /* renamed from: b */
            public /* synthetic */ Object f8623b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC10574p f8624c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8624c = interfaceC10574p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f8624c, interfaceC9324c);
                anonymousClass2.f8623b = obj;
                return anonymousClass2;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f8623b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f8622a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC10574p interfaceC10574p = this.f8624c;
                    this.f8623b = AbstractC9543h.m17814a(interfaceC8822b0);
                    this.f8622a = 1;
                    if (interfaceC10574p.invoke(interfaceC8822b0, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launch$1$3", m17801f = "BaseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8625a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f8626b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f8627c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f8628d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8626b = baseViewModel;
                this.f8627c = th;
                this.f8628d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass3(this.f8626b, this.f8627c, this.f8628d, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f8625a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                this.f8626b.handlerThrowable(this.f8627c, this.f8628d);
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launch$1$4", m17801f = "BaseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launch$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8629a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8630b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8630b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass4(this.f8630b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass4) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f8629a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                UnPeekLiveData unPeekLiveData = this.f8630b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(AbstractC9536a.m17796a(false));
                }
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C70371(UnPeekLiveData unPeekLiveData, InterfaceC10574p interfaceC10574p, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f8616c = unPeekLiveData;
            this.f8617d = interfaceC10574p;
            this.f8618e = baseViewModel;
            this.f8619f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C70371(this.f8616c, this.f8617d, this.f8618e, this.f8619f, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70371) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (p135i8.AbstractC8833f.m14848g(r7, r1, r6) != r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        
            if (p135i8.AbstractC8833f.m14848g(r7, r1, r6) == r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [m7.c] */
        /* JADX WARN: Type inference failed for: r2v3, types: [m7.c] */
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r6.f8615b
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
                java.lang.Object r0 = r6.f8614a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.AbstractC9079b.m15926b(r7)
                goto Lc8
            L1b:
                java.lang.Object r1 = r6.f8614a
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L24
                goto L96
            L24:
                r7 = move-exception
                goto Lb0
            L27:
                kotlin.AbstractC9079b.m15926b(r7)
                goto Lad
            L2c:
                kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L30
                goto L64
            L30:
                r7 = move-exception
                goto L79
            L32:
                kotlin.AbstractC9079b.m15926b(r7)
                goto L4f
            L36:
                kotlin.AbstractC9079b.m15926b(r7)
                i8.h1 r7 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launch$1$1 r1 = new com.zykj.base.BaseViewModel$launch$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8616c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f8615b = r3
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)
                if (r7 != r0) goto L4f
                goto Lc6
            L4f:
                kotlinx.coroutines.CoroutineDispatcher r7 = p135i8.C8843i0.m14867b()     // Catch: java.lang.Throwable -> L30
                com.zykj.base.BaseViewModel$launch$1$2 r1 = new com.zykj.base.BaseViewModel$launch$1$2     // Catch: java.lang.Throwable -> L30
                x7.p r3 = r6.f8617d     // Catch: java.lang.Throwable -> L30
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L30
                r3 = 2
                r6.f8615b = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)     // Catch: java.lang.Throwable -> L30
                if (r7 != r0) goto L64
                goto Lc6
            L64:
                i8.h1 r7 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8616c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f8615b = r2
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            L79:
                i8.h1 r1 = p135i8.C8843i0.m14868c()     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel$launch$1$3 r3 = new com.zykj.base.BaseViewModel$launch$1$3     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel r4 = r6.f8618e     // Catch: java.lang.Throwable -> L24
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f8619f     // Catch: java.lang.Throwable -> L24
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)     // Catch: java.lang.Throwable -> L24
                r6.f8614a = r7     // Catch: java.lang.Throwable -> L24
                r7 = 4
                r6.f8615b = r7     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r1, r3, r6)     // Catch: java.lang.Throwable -> L24
                if (r7 != r0) goto L96
                goto Lc6
            L96:
                i8.h1 r7 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launch$1$4 r1 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8616c
                r1.<init>(r3, r2)
                r6.f8614a = r2
                r2 = 5
                r6.f8615b = r2
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            Lad:
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            Lb0:
                i8.h1 r1 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launch$1$4 r3 = new com.zykj.base.BaseViewModel$launch$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f8616c
                r3.<init>(r4, r2)
                r6.f8614a = r7
                r2 = 6
                r6.f8615b = r2
                java.lang.Object r1 = p135i8.AbstractC8833f.m14848g(r1, r3, r6)
                if (r1 != r0) goto Lc7
            Lc6:
                return r0
            Lc7:
                r0 = r7
            Lc8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C70371.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/base/BaseViewModel$launch$1.smali:158
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launchAsync$1", m17801f = "BaseViewModel.kt", m17802l = {70, 74, 82, 78, 82, 82}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1 */
    public static final class C70381 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f8631a;

        /* renamed from: b */
        public int f8632b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f8633c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC10574p f8634d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8635e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8636f;

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launchAsync$1$1", m17801f = "BaseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8637a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8638b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnPeekLiveData unPeekLiveData, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8638b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f8638b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f8637a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                UnPeekLiveData unPeekLiveData = this.f8638b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(AbstractC9536a.m17796a(true));
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launchAsync$1$2", m17801f = "BaseViewModel.kt", m17802l = {75}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8639a;

            /* renamed from: b */
            public /* synthetic */ Object f8640b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC10574p f8641c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8641c = interfaceC10574p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f8641c, interfaceC9324c);
                anonymousClass2.f8640b = obj;
                return anonymousClass2;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f8640b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f8639a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC10574p interfaceC10574p = this.f8641c;
                    this.f8640b = AbstractC9543h.m17814a(interfaceC8822b0);
                    this.f8639a = 1;
                    if (interfaceC10574p.invoke(interfaceC8822b0, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launchAsync$1$3", m17801f = "BaseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8642a;

            /* renamed from: b */
            public final /* synthetic */ BaseViewModel f8643b;

            /* renamed from: c */
            public final /* synthetic */ Throwable f8644c;

            /* renamed from: d */
            public final /* synthetic */ UnPeekLiveData f8645d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8643b = baseViewModel;
                this.f8644c = th;
                this.f8645d = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass3(this.f8643b, this.f8644c, this.f8645d, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f8642a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                this.f8643b.handlerThrowable(this.f8644c, this.f8645d);
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launchAsync$1$4", m17801f = "BaseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.base.BaseViewModel$launchAsync$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f8646a;

            /* renamed from: b */
            public final /* synthetic */ UnPeekLiveData f8647b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnPeekLiveData unPeekLiveData, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f8647b = unPeekLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass4(this.f8647b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass4) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f8646a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                UnPeekLiveData unPeekLiveData = this.f8647b;
                if (unPeekLiveData != null) {
                    unPeekLiveData.setValue(AbstractC9536a.m17796a(false));
                }
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C70381(UnPeekLiveData unPeekLiveData, InterfaceC10574p interfaceC10574p, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f8633c = unPeekLiveData;
            this.f8634d = interfaceC10574p;
            this.f8635e = baseViewModel;
            this.f8636f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C70381(this.f8633c, this.f8634d, this.f8635e, this.f8636f, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70381) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (p135i8.AbstractC8833f.m14848g(r7, r1, r6) != r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        
            if (p135i8.AbstractC8833f.m14848g(r7, r1, r6) == r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [m7.c] */
        /* JADX WARN: Type inference failed for: r2v3, types: [m7.c] */
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r6.f8632b
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
                java.lang.Object r0 = r6.f8631a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.AbstractC9079b.m15926b(r7)
                goto Lc8
            L1b:
                java.lang.Object r1 = r6.f8631a
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L24
                goto L96
            L24:
                r7 = move-exception
                goto Lb0
            L27:
                kotlin.AbstractC9079b.m15926b(r7)
                goto Lad
            L2c:
                kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L30
                goto L64
            L30:
                r7 = move-exception
                goto L79
            L32:
                kotlin.AbstractC9079b.m15926b(r7)
                goto L4f
            L36:
                kotlin.AbstractC9079b.m15926b(r7)
                i8.h1 r7 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launchAsync$1$1 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$1
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8633c
                r1.<init>(r3, r2)
                r3 = 1
                r6.f8632b = r3
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)
                if (r7 != r0) goto L4f
                goto Lc6
            L4f:
                kotlinx.coroutines.CoroutineDispatcher r7 = p135i8.C8843i0.m14867b()     // Catch: java.lang.Throwable -> L30
                com.zykj.base.BaseViewModel$launchAsync$1$2 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$2     // Catch: java.lang.Throwable -> L30
                x7.p r3 = r6.f8634d     // Catch: java.lang.Throwable -> L30
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L30
                r3 = 2
                r6.f8632b = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)     // Catch: java.lang.Throwable -> L30
                if (r7 != r0) goto L64
                goto Lc6
            L64:
                i8.h1 r7 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8633c
                r1.<init>(r3, r2)
                r2 = 3
                r6.f8632b = r2
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            L79:
                i8.h1 r1 = p135i8.C8843i0.m14868c()     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel$launchAsync$1$3 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$3     // Catch: java.lang.Throwable -> L24
                com.zykj.base.BaseViewModel r4 = r6.f8635e     // Catch: java.lang.Throwable -> L24
                com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r6.f8636f     // Catch: java.lang.Throwable -> L24
                r3.<init>(r4, r7, r5, r2)     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)     // Catch: java.lang.Throwable -> L24
                r6.f8631a = r7     // Catch: java.lang.Throwable -> L24
                r7 = 4
                r6.f8632b = r7     // Catch: java.lang.Throwable -> L24
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r1, r3, r6)     // Catch: java.lang.Throwable -> L24
                if (r7 != r0) goto L96
                goto Lc6
            L96:
                i8.h1 r7 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r1 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r6.f8633c
                r1.<init>(r3, r2)
                r6.f8631a = r2
                r2 = 5
                r6.f8632b = r2
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)
                if (r7 != r0) goto Lad
                goto Lc6
            Lad:
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            Lb0:
                i8.h1 r1 = p135i8.C8843i0.m14868c()
                com.zykj.base.BaseViewModel$launchAsync$1$4 r3 = new com.zykj.base.BaseViewModel$launchAsync$1$4
                com.kunminx.architecture.ui.callback.UnPeekLiveData r4 = r6.f8633c
                r3.<init>(r4, r2)
                r6.f8631a = r7
                r2 = 6
                r6.f8632b = r2
                java.lang.Object r1 = p135i8.AbstractC8833f.m14848g(r1, r3, r6)
                if (r1 != r0) goto Lc7
            Lc6:
                return r0
            Lc7:
                r0 = r7
            Lc8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.C70381.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/base/BaseViewModel$launchAsync$1.smali:158
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel", m17801f = "BaseViewModel.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_THROWABLE}, m17803m = "launchAsyncData")
    /* renamed from: com.zykj.base.BaseViewModel$launchAsyncData$1 */
    public static final class C70391<T> extends ContinuationImpl {

        /* renamed from: a */
        public Object f8648a;

        /* renamed from: b */
        public Object f8649b;

        /* renamed from: c */
        public Object f8650c;

        /* renamed from: d */
        public Object f8651d;

        /* renamed from: e */
        public /* synthetic */ Object f8652e;

        /* renamed from: g */
        public int f8654g;

        public C70391(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8652e = obj;
            this.f8654g |= Integer.MIN_VALUE;
            return BaseViewModel.this.launchAsyncData(null, null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseViewModel$launchData$1", m17801f = "BaseViewModel.kt", m17802l = {100}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseViewModel$launchData$1 */
    public static final class C70401 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f8658a;

        /* renamed from: b */
        public /* synthetic */ Object f8659b;

        /* renamed from: c */
        public final /* synthetic */ UnPeekLiveData f8660c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC10574p f8661d;

        /* renamed from: e */
        public final /* synthetic */ BaseViewModel f8662e;

        /* renamed from: f */
        public final /* synthetic */ UnPeekLiveData f8663f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C70401(UnPeekLiveData unPeekLiveData, InterfaceC10574p interfaceC10574p, BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData2, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f8660c = unPeekLiveData;
            this.f8661d = interfaceC10574p;
            this.f8662e = baseViewModel;
            this.f8663f = unPeekLiveData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C70401 c70401 = new C70401(this.f8660c, this.f8661d, this.f8662e, this.f8663f, interfaceC9324c);
            c70401.f8659b = obj;
            return c70401;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70401) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            UnPeekLiveData unPeekLiveData;
            UnPeekLiveData unPeekLiveData2;
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f8659b;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f8658a;
            try {
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    UnPeekLiveData unPeekLiveData3 = this.f8660c;
                    if (unPeekLiveData3 != null) {
                        unPeekLiveData3.setValue(AbstractC9536a.m17796a(true));
                    }
                    InterfaceC10574p interfaceC10574p = this.f8661d;
                    this.f8659b = AbstractC9543h.m17814a(interfaceC8822b0);
                    this.f8658a = 1;
                    if (interfaceC10574p.invoke(interfaceC8822b0, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
            } catch (Throwable th) {
                try {
                    this.f8662e.handlerThrowable(th, this.f8663f);
                    unPeekLiveData2 = this.f8660c;
                    if (unPeekLiveData2 != null) {
                    }
                } finally {
                    unPeekLiveData = this.f8660c;
                    if (unPeekLiveData != null) {
                        unPeekLiveData.setValue(AbstractC9536a.m17796a(false));
                    }
                }
            }
            if (unPeekLiveData != null) {
                unPeekLiveData2.setValue(AbstractC9536a.m17796a(false));
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handlerThrowable$default(BaseViewModel baseViewModel, Throwable th, UnPeekLiveData unPeekLiveData, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlerThrowable");
        }
        if ((i10 & 2) != 0) {
            unPeekLiveData = null;
        }
        baseViewModel.handlerThrowable(th, unPeekLiveData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC9212n launch$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i10 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i10 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launch(unPeekLiveData, unPeekLiveData2, interfaceC10574p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC8831e0 launchAsync$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsync");
        }
        if ((i10 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i10 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsync(unPeekLiveData, unPeekLiveData2, interfaceC10574p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object launchAsyncData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsyncData");
        }
        if ((i10 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i10 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchAsyncData(unPeekLiveData, unPeekLiveData2, interfaceC10574p, interfaceC9324c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC9212n launchData$default(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchData");
        }
        if ((i10 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i10 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return baseViewModel.launchData(unPeekLiveData, unPeekLiveData2, interfaceC10574p);
    }

    public final UnPeekLiveData<ToastMessage> getToastLiveData() {
        return this.toastLiveData;
    }

    public final void handlerThrowable(Throwable e10, UnPeekLiveData<ToastMessage> unPeekLiveData) {
        AbstractC9133u.m16133g(e10, "e");
        if (e10 instanceof CancellationException) {
            return;
        }
        RemoteCodeException remoteCodeExceptionHandleException = ExceptionHandle.INSTANCE.handleException(e10);
        if (unPeekLiveData != null) {
            unPeekLiveData.setValue(new ToastErrorCodeMessage(remoteCodeExceptionHandleException.getErrorCodeInfo()));
        }
    }

    public final UnPeekLiveData<Boolean> isDialogVisible() {
        return this.isDialogVisible;
    }

    public final InterfaceC9212n launch(UnPeekLiveData<ToastMessage> unPeekLiveData, UnPeekLiveData<Boolean> unPeekLiveData2, InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new C70371(unPeekLiveData2, block, this, unPeekLiveData, null), 3, null);
    }

    public final InterfaceC8831e0 launchAsync(UnPeekLiveData<ToastMessage> unPeekLiveData, UnPeekLiveData<Boolean> unPeekLiveData2, InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return AbstractC8839h.m14859b(ViewModelKt.getViewModelScope(this), null, null, new C70381(unPeekLiveData2, block, this, unPeekLiveData, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object launchAsyncData(com.kunminx.architecture.p043ui.callback.UnPeekLiveData<com.zykj.base.bean.toast.ToastMessage> r15, com.kunminx.architecture.p043ui.callback.UnPeekLiveData<java.lang.Boolean> r16, p300x7.InterfaceC10574p r17, p179m7.InterfaceC9324c<? super T> r18) throws java.lang.Throwable {
        /*
            r14 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof com.zykj.base.BaseViewModel.C70391
            if (r2 == 0) goto L17
            r2 = r0
            com.zykj.base.BaseViewModel$launchAsyncData$1 r2 = (com.zykj.base.BaseViewModel.C70391) r2
            int r3 = r2.f8654g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8654g = r3
            goto L1c
        L17:
            com.zykj.base.BaseViewModel$launchAsyncData$1 r2 = new com.zykj.base.BaseViewModel$launchAsyncData$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f8652e
            java.lang.Object r3 = p190n7.AbstractC9434a.m17291f()
            int r4 = r2.f8654g
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L4a
            if (r4 != r7) goto L42
            java.lang.Object r1 = r2.f8651d
            i8.e0 r1 = (p135i8.InterfaceC8831e0) r1
            java.lang.Object r1 = r2.f8650c
            x7.p r1 = (p300x7.InterfaceC10574p) r1
            java.lang.Object r1 = r2.f8649b
            com.kunminx.architecture.ui.callback.UnPeekLiveData r1 = (com.kunminx.architecture.p043ui.callback.UnPeekLiveData) r1
            java.lang.Object r2 = r2.f8648a
            com.kunminx.architecture.ui.callback.UnPeekLiveData r2 = (com.kunminx.architecture.p043ui.callback.UnPeekLiveData) r2
            kotlin.AbstractC9079b.m15926b(r0)     // Catch: java.lang.Throwable -> L3f
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
            kotlin.AbstractC9079b.m15926b(r0)
            if (r1 == 0) goto L56
            java.lang.Boolean r0 = p201o7.AbstractC9536a.m17796a(r7)
            r1.setValue(r0)
        L56:
            i8.b0 r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r14)     // Catch: java.lang.Throwable -> L8f
            com.zykj.base.BaseViewModel$launchAsyncData$async$1 r11 = new com.zykj.base.BaseViewModel$launchAsyncData$async$1     // Catch: java.lang.Throwable -> L8f
            r0 = r17
            r11.<init>(r0, r5)     // Catch: java.lang.Throwable -> L8f
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            i8.e0 r4 = p135i8.AbstractC8833f.m14843b(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8f
            r8 = r15
            r2.f8648a = r8     // Catch: java.lang.Throwable -> L8d
            r2.f8649b = r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = p201o7.AbstractC9543h.m17814a(r0)     // Catch: java.lang.Throwable -> L8d
            r2.f8650c = r0     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = p201o7.AbstractC9543h.m17814a(r4)     // Catch: java.lang.Throwable -> L8d
            r2.f8651d = r0     // Catch: java.lang.Throwable -> L8d
            r2.f8654g = r7     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r4.mo14833u(r2)     // Catch: java.lang.Throwable -> L8d
            if (r0 != r3) goto L83
            return r3
        L83:
            if (r1 == 0) goto L8c
            java.lang.Boolean r2 = p201o7.AbstractC9536a.m17796a(r6)
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
            java.lang.Boolean r0 = p201o7.AbstractC9536a.m17796a(r6)
            r1.setValue(r0)
        L9d:
            return r5
        L9e:
            r0 = move-exception
            if (r1 == 0) goto La8
            java.lang.Boolean r2 = p201o7.AbstractC9536a.m17796a(r6)
            r1.setValue(r2)
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseViewModel.launchAsyncData(com.kunminx.architecture.ui.callback.UnPeekLiveData, com.kunminx.architecture.ui.callback.UnPeekLiveData, x7.p, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/base/BaseViewModel.smali:655
    }

    public final InterfaceC9212n launchData(UnPeekLiveData<ToastMessage> unPeekLiveData, UnPeekLiveData<Boolean> unPeekLiveData2, InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new C70401(unPeekLiveData2, block, this, unPeekLiveData, null), 3, null);
    }
}
