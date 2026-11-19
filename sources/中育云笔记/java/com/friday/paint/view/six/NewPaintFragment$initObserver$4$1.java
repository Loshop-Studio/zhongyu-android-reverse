package com.friday.paint.view.six;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.LogUtils;
import com.friday.paint.model.NoteListEntity;
import com.zykj.view.board.board.BoardFragment;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$4$1", m26211f = "NewPaintFragment.kt", m26212l = {311}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$initObserver$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10174c;

    /* renamed from: d */
    public int f10175d;

    /* renamed from: e */
    public final /* synthetic */ NewPaintFragment f10176e;

    /* renamed from: f */
    public final /* synthetic */ Integer f10177f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$initObserver$4$1(NewPaintFragment newPaintFragment, Integer num, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10176e = newPaintFragment;
        this.f10177f = num;
    }

    /* renamed from: p */
    public static final C10786q m7591p(NewPaintFragment newPaintFragment, Integer num, String str) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newPaintFragment), null, null, new NewPaintFragment$initObserver$4$1$changeNote$1$1(str, newPaintFragment, num, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: t */
    public static final C10786q m7592t(InterfaceC9540l interfaceC9540l, Throwable th) {
        interfaceC9540l.invoke(null);
        return C10786q.f26013a;
    }

    /* renamed from: v */
    public static final C10786q m7593v(InterfaceC9540l interfaceC9540l, String str) {
        interfaceC9540l.invoke(str);
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$initObserver$4$1(this.f10176e, this.f10177f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10175d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            BoardFragment currentNoteFragment = this.f10176e.getCurrentNoteFragment();
            if (currentNoteFragment != null) {
                this.f10176e.isShowLoading(true);
                LogUtils.m3886d("开始加载BoardFragment");
                final NewPaintFragment newPaintFragment = this.f10176e;
                final Integer num = this.f10177f;
                final InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: com.friday.paint.view.six.d
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj2) {
                        return NewPaintFragment$initObserver$4$1.m7591p(newPaintFragment, num, (String) obj2);
                    }
                };
                NewPaintFragment.save$default(this.f10176e, currentNoteFragment, false, new InterfaceC9540l() { // from class: com.friday.paint.view.six.e
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj2) {
                        return NewPaintFragment$initObserver$4$1.m7592t(interfaceC9540l, (Throwable) obj2);
                    }
                }, new InterfaceC9540l() { // from class: com.friday.paint.view.six.f
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj2) {
                        return NewPaintFragment$initObserver$4$1.m7593v(interfaceC9540l, (String) obj2);
                    }
                }, 2, null);
                return C10786q.f26013a;
            }
            int itemCount = this.f10176e.getRightNoteListAdapter().getItemCount();
            Integer num2 = this.f10177f;
            AbstractC9979u.m20291d(num2);
            int iIntValue = num2.intValue();
            if (iIntValue >= 0 && iIntValue < itemCount) {
                NewThumbnailListAdapter rightNoteListAdapter = this.f10176e.getRightNoteListAdapter();
                Integer num3 = this.f10177f;
                AbstractC9979u.m20291d(num3);
                rightNoteListAdapter.updateSelectedItem(num3.intValue());
                this.f10176e.updateCurrentPage(this.f10177f.intValue() + 1, this.f10176e.getRightNoteListAdapter().getItemCount());
                NewPaintFragment newPaintFragment2 = this.f10176e;
                RecyclerView rvNoteList = NewPaintFragment.access$getMBinding(newPaintFragment2).f9854s;
                AbstractC9979u.m20293f(rvNoteList, "rvNoteList");
                Integer num4 = this.f10177f;
                AbstractC9979u.m20291d(num4);
                newPaintFragment2.moveToPosition(rvNoteList, num4.intValue());
            }
            NewPaintFragment newPaintFragment3 = this.f10176e;
            List<NoteListEntity> data = newPaintFragment3.getRightNoteListAdapter().getData();
            Integer num5 = this.f10177f;
            AbstractC9979u.m20291d(num5);
            String noteDir = data.get(num5.intValue()).getNoteDir();
            this.f10174c = AbstractC11833h.m26224a(currentNoteFragment);
            this.f10175d = 1;
            if (newPaintFragment3.changeNote(noteDir, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f10176e.getViewModel().m7686c0(true);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$initObserver$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
