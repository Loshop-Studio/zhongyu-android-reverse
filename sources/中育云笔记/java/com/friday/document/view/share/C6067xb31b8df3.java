package com.friday.document.view.share;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.friday.document.model.ShareFile;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2", m26211f = "ShareBaseFileFragment.kt", m26212l = {16}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2 */
/* loaded from: classes3.dex */
public final class C6067xb31b8df3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7541c;

    /* renamed from: d */
    public final /* synthetic */ LifecycleOwner f7542d;

    /* renamed from: e */
    public final /* synthetic */ Lifecycle.State f7543e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11594c f7544f;

    /* renamed from: g */
    public final /* synthetic */ ShareBaseFileFragment f7545g;

    @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {17}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7546c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11594c f7547d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseFileFragment f7548e;

        /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a */
        public static final class a implements InterfaceC11595d {

            /* renamed from: c */
            public final /* synthetic */ ShareBaseFileFragment f7549c;

            public a(ShareBaseFileFragment shareBaseFileFragment) {
                this.f7549c = shareBaseFileFragment;
            }

            @Override // p379vd.InterfaceC11595d
            public final Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                List list = (List) obj;
                this.f7549c.m6037Q(list);
                this.f7549c.m6027D().submitList(AbstractC10947g0.m23922X0(list));
                ShareFile shareFileM6029F = this.f7549c.m6029F();
                if (shareFileM6029F != null) {
                    this.f7549c.mo6028E().m6422N(shareFileM6029F);
                    this.f7549c.m6034M(null);
                }
                return C10786q.f26013a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
            super(2, interfaceC11588c);
            this.f7547d = interfaceC11594c;
            this.f7548e = shareBaseFileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new AnonymousClass1(this.f7547d, interfaceC11588c, this.f7548e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7546c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.f7547d;
                a aVar = new a(this.f7548e);
                this.f7546c = 1;
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
    public C6067xb31b8df3(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
        super(2, interfaceC11588c);
        this.f7542d = lifecycleOwner;
        this.f7543e = state;
        this.f7544f = interfaceC11594c;
        this.f7545g = shareBaseFileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6067xb31b8df3(this.f7542d, this.f7543e, this.f7544f, interfaceC11588c, this.f7545g);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7541c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LifecycleOwner lifecycleOwner = this.f7542d;
            Lifecycle.State state = this.f7543e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7544f, null, this.f7545g);
            this.f7541c = 1;
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
        return ((C6067xb31b8df3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
