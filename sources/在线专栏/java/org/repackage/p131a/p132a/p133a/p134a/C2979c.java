package org.repackage.p131a.p132a.p133a.p134a;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.repackage.p131a.p132a.p133a.InterfaceC2976a;

/* renamed from: org.repackage.a.a.a.a.c */
/* loaded from: classes.dex */
public class C2979c {

    /* renamed from: a */
    public InterfaceC2976a f11471a = null;

    /* renamed from: b */
    public String f11472b = null;

    /* renamed from: c */
    public String f11473c = null;

    /* renamed from: d */
    public final Object f11474d = new Object();

    /* renamed from: e */
    public ServiceConnection f11475e = new ServiceConnectionC2978b(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.repackage.a.a.a.a.c$a */
    public static class a {

        /* renamed from: a */
        public static final C2979c f11476a = new C2979c(null);
    }

    public /* synthetic */ C2979c(ServiceConnectionC2978b serviceConnectionC2978b) {
    }

    /* renamed from: a */
    public boolean m10046a(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo != null && packageInfo.getLongVersionCode() >= 1 : packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final String m10047b(Context context, String str) throws NoSuchAlgorithmException {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f11472b)) {
            this.f11472b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f11473c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f11472b, 64).signatures;
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
                            sb.append(Integer.toHexString((b4 & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e5) {
                    e5.printStackTrace();
                }
            }
            this.f11473c = string;
        }
        String strM10044a = ((InterfaceC2976a.a.C3538a) this.f11471a).m10044a(this.f11472b, this.f11473c, str);
        return TextUtils.isEmpty(strM10044a) ? "" : strM10044a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String m10045a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L6f
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6f
            if (r0 == r1) goto L67
            org.repackage.a.a.a.a r0 = r4.f11471a     // Catch: java.lang.Throwable -> L6f
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
            android.content.ServiceConnection r1 = r4.f11475e     // Catch: java.lang.Throwable -> L6f
            r2 = 1
            boolean r0 = r5.bindService(r0, r1, r2)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L43
            java.lang.Object r0 = r4.f11474d     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r4.f11474d     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3b
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
            org.repackage.a.a.a.a r0 = r4.f11471a     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L4b
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L4b:
            java.lang.String r5 = r4.m10047b(r5, r6)     // Catch: android.os.RemoteException -> L51 java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r5
        L51:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L59:
            java.lang.String r5 = r4.m10047b(r5, r6)     // Catch: android.os.RemoteException -> L5f java.lang.Throwable -> L6f
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
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.p131a.p132a.p133a.p134a.C2979c.m10045a(android.content.Context, java.lang.String):java.lang.String");
    }
}
