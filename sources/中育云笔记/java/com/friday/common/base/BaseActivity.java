package com.friday.common.base;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.LogUtils;
import com.friday.common.R$string;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.gyf.immersionbar.ImmersionBar;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class BaseActivity<Binding extends ViewDataBinding> extends AppCompatActivity implements IView, InterfaceC5929c, InterfaceViewOnClickListenerC5928b, InterfaceC11122i0 {
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC11122i0 $$delegate_0 = AbstractC10006d.m20745b();
    private boolean isLoadingNow;
    private BaseDialog loading;
    protected Binding mBinding;

    @InterfaceC11829d(m26210c = "com.friday.common.base.BaseActivity$isShowLoading$1", m26211f = "BaseActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.base.BaseActivity$isShowLoading$1 */
    public static final class C59261 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f5613c;

        /* renamed from: d */
        public final /* synthetic */ boolean f5614d;

        /* renamed from: e */
        public final /* synthetic */ BaseActivity f5615e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59261(boolean z10, BaseActivity baseActivity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f5614d = z10;
            this.f5615e = baseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C59261(this.f5614d, this.f5615e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f5613c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            if (this.f5614d) {
                this.f5615e.m4796K(false);
            } else {
                this.f5615e.m4795J();
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C59261) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: J */
    public final void m4795J() {
        BaseDialog baseDialog = this.loading;
        if (baseDialog != null) {
            baseDialog.dismissAllowingStateLoss();
        }
        this.isLoadingNow = false;
    }

    /* renamed from: K */
    public final void m4796K(boolean z10) {
        if (this.loading == null) {
            this.loading = C5975a.f6196a.m5438J(z10, AbstractC11958b.m26585f(R$string.waiting_please));
        }
        if (this.isLoadingNow) {
            return;
        }
        BaseDialog baseDialog = this.loading;
        if (baseDialog != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
            baseDialog.show(supportFragmentManager, "progress_dialog_base_activity");
        }
        this.isLoadingNow = true;
    }

    @Override // sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final Binding getMBinding() {
        Binding binding = this.mBinding;
        if (binding != null) {
            return binding;
        }
        AbstractC9979u.m20312y("mBinding");
        return null;
    }

    public void initDataSource() {
    }

    public void initView() {
    }

    public void isShowLoading(boolean z10) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C59261(z10, this, null));
    }

    @Override // com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtils.m3886d("当前的ActivityLifecycle", "Current Activity: " + getClass().getSimpleName());
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, getLayoutId());
        AbstractC9979u.m20293f(contentView, "setContentView(...)");
        setMBinding(contentView);
        getMBinding().setLifecycleOwner(this);
        ImmersionBar immersionBarWith = ImmersionBar.with(this);
        AbstractC9979u.m20290c(immersionBarWith, "this");
        immersionBarWith.statusBarDarkFont(true);
        immersionBarWith.init();
        initData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AbstractC10006d.m20747d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void setClickListener(View... view) {
        AbstractC9979u.m20294g(view, "view");
        for (View view2 : view) {
            view2.setOnClickListener(this);
        }
    }

    public final void setMBinding(Binding binding) {
        AbstractC9979u.m20294g(binding, "<set-?>");
        this.mBinding = binding;
    }
}
