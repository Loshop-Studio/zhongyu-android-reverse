package com.zykj.cloudhelper.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.friday.common.base.BaseFragment;
import com.friday.common.entity.NoteBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p255n1.AbstractC10313b;
import ua.C11376a;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public abstract class BaseNoteFragment<T extends ViewDataBinding> extends BaseFragment<T> {

    /* renamed from: d */
    public static final int f19507d = BaseFragment.$stable;

    /* renamed from: t */
    public static /* synthetic */ List m16430t(BaseNoteFragment baseNoteFragment, LinkedHashMap linkedHashMap, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEntityList");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return baseNoteFragment.m16433s(linkedHashMap, z10);
    }

    /* renamed from: q */
    public final boolean m16431q(C11376a c11376a) {
        Object next;
        if (!AbstractC9979u.m20289b("0", c11376a.m25323d().getType())) {
            return true;
        }
        List listMo21520a = c11376a.mo21520a();
        if (listMo21520a == null || listMo21520a.isEmpty()) {
            return false;
        }
        List listMo21520a2 = c11376a.mo21520a();
        AbstractC9979u.m20291d(listMo21520a2);
        Iterator it = listMo21520a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC10313b abstractC10313b = (AbstractC10313b) next;
            AbstractC9979u.m20292e(abstractC10313b, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode");
            if (AbstractC9979u.m20289b(((C11376a) abstractC10313b).m25323d().getType(), "11")) {
                break;
            }
        }
        if (next != null) {
            return true;
        }
        List listMo21520a3 = c11376a.mo21520a();
        AbstractC9979u.m20291d(listMo21520a3);
        for (Object obj : listMo21520a3) {
            AbstractC9979u.m20293f(obj, "next(...)");
            AbstractC10313b abstractC10313b2 = (AbstractC10313b) obj;
            if (abstractC10313b2 instanceof C11376a ? m16431q((C11376a) abstractC10313b2) : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final List m16432r(List list, ArrayList arrayList, LinkedHashMap linkedHashMap, int i10) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NoteBean noteBean = (NoteBean) it.next();
                arrayList.add(new C11376a(m16432r((List) linkedHashMap.get(noteBean.getFileId()), new ArrayList(), linkedHashMap, i10 + 1), noteBean, i10));
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public final List m16433s(LinkedHashMap hashMap, boolean z10) {
        AbstractC9979u.m20294g(hashMap, "hashMap");
        ArrayList arrayList = new ArrayList();
        List list = (List) hashMap.get("0");
        C11376a c11376a = new C11376a(m16432r(list, arrayList, hashMap, 1), new NoteBean("0", "根目录", "0", "", "0", "", "", 0, 0L, true, false, false, 0L, 7168, null), 0);
        if (z10) {
            m16434u(c11376a);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c11376a);
        return arrayList2;
    }

    /* renamed from: u */
    public final void m16434u(C11376a c11376a) {
        List listMo21520a = c11376a.mo21520a();
        if (listMo21520a == null || listMo21520a.isEmpty()) {
            return;
        }
        List listMo21520a2 = c11376a.mo21520a();
        AbstractC9979u.m20291d(listMo21520a2);
        int size = listMo21520a2.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            List listMo21520a3 = c11376a.mo21520a();
            AbstractC9979u.m20291d(listMo21520a3);
            Object obj = listMo21520a3.get(size);
            AbstractC9979u.m20293f(obj, "get(...)");
            AbstractC10313b abstractC10313b = (AbstractC10313b) obj;
            if (abstractC10313b instanceof C11376a) {
                C11376a c11376a2 = (C11376a) abstractC10313b;
                if (!m16431q(c11376a2)) {
                    List listMo21520a4 = c11376a.mo21520a();
                    AbstractC9979u.m20291d(listMo21520a4);
                    AbstractC9979u.m20291d(listMo21520a4.remove(size));
                } else if (AbstractC9979u.m20289b(c11376a2.m25323d().getType(), "0")) {
                    m16434u(c11376a2);
                }
            }
        }
    }
}
