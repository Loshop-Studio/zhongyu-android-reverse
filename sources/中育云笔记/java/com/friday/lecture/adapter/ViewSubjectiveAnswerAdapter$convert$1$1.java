package com.friday.lecture.adapter;

import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.lecture.R$id;
import com.friday.lecture.model.SubjectiveHomeworkAnswer;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p215k2.C9799q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter$convert$1$1", m26211f = "ViewSubjectiveAnswerAdapter.kt", m26212l = {28}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ViewSubjectiveAnswerAdapter$convert$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8486c;

    /* renamed from: d */
    public final /* synthetic */ SubjectiveHomeworkAnswer f8487d;

    /* renamed from: e */
    public final /* synthetic */ ViewSubjectiveAnswerAdapter f8488e;

    /* renamed from: f */
    public final /* synthetic */ BaseViewHolder f8489f;

    @InterfaceC11829d(m26210c = "com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter$convert$1$1$1", m26211f = "ViewSubjectiveAnswerAdapter.kt", m26212l = {30}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter$convert$1$1$1 */
    public static final class C61391 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f8490c;

        /* renamed from: d */
        public int f8491d;

        /* renamed from: e */
        public final /* synthetic */ SubjectiveHomeworkAnswer f8492e;

        /* renamed from: f */
        public final /* synthetic */ ViewSubjectiveAnswerAdapter f8493f;

        /* renamed from: g */
        public final /* synthetic */ BaseViewHolder f8494g;

        @InterfaceC11829d(m26210c = "com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter$convert$1$1$1$1", m26211f = "ViewSubjectiveAnswerAdapter.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter$convert$1$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f8495c;

            /* renamed from: d */
            public final /* synthetic */ String f8496d;

            /* renamed from: e */
            public final /* synthetic */ SubjectiveHomeworkAnswer f8497e;

            /* renamed from: f */
            public final /* synthetic */ ViewSubjectiveAnswerAdapter f8498f;

            /* renamed from: g */
            public final /* synthetic */ BaseViewHolder f8499g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, SubjectiveHomeworkAnswer subjectiveHomeworkAnswer, ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter, BaseViewHolder baseViewHolder, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f8496d = str;
                this.f8497e = subjectiveHomeworkAnswer;
                this.f8498f = viewSubjectiveAnswerAdapter;
                this.f8499g = baseViewHolder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f8496d, this.f8497e, this.f8498f, this.f8499g, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f8495c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                String str = this.f8496d;
                if (str != null) {
                    this.f8497e.setLocalPath(str);
                    ComponentCallbacks2C5810b.m3946t(this.f8498f.getContext()).m4016t(this.f8497e.getLocalPath()).m3981A0((ImageView) this.f8499g.getView(R$id.iv_answer));
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61391(SubjectiveHomeworkAnswer subjectiveHomeworkAnswer, ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter, BaseViewHolder baseViewHolder, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8492e = subjectiveHomeworkAnswer;
            this.f8493f = viewSubjectiveAnswerAdapter;
            this.f8494g = baseViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61391(this.f8492e, this.f8493f, this.f8494g, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f8491d;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                String strM19799a = C9799q.f22994a.m19799a(this.f8492e.getRemoteUrl());
                AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(strM19799a, this.f8492e, this.f8493f, this.f8494g, null);
                this.f8490c = AbstractC11833h.m26224a(strM19799a);
                this.f8491d = 1;
                if (AbstractC11109f.m24709g(abstractC11164t1M24800c, anonymousClass1, this) == objM25952f) {
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
            return ((C61391) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSubjectiveAnswerAdapter$convert$1$1(SubjectiveHomeworkAnswer subjectiveHomeworkAnswer, ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter, BaseViewHolder baseViewHolder, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8487d = subjectiveHomeworkAnswer;
        this.f8488e = viewSubjectiveAnswerAdapter;
        this.f8489f = baseViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ViewSubjectiveAnswerAdapter$convert$1$1(this.f8487d, this.f8488e, this.f8489f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8486c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C61391 c61391 = new C61391(this.f8487d, this.f8488e, this.f8489f, null);
            this.f8486c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c61391, this) == objM25952f) {
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
        return ((ViewSubjectiveAnswerAdapter$convert$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
