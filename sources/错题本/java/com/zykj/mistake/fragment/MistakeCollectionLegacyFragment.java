package com.zykj.mistake.fragment;

import android.content.Context;
import android.view.View;
import androidx.camera.core.impl.C0362d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ViewOnClickListenerC2869j;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.R;
import com.zykj.mistake.adapter.MainLessonAdapter;
import com.zykj.mistake.base.BaseMVPFragment;
import com.zykj.mistake.databinding.FragmentMistakeNotebookBinding;
import com.zykj.mistake.presenter.MainPresenter;
import com.zykj.view.board.play.C5353b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p073h4.BinderC5627c;
import p090j4.InterfaceC5745a;
import p106l4.DialogC6054e;
import p144q4.C6418b;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;", "Lcom/zykj/mistake/base/BaseMVPFragment;", "Lcom/zykj/mistake/presenter/MainPresenter;", "Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;", "Lj4/a;", "", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeCollectionLegacyFragment extends BaseMVPFragment<MainPresenter, FragmentMistakeNotebookBinding> implements InterfaceC5745a {

    /* renamed from: f */
    public MainLessonAdapter f7779f;

    /* renamed from: g */
    public DialogC6054e f7780g;

    /* renamed from: d */
    public boolean f7777d = true;

    /* renamed from: e */
    public final ArrayList f7778e = new ArrayList();

    /* renamed from: h */
    public final BinderC5627c f7781h = new BinderC5627c(this, 1);

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: e */
    public final int mo3959e() {
        return R.layout.fragment_mistake_notebook;
    }

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: g */
    public final void mo3961g(View view) {
        ((FragmentMistakeNotebookBinding) m3960f()).f6138d.setColorSchemeResources(R.color.colorPrimary);
        ((FragmentMistakeNotebookBinding) m3960f()).f6138d.setOnRefreshListener(new C0362d(this, 16));
        Context contextRequireContext = requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        this.f7779f = new MainLessonAdapter(contextRequireContext, this.f7778e, this);
        RecyclerView recyclerView = ((FragmentMistakeNotebookBinding) m3960f()).f6137c;
        MainLessonAdapter mainLessonAdapter = this.f7779f;
        if (mainLessonAdapter == null) {
            AbstractC5830k.m5339p("mMistakeAdapter");
            throw null;
        }
        recyclerView.setAdapter(mainLessonAdapter);
        ((FragmentMistakeNotebookBinding) m3960f()).f6135a.setOnClickListener(new ViewOnClickListenerC2869j(this, 6));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
        DialogC6054e dialogC6054e = new DialogC6054e(fragmentActivityRequireActivity, R.style.AppTheme_Dialog);
        dialogC6054e.f9650a = new C5353b(10);
        this.f7780g = dialogC6054e;
    }

    @Override // com.zykj.mistake.base.BaseMVPFragment
    /* renamed from: i */
    public final Class mo3967i() {
        return MainPresenter.class;
    }

    @Override // com.zykj.mistake.base.BaseMVPFragment
    /* renamed from: j */
    public final void mo3968j() {
        MessageClient.INSTANCES.registerListener(this.f7781h);
    }

    @Override // com.zykj.mistake.base.BaseMVPFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        MessageClient.INSTANCES.unRegisterListener(this.f7781h);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MessageClient.INSTANCES.getServerInfo(new C6418b(this, 0));
    }
}
