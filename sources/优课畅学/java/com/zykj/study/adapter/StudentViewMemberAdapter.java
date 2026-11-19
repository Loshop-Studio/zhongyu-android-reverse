package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.adapter.StudentViewMemberAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.databinding.ItemSuperviseGroupMemberBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentViewMemberAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final InterfaceC10574p f10949a;

    /* renamed from: b */
    public final InterfaceC10574p f10950b;

    /* renamed from: c */
    public final List f10951c;

    /* renamed from: d */
    public MutableLiveData f10952d;

    @StabilityInferred(parameters = 0)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemSuperviseGroupMemberBinding f10953a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemSuperviseGroupMemberBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10953a = binding;
        }

        /* renamed from: a */
        public final void m10109a(SelectModel item, MutableLiveData superviseGroupMember, View.OnClickListener onClickListener, View.OnClickListener onMenuClickListener, InterfaceC10574p memberClick) {
            AbstractC9133u.m16133g(item, "item");
            AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
            AbstractC9133u.m16133g(onClickListener, "onClickListener");
            AbstractC9133u.m16133g(onMenuClickListener, "onMenuClickListener");
            AbstractC9133u.m16133g(memberClick, "memberClick");
            ItemSuperviseGroupMemberBinding itemSuperviseGroupMemberBinding = this.f10953a;
            itemSuperviseGroupMemberBinding.setEntity(item);
            itemSuperviseGroupMemberBinding.setOnclick(onClickListener);
            itemSuperviseGroupMemberBinding.setMenuClick(onMenuClickListener);
            itemSuperviseGroupMemberBinding.recycler.setAdapter(new StudentViewMemberItemAdapter((SuperviseGroup) item.getData(), superviseGroupMember, memberClick));
            itemSuperviseGroupMemberBinding.executePendingBindings();
        }
    }

    public StudentViewMemberAdapter(InterfaceC10574p menuCallBack, InterfaceC10574p memberClick) {
        AbstractC9133u.m16133g(menuCallBack, "menuCallBack");
        AbstractC9133u.m16133g(memberClick, "memberClick");
        this.f10949a = menuCallBack;
        this.f10950b = memberClick;
        this.f10951c = new ArrayList();
        this.f10952d = new MutableLiveData();
    }

    /* renamed from: h */
    public static final void m10101h(StudentViewMemberAdapter studentViewMemberAdapter, int i10, View view) {
        ((SelectModel) studentViewMemberAdapter.f10951c.get(i10)).setSelectModel(!((SelectModel) studentViewMemberAdapter.f10951c.get(i10)).isSelectModel());
        studentViewMemberAdapter.notifyItemChanged(i10);
    }

    /* renamed from: i */
    public static final void m10102i(StudentViewMemberAdapter studentViewMemberAdapter, int i10, View view) {
        InterfaceC10574p interfaceC10574p = studentViewMemberAdapter.f10949a;
        AbstractC9133u.m16130d(view);
        interfaceC10574p.invoke(view, ((SelectModel) studentViewMemberAdapter.f10951c.get(i10)).getData());
    }

    /* renamed from: j */
    public static final C8736p m10103j(StudentViewMemberAdapter studentViewMemberAdapter, SuperviseGroup superviseGroup, SuperviseGroupMember superviseGroupMember) {
        AbstractC9133u.m16133g(superviseGroup, "superviseGroup");
        AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
        studentViewMemberAdapter.m10108m(superviseGroupMember);
        studentViewMemberAdapter.f10950b.invoke(superviseGroup, superviseGroupMember);
        return C8736p.f16368a;
    }

    /* renamed from: f */
    public final List m10104f() {
        return this.f10951c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        holder.m10109a((SelectModel) this.f10951c.get(i10), this.f10952d, new View.OnClickListener() { // from class: n4.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentViewMemberAdapter.m10101h(this.f18571a, i10, view);
            }
        }, new View.OnClickListener() { // from class: n4.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentViewMemberAdapter.m10102i(this.f18575a, i10, view);
            }
        }, new InterfaceC10574p() { // from class: n4.s0
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return StudentViewMemberAdapter.m10103j(this.f18579a, (SuperviseGroup) obj, (SuperviseGroupMember) obj2);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10951c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemSuperviseGroupMemberBinding itemSuperviseGroupMemberBindingInflate = ItemSuperviseGroupMemberBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemSuperviseGroupMemberBindingInflate, "inflate(...)");
        return new ViewHolder(itemSuperviseGroupMemberBindingInflate);
    }

    /* renamed from: l */
    public final void m10107l(List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f10951c.clear();
        this.f10951c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public final void m10108m(SuperviseGroupMember superviseGroupMember) {
        this.f10952d.setValue(superviseGroupMember);
        notifyDataSetChanged();
    }
}
