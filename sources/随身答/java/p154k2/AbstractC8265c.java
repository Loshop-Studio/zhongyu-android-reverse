package p154k2;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.AbstractC6783b;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import p186n2.AbstractC9089c;
import p196o2.C9160b;

/* renamed from: k2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC8265c {

    /* renamed from: a */
    public static boolean f14375a = false;

    /* renamed from: k2.c$a */
    public static class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f14376a;

        public a(Context context) {
            this.f14376a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strM6282c = AbstractC6783b.m6282c(this.f14376a);
                String packageName = this.f14376a.getPackageName();
                if (TextUtils.isEmpty(strM6282c) || TextUtils.isEmpty(packageName) || !strM6282c.equals(packageName) || !AbstractC6782a.m6276j(this.f14376a, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                    return;
                }
                Context context = this.f14376a;
                AbstractC9089c.m14596m(context, 32777, C9160b.m14737a(context).m14738b(), null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13335a(Context context) {
        try {
            String strM6282c = AbstractC6783b.m6282c(context);
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(strM6282c) || TextUtils.isEmpty(packageName) || !strM6282c.equals(packageName)) {
                return;
            }
            AbstractC9089c.m14596m(context, 32801, C9160b.m14737a(context).m14738b(), null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static synchronized void m13336b(Context context) {
        if (context != null) {
            try {
                if (!f14375a) {
                    new Thread(new a(context)).start();
                    f14375a = true;
                }
            } finally {
            }
        }
    }
}
