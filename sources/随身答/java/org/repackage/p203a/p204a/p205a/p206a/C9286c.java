package org.repackage.p203a.p204a.p205a.p206a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import org.repackage.p203a.p204a.p205a.InterfaceC9283a;

/* renamed from: org.repackage.a.a.a.a.c */
/* loaded from: classes5.dex */
public class C9286c {

    /* renamed from: a */
    public InterfaceC9283a f16012a = null;

    /* renamed from: b */
    public String f16013b = null;

    /* renamed from: c */
    public String f16014c = null;

    /* renamed from: d */
    public final Object f16015d = new Object();

    /* renamed from: e */
    public ServiceConnection f16016e = new ServiceConnectionC9285b(this);

    /* renamed from: org.repackage.a.a.a.a.c$a */
    public static class a {

        /* renamed from: a */
        public static final C9286c f16017a = new C9286c(null);
    }

    public /* synthetic */ C9286c(ServiceConnectionC9285b serviceConnectionC9285b) {
    }

    /* renamed from: a */
    public boolean m15093a(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo != null && packageInfo.getLongVersionCode() >= 1 : packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final String m15094b(Context context, String str) throws NoSuchAlgorithmException {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f16013b)) {
            this.f16013b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f16014c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f16013b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b10 : bArrDigest) {
                            sb.append(Integer.toHexString((b10 & UByte.MAX_VALUE) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e11) {
                    e11.printStackTrace();
                }
            }
            this.f16014c = string;
        }
        String strM15091a = ((InterfaceC9283a.a.C10085a) this.f16012a).m15091a(this.f16013b, this.f16014c, str);
        return TextUtils.isEmpty(strM15091a) ? "" : strM15091a;
    }

    /* renamed from: a */
    public synchronized String m15092a(Context context, String str) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f16012a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f16016e, 1)) {
                    synchronized (this.f16015d) {
                        try {
                            this.f16015d.wait(3000L);
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (this.f16012a == null) {
                    return "";
                }
                try {
                    return m15094b(context, str);
                } catch (RemoteException e11) {
                    e11.printStackTrace();
                    return "";
                }
            }
            try {
                return m15094b(context, str);
            } catch (RemoteException e12) {
                e12.printStackTrace();
                return "";
            }
            throw th;
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }
}
