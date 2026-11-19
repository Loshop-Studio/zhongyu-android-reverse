package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.core.view.C0342e;
import androidx.core.view.C0358u;
import p015c.C1041d;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class C0130l {

    /* renamed from: a */
    private final Context f659a;

    /* renamed from: b */
    private final C0125g f660b;

    /* renamed from: c */
    private final boolean f661c;

    /* renamed from: d */
    private final int f662d;

    /* renamed from: e */
    private final int f663e;

    /* renamed from: f */
    private View f664f;

    /* renamed from: g */
    private int f665g;

    /* renamed from: h */
    private boolean f666h;

    /* renamed from: i */
    private InterfaceC0131m.a f667i;

    /* renamed from: j */
    private AbstractC0129k f668j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f669k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f670l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0130l.this.mo524e();
        }
    }

    public C0130l(Context context, C0125g c0125g, View view, boolean z3, int i4) {
        this(context, c0125g, view, z3, i4, 0);
    }

    /* renamed from: a */
    private AbstractC0129k m519a() {
        Display defaultDisplay = ((WindowManager) this.f659a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC0129k viewOnKeyListenerC0122d = Math.min(point.x, point.y) >= this.f659a.getResources().getDimensionPixelSize(C1041d.f5774c) ? new ViewOnKeyListenerC0122d(this.f659a, this.f664f, this.f662d, this.f663e, this.f661c) : new ViewOnKeyListenerC0135q(this.f659a, this.f660b, this.f664f, this.f662d, this.f663e, this.f661c);
        viewOnKeyListenerC0122d.mo451b(this.f660b);
        viewOnKeyListenerC0122d.mo458l(this.f670l);
        viewOnKeyListenerC0122d.mo454g(this.f664f);
        viewOnKeyListenerC0122d.setCallback(this.f667i);
        viewOnKeyListenerC0122d.mo455i(this.f666h);
        viewOnKeyListenerC0122d.mo456j(this.f665g);
        return viewOnKeyListenerC0122d;
    }

    /* renamed from: l */
    private void m520l(int i4, int i5, boolean z3, boolean z4) {
        AbstractC0129k abstractC0129kM522c = m522c();
        abstractC0129kM522c.mo459m(z4);
        if (z3) {
            if ((C0342e.m1928b(this.f665g, C0358u.m1978A(this.f664f)) & 7) == 5) {
                i4 -= this.f664f.getWidth();
            }
            abstractC0129kM522c.mo457k(i4);
            abstractC0129kM522c.mo460n(i5);
            int i6 = (int) ((this.f659a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0129kM522c.m518h(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        abstractC0129kM522c.show();
    }

    /* renamed from: b */
    public void m521b() {
        if (m523d()) {
            this.f668j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0129k m522c() {
        if (this.f668j == null) {
            this.f668j = m519a();
        }
        return this.f668j;
    }

    /* renamed from: d */
    public boolean m523d() {
        AbstractC0129k abstractC0129k = this.f668j;
        return abstractC0129k != null && abstractC0129k.mo450a();
    }

    /* renamed from: e */
    protected void mo524e() {
        this.f668j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f669k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m525f(View view) {
        this.f664f = view;
    }

    /* renamed from: g */
    public void m526g(boolean z3) {
        this.f666h = z3;
        AbstractC0129k abstractC0129k = this.f668j;
        if (abstractC0129k != null) {
            abstractC0129k.mo455i(z3);
        }
    }

    /* renamed from: h */
    public void m527h(int i4) {
        this.f665g = i4;
    }

    /* renamed from: i */
    public void m528i(PopupWindow.OnDismissListener onDismissListener) {
        this.f669k = onDismissListener;
    }

    /* renamed from: j */
    public void m529j(InterfaceC0131m.a aVar) {
        this.f667i = aVar;
        AbstractC0129k abstractC0129k = this.f668j;
        if (abstractC0129k != null) {
            abstractC0129k.setCallback(aVar);
        }
    }

    /* renamed from: k */
    public void m530k() {
        if (!m531m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m531m() {
        if (m523d()) {
            return true;
        }
        if (this.f664f == null) {
            return false;
        }
        m520l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m532n(int i4, int i5) {
        if (m523d()) {
            return true;
        }
        if (this.f664f == null) {
            return false;
        }
        m520l(i4, i5, true, true);
        return true;
    }

    public C0130l(Context context, C0125g c0125g, View view, boolean z3, int i4, int i5) {
        this.f665g = 8388611;
        this.f670l = new a();
        this.f659a = context;
        this.f660b = c0125g;
        this.f664f = view;
        this.f661c = z3;
        this.f662d = i4;
        this.f663e = i5;
    }
}
