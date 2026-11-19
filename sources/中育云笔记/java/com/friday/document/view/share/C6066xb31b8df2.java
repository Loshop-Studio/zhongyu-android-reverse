package com.friday.document.view.share;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {16}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1 */
/* loaded from: classes3.dex */
public final class C6066xb31b8df2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7532c;

    /* renamed from: d */
    public final /* synthetic */ LifecycleOwner f7533d;

    /* renamed from: e */
    public final /* synthetic */ Lifecycle.State f7534e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11594c f7535f;

    /* renamed from: g */
    public final /* synthetic */ ShareBaseFileFragment f7536g;

    @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {17}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7537c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11594c f7538d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseFileFragment f7539e;

        /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a */
        public static final class a implements InterfaceC11595d {

            /* renamed from: c */
            public final /* synthetic */ ShareBaseFileFragment f7540c;

            public a(ShareBaseFileFragment shareBaseFileFragment) {
                this.f7540c = shareBaseFileFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
            @Override // p379vd.InterfaceC11595d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r3, vc.InterfaceC11588c r4) {
                /*
                    r2 = this;
                    com.friday.document.model.ShareFile r3 = (com.friday.document.model.ShareFile) r3
                    if (r3 != 0) goto L11
                    com.friday.document.view.share.ShareBaseFileFragment r3 = r2.f7540c
                    com.friday.document.viewmodel.ShareBaseViewModel r3 = r3.m6025B()
                    r4 = 2
                    r0 = 0
                    com.friday.document.viewmodel.ShareBaseViewModel.m6351H(r3, r0, r0, r4, r0)
                    goto L86
                L11:
                    java.lang.String r4 = r3.getType()
                    int r0 = r4.hashCode()
                    r1 = 48
                    if (r0 == r1) goto L65
                    r1 = 49
                    if (r0 == r1) goto L4c
                    r1 = 54
                    if (r0 == r1) goto L33
                    r1 = 1569(0x621, float:2.199E-42)
                    if (r0 == r1) goto L2a
                    goto L6d
                L2a:
                    java.lang.String r0 = "12"
                    boolean r4 = r4.equals(r0)
                    if (r4 != 0) goto L55
                    goto L6d
                L33:
                    java.lang.String r0 = "6"
                    boolean r4 = r4.equals(r0)
                    if (r4 != 0) goto L3c
                    goto L6d
                L3c:
                    com.friday.document.view.share.ShareBaseFileFragment r4 = r2.f7540c
                    com.friday.document.viewmodel.ShareBaseViewModel r0 = r4.m6025B()
                    com.friday.document.view.share.SuspendCall r0 = r0.m6375r(r3)
                    int r1 = com.friday.document.R$string.disconnected_net_without_text
                    com.friday.document.view.share.ShareBaseFileFragment.m6023y(r4, r3, r0, r1)
                    goto L86
                L4c:
                    java.lang.String r0 = "1"
                    boolean r4 = r4.equals(r0)
                    if (r4 != 0) goto L55
                    goto L6d
                L55:
                    com.friday.document.view.share.ShareBaseFileFragment r4 = r2.f7540c
                    com.friday.document.viewmodel.ShareBaseViewModel r0 = r4.m6025B()
                    com.friday.document.view.share.SuspendCall r0 = r0.m6373p(r3)
                    int r1 = com.friday.document.R$string.dis_net
                    com.friday.document.view.share.ShareBaseFileFragment.m6023y(r4, r3, r0, r1)
                    goto L86
                L65:
                    java.lang.String r0 = "0"
                    boolean r4 = r4.equals(r0)
                    if (r4 != 0) goto L7d
                L6d:
                    com.friday.document.view.share.ShareBaseFileFragment r4 = r2.f7540c
                    com.friday.document.viewmodel.ShareBaseViewModel r0 = r4.m6025B()
                    com.friday.document.view.share.SuspendCall r0 = r0.m6374q(r3)
                    int r1 = com.friday.document.R$string.download_cover_error
                    com.friday.document.view.share.ShareBaseFileFragment.m6023y(r4, r3, r0, r1)
                    goto L86
                L7d:
                    com.friday.document.view.share.ShareBaseFileFragment r3 = r2.f7540c
                    com.friday.document.viewmodel.ShareFileViewModel r3 = r3.mo6028E()
                    r3.m6427v()
                L86:
                    qc.q r3 = p309qc.C10786q.f26013a
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.share.C6066xb31b8df2.AnonymousClass1.a.emit(java.lang.Object, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a.smali:37
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
            super(2, interfaceC11588c);
            this.f7538d = interfaceC11594c;
            this.f7539e = shareBaseFileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new AnonymousClass1(this.f7538d, interfaceC11588c, this.f7539e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7537c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.f7538d;
                a aVar = new a(this.f7539e);
                this.f7537c = 1;
                if (interfaceC11594c.collect(aVar, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6066xb31b8df2(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
        super(2, interfaceC11588c);
        this.f7533d = lifecycleOwner;
        this.f7534e = state;
        this.f7535f = interfaceC11594c;
        this.f7536g = shareBaseFileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6066xb31b8df2(this.f7533d, this.f7534e, this.f7535f, interfaceC11588c, this.f7536g);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7532c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LifecycleOwner lifecycleOwner = this.f7533d;
            Lifecycle.State state = this.f7534e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7535f, null, this.f7536g);
            this.f7532c = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((C6066xb31b8df2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
