package p086e5;

import android.view.View;
import com.zykj.base.utils.XToastUtils;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: e5.o */
/* loaded from: classes5.dex */
public abstract class AbstractC8366o {
    /* renamed from: a */
    public static final void m13649a(View view, String str) {
        AbstractC9133u.m16133g(view, "<this>");
        if (str == null || str.length() == 0 || AbstractC9133u.m16128b("<p></p>", str)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public static final void m13650b(View view, String str) {
        AbstractC9133u.m16133g(view, "<this>");
        if (str == null || str.length() == 0 || AbstractC9133u.m16128b("<p></p>", str)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* renamed from: c */
    public static final void m13651c(XToastUtils xToastUtils, int i10) {
        AbstractC9133u.m16133g(xToastUtils, "<this>");
        AbstractC8364m.f15891a.m13645a(i10);
    }

    /* renamed from: d */
    public static final void m13652d(XToastUtils xToastUtils, String msg) {
        AbstractC9133u.m16133g(xToastUtils, "<this>");
        AbstractC9133u.m16133g(msg, "msg");
        AbstractC8364m.f15891a.m13646b(msg);
    }
}
