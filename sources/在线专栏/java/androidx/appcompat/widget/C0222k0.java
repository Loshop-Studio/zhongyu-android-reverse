package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p071ut.device.AidConstants;
import p015c.C1041d;
import p015c.C1043f;
import p015c.C1044g;
import p015c.C1046i;

/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: classes.dex */
class C0222k0 {

    /* renamed from: a */
    private final Context f1143a;

    /* renamed from: b */
    private final View f1144b;

    /* renamed from: c */
    private final TextView f1145c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1146d;

    /* renamed from: e */
    private final Rect f1147e;

    /* renamed from: f */
    private final int[] f1148f;

    /* renamed from: g */
    private final int[] f1149g;

    C0222k0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1146d = layoutParams;
        this.f1147e = new Rect();
        this.f1148f = new int[2];
        this.f1149g = new int[2];
        this.f1143a = context;
        View viewInflate = LayoutInflater.from(context).inflate(C1044g.f5900u, (ViewGroup) null);
        this.f1144b = viewInflate;
        this.f1145c = (TextView) viewInflate.findViewById(C1043f.f5878y);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AidConstants.EVENT_REQUEST_FAILED;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1046i.f5917a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m907a(View view, int i4, int i5, boolean z3, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1143a.getResources().getDimensionPixelOffset(C1041d.f5784m);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1143a.getResources().getDimensionPixelOffset(C1041d.f5783l);
            height = i5 + dimensionPixelOffset2;
            i6 = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1143a.getResources().getDimensionPixelOffset(z3 ? C1041d.f5786o : C1041d.f5785n);
        View viewM908b = m908b(view);
        if (viewM908b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewM908b.getWindowVisibleDisplayFrame(this.f1147e);
        Rect rect = this.f1147e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1143a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1147e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM908b.getLocationOnScreen(this.f1149g);
        view.getLocationOnScreen(this.f1148f);
        int[] iArr = this.f1148f;
        int i7 = iArr[0];
        int[] iArr2 = this.f1149g;
        iArr[0] = i7 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i4) - (viewM908b.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1144b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1144b.getMeasuredHeight();
        int[] iArr3 = this.f1148f;
        int i8 = ((iArr3[1] + i6) - dimensionPixelOffset3) - measuredHeight;
        int i9 = iArr3[1] + height + dimensionPixelOffset3;
        if (z3) {
            if (i8 >= 0) {
                layoutParams.y = i8;
                return;
            } else {
                layoutParams.y = i9;
                return;
            }
        }
        if (measuredHeight + i9 <= this.f1147e.height()) {
            layoutParams.y = i9;
        } else {
            layoutParams.y = i8;
        }
    }

    /* renamed from: b */
    private static View m908b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: c */
    void m909c() {
        if (m910d()) {
            ((WindowManager) this.f1143a.getSystemService("window")).removeView(this.f1144b);
        }
    }

    /* renamed from: d */
    boolean m910d() {
        return this.f1144b.getParent() != null;
    }

    /* renamed from: e */
    void m911e(View view, int i4, int i5, boolean z3, CharSequence charSequence) throws Resources.NotFoundException {
        if (m910d()) {
            m909c();
        }
        this.f1145c.setText(charSequence);
        m907a(view, i4, i5, z3, this.f1146d);
        ((WindowManager) this.f1143a.getSystemService("window")).addView(this.f1144b, this.f1146d);
    }
}
