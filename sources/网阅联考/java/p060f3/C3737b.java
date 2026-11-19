package p060f3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import p055e3.InterfaceC3728a;

/* renamed from: f3.b */
/* loaded from: classes2.dex */
public class C3737b {

    /* renamed from: a */
    public InterfaceC3728a f4362a = null;

    /* renamed from: b */
    public String f4363b = null;

    /* renamed from: c */
    public String f4364c = null;

    /* renamed from: d */
    public final Object f4365d = new Object();

    /* renamed from: e */
    public ServiceConnection f4366e = new a();

    /* renamed from: f3.b$a */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C3737b.this.f4362a = InterfaceC3728a.a.m4724f(iBinder);
            synchronized (C3737b.this.f4365d) {
                C3737b.this.f4365d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C3737b.this.f4362a = null;
        }
    }

    /* renamed from: f3.b$b */
    public static class b {

        /* renamed from: a */
        public static final C3737b f4368a = new C3737b(null);
    }

    public /* synthetic */ C3737b(a aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String m4733a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L6f
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6f
            if (r0 == r1) goto L67
            e3.a r0 = r4.f4362a     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L59
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L6f
            r0.setComponent(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L6f
            android.content.ServiceConnection r1 = r4.f4366e     // Catch: java.lang.Throwable -> L6f
            r2 = 1
            boolean r0 = r5.bindService(r0, r1, r2)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L43
            java.lang.Object r0 = r4.f4365d     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r4.f4365d     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3b
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.wait(r2)     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3b
            goto L3f
        L39:
            r5 = move-exception
            goto L41
        L3b:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L39
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r5     // Catch: java.lang.Throwable -> L6f
        L43:
            e3.a r0 = r4.f4362a     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L4b
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L4b:
            java.lang.String r5 = r4.m4735c(r5, r6)     // Catch: android.os.RemoteException -> L51 java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r5
        L51:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L59:
            java.lang.String r5 = r4.m4735c(r5, r6)     // Catch: android.os.RemoteException -> L5f java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r5
        L5f:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L67:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = "Cannot run on MainThread"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            throw r5     // Catch: java.lang.Throwable -> L6f
        L6f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p060f3.C3737b.m4733a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public boolean m4734b(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo != null && packageInfo.getLongVersionCode() >= 1 : packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public final String m4735c(Context context, String str) throws NoSuchAlgorithmException {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f4363b)) {
            this.f4363b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f4364c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f4363b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e4) {
                e4.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b4 : bArrDigest) {
                            sb.append(Integer.toHexString((b4 & UByte.MAX_VALUE) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e5) {
                    e5.printStackTrace();
                }
            }
            this.f4364c = string;
        }
        String strM4725f = ((InterfaceC3728a.a.C4758a) this.f4362a).m4725f(this.f4363b, this.f4364c, str);
        return TextUtils.isEmpty(strM4725f) ? "" : strM4725f;
    }
}
