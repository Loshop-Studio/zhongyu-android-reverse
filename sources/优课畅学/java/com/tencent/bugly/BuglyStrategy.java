package com.tencent.bugly;

import com.tencent.bugly.proguard.C6425aa;
import java.util.Map;

/* loaded from: classes4.dex */
public class BuglyStrategy {

    /* renamed from: c */
    private String f4328c;

    /* renamed from: d */
    private String f4329d;

    /* renamed from: e */
    private String f4330e;

    /* renamed from: f */
    private long f4331f;

    /* renamed from: g */
    private String f4332g;

    /* renamed from: h */
    private String f4333h;

    /* renamed from: i */
    private String f4334i;

    /* renamed from: u */
    private C6410a f4346u;

    /* renamed from: j */
    private boolean f4335j = true;

    /* renamed from: k */
    private boolean f4336k = true;

    /* renamed from: l */
    private boolean f4337l = true;

    /* renamed from: m */
    private boolean f4338m = false;

    /* renamed from: n */
    private boolean f4339n = true;

    /* renamed from: o */
    private Class<?> f4340o = null;

    /* renamed from: p */
    private boolean f4341p = true;

    /* renamed from: q */
    private boolean f4342q = true;

    /* renamed from: r */
    private boolean f4343r = true;

    /* renamed from: s */
    private boolean f4344s = true;

    /* renamed from: t */
    private boolean f4345t = false;

    /* renamed from: a */
    protected int f4326a = 31;

    /* renamed from: b */
    protected boolean f4327b = false;

    /* renamed from: v */
    private boolean f4347v = false;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C6410a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 100000;

        public synchronized Map<String, String> onCrashHandleStart(int i10, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i10, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str = this.f4329d;
        if (str != null) {
            return str;
        }
        return C6425aa.m4150b().f4553s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f4330e;
        if (str != null) {
            return str;
        }
        return C6425aa.m4150b().f4537c;
    }

    public synchronized long getAppReportDelay() {
        return this.f4331f;
    }

    public synchronized String getAppVersion() {
        String str = this.f4328c;
        if (str != null) {
            return str;
        }
        return C6425aa.m4150b().f4549o;
    }

    public synchronized int getCallBackType() {
        return this.f4326a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f4327b;
    }

    public synchronized C6410a getCrashHandleCallback() {
        return this.f4346u;
    }

    public synchronized String getDeviceID() {
        return this.f4333h;
    }

    public synchronized String getDeviceModel() {
        return this.f4334i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f4332g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f4340o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f4341p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f4336k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f4337l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f4335j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f4338m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f4339n;
    }

    public boolean isMerged() {
        return this.f4347v;
    }

    public boolean isReplaceOldChannel() {
        return this.f4342q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f4343r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f4344s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f4345t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f4329d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f4330e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j10) {
        this.f4331f = j10;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f4328c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z10) {
        this.f4341p = z10;
        return this;
    }

    public synchronized void setCallBackType(int i10) {
        this.f4326a = i10;
    }

    public synchronized void setCloseErrorCallback(boolean z10) {
        this.f4327b = z10;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C6410a c6410a) {
        this.f4346u = c6410a;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f4333h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f4334i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z10) {
        this.f4336k = z10;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z10) {
        this.f4337l = z10;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z10) {
        this.f4335j = z10;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z10) {
        this.f4338m = z10;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z10) {
        this.f4339n = z10;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f4332g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z10) {
        this.f4347v = z10;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z10) {
        this.f4345t = z10;
        return this;
    }

    public void setReplaceOldChannel(boolean z10) {
        this.f4342q = z10;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z10) {
        this.f4343r = z10;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z10) {
        this.f4344s = z10;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f4340o = cls;
        return this;
    }
}
