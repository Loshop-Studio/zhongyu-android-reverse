package com.zykj.study.p065ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeAuthFail$1", m17801f = "MainActivity.kt", m17802l = {115}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MainActivity$observeAuthFail$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11611a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f11612b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeAuthFail$1$1", m17801f = "MainActivity.kt", m17802l = {116}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.MainActivity$observeAuthFail$1$1 */
    public static final class C77571 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11613a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f11614b;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeAuthFail$1$1$1", m17801f = "MainActivity.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.MainActivity$observeAuthFail$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11615a;

            /* renamed from: b */
            public /* synthetic */ Object f11616b;

            /* renamed from: c */
            public final /* synthetic */ MainActivity f11617c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11617c = mainActivity;
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ErrorCode errorCode, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(errorCode, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11617c, interfaceC9324c);
                anonymousClass1.f11616b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ErrorCode errorCode = (ErrorCode) this.f11616b;
                AbstractC9434a.m17291f();
                if (this.f11615a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                if (errorCode == ErrorCode.NET_TOKEN_ERROR) {
                    this.f11617c.m10435H().m9293a();
                    this.f11617c.m10452F().show();
                }
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77571(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11614b = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77571(this.f11614b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77571) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11613a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9270g interfaceC9270gM10453G = this.f11614b.m10453G();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11614b, null);
                this.f11613a = 1;
                if (AbstractC9268e.m17019i(interfaceC9270gM10453G, anonymousClass1, this) == objM17291f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$observeAuthFail$1(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11612b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MainActivity$observeAuthFail$1(this.f11612b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MainActivity$observeAuthFail$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11611a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MainActivity mainActivity = this.f11612b;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C77571 c77571 = new C77571(mainActivity, null);
            this.f11611a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(mainActivity, state, c77571, this) == objM17291f) {
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
