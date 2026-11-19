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

/* loaded from: classes5.dex */
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
        private static KernelService f12888a;

        /* renamed from: b */
        private Context f12889b;

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            f12888a = this;
            this.f12889b = getApplicationContext();
        }

        @Override // android.app.Service
        public void onDestroy() {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                ALog.m10117e(ChannelService.TAG, "onDestroy", th, new Object[0]);
            }
            f12888a = null;
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i10, int i11) {
            try {
                ThreadPoolExecutorFactory.execute(new RunnableC7604b(this));
            } catch (Throwable th) {
                ALog.m10117e(ChannelService.TAG, " onStartCommand", th, new Object[0]);
            }
            return super.onStartCommand(intent, i10, i11);
        }
    }

    public static ChannelService getInstance() {
        return mInstance;
    }

    public static int getSupportForegroundVer(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(SUPPORT_FOREGROUND_VERSION_KEY, 24);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "getSupportForegroundVer fail:", th, "key", SUPPORT_FOREGROUND_VERSION_KEY);
            return 24;
        }
    }

    public static void startKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, (Class<?>) KernelService.class);
                intent.setPackage(context.getPackageName());
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.m10117e(TAG, "startKernel", th, new Object[0]);
        }
    }

    public static void stopKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, (Class<?>) KernelService.class);
                intent.setPackage(context.getPackageName());
                context.stopService(intent);
            }
        } catch (Throwable th) {
            ALog.m10117e(TAG, "stopKernel", th, new Object[0]);
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
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.mFirstStarted) {
            this.mFirstStarted = false;
            startKernel(getApplicationContext());
        }
        return super.onStartCommand(intent, i10, i11);
    }
}
