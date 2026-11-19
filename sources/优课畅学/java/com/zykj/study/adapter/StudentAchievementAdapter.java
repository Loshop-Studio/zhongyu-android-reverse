package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.StudentAchievementAdapter;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.databinding.ItemStudentAchievementBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentAchievementAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final InterfaceC10574p f10945a;

    /* renamed from: b */
    public final List f10946b;

    /* renamed from: c */
    public boolean f10947c;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemStudentAchievementBinding f10948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemStudentAchievementBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10948a = binding;
        }

        /* renamed from: a */
        public final void m10096a(SuperviseGroupMember item, boolean z10) {
            AbstractC9133u.m16133g(item, "item");
            ItemStudentAchievementBinding itemStudentAchievementBinding = this.f10948a;
            itemStudentAchievementBinding.setEntity(item);
            itemStudentAchievementBinding.executePendingBindings();
        }

        /* renamed from: b */
        public final ItemStudentAchievementBinding m10097b() {
            return this.f10948a;
        }
    }

    public StudentAchievementAdapter(InterfaceC10574p onclick) {
        AbstractC9133u.m16133g(onclick, "onclick");
        this.f10945a = onclick;
        this.f10946b = new ArrayList();
    }

    /* renamed from: e */
    public static final void m10092e(StudentAchievementAdapter studentAchievementAdapter, SuperviseGroupMember superviseGroupMember, View view) {
        studentAchievementAdapter.f10945a.invoke(Integer.valueOf(superviseGroupMember.getGroupId()), superviseGroupMember.getUserId());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final SuperviseGroupMember superviseGroupMember = (SuperviseGroupMember) this.f10946b.get(i10);
        holder.m10096a(superviseGroupMember, this.f10947c);
        holder.m10097b().ivDetail.setOnClickListener(new View.OnClickListener() { // from class: n4.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentAchievementAdapter.m10092e(this.f18567a, superviseGroupMember, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemStudentAchievementBinding itemStudentAchievementBindingInflate = ItemStudentAchievementBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemStudentAchievementBindingInflate, "inflate(...)");
        return new ViewHolder(itemStudentAchievementBindingInflate);
    }

    /* renamed from: g */
    public final void m10095g(List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f10946b.clear();
        this.f10946b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10946b.size();
    }
}
