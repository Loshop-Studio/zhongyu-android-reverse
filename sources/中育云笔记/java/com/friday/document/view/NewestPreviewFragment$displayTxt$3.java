package com.friday.document.view;

import com.friday.common.entity.FileEntity;
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

@InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$displayTxt$3", m26211f = "NewestPreviewFragment.kt", m26212l = {356}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestPreviewFragment$displayTxt$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7196c;

    /* renamed from: d */
    public int f7197d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7198e;

    /* renamed from: f */
    public final /* synthetic */ NewestPreviewFragment f7199f;

    @InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$displayTxt$3$1", m26211f = "NewestPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.NewestPreviewFragment$displayTxt$3$1 */
    public static final class C60141 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7200c;

        /* renamed from: d */
        public final /* synthetic */ NewestPreviewFragment f7201d;

        /* renamed from: e */
        public final /* synthetic */ String f7202e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60141(NewestPreviewFragment newestPreviewFragment, String str, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7201d = newestPreviewFragment;
            this.f7202e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C60141(this.f7201d, this.f7202e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7200c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            NewestPreviewFragment.m5717F(this.f7201d).f6613d.f6574i.setText(this.f7202e);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60141) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestPreviewFragment$displayTxt$3(FileEntity fileEntity, NewestPreviewFragment newestPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7198e = fileEntity;
        this.f7199f = newestPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewestPreviewFragment$displayTxt$3(this.f7198e, this.f7199f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7197d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String strM26590k = AbstractC11958b.m26590k(this.f7198e.getTxtFilePath(), null, false, 6, null);
            AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
            C60141 c60141 = new C60141(this.f7199f, strM26590k, null);
            this.f7196c = AbstractC11833h.m26224a(strM26590k);
            this.f7197d = 1;
            if (AbstractC11109f.m24709g(abstractC11164t1M24800c, c60141, this) == objM25952f) {
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
        return ((NewestPreviewFragment$displayTxt$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
