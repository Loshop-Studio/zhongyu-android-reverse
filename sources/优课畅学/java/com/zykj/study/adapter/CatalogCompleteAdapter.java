package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5361f;
import com.zykj.study.adapter.CatalogCompleteAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemChapterCompleteBinding;
import com.zykj.study.databinding.ItemKnowledgeCompleteBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8354c;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogCompleteAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: f */
    public static final C7600a f10846f = new C7600a(null);

    /* renamed from: g */
    public static final int f10847g = 8;

    /* renamed from: a */
    public final InterfaceC10570l f10848a;

    /* renamed from: b */
    public final InterfaceC10570l f10849b;

    /* renamed from: c */
    public final List f10850c;

    /* renamed from: d */
    public int f10851d;

    /* renamed from: e */
    public int f10852e;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderChapter extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemChapterCompleteBinding f10853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderChapter(ItemChapterCompleteBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10853a = binding;
        }

        /* renamed from: d */
        public static final void m9922d(InterfaceC10570l interfaceC10570l, SelectModel selectModel, View view) {
            interfaceC10570l.invoke(selectModel.getData());
        }

        /* renamed from: e */
        public static final C8736p m9923e(InterfaceC10570l interfaceC10570l, CatalogBean data) {
            AbstractC9133u.m16133g(data, "data");
            interfaceC10570l.invoke(data);
            return C8736p.f16368a;
        }

        /* renamed from: c */
        public final void m9924c(final InterfaceC10570l progressClickListener, final InterfaceC10570l itemCallBack, final SelectModel item, int i10, boolean z10, int i11) {
            AbstractC9133u.m16133g(progressClickListener, "progressClickListener");
            AbstractC9133u.m16133g(itemCallBack, "itemCallBack");
            AbstractC9133u.m16133g(item, "item");
            ItemChapterCompleteBinding itemChapterCompleteBinding = this.f10853a;
            itemChapterCompleteBinding.setEntity(item);
            itemChapterCompleteBinding.setTotalMember(i10);
            itemChapterCompleteBinding.setIsSelected(z10);
            itemChapterCompleteBinding.setOnArrowClick(new View.OnClickListener() { // from class: n4.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogCompleteAdapter.ViewHolderChapter.m9922d(progressClickListener, item, view);
                }
            });
            List<CatalogBean> children = ((CatalogBean) item.getData()).getChildren();
            if (children != null) {
                itemChapterCompleteBinding.knowView.setTotalMember(i10);
                itemChapterCompleteBinding.knowView.setSelectCatalogId(i11);
                itemChapterCompleteBinding.knowView.setKnowLedge(children);
                itemChapterCompleteBinding.knowView.setProgressClickListener(progressClickListener);
                itemChapterCompleteBinding.knowView.setKnowLedgeClickListener(new InterfaceC10570l() { // from class: n4.h
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return CatalogCompleteAdapter.ViewHolderChapter.m9923e(itemCallBack, (CatalogBean) obj);
                    }
                });
            }
            itemChapterCompleteBinding.executePendingBindings();
        }

        /* renamed from: f */
        public final ItemChapterCompleteBinding m9925f() {
            return this.f10853a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderKnowledge extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemKnowledgeCompleteBinding f10854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderKnowledge(ItemKnowledgeCompleteBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10854a = binding;
        }

        /* renamed from: a */
        public final void m9926a(View.OnClickListener onProgressClick, SelectModel item, int i10, boolean z10) {
            AbstractC9133u.m16133g(onProgressClick, "onProgressClick");
            AbstractC9133u.m16133g(item, "item");
            ItemKnowledgeCompleteBinding itemKnowledgeCompleteBinding = this.f10854a;
            itemKnowledgeCompleteBinding.setEntity((CatalogBean) item.getData());
            itemKnowledgeCompleteBinding.setTotalMember(i10);
            itemKnowledgeCompleteBinding.setOnClick(onProgressClick);
            itemKnowledgeCompleteBinding.setIsSelected(z10);
            itemKnowledgeCompleteBinding.executePendingBindings();
        }

        /* renamed from: b */
        public final ItemKnowledgeCompleteBinding m9927b() {
            return this.f10854a;
        }
    }

    /* renamed from: com.zykj.study.adapter.CatalogCompleteAdapter$a */
    public static final class C7600a {
        public /* synthetic */ C7600a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7600a() {
        }
    }

    public CatalogCompleteAdapter(InterfaceC10570l catalogCallBack, InterfaceC10570l itemCallBack) {
        AbstractC9133u.m16133g(catalogCallBack, "catalogCallBack");
        AbstractC9133u.m16133g(itemCallBack, "itemCallBack");
        this.f10848a = catalogCallBack;
        this.f10849b = itemCallBack;
        this.f10850c = new ArrayList();
        this.f10852e = -1;
    }

    /* renamed from: f */
    public static final C8736p m9914f(CatalogCompleteAdapter catalogCompleteAdapter, int i10, View it) {
        AbstractC9133u.m16133g(it, "it");
        SelectModel selectModel = (SelectModel) catalogCompleteAdapter.f10850c.get(i10);
        selectModel.setSelectModel(!selectModel.isSelectModel());
        if (((CatalogBean) selectModel.getData()).isLeaf()) {
            catalogCompleteAdapter.f10849b.invoke(selectModel.getData());
        }
        catalogCompleteAdapter.notifyItemChanged(i10);
        return C8736p.f16368a;
    }

    /* renamed from: g */
    public static final void m9915g(CatalogCompleteAdapter catalogCompleteAdapter, SelectModel selectModel, View view) {
        catalogCompleteAdapter.f10848a.invoke(selectModel.getData());
    }

    /* renamed from: h */
    public static final void m9916h(CatalogCompleteAdapter catalogCompleteAdapter, SelectModel selectModel, View view) {
        catalogCompleteAdapter.f10849b.invoke(selectModel.getData());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10850c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return ((CatalogBean) ((SelectModel) this.f10850c.get(i10)).getData()).isLeaf() ? 1 : 0;
    }

    /* renamed from: i */
    public final void m9917i(List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f10850c.clear();
        this.f10850c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public final void m9918j(int i10) {
        this.f10852e = i10;
        notifyDataSetChanged();
    }

    /* renamed from: k */
    public final void m9919k(int i10) {
        this.f10851d = i10;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final SelectModel selectModel = (SelectModel) this.f10850c.get(i10);
        int itemViewType = getItemViewType(i10);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                return;
            }
            ViewHolderKnowledge viewHolderKnowledge = (ViewHolderKnowledge) holder;
            viewHolderKnowledge.m9926a(new View.OnClickListener() { // from class: n4.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogCompleteAdapter.m9915g(this.f18519a, selectModel, view);
                }
            }, selectModel, this.f10851d, this.f10852e == ((CatalogBean) selectModel.getData()).getId());
            AbstractC5361f.m2451b(viewHolderKnowledge.m9927b().getRoot(), new View.OnClickListener() { // from class: n4.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogCompleteAdapter.m9916h(this.f18523a, selectModel, view);
                }
            });
            return;
        }
        ViewHolderChapter viewHolderChapter = (ViewHolderChapter) holder;
        viewHolderChapter.m9924c(this.f10848a, this.f10849b, selectModel, this.f10851d, this.f10852e == ((CatalogBean) selectModel.getData()).getId(), this.f10852e);
        View root = viewHolderChapter.m9925f().getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        AbstractC8354c.m13615r(root, new InterfaceC10570l() { // from class: n4.d
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogCompleteAdapter.m9914f(this.f18515a, i10, (View) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        if (i10 == 0) {
            ItemChapterCompleteBinding itemChapterCompleteBindingInflate = ItemChapterCompleteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemChapterCompleteBindingInflate, "inflate(...)");
            return new ViewHolderChapter(itemChapterCompleteBindingInflate);
        }
        if (i10 != 1) {
            ItemChapterCompleteBinding itemChapterCompleteBindingInflate2 = ItemChapterCompleteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemChapterCompleteBindingInflate2, "inflate(...)");
            return new ViewHolderChapter(itemChapterCompleteBindingInflate2);
        }
        ItemKnowledgeCompleteBinding itemKnowledgeCompleteBindingInflate = ItemKnowledgeCompleteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemKnowledgeCompleteBindingInflate, "inflate(...)");
        return new ViewHolderKnowledge(itemKnowledgeCompleteBindingInflate);
    }
}
