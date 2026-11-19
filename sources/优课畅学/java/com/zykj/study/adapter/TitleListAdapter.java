package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.TitleListAdapter;
import com.zykj.study.bean.teach.GetQuizDetailBean;
import com.zykj.study.databinding.ItemTitleListBinding;
import com.zykj.study.databinding.ItemTitleListHeaderBinding;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TitleListAdapter extends ListAdapter<GetQuizDetailBean, RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final C7611a f10969b = new C7611a(null);

    /* renamed from: c */
    public static final int f10970c = 8;

    /* renamed from: a */
    public final InterfaceC10574p f10971a;

    @StabilityInferred(parameters = 0)
    public static final class DiffCallback extends DiffUtil.ItemCallback<GetQuizDetailBean> {

        /* renamed from: a */
        public static final DiffCallback f10972a = new DiffCallback();

        /* renamed from: b */
        public static final int f10973b = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(GetQuizDetailBean oldItem, GetQuizDetailBean newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return AbstractC9133u.m16128b(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(GetQuizDetailBean oldItem, GetQuizDetailBean newItem) {
            AbstractC9133u.m16133g(oldItem, "oldItem");
            AbstractC9133u.m16133g(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    public final class HeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemTitleListHeaderBinding f10974a;

        /* renamed from: b */
        public final /* synthetic */ TitleListAdapter f10975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(TitleListAdapter titleListAdapter, ItemTitleListHeaderBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10975b = titleListAdapter;
            this.f10974a = binding;
        }

        /* renamed from: a */
        public final ItemTitleListHeaderBinding m10142a() {
            return this.f10974a;
        }
    }

    public final class ItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemTitleListBinding f10976a;

        /* renamed from: b */
        public final /* synthetic */ TitleListAdapter f10977b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(TitleListAdapter titleListAdapter, ItemTitleListBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10977b = titleListAdapter;
            this.f10976a = binding;
        }

        /* renamed from: a */
        public final ItemTitleListBinding m10143a() {
            return this.f10976a;
        }
    }

    /* renamed from: com.zykj.study.adapter.TitleListAdapter$a */
    public static final class C7611a {
        public /* synthetic */ C7611a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7611a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleListAdapter(InterfaceC10574p onclickListener) {
        super(DiffCallback.f10972a);
        AbstractC9133u.m16133g(onclickListener, "onclickListener");
        this.f10971a = onclickListener;
    }

    /* renamed from: e */
    public static final void m10138e(TitleListAdapter titleListAdapter, GetQuizDetailBean getQuizDetailBean, View view) {
        InterfaceC10574p interfaceC10574p = titleListAdapter.f10971a;
        AbstractC9133u.m16130d(getQuizDetailBean);
        interfaceC10574p.invoke(0, getQuizDetailBean);
    }

    /* renamed from: f */
    public static final void m10139f(TitleListAdapter titleListAdapter, int i10, GetQuizDetailBean getQuizDetailBean, View view) {
        InterfaceC10574p interfaceC10574p = titleListAdapter.f10971a;
        Integer numValueOf = Integer.valueOf(i10);
        AbstractC9133u.m16130d(getQuizDetailBean);
        interfaceC10574p.invoke(numValueOf, getQuizDetailBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final GetQuizDetailBean item = getItem(i10);
        if (holder instanceof HeaderViewHolder) {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;
            headerViewHolder.m10142a().tvLinearlayout.setSelected(item.isSelected());
            headerViewHolder.m10142a().tvHead.setText(item.getTitle());
            headerViewHolder.m10142a().tvLinearlayout.setOnClickListener(new View.OnClickListener() { // from class: n4.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TitleListAdapter.m10138e(this.f18602a, item, view);
                }
            });
            return;
        }
        if (holder instanceof ItemViewHolder) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            itemViewHolder.m10143a().tvLinearlayout.setSelected(item.isSelected());
            itemViewHolder.m10143a().tvHead.setText(item.getTitle());
            itemViewHolder.m10143a().tvLinearlayout.setOnClickListener(new View.OnClickListener() { // from class: n4.z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TitleListAdapter.m10139f(this.f18605a, i10, item, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == 0) {
            ItemTitleListHeaderBinding itemTitleListHeaderBindingInflate = ItemTitleListHeaderBinding.inflate(layoutInflaterFrom, parent, false);
            AbstractC9133u.m16132f(itemTitleListHeaderBindingInflate, "inflate(...)");
            return new HeaderViewHolder(this, itemTitleListHeaderBindingInflate);
        }
        ItemTitleListBinding itemTitleListBindingInflate = ItemTitleListBinding.inflate(layoutInflaterFrom, parent, false);
        AbstractC9133u.m16132f(itemTitleListBindingInflate, "inflate(...)");
        return new ItemViewHolder(this, itemTitleListBindingInflate);
    }
}
