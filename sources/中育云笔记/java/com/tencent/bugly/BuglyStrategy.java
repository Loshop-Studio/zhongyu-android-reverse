package com.tencent.bugly;

import com.tencent.bugly.proguard.C7768aa;
import java.util.Map;

/* loaded from: classes5.dex */
public class BuglyStrategy {

    /* renamed from: c */
    private String f13427c;

    /* renamed from: d */
    private String f13428d;

    /* renamed from: e */
    private String f13429e;

    /* renamed from: f */
    private long f13430f;

    /* renamed from: g */
    private String f13431g;

    /* renamed from: h */
    private String f13432h;

    /* renamed from: i */
    private String f13433i;

    /* renamed from: u */
    private C7753a f13445u;

    /* renamed from: j */
    private boolean f13434j = true;

    /* renamed from: k */
    private boolean f13435k = true;

    /* renamed from: l */
    private boolean f13436l = true;

    /* renamed from: m */
    private boolean f13437m = false;

    /* renamed from: n */
    private boolean f13438n = true;

    /* renamed from: o */
    private Class<?> f13439o = null;

    /* renamed from: p */
    private boolean f13440p = true;

    /* renamed from: q */
    private boolean f13441q = true;

    /* renamed from: r */
    private boolean f13442r = true;

    /* renamed from: s */
    private boolean f13443s = true;

    /* renamed from: t */
    private boolean f13444t = false;

    /* renamed from: a */
    protected int f13425a = 31;

    /* renamed from: b */
    protected boolean f13426b = false;

    /* renamed from: v */
    private boolean f13446v = false;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C7753a {
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
        String str = this.f13428d;
        if (str != null) {
            return str;
        }
        return C7768aa.m10480b().f13652s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f13429e;
        if (str != null) {
            return str;
        }
        return C7768aa.m10480b().f13636c;
    }

    public synchronized long getAppReportDelay() {
        return this.f13430f;
    }

    public synchronized String getAppVersion() {
        String str = this.f13427c;
        if (str != null) {
            return str;
        }
        return C7768aa.m10480b().f13648o;
    }

    public synchronized int getCallBackType() {
        return this.f13425a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f13426b;
    }

    public synchronized C7753a getCrashHandleCallback() {
        return this.f13445u;
    }

    public synchronized String getDeviceID() {
        return this.f13432h;
    }

    public synchronized String getDeviceModel() {
        return this.f13433i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f13431g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f13439o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f13440p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f13435k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f13436l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f13434j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f13437m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f13438n;
    }

    public boolean isMerged() {
        return this.f13446v;
    }

    public boolean isReplaceOldChannel() {
        return this.f13441q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f13442r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f13443s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f13444t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f13428d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f13429e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j10) {
        this.f13430f = j10;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f13427c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z10) {
        this.f13440p = z10;
        return this;
    }

    public synchronized void setCallBackType(int i10) {
        this.f13425a = i10;
    }

    public synchronized void setCloseErrorCallback(boolean z10) {
        this.f13426b = z10;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C7753a c7753a) {
        this.f13445u = c7753a;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f13432h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f13433i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z10) {
        this.f13435k = z10;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z10) {
        this.f13436l = z10;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z10) {
        this.f13434j = z10;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z10) {
        this.f13437m = z10;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z10) {
        this.f13438n = z10;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f13431g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z10) {
        this.f13446v = z10;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z10) {
        this.f13444t = z10;
        return this;
    }

    public void setReplaceOldChannel(boolean z10) {
        this.f13441q = z10;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z10) {
        this.f13442r = z10;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z10) {
        this.f13443s = z10;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f13439o = cls;
        return this;
    }
}
