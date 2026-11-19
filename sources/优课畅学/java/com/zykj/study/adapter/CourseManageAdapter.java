package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.CourseManageAdapter;
import com.zykj.study.bean.course.CatalogManageData;
import com.zykj.study.databinding.ItemChapterManageBinding;
import com.zykj.study.databinding.ItemKnowledgeManageBinding;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CourseManageAdapter extends ListAdapter<CatalogManageData, RecyclerView.ViewHolder> {

    /* renamed from: d */
    public static final C7606a f10885d = new C7606a(null);

    /* renamed from: e */
    public static final int f10886e = 8;

    /* renamed from: a */
    public final InterfaceC10574p f10887a;

    /* renamed from: b */
    public final InterfaceC10574p f10888b;

    /* renamed from: c */
    public final InterfaceC10574p f10889c;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderChapter extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemChapterManageBinding f10890a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderChapter(ItemChapterManageBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10890a = binding;
        }

        /* renamed from: a */
        public final ItemChapterManageBinding m9989a() {
            return this.f10890a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewHolderKnowledge extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemKnowledgeManageBinding f10891a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderKnowledge(ItemKnowledgeManageBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10891a = binding;
        }

        /* renamed from: a */
        public final ItemKnowledgeManageBinding m9990a() {
            return this.f10891a;
        }
    }

    /* renamed from: com.zykj.study.adapter.CourseManageAdapter$a */
    public static final class C7606a {
        public /* synthetic */ C7606a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7606a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseManageAdapter(InterfaceC10574p onChapterClick, InterfaceC10574p onChapterChecked, InterfaceC10574p onKnowledgeChecked) {
        super(new DiffUtil.ItemCallback<CatalogManageData>() { // from class: com.zykj.study.adapter.CourseManageAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(CatalogManageData oldItem, CatalogManageData newItem) {
                AbstractC9133u.m16133g(oldItem, "oldItem");
                AbstractC9133u.m16133g(newItem, "newItem");
                return AbstractC9133u.m16128b(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(CatalogManageData oldItem, CatalogManageData newItem) {
                AbstractC9133u.m16133g(oldItem, "oldItem");
                AbstractC9133u.m16133g(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object getChangePayload(CatalogManageData oldItem, CatalogManageData newItem) {
                AbstractC9133u.m16133g(oldItem, "oldItem");
                AbstractC9133u.m16133g(newItem, "newItem");
                return oldItem.isUnlock() != newItem.isUnlock() ? "isUnlock" : oldItem.isExpanded() != newItem.isExpanded() ? "isExpanded" : super.getChangePayload(oldItem, newItem);
            }
        });
        AbstractC9133u.m16133g(onChapterClick, "onChapterClick");
        AbstractC9133u.m16133g(onChapterChecked, "onChapterChecked");
        AbstractC9133u.m16133g(onKnowledgeChecked, "onKnowledgeChecked");
        this.f10887a = onChapterClick;
        this.f10888b = onChapterChecked;
        this.f10889c = onKnowledgeChecked;
    }

    /* renamed from: f */
    public static final void m9983f(CourseManageAdapter courseManageAdapter, ViewHolderKnowledge viewHolderKnowledge, View view) {
        courseManageAdapter.f10889c.invoke(Long.valueOf(courseManageAdapter.getItem(viewHolderKnowledge.getBindingAdapterPosition()).getId()), Boolean.valueOf(!viewHolderKnowledge.m9990a().switchBtn.isChecked()));
    }

    /* renamed from: g */
    public static final void m9984g(CourseManageAdapter courseManageAdapter, ViewHolderChapter viewHolderChapter, View view) {
        courseManageAdapter.f10887a.invoke(Long.valueOf(courseManageAdapter.getItem(viewHolderChapter.getBindingAdapterPosition()).getId()), Boolean.valueOf(!r3.isExpanded()));
    }

    /* renamed from: h */
    public static final void m9985h(CourseManageAdapter courseManageAdapter, ViewHolderChapter viewHolderChapter, View view) {
        courseManageAdapter.f10888b.invoke(Long.valueOf(courseManageAdapter.getItem(viewHolderChapter.getBindingAdapterPosition()).getId()), Boolean.valueOf(!viewHolderChapter.m9989a().switchBtn.isChecked()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).isLeaf() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10, List payloads) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(payloads, "payloads");
        if (payloads.contains("isUnlock")) {
            CatalogManageData item = getItem(i10);
            if (holder instanceof ViewHolderKnowledge) {
                ((ViewHolderKnowledge) holder).m9990a().switchBtn.setChecked(item.isUnlock());
                return;
            } else if (holder instanceof ViewHolderChapter) {
                ((ViewHolderChapter) holder).m9989a().switchBtn.setChecked(item.isUnlock());
                return;
            } else {
                super.onBindViewHolder(holder, i10, payloads);
                return;
            }
        }
        if (!payloads.contains("isExpanded")) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        CatalogManageData item2 = getItem(i10);
        if (!(holder instanceof ViewHolderChapter)) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        ViewHolderChapter viewHolderChapter = (ViewHolderChapter) holder;
        AppCompatImageView ivExpanded = viewHolderChapter.m9989a().ivExpanded;
        AbstractC9133u.m16132f(ivExpanded, "ivExpanded");
        ivExpanded.setVisibility(item2.isExpanded() ? 0 : 8);
        AppCompatImageView ivUnexpanded = viewHolderChapter.m9989a().ivUnexpanded;
        AbstractC9133u.m16132f(ivUnexpanded, "ivUnexpanded");
        ivUnexpanded.setVisibility(item2.isExpanded() ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        if (i10 == 1) {
            ItemKnowledgeManageBinding itemKnowledgeManageBindingInflate = ItemKnowledgeManageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(itemKnowledgeManageBindingInflate, "inflate(...)");
            final ViewHolderKnowledge viewHolderKnowledge = new ViewHolderKnowledge(itemKnowledgeManageBindingInflate);
            viewHolderKnowledge.m9990a().switchBtn.setOnClickListener(new View.OnClickListener() { // from class: n4.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CourseManageAdapter.m9983f(this.f18584a, viewHolderKnowledge, view);
                }
            });
            return viewHolderKnowledge;
        }
        ItemChapterManageBinding itemChapterManageBindingInflate = ItemChapterManageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemChapterManageBindingInflate, "inflate(...)");
        final ViewHolderChapter viewHolderChapter = new ViewHolderChapter(itemChapterManageBindingInflate);
        viewHolderChapter.m9989a().linearLayout.setOnClickListener(new View.OnClickListener() { // from class: n4.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseManageAdapter.m9984g(this.f18588a, viewHolderChapter, view);
            }
        });
        viewHolderChapter.m9989a().switchBtn.setOnClickListener(new View.OnClickListener() { // from class: n4.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseManageAdapter.m9985h(this.f18591a, viewHolderChapter, view);
            }
        });
        return viewHolderChapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        CatalogManageData item = getItem(i10);
        if (getItemViewType(i10) == 1) {
            ((ViewHolderKnowledge) holder).m9990a().setData(item);
        } else {
            ((ViewHolderChapter) holder).m9989a().setData(item);
        }
    }
}
