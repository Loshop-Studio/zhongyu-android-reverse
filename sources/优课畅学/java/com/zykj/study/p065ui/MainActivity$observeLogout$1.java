package com.zykj.study.p065ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.lib.login.proto.UserBean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeLogout$1", m17801f = "MainActivity.kt", m17802l = {143}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MainActivity$observeLogout$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11625a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f11626b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeLogout$1$1", m17801f = "MainActivity.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.MainActivity$observeLogout$1$1 */
    public static final class C77591 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11627a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f11628b;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeLogout$1$1$1", m17801f = "MainActivity.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.MainActivity$observeLogout$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11629a;

            /* renamed from: b */
            public /* synthetic */ Object f11630b;

            /* renamed from: c */
            public final /* synthetic */ MainActivity f11631c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11631c = mainActivity;
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(UserBean userBean, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(userBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11631c, interfaceC9324c);
                anonymousClass1.f11630b = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r3) throws java.lang.Throwable {
                /*
                    r2 = this;
                    java.lang.Object r0 = r2.f11630b
                    com.zykj.lib.login.proto.UserBean r0 = (com.zykj.lib.login.proto.UserBean) r0
                    p190n7.AbstractC9434a.m17291f()
                    int r1 = r2.f11629a
                    if (r1 != 0) goto L2b
                    kotlin.AbstractC9079b.m15926b(r3)
                    java.lang.String r3 = r0.getId()
                    if (r3 == 0) goto L23
                    java.lang.String r3 = r0.getId()
                    java.lang.String r0 = "getId(...)"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r3, r0)
                    int r3 = r3.length()
                    if (r3 != 0) goto L28
                L23:
                    com.zykj.study.ui.MainActivity r3 = r2.f11631c
                    com.zykj.study.p065ui.MainActivity.m10433A(r3)
                L28:
                    h7.p r3 = p123h7.C8736p.f16368a
                    return r3
                L2b:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r3.<init>(r0)
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.MainActivity$observeLogout$1.C77591.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/MainActivity$observeLogout$1$1$1.smali:133
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77591(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11628b = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77591(this.f11628b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77591) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11627a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c data = this.f11628b.m10435H().m9295c().getData();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11628b, null);
                this.f11627a = 1;
                if (AbstractC9268e.m17019i(data, anonymousClass1, this) == objM17291f) {
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
    public MainActivity$observeLogout$1(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11626b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MainActivity$observeLogout$1(this.f11626b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MainActivity$observeLogout$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11625a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MainActivity mainActivity = this.f11626b;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C77591 c77591 = new C77591(mainActivity, null);
            this.f11625a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(mainActivity, state, c77591, this) == objM17291f) {
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
