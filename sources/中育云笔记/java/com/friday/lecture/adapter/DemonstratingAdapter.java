package com.friday.lecture.adapter;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.helper.C5962b;
import com.friday.lecture.R$drawable;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.databinding.ViewInDemoBinding;
import com.friday.lecture.model.ClassTestHelper;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DemonstratingAdapter extends BaseQuickAdapter<Pair<? extends Boolean, ? extends MqttResponse.Student>, BaseDataBindingHolder<ViewInDemoBinding>> {

    /* renamed from: a */
    public final String f8482a;

    public DemonstratingAdapter() {
        super(R$layout.view_in_demo, null, 2, null);
        this.f8482a = String.valueOf(C5962b.f6082a.m5299a().m5292t());
        addChildClickViewIds(R$id.iv_remove, R$id.iv_fullscreen);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseDataBindingHolder holder, Pair item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        ViewInDemoBinding viewInDemoBinding = (ViewInDemoBinding) holder.getDataBinding();
        if (viewInDemoBinding != null) {
            viewInDemoBinding.f8630g.setImageResource(AbstractC9979u.m20289b(((MqttResponse.Student) item.m20052g()).getStudentId(), this.f8482a) ? R$drawable.icon_demo_teacher : R$drawable.icon_demo_student);
            ImageView ivOffline = viewInDemoBinding.f8628e;
            AbstractC9979u.m20293f(ivOffline, "ivOffline");
            int i10 = 8;
            ivOffline.setVisibility(!((Boolean) item.m20051f()).booleanValue() ? 0 : 8);
            viewInDemoBinding.f8626c.setSelected(((Boolean) item.m20051f()).booleanValue());
            ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
            int size = classTestHelper.getDemonstratingList().size();
            ImageView imageView = viewInDemoBinding.f8629f;
            if (size > 1 || (size == 1 && !AbstractC9979u.m20289b(((MqttResponse.Student) ((Pair) AbstractC10947g0.m23944m0(classTestHelper.getDemonstratingList())).m20052g()).getStudentId(), this.f8482a))) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            viewInDemoBinding.f8627d.setVisibility(size <= 1 ? 4 : 0);
            viewInDemoBinding.f8627d.setSelected(AbstractC9979u.m20289b(((MqttResponse.Student) item.m20052g()).getStudentId(), classTestHelper.getFullscreenMember()));
            viewInDemoBinding.f8631h.setText(((MqttResponse.Student) item.m20052g()).getStudentName());
            viewInDemoBinding.f8631h.setSelected(AbstractC9979u.m20289b(this.f8482a, ((MqttResponse.Student) item.m20052g()).getStudentId()));
        }
    }
}
