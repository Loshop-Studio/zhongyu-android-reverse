package p000a.p005b.p014h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.C1088R;

/* renamed from: a.b.h.y0 */
/* loaded from: classes.dex */
public class C0118y0 {

    /* renamed from: a */
    public final Context f870a;

    /* renamed from: b */
    public final View f871b;

    /* renamed from: c */
    public final TextView f872c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f873d;

    /* renamed from: e */
    public final Rect f874e;

    /* renamed from: f */
    public final int[] f875f;

    /* renamed from: g */
    public final int[] f876g;

    public C0118y0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f873d = layoutParams;
        this.f874e = new Rect();
        this.f875f = new int[2];
        this.f876g = new int[2];
        this.f870a = context;
        View viewInflate = LayoutInflater.from(context).inflate(C1088R.layout.abc_tooltip, (ViewGroup) null);
        this.f871b = viewInflate;
        this.f872c = (TextView) viewInflate.findViewById(C1088R.id.message);
        layoutParams.setTitle(C0118y0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1088R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    public void m450a() {
        if (this.f871b.getParent() != null) {
            ((WindowManager) this.f870a.getSystemService("window")).removeView(this.f871b);
        }
    }
}
