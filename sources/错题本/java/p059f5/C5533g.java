package p059f5;

import android.view.View;
import com.zykj.mistake.widget.WrapLinearLayout;
import java.util.ArrayList;

/* renamed from: f5.g */
/* loaded from: classes3.dex */
public final class C5533g {

    /* renamed from: b */
    public int f8572b;

    /* renamed from: d */
    public final /* synthetic */ WrapLinearLayout f8574d;

    /* renamed from: a */
    public final ArrayList f8571a = new ArrayList();

    /* renamed from: c */
    public int f8573c = 0;

    public C5533g(WrapLinearLayout wrapLinearLayout) {
        this.f8574d = wrapLinearLayout;
        this.f8572b = wrapLinearLayout.getPaddingRight() + wrapLinearLayout.getPaddingLeft();
    }

    /* renamed from: a */
    public static void m4893a(C5533g c5533g, View view) {
        ArrayList arrayList = c5533g.f8571a;
        if (arrayList.size() != 0) {
            c5533g.f8572b = (int) (c5533g.f8572b + c5533g.f8574d.f8104a.f8568b);
        }
        c5533g.f8573c = c5533g.f8573c > view.getMeasuredHeight() ? c5533g.f8573c : view.getMeasuredHeight();
        c5533g.f8572b = view.getMeasuredWidth() + c5533g.f8572b;
        arrayList.add(view);
    }
}
