package com.zykj.study.p065ui;

import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.work.WorkInfo;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$2", m17801f = "OpenFileFragment.kt", m17802l = {147}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class OpenFileFragment$downloadFile$2$1$1$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11665a;

    /* renamed from: b */
    public final /* synthetic */ OpenFileFragment f11666b;

    /* renamed from: c */
    public final /* synthetic */ String f11667c;

    /* renamed from: d */
    public final /* synthetic */ WorkInfo f11668d;

    /* renamed from: e */
    public final /* synthetic */ DialogInterface f11669e;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$2$1", m17801f = "OpenFileFragment.kt", m17802l = {148}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$2$1 */
    public static final class C77661 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11670a;

        /* renamed from: b */
        public final /* synthetic */ String f11671b;

        /* renamed from: c */
        public final /* synthetic */ OpenFileFragment f11672c;

        /* renamed from: d */
        public final /* synthetic */ WorkInfo f11673d;

        /* renamed from: e */
        public final /* synthetic */ DialogInterface f11674e;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$2$1$1", m17801f = "OpenFileFragment.kt", m17802l = {152, 181, 184, 187}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public Object f11675a;

            /* renamed from: b */
            public Object f11676b;

            /* renamed from: c */
            public Object f11677c;

            /* renamed from: d */
            public Object f11678d;

            /* renamed from: e */
            public Object f11679e;

            /* renamed from: f */
            public Object f11680f;

            /* renamed from: g */
            public Object f11681g;

            /* renamed from: h */
            public Object f11682h;

            /* renamed from: i */
            public int f11683i;

            /* renamed from: j */
            public int f11684j;

            /* renamed from: k */
            public int f11685k;

            /* renamed from: l */
            public final /* synthetic */ String f11686l;

            /* renamed from: m */
            public final /* synthetic */ OpenFileFragment f11687m;

            /* renamed from: n */
            public final /* synthetic */ WorkInfo f11688n;

            /* renamed from: o */
            public final /* synthetic */ DialogInterface f11689o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, OpenFileFragment openFileFragment, WorkInfo workInfo, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11686l = str;
                this.f11687m = openFileFragment;
                this.f11688n = workInfo;
                this.f11689o = dialogInterface;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f11686l, this.f11687m, this.f11688n, this.f11689o, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:51:0x01ed, code lost:
            
                if (r6 == null) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x021a, code lost:
            
                if (com.zykj.study.p065ui.OpenFileFragment.m10476t(r0, r4, r17) != r2) goto L55;
             */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00eb A[PHI: r9
              0x00eb: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v1 java.lang.String), (r9v11 java.lang.String) binds: [B:19:0x00ba, B:21:0x00c6, B:26:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x01e6  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x01ef A[PHI: r12 r13 r14
              0x01ef: PHI (r12v4 i9.d0) = (r12v1 i9.d0), (r12v1 i9.d0), (r12v5 i9.d0) binds: [B:32:0x014d, B:34:0x0153, B:51:0x01ed] A[DONT_GENERATE, DONT_INLINE]
              0x01ef: PHI (r13v5 i9.a0) = (r13v1 i9.a0), (r13v1 i9.a0), (r13v6 i9.a0) binds: [B:32:0x014d, B:34:0x0153, B:51:0x01ed] A[DONT_GENERATE, DONT_INLINE]
              0x01ef: PHI (r14v3 java.lang.String) = (r14v0 java.lang.String), (r14v0 java.lang.String), (r14v4 java.lang.String) binds: [B:32:0x014d, B:34:0x0153, B:51:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.OpenFileFragment$downloadFile$2$1$1$2.C77661.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1.smali:176
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77661(String str, OpenFileFragment openFileFragment, WorkInfo workInfo, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11671b = str;
            this.f11672c = openFileFragment;
            this.f11673d = workInfo;
            this.f11674e = dialogInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77661(this.f11671b, this.f11672c, this.f11673d, this.f11674e, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77661) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11670a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                CoroutineDispatcher coroutineDispatcherM14867b = C8843i0.m14867b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11671b, this.f11672c, this.f11673d, this.f11674e, null);
                this.f11670a = 1;
                if (AbstractC8833f.m14848g(coroutineDispatcherM14867b, anonymousClass1, this) == objM17291f) {
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
    public OpenFileFragment$downloadFile$2$1$1$2(OpenFileFragment openFileFragment, String str, WorkInfo workInfo, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11666b = openFileFragment;
        this.f11667c = str;
        this.f11668d = workInfo;
        this.f11669e = dialogInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new OpenFileFragment$downloadFile$2$1$1$2(this.f11666b, this.f11667c, this.f11668d, this.f11669e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((OpenFileFragment$downloadFile$2$1$1$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11665a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f11666b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            C77661 c77661 = new C77661(this.f11667c, this.f11666b, this.f11668d, this.f11669e, null);
            this.f11665a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c77661, this) == objM17291f) {
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
