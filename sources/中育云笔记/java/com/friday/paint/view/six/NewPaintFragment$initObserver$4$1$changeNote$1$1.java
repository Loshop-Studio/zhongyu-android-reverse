package com.friday.paint.view.six;

import androidx.recyclerview.widget.RecyclerView;
import com.friday.paint.model.NoteListEntity;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$4$1$changeNote$1$1", m26211f = "NewPaintFragment.kt", m26212l = {290}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$initObserver$4$1$changeNote$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10178c;

    /* renamed from: d */
    public final /* synthetic */ String f10179d;

    /* renamed from: e */
    public final /* synthetic */ NewPaintFragment f10180e;

    /* renamed from: f */
    public final /* synthetic */ Integer f10181f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$initObserver$4$1$changeNote$1$1(String str, NewPaintFragment newPaintFragment, Integer num, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10179d = str;
        this.f10180e = newPaintFragment;
        this.f10181f = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$initObserver$4$1$changeNote$1$1(this.f10179d, this.f10180e, this.f10181f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10178c;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                String str = this.f10179d;
                if (str != null) {
                    this.f10180e.updateNoteScreenShotByNotePath(str);
                }
                int itemCount = this.f10180e.getRightNoteListAdapter().getItemCount();
                Integer num = this.f10181f;
                AbstractC9979u.m20291d(num);
                int iIntValue = num.intValue();
                if (iIntValue >= 0 && iIntValue < itemCount) {
                    NewThumbnailListAdapter rightNoteListAdapter = this.f10180e.getRightNoteListAdapter();
                    Integer num2 = this.f10181f;
                    AbstractC9979u.m20291d(num2);
                    rightNoteListAdapter.updateSelectedItem(num2.intValue());
                    this.f10180e.updateCurrentPage(this.f10181f.intValue() + 1, this.f10180e.getRightNoteListAdapter().getItemCount());
                    NewPaintFragment newPaintFragment = this.f10180e;
                    RecyclerView rvNoteList = NewPaintFragment.access$getMBinding(newPaintFragment).f9854s;
                    AbstractC9979u.m20293f(rvNoteList, "rvNoteList");
                    Integer num3 = this.f10181f;
                    AbstractC9979u.m20291d(num3);
                    newPaintFragment.moveToPosition(rvNoteList, num3.intValue());
                }
                NewPaintFragment newPaintFragment2 = this.f10180e;
                List<NoteListEntity> data = newPaintFragment2.getRightNoteListAdapter().getData();
                Integer num4 = this.f10181f;
                AbstractC9979u.m20291d(num4);
                String noteDir = data.get(num4.intValue()).getNoteDir();
                this.f10178c = 1;
                if (newPaintFragment2.changeNote(noteDir, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.f10180e.getViewModel().m7686c0(true);
        } catch (Exception unused) {
            this.f10180e.isShowLoading(false);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$initObserver$4$1$changeNote$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
