package com.friday.paint.view.six;

import com.friday.paint.viewmodel.NewNoteViewModel;
import com.zykj.view.board.board.BoardFragment;
import java.io.File;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141f2.C9168e;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$save$2$1$1", m26211f = "NewPaintFragment.kt", m26212l = {1153}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$save$2$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10211c;

    /* renamed from: d */
    public int f10212d;

    /* renamed from: e */
    public int f10213e;

    /* renamed from: f */
    public final /* synthetic */ String f10214f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9540l f10215g;

    /* renamed from: h */
    public final /* synthetic */ BoardFragment f10216h;

    /* renamed from: i */
    public final /* synthetic */ NewPaintFragment f10217i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$save$2$1$1(String str, InterfaceC9540l interfaceC9540l, BoardFragment boardFragment, NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10214f = str;
        this.f10215g = interfaceC9540l;
        this.f10216h = boardFragment;
        this.f10217i = newPaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$save$2$1$1(this.f10214f, this.f10215g, this.f10216h, this.f10217i, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listM24136n;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10213e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String str = this.f10214f;
            if (str != null && str.length() != 0 && C9168e.f21413a.m18067a(new File(this.f10214f))) {
                this.f10215g.invoke(null);
                return C10786q.f26013a;
            }
            String str2 = this.f10214f;
            if (str2 != null) {
                NewPaintFragment newPaintFragment = this.f10217i;
                NewNoteViewModel viewModel = newPaintFragment.getViewModel();
                BoardFragment currentNoteFragment = newPaintFragment.getCurrentNoteFragment();
                if (currentNoteFragment == null || (listM24136n = currentNoteFragment.m16797y0()) == null) {
                    listM24136n = AbstractC10978w.m24136n();
                }
                this.f10211c = AbstractC11833h.m26224a(str2);
                this.f10212d = 0;
                this.f10213e = 1;
                if (viewModel.m7675Q(str2, listM24136n, this) == objM25952f) {
                    return objM25952f;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f10216h.m16780I1();
        this.f10215g.invoke(this.f10214f);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$save$2$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
