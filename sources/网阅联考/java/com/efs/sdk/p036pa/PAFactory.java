package com.efs.sdk.p036pa;

import android.content.Context;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.p036pa.config.ConfigManager;
import com.efs.sdk.p036pa.config.IEfsReporter;
import com.efs.sdk.p036pa.config.PackageLevel;
import com.efs.sdk.p036pa.p037a.C2981c;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    static final ThreadLocal<InterfaceC2976PA> sThreadLocal = new ThreadLocal<>();
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
        private PackageLevel f1181a;

        /* renamed from: b */
        private IEfsReporter f1182b;

        /* renamed from: c */
        private boolean f1183c;

        /* renamed from: d */
        private Context f1184d;

        /* renamed from: e */
        private String f1185e;

        /* renamed from: f */
        private HashMap<String, String> f1186f;

        /* renamed from: g */
        private String f1187g;

        /* renamed from: h */
        private long f1188h = PAFactory.DEFAULT_TIME_OUT_TIME;

        /* renamed from: i */
        private PATraceListener f1189i;

        public Builder(Context context, IEfsReporter iEfsReporter) {
            if (context == null) {
                throw new RuntimeException("context Should Not null");
            }
            if (iEfsReporter == null) {
                throw new RuntimeException("reporter Should Not Empty");
            }
            this.f1182b = iEfsReporter;
            this.f1184d = context;
        }

        public PAFactory build() {
            if (this.f1181a != null) {
                return new PAFactory(this.f1184d, this.f1181a, this.f1182b, this.f1183c, this.f1185e, this.f1186f, this.f1187g, this.f1188h, this.f1189i);
            }
            throw new RuntimeException(String.format("%s Should Not Null", ""));
        }

        public Builder extendLogInfo(HashMap<String, String> map) {
            this.f1186f = map;
            return this;
        }

        public Builder isNewInstall(boolean z3) {
            this.f1183c = z3;
            return this;
        }

        public Builder packageLevel(PackageLevel packageLevel) {
            this.f1181a = packageLevel;
            return this;
        }

        public Builder serial(String str) {
            this.f1185e = str;
            return this;
        }

        public Builder sver(String str) {
            this.f1187g = str;
            return this;
        }

        public Builder timeoutTime(long j4) {
            if (j4 <= 0) {
                Log.w(PAFactory.TAG, "Timeout time is invalid, and the default value 2s will be used");
                this.f1188h = PAFactory.DEFAULT_TIME_OUT_TIME;
            } else {
                if (j4 > PAFactory.MAX_TIME_OUT_TIME) {
                    Log.w(PAFactory.TAG, "Timeout time over 4s is not recommended, and the default value 2s will be used");
                    this.f1188h = PAFactory.DEFAULT_TIME_OUT_TIME;
                    return this;
                }
                this.f1188h = j4;
            }
            return this;
        }

        public Builder traceListener(PATraceListener pATraceListener) {
            this.f1189i = pATraceListener;
            return this;
        }
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    public HashMap<String, String> getExtend() {
        return this.mExtend;
    }

    public synchronized InterfaceC2976PA getPaInstance() {
        InterfaceC2976PA c2981c;
        ThreadLocal<InterfaceC2976PA> threadLocal = sThreadLocal;
        c2981c = threadLocal.get();
        if (c2981c == null) {
            c2981c = new C2981c(this.mConfigManager.enableTracer());
            c2981c.registerPAANRListener(this.mContext, new C2978a(this), this.mTimeOutTime);
            threadLocal.set(c2981c);
        }
        return c2981c;
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
