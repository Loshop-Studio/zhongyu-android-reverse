package com.taobao.accs;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.taobao.accs.base.BaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* loaded from: classes.dex */
public class ChannelService extends BaseService {
    public static final int DEFAULT_FOREGROUND_V = 24;
    static final int NOTIFY_ID = 9371;
    public static int SDK_VERSION_CODE = 222;
    public static final String SUPPORT_FOREGROUND_VERSION_KEY = "support_foreground_v";
    static final String TAG = "ChannelService";
    private static ChannelService mInstance;
    private boolean mFirstStarted = true;

    public static class KernelService extends Service {

        /* renamed from: a */
        private static KernelService f7490a;

        /* renamed from: b */
        private Context f7491b;

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            f7490a = this;
            this.f7491b = getApplicationContext();
        }

        @Override // android.app.Service
        public void onDestroy() {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                ALog.m6091e(ChannelService.TAG, "onDestroy", th, new Object[0]);
            }
            f7490a = null;
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i4, int i5) {
            try {
                ThreadPoolExecutorFactory.execute(new RunnableC1707b(this));
            } catch (Throwable th) {
                ALog.m6091e(ChannelService.TAG, " onStartCommand", th, new Object[0]);
            }
            return super.onStartCommand(intent, i4, i5);
        }
    }

    public static ChannelService getInstance() {
        return mInstance;
    }

    static int getSupportForegroundVer(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(SUPPORT_FOREGROUND_VERSION_KEY, 24);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "getSupportForegroundVer fail:", th, "key", SUPPORT_FOREGROUND_VERSION_KEY);
            return 24;
        }
    }

    static void startKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, (Class<?>) KernelService.class);
                intent.setPackage(context.getPackageName());
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.m6091e(TAG, "startKernel", th, new Object[0]);
        }
    }

    static void stopKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, (Class<?>) KernelService.class);
                intent.setPackage(context.getPackageName());
                context.stopService(intent);
            }
        } catch (Throwable th) {
            ALog.m6091e(TAG, "stopKernel", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public void onDestroy() {
        stopKernel(getApplicationContext());
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        if (this.mFirstStarted) {
            this.mFirstStarted = false;
            startKernel(getApplicationContext());
        }
        return super.onStartCommand(intent, i4, i5);
    }
}
