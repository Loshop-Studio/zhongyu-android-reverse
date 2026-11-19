package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.g.i.l */
/* loaded from: classes.dex */
public class C0059l {

    /* renamed from: a */
    public final Context f502a;

    /* renamed from: b */
    public final C0054g f503b;

    /* renamed from: c */
    public final boolean f504c;

    /* renamed from: d */
    public final int f505d;

    /* renamed from: e */
    public final int f506e;

    /* renamed from: f */
    public View f507f;

    /* renamed from: h */
    public boolean f509h;

    /* renamed from: i */
    public InterfaceC0060m.a f510i;

    /* renamed from: j */
    public AbstractC0058k f511j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f512k;

    /* renamed from: g */
    public int f508g = 8388611;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f513l = new a();

    /* renamed from: a.b.g.i.l$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0059l.this.mo246c();
        }
    }

    public C0059l(Context context, C0054g c0054g, View view, boolean z, int i, int i2) {
        this.f502a = context;
        this.f503b = c0054g;
        this.f507f = view;
        this.f504c = z;
        this.f505d = i;
        this.f506e = i2;
    }

    /* renamed from: a */
    public AbstractC0058k m244a() {
        if (this.f511j == null) {
            Display defaultDisplay = ((WindowManager) this.f502a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            AbstractC0058k viewOnKeyListenerC0051d = Math.min(point.x, point.y) >= this.f502a.getResources().getDimensionPixelSize(C1088R.dimen.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC0051d(this.f502a, this.f507f, this.f505d, this.f506e, this.f504c) : new ViewOnKeyListenerC0064q(this.f502a, this.f503b, this.f507f, this.f505d, this.f506e, this.f504c);
            viewOnKeyListenerC0051d.mo178l(this.f503b);
            viewOnKeyListenerC0051d.mo184s(this.f513l);
            viewOnKeyListenerC0051d.mo180o(this.f507f);
            viewOnKeyListenerC0051d.mo167e(this.f510i);
            viewOnKeyListenerC0051d.mo181p(this.f509h);
            viewOnKeyListenerC0051d.mo182q(this.f508g);
            this.f511j = viewOnKeyListenerC0051d;
        }
        return this.f511j;
    }

    /* renamed from: b */
    public boolean m245b() {
        AbstractC0058k abstractC0058k = this.f511j;
        return abstractC0058k != null && abstractC0058k.mo171a();
    }

    /* renamed from: c */
    public void mo246c() {
        this.f511j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f512k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public void m247d(InterfaceC0060m.a aVar) {
        this.f510i = aVar;
        AbstractC0058k abstractC0058k = this.f511j;
        if (abstractC0058k != null) {
            abstractC0058k.mo167e(aVar);
        }
    }

    /* renamed from: e */
    public final void m248e(int i, int i2, boolean z, boolean z2) {
        AbstractC0058k abstractC0058kM244a = m244a();
        abstractC0058kM244a.mo185t(z2);
        if (z) {
            int i3 = this.f508g;
            View view = this.f507f;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f507f.getWidth();
            }
            abstractC0058kM244a.mo183r(i);
            abstractC0058kM244a.mo186u(i2);
            int i4 = (int) ((this.f502a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0058kM244a.f501b = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        abstractC0058kM244a.mo172b();
    }

    /* renamed from: f */
    public boolean m249f() {
        if (m245b()) {
            return true;
        }
        if (this.f507f == null) {
            return false;
        }
        m248e(0, 0, false, false);
        return true;
    }
}
