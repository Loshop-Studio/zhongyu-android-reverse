package com.friday.lecture.window;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.friday.lecture.R$layout;
import com.friday.lecture.databinding.WindowDanmakuBinding;
import com.friday.lecture.window.DanmakuWindow;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DanmakuWindow extends FrameLayout {

    /* renamed from: c */
    public Handler f8959c;

    /* renamed from: d */
    public WindowDanmakuBinding f8960d;

    /* renamed from: e */
    public Pools.SimplePool f8961e;

    @StabilityInferred(parameters = 0)
    public static final class ClockTextView extends AppCompatTextView {

        /* renamed from: d */
        public final InterfaceC10773d f8962d;

        /* renamed from: com.friday.lecture.window.DanmakuWindow$ClockTextView$a */
        public static final class CountDownTimerC6166a extends CountDownTimer {
            public CountDownTimerC6166a() {
                super(CoroutineLiveDataKt.DEFAULT_TIMEOUT, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                ViewParent parent = ClockTextView.this.getParent();
                AbstractC9979u.m20292e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView(ClockTextView.this);
                if (viewGroup.getChildCount() == 0) {
                    viewGroup.setVisibility(8);
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClockTextView(Context context) {
            super(context);
            AbstractC9979u.m20294g(context, "context");
            this.f8962d = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: o3.a
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return DanmakuWindow.ClockTextView.m6865e(this.f24843c);
                }
            });
        }

        /* renamed from: e */
        public static final CountDownTimerC6166a m6865e(ClockTextView clockTextView) {
            return clockTextView.new CountDownTimerC6166a();
        }

        private final CountDownTimerC6166a getLis() {
            return (CountDownTimerC6166a) this.f8962d.getValue();
        }

        /* renamed from: d */
        public final void m6866d() {
            getLis().start();
        }

        /* renamed from: f */
        public final void m6867f() {
            getLis().cancel();
        }
    }

    /* renamed from: com.friday.lecture.window.DanmakuWindow$a */
    public static final class HandlerC6167a extends Handler {
        public HandlerC6167a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            AbstractC9979u.m20294g(msg, "msg");
            super.handleMessage(msg);
            WindowDanmakuBinding windowDanmakuBinding = null;
            if (msg.what == 0) {
                WindowDanmakuBinding windowDanmakuBinding2 = DanmakuWindow.this.f8960d;
                if (windowDanmakuBinding2 == null) {
                    AbstractC9979u.m20312y("dataBinding");
                    windowDanmakuBinding2 = null;
                }
                if (windowDanmakuBinding2.f8636c.getChildCount() == 5) {
                    WindowDanmakuBinding windowDanmakuBinding3 = DanmakuWindow.this.f8960d;
                    if (windowDanmakuBinding3 == null) {
                        AbstractC9979u.m20312y("dataBinding");
                        windowDanmakuBinding3 = null;
                    }
                    View childAt = windowDanmakuBinding3.f8636c.getChildAt(0);
                    AbstractC9979u.m20292e(childAt, "null cannot be cast to non-null type com.friday.lecture.window.DanmakuWindow.ClockTextView");
                    ClockTextView clockTextView = (ClockTextView) childAt;
                    clockTextView.m6867f();
                    WindowDanmakuBinding windowDanmakuBinding4 = DanmakuWindow.this.f8960d;
                    if (windowDanmakuBinding4 == null) {
                        AbstractC9979u.m20312y("dataBinding");
                        windowDanmakuBinding4 = null;
                    }
                    windowDanmakuBinding4.f8636c.removeView(clockTextView);
                }
            }
            WindowDanmakuBinding windowDanmakuBinding5 = DanmakuWindow.this.f8960d;
            if (windowDanmakuBinding5 == null) {
                AbstractC9979u.m20312y("dataBinding");
                windowDanmakuBinding5 = null;
            }
            windowDanmakuBinding5.f8636c.setVisibility(0);
            ClockTextView clockTextViewM6863d = DanmakuWindow.this.m6863d();
            Object obj = msg.obj;
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.String");
            clockTextViewM6863d.setText((String) obj);
            WindowDanmakuBinding windowDanmakuBinding6 = DanmakuWindow.this.f8960d;
            if (windowDanmakuBinding6 == null) {
                AbstractC9979u.m20312y("dataBinding");
            } else {
                windowDanmakuBinding = windowDanmakuBinding6;
            }
            windowDanmakuBinding.f8636c.addView(clockTextViewM6863d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuWindow(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        m6862c();
        this.f8961e = new Pools.SimplePool(5);
    }

    /* renamed from: c */
    public final void m6862c() {
        WindowDanmakuBinding windowDanmakuBinding = null;
        View viewInflate = View.inflate(getContext(), R$layout.window_danmaku, null);
        addView(viewInflate);
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(viewInflate);
        AbstractC9979u.m20291d(viewDataBindingBind);
        WindowDanmakuBinding windowDanmakuBinding2 = (WindowDanmakuBinding) viewDataBindingBind;
        this.f8960d = windowDanmakuBinding2;
        if (windowDanmakuBinding2 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            windowDanmakuBinding = windowDanmakuBinding2;
        }
        windowDanmakuBinding.f8636c.setVisibility(8);
        this.f8959c = new HandlerC6167a();
    }

    /* renamed from: d */
    public final ClockTextView m6863d() {
        ClockTextView clockTextView = (ClockTextView) this.f8961e.acquire();
        if (clockTextView == null) {
            Context context = getContext();
            AbstractC9979u.m20293f(context, "getContext(...)");
            clockTextView = new ClockTextView(context);
            clockTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            clockTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            clockTextView.setTextSize(12.0f);
        }
        clockTextView.setGravity(17);
        clockTextView.m6866d();
        return clockTextView;
    }
}
