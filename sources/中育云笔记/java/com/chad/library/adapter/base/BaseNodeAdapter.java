package com.chad.library.adapter.base;

import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p255n1.AbstractC10312a;
import p255n1.AbstractC10313b;
import p299q1.AbstractC10718a;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<AbstractC10313b> {

    /* renamed from: b */
    public final HashSet f5407b;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseNodeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: E */
    public static /* synthetic */ List m4653E(BaseNodeAdapter baseNodeAdapter, Collection collection, Boolean bool, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flatData");
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return baseNodeAdapter.m4657D(collection, bool);
    }

    /* renamed from: A */
    public final int m4654A(int i10, boolean z10, boolean z11, boolean z12, Object obj) {
        AbstractC10313b abstractC10313b = getData().get(i10);
        if (abstractC10313b instanceof AbstractC10312a) {
            AbstractC10312a abstractC10312a = (AbstractC10312a) abstractC10313b;
            if (abstractC10312a.m21518b()) {
                int headerLayoutCount = i10 + getHeaderLayoutCount();
                abstractC10312a.m21519c(false);
                List listMo21520a = abstractC10313b.mo21520a();
                if (listMo21520a != null && !listMo21520a.isEmpty()) {
                    List listMo21520a2 = abstractC10313b.mo21520a();
                    AbstractC9979u.m20291d(listMo21520a2);
                    List listM4657D = m4657D(listMo21520a2, z10 ? Boolean.FALSE : null);
                    int size = listM4657D.size();
                    getData().removeAll(listM4657D);
                    if (z12) {
                        if (z11) {
                            notifyItemChanged(headerLayoutCount, obj);
                            notifyItemRangeRemoved(headerLayoutCount + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, obj);
            }
        }
        return 0;
    }

    /* renamed from: B */
    public final int m4655B(int i10, boolean z10, boolean z11, boolean z12, Object obj) {
        AbstractC10313b abstractC10313b = getData().get(i10);
        if (abstractC10313b instanceof AbstractC10312a) {
            AbstractC10312a abstractC10312a = (AbstractC10312a) abstractC10313b;
            if (!abstractC10312a.m21518b()) {
                int headerLayoutCount = getHeaderLayoutCount() + i10;
                abstractC10312a.m21519c(true);
                List listMo21520a = abstractC10313b.mo21520a();
                if (listMo21520a != null && !listMo21520a.isEmpty()) {
                    List listMo21520a2 = abstractC10313b.mo21520a();
                    AbstractC9979u.m20291d(listMo21520a2);
                    List listM4657D = m4657D(listMo21520a2, z10 ? Boolean.TRUE : null);
                    int size = listM4657D.size();
                    getData().addAll(i10 + 1, listM4657D);
                    if (z12) {
                        if (z11) {
                            notifyItemChanged(headerLayoutCount, obj);
                            notifyItemRangeInserted(headerLayoutCount + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, obj);
            }
        }
        return 0;
    }

    /* renamed from: C */
    public final int m4656C(int i10, boolean z10, boolean z11, Object obj) {
        AbstractC10313b abstractC10313b = getData().get(i10);
        if (abstractC10313b instanceof AbstractC10312a) {
            return ((AbstractC10312a) abstractC10313b).m21518b() ? m4654A(i10, false, z10, z11, obj) : m4655B(i10, false, z10, z11, obj);
        }
        return 0;
    }

    /* renamed from: D */
    public final List m4657D(Collection collection, Boolean bool) {
        List listMo21520a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC10313b abstractC10313b = (AbstractC10313b) it.next();
            arrayList.add(abstractC10313b);
            if (abstractC10313b instanceof AbstractC10312a) {
                if ((AbstractC9979u.m20289b(bool, Boolean.TRUE) || ((AbstractC10312a) abstractC10313b).m21518b()) && (listMo21520a = abstractC10313b.mo21520a()) != null && !listMo21520a.isEmpty()) {
                    arrayList.addAll(m4657D(listMo21520a, bool));
                }
                if (bool != null) {
                    ((AbstractC10312a) abstractC10313b).m21519c(bool.booleanValue());
                }
            } else {
                List listMo21520a2 = abstractC10313b.mo21520a();
                if (listMo21520a2 != null && !listMo21520a2.isEmpty()) {
                    arrayList.addAll(m4657D(listMo21520a2, bool));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public final void m4658F(AbstractC10313b parentNode, int i10, AbstractC10313b data) {
        AbstractC9979u.m20294g(parentNode, "parentNode");
        AbstractC9979u.m20294g(data, "data");
        List listMo21520a = parentNode.mo21520a();
        if (listMo21520a != null) {
            listMo21520a.add(i10, data);
            if (!(parentNode instanceof AbstractC10312a) || ((AbstractC10312a) parentNode).m21518b()) {
                addData(getData().indexOf(parentNode) + 1 + i10, data);
            }
        }
    }

    /* renamed from: G */
    public final int m4659G(int i10) {
        AbstractC10313b abstractC10313b;
        List listMo21520a;
        if (i10 >= getData().size() || (listMo21520a = (abstractC10313b = getData().get(i10)).mo21520a()) == null || listMo21520a.isEmpty()) {
            return 0;
        }
        if (!(abstractC10313b instanceof AbstractC10312a)) {
            List listMo21520a2 = abstractC10313b.mo21520a();
            AbstractC9979u.m20291d(listMo21520a2);
            List listM4653E = m4653E(this, listMo21520a2, null, 2, null);
            getData().removeAll(listM4653E);
            return listM4653E.size();
        }
        if (!((AbstractC10312a) abstractC10313b).m21518b()) {
            return 0;
        }
        List listMo21520a3 = abstractC10313b.mo21520a();
        AbstractC9979u.m20291d(listMo21520a3);
        List listM4653E2 = m4653E(this, listMo21520a3, null, 2, null);
        getData().removeAll(listM4653E2);
        return listM4653E2.size();
    }

    /* renamed from: H */
    public final int m4660H(int i10) {
        if (i10 >= getData().size()) {
            return 0;
        }
        int iM4659G = m4659G(i10);
        getData().remove(i10);
        int i11 = iM4659G + 1;
        getData().get(i10);
        return i11;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void setData(int i10, AbstractC10313b data) {
        AbstractC9979u.m20294g(data, "data");
        int iM4660H = m4660H(i10);
        List listM4653E = m4653E(this, AbstractC10978w.m24129g(data), null, 2, null);
        getData().addAll(i10, listM4653E);
        if (iM4660H == listM4653E.size()) {
            notifyItemRangeChanged(i10 + getHeaderLayoutCount(), iM4660H);
        } else {
            notifyItemRangeRemoved(getHeaderLayoutCount() + i10, iM4660H);
            notifyItemRangeInserted(i10 + getHeaderLayoutCount(), listM4653E.size());
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int i10) {
        return super.isFixedViewType(i10) || this.f5407b.contains(Integer.valueOf(i10));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* renamed from: m */
    public void mo4662m(BaseItemProvider provider) {
        AbstractC9979u.m20294g(provider, "provider");
        if (!(provider instanceof AbstractC10718a)) {
            throw new IllegalStateException("Please add BaseNodeProvider, no BaseItemProvider!");
        }
        super.mo4662m(provider);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int i10) {
        notifyItemRangeRemoved(i10 + getHeaderLayoutCount(), m4660H(i10));
        compatibilityDataSizeChanged(0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(List list, Runnable runnable) {
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(m4653E(this, list != null ? list : new ArrayList(), null, 2, null), runnable);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setList(Collection collection) {
        if (collection == null) {
            collection = new ArrayList();
        }
        super.setList(m4653E(this, collection, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewInstance(List list) {
        super.setNewInstance(m4653E(this, list != null ? list : new ArrayList(), null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void addData(int i10, AbstractC10313b data) {
        AbstractC9979u.m20294g(data, "data");
        addData(i10, (Collection) AbstractC10978w.m24129g(data));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void addData(AbstractC10313b data) {
        AbstractC9979u.m20294g(data, "data");
        addData((Collection) AbstractC10978w.m24129g(data));
    }

    /* renamed from: z */
    public final void m4665z(AbstractC10718a provider) {
        AbstractC9979u.m20294g(provider, "provider");
        mo4662m(provider);
    }

    public /* synthetic */ BaseNodeAdapter(List list, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : list);
    }

    public BaseNodeAdapter(List list) {
        super(null);
        this.f5407b = new HashSet();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        getData().addAll(m4653E(this, list2, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int i10, Collection newData) {
        AbstractC9979u.m20294g(newData, "newData");
        super.addData(i10, (Collection) m4653E(this, newData, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(DiffUtil.DiffResult diffResult, List list) {
        AbstractC9979u.m20294g(diffResult, "diffResult");
        AbstractC9979u.m20294g(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(diffResult, m4653E(this, list, null, 2, null));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(Collection newData) {
        AbstractC9979u.m20294g(newData, "newData");
        super.addData((Collection) m4653E(this, newData, null, 2, null));
    }
}
