package com.friday.document.view.preview;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.base.BaseFragment;
import com.friday.common.widget.dialog.FBIWarningDialog;
import com.friday.document.R$layout;
import com.friday.document.databinding.FragmentPreviewEmptyBinding;
import com.friday.document.view.preview.EmptyPreviewFragment;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class EmptyPreviewFragment extends BaseFragment<FragmentPreviewEmptyBinding> {

    /* renamed from: d */
    public static final C6053a f7430d = new C6053a(null);

    /* renamed from: e */
    public static final int f7431e = BaseFragment.$stable;

    /* renamed from: com.friday.document.view.preview.EmptyPreviewFragment$a */
    public static final class C6053a {
        public /* synthetic */ C6053a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final EmptyPreviewFragment m5929a() {
            Bundle bundle = new Bundle();
            EmptyPreviewFragment emptyPreviewFragment = new EmptyPreviewFragment();
            emptyPreviewFragment.setArguments(bundle);
            return emptyPreviewFragment;
        }

        public C6053a() {
        }
    }

    /* renamed from: r */
    public static final void m5928r(EmptyPreviewFragment emptyPreviewFragment, View view) {
        new FBIWarningDialog().show(emptyPreviewFragment.getChildFragmentManager(), FBIWarningDialog.class.getSimpleName());
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_preview_empty;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
    }

    @Override // com.friday.common.base.BaseFragment
    public boolean needHideLoadingOnDestroy() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        getMBinding().f6381c.f6526c.setVisibility(0);
        getMBinding().f6381c.f6526c.setOnClickListener(new View.OnClickListener() { // from class: w2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmptyPreviewFragment.m5928r(this.f27787c, view2);
            }
        });
    }
}
