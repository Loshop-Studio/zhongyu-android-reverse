package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.StudentViewMemberSearchAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.databinding.ItemSuperviseGroupMemberSearchBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentViewMemberSearchAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final InterfaceC10574p f10959a;

    /* renamed from: b */
    public final List f10960b;

    /* renamed from: c */
    public MutableLiveData f10961c;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemSuperviseGroupMemberSearchBinding f10962a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemSuperviseGroupMemberSearchBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10962a = binding;
        }

        /* renamed from: a */
        public final void m10124a(SelectModel item, MutableLiveData superviseGroupMember, View.OnClickListener onClickListener, InterfaceC10574p memberClick) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
            AbstractC9133u.m16133g(onClickListener, "onClickListener");
            AbstractC9133u.m16133g(memberClick, "memberClick");
            ItemSuperviseGroupMemberSearchBinding itemSuperviseGroupMemberSearchBinding = this.f10962a;
            itemSuperviseGroupMemberSearchBinding.setEntity(item);
            itemSuperviseGroupMemberSearchBinding.setOnclick(onClickListener);
            itemSuperviseGroupMemberSearchBinding.recycler.setAdapter(new StudentViewMemberItemAdapter((SuperviseGroup) item.getData(), superviseGroupMember, memberClick));
            itemSuperviseGroupMemberSearchBinding.executePendingBindings();
        }
    }

    public StudentViewMemberSearchAdapter(InterfaceC10574p memberClick) {
        AbstractC9133u.m16133g(memberClick, "memberClick");
        this.f10959a = memberClick;
        this.f10960b = new ArrayList();
        this.f10961c = new MutableLiveData();
    }

    /* renamed from: g */
    public static final void m10117g(StudentViewMemberSearchAdapter studentViewMemberSearchAdapter, int i10, View view) {
        ((SelectModel) studentViewMemberSearchAdapter.f10960b.get(i10)).setSelectModel(!((SelectModel) studentViewMemberSearchAdapter.f10960b.get(i10)).isSelectModel());
        studentViewMemberSearchAdapter.notifyItemChanged(i10);
    }

    /* renamed from: h */
    public static final C8736p m10118h(StudentViewMemberSearchAdapter studentViewMemberSearchAdapter, SuperviseGroup superviseGroup, SuperviseGroupMember superviseGroupMember) {
        AbstractC9133u.m16133g(superviseGroup, "superviseGroup");
        AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
        studentViewMemberSearchAdapter.m10123k(superviseGroupMember);
        studentViewMemberSearchAdapter.f10959a.invoke(superviseGroup, superviseGroupMember);
        return C8736p.f16368a;
    }

    /* renamed from: e */
    public final List m10119e() {
        return this.f10960b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        holder.m10124a((SelectModel) this.f10960b.get(i10), this.f10961c, new View.OnClickListener() { // from class: n4.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentViewMemberSearchAdapter.m10117g(this.f18586a, i10, view);
            }
        }, new InterfaceC10574p() { // from class: n4.v0
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return StudentViewMemberSearchAdapter.m10118h(this.f18590a, (SuperviseGroup) obj, (SuperviseGroupMember) obj2);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10960b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemSuperviseGroupMemberSearchBinding itemSuperviseGroupMemberSearchBindingInflate = ItemSuperviseGroupMemberSearchBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemSuperviseGroupMemberSearchBindingInflate, "inflate(...)");
        return new ViewHolder(itemSuperviseGroupMemberSearchBindingInflate);
    }

    /* renamed from: j */
    public final void m10122j(List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f10960b.clear();
        this.f10960b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: k */
    public final void m10123k(SuperviseGroupMember superviseGroupMember) {
        this.f10961c.setValue(superviseGroupMember);
        notifyDataSetChanged();
    }
}
