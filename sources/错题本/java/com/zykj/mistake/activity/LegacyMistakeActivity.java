package com.zykj.mistake.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseActivity;
import com.zykj.mistake.databinding.ActivityLegacyMistakeBinding;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/activity/LegacyMistakeActivity;", "Lcom/zykj/mistake/base/BaseActivity;", "Lcom/zykj/mistake/databinding/ActivityLegacyMistakeBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class LegacyMistakeActivity extends BaseActivity<ActivityLegacyMistakeBinding> {

    /* renamed from: b */
    public static final /* synthetic */ int f5783b = 0;

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: o */
    public final int mo3905o() {
        return R.layout.activity_legacy_mistake;
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: q */
    public final void mo3906q() {
        if (getSupportFragmentManager().findFragmentById(R.id.fragment_container) == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MistakeCollectionLegacyFragment()).commit();
        }
    }
}
