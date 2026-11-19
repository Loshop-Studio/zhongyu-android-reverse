package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import com.zykj.study.adapter.StudentViewMemberItemAdapter;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.databinding.ItemSuperviseGroupMemberItemBinding;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentViewMemberItemAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final SuperviseGroup f10954a;

    /* renamed from: b */
    public final MutableLiveData f10955b;

    /* renamed from: c */
    public final InterfaceC10574p f10956c;

    /* renamed from: d */
    public final List f10957d;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemSuperviseGroupMemberItemBinding f10958a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemSuperviseGroupMemberItemBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10958a = binding;
        }

        /* renamed from: a */
        public final void m10114a(SuperviseGroupMember item, MutableLiveData superviseGroupMember, View.OnClickListener onclick) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
            AbstractC9133u.m16133g(onclick, "onclick");
            ItemSuperviseGroupMemberItemBinding itemSuperviseGroupMemberItemBinding = this.f10958a;
            itemSuperviseGroupMemberItemBinding.setEntity(item);
            itemSuperviseGroupMemberItemBinding.setOnclick(onclick);
            itemSuperviseGroupMemberItemBinding.setIsSelected(AbstractC9133u.m16128b(superviseGroupMember.getValue(), item));
            MaterialProgressBar materialProgressBar = itemSuperviseGroupMemberItemBinding.progressBar2;
            Integer progress = item.getProgress();
            materialProgressBar.setProgress(progress != null ? progress.intValue() : 0);
            itemSuperviseGroupMemberItemBinding.executePendingBindings();
        }
    }

    public StudentViewMemberItemAdapter(SuperviseGroup superviseGroup, MutableLiveData superviseGroupMember, InterfaceC10574p memberClick) {
        AbstractC9133u.m16133g(superviseGroup, "superviseGroup");
        AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
        AbstractC9133u.m16133g(memberClick, "memberClick");
        this.f10954a = superviseGroup;
        this.f10955b = superviseGroupMember;
        this.f10956c = memberClick;
        this.f10957d = superviseGroup.getMemberList();
    }

    /* renamed from: e */
    public static final void m10111e(StudentViewMemberItemAdapter studentViewMemberItemAdapter, int i10, View view) {
        studentViewMemberItemAdapter.f10956c.invoke(studentViewMemberItemAdapter.f10954a, studentViewMemberItemAdapter.f10957d.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        holder.m10114a((SuperviseGroupMember) this.f10957d.get(i10), this.f10955b, new View.OnClickListener() { // from class: n4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentViewMemberItemAdapter.m10111e(this.f18582a, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemSuperviseGroupMemberItemBinding itemSuperviseGroupMemberItemBindingInflate = ItemSuperviseGroupMemberItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemSuperviseGroupMemberItemBindingInflate, "inflate(...)");
        return new ViewHolder(itemSuperviseGroupMemberItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10957d.size();
    }
}
