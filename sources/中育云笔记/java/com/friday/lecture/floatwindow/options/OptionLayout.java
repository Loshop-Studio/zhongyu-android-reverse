package com.friday.lecture.floatwindow.options;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import com.friday.lecture.R$layout;
import com.friday.lecture.databinding.FloatViewBinding;
import com.friday.lecture.floatwindow.FloatWindowStatus;
import com.friday.lecture.floatwindow.options.OptionLayout;
import com.friday.lecture.model.ClassTestHelper;
import com.friday.lecture.widget.LifecycleFrameLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.AbstractC9979u;
import p111d3.C8925a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class OptionLayout extends LifecycleFrameLayout {

    /* renamed from: d */
    public FloatViewBinding f8774d;

    /* renamed from: e */
    public boolean f8775e;

    /* renamed from: f */
    public float f8776f;

    /* renamed from: g */
    public float f8777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionLayout(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        m6633j();
    }

    /* renamed from: j */
    private final void m6633j() {
        FloatViewBinding floatViewBinding = null;
        View viewInflate = View.inflate(getContext(), R$layout.float_view, null);
        addView(viewInflate);
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(viewInflate);
        AbstractC9979u.m20291d(viewDataBindingBind);
        FloatViewBinding floatViewBinding2 = (FloatViewBinding) viewDataBindingBind;
        this.f8774d = floatViewBinding2;
        if (floatViewBinding2 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding2 = null;
        }
        floatViewBinding2.f8501d.setSelected(false);
        FloatViewBinding floatViewBinding3 = this.f8774d;
        if (floatViewBinding3 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding3 = null;
        }
        floatViewBinding3.f8506i.setSelected(false);
        FloatViewBinding floatViewBinding4 = this.f8774d;
        if (floatViewBinding4 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding4 = null;
        }
        floatViewBinding4.f8503f.setOnClickListener(new View.OnClickListener() { // from class: g3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionLayout.m6634k(view);
            }
        });
        FloatViewBinding floatViewBinding5 = this.f8774d;
        if (floatViewBinding5 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding5 = null;
        }
        floatViewBinding5.f8504g.setOnClickListener(new View.OnClickListener() { // from class: g3.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionLayout.m6635l(this.f21606c, view);
            }
        });
        FloatViewBinding floatViewBinding6 = this.f8774d;
        if (floatViewBinding6 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding6 = null;
        }
        floatViewBinding6.f8500c.setOnClickListener(new View.OnClickListener() { // from class: g3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionLayout.m6636m(this.f21607c, view);
            }
        });
        FloatViewBinding floatViewBinding7 = this.f8774d;
        if (floatViewBinding7 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding7 = null;
        }
        floatViewBinding7.f8506i.setOnClickListener(new View.OnClickListener() { // from class: g3.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionLayout.m6637n(view);
            }
        });
        m6642r(ClassTestHelper.INSTANCE.m33975getOnlineList().size());
        FloatViewBinding floatViewBinding8 = this.f8774d;
        if (floatViewBinding8 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            floatViewBinding = floatViewBinding8;
        }
        floatViewBinding.f8501d.setOnClickListener(new View.OnClickListener() { // from class: g3.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionLayout.m6638o(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m6634k(View view) {
        C8925a.f20887a.m17526j();
    }

    /* renamed from: l */
    public static final void m6635l(OptionLayout optionLayout, View view) {
        FloatViewBinding floatViewBinding = optionLayout.f8774d;
        FloatViewBinding floatViewBinding2 = null;
        if (floatViewBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding = null;
        }
        floatViewBinding.f8500c.setVisibility(0);
        FloatViewBinding floatViewBinding3 = optionLayout.f8774d;
        if (floatViewBinding3 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            floatViewBinding2 = floatViewBinding3;
        }
        floatViewBinding2.f8507j.setVisibility(8);
        C6149a.f8778g.m6662a().m6659o();
    }

    /* renamed from: m */
    public static final void m6636m(OptionLayout optionLayout, View view) {
        FloatViewBinding floatViewBinding = optionLayout.f8774d;
        FloatViewBinding floatViewBinding2 = null;
        if (floatViewBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding = null;
        }
        floatViewBinding.f8500c.setVisibility(8);
        FloatViewBinding floatViewBinding3 = optionLayout.f8774d;
        if (floatViewBinding3 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            floatViewBinding2 = floatViewBinding3;
        }
        floatViewBinding2.f8507j.setVisibility(0);
        C6149a.f8778g.m6662a().m6658n();
    }

    /* renamed from: n */
    public static final void m6637n(View view) {
        C8925a.f20887a.m17527k();
    }

    /* renamed from: o */
    public static final void m6638o(View view) {
        C8925a.f20887a.m17522f();
    }

    /* renamed from: p */
    public static final void m6639p(OptionLayout optionLayout, Boolean bool) {
        FloatViewBinding floatViewBinding = optionLayout.f8774d;
        if (floatViewBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding = null;
        }
        ImageView imageView = floatViewBinding.f8503f;
        AbstractC9979u.m20291d(bool);
        imageView.setEnabled(bool.booleanValue());
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout
    /* renamed from: c */
    public LifecycleRegistry mo6640c() {
        return new LifecycleRegistry(this);
    }

    public final float getTouchDownX() {
        return this.f8776f;
    }

    public final float getTouchDownY() {
        return this.f8777g;
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LiveEventBus.get("CanvasEnable", Boolean.TYPE).observe(this, new Observer() { // from class: g3.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OptionLayout.m6639p(this.f21605c, (Boolean) obj);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f8776f = event.getX();
            this.f8777g = event.getY();
            this.f8775e = false;
        } else if (action == 1) {
            this.f8775e = false;
        } else if (action == 2) {
            this.f8775e = Math.abs(this.f8776f - event.getX()) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop()) || Math.abs(this.f8777g - event.getY()) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
        }
        return this.f8775e;
    }

    /* renamed from: q */
    public final void m6641q() {
        m6643s(0);
    }

    /* renamed from: r */
    public final void m6642r(int i10) {
        FloatViewBinding floatViewBinding = null;
        if (i10 == 0) {
            FloatViewBinding floatViewBinding2 = this.f8774d;
            if (floatViewBinding2 == null) {
                AbstractC9979u.m20312y("dataBinding");
            } else {
                floatViewBinding = floatViewBinding2;
            }
            floatViewBinding.f8509l.setVisibility(8);
            return;
        }
        FloatViewBinding floatViewBinding3 = this.f8774d;
        if (floatViewBinding3 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding3 = null;
        }
        floatViewBinding3.f8509l.setVisibility(0);
        FloatViewBinding floatViewBinding4 = this.f8774d;
        if (floatViewBinding4 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            floatViewBinding = floatViewBinding4;
        }
        floatViewBinding.f8509l.setText(i10 > 99 ? "99" : String.valueOf(i10));
    }

    /* renamed from: s */
    public final void m6643s(int i10) {
        FloatViewBinding floatViewBinding = null;
        if (i10 == 0) {
            FloatViewBinding floatViewBinding2 = this.f8774d;
            if (floatViewBinding2 == null) {
                AbstractC9979u.m20312y("dataBinding");
            } else {
                floatViewBinding = floatViewBinding2;
            }
            floatViewBinding.f8508k.setVisibility(8);
            return;
        }
        FloatViewBinding floatViewBinding3 = this.f8774d;
        if (floatViewBinding3 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding3 = null;
        }
        floatViewBinding3.f8508k.setVisibility(0);
        FloatViewBinding floatViewBinding4 = this.f8774d;
        if (floatViewBinding4 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            floatViewBinding = floatViewBinding4;
        }
        floatViewBinding.f8508k.setText(i10 > 99 ? "99" : String.valueOf(i10));
    }

    public final void setAirPlayState(boolean z10) {
        FloatViewBinding floatViewBinding = null;
        if (!z10) {
            FloatViewBinding floatViewBinding2 = this.f8774d;
            if (floatViewBinding2 == null) {
                AbstractC9979u.m20312y("dataBinding");
                floatViewBinding2 = null;
            }
            floatViewBinding2.f8501d.setVisibility(8);
            FloatViewBinding floatViewBinding3 = this.f8774d;
            if (floatViewBinding3 == null) {
                AbstractC9979u.m20312y("dataBinding");
            } else {
                floatViewBinding = floatViewBinding3;
            }
            floatViewBinding.f8502e.setVisibility(8);
            return;
        }
        FloatViewBinding floatViewBinding4 = this.f8774d;
        if (floatViewBinding4 == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding4 = null;
        }
        floatViewBinding4.f8501d.setVisibility(0);
        m6642r(ClassTestHelper.INSTANCE.m33975getOnlineList().size());
        FloatViewBinding floatViewBinding5 = this.f8774d;
        if (floatViewBinding5 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            floatViewBinding = floatViewBinding5;
        }
        floatViewBinding.f8502e.setVisibility(0);
    }

    public final void setClassState(FloatWindowStatus classStatus) {
        AbstractC9979u.m20294g(classStatus, "classStatus");
        FloatViewBinding floatViewBinding = this.f8774d;
        if (floatViewBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            floatViewBinding = null;
        }
        floatViewBinding.f8505h.setSelected(classStatus == FloatWindowStatus.f8679e || classStatus == FloatWindowStatus.f8680f);
    }

    public final void setTouchDownX(float f10) {
        this.f8776f = f10;
    }

    public final void setTouchDownY(float f10) {
        this.f8777g = f10;
    }
}
