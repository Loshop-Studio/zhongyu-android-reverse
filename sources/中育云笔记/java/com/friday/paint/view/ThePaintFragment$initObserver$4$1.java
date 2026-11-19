package com.friday.paint.view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.paint.adapter.ThumbnailListAdapter;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$initObserver$4$1", m26211f = "ThePaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ThePaintFragment$initObserver$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10005c;

    /* renamed from: d */
    public final /* synthetic */ ThePaintFragment f10006d;

    /* renamed from: e */
    public final /* synthetic */ Integer f10007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThePaintFragment$initObserver$4$1(ThePaintFragment thePaintFragment, Integer num, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10006d = thePaintFragment;
        this.f10007e = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ThePaintFragment$initObserver$4$1(this.f10006d, this.f10007e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10005c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        int itemCount = this.f10006d.m7471t0().getItemCount();
        Integer num = this.f10007e;
        AbstractC9979u.m20291d(num);
        int iIntValue = num.intValue();
        if (iIntValue >= 0 && iIntValue < itemCount) {
            ViewPager2 viewPager2 = ThePaintFragment.m7441e0(this.f10006d).f9778I;
            Integer num2 = this.f10007e;
            AbstractC9979u.m20291d(num2);
            viewPager2.setCurrentItem(num2.intValue(), false);
            this.f10006d.m7471t0().notifyDataSetChanged();
            ThumbnailListAdapter thumbnailListAdapterM7472u0 = this.f10006d.m7472u0();
            Integer num3 = this.f10007e;
            AbstractC9979u.m20291d(num3);
            thumbnailListAdapterM7472u0.updateSelectedItem(num3.intValue());
            this.f10006d.updateCurrentPage(this.f10007e.intValue() + 1, this.f10006d.m7471t0().getItemCount());
            ThePaintFragment thePaintFragment = this.f10006d;
            RecyclerView rvNoteList = ThePaintFragment.m7441e0(thePaintFragment).f9774E;
            AbstractC9979u.m20293f(rvNoteList, "rvNoteList");
            Integer num4 = this.f10007e;
            AbstractC9979u.m20291d(num4);
            thePaintFragment.moveToPosition(rvNoteList, num4.intValue());
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ThePaintFragment$initObserver$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
