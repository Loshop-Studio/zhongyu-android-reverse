package com.chad.library.adapter.base;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p227r0.AbstractC9900a;
import p227r0.AbstractC9901b;
import p260u0.AbstractC10163a;

/* loaded from: classes3.dex */
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<AbstractC9901b> {

    /* renamed from: w */
    public final HashSet f3637w;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseNodeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: o0 */
    public static /* synthetic */ int m3456o0(BaseNodeAdapter baseNodeAdapter, int i10, boolean z10, boolean z11, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandOrCollapse");
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.m3464n0(i10, z10, z11, obj);
    }

    /* renamed from: q0 */
    public static /* synthetic */ List m3457q0(BaseNodeAdapter baseNodeAdapter, Collection collection, Boolean bool, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flatData");
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return baseNodeAdapter.m3465p0(collection, bool);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: H */
    public boolean mo3458H(int i10) {
        return super.mo3458H(i10) || this.f3637w.contains(Integer.valueOf(i10));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: R */
    public void mo3459R(Collection collection) {
        if (collection == null) {
            collection = new ArrayList();
        }
        super.mo3459R(m3457q0(this, collection, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* renamed from: Z */
    public void mo3460Z(BaseItemProvider provider) {
        AbstractC9133u.m16133g(provider, "provider");
        if (!(provider instanceof AbstractC10163a)) {
            throw new IllegalStateException("Please add BaseNodeProvider, no BaseItemProvider!");
        }
        super.mo3460Z(provider);
    }

    /* renamed from: k0 */
    public final void m3461k0(AbstractC10163a provider) {
        AbstractC9133u.m16133g(provider, "provider");
        mo3460Z(provider);
    }

    /* renamed from: l0 */
    public final int m3462l0(int i10, boolean z10, boolean z11, boolean z12, Object obj) {
        AbstractC9901b abstractC9901b = (AbstractC9901b) m3509o().get(i10);
        if (abstractC9901b instanceof AbstractC9900a) {
            AbstractC9900a abstractC9900a = (AbstractC9900a) abstractC9901b;
            if (abstractC9900a.isExpanded()) {
                int iM3514u = i10 + m3514u();
                abstractC9900a.setExpanded(false);
                List childNode = abstractC9901b.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List childNode2 = abstractC9901b.getChildNode();
                    AbstractC9133u.m16130d(childNode2);
                    List listM3465p0 = m3465p0(childNode2, z10 ? Boolean.FALSE : null);
                    int size = listM3465p0.size();
                    m3509o().removeAll(listM3465p0);
                    if (z12) {
                        if (z11) {
                            notifyItemChanged(iM3514u, obj);
                            notifyItemRangeRemoved(iM3514u + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(iM3514u, obj);
            }
        }
        return 0;
    }

    /* renamed from: m0 */
    public final int m3463m0(int i10, boolean z10, boolean z11, boolean z12, Object obj) {
        AbstractC9901b abstractC9901b = (AbstractC9901b) m3509o().get(i10);
        if (abstractC9901b instanceof AbstractC9900a) {
            AbstractC9900a abstractC9900a = (AbstractC9900a) abstractC9901b;
            if (!abstractC9900a.isExpanded()) {
                int iM3514u = m3514u() + i10;
                abstractC9900a.setExpanded(true);
                List childNode = abstractC9901b.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List childNode2 = abstractC9901b.getChildNode();
                    AbstractC9133u.m16130d(childNode2);
                    List listM3465p0 = m3465p0(childNode2, z10 ? Boolean.TRUE : null);
                    int size = listM3465p0.size();
                    m3509o().addAll(i10 + 1, listM3465p0);
                    if (z12) {
                        if (z11) {
                            notifyItemChanged(iM3514u, obj);
                            notifyItemRangeInserted(iM3514u + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(iM3514u, obj);
            }
        }
        return 0;
    }

    /* renamed from: n0 */
    public final int m3464n0(int i10, boolean z10, boolean z11, Object obj) {
        AbstractC9901b abstractC9901b = (AbstractC9901b) m3509o().get(i10);
        if (abstractC9901b instanceof AbstractC9900a) {
            return ((AbstractC9900a) abstractC9901b).isExpanded() ? m3462l0(i10, false, z10, z11, obj) : m3463m0(i10, false, z10, z11, obj);
        }
        return 0;
    }

    /* renamed from: p0 */
    public final List m3465p0(Collection collection, Boolean bool) {
        List childNode;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC9901b abstractC9901b = (AbstractC9901b) it.next();
            arrayList.add(abstractC9901b);
            if (abstractC9901b instanceof AbstractC9900a) {
                if ((AbstractC9133u.m16128b(bool, Boolean.TRUE) || ((AbstractC9900a) abstractC9901b).isExpanded()) && (childNode = abstractC9901b.getChildNode()) != null && !childNode.isEmpty()) {
                    arrayList.addAll(m3465p0(childNode, bool));
                }
                if (bool != null) {
                    ((AbstractC9900a) abstractC9901b).setExpanded(bool.booleanValue());
                }
            } else {
                List childNode2 = abstractC9901b.getChildNode();
                if (childNode2 != null && !childNode2.isEmpty()) {
                    arrayList.addAll(m3465p0(childNode2, bool));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: r0 */
    public final void m3466r0(AbstractC9901b parentNode, Collection newData) {
        AbstractC9133u.m16133g(parentNode, "parentNode");
        AbstractC9133u.m16133g(newData, "newData");
        List childNode = parentNode.getChildNode();
        if (childNode != null) {
            if ((parentNode instanceof AbstractC9900a) && !((AbstractC9900a) parentNode).isExpanded()) {
                childNode.clear();
                childNode.addAll(newData);
                return;
            }
            int iIndexOf = m3509o().indexOf(parentNode);
            int iM3467s0 = m3467s0(iIndexOf);
            childNode.clear();
            childNode.addAll(newData);
            List listM3457q0 = m3457q0(this, newData, null, 2, null);
            int i10 = iIndexOf + 1;
            m3509o().addAll(i10, listM3457q0);
            int iM3514u = i10 + m3514u();
            if (iM3467s0 == listM3457q0.size()) {
                notifyItemRangeChanged(iM3514u, iM3467s0);
            } else {
                notifyItemRangeRemoved(iM3514u, iM3467s0);
                notifyItemRangeInserted(iM3514u, listM3457q0.size());
            }
        }
    }

    /* renamed from: s0 */
    public final int m3467s0(int i10) {
        AbstractC9901b abstractC9901b;
        List childNode;
        if (i10 >= m3509o().size() || (childNode = (abstractC9901b = (AbstractC9901b) m3509o().get(i10)).getChildNode()) == null || childNode.isEmpty()) {
            return 0;
        }
        if (!(abstractC9901b instanceof AbstractC9900a)) {
            List childNode2 = abstractC9901b.getChildNode();
            AbstractC9133u.m16130d(childNode2);
            List listM3457q0 = m3457q0(this, childNode2, null, 2, null);
            m3509o().removeAll(listM3457q0);
            return listM3457q0.size();
        }
        if (!((AbstractC9900a) abstractC9901b).isExpanded()) {
            return 0;
        }
        List childNode3 = abstractC9901b.getChildNode();
        AbstractC9133u.m16130d(childNode3);
        List listM3457q02 = m3457q0(this, childNode3, null, 2, null);
        m3509o().removeAll(listM3457q02);
        return listM3457q02.size();
    }

    public /* synthetic */ BaseNodeAdapter(List list, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : list);
    }

    public BaseNodeAdapter(List list) {
        super(null);
        this.f3637w = new HashSet();
        if (list == null || list.isEmpty()) {
            return;
        }
        m3509o().addAll(m3457q0(this, list, null, 2, null));
    }
}
