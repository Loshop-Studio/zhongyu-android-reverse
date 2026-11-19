package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5361f;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.adapter.CatalogProgressAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemChapterProgressBinding;
import com.zykj.study.databinding.ItemKnowledgeProgressBinding;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8354c;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogProgressAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: e */
    public static final C7603a f10864e = new C7603a(null);

    /* renamed from: f */
    public static final int f10865f = 8;

    /* renamed from: a */
    public final boolean f10866a;

    /* renamed from: b */
    public final HashSet f10867b;

    /* renamed from: c */
    public final InterfaceC10570l f10868c;

    /* renamed from: d */
    public List f10869d;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderChapter extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemChapterProgressBinding f10870a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderChapter(ItemChapterProgressBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10870a = binding;
        }

        /* renamed from: c */
        public static final C8736p m9948c(boolean z10, InterfaceC10570l interfaceC10570l, CatalogBean catalog) {
            AbstractC9133u.m16133g(catalog, "catalog");
            if (z10 || catalog.getLocked() == 0) {
                interfaceC10570l.invoke(catalog);
                return C8736p.f16368a;
            }
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "内容尚未开放");
            return C8736p.f16368a;
        }

        /* renamed from: b */
        public final void m9949b(final boolean z10, SelectModel item, final InterfaceC10570l openKnowLedge) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(openKnowLedge, "openKnowLedge");
            ItemChapterProgressBinding itemChapterProgressBinding = this.f10870a;
            itemChapterProgressBinding.setEntity(item);
            List<CatalogBean> children = ((CatalogBean) item.getData()).getChildren();
            if (children != null) {
                itemChapterProgressBinding.knowView.m11916g(z10, children);
                itemChapterProgressBinding.knowView.setKnowLedgeClickListener(new InterfaceC10570l() { // from class: n4.m
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return CatalogProgressAdapter.ViewHolderChapter.m9948c(z10, openKnowLedge, (CatalogBean) obj);
                    }
                });
            }
            itemChapterProgressBinding.executePendingBindings();
        }

        /* renamed from: d */
        public final ItemChapterProgressBinding m9950d() {
            return this.f10870a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderKnowledge extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemKnowledgeProgressBinding f10871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderKnowledge(ItemKnowledgeProgressBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10871a = binding;
        }

        /* renamed from: a */
        public final void m9951a(SelectModel item) {
            AbstractC9133u.m16133g(item, "item");
            ItemKnowledgeProgressBinding itemKnowledgeProgressBinding = this.f10871a;
            itemKnowledgeProgressBinding.setEntity((CatalogBean) item.getData());
            itemKnowledgeProgressBinding.setIsTeacher(itemKnowledgeProgressBinding.getIsTeacher());
            itemKnowledgeProgressBinding.executePendingBindings();
        }

        /* renamed from: b */
        public final ItemKnowledgeProgressBinding m9952b() {
            return this.f10871a;
        }
    }

    /* renamed from: com.zykj.study.adapter.CatalogProgressAdapter$a */
    public static final class C7603a {
        public /* synthetic */ C7603a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7603a() {
        }
    }

    public CatalogProgressAdapter(boolean z10, HashSet selectModel, InterfaceC10570l openKnowLedge) {
        AbstractC9133u.m16133g(selectModel, "selectModel");
        AbstractC9133u.m16133g(openKnowLedge, "openKnowLedge");
        this.f10866a = z10;
        this.f10867b = selectModel;
        this.f10868c = openKnowLedge;
        this.f10869d = new ArrayList();
    }

    /* renamed from: e */
    public static final C8736p m9944e(SelectModel selectModel, CatalogProgressAdapter catalogProgressAdapter, int i10, View it) {
        AbstractC9133u.m16133g(it, "it");
        selectModel.setSelectModel(!selectModel.isSelectModel());
        if (selectModel.isSelectModel()) {
            catalogProgressAdapter.f10867b.add(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        } else {
            catalogProgressAdapter.f10867b.remove(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        }
        catalogProgressAdapter.notifyItemChanged(i10);
        return C8736p.f16368a;
    }

    /* renamed from: f */
    public static final void m9945f(SelectModel selectModel, CatalogProgressAdapter catalogProgressAdapter, int i10, View view) {
        selectModel.setSelectModel(!selectModel.isSelectModel());
        if (selectModel.isSelectModel()) {
            catalogProgressAdapter.f10867b.add(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        } else {
            catalogProgressAdapter.f10867b.remove(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        }
        if (((CatalogBean) selectModel.getData()).isLeaf()) {
            if (!catalogProgressAdapter.f10866a && ((CatalogBean) selectModel.getData()).getLocked() != 0) {
                AbstractC8366o.m13652d(XToastUtils.INSTANCE, "内容尚未开放");
                return;
            }
            catalogProgressAdapter.f10868c.invoke(selectModel.getData());
        }
        catalogProgressAdapter.notifyItemChanged(i10);
    }

    /* renamed from: g */
    public final void m9946g(List newList) {
        AbstractC9133u.m16133g(newList, "newList");
        this.f10869d.clear();
        this.f10869d.addAll(newList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10869d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return ((CatalogBean) ((SelectModel) this.f10869d.get(i10)).getData()).isLeaf() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final SelectModel selectModel = (SelectModel) this.f10869d.get(i10);
        int itemViewType = getItemViewType(i10);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                return;
            }
            ViewHolderKnowledge viewHolderKnowledge = (ViewHolderKnowledge) holder;
            viewHolderKnowledge.m9951a(selectModel);
            AbstractC5361f.m2451b(viewHolderKnowledge.m9952b().getRoot(), new View.OnClickListener() { // from class: n4.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogProgressAdapter.m9945f(selectModel, this, i10, view);
                }
            });
            return;
        }
        ViewHolderChapter viewHolderChapter = (ViewHolderChapter) holder;
        viewHolderChapter.m9949b(this.f10866a, selectModel, this.f10868c);
        View root = viewHolderChapter.m9950d().getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        AbstractC8354c.m13615r(root, new InterfaceC10570l() { // from class: n4.k
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogProgressAdapter.m9944e(selectModel, this, i10, (View) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        if (i10 == 0) {
            ItemChapterProgressBinding itemChapterProgressBindingInflate = ItemChapterProgressBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemChapterProgressBindingInflate, "inflate(...)");
            return new ViewHolderChapter(itemChapterProgressBindingInflate);
        }
        if (i10 != 1) {
            ItemChapterProgressBinding itemChapterProgressBindingInflate2 = ItemChapterProgressBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemChapterProgressBindingInflate2, "inflate(...)");
            return new ViewHolderChapter(itemChapterProgressBindingInflate2);
        }
        ItemKnowledgeProgressBinding itemKnowledgeProgressBindingInflate = ItemKnowledgeProgressBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemKnowledgeProgressBindingInflate, "inflate(...)");
        return new ViewHolderKnowledge(itemKnowledgeProgressBindingInflate);
    }
}
