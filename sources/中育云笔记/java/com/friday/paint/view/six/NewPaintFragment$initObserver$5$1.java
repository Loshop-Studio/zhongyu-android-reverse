package com.friday.paint.view.six;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$5$1", m26211f = "NewPaintFragment.kt", m26212l = {320, 325}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$initObserver$5$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10182c;

    /* renamed from: d */
    public final /* synthetic */ Boolean f10183d;

    /* renamed from: e */
    public final /* synthetic */ NewPaintFragment f10184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$initObserver$5$1(Boolean bool, NewPaintFragment newPaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10183d = bool;
        this.f10184e = newPaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$initObserver$5$1(this.f10183d, this.f10184e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (r7.m7690s(r6) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.f10182c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.AbstractC9924b.m20071b(r7)
            goto L8f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.AbstractC9924b.m20071b(r7)
            goto L68
        L1f:
            kotlin.AbstractC9924b.m20071b(r7)
            java.lang.Boolean r7 = r6.f10183d
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L68
            com.friday.paint.view.six.NewPaintFragment r7 = r6.f10184e
            com.friday.paint.viewmodel.NewNoteViewModel r7 = com.friday.paint.view.six.NewPaintFragment.access$getViewModel(r7)
            com.friday.paint.view.six.NewPaintFragment r1 = r6.f10184e
            com.friday.paint.view.six.NewThumbnailListAdapter r1 = r1.getRightNoteListAdapter()
            java.util.List r1 = r1.getData()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p325rc.AbstractC10980x.m24153x(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5f
            java.lang.Object r5 = r1.next()
            com.friday.paint.model.NoteListEntity r5 = (com.friday.paint.model.NoteListEntity) r5
            java.lang.String r5 = r5.getNoteDir()
            r4.add(r5)
            goto L4b
        L5f:
            r6.f10182c = r3
            java.lang.Object r7 = r7.m7687d0(r4, r6)
            if (r7 != r0) goto L68
            goto L8e
        L68:
            com.friday.paint.view.six.NewPaintFragment r7 = r6.f10184e
            com.friday.paint.viewmodel.NewNoteViewModel r7 = com.friday.paint.view.six.NewPaintFragment.access$getViewModel(r7)
            androidx.lifecycle.MutableLiveData r7 = r7.m7664F()
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r1 = p409xc.AbstractC11826a.m26206a(r3)
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r1)
            if (r7 == 0) goto Ldb
            com.friday.paint.view.six.NewPaintFragment r7 = r6.f10184e
            com.friday.paint.viewmodel.NewNoteViewModel r7 = com.friday.paint.view.six.NewPaintFragment.access$getViewModel(r7)
            r6.f10182c = r2
            java.lang.Object r7 = r7.m7690s(r6)
            if (r7 != r0) goto L8f
        L8e:
            return r0
        L8f:
            com.friday.paint.view.six.NewPaintFragment r7 = r6.f10184e
            com.friday.paint.viewmodel.NewNoteViewModel r7 = com.friday.paint.view.six.NewPaintFragment.access$getViewModel(r7)
            java.lang.String r7 = r7.m7667I()
            com.friday.common.entity.FromPage r7 = com.friday.common.entity.FromPage.valueOf(r7)
            com.friday.common.entity.FromPage r0 = com.friday.common.entity.FromPage.FROM_CLASS
            r1 = 0
            if (r7 != r0) goto Laf
            java.lang.String r2 = "checkTab"
            com.jeremyliao.liveeventbus.core.Observable r2 = com.jeremyliao.liveeventbus.LiveEventBus.get(r2)
            java.lang.Integer r3 = p409xc.AbstractC11826a.m26208c(r1)
            r2.post(r3)
        Laf:
            java.lang.String r2 = "UpdateSelectedNote"
            com.jeremyliao.liveeventbus.core.Observable r2 = com.jeremyliao.liveeventbus.LiveEventBus.get(r2)
            com.friday.common.entity.UpdateSpecifiedItem r3 = new com.friday.common.entity.UpdateSpecifiedItem
            com.friday.paint.view.six.NewPaintFragment r4 = r6.f10184e
            com.friday.paint.viewmodel.NewNoteViewModel r4 = com.friday.paint.view.six.NewPaintFragment.access$getViewModel(r4)
            java.lang.String r4 = r4.m7665G()
            if (r7 != r0) goto Lc5
            com.friday.common.entity.FromPage r7 = com.friday.common.entity.FromPage.FROM_NEWEST
        Lc5:
            r3.<init>(r4, r7)
            r2.post(r3)
            com.friday.paint.view.six.NewPaintFragment r7 = r6.f10184e
            r7.isShowLoading(r1)
            com.friday.paint.view.six.NewPaintFragment r7 = r6.f10184e
            androidx.fragment.app.FragmentActivity r7 = r7.getActivity()
            if (r7 == 0) goto Ldb
            r7.finish()
        Ldb:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewPaintFragment$initObserver$5$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment$initObserver$5$1.smali:129
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$initObserver$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
