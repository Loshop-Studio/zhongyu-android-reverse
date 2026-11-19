package com.friday.document.view;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.RecycleBinPreviewFragment$displayTxt$3", m26211f = "RecycleBinPreviewFragment.kt", m26212l = {249}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinPreviewFragment$displayTxt$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7248c;

    /* renamed from: d */
    public int f7249d;

    /* renamed from: e */
    public final /* synthetic */ String f7250e;

    /* renamed from: f */
    public final /* synthetic */ RecycleBinPreviewFragment f7251f;

    @InterfaceC11829d(m26210c = "com.friday.document.view.RecycleBinPreviewFragment$displayTxt$3$1", m26211f = "RecycleBinPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.RecycleBinPreviewFragment$displayTxt$3$1 */
    public static final class C60231 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7252c;

        /* renamed from: d */
        public final /* synthetic */ RecycleBinPreviewFragment f7253d;

        /* renamed from: e */
        public final /* synthetic */ String f7254e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60231(RecycleBinPreviewFragment recycleBinPreviewFragment, String str, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7253d = recycleBinPreviewFragment;
            this.f7254e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C60231(this.f7253d, this.f7254e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7252c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            RecycleBinPreviewFragment.m5755F(this.f7253d).f6621e.f6599j.setText(this.f7254e);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60231) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinPreviewFragment$displayTxt$3(String str, RecycleBinPreviewFragment recycleBinPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7250e = str;
        this.f7251f = recycleBinPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RecycleBinPreviewFragment$displayTxt$3(this.f7250e, this.f7251f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7249d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String strM26590k = AbstractC11958b.m26590k(this.f7250e, null, false, 6, null);
            AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
            C60231 c60231 = new C60231(this.f7251f, strM26590k, null);
            this.f7248c = AbstractC11833h.m26224a(strM26590k);
            this.f7249d = 1;
            if (AbstractC11109f.m24709g(abstractC11164t1M24800c, c60231, this) == objM25952f) {
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
        return ((RecycleBinPreviewFragment$displayTxt$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
