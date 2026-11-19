package com.chad.library.adapter.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m5110d2 = {"Lcom/chad/library/adapter/base/BaseNodeAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<Object> {

    /* renamed from: f */
    public final HashSet f2642f;

    public BaseNodeAdapter() {
        super(0);
        this.f2642f = new HashSet();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: e */
    public final boolean mo2500e(int i) {
        return super.mo2500e(i) || this.f2642f.contains(Integer.valueOf(i));
    }
}
