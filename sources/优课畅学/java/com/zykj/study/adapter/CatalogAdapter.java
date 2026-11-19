package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5361f;
import com.zykj.study.adapter.CatalogAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemChapterBinding;
import com.zykj.study.databinding.ItemKnowledgeBinding;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8354c;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d */
    public static final C7599a f10839d = new C7599a(null);

    /* renamed from: e */
    public static final int f10840e = 8;

    /* renamed from: a */
    public final List f10841a;

    /* renamed from: b */
    public final HashSet f10842b;

    /* renamed from: c */
    public final InterfaceC10570l f10843c;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderChapter extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemChapterBinding f10844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderChapter(ItemChapterBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10844a = binding;
        }

        /* renamed from: c */
        public static final C8736p m9906c(InterfaceC10570l interfaceC10570l, CatalogBean catalog) {
            AbstractC9133u.m16133g(catalog, "catalog");
            interfaceC10570l.invoke(catalog);
            return C8736p.f16368a;
        }

        /* renamed from: b */
        public final void m9907b(SelectModel item, final InterfaceC10570l openKnowLedge) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(openKnowLedge, "openKnowLedge");
            ItemChapterBinding itemChapterBinding = this.f10844a;
            itemChapterBinding.setEntity(item);
            List<CatalogBean> children = ((CatalogBean) item.getData()).getChildren();
            if (children != null) {
                itemChapterBinding.knowView.setKnowLedge(children);
                itemChapterBinding.knowView.setKnowLedgeClickListener(new InterfaceC10570l() { // from class: n4.c
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return CatalogAdapter.ViewHolderChapter.m9906c(openKnowLedge, (CatalogBean) obj);
                    }
                });
            }
            itemChapterBinding.executePendingBindings();
        }

        /* renamed from: d */
        public final ItemChapterBinding m9908d() {
            return this.f10844a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderKnowledge extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemKnowledgeBinding f10845a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderKnowledge(ItemKnowledgeBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10845a = binding;
        }

        /* renamed from: a */
        public final void m9909a(SelectModel item) {
            AbstractC9133u.m16133g(item, "item");
            ItemKnowledgeBinding itemKnowledgeBinding = this.f10845a;
            itemKnowledgeBinding.setEntity((CatalogBean) item.getData());
            itemKnowledgeBinding.executePendingBindings();
        }

        /* renamed from: b */
        public final ItemKnowledgeBinding m9910b() {
            return this.f10845a;
        }
    }

    /* renamed from: com.zykj.study.adapter.CatalogAdapter$a */
    public static final class C7599a {
        public /* synthetic */ C7599a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7599a() {
        }
    }

    public CatalogAdapter(List list, HashSet selectModel, InterfaceC10570l openKnowLedge) {
        AbstractC9133u.m16133g(list, "list");
        AbstractC9133u.m16133g(selectModel, "selectModel");
        AbstractC9133u.m16133g(openKnowLedge, "openKnowLedge");
        this.f10841a = list;
        this.f10842b = selectModel;
        this.f10843c = openKnowLedge;
    }

    /* renamed from: e */
    public static final C8736p m9903e(SelectModel selectModel, CatalogAdapter catalogAdapter, int i10, View it) {
        AbstractC9133u.m16133g(it, "it");
        selectModel.setSelectModel(!selectModel.isSelectModel());
        if (selectModel.isSelectModel()) {
            catalogAdapter.f10842b.add(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        } else {
            catalogAdapter.f10842b.remove(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        }
        if (((CatalogBean) selectModel.getData()).isLeaf()) {
            catalogAdapter.f10843c.invoke(selectModel.getData());
        }
        catalogAdapter.notifyItemChanged(i10);
        return C8736p.f16368a;
    }

    /* renamed from: f */
    public static final void m9904f(CatalogAdapter catalogAdapter, int i10, View view) {
        SelectModel selectModel = (SelectModel) catalogAdapter.f10841a.get(i10);
        selectModel.setSelectModel(!selectModel.isSelectModel());
        if (selectModel.isSelectModel()) {
            catalogAdapter.f10842b.add(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        } else {
            catalogAdapter.f10842b.remove(Integer.valueOf(((CatalogBean) selectModel.getData()).getId()));
        }
        if (((CatalogBean) selectModel.getData()).isLeaf()) {
            catalogAdapter.f10843c.invoke(selectModel.getData());
        }
        catalogAdapter.notifyItemChanged(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10841a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return ((CatalogBean) ((SelectModel) this.f10841a.get(i10)).getData()).isLeaf() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final SelectModel selectModel = (SelectModel) this.f10841a.get(i10);
        int itemViewType = getItemViewType(i10);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                return;
            }
            ViewHolderKnowledge viewHolderKnowledge = (ViewHolderKnowledge) holder;
            viewHolderKnowledge.m9909a(selectModel);
            AbstractC5361f.m2451b(viewHolderKnowledge.m9910b().getRoot(), new View.OnClickListener() { // from class: n4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogAdapter.m9904f(this.f18508a, i10, view);
                }
            });
            return;
        }
        ViewHolderChapter viewHolderChapter = (ViewHolderChapter) holder;
        viewHolderChapter.m9907b(selectModel, this.f10843c);
        View root = viewHolderChapter.m9908d().getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        AbstractC8354c.m13615r(root, new InterfaceC10570l() { // from class: n4.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogAdapter.m9903e(selectModel, this, i10, (View) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        if (i10 == 0) {
            ItemChapterBinding itemChapterBindingInflate = ItemChapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemChapterBindingInflate, "inflate(...)");
            return new ViewHolderChapter(itemChapterBindingInflate);
        }
        if (i10 != 1) {
            ItemChapterBinding itemChapterBindingInflate2 = ItemChapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemChapterBindingInflate2, "inflate(...)");
            return new ViewHolderChapter(itemChapterBindingInflate2);
        }
        ItemKnowledgeBinding itemKnowledgeBindingInflate = ItemKnowledgeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemKnowledgeBindingInflate, "inflate(...)");
        return new ViewHolderKnowledge(itemKnowledgeBindingInflate);
    }
}
