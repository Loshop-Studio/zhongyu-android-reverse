package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.R$id;
import com.blankj.utilcode.R$layout;
import com.blankj.utilcode.util.AbstractC4657l0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class ToastUtils {

    /* renamed from: l */
    public static final ToastUtils f2006l = m2092n();

    /* renamed from: m */
    public static WeakReference f2007m;

    /* renamed from: a */
    public String f2008a;

    /* renamed from: b */
    public int f2009b = -1;

    /* renamed from: c */
    public int f2010c = -1;

    /* renamed from: d */
    public int f2011d = -1;

    /* renamed from: e */
    public int f2012e = -16777217;

    /* renamed from: f */
    public int f2013f = -1;

    /* renamed from: g */
    public int f2014g = -16777217;

    /* renamed from: h */
    public int f2015h = -1;

    /* renamed from: i */
    public boolean f2016i = false;

    /* renamed from: j */
    public Drawable[] f2017j = new Drawable[4];

    /* renamed from: k */
    public boolean f2018k = false;

    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {

        /* renamed from: a */
        public static final int f2019a = AbstractC4663o0.m2322g(80.0f);

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public void onMeasure(int i6, int i7) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AbstractC4663o0.m2328m() - f2019a, Integer.MIN_VALUE), i7);
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$a */
    public class RunnableC4627a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (ToastUtils.f2007m != null) {
                InterfaceC4631e interfaceC4631e = (InterfaceC4631e) ToastUtils.f2007m.get();
                if (interfaceC4631e != null) {
                    interfaceC4631e.cancel();
                }
                WeakReference unused = ToastUtils.f2007m = null;
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$b */
    public class RunnableC4628b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f2021b;

        /* renamed from: c */
        public final /* synthetic */ CharSequence f2022c;

        /* renamed from: d */
        public final /* synthetic */ int f2023d;

        public RunnableC4628b(View view, CharSequence charSequence, int i6) {
            this.f2021b = view;
            this.f2022c = charSequence;
            this.f2023d = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToastUtils.m2090l();
            InterfaceC4631e interfaceC4631eM2093o = ToastUtils.m2093o(ToastUtils.this);
            WeakReference unused = ToastUtils.f2007m = new WeakReference(interfaceC4631eM2093o);
            View view = this.f2021b;
            if (view != null) {
                interfaceC4631eM2093o.mo2098a(view);
            } else {
                interfaceC4631eM2093o.mo2099b(this.f2022c);
            }
            interfaceC4631eM2093o.show(this.f2023d);
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$c */
    public static abstract class AbstractC4629c implements InterfaceC4631e {

        /* renamed from: a */
        public Toast f2024a = new Toast(AbstractC4657l0.m2250a());

        /* renamed from: b */
        public ToastUtils f2025b;

        /* renamed from: c */
        public View f2026c;

        public AbstractC4629c(ToastUtils toastUtils) {
            this.f2025b = toastUtils;
            if (toastUtils.f2009b == -1 && this.f2025b.f2010c == -1 && this.f2025b.f2011d == -1) {
                return;
            }
            this.f2024a.setGravity(this.f2025b.f2009b, this.f2025b.f2010c, this.f2025b.f2011d);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        /* renamed from: a */
        public void mo2098a(View view) {
            this.f2026c = view;
            this.f2024a.setView(view);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        /* renamed from: b */
        public void mo2099b(CharSequence charSequence) {
            View viewM2097s = this.f2025b.m2097s(charSequence);
            if (viewM2097s != null) {
                mo2098a(viewM2097s);
                m2101d();
                return;
            }
            View view = this.f2024a.getView();
            this.f2026c = view;
            if (view == null || view.findViewById(R.id.message) == null) {
                mo2098a(AbstractC4663o0.m2306I(R$layout.utils_toast_view));
            }
            TextView textView = (TextView) this.f2026c.findViewById(R.id.message);
            textView.setText(charSequence);
            if (this.f2025b.f2014g != -16777217) {
                textView.setTextColor(this.f2025b.f2014g);
            }
            if (this.f2025b.f2015h != -1) {
                textView.setTextSize(this.f2025b.f2015h);
            }
            m2102e(textView);
            m2101d();
        }

        /* renamed from: c */
        public View m2100c(int i6) {
            Bitmap bitmapM2313P = AbstractC4663o0.m2313P(this.f2026c);
            ImageView imageView = new ImageView(AbstractC4657l0.m2250a());
            imageView.setTag("TAG_TOAST" + i6);
            imageView.setImageBitmap(bitmapM2313P);
            return imageView;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        public void cancel() {
            Toast toast = this.f2024a;
            if (toast != null) {
                toast.cancel();
            }
            this.f2024a = null;
            this.f2026c = null;
        }

        /* renamed from: d */
        public final void m2101d() {
            if (AbstractC4663o0.m2302E()) {
                mo2098a(m2100c(-1));
            }
        }

        /* renamed from: e */
        public final void m2102e(TextView textView) {
            if (this.f2025b.f2013f != -1) {
                this.f2026c.setBackgroundResource(this.f2025b.f2013f);
                textView.setBackgroundColor(0);
                return;
            }
            if (this.f2025b.f2012e != -16777217) {
                Drawable background = this.f2026c.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f2025b.f2012e, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f2025b.f2012e, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.f2025b.f2012e, PorterDuff.Mode.SRC_IN));
                } else {
                    this.f2026c.setBackgroundColor(this.f2025b.f2012e);
                }
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$d */
    public static final class C4630d extends AbstractC4629c {

        /* renamed from: f */
        public static int f2027f;

        /* renamed from: d */
        public AbstractC4657l0.a f2028d;

        /* renamed from: e */
        public InterfaceC4631e f2029e;

        /* renamed from: com.blankj.utilcode.util.ToastUtils$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4630d.this.cancel();
            }
        }

        /* renamed from: com.blankj.utilcode.util.ToastUtils$d$b */
        public class b extends AbstractC4657l0.a {

            /* renamed from: a */
            public final /* synthetic */ int f2031a;

            public b(int i6) {
                this.f2031a = i6;
            }

            @Override // com.blankj.utilcode.util.AbstractC4657l0.a
            /* renamed from: a */
            public void mo2111a(Activity activity) {
                if (C4630d.this.m2105h()) {
                    C4630d.this.m2108k(activity, this.f2031a, false);
                }
            }
        }

        public C4630d(ToastUtils toastUtils) {
            super(toastUtils);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.AbstractC4629c, com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        public void cancel() {
            Window window;
            if (m2105h()) {
                m2110m();
                for (Activity activity : AbstractC4663o0.m2327l()) {
                    if (AbstractC4663o0.m2298A(activity) && (window = activity.getWindow()) != null) {
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        StringBuilder sb = new StringBuilder();
                        sb.append("TAG_TOAST");
                        sb.append(f2027f - 1);
                        View viewFindViewWithTag = viewGroup.findViewWithTag(sb.toString());
                        if (viewFindViewWithTag != null) {
                            try {
                                viewGroup.removeView(viewFindViewWithTag);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            InterfaceC4631e interfaceC4631e = this.f2029e;
            if (interfaceC4631e != null) {
                interfaceC4631e.cancel();
                this.f2029e = null;
            }
            super.cancel();
        }

        /* renamed from: h */
        public final boolean m2105h() {
            return this.f2028d != null;
        }

        /* renamed from: i */
        public final void m2106i() {
            b bVar = new b(f2027f);
            this.f2028d = bVar;
            AbstractC4663o0.m2316a(bVar);
        }

        /* renamed from: j */
        public final InterfaceC4631e m2107j(int i6) {
            C4632f c4632f = new C4632f(this.f2025b);
            c4632f.f2024a = this.f2024a;
            c4632f.show(i6);
            return c4632f;
        }

        /* renamed from: k */
        public final void m2108k(Activity activity, int i6, boolean z6) {
            Window window = activity.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.f2024a.getGravity();
                layoutParams.bottomMargin = this.f2024a.getYOffset() + AbstractC4663o0.m2336u();
                layoutParams.topMargin = this.f2024a.getYOffset() + AbstractC4663o0.m2339x();
                layoutParams.leftMargin = this.f2024a.getXOffset();
                View viewM2100c = m2100c(i6);
                if (z6) {
                    viewM2100c.setAlpha(0.0f);
                    viewM2100c.animate().alpha(1.0f).setDuration(200L).start();
                }
                viewGroup.addView(viewM2100c, layoutParams);
            }
        }

        /* renamed from: l */
        public final InterfaceC4631e m2109l(Activity activity, int i6) {
            C4633g c4633g = new C4633g(this.f2025b, activity.getWindowManager(), 99);
            c4633g.f2026c = m2100c(-1);
            c4633g.f2024a = this.f2024a;
            c4633g.show(i6);
            return c4633g;
        }

        /* renamed from: m */
        public final void m2110m() {
            AbstractC4663o0.m2309L(this.f2028d);
            this.f2028d = null;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        public void show(int i6) {
            if (this.f2024a == null) {
                return;
            }
            if (!AbstractC4663o0.m2299B()) {
                this.f2029e = m2107j(i6);
                return;
            }
            boolean z6 = false;
            for (Activity activity : AbstractC4663o0.m2327l()) {
                if (AbstractC4663o0.m2298A(activity)) {
                    if (z6) {
                        m2108k(activity, f2027f, true);
                    } else {
                        this.f2029e = m2109l(activity, i6);
                        z6 = true;
                    }
                }
            }
            if (!z6) {
                this.f2029e = m2107j(i6);
                return;
            }
            m2106i();
            AbstractC4663o0.m2311N(new a(), i6 == 0 ? 2000L : 3500L);
            f2027f++;
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$e */
    public interface InterfaceC4631e {
        /* renamed from: a */
        void mo2098a(View view);

        /* renamed from: b */
        void mo2099b(CharSequence charSequence);

        void cancel();

        void show(int i6);
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$f */
    public static final class C4632f extends AbstractC4629c {

        /* renamed from: com.blankj.utilcode.util.ToastUtils$f$a */
        public static class a extends Handler {

            /* renamed from: a */
            public Handler f2033a;

            public a(Handler handler) {
                this.f2033a = handler;
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                try {
                    this.f2033a.dispatchMessage(message);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                this.f2033a.handleMessage(message);
            }
        }

        public C4632f(ToastUtils toastUtils) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            super(toastUtils);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f2024a);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new a((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        public void show(int i6) {
            Toast toast = this.f2024a;
            if (toast == null) {
                return;
            }
            toast.setDuration(i6);
            this.f2024a.show();
        }
    }

    /* renamed from: l */
    public static void m2090l() {
        AbstractC4663o0.m2310M(new RunnableC4627a());
    }

    /* renamed from: m */
    public static CharSequence m2091m(CharSequence charSequence) {
        return charSequence == null ? "toast null" : charSequence.length() == 0 ? "toast nothing" : charSequence;
    }

    /* renamed from: n */
    public static ToastUtils m2092n() {
        return new ToastUtils();
    }

    /* renamed from: o */
    public static InterfaceC4631e m2093o(ToastUtils toastUtils) {
        if (!toastUtils.f2018k && NotificationManagerCompat.from(AbstractC4657l0.m2250a()).areNotificationsEnabled() && !AbstractC4663o0.m2301D()) {
            return new C4632f(toastUtils);
        }
        int i6 = Build.VERSION.SDK_INT;
        return i6 < 25 ? new C4633g(toastUtils, 2005) : AbstractC4663o0.m2301D() ? i6 >= 26 ? new C4633g(toastUtils, 2038) : new C4633g(toastUtils, 2002) : new C4630d(toastUtils);
    }

    /* renamed from: p */
    public static void m2094p(View view, CharSequence charSequence, int i6, ToastUtils toastUtils) {
        AbstractC4663o0.m2310M(toastUtils.new RunnableC4628b(view, charSequence, i6));
    }

    /* renamed from: q */
    public static void m2095q(CharSequence charSequence, int i6, ToastUtils toastUtils) {
        m2094p(null, m2091m(charSequence), i6, toastUtils);
    }

    /* renamed from: r */
    public static void m2096r(String str, Object... objArr) {
        m2095q(AbstractC4663o0.m2325j(str, objArr), 0, f2006l);
    }

    /* renamed from: s */
    public final View m2097s(CharSequence charSequence) {
        if (!"dark".equals(this.f2008a) && !"light".equals(this.f2008a)) {
            Drawable[] drawableArr = this.f2017j;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View viewM2306I = AbstractC4663o0.m2306I(R$layout.utils_toast_view);
        TextView textView = (TextView) viewM2306I.findViewById(R.id.message);
        if ("dark".equals(this.f2008a)) {
            ((GradientDrawable) viewM2306I.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.f2017j[0] != null) {
            View viewFindViewById = viewM2306I.findViewById(R$id.utvLeftIconView);
            ViewCompat.setBackground(viewFindViewById, this.f2017j[0]);
            viewFindViewById.setVisibility(0);
        }
        if (this.f2017j[1] != null) {
            View viewFindViewById2 = viewM2306I.findViewById(R$id.utvTopIconView);
            ViewCompat.setBackground(viewFindViewById2, this.f2017j[1]);
            viewFindViewById2.setVisibility(0);
        }
        if (this.f2017j[2] != null) {
            View viewFindViewById3 = viewM2306I.findViewById(R$id.utvRightIconView);
            ViewCompat.setBackground(viewFindViewById3, this.f2017j[2]);
            viewFindViewById3.setVisibility(0);
        }
        if (this.f2017j[3] != null) {
            View viewFindViewById4 = viewM2306I.findViewById(R$id.utvBottomIconView);
            ViewCompat.setBackground(viewFindViewById4, this.f2017j[3]);
            viewFindViewById4.setVisibility(0);
        }
        return viewM2306I;
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$g */
    public static final class C4633g extends AbstractC4629c {

        /* renamed from: d */
        public WindowManager f2034d;

        /* renamed from: e */
        public WindowManager.LayoutParams f2035e;

        /* renamed from: com.blankj.utilcode.util.ToastUtils$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4633g.this.cancel();
            }
        }

        public C4633g(ToastUtils toastUtils, int i6) {
            super(toastUtils);
            this.f2035e = new WindowManager.LayoutParams();
            this.f2034d = (WindowManager) AbstractC4657l0.m2250a().getSystemService("window");
            this.f2035e.type = i6;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.AbstractC4629c, com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        public void cancel() {
            try {
                WindowManager windowManager = this.f2034d;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.f2026c);
                    this.f2034d = null;
                }
            } catch (Exception unused) {
            }
            super.cancel();
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC4631e
        public void show(int i6) {
            if (this.f2024a == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = this.f2035e;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation.Toast;
            layoutParams.setTitle("ToastWithoutNotification");
            WindowManager.LayoutParams layoutParams2 = this.f2035e;
            layoutParams2.flags = 152;
            layoutParams2.packageName = AbstractC4657l0.m2250a().getPackageName();
            this.f2035e.gravity = this.f2024a.getGravity();
            WindowManager.LayoutParams layoutParams3 = this.f2035e;
            int i7 = layoutParams3.gravity;
            if ((i7 & 7) == 7) {
                layoutParams3.horizontalWeight = 1.0f;
            }
            if ((i7 & 112) == 112) {
                layoutParams3.verticalWeight = 1.0f;
            }
            layoutParams3.x = this.f2024a.getXOffset();
            this.f2035e.y = this.f2024a.getYOffset();
            this.f2035e.horizontalMargin = this.f2024a.getHorizontalMargin();
            this.f2035e.verticalMargin = this.f2024a.getVerticalMargin();
            try {
                WindowManager windowManager = this.f2034d;
                if (windowManager != null) {
                    windowManager.addView(this.f2026c, this.f2035e);
                }
            } catch (Exception unused) {
            }
            AbstractC4663o0.m2311N(new a(), i6 == 0 ? 2000L : 3500L);
        }

        public C4633g(ToastUtils toastUtils, WindowManager windowManager, int i6) {
            super(toastUtils);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f2035e = layoutParams;
            this.f2034d = windowManager;
            layoutParams.type = i6;
        }
    }
}
