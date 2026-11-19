package com.friday.document.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import coil3.C5480l;
import coil3.InterfaceC5470e;
import com.friday.document.R$drawable;
import com.friday.document.R$string;
import com.friday.document.adapter.TeacherListShareAdapter;
import com.friday.document.databinding.ItemFragmentShareByTeacherBinding;
import com.friday.document.model.TchByCloudEntity;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p380w.AbstractC11630j;
import p380w.C11627g;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TeacherListShareAdapter extends ListAdapter<TchByCloudEntity, ViewHolder> {

    /* renamed from: a */
    public final InterfaceC9540l f6267a;

    @StabilityInferred(parameters = 0)
    public static final class ShareByTchDiffUtilCallBack extends DiffUtil.ItemCallback<TchByCloudEntity> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(TchByCloudEntity oldItem, TchByCloudEntity newItem) {
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            return oldItem.getTeacherId() == newItem.getTeacherId() && AbstractC9979u.m20289b(oldItem.getTeacherName(), newItem.getTeacherName()) && AbstractC9979u.m20289b(oldItem.getUpdateTime(), newItem.getUpdateTime()) && AbstractC9979u.m20289b(oldItem.getPicture(), newItem.getPicture());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(TchByCloudEntity oldItem, TchByCloudEntity newItem) {
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            return oldItem.getTeacherId() == newItem.getTeacherId();
        }
    }

    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemFragmentShareByTeacherBinding f6268c;

        /* renamed from: d */
        public final InterfaceC9540l f6269d;

        /* renamed from: e */
        public final /* synthetic */ TeacherListShareAdapter f6270e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(final TeacherListShareAdapter teacherListShareAdapter, ItemFragmentShareByTeacherBinding binding, InterfaceC9540l onItemClick) {
            super(binding.getRoot());
            AbstractC9979u.m20294g(binding, "binding");
            AbstractC9979u.m20294g(onItemClick, "onItemClick");
            this.f6270e = teacherListShareAdapter;
            this.f6268c = binding;
            this.f6269d = onItemClick;
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o2.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TeacherListShareAdapter.ViewHolder.m5510b(teacherListShareAdapter, this, view);
                }
            });
        }

        /* renamed from: b */
        public static final void m5510b(TeacherListShareAdapter teacherListShareAdapter, ViewHolder viewHolder, View view) {
            TchByCloudEntity tchByCloudEntityM5503a = TeacherListShareAdapter.m5503a(teacherListShareAdapter, viewHolder.getBindingAdapterPosition());
            InterfaceC9540l interfaceC9540l = viewHolder.f6269d;
            AbstractC9979u.m20291d(tchByCloudEntityM5503a);
            interfaceC9540l.invoke(tchByCloudEntityM5503a);
        }

        /* renamed from: c */
        public final void m5511c(TchByCloudEntity item) {
            AbstractC9979u.m20294g(item, "item");
            ItemFragmentShareByTeacherBinding itemFragmentShareByTeacherBinding = this.f6268c;
            itemFragmentShareByTeacherBinding.f6470e.setText(itemFragmentShareByTeacherBinding.getRoot().getContext().getString(R$string.teacher_name, item.getTeacherName()));
            ItemFragmentShareByTeacherBinding itemFragmentShareByTeacherBinding2 = this.f6268c;
            itemFragmentShareByTeacherBinding2.f6471f.setText(itemFragmentShareByTeacherBinding2.getRoot().getContext().getString(R$string.update_time, item.getUpdateTime()));
            if (item.getPicture() == null) {
                this.f6268c.f6468c.setImageResource(R$drawable.dialogue_ic_head_portrait);
                return;
            }
            ShapeableImageView imgHead = this.f6268c.f6468c;
            AbstractC9979u.m20293f(imgHead, "imgHead");
            String picture = item.getPicture();
            InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(imgHead.getContext());
            C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(imgHead.getContext()).m25676d(picture), imgHead);
            AbstractC11630j.m25739p(aVarM25740q, ContextCompat.getDrawable(this.f6268c.getRoot().getContext(), R$drawable.dialogue_ic_head_portrait));
            AbstractC11630j.m25726c(aVarM25740q, ContextCompat.getDrawable(this.f6268c.getRoot().getContext(), R$drawable.dialogue_ic_head_portrait));
            interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeacherListShareAdapter(InterfaceC9540l onItemClick) {
        super(new ShareByTchDiffUtilCallBack());
        AbstractC9979u.m20294g(onItemClick, "onItemClick");
        this.f6267a = onItemClick;
    }

    /* renamed from: a */
    public static final /* synthetic */ TchByCloudEntity m5503a(TeacherListShareAdapter teacherListShareAdapter, int i10) {
        return teacherListShareAdapter.getItem(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        onBindViewHolder(holder, i10, new ArrayList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
        TchByCloudEntity item = getItem(i10);
        AbstractC9979u.m20291d(item);
        holder.m5511c(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemFragmentShareByTeacherBinding itemFragmentShareByTeacherBindingM5527a = ItemFragmentShareByTeacherBinding.m5527a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemFragmentShareByTeacherBindingM5527a, "inflate(...)");
        return new ViewHolder(this, itemFragmentShareByTeacherBindingM5527a, this.f6267a);
    }
}
