package p141f2;

import android.view.View;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: f2.c */
/* loaded from: classes3.dex */
public final class C9166c {

    /* renamed from: a */
    public static final C9166c f21406a = new C9166c();

    /* renamed from: c */
    public static final void m18058c(View view, View view2) {
        if (view.hasFocus()) {
            KeyboardUtils.showSoftInput(view);
        }
    }

    /* renamed from: b */
    public final void m18059b(View... view) {
        AbstractC9979u.m20294g(view, "view");
        int length = view.length;
        for (int i10 = 0; i10 < length; i10++) {
            final View view2 = view[i10];
            if (i10 == 0) {
                view2.setFocusable(true);
            }
            view2.setOnClickListener(new View.OnClickListener() { // from class: f2.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C9166c.m18058c(view2, view3);
                }
            });
        }
    }

    /* renamed from: d */
    public final boolean m18060d() {
        return false;
    }

    /* renamed from: e */
    public final boolean m18061e() {
        return NetworkUtils.isWifiConnected();
    }

    /* renamed from: f */
    public final void m18062f(TextInputEditText et, String error) {
        AbstractC9979u.m20294g(et, "et");
        AbstractC9979u.m20294g(error, "error");
        et.setError(error);
        et.requestFocus();
    }
}
