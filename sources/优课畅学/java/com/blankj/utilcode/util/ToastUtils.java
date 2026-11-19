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
import com.blankj.utilcode.util.AbstractC5366h0;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class ToastUtils {

    /* renamed from: l */
    public static final ToastUtils f2657l = m2398n();

    /* renamed from: m */
    public static WeakReference f2658m;

    /* renamed from: a */
    public String f2659a;

    /* renamed from: b */
    public int f2660b = -1;

    /* renamed from: c */
    public int f2661c = -1;

    /* renamed from: d */
    public int f2662d = -1;

    /* renamed from: e */
    public int f2663e = -16777217;

    /* renamed from: f */
    public int f2664f = -1;

    /* renamed from: g */
    public int f2665g = -16777217;

    /* renamed from: h */
    public int f2666h = -1;

    /* renamed from: i */
    public boolean f2667i = false;

    /* renamed from: j */
    public Drawable[] f2668j = new Drawable[4];

    /* renamed from: k */
    public boolean f2669k = false;

    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {

        /* renamed from: a */
        public static final int f2670a = AbstractC5372k0.m2550f(80.0f);

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AbstractC5372k0.m2556l() - f2670a, Integer.MIN_VALUE), i11);
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$a */
    public class RunnableC5344a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (ToastUtils.f2658m != null) {
                InterfaceC5348e interfaceC5348e = (InterfaceC5348e) ToastUtils.f2658m.get();
                if (interfaceC5348e != null) {
                    interfaceC5348e.cancel();
                }
                WeakReference unused = ToastUtils.f2658m = null;
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$b */
    public class RunnableC5345b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f2672b;

        /* renamed from: c */
        public final /* synthetic */ CharSequence f2673c;

        /* renamed from: d */
        public final /* synthetic */ int f2674d;

        public RunnableC5345b(View view, CharSequence charSequence, int i10) {
            this.f2672b = view;
            this.f2673c = charSequence;
            this.f2674d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToastUtils.m2396l();
            InterfaceC5348e interfaceC5348eM2399o = ToastUtils.m2399o(ToastUtils.this);
            WeakReference unused = ToastUtils.f2658m = new WeakReference(interfaceC5348eM2399o);
            View view = this.f2672b;
            if (view != null) {
                interfaceC5348eM2399o.mo2405a(view);
            } else {
                interfaceC5348eM2399o.mo2406b(this.f2673c);
            }
            interfaceC5348eM2399o.show(this.f2674d);
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$c */
    public static abstract class AbstractC5346c implements InterfaceC5348e {

        /* renamed from: a */
        public Toast f2675a = new Toast(AbstractC5366h0.m2478a());

        /* renamed from: b */
        public ToastUtils f2676b;

        /* renamed from: c */
        public View f2677c;

        public AbstractC5346c(ToastUtils toastUtils) {
            this.f2676b = toastUtils;
            if (toastUtils.f2660b == -1 && this.f2676b.f2661c == -1 && this.f2676b.f2662d == -1) {
                return;
            }
            this.f2675a.setGravity(this.f2676b.f2660b, this.f2676b.f2661c, this.f2676b.f2662d);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        /* renamed from: a */
        public void mo2405a(View view) {
            this.f2677c = view;
            this.f2675a.setView(view);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        /* renamed from: b */
        public void mo2406b(CharSequence charSequence) {
            View viewM2404t = this.f2676b.m2404t(charSequence);
            if (viewM2404t != null) {
                mo2405a(viewM2404t);
                m2408d();
                return;
            }
            View view = this.f2675a.getView();
            this.f2677c = view;
            if (view == null || view.findViewById(R.id.message) == null) {
                mo2405a(AbstractC5372k0.m2535F(R$layout.utils_toast_view));
            }
            TextView textView = (TextView) this.f2677c.findViewById(R.id.message);
            textView.setText(charSequence);
            if (this.f2676b.f2665g != -16777217) {
                textView.setTextColor(this.f2676b.f2665g);
            }
            if (this.f2676b.f2666h != -1) {
                textView.setTextSize(this.f2676b.f2666h);
            }
            m2409e(textView);
            m2408d();
        }

        /* renamed from: c */
        public View m2407c(int i10) {
            Bitmap bitmapM2542M = AbstractC5372k0.m2542M(this.f2677c);
            ImageView imageView = new ImageView(AbstractC5366h0.m2478a());
            imageView.setTag("TAG_TOAST" + i10);
            imageView.setImageBitmap(bitmapM2542M);
            return imageView;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        public void cancel() {
            Toast toast = this.f2675a;
            if (toast != null) {
                toast.cancel();
            }
            this.f2675a = null;
            this.f2677c = null;
        }

        /* renamed from: d */
        public final void m2408d() {
            if (AbstractC5372k0.m2531B()) {
                mo2405a(m2407c(-1));
            }
        }

        /* renamed from: e */
        public final void m2409e(TextView textView) {
            if (this.f2676b.f2664f != -1) {
                this.f2677c.setBackgroundResource(this.f2676b.f2664f);
                textView.setBackgroundColor(0);
                return;
            }
            if (this.f2676b.f2663e != -16777217) {
                Drawable background = this.f2677c.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f2676b.f2663e, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f2676b.f2663e, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.f2676b.f2663e, PorterDuff.Mode.SRC_IN));
                } else {
                    this.f2677c.setBackgroundColor(this.f2676b.f2663e);
                }
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$d */
    public static final class C5347d extends AbstractC5346c {

        /* renamed from: f */
        public static int f2678f;

        /* renamed from: d */
        public AbstractC5366h0.a f2679d;

        /* renamed from: e */
        public InterfaceC5348e f2680e;

        /* renamed from: com.blankj.utilcode.util.ToastUtils$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5347d.this.cancel();
            }
        }

        /* renamed from: com.blankj.utilcode.util.ToastUtils$d$b */
        public class b extends AbstractC5366h0.a {

            /* renamed from: a */
            public final /* synthetic */ int f2682a;

            public b(int i10) {
                this.f2682a = i10;
            }

            @Override // com.blankj.utilcode.util.AbstractC5366h0.a
            /* renamed from: a */
            public void mo2418a(Activity activity) {
                if (C5347d.this.m2412h()) {
                    C5347d.this.m2415k(activity, this.f2682a, false);
                }
            }
        }

        public C5347d(ToastUtils toastUtils) {
            super(toastUtils);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.AbstractC5346c, com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        public void cancel() {
            Window window;
            if (m2412h()) {
                m2417m();
                for (Activity activity : AbstractC5372k0.m2555k()) {
                    if (AbstractC5372k0.m2568x(activity) && (window = activity.getWindow()) != null) {
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        StringBuilder sb = new StringBuilder();
                        sb.append("TAG_TOAST");
                        sb.append(f2678f - 1);
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
            InterfaceC5348e interfaceC5348e = this.f2680e;
            if (interfaceC5348e != null) {
                interfaceC5348e.cancel();
                this.f2680e = null;
            }
            super.cancel();
        }

        /* renamed from: h */
        public final boolean m2412h() {
            return this.f2679d != null;
        }

        /* renamed from: i */
        public final void m2413i() {
            b bVar = new b(f2678f);
            this.f2679d = bVar;
            AbstractC5372k0.m2545a(bVar);
        }

        /* renamed from: j */
        public final InterfaceC5348e m2414j(int i10) {
            C5349f c5349f = new C5349f(this.f2676b);
            c5349f.f2675a = this.f2675a;
            c5349f.show(i10);
            return c5349f;
        }

        /* renamed from: k */
        public final void m2415k(Activity activity, int i10, boolean z10) {
            Window window = activity.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.f2675a.getGravity();
                layoutParams.bottomMargin = this.f2675a.getYOffset() + AbstractC5372k0.m2562r();
                layoutParams.topMargin = this.f2675a.getYOffset() + AbstractC5372k0.m2565u();
                layoutParams.leftMargin = this.f2675a.getXOffset();
                View viewM2407c = m2407c(i10);
                if (z10) {
                    viewM2407c.setAlpha(0.0f);
                    viewM2407c.animate().alpha(1.0f).setDuration(200L).start();
                }
                viewGroup.addView(viewM2407c, layoutParams);
            }
        }

        /* renamed from: l */
        public final InterfaceC5348e m2416l(Activity activity, int i10) {
            C5350g c5350g = new C5350g(this.f2676b, activity.getWindowManager(), 99);
            c5350g.f2677c = m2407c(-1);
            c5350g.f2675a = this.f2675a;
            c5350g.show(i10);
            return c5350g;
        }

        /* renamed from: m */
        public final void m2417m() {
            AbstractC5372k0.m2538I(this.f2679d);
            this.f2679d = null;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        public void show(int i10) {
            if (this.f2675a == null) {
                return;
            }
            if (!AbstractC5372k0.m2569y()) {
                this.f2680e = m2414j(i10);
                return;
            }
            boolean z10 = false;
            for (Activity activity : AbstractC5372k0.m2555k()) {
                if (AbstractC5372k0.m2568x(activity)) {
                    if (z10) {
                        m2415k(activity, f2678f, true);
                    } else {
                        this.f2680e = m2416l(activity, i10);
                        z10 = true;
                    }
                }
            }
            if (!z10) {
                this.f2680e = m2414j(i10);
                return;
            }
            m2413i();
            AbstractC5372k0.m2540K(new a(), i10 == 0 ? 2000L : 3500L);
            f2678f++;
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$e */
    public interface InterfaceC5348e {
        /* renamed from: a */
        void mo2405a(View view);

        /* renamed from: b */
        void mo2406b(CharSequence charSequence);

        void cancel();

        void show(int i10);
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$f */
    public static final class C5349f extends AbstractC5346c {

        /* renamed from: com.blankj.utilcode.util.ToastUtils$f$a */
        public static class a extends Handler {

            /* renamed from: a */
            public Handler f2684a;

            public a(Handler handler) {
                this.f2684a = handler;
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                try {
                    this.f2684a.dispatchMessage(message);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                this.f2684a.handleMessage(message);
            }
        }

        public C5349f(ToastUtils toastUtils) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            super(toastUtils);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f2675a);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new a((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        public void show(int i10) {
            Toast toast = this.f2675a;
            if (toast == null) {
                return;
            }
            toast.setDuration(i10);
            this.f2675a.show();
        }
    }

    /* renamed from: l */
    public static void m2396l() {
        AbstractC5372k0.m2539J(new RunnableC5344a());
    }

    /* renamed from: m */
    public static CharSequence m2397m(CharSequence charSequence) {
        return charSequence == null ? "toast null" : charSequence.length() == 0 ? "toast nothing" : charSequence;
    }

    /* renamed from: n */
    public static ToastUtils m2398n() {
        return new ToastUtils();
    }

    /* renamed from: o */
    public static InterfaceC5348e m2399o(ToastUtils toastUtils) {
        if (!toastUtils.f2669k && NotificationManagerCompat.from(AbstractC5366h0.m2478a()).areNotificationsEnabled() && !AbstractC5372k0.m2530A()) {
            return new C5349f(toastUtils);
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 25 ? new C5350g(toastUtils, 2005) : AbstractC5372k0.m2530A() ? i10 >= 26 ? new C5350g(toastUtils, 2038) : new C5350g(toastUtils, 2002) : new C5347d(toastUtils);
    }

    /* renamed from: p */
    public static void m2400p(View view, CharSequence charSequence, int i10, ToastUtils toastUtils) {
        AbstractC5372k0.m2539J(toastUtils.new RunnableC5345b(view, charSequence, i10));
    }

    /* renamed from: q */
    public static void m2401q(CharSequence charSequence, int i10, ToastUtils toastUtils) {
        m2400p(null, m2397m(charSequence), i10, toastUtils);
    }

    /* renamed from: r */
    public static void m2402r(int i10) {
        m2401q(AbstractC5372k0.m2566v(i10), 0, f2657l);
    }

    /* renamed from: s */
    public static void m2403s(String str, Object... objArr) {
        m2401q(AbstractC5372k0.m2553i(str, objArr), 0, f2657l);
    }

    /* renamed from: t */
    public final View m2404t(CharSequence charSequence) {
        if (!"dark".equals(this.f2659a) && !"light".equals(this.f2659a)) {
            Drawable[] drawableArr = this.f2668j;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View viewM2535F = AbstractC5372k0.m2535F(R$layout.utils_toast_view);
        TextView textView = (TextView) viewM2535F.findViewById(R.id.message);
        if ("dark".equals(this.f2659a)) {
            ((GradientDrawable) viewM2535F.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.f2668j[0] != null) {
            View viewFindViewById = viewM2535F.findViewById(R$id.utvLeftIconView);
            ViewCompat.setBackground(viewFindViewById, this.f2668j[0]);
            viewFindViewById.setVisibility(0);
        }
        if (this.f2668j[1] != null) {
            View viewFindViewById2 = viewM2535F.findViewById(R$id.utvTopIconView);
            ViewCompat.setBackground(viewFindViewById2, this.f2668j[1]);
            viewFindViewById2.setVisibility(0);
        }
        if (this.f2668j[2] != null) {
            View viewFindViewById3 = viewM2535F.findViewById(R$id.utvRightIconView);
            ViewCompat.setBackground(viewFindViewById3, this.f2668j[2]);
            viewFindViewById3.setVisibility(0);
        }
        if (this.f2668j[3] != null) {
            View viewFindViewById4 = viewM2535F.findViewById(R$id.utvBottomIconView);
            ViewCompat.setBackground(viewFindViewById4, this.f2668j[3]);
            viewFindViewById4.setVisibility(0);
        }
        return viewM2535F;
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$g */
    public static final class C5350g extends AbstractC5346c {

        /* renamed from: d */
        public WindowManager f2685d;

        /* renamed from: e */
        public WindowManager.LayoutParams f2686e;

        /* renamed from: com.blankj.utilcode.util.ToastUtils$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5350g.this.cancel();
            }
        }

        public C5350g(ToastUtils toastUtils, int i10) {
            super(toastUtils);
            this.f2686e = new WindowManager.LayoutParams();
            this.f2685d = (WindowManager) AbstractC5366h0.m2478a().getSystemService("window");
            this.f2686e.type = i10;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.AbstractC5346c, com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        public void cancel() {
            try {
                WindowManager windowManager = this.f2685d;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.f2677c);
                    this.f2685d = null;
                }
            } catch (Exception unused) {
            }
            super.cancel();
        }

        @Override // com.blankj.utilcode.util.ToastUtils.InterfaceC5348e
        public void show(int i10) {
            if (this.f2675a == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = this.f2686e;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation.Toast;
            layoutParams.setTitle("ToastWithoutNotification");
            WindowManager.LayoutParams layoutParams2 = this.f2686e;
            layoutParams2.flags = 152;
            layoutParams2.packageName = AbstractC5366h0.m2478a().getPackageName();
            this.f2686e.gravity = this.f2675a.getGravity();
            WindowManager.LayoutParams layoutParams3 = this.f2686e;
            int i11 = layoutParams3.gravity;
            if ((i11 & 7) == 7) {
                layoutParams3.horizontalWeight = 1.0f;
            }
            if ((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) == 112) {
                layoutParams3.verticalWeight = 1.0f;
            }
            layoutParams3.x = this.f2675a.getXOffset();
            this.f2686e.y = this.f2675a.getYOffset();
            this.f2686e.horizontalMargin = this.f2675a.getHorizontalMargin();
            this.f2686e.verticalMargin = this.f2675a.getVerticalMargin();
            try {
                WindowManager windowManager = this.f2685d;
                if (windowManager != null) {
                    windowManager.addView(this.f2677c, this.f2686e);
                }
            } catch (Exception unused) {
            }
            AbstractC5372k0.m2540K(new a(), i10 == 0 ? 2000L : 3500L);
        }

        public C5350g(ToastUtils toastUtils, WindowManager windowManager, int i10) {
            super(toastUtils);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f2686e = layoutParams;
            this.f2685d = windowManager;
            layoutParams.type = i10;
        }
    }
}
