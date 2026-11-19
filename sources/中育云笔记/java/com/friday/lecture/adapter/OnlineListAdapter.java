package com.friday.lecture.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.helper.C5962b;
import com.friday.lecture.R$drawable;
import com.friday.lecture.R$layout;
import com.friday.lecture.adapter.OnlineListAdapter;
import com.friday.lecture.databinding.ItemOnlineListBinding;
import com.friday.lecture.model.ClassTestHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p215k2.C9793k;
import p325rc.AbstractC10980x;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class OnlineListAdapter extends BaseQuickAdapter<MqttResponse.Student, BaseDataBindingHolder<ItemOnlineListBinding>> {

    /* renamed from: a */
    public final InterfaceC9529a f8484a;

    /* renamed from: b */
    public final String f8485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineListAdapter(InterfaceC9529a onSelectChanged) {
        super(R$layout.item_online_list, null, 2, null);
        AbstractC9979u.m20294g(onSelectChanged, "onSelectChanged");
        this.f8484a = onSelectChanged;
        this.f8485b = String.valueOf(C5962b.f6082a.m5299a().m5292t());
    }

    /* renamed from: k */
    public static final void m6498k(MqttResponse.Student student, OnlineListAdapter onlineListAdapter, View view) {
        if (!view.isSelected() && ClassTestHelper.INSTANCE.getSelectedList().size() == 4) {
            C9793k.m19779k(view.getContext()).m19781m("最多支持4人投屏，无法再选中更多的人");
            return;
        }
        ClassTestHelper.INSTANCE.updateSelectedList(student);
        onlineListAdapter.f8484a.invoke();
        onlineListAdapter.notifyItemChanged(onlineListAdapter.getItemPosition(student));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(BaseDataBindingHolder holder, final MqttResponse.Student item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        ItemOnlineListBinding itemOnlineListBinding = (ItemOnlineListBinding) holder.getDataBinding();
        if (itemOnlineListBinding != null) {
            itemOnlineListBinding.f8514c.setOnClickListener(new View.OnClickListener() { // from class: b3.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnlineListAdapter.m6498k(item, this, view);
                }
            });
            CardView cardView = itemOnlineListBinding.f8514c;
            ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
            cardView.setSelected(classTestHelper.getSelectedList().contains(item.getStudentId()));
            itemOnlineListBinding.f8518g.setText(item.getStudentName());
            itemOnlineListBinding.f8518g.setSelected(AbstractC9979u.m20289b(this.f8485b, item.getStudentId()));
            ImageView ivFlagInDemo = itemOnlineListBinding.f8515d;
            AbstractC9979u.m20293f(ivFlagInDemo, "ivFlagInDemo");
            List<Pair<Boolean, MqttResponse.Student>> demonstratingList = classTestHelper.getDemonstratingList();
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(demonstratingList, 10));
            Iterator<T> it = demonstratingList.iterator();
            while (it.hasNext()) {
                arrayList.add((MqttResponse.Student) ((Pair) it.next()).m20052g());
            }
            ivFlagInDemo.setVisibility(arrayList.contains(item) ? 0 : 8);
            itemOnlineListBinding.f8516e.setImageResource(AbstractC9979u.m20289b(item.getStudentId(), this.f8485b) ? R$drawable.icon_demo_teacher : R$drawable.icon_demo_student);
            View randomSelected = itemOnlineListBinding.f8517f;
            AbstractC9979u.m20293f(randomSelected, "randomSelected");
            randomSelected.setVisibility(AbstractC9979u.m20289b(ClassTestHelper.INSTANCE.getRandomlySelectedMember(), item.getStudentId()) ? 0 : 8);
        }
    }
}
