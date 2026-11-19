package com.tencent.bugly;

import com.tencent.bugly.proguard.C6403aa;
import java.util.Map;

/* loaded from: classes4.dex */
public class BuglyStrategy {

    /* renamed from: c */
    private String f4985c;

    /* renamed from: d */
    private String f4986d;

    /* renamed from: e */
    private String f4987e;

    /* renamed from: f */
    private long f4988f;

    /* renamed from: g */
    private String f4989g;

    /* renamed from: h */
    private String f4990h;

    /* renamed from: i */
    private String f4991i;

    /* renamed from: u */
    private C6388a f5003u;

    /* renamed from: j */
    private boolean f4992j = true;

    /* renamed from: k */
    private boolean f4993k = true;

    /* renamed from: l */
    private boolean f4994l = true;

    /* renamed from: m */
    private boolean f4995m = false;

    /* renamed from: n */
    private boolean f4996n = true;

    /* renamed from: o */
    private Class<?> f4997o = null;

    /* renamed from: p */
    private boolean f4998p = true;

    /* renamed from: q */
    private boolean f4999q = true;

    /* renamed from: r */
    private boolean f5000r = true;

    /* renamed from: s */
    private boolean f5001s = true;

    /* renamed from: t */
    private boolean f5002t = false;

    /* renamed from: a */
    protected int f4983a = 31;

    /* renamed from: b */
    protected boolean f4984b = false;

    /* renamed from: v */
    private boolean f5004v = false;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C6388a {
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
        String str = this.f4986d;
        if (str != null) {
            return str;
        }
        return C6403aa.m4790b().f5210s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f4987e;
        if (str != null) {
            return str;
        }
        return C6403aa.m4790b().f5194c;
    }

    public synchronized long getAppReportDelay() {
        return this.f4988f;
    }

    public synchronized String getAppVersion() {
        String str = this.f4985c;
        if (str != null) {
            return str;
        }
        return C6403aa.m4790b().f5206o;
    }

    public synchronized int getCallBackType() {
        return this.f4983a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f4984b;
    }

    public synchronized C6388a getCrashHandleCallback() {
        return this.f5003u;
    }

    public synchronized String getDeviceID() {
        return this.f4990h;
    }

    public synchronized String getDeviceModel() {
        return this.f4991i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f4989g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f4997o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f4998p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f4993k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f4994l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f4992j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f4995m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f4996n;
    }

    public boolean isMerged() {
        return this.f5004v;
    }

    public boolean isReplaceOldChannel() {
        return this.f4999q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f5000r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f5001s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f5002t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f4986d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f4987e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j10) {
        this.f4988f = j10;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f4985c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z9) {
        this.f4998p = z9;
        return this;
    }

    public synchronized void setCallBackType(int i10) {
        this.f4983a = i10;
    }

    public synchronized void setCloseErrorCallback(boolean z9) {
        this.f4984b = z9;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C6388a c6388a) {
        this.f5003u = c6388a;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f4990h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f4991i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z9) {
        this.f4993k = z9;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z9) {
        this.f4994l = z9;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z9) {
        this.f4992j = z9;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z9) {
        this.f4995m = z9;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z9) {
        this.f4996n = z9;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f4989g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z9) {
        this.f5004v = z9;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z9) {
        this.f5002t = z9;
        return this;
    }

    public void setReplaceOldChannel(boolean z9) {
        this.f4999q = z9;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z9) {
        this.f5000r = z9;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z9) {
        this.f5001s = z9;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f4997o = cls;
        return this;
    }
}
