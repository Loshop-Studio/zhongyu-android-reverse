package p271v0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: v0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10238a {
    /* renamed from: a */
    public static final View m19152a(ViewGroup viewGroup, int i10) {
        AbstractC9133u.m16133g(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        AbstractC9133u.m16132f(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        return viewInflate;
    }
}
