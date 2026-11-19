package com.zykj.study.p065ui.home.exercise.train;

import com.zykj.base.utils.XToastUtils;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.study.R$string;
import java.io.File;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8841h1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p256t7.AbstractC10123h;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1", m17801f = "AnswerResultFragment.kt", m17802l = {273, 280, 293}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AnswerResultFragment$attachmentToServer$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12205a;

    /* renamed from: b */
    public final /* synthetic */ AnswerResultFragment f12206b;

    /* renamed from: c */
    public final /* synthetic */ boolean f12207c;

    /* renamed from: d */
    public final /* synthetic */ String f12208d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC10559a f12209e;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$1", m17801f = "AnswerResultFragment.kt", m17802l = {288}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$1 */
    public static final class C78581 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12210a;

        /* renamed from: b */
        public final /* synthetic */ AnswerResultFragment f12211b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10559a f12212c;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$1$2", m17801f = "AnswerResultFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12213a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10559a f12214b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC10559a interfaceC10559a, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f12214b = interfaceC10559a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f12214b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f12213a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                this.f12214b.invoke();
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C78581(AnswerResultFragment answerResultFragment, InterfaceC10559a interfaceC10559a, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12211b = answerResultFragment;
            this.f12212c = interfaceC10559a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C78581(this.f12211b, this.f12212c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78581) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12210a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                String strM12158v = this.f12211b.m10819A().m12158v();
                AnswerResultFragment answerResultFragment = this.f12211b;
                BoardBox.INSTANCE.clearLocalData(strM12158v, answerResultFragment.requireContext());
                AbstractC10123h.m18877d(new File(strM12158v));
                answerResultFragment.m10819A().m12152F();
                AbstractC8841h1 abstractC8841h1M14868c = C8843i0.m14868c();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f12212c, null);
                this.f12210a = 1;
                if (AbstractC8833f.m14848g(abstractC8841h1M14868c, anonymousClass2, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$2", m17801f = "AnswerResultFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$2 */
    public static final class C78592 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12215a;

        /* renamed from: b */
        public final /* synthetic */ AnswerResultFragment f12216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C78592(AnswerResultFragment answerResultFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12216b = answerResultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C78592(this.f12216b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78592) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12215a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f12216b.getString(R$string.upload_answer_micro_fail);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerResultFragment$attachmentToServer$1(AnswerResultFragment answerResultFragment, boolean z10, String str, InterfaceC10559a interfaceC10559a, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12206b = answerResultFragment;
        this.f12207c = z10;
        this.f12208d = str;
        this.f12209e = interfaceC10559a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new AnswerResultFragment$attachmentToServer$1(this.f12206b, this.f12207c, this.f12208d, this.f12209e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AnswerResultFragment$attachmentToServer$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r12, r2, r11) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r12, r3, r11) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r11.f12205a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.AbstractC9079b.m15926b(r12)
            r10 = r11
            goto L86
        L1f:
            kotlin.AbstractC9079b.m15926b(r12)
            r10 = r11
            goto L53
        L24:
            kotlin.AbstractC9079b.m15926b(r12)
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment r12 = r11.f12206b
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel r5 = com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.m10840s(r12)
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment r12 = r11.f12206b
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel r12 = com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.m10840s(r12)
            int r6 = r12.m12022b()
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment r12 = r11.f12206b
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel r12 = com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.m10840s(r12)
            com.zykj.study.bean.exercise.QuestionBean r12 = r12.m12023c()
            java.lang.String r7 = r12.getId()
            boolean r8 = r11.f12207c
            java.lang.String r9 = r11.f12208d
            r11.f12205a = r4
            r10 = r11
            java.lang.Object r12 = r5.m12307k(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L53
            goto L85
        L53:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r1 = 0
            if (r12 == 0) goto L72
            kotlinx.coroutines.CoroutineDispatcher r12 = p135i8.C8843i0.m14867b()
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$1 r2 = new com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$1
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment r4 = r10.f12206b
            x7.a r5 = r10.f12209e
            r2.<init>(r4, r5, r1)
            r10.f12205a = r3
            java.lang.Object r12 = p135i8.AbstractC8833f.m14848g(r12, r2, r11)
            if (r12 != r0) goto L86
            goto L85
        L72:
            i8.h1 r12 = p135i8.C8843i0.m14868c()
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$2 r3 = new com.zykj.study.ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1$2
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment r4 = r10.f12206b
            r3.<init>(r4, r1)
            r10.f12205a = r2
            java.lang.Object r12 = p135i8.AbstractC8833f.m14848g(r12, r3, r11)
            if (r12 != r0) goto L86
        L85:
            return r0
        L86:
            h7.p r12 = p123h7.C8736p.f16368a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment$attachmentToServer$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerResultFragment$attachmentToServer$1.smali:153
    }
}
