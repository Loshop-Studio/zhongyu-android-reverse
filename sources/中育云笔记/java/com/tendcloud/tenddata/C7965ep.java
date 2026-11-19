package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tendcloud.tenddata.ep */
/* loaded from: classes5.dex */
public final class C7965ep {

    /* renamed from: c */
    private static volatile C7965ep f14878c = new C7965ep();

    /* renamed from: b */
    private final LinkedBlockingQueue<IBinder> f14880b = new LinkedBlockingQueue<>(1);

    /* renamed from: a */
    ServiceConnection f14879a = new ServiceConnection() { // from class: com.tendcloud.tenddata.ep.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ep.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C7965ep.this.f14880b.size() > 0) {
                            C7965ep.this.f14880b.clear();
                        }
                        C7965ep.this.f14880b.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: com.tendcloud.tenddata.ep$a */
    public static final class a implements IInterface {
        private IBinder iBinder;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.iBinder;
        }

        public String getOAID() {
            Parcel parcelObtain;
            Parcel parcelObtain2;
            String string = null;
            try {
                parcelObtain = Parcel.obtain();
                parcelObtain2 = Parcel.obtain();
            } catch (Throwable unused) {
            }
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused2) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
                return string;
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }

        private a(IBinder iBinder) {
            this.iBinder = iBinder;
        }
    }

    private C7965ep() {
    }

    /* renamed from: b */
    public static String m11903b(Context context) {
        return m11901a(context, "com.huawei.hwid") ? "com.huawei.hwid" : m11901a(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE) ? PackageConstants.SERVICES_PACKAGE_ALL_SCENE : m11901a(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    public static void bindHWServiceGetOAID(Context context) {
        f14878c.m11904c(context);
    }

    /* renamed from: c */
    private void m11904c(Context context) {
        try {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(m11903b(context));
            if (context.bindService(intent, this.f14879a, 1)) {
                try {
                    C7994fr.m11998a().setOAID(new a(this.f14880b.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f14879a);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public static boolean m11900a(Context context) {
        try {
            if (C7963en.m11885b() || C7963en.m11886c()) {
                return !TextUtils.isEmpty(m11903b(context));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static PackageInfo m11902b(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, 128);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m11901a(Context context, String str) {
        return m11902b(context, str) != null;
    }
}
