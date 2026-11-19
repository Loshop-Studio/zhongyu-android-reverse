package com.zykj.study.p065ui.home.find;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.study.R$string;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1", m17801f = "MicroCodeFragment.kt", m17802l = {283, 284, 292}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroCodeFragment$attachmentToServer$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12618a;

    /* renamed from: b */
    public final /* synthetic */ MicroCodeFragment f12619b;

    /* renamed from: c */
    public final /* synthetic */ String f12620c;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$1", m17801f = "MicroCodeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$1 */
    public static final class C79401 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12621a;

        /* renamed from: b */
        public final /* synthetic */ MicroCodeFragment f12622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C79401(MicroCodeFragment microCodeFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12622b = microCodeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C79401(this.f12622b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79401) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12621a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f12622b.getString(R$string.upload_micro_attachment_success);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            BoardBox.clearLocalData$default(BoardBox.INSTANCE, this.f12622b.m11087t().m11103b(), null, 2, null);
            FragmentKt.findNavController(this.f12622b).navigateUp();
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$2", m17801f = "MicroCodeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$2 */
    public static final class C79412 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12623a;

        /* renamed from: b */
        public final /* synthetic */ MicroCodeFragment f12624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C79412(MicroCodeFragment microCodeFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12624b = microCodeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C79412(this.f12624b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79412) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12623a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f12624b.getString(R$string.upload_micro_attachment_fail);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroCodeFragment$attachmentToServer$1(MicroCodeFragment microCodeFragment, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12619b = microCodeFragment;
        this.f12620c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MicroCodeFragment$attachmentToServer$1(this.f12619b, this.f12620c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroCodeFragment$attachmentToServer$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r7, r2, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r7, r3, r6) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.f12618a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L73
        L1e:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L40
        L22:
            kotlin.AbstractC9079b.m15926b(r7)
            com.zykj.study.ui.home.find.MicroCodeFragment r7 = r6.f12619b
            com.zykj.study.viewmodels.MicroCodeViewModel r7 = com.zykj.study.p065ui.home.find.MicroCodeFragment.m11074n(r7)
            com.zykj.study.ui.home.find.MicroCodeFragment r1 = r6.f12619b
            com.zykj.study.ui.home.find.MicroCodeFragmentArgs r1 = com.zykj.study.p065ui.home.find.MicroCodeFragment.m11073m(r1)
            java.lang.String r1 = r1.m11102a()
            java.lang.String r5 = r6.f12620c
            r6.f12618a = r4
            java.lang.Object r7 = r7.m12197b(r1, r5, r6)
            if (r7 != r0) goto L40
            goto L72
        L40:
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r4)
            boolean r7 = kotlin.jvm.internal.AbstractC9133u.m16128b(r7, r1)
            r1 = 0
            if (r7 == 0) goto L5f
            i8.h1 r7 = p135i8.C8843i0.m14868c()
            com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$1 r2 = new com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$1
            com.zykj.study.ui.home.find.MicroCodeFragment r4 = r6.f12619b
            r2.<init>(r4, r1)
            r6.f12618a = r3
            java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r2, r6)
            if (r7 != r0) goto L73
            goto L72
        L5f:
            i8.h1 r7 = p135i8.C8843i0.m14868c()
            com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$2 r3 = new com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1$2
            com.zykj.study.ui.home.find.MicroCodeFragment r4 = r6.f12619b
            r3.<init>(r4, r1)
            r6.f12618a = r2
            java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r3, r6)
            if (r7 != r0) goto L73
        L72:
            return r0
        L73:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.MicroCodeFragment$attachmentToServer$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1.smali:130
    }
}
