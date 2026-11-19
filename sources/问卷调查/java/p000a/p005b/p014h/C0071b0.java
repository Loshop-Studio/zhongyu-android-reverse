package p000a.p005b.p014h;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import p000a.p005b.p009e.p010a.C0037c;
import p000a.p031h.p035d.p036l.InterfaceC0213a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.h.b0 */
/* loaded from: classes.dex */
public class C0071b0 {

    /* renamed from: a */
    public static final int[] f554a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f555b = new int[0];

    static {
        new Rect();
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m282a(Drawable drawable) {
        Drawable drawable2;
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0213a) {
                drawable2 = ((InterfaceC0213a) drawable).m786a();
            } else {
                if (drawable instanceof C0037c) {
                    return m282a(((C0037c) drawable).f278b);
                }
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m282a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m282a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m283b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
