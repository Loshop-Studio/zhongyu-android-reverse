package com.efs.sdk.p055pa;

import android.content.Context;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.p055pa.config.ConfigManager;
import com.efs.sdk.p055pa.config.IEfsReporter;
import com.efs.sdk.p055pa.config.PackageLevel;
import com.efs.sdk.p055pa.p056a.C5721c;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    static final ThreadLocal<InterfaceC5716PA> sThreadLocal = new ThreadLocal<>();
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
        private PackageLevel f4785a;

        /* renamed from: b */
        private IEfsReporter f4786b;

        /* renamed from: c */
        private boolean f4787c;

        /* renamed from: d */
        private Context f4788d;

        /* renamed from: e */
        private String f4789e;

        /* renamed from: f */
        private HashMap<String, String> f4790f;

        /* renamed from: g */
        private String f4791g;

        /* renamed from: h */
        private long f4792h = PAFactory.DEFAULT_TIME_OUT_TIME;

        /* renamed from: i */
        private PATraceListener f4793i;

        public Builder(Context context, IEfsReporter iEfsReporter) {
            if (context == null) {
                throw new RuntimeException("context Should Not null");
            }
            if (iEfsReporter == null) {
                throw new RuntimeException("reporter Should Not Empty");
            }
            this.f4786b = iEfsReporter;
            this.f4788d = context;
        }

        public PAFactory build() {
            if (this.f4785a != null) {
                return new PAFactory(this.f4788d, this.f4785a, this.f4786b, this.f4787c, this.f4789e, this.f4790f, this.f4791g, this.f4792h, this.f4793i);
            }
            throw new RuntimeException(String.format("%s Should Not Null", ""));
        }

        public Builder extendLogInfo(HashMap<String, String> map) {
            this.f4790f = map;
            return this;
        }

        public Builder isNewInstall(boolean z9) {
            this.f4787c = z9;
            return this;
        }

        public Builder packageLevel(PackageLevel packageLevel) {
            this.f4785a = packageLevel;
            return this;
        }

        public Builder serial(String str) {
            this.f4789e = str;
            return this;
        }

        public Builder sver(String str) {
            this.f4791g = str;
            return this;
        }

        public Builder timeoutTime(long j9) {
            if (j9 <= 0) {
                Log.w(PAFactory.TAG, "Timeout time is invalid, and the default value 2s will be used");
                this.f4792h = PAFactory.DEFAULT_TIME_OUT_TIME;
                return this;
            }
            if (j9 <= PAFactory.MAX_TIME_OUT_TIME) {
                this.f4792h = j9;
                return this;
            }
            Log.w(PAFactory.TAG, "Timeout time over 4s is not recommended, and the default value 2s will be used");
            this.f4792h = PAFactory.DEFAULT_TIME_OUT_TIME;
            return this;
        }

        public Builder traceListener(PATraceListener pATraceListener) {
            this.f4793i = pATraceListener;
            return this;
        }
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    public HashMap<String, String> getExtend() {
        return this.mExtend;
    }

    public synchronized InterfaceC5716PA getPaInstance() {
        InterfaceC5716PA c5721c;
        ThreadLocal<InterfaceC5716PA> threadLocal = sThreadLocal;
        c5721c = threadLocal.get();
        if (c5721c == null) {
            c5721c = new C5721c(this.mConfigManager.enableTracer());
            c5721c.registerPAANRListener(this.mContext, new C5718a(this), this.mTimeOutTime);
            threadLocal.set(c5721c);
        }
        return c5721c;
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

    private PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z9, String str, HashMap<String, String> map, String str2, long j9, PATraceListener pATraceListener) {
        this.mReporterFactory = iEfsReporter;
        this.mSerial = str;
        this.mExtend = map;
        this.mSver = str2;
        this.mContext = context;
        this.mTraceListener = pATraceListener;
        this.mTimeOutTime = j9;
        this.mConfigManager = new ConfigManager(context, packageLevel, iEfsReporter, z9);
    }
}
