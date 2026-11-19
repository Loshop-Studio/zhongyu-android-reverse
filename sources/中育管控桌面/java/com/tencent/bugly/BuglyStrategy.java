package com.tencent.bugly;

import com.tencent.bugly.proguard.C5780aa;
import java.util.Map;

/* loaded from: classes3.dex */
public class BuglyStrategy {

    /* renamed from: c */
    private String f3706c;

    /* renamed from: d */
    private String f3707d;

    /* renamed from: e */
    private String f3708e;

    /* renamed from: f */
    private long f3709f;

    /* renamed from: g */
    private String f3710g;

    /* renamed from: h */
    private String f3711h;

    /* renamed from: i */
    private String f3712i;

    /* renamed from: u */
    private C5765a f3724u;

    /* renamed from: j */
    private boolean f3713j = true;

    /* renamed from: k */
    private boolean f3714k = true;

    /* renamed from: l */
    private boolean f3715l = true;

    /* renamed from: m */
    private boolean f3716m = false;

    /* renamed from: n */
    private boolean f3717n = true;

    /* renamed from: o */
    private Class<?> f3718o = null;

    /* renamed from: p */
    private boolean f3719p = true;

    /* renamed from: q */
    private boolean f3720q = true;

    /* renamed from: r */
    private boolean f3721r = true;

    /* renamed from: s */
    private boolean f3722s = true;

    /* renamed from: t */
    private boolean f3723t = false;

    /* renamed from: a */
    protected int f3704a = 31;

    /* renamed from: b */
    protected boolean f3705b = false;

    /* renamed from: v */
    private boolean f3725v = false;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C5765a {
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

        public synchronized Map<String, String> onCrashHandleStart(int i6, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i6, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str = this.f3707d;
        if (str != null) {
            return str;
        }
        return C5780aa.m3795b().f3931s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f3708e;
        if (str != null) {
            return str;
        }
        return C5780aa.m3795b().f3915c;
    }

    public synchronized long getAppReportDelay() {
        return this.f3709f;
    }

    public synchronized String getAppVersion() {
        String str = this.f3706c;
        if (str != null) {
            return str;
        }
        return C5780aa.m3795b().f3927o;
    }

    public synchronized int getCallBackType() {
        return this.f3704a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f3705b;
    }

    public synchronized C5765a getCrashHandleCallback() {
        return this.f3724u;
    }

    public synchronized String getDeviceID() {
        return this.f3711h;
    }

    public synchronized String getDeviceModel() {
        return this.f3712i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f3710g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f3718o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f3719p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f3714k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f3715l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f3713j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f3716m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f3717n;
    }

    public boolean isMerged() {
        return this.f3725v;
    }

    public boolean isReplaceOldChannel() {
        return this.f3720q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f3721r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f3722s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f3723t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f3707d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f3708e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j6) {
        this.f3709f = j6;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f3706c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z6) {
        this.f3719p = z6;
        return this;
    }

    public synchronized void setCallBackType(int i6) {
        this.f3704a = i6;
    }

    public synchronized void setCloseErrorCallback(boolean z6) {
        this.f3705b = z6;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C5765a c5765a) {
        this.f3724u = c5765a;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f3711h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f3712i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z6) {
        this.f3714k = z6;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z6) {
        this.f3715l = z6;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z6) {
        this.f3713j = z6;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z6) {
        this.f3716m = z6;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z6) {
        this.f3717n = z6;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f3710g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z6) {
        this.f3725v = z6;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z6) {
        this.f3723t = z6;
        return this;
    }

    public void setReplaceOldChannel(boolean z6) {
        this.f3720q = z6;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z6) {
        this.f3721r = z6;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z6) {
        this.f3722s = z6;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f3718o = cls;
        return this;
    }
}
