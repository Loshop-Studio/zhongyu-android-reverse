package p345t6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* renamed from: t6.b */
/* loaded from: classes5.dex */
public class C11247b {

    /* renamed from: a */
    public final ViewGroup.MarginLayoutParams f26991a;

    /* renamed from: b */
    public final View f26992b;

    public C11247b(View view) {
        this.f26992b = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f26991a = marginLayoutParams;
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = GravityCompat.START;
        }
    }

    /* renamed from: a */
    public void m25089a(float f10) {
        this.f26991a.height = Math.round(f10);
        this.f26992b.setLayoutParams(this.f26991a);
    }

    /* renamed from: b */
    public void m25090b(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f26991a;
        marginLayoutParams.leftMargin = i10;
        this.f26992b.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: c */
    public void m25091c(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f26991a;
        marginLayoutParams.topMargin = i10;
        this.f26992b.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: d */
    public void m25092d(float f10) {
        this.f26991a.width = Math.round(f10);
        this.f26992b.setLayoutParams(this.f26991a);
    }
}
