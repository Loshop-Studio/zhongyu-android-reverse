package p086e5;

import android.widget.Toast;
import com.zykj.utils.AppUtils;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: e5.m */
/* loaded from: classes5.dex */
public abstract class AbstractC8364m {

    /* renamed from: a */
    public static final a f15891a = new a(null);

    /* renamed from: b */
    public static Toast f15892b;

    /* renamed from: e5.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final void m13645a(int i10) {
            if (AbstractC8364m.f15892b == null) {
                AbstractC8364m.f15892b = Toast.makeText(AppUtils.INSTANCE.mo12323a(), i10, 1);
            }
            Toast toast = AbstractC8364m.f15892b;
            if (toast != null) {
                toast.setText(i10);
            }
            Toast toast2 = AbstractC8364m.f15892b;
            if (toast2 != null) {
                toast2.setDuration(0);
            }
            Toast toast3 = AbstractC8364m.f15892b;
            if (toast3 != null) {
                toast3.show();
            }
        }

        /* renamed from: b */
        public final void m13646b(String text) {
            AbstractC9133u.m16133g(text, "text");
            if (AbstractC8364m.f15892b == null) {
                AbstractC8364m.f15892b = Toast.makeText(AppUtils.INSTANCE.mo12323a(), text, 1);
            }
            Toast toast = AbstractC8364m.f15892b;
            if (toast != null) {
                toast.setText(text);
            }
            Toast toast2 = AbstractC8364m.f15892b;
            if (toast2 != null) {
                toast2.setDuration(0);
            }
            Toast toast3 = AbstractC8364m.f15892b;
            if (toast3 != null) {
                toast3.show();
            }
        }

        public a() {
        }
    }
}
