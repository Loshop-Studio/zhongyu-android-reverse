package com.zykj.study.p065ui.home.exercise;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1", m17801f = "MicroEditFragment.kt", m17802l = {357, 358, 370}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroEditFragment$attachmentToServer$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12043a;

    /* renamed from: b */
    public final /* synthetic */ MicroEditFragment f12044b;

    /* renamed from: c */
    public final /* synthetic */ String f12045c;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$1", m17801f = "MicroEditFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$1 */
    public static final class C78301 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12046a;

        /* renamed from: b */
        public final /* synthetic */ MicroEditFragment f12047b;

        /* renamed from: c */
        public final /* synthetic */ String f12048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C78301(MicroEditFragment microEditFragment, String str, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12047b = microEditFragment;
            this.f12048c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C78301(this.f12047b, this.f12048c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78301) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SavedStateHandle savedStateHandle;
            AbstractC9434a.m17291f();
            if (this.f12046a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f12047b.getString(R$string.upload_micro_attachment_success);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            NavBackStackEntry previousBackStackEntry = FragmentKt.findNavController(this.f12047b).getPreviousBackStackEntry();
            if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                savedStateHandle.set("result_zip_url", this.f12048c);
            }
            BoardBox.clearLocalData$default(BoardBox.INSTANCE, this.f12047b.m10764z().m10774b(), null, 2, null);
            FragmentKt.findNavController(this.f12047b).navigateUp();
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$2", m17801f = "MicroEditFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$2 */
    public static final class C78312 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12049a;

        /* renamed from: b */
        public final /* synthetic */ MicroEditFragment f12050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C78312(MicroEditFragment microEditFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12050b = microEditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C78312(this.f12050b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78312) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12049a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f12050b.getString(R$string.upload_micro_attachment_fail);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroEditFragment$attachmentToServer$1(MicroEditFragment microEditFragment, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12044b = microEditFragment;
        this.f12045c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MicroEditFragment$attachmentToServer$1(this.f12044b, this.f12045c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroEditFragment$attachmentToServer$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r8, r2, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r8, r3, r7) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r7.f12043a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.AbstractC9079b.m15926b(r8)
            goto L7f
        L1e:
            kotlin.AbstractC9079b.m15926b(r8)
            goto L4a
        L22:
            kotlin.AbstractC9079b.m15926b(r8)
            com.zykj.study.ui.home.exercise.MicroEditFragment r8 = r7.f12044b
            com.zykj.study.viewmodels.MicroEditViewModel r8 = com.zykj.study.p065ui.home.exercise.MicroEditFragment.m10754w(r8)
            com.zykj.study.ui.home.exercise.MicroEditFragment r1 = r7.f12044b
            com.zykj.study.ui.home.exercise.MicroEditFragmentArgs r1 = com.zykj.study.p065ui.home.exercise.MicroEditFragment.m10752u(r1)
            int r1 = r1.m10773a()
            com.zykj.study.ui.home.exercise.MicroEditFragment r5 = r7.f12044b
            com.zykj.study.ui.home.exercise.MicroEditFragmentArgs r5 = com.zykj.study.p065ui.home.exercise.MicroEditFragment.m10752u(r5)
            java.lang.String r5 = r5.m10775c()
            java.lang.String r6 = r7.f12045c
            r7.f12043a = r4
            java.lang.Object r8 = r8.m12200b(r1, r5, r6, r7)
            if (r8 != r0) goto L4a
            goto L7e
        L4a:
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r4)
            boolean r8 = kotlin.jvm.internal.AbstractC9133u.m16128b(r8, r1)
            r1 = 0
            if (r8 == 0) goto L6b
            i8.h1 r8 = p135i8.C8843i0.m14868c()
            com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$1 r2 = new com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$1
            com.zykj.study.ui.home.exercise.MicroEditFragment r4 = r7.f12044b
            java.lang.String r5 = r7.f12045c
            r2.<init>(r4, r5, r1)
            r7.f12043a = r3
            java.lang.Object r8 = p135i8.AbstractC8833f.m14848g(r8, r2, r7)
            if (r8 != r0) goto L7f
            goto L7e
        L6b:
            i8.h1 r8 = p135i8.C8843i0.m14868c()
            com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$2 r3 = new com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1$2
            com.zykj.study.ui.home.exercise.MicroEditFragment r4 = r7.f12044b
            r3.<init>(r4, r1)
            r7.f12043a = r2
            java.lang.Object r8 = p135i8.AbstractC8833f.m14848g(r8, r3, r7)
            if (r8 != r0) goto L7f
        L7e:
            return r0
        L7f:
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.MicroEditFragment$attachmentToServer$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1.smali:130
    }
}
