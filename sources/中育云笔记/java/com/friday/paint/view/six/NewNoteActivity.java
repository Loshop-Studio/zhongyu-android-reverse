package com.friday.paint.view.six;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.LogUtils;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import com.friday.paint.databinding.ResFragmentNoteDetailBinding;
import com.friday.paint.viewmodel.NewNoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.io.File;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p215k2.AbstractC9803u;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
@Route(path = "/paint/NewNoteActivity")
@Keep
/* loaded from: classes4.dex */
public final class NewNoteActivity extends Hilt_NewNoteActivity<ResFragmentNoteDetailBinding> {
    private static final String FRAGMENT_TAG = "NewNoteActivity_the_paint_fragment";
    private NewStudentPaintFragment paintFragment;
    private final InterfaceC10773d viewModel$delegate;
    public static final C6279a Companion = new C6279a(null);
    public static final int $stable = 8;

    @Autowired
    public String parentId = "";

    @Autowired
    public String fileName = "";

    @Autowired
    public String fileId = "";

    @Autowired
    public String fromPage = "";

    /* renamed from: com.friday.paint.view.six.NewNoteActivity$a */
    public static final class C6279a {
        public /* synthetic */ C6279a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6279a() {
        }
    }

    public NewNoteActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.viewModel$delegate = new ViewModelLazy(AbstractC9983y.m20315b(NewNoteViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewNoteActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewNoteActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewNoteActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewNoteViewModel getViewModel() {
        return (NewNoteViewModel) this.viewModel$delegate.getValue();
    }

    private final void initFragment() {
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.friday.paint.view.six.NewNoteActivity.initFragment.1
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewCreated(FragmentManager fm, Fragment f10, View v10, Bundle bundle) {
                AbstractC9979u.m20294g(fm, "fm");
                AbstractC9979u.m20294g(f10, "f");
                AbstractC9979u.m20294g(v10, "v");
                if (f10 instanceof NewStudentPaintFragment) {
                    NewNoteActivity.this.paintFragment = (NewStudentPaintFragment) f10;
                    LogUtils.m3886d("页面NewNoteActivity.kt -> NewStudentPaintFragment已准备就绪，开始执行");
                    NewNoteActivity.this.getViewModel().m7671M();
                    fm.unregisterFragmentLifecycleCallbacks(this);
                }
            }
        }, false);
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(FRAGMENT_TAG);
        if (fragmentFindFragmentByTag == null) {
            getSupportFragmentManager().beginTransaction().add(R$id.paint_common_fragment, new NewStudentPaintFragment(), FRAGMENT_TAG).commitAllowingStateLoss();
            return;
        }
        NewStudentPaintFragment newStudentPaintFragment = (NewStudentPaintFragment) fragmentFindFragmentByTag;
        this.paintFragment = newStudentPaintFragment;
        if (newStudentPaintFragment.getView() != null) {
            getViewModel().m7671M();
        }
    }

    private final void initViewModel() {
        getViewModel().m7679V(this.fileId.length() == 0);
        NewNoteViewModel viewModel = getViewModel();
        String strM19814a = this.fileId;
        if (strM19814a.length() == 0) {
            strM19814a = AbstractC9803u.m19814a();
            AbstractC9979u.m20293f(strM19814a, "get32UUID(...)");
        }
        viewModel.m7681X(strM19814a);
        getViewModel().m7680W(C5962b.f6082a.m5299a().m5284l() + getViewModel().m7665G() + File.separator);
        getViewModel().m7682Y(this.fileName);
        getViewModel().m7684a0(this.parentId);
        getViewModel().m7683Z(this.fromPage);
    }

    private final boolean isRestoreArgsMissing() {
        return this.fileId.length() == 0 && this.parentId.length() == 0 && this.fileName.length() == 0 && this.fromPage.length() == 0;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.res_fragment_note_detail;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
    }

    @Override // com.friday.paint.view.six.Hilt_NewNoteActivity, com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ARouter.getInstance().inject(this);
        if (bundle == null || !isRestoreArgsMissing()) {
            initViewModel();
            initFragment();
        } else {
            LogUtils.m3887e("页面NewNoteActivity.kt -> onCreate, 重建时路由参数丢失，返回首页");
            C5963c.f6084a.m5308c();
            ActivityUtils.finishAllActivities();
        }
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LiveEventBus.get("CanvasEnable", Boolean.TYPE).post(Boolean.TRUE);
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LiveEventBus.get("CanvasEnable", Boolean.TYPE).post(Boolean.FALSE);
    }
}
