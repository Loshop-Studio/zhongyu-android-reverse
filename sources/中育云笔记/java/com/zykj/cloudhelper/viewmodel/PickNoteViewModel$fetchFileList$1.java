package com.zykj.cloudhelper.viewmodel;

import com.friday.common.entity.FileBean;
import com.friday.common.entity.NoteBean;
import com.friday.common.property.BaseResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import pa.InterfaceC10639a;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$fetchFileList$1", m26211f = "PickNoteViewModel.kt", m26212l = {61}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PickNoteViewModel$fetchFileList$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f19552c;

    /* renamed from: d */
    public final /* synthetic */ PickNoteViewModel f19553d;

    /* renamed from: e */
    public final /* synthetic */ boolean f19554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickNoteViewModel$fetchFileList$1(PickNoteViewModel pickNoteViewModel, boolean z10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19553d = pickNoteViewModel;
        this.f19554e = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new PickNoteViewModel$fetchFileList$1(this.f19553d, this.f19554e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f19552c;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC10639a interfaceC10639a = this.f19553d.f19534b;
                this.f19552c = 1;
                obj = interfaceC10639a.m22509a(this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse.getCode() == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<NoteBean> noteList = ((FileBean) baseResponse.getData()).getNoteList();
                boolean z10 = this.f19554e;
                for (NoteBean noteBean : noteList) {
                    if (!linkedHashMap.containsKey(noteBean.getParentId())) {
                        ArrayList arrayList = new ArrayList();
                        if (!z10) {
                            AbstractC11826a.m26206a(arrayList.add(noteBean));
                        } else if (AbstractC9979u.m20289b(noteBean.getType(), "11") || AbstractC9979u.m20289b(noteBean.getType(), "0")) {
                            arrayList.add(noteBean);
                        }
                        linkedHashMap.put(noteBean.getParentId(), arrayList);
                    } else if (!z10) {
                        List list = (List) linkedHashMap.get(noteBean.getParentId());
                        if (list != null) {
                            AbstractC11826a.m26206a(list.add(noteBean));
                        }
                    } else if (AbstractC9979u.m20289b(noteBean.getType(), "11") || AbstractC9979u.m20289b(noteBean.getType(), "0")) {
                        List list2 = (List) linkedHashMap.get(noteBean.getParentId());
                        if (list2 != null) {
                            AbstractC11826a.m26206a(list2.add(noteBean));
                        }
                    }
                }
                this.f19553d.m16485n().setValue(linkedHashMap);
            } else {
                this.f19553d.m16485n().setValue(null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f19553d.m16485n().setValue(null);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((PickNoteViewModel$fetchFileList$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
