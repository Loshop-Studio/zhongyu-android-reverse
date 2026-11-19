package com.friday.main.viewmodel;

import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.ResourceEntity;
import com.taobao.sophix.PatchStatus;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;
import p364uc.AbstractC11382b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FullScreenViewModel$getStudentSharePreviewList$1", m26211f = "FullScreenViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_FIELD}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullScreenViewModel$getStudentSharePreviewList$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9600c;

    /* renamed from: d */
    public final /* synthetic */ FullScreenViewModel f9601d;

    /* renamed from: e */
    public final /* synthetic */ String f9602e;

    /* renamed from: com.friday.main.viewmodel.FullScreenViewModel$getStudentSharePreviewList$1$a */
    public static final class C6223a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Integer.valueOf(((ResourceEntity) obj).getPageIndex()), Integer.valueOf(((ResourceEntity) obj2).getPageIndex()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenViewModel$getStudentSharePreviewList$1(FullScreenViewModel fullScreenViewModel, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9601d = fullScreenViewModel;
        this.f9602e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FullScreenViewModel$getStudentSharePreviewList$1(this.f9601d, this.f9602e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FullScreenViewModel$getStudentSharePreviewList$1 fullScreenViewModel$getStudentSharePreviewList$1;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9600c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ResourceDao resourceDao = this.f9601d.f9578c;
            String str = this.f9602e;
            this.f9600c = 1;
            fullScreenViewModel$getStudentSharePreviewList$1 = this;
            obj = ResourceDao.m5077c(resourceDao, str, 0L, fullScreenViewModel$getStudentSharePreviewList$1, 2, null);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            fullScreenViewModel$getStudentSharePreviewList$1 = this;
        }
        List listM23914P0 = AbstractC10947g0.m23914P0((List) obj, new C6223a());
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listM23914P0, 10));
        Iterator it = listM23914P0.iterator();
        while (it.hasNext()) {
            arrayList.add(new File(((ResourceEntity) it.next()).getId()));
        }
        fullScreenViewModel$getStudentSharePreviewList$1.f9601d.f9582g.postValue(arrayList);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FullScreenViewModel$getStudentSharePreviewList$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
