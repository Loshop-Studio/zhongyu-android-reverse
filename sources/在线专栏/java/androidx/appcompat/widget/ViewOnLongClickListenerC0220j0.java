package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0358u;
import androidx.core.view.C0359v;

/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC0220j0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j */
    private static ViewOnLongClickListenerC0220j0 f1124j;

    /* renamed from: k */
    private static ViewOnLongClickListenerC0220j0 f1125k;

    /* renamed from: a */
    private final View f1126a;

    /* renamed from: b */
    private final CharSequence f1127b;

    /* renamed from: c */
    private final int f1128c;

    /* renamed from: d */
    private final Runnable f1129d = new a();

    /* renamed from: e */
    private final Runnable f1130e = new b();

    /* renamed from: f */
    private int f1131f;

    /* renamed from: g */
    private int f1132g;

    /* renamed from: h */
    private C0222k0 f1133h;

    /* renamed from: i */
    private boolean f1134i;

    /* renamed from: androidx.appcompat.widget.j0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewOnLongClickListenerC0220j0.this.m901g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0220j0.this.m900c();
        }
    }

    private ViewOnLongClickListenerC0220j0(View view, CharSequence charSequence) {
        this.f1126a = view;
        this.f1127b = charSequence;
        this.f1128c = C0359v.m2108c(ViewConfiguration.get(view.getContext()));
        m895b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m894a() {
        this.f1126a.removeCallbacks(this.f1129d);
    }

    /* renamed from: b */
    private void m895b() {
        this.f1131f = Integer.MAX_VALUE;
        this.f1132g = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m896d() {
        this.f1126a.postDelayed(this.f1129d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m897e(ViewOnLongClickListenerC0220j0 viewOnLongClickListenerC0220j0) {
        ViewOnLongClickListenerC0220j0 viewOnLongClickListenerC0220j02 = f1124j;
        if (viewOnLongClickListenerC0220j02 != null) {
            viewOnLongClickListenerC0220j02.m894a();
        }
        f1124j = viewOnLongClickListenerC0220j0;
        if (viewOnLongClickListenerC0220j0 != null) {
            viewOnLongClickListenerC0220j0.m896d();
        }
    }

    /* renamed from: f */
    public static void m898f(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0220j0 viewOnLongClickListenerC0220j0 = f1124j;
        if (viewOnLongClickListenerC0220j0 != null && viewOnLongClickListenerC0220j0.f1126a == view) {
            m897e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0220j0(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0220j0 viewOnLongClickListenerC0220j02 = f1125k;
        if (viewOnLongClickListenerC0220j02 != null && viewOnLongClickListenerC0220j02.f1126a == view) {
            viewOnLongClickListenerC0220j02.m900c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: h */
    private boolean m899h(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (Math.abs(x3 - this.f1131f) <= this.f1128c && Math.abs(y3 - this.f1132g) <= this.f1128c) {
            return false;
        }
        this.f1131f = x3;
        this.f1132g = y3;
        return true;
    }

    /* renamed from: c */
    void m900c() {
        if (f1125k == this) {
            f1125k = null;
            C0222k0 c0222k0 = this.f1133h;
            if (c0222k0 != null) {
                c0222k0.m909c();
                this.f1133h = null;
                m895b();
                this.f1126a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1124j == this) {
            m897e(null);
        }
        this.f1126a.removeCallbacks(this.f1130e);
    }

    /* renamed from: g */
    void m901g(boolean z3) throws Resources.NotFoundException {
        long j4;
        int longPressTimeout;
        long j5;
        if (C0358u.m2012U(this.f1126a)) {
            m897e(null);
            ViewOnLongClickListenerC0220j0 viewOnLongClickListenerC0220j0 = f1125k;
            if (viewOnLongClickListenerC0220j0 != null) {
                viewOnLongClickListenerC0220j0.m900c();
            }
            f1125k = this;
            this.f1134i = z3;
            C0222k0 c0222k0 = new C0222k0(this.f1126a.getContext());
            this.f1133h = c0222k0;
            c0222k0.m911e(this.f1126a, this.f1131f, this.f1132g, this.f1134i, this.f1127b);
            this.f1126a.addOnAttachStateChangeListener(this);
            if (this.f1134i) {
                j5 = 2500;
            } else {
                if ((C0358u.m2006O(this.f1126a) & 1) == 1) {
                    j4 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j4 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j5 = j4 - longPressTimeout;
            }
            this.f1126a.removeCallbacks(this.f1130e);
            this.f1126a.postDelayed(this.f1130e, j5);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1133h != null && this.f1134i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1126a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m895b();
                m900c();
            }
        } else if (this.f1126a.isEnabled() && this.f1133h == null && m899h(motionEvent)) {
            m897e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f1131f = view.getWidth() / 2;
        this.f1132g = view.getHeight() / 2;
        m901g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m900c();
    }
}
