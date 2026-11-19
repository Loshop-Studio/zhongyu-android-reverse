package com.zykj.mistake.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseFragment;
import com.zykj.mistake.databinding.FragmentEmptyBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/fragment/EmptyFragment;", "Lcom/zykj/mistake/base/BaseFragment;", "Lcom/zykj/mistake/databinding/FragmentEmptyBinding;", "<init>", "()V", "t6/a", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EmptyFragment extends BaseFragment<FragmentEmptyBinding> {
    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: e */
    public final int mo3959e() {
        return R.layout.fragment_empty;
    }

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: g */
    public final void mo3961g(View view) {
        String string;
        TextView textView = ((FragmentEmptyBinding) m3960f()).f6130a;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("emptyText")) == null) {
            string = getString(R.string.detail_empty);
            AbstractC5830k.m5329f(string, "getString(...)");
        }
        textView.setText(string);
    }
}
