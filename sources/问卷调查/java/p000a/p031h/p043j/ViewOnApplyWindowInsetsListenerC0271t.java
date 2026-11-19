package p000a.p031h.p043j;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;

/* renamed from: a.h.j.t */
/* loaded from: classes.dex */
public class ViewOnApplyWindowInsetsListenerC0271t implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C0277z f1628a = null;

    /* renamed from: b */
    public final /* synthetic */ View f1629b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0262k f1630c;

    public ViewOnApplyWindowInsetsListenerC0271t(View view, InterfaceC0262k interfaceC0262k) {
        this.f1629b = view;
        this.f1630c = interfaceC0262k;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0277z c0277zM895j = C0277z.m895j(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            View view2 = this.f1629b;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view2.getTag(C1088R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsets);
            }
            if (c0277zM895j.equals(this.f1628a)) {
                return this.f1630c.mo96a(view, c0277zM895j).m902h();
            }
        }
        this.f1628a = c0277zM895j;
        C0277z c0277zMo96a = this.f1630c.mo96a(view, c0277zM895j);
        if (i >= 30) {
            return c0277zMo96a.m902h();
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        view.requestApplyInsets();
        return c0277zMo96a.m902h();
    }
}
