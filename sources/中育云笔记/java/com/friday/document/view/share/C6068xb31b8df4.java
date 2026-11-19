package com.friday.document.view.share;

import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.friday.document.model.ShareFile;
import com.friday.document.viewmodel.ShareFileViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3", m26211f = "ShareBaseFileFragment.kt", m26212l = {16}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3 */
/* loaded from: classes3.dex */
public final class C6068xb31b8df4 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7550c;

    /* renamed from: d */
    public final /* synthetic */ LifecycleOwner f7551d;

    /* renamed from: e */
    public final /* synthetic */ Lifecycle.State f7552e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11594c f7553f;

    /* renamed from: g */
    public final /* synthetic */ ShareBaseFileFragment f7554g;

    @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {17}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7555c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11594c f7556d;

        /* renamed from: e */
        public final /* synthetic */ ShareBaseFileFragment f7557e;

        /* renamed from: com.friday.document.view.share.ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1$a */
        public static final class a implements InterfaceC11595d {

            /* renamed from: c */
            public final /* synthetic */ ShareBaseFileFragment f7558c;

            public a(ShareBaseFileFragment shareBaseFileFragment) {
                this.f7558c = shareBaseFileFragment;
            }

            @Override // p379vd.InterfaceC11595d
            public final Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                ShareFile shareFile = (ShareFile) obj;
                this.f7558c.m6041W(shareFile);
                ImageView ivMore = ShareBaseFileFragment.m6021w(this.f7558c).f6441e;
                AbstractC9979u.m20293f(ivMore, "ivMore");
                ivMore.setVisibility(shareFile != null ? 0 : 8);
                if (shareFile != null) {
                    ShareFileViewModel.m6404Q(this.f7558c.mo6028E(), shareFile.getFileId(), shareFile.getOwnerId(), shareFile.getShareTime(), shareFile.getOwnerName(), false, 16, null);
                } else {
                    this.f7558c.mo6031H();
                }
                return C10786q.f26013a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
            super(2, interfaceC11588c);
            this.f7556d = interfaceC11594c;
            this.f7557e = shareBaseFileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new AnonymousClass1(this.f7556d, interfaceC11588c, this.f7557e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7555c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.f7556d;
                a aVar = new a(this.f7557e);
                this.f7555c = 1;
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
    public C6068xb31b8df4(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c, ShareBaseFileFragment shareBaseFileFragment) {
        super(2, interfaceC11588c);
        this.f7551d = lifecycleOwner;
        this.f7552e = state;
        this.f7553f = interfaceC11594c;
        this.f7554g = shareBaseFileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6068xb31b8df4(this.f7551d, this.f7552e, this.f7553f, interfaceC11588c, this.f7554g);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7550c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LifecycleOwner lifecycleOwner = this.f7551d;
            Lifecycle.State state = this.f7552e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7553f, null, this.f7554g);
            this.f7550c = 1;
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
        return ((C6068xb31b8df4) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
