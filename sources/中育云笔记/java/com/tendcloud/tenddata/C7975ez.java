package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Constructor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tendcloud.tenddata.ez */
/* loaded from: classes5.dex */
public class C7975ez {

    /* renamed from: b */
    private static final String f14895b = "android.app.ZteDeviceIdentifyManager";

    /* renamed from: c */
    private static String f14896c = "com.mdid.msa";

    /* renamed from: d */
    private static volatile C7975ez f14897d = new C7975ez();

    /* renamed from: a */
    private final LinkedBlockingQueue<IBinder> f14898a = new LinkedBlockingQueue<>(1);

    /* renamed from: e */
    private ServiceConnection f14899e = new ServiceConnection() { // from class: com.tendcloud.tenddata.ez.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ez.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C7975ez.this.f14898a.size() > 0) {
                            C7975ez.this.f14898a.clear();
                        }
                        C7975ez.this.f14898a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: com.tendcloud.tenddata.ez$a */
    public static class a implements IInterface {
        private IBinder mIBinder;

        public a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getOAID() {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.mIBinder.transact(3, parcelObtain, parcelObtain2, 0);
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

    private C7975ez() {
    }

    /* renamed from: b */
    private static void m11929b(Context context) {
        try {
            Class<?> cls = Class.forName(f14895b);
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Context.class);
            if (declaredConstructor != null) {
                C7994fr.m11998a().setOAID((String) cls.getDeclaredMethod("getOAID", Context.class).invoke(declaredConstructor.newInstance(context), context));
            }
        } catch (Throwable unused) {
        }
    }

    public static void bindZTEServiceGetOAID(Context context) {
        if (Build.VERSION.SDK_INT <= 29) {
            f14897d.m11930c(context);
        } else {
            m11929b(context);
        }
    }

    /* renamed from: c */
    private void m11930c(Context context) {
        try {
            String packageName = context.getPackageName();
            m11927a(packageName, context);
            Intent intent = new Intent();
            intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
            intent.setAction("com.bun.msa.action.bindto.service");
            intent.putExtra("com.bun.msa.param.pkgname", packageName);
            if (context.bindService(intent, this.f14899e, 1)) {
                try {
                    C7994fr.m11998a().setOAID(new a(this.f14898a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f14899e);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public static boolean m11928a(Context context) {
        try {
            if (!C7963en.m11891h()) {
                return false;
            }
            if (Build.VERSION.SDK_INT > 29) {
                return true;
            }
            context.getPackageManager().getPackageInfo(f14896c, 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m11927a(String str, Context context) {
        Intent intent = new Intent();
        intent.setClassName(f14896c, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }
}
