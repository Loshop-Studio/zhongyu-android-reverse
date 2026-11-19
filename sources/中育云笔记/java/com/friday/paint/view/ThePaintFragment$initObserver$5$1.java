package com.friday.paint.view;

import androidx.fragment.app.FragmentActivity;
import com.friday.common.entity.FromPage;
import com.friday.common.entity.UpdateSpecifiedItem;
import com.friday.paint.model.PaintEntity;
import com.friday.paint.viewmodel.NoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10980x;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$initObserver$5$1", m26211f = "ThePaintFragment.kt", m26212l = {283}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ThePaintFragment$initObserver$5$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10008c;

    /* renamed from: d */
    public final /* synthetic */ Boolean f10009d;

    /* renamed from: e */
    public final /* synthetic */ ThePaintFragment f10010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThePaintFragment$initObserver$5$1(Boolean bool, ThePaintFragment thePaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10009d = bool;
        this.f10010e = thePaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ThePaintFragment$initObserver$5$1(this.f10009d, this.f10010e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10008c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f10009d.booleanValue()) {
                NoteViewModel noteViewModelM7456v0 = this.f10010e.m7456v0();
                List data = this.f10010e.m7471t0().getData();
                ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(data, 10));
                Iterator it = data.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PaintEntity) it.next()).getPath());
                }
                this.f10008c = 1;
                if (noteViewModelM7456v0.m7733X(arrayList, this) == objM25952f) {
                    return objM25952f;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (AbstractC9979u.m20289b(this.f10010e.m7456v0().m7711A().getValue(), AbstractC11826a.m26206a(true))) {
            FromPage fromPageValueOf = FromPage.valueOf(this.f10010e.m7456v0().m7714D());
            FromPage fromPage = FromPage.FROM_CLASS;
            if (fromPageValueOf == fromPage) {
                LiveEventBus.get("checkTab").post(AbstractC11826a.m26208c(0));
            }
            Observable<Object> observable = LiveEventBus.get("UpdateSelectedNote");
            String strM7712B = this.f10010e.m7456v0().m7712B();
            if (fromPageValueOf == fromPage) {
                fromPageValueOf = FromPage.FROM_NEWEST;
            }
            observable.post(new UpdateSpecifiedItem(strM7712B, fromPageValueOf));
            this.f10010e.isShowLoading(false);
            FragmentActivity activity = this.f10010e.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ThePaintFragment$initObserver$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
