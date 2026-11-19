package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tendcloud.tenddata.eu */
/* loaded from: classes5.dex */
public class C7970eu {

    /* renamed from: b */
    private static String f14884b;

    /* renamed from: c */
    private static volatile C7970eu f14885c = new C7970eu();

    /* renamed from: a */
    private final LinkedBlockingQueue<IBinder> f14886a = new LinkedBlockingQueue<>(1);

    /* renamed from: d */
    private ServiceConnection f14887d = new ServiceConnection() { // from class: com.tendcloud.tenddata.eu.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.eu.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C7970eu.this.f14886a.size() > 0) {
                            C7970eu.this.f14886a.clear();
                        }
                        C7970eu.this.f14886a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: com.tendcloud.tenddata.eu$a */
    public static class a implements IInterface {
        private IBinder mIBinder;

        public a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getSerID(String str, String str2, String str3) {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mIBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused) {
                }
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable unused2) {
            }
            return string;
        }
    }

    private C7970eu() {
    }

    /* renamed from: b */
    private void m11914b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (context.bindService(intent, this.f14887d, 1)) {
                a aVar = new a(this.f14886a.take());
                try {
                    C7994fr.m11998a().setOAID(m11911a("OUID", context, aVar));
                } catch (Throwable unused) {
                }
                try {
                    C7994fr.m11998a().setVAID(m11911a("DUID", context, aVar));
                } catch (Throwable unused2) {
                }
                try {
                    C7994fr.m11998a().setAAID(m11911a("AUID", context, aVar));
                } catch (Throwable unused3) {
                }
                context.unbindService(this.f14887d);
            }
        } catch (Throwable unused4) {
        }
    }

    public static void bindONEPLUSServiceGetOAID(Context context) {
        f14885c.m11914b(context);
    }

    /* renamed from: a */
    public static boolean m11913a(Context context) {
        PackageInfo packageInfo;
        try {
            if (C7963en.m11888e() && (packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0)) != null) {
                return packageInfo.versionCode >= 1;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static String m11911a(String str, Context context, a aVar) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (f14884b == null) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Throwable unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : bArrDigest) {
                            sb2.append(Integer.toHexString((b10 & C7863av.f14384i) | 256).substring(1, 3));
                        }
                        string = sb2.toString();
                    }
                } catch (Throwable unused2) {
                }
            }
            f14884b = string;
        }
        return aVar.getSerID(packageName, f14884b, str);
    }
}
