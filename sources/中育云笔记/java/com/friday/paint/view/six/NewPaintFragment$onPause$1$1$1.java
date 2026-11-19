package com.friday.paint.view.six;

import com.friday.paint.model.NoteListEntity;
import com.friday.paint.viewmodel.NewNoteViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10980x;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$onPause$1$1$1", m26211f = "NewPaintFragment.kt", m26212l = {141}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$onPause$1$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10200c;

    /* renamed from: d */
    public final /* synthetic */ NewPaintFragment f10201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$onPause$1$1$1(NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10201d = newPaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$onPause$1$1$1(this.f10201d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10200c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            NewNoteViewModel viewModel = this.f10201d.getViewModel();
            List<NoteListEntity> data = this.f10201d.getRightNoteListAdapter().getData();
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(((NoteListEntity) it.next()).getNoteDir());
            }
            this.f10200c = 1;
            if (viewModel.m7687d0(arrayList, this) == objM25952f) {
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
        return ((NewPaintFragment$onPause$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
