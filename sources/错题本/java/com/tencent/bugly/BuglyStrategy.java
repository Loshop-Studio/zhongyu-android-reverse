package com.tencent.bugly;

import com.tencent.bugly.proguard.C4044aa;
import java.util.Map;

/* loaded from: classes3.dex */
public class BuglyStrategy {

    /* renamed from: c */
    private String f3219c;

    /* renamed from: d */
    private String f3220d;

    /* renamed from: e */
    private String f3221e;

    /* renamed from: f */
    private long f3222f;

    /* renamed from: g */
    private String f3223g;

    /* renamed from: h */
    private String f3224h;

    /* renamed from: i */
    private String f3225i;

    /* renamed from: u */
    private C4032a f3237u;

    /* renamed from: j */
    private boolean f3226j = true;

    /* renamed from: k */
    private boolean f3227k = true;

    /* renamed from: l */
    private boolean f3228l = true;

    /* renamed from: m */
    private boolean f3229m = false;

    /* renamed from: n */
    private boolean f3230n = true;

    /* renamed from: o */
    private Class<?> f3231o = null;

    /* renamed from: p */
    private boolean f3232p = true;

    /* renamed from: q */
    private boolean f3233q = true;

    /* renamed from: r */
    private boolean f3234r = true;

    /* renamed from: s */
    private boolean f3235s = true;

    /* renamed from: t */
    private boolean f3236t = false;

    /* renamed from: a */
    protected int f3217a = 31;

    /* renamed from: b */
    protected boolean f3218b = false;

    /* renamed from: v */
    private boolean f3238v = false;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C4032a {
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

        public synchronized Map<String, String> onCrashHandleStart(int i, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str = this.f3220d;
        if (str != null) {
            return str;
        }
        return C4044aa.m2890b().f3449s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f3221e;
        if (str != null) {
            return str;
        }
        return C4044aa.m2890b().f3433c;
    }

    public synchronized long getAppReportDelay() {
        return this.f3222f;
    }

    public synchronized String getAppVersion() {
        String str = this.f3219c;
        if (str != null) {
            return str;
        }
        return C4044aa.m2890b().f3445o;
    }

    public synchronized int getCallBackType() {
        return this.f3217a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f3218b;
    }

    public synchronized C4032a getCrashHandleCallback() {
        return this.f3237u;
    }

    public synchronized String getDeviceID() {
        return this.f3224h;
    }

    public synchronized String getDeviceModel() {
        return this.f3225i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f3223g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f3231o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f3232p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f3227k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f3228l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f3226j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f3229m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f3230n;
    }

    public boolean isMerged() {
        return this.f3238v;
    }

    public boolean isReplaceOldChannel() {
        return this.f3233q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f3234r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f3235s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f3236t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f3220d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f3221e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j7) {
        this.f3222f = j7;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f3219c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z8) {
        this.f3232p = z8;
        return this;
    }

    public synchronized void setCallBackType(int i) {
        this.f3217a = i;
    }

    public synchronized void setCloseErrorCallback(boolean z8) {
        this.f3218b = z8;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C4032a c4032a) {
        this.f3237u = c4032a;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f3224h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f3225i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z8) {
        this.f3227k = z8;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z8) {
        this.f3228l = z8;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z8) {
        this.f3226j = z8;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z8) {
        this.f3229m = z8;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z8) {
        this.f3230n = z8;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f3223g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z8) {
        this.f3238v = z8;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z8) {
        this.f3236t = z8;
        return this;
    }

    public void setReplaceOldChannel(boolean z8) {
        this.f3233q = z8;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z8) {
        this.f3234r = z8;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z8) {
        this.f3235s = z8;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f3231o = cls;
        return this;
    }
}
