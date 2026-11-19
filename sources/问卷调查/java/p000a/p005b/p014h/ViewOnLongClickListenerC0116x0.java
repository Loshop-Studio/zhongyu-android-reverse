package p000a.p005b.p014h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0272u;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.h.x0 */
/* loaded from: classes.dex */
public class ViewOnLongClickListenerC0116x0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static ViewOnLongClickListenerC0116x0 f855k;

    /* renamed from: l */
    public static ViewOnLongClickListenerC0116x0 f856l;

    /* renamed from: b */
    public final View f857b;

    /* renamed from: c */
    public final CharSequence f858c;

    /* renamed from: d */
    public final int f859d;

    /* renamed from: e */
    public final Runnable f860e = new a();

    /* renamed from: f */
    public final Runnable f861f = new b();

    /* renamed from: g */
    public int f862g;

    /* renamed from: h */
    public int f863h;

    /* renamed from: i */
    public C0118y0 f864i;

    /* renamed from: j */
    public boolean f865j;

    /* renamed from: a.b.h.x0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewOnLongClickListenerC0116x0.this.m449d(false);
        }
    }

    /* renamed from: a.b.h.x0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0116x0.this.m448b();
        }
    }

    public ViewOnLongClickListenerC0116x0(View view, CharSequence charSequence) {
        this.f857b = view;
        this.f858c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C0272u.f1631a;
        this.f859d = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        m447a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: c */
    public static void m446c(ViewOnLongClickListenerC0116x0 viewOnLongClickListenerC0116x0) {
        ViewOnLongClickListenerC0116x0 viewOnLongClickListenerC0116x02 = f855k;
        if (viewOnLongClickListenerC0116x02 != null) {
            viewOnLongClickListenerC0116x02.f857b.removeCallbacks(viewOnLongClickListenerC0116x02.f860e);
        }
        f855k = viewOnLongClickListenerC0116x0;
        if (viewOnLongClickListenerC0116x0 != null) {
            viewOnLongClickListenerC0116x0.f857b.postDelayed(viewOnLongClickListenerC0116x0.f860e, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m447a() {
        this.f862g = Integer.MAX_VALUE;
        this.f863h = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public void m448b() {
        if (f856l == this) {
            f856l = null;
            C0118y0 c0118y0 = this.f864i;
            if (c0118y0 != null) {
                c0118y0.m450a();
                this.f864i = null;
                m447a();
                this.f857b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f855k == this) {
            m446c(null);
        }
        this.f857b.removeCallbacks(this.f861f);
    }

    /* renamed from: d */
    public void m449d(boolean z) throws Resources.NotFoundException {
        int height;
        int i;
        long longPressTimeout;
        View view = this.f857b;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (view.isAttachedToWindow()) {
            m446c(null);
            ViewOnLongClickListenerC0116x0 viewOnLongClickListenerC0116x0 = f856l;
            if (viewOnLongClickListenerC0116x0 != null) {
                viewOnLongClickListenerC0116x0.m448b();
            }
            f856l = this;
            this.f865j = z;
            C0118y0 c0118y0 = new C0118y0(this.f857b.getContext());
            this.f864i = c0118y0;
            View view2 = this.f857b;
            int width = this.f862g;
            int i2 = this.f863h;
            boolean z2 = this.f865j;
            CharSequence charSequence = this.f858c;
            if (c0118y0.f871b.getParent() != null) {
                c0118y0.m450a();
            }
            c0118y0.f872c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = c0118y0.f873d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = c0118y0.f870a.getResources().getDimensionPixelOffset(C1088R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                width = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = c0118y0.f870a.getResources().getDimensionPixelOffset(C1088R.dimen.tooltip_precise_anchor_extra_offset);
                height = i2 + dimensionPixelOffset2;
                i = i2 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = c0118y0.f870a.getResources().getDimensionPixelOffset(z2 ? C1088R.dimen.tooltip_y_offset_touch : C1088R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(c0118y0.f874e);
                Rect rect = c0118y0.f874e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = c0118y0.f870a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    c0118y0.f874e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(c0118y0.f876g);
                view2.getLocationOnScreen(c0118y0.f875f);
                int[] iArr = c0118y0.f875f;
                int i3 = iArr[0];
                int[] iArr2 = c0118y0.f876g;
                iArr[0] = i3 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                c0118y0.f871b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = c0118y0.f871b.getMeasuredHeight();
                int[] iArr3 = c0118y0.f875f;
                int i4 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i5 = iArr3[1] + height + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i5 <= c0118y0.f874e.height() : i4 < 0) {
                    layoutParams.y = i4;
                } else {
                    layoutParams.y = i5;
                }
            }
            ((WindowManager) c0118y0.f870a.getSystemService("window")).addView(c0118y0.f871b, c0118y0.f873d);
            this.f857b.addOnAttachStateChangeListener(this);
            if (this.f865j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((this.f857b.getWindowSystemUiVisibility() & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f857b.removeCallbacks(this.f861f);
            this.f857b.postDelayed(this.f861f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f864i != null && this.f865j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f857b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m447a();
                m448b();
            }
        } else if (this.f857b.isEnabled() && this.f864i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f862g) > this.f859d || Math.abs(y - this.f863h) > this.f859d) {
                this.f862g = x;
                this.f863h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m446c(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f862g = view.getWidth() / 2;
        this.f863h = view.getHeight() / 2;
        m449d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m448b();
    }
}
