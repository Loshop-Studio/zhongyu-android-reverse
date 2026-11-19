package com.zykj.mistake.base;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.OnBackPressedCallback;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.mistake.base.BasePresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p081i4.InterfaceC5679b;
import p159s5.C6558a;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Lcom/zykj/mistake/base/BaseMVPActivity;", "Lcom/zykj/mistake/base/BasePresenter;", "P", "Landroidx/databinding/ViewDataBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zykj/mistake/base/BaseActivity;", "Li4/b;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseMVPActivity<P extends BasePresenter, T extends ViewDataBinding> extends BaseActivity<T> implements InterfaceC5679b {

    /* renamed from: b */
    public BasePresenter f5992b;

    /* renamed from: c */
    public FrameLayout f5993c;

    /* renamed from: d */
    public BaseMVPActivity$showLoading$1 f5994d;

    @Override // p081i4.InterfaceC5679b
    /* renamed from: b */
    public final void mo3962b(String tip) {
        AbstractC5830k.m5330g(tip, "tip");
        if (tip.length() > 0) {
            Context applicationContext = getApplicationContext();
            AbstractC5830k.m5329f(applicationContext, "getApplicationContext(...)");
            Toast toast = AbstractC5099d.f8034e;
            if (toast == null) {
                Toast toastMakeText = Toast.makeText(applicationContext, tip, 0);
                toastMakeText.setGravity(81, 0, 220);
                AbstractC5099d.f8034e = toastMakeText;
            } else {
                toast.setText(tip);
            }
            Toast toast2 = AbstractC5099d.f8034e;
            AbstractC5830k.m5327d(toast2);
            toast2.show();
        }
    }

    @Override // p081i4.InterfaceC5679b
    /* renamed from: c */
    public final void mo3963c() {
        FrameLayout frameLayout = this.f5993c;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.f5993c = null;
        BaseMVPActivity$showLoading$1 baseMVPActivity$showLoading$1 = this.f5994d;
        if (baseMVPActivity$showLoading$1 != null) {
            baseMVPActivity$showLoading$1.remove();
        }
        this.f5994d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.activity.OnBackPressedCallback, com.zykj.mistake.base.BaseMVPActivity$showLoading$1] */
    @Override // p081i4.InterfaceC5679b
    /* renamed from: d */
    public final void mo3964d(final boolean z8) {
        mo3963c();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        if (viewGroup == null) {
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        int iM6241q = AbstractC6600a.m6241q(28 * f);
        int iM6241q2 = AbstractC6600a.m6241q(20 * f);
        int iM6241q3 = AbstractC6600a.m6241q(14 * f);
        int iM6241q4 = AbstractC6600a.m6241q(12 * f);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(iM6241q2, iM6241q3, iM6241q2, iM6241q3);
        linearLayout.setBackgroundResource(com.zykj.mistake.R.drawable.bg_white_corner_4);
        linearLayout.setElevation(8 * f);
        linearLayout.addView(new ProgressBar(this), new LinearLayout.LayoutParams(iM6241q, iM6241q));
        TextView textView = new TextView(this);
        textView.setText("请稍候。。");
        textView.setTextColor(-12303292);
        textView.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(iM6241q4);
        linearLayout.addView(textView, layoutParams);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(Color.argb(51, 0, 0, 0));
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.f5993c = frameLayout;
        ?? r02 = new OnBackPressedCallback() { // from class: com.zykj.mistake.base.BaseMVPActivity$showLoading$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // android.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                if (z8) {
                    this.mo3963c();
                }
            }
        };
        getOnBackPressedDispatcher().addCallback(this, r02);
        this.f5994d = r02;
    }

    @Override // com.zykj.mistake.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(-1);
        new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView()).setAppearanceLightStatusBars(true);
        Object objNewInstance = mo3916s().getDeclaredConstructor(null).newInstance(null);
        AbstractC5830k.m5329f(objNewInstance, "newInstance(...)");
        this.f5992b = (BasePresenter) objNewInstance;
        m3965r().f6001c = this;
        mo3917t();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i4.b, java.lang.Object] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        mo3963c();
        super.onDestroy();
        BasePresenter basePresenterM3965r = m3965r();
        ?? r1 = basePresenterM3965r.f6001c;
        if (r1 != 0) {
            r1.mo3963c();
        }
        basePresenterM3965r.f6001c = null;
        C6558a c6558a = basePresenterM3965r.f6000b;
        if (c6558a != null) {
            c6558a.dispose();
        }
        basePresenterM3965r.f6000b = null;
    }

    /* renamed from: r */
    public final BasePresenter m3965r() {
        BasePresenter basePresenter = this.f5992b;
        if (basePresenter != null) {
            return basePresenter;
        }
        AbstractC5830k.m5339p("mPresenter");
        throw null;
    }

    /* renamed from: s */
    public abstract Class mo3916s();

    /* renamed from: t */
    public abstract void mo3917t();
}
