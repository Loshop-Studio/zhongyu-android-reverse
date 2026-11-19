package com.friday.document.view.document;

import android.widget.PopupWindow;
import com.friday.common.helper.C5962b;
import com.friday.document.databinding.PopSortBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9804v;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$onClick$batchWindow$1$1$1$1", m26211f = "FolderFragment.kt", m26212l = {348}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderFragment$onClick$batchWindow$1$1$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7360c;

    /* renamed from: d */
    public final /* synthetic */ FolderFragment f7361d;

    /* renamed from: e */
    public final /* synthetic */ PopupWindow f7362e;

    /* renamed from: f */
    public final /* synthetic */ int f7363f;

    /* renamed from: g */
    public final /* synthetic */ PopSortBinding f7364g;

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$onClick$batchWindow$1$1$1$1$1", m26211f = "FolderFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FolderFragment$onClick$batchWindow$1$1$1$1$1 */
    public static final class C60401 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7365c;

        /* renamed from: d */
        public final /* synthetic */ int f7366d;

        /* renamed from: e */
        public final /* synthetic */ PopSortBinding f7367e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60401(int i10, PopSortBinding popSortBinding, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7366d = i10;
            this.f7367e = popSortBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C60401(this.f7366d, this.f7367e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7365c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            C5962b c5962bM5299a = C5962b.f6082a.m5299a();
            int i10 = this.f7366d;
            int i11 = 0;
            if (i10 == this.f7367e.f6605c.getId()) {
                AbstractC9804v.f23002a.m19815a("SortByTime");
            } else if (i10 == this.f7367e.f6606d.getId()) {
                AbstractC9804v.f23002a.m19815a("SortByName");
                i11 = 1;
            }
            c5962bM5299a.m5264B(i11);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60401) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$onClick$batchWindow$1$1$1$1(FolderFragment folderFragment, PopupWindow popupWindow, int i10, PopSortBinding popSortBinding, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7361d = folderFragment;
        this.f7362e = popupWindow;
        this.f7363f = i10;
        this.f7364g = popSortBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderFragment$onClick$batchWindow$1$1$1$1(this.f7361d, this.f7362e, this.f7363f, this.f7364g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7360c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C60401 c60401 = new C60401(this.f7363f, this.f7364g, null);
            this.f7360c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c60401, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f7361d.m5878l0().m5838E();
        this.f7361d.m5826y();
        this.f7361d.m5880v0();
        this.f7362e.dismiss();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderFragment$onClick$batchWindow$1$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
