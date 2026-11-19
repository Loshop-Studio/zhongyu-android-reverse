package com.friday.document.view.share;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p430z2.C11970b1;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$4", m26211f = "ShareBaseFileFragment.kt", m26212l = {16}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$4 */
/* loaded from: classes3.dex */
public final class C6069xb31b8df5 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7559c;

    /* renamed from: d */
    public final /* synthetic */ LifecycleOwner f7560d;

    /* renamed from: e */
    public final /* synthetic */ Lifecycle.State f7561e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11594c f7562f;

    /* renamed from: g */
    public final /* synthetic */ ShareBaseFileFragment f7563g;

    @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$4$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {17}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7564c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11594c f7565d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseFileFragment f7566e;

        /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$4$1$a */
        public static final class a implements InterfaceC11595d {

            /* renamed from: c */
            public final /* synthetic */ ShareBaseFileFragment f7567c;

            public a(ShareBaseFileFragment shareBaseFileFragment) {
                this.f7567c = shareBaseFileFragment;
            }

            @Override // p379vd.InterfaceC11595d
            public final Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                LifecycleOwner viewLifecycleOwner = this.f7567c.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ShareBaseFileFragment$initObserver$4$1(this.f7567c, (C11970b1) obj, null), 3, null);
                return C10786q.f26013a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
            super(2, interfaceC11588c);
            this.f7565d = interfaceC11594c;
            this.f7566e = shareBaseFileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new AnonymousClass1(this.f7565d, interfaceC11588c, this.f7566e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7564c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.f7565d;
                a aVar = new a(this.f7566e);
                this.f7564c = 1;
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
    public C6069xb31b8df5(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
        super(2, interfaceC11588c);
        this.f7560d = lifecycleOwner;
        this.f7561e = state;
        this.f7562f = interfaceC11594c;
        this.f7563g = shareBaseFileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6069xb31b8df5(this.f7560d, this.f7561e, this.f7562f, interfaceC11588c, this.f7563g);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7559c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LifecycleOwner lifecycleOwner = this.f7560d;
            Lifecycle.State state = this.f7561e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7562f, null, this.f7563g);
            this.f7559c = 1;
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
        return ((C6069xb31b8df5) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
