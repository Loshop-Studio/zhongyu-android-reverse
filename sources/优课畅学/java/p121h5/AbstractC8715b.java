package p121h5;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.TypeCastException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: h5.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8715b {

    /* renamed from: a */
    public static final a f16339a = new a(null);

    /* renamed from: h5.b$a */
    public static final class a {
        public a() {
        }

        /* renamed from: a */
        public final int m14218a(Context context) {
            AbstractC9133u.m16134h(context, "context");
            Object systemService = context.getSystemService("window");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }

        /* renamed from: b */
        public final int m14219b(Context context) {
            AbstractC9133u.m16134h(context, "context");
            Object systemService = context.getSystemService("window");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }

        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }
    }
}
