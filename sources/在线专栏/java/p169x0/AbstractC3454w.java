package p169x0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p173y0.C3494i;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: x0.w */
/* loaded from: classes.dex */
public abstract class AbstractC3454w {
    protected AbstractC3454w() {
    }

    /* renamed from: e */
    public static AbstractC3454w m10525e(Context context) {
        return C3494i.m10599n(context);
    }

    /* renamed from: g */
    public static void m10526g(Context context, C3433b c3433b) {
        C3494i.m10597g(context, c3433b);
    }

    /* renamed from: a */
    public abstract InterfaceC3448q mo10527a();

    /* renamed from: b */
    public abstract InterfaceC3448q mo10528b(UUID uuid);

    /* renamed from: c */
    public abstract InterfaceC3448q mo10529c(List<? extends AbstractC3456y> list);

    /* renamed from: d */
    public final InterfaceC3448q m10530d(AbstractC3456y abstractC3456y) {
        return mo10529c(Collections.singletonList(abstractC3456y));
    }

    /* renamed from: f */
    public abstract LiveData<C3453v> mo10531f(UUID uuid);
}
