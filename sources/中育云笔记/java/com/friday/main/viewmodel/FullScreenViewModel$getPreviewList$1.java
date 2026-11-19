package com.friday.main.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.lifecycle.MutableLiveData;
import cd.AbstractC5428g;
import com.blankj.utilcode.util.FileUtils;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ResourceEntity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p364uc.AbstractC11382b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FullScreenViewModel$getPreviewList$1", m26211f = "FullScreenViewModel.kt", m26212l = {41}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullScreenViewModel$getPreviewList$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9589c;

    /* renamed from: d */
    public final /* synthetic */ FullScreenViewModel f9590d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f9591e;

    /* renamed from: com.friday.main.viewmodel.FullScreenViewModel$getPreviewList$1$a */
    public static final class C6221a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Integer.valueOf(((ResourceEntity) obj).getPageIndex()), Integer.valueOf(((ResourceEntity) obj2).getPageIndex()));
        }
    }

    /* renamed from: com.friday.main.viewmodel.FullScreenViewModel$getPreviewList$1$b */
    public static final class C6222b extends TypeToken<ArrayList<String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenViewModel$getPreviewList$1(FullScreenViewModel fullScreenViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9590d = fullScreenViewModel;
        this.f9591e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FullScreenViewModel$getPreviewList$1(this.f9590d, this.f9591e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FullScreenViewModel$getPreviewList$1 fullScreenViewModel$getPreviewList$1;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9589c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ResourceDao resourceDao = this.f9590d.f9578c;
            String fileId = this.f9591e.getFileId();
            this.f9589c = 1;
            fullScreenViewModel$getPreviewList$1 = this;
            obj = ResourceDao.m5077c(resourceDao, fileId, 0L, fullScreenViewModel$getPreviewList$1, 2, null);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            fullScreenViewModel$getPreviewList$1 = this;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            String str = fullScreenViewModel$getPreviewList$1.f9591e.getLocalFileUrl() + File.separator + "index.json";
            if (!FileUtils.isFileExists(str)) {
                fullScreenViewModel$getPreviewList$1.f9590d.m7234h().setValue(AbstractC10978w.m24136n());
            }
            ArrayList arrayList2 = (ArrayList) new Gson().fromJson(AbstractC5428g.m2921e(new File(str), null, 1, null), new C6222b().getType());
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    String str2 = (String) obj2;
                    if (FileUtils.isFileExists(str2)) {
                        arrayList.add(new File(str2));
                    }
                }
            }
            fullScreenViewModel$getPreviewList$1.f9590d.m7234h().setValue(arrayList);
        } else {
            MutableLiveData mutableLiveDataM7234h = fullScreenViewModel$getPreviewList$1.f9590d.m7234h();
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (hashSet.add(((ResourceEntity) obj3).getPageName())) {
                    arrayList3.add(obj3);
                }
            }
            List listM23914P0 = AbstractC10947g0.m23914P0(arrayList3, new C6221a());
            ArrayList arrayList4 = new ArrayList(AbstractC10980x.m24153x(listM23914P0, 10));
            Iterator it = listM23914P0.iterator();
            while (it.hasNext()) {
                arrayList4.add(new File(((ResourceEntity) it.next()).getPageName()));
            }
            mutableLiveDataM7234h.setValue(arrayList4);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FullScreenViewModel$getPreviewList$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
