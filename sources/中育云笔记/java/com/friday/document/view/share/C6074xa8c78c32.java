package com.friday.document.view.share;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.List;
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

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$1", m26211f = "ShareByTeacherFragment.kt", m26212l = {16}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$1 */
/* loaded from: classes3.dex */
public final class C6074xa8c78c32 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7599c;

    /* renamed from: d */
    public final /* synthetic */ LifecycleOwner f7600d;

    /* renamed from: e */
    public final /* synthetic */ Lifecycle.State f7601e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11594c f7602f;

    /* renamed from: g */
    public final /* synthetic */ ShareByTeacherFragment f7603g;

    @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$1$1", m26211f = "ShareByTeacherFragment.kt", m26212l = {17}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7604c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11594c f7605d;

        /* renamed from: e */
        public final /* synthetic */ ShareByTeacherFragment f7606e;

        /* renamed from: com.friday.document.view.share.ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a */
        public static final class a implements InterfaceC11595d {

            /* renamed from: c */
            public final /* synthetic */ ShareByTeacherFragment f7607c;

            public a(ShareByTeacherFragment shareByTeacherFragment) {
                this.f7607c = shareByTeacherFragment;
            }

            @Override // p379vd.InterfaceC11595d
            public final Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                this.f7607c.m6054H((List) obj);
                return C10786q.f26013a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareByTeacherFragment shareByTeacherFragment) {
            super(2, interfaceC11588c);
            this.f7605d = interfaceC11594c;
            this.f7606e = shareByTeacherFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new AnonymousClass1(this.f7605d, interfaceC11588c, this.f7606e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7604c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.f7605d;
                a aVar = new a(this.f7606e);
                this.f7604c = 1;
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
    public C6074xa8c78c32(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareByTeacherFragment shareByTeacherFragment) {
        super(2, interfaceC11588c);
        this.f7600d = lifecycleOwner;
        this.f7601e = state;
        this.f7602f = interfaceC11594c;
        this.f7603g = shareByTeacherFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6074xa8c78c32(this.f7600d, this.f7601e, this.f7602f, interfaceC11588c, this.f7603g);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7599c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LifecycleOwner lifecycleOwner = this.f7600d;
            Lifecycle.State state = this.f7601e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7602f, null, this.f7603g);
            this.f7599c = 1;
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
        return ((C6074xa8c78c32) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
