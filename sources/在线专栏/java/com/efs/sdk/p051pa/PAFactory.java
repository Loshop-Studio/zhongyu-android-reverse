package com.efs.sdk.p051pa;

import android.content.Context;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.p051pa.config.ConfigManager;
import com.efs.sdk.p051pa.config.IEfsReporter;
import com.efs.sdk.p051pa.config.PackageLevel;
import com.efs.sdk.p051pa.p052a.C1353c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    static final ThreadLocal<InterfaceC1348PA> sThreadLocal = new ThreadLocal<>();
    private ConfigManager mConfigManager;
    private Context mContext;
    private HashMap<String, String> mExtend;
    private EfsReporter mReporter;
    private IEfsReporter mReporterFactory;
    private String mSerial;
    private String mSver;
    private long mTimeOutTime;
    private PATraceListener mTraceListener;

    public static class Builder {

        /* renamed from: a */
        private PackageLevel f7151a;

        /* renamed from: b */
        private IEfsReporter f7152b;

        /* renamed from: c */
        private boolean f7153c;

        /* renamed from: d */
        private Context f7154d;

        /* renamed from: e */
        private String f7155e;

        /* renamed from: f */
        private HashMap<String, String> f7156f;

        /* renamed from: g */
        private String f7157g;

        /* renamed from: h */
        private long f7158h = 2000;

        /* renamed from: i */
        private PATraceListener f7159i;

        public Builder(Context context, IEfsReporter iEfsReporter) {
            if (context == null) {
                throw new RuntimeException("context Should Not null");
            }
            if (iEfsReporter == null) {
                throw new RuntimeException("reporter Should Not Empty");
            }
            this.f7152b = iEfsReporter;
            this.f7154d = context;
        }

        public PAFactory build() {
            if (this.f7151a != null) {
                return new PAFactory(this.f7154d, this.f7151a, this.f7152b, this.f7153c, this.f7155e, this.f7156f, this.f7157g, this.f7158h, this.f7159i);
            }
            throw new RuntimeException(String.format("%s Should Not Null", ""));
        }

        public Builder extendLogInfo(HashMap<String, String> map) {
            this.f7156f = map;
            return this;
        }

        public Builder isNewInstall(boolean z3) {
            this.f7153c = z3;
            return this;
        }

        public Builder packageLevel(PackageLevel packageLevel) {
            this.f7151a = packageLevel;
            return this;
        }

        public Builder serial(String str) {
            this.f7155e = str;
            return this;
        }

        public Builder sver(String str) {
            this.f7157g = str;
            return this;
        }

        public Builder timeoutTime(long j4) {
            if (j4 <= 0) {
                Log.w(PAFactory.TAG, "Timeout time is invalid, and the default value 2s will be used");
                this.f7158h = 2000L;
            } else {
                if (j4 > PAFactory.MAX_TIME_OUT_TIME) {
                    Log.w(PAFactory.TAG, "Timeout time over 4s is not recommended, and the default value 2s will be used");
                    this.f7158h = 2000L;
                    return this;
                }
                this.f7158h = j4;
            }
            return this;
        }

        public Builder traceListener(PATraceListener pATraceListener) {
            this.f7159i = pATraceListener;
            return this;
        }
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    public HashMap<String, String> getExtend() {
        return this.mExtend;
    }

    public synchronized InterfaceC1348PA getPaInstance() {
        InterfaceC1348PA c1353c;
        ThreadLocal<InterfaceC1348PA> threadLocal = sThreadLocal;
        c1353c = threadLocal.get();
        if (c1353c == null) {
            c1353c = new C1353c(this.mConfigManager.enableTracer());
            c1353c.registerPAANRListener(this.mContext, new C1350a(this), this.mTimeOutTime);
            threadLocal.set(c1353c);
        }
        return c1353c;
    }

    public EfsReporter getReporter() {
        if (this.mReporter == null) {
            IEfsReporter iEfsReporter = this.mReporterFactory;
            this.mReporter = iEfsReporter != null ? iEfsReporter.getReporter() : null;
        }
        return this.mReporter;
    }

    public String getSerial() {
        return this.mSerial;
    }

    public String getSver() {
        return this.mSver;
    }

    public PATraceListener getTraceListener() {
        return this.mTraceListener;
    }

    private PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z3, String str, HashMap<String, String> map, String str2, long j4, PATraceListener pATraceListener) {
        this.mReporterFactory = iEfsReporter;
        this.mSerial = str;
        this.mExtend = map;
        this.mSver = str2;
        this.mContext = context;
        this.mTraceListener = pATraceListener;
        this.mTimeOutTime = j4;
        this.mConfigManager = new ConfigManager(context, packageLevel, iEfsReporter, z3);
    }
}
