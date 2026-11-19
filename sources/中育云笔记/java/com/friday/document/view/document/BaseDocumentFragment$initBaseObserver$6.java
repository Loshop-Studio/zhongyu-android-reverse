package com.friday.document.view.document;

import com.friday.document.viewmodel.BaseFileViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$initBaseObserver$6", m26211f = "BaseDocumentFragment.kt", m26212l = {116}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseDocumentFragment$initBaseObserver$6 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7298c;

    /* renamed from: d */
    public final /* synthetic */ BaseDocumentFragment f7299d;

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$initBaseObserver$6$1", m26211f = "BaseDocumentFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.BaseDocumentFragment$initBaseObserver$6$1 */
    public static final class C60281 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7300c;

        /* renamed from: d */
        public /* synthetic */ boolean f7301d;

        /* renamed from: e */
        public final /* synthetic */ BaseDocumentFragment f7302e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60281(BaseDocumentFragment baseDocumentFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7302e = baseDocumentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C60281 c60281 = new C60281(this.f7302e, interfaceC11588c);
            c60281.f7301d = ((Boolean) obj).booleanValue();
            return c60281;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10 = this.f7301d;
            AbstractC11725a.m25952f();
            if (this.f7300c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            BaseFileViewModel.m6215x0(this.f7302e.m5820E(), false, null, 2, null);
            if (z10) {
                AbstractC11958b.m26588i("删除成功");
            } else {
                AbstractC11958b.m26588i("删除失败");
            }
            return C10786q.f26013a;
        }

        public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
            return ((C60281) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDocumentFragment$initBaseObserver$6(BaseDocumentFragment baseDocumentFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7299d = baseDocumentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseDocumentFragment$initBaseObserver$6(this.f7299d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7298c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11607p interfaceC11607pM6232P = this.f7299d.m5820E().m6232P();
            C60281 c60281 = new C60281(this.f7299d, null);
            this.f7298c = 1;
            if (AbstractC11596e.m25559i(interfaceC11607pM6232P, c60281, this) == objM25952f) {
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
        return ((BaseDocumentFragment$initBaseObserver$6) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
