package p314r1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: r1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10834a {
    /* renamed from: a */
    public static final View m23320a(ViewGroup viewGroup, int i10) {
        AbstractC9979u.m20294g(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        AbstractC9979u.m20293f(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        return viewInflate;
    }
}
