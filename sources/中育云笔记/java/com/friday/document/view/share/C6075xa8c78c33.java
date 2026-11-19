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

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2", m26211f = "ShareByTeacherFragment.kt", m26212l = {16}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2 */
/* loaded from: classes3.dex */
public final class C6075xa8c78c33 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7608c;

    /* renamed from: d */
    public final /* synthetic */ LifecycleOwner f7609d;

    /* renamed from: e */
    public final /* synthetic */ Lifecycle.State f7610e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11594c f7611f;

    /* renamed from: g */
    public final /* synthetic */ ShareByTeacherFragment f7612g;

    @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2$1", m26211f = "ShareByTeacherFragment.kt", m26212l = {17}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7613c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11594c f7614d;

        /* renamed from: e */
        public final /* synthetic */ ShareByTeacherFragment f7615e;

        /* renamed from: com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a */
        public static final class a implements InterfaceC11595d {

            /* renamed from: c */
            public final /* synthetic */ ShareByTeacherFragment f7616c;

            public a(ShareByTeacherFragment shareByTeacherFragment) {
                this.f7616c = shareByTeacherFragment;
            }

            @Override // p379vd.InterfaceC11595d
            public final Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                ShareByTeacherFragment.m6061w(this.f7616c).f6433e.setRefreshing(((Boolean) obj).booleanValue());
                return C10786q.f26013a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareByTeacherFragment shareByTeacherFragment) {
            super(2, interfaceC11588c);
            this.f7614d = interfaceC11594c;
            this.f7615e = shareByTeacherFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new AnonymousClass1(this.f7614d, interfaceC11588c, this.f7615e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7613c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.f7614d;
                a aVar = new a(this.f7615e);
                this.f7613c = 1;
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
    public C6075xa8c78c33(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareByTeacherFragment shareByTeacherFragment) {
        super(2, interfaceC11588c);
        this.f7609d = lifecycleOwner;
        this.f7610e = state;
        this.f7611f = interfaceC11594c;
        this.f7612g = shareByTeacherFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6075xa8c78c33(this.f7609d, this.f7610e, this.f7611f, interfaceC11588c, this.f7612g);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7608c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LifecycleOwner lifecycleOwner = this.f7609d;
            Lifecycle.State state = this.f7610e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7611f, null, this.f7612g);
            this.f7608c = 1;
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
        return ((C6075xa8c78c33) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
