package p008a7;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.luck.picture.lib.thread.PictureThreadUtils;
import p204j6.C9685b;

/* renamed from: a7.p */
/* loaded from: classes5.dex */
public abstract class AbstractC0083p {

    /* renamed from: a */
    public static long f66a;

    /* renamed from: b */
    public static String f67b;

    /* renamed from: a7.p$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f68c;

        /* renamed from: d */
        public final /* synthetic */ String f69d;

        public a(Context context, String str) {
            this.f68c = context;
            this.f69d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextMo19171b = C9685b.m19172c().mo19171b();
            if (contextMo19171b == null) {
                contextMo19171b = this.f68c.getApplicationContext();
            }
            Toast.makeText(contextMo19171b, this.f69d, 0).show();
            String unused = AbstractC0083p.f67b = this.f69d;
        }
    }

    /* renamed from: b */
    public static boolean m234b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f66a < 1000) {
            return true;
        }
        f66a = jCurrentTimeMillis;
        return false;
    }

    /* renamed from: c */
    public static void m235c(Context context, String str) {
        if (m234b() && TextUtils.equals(str, f67b)) {
            return;
        }
        Context contextMo19171b = C9685b.m19172c().mo19171b();
        if (contextMo19171b == null) {
            contextMo19171b = context.getApplicationContext();
        }
        if (!PictureThreadUtils.m9589m()) {
            PictureThreadUtils.m9590n(new a(context, str));
        } else {
            Toast.makeText(contextMo19171b, str, 0).show();
            f67b = str;
        }
    }
}
