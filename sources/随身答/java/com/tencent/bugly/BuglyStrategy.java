package com.tencent.bugly;

import com.tencent.bugly.proguard.C6663aa;
import java.util.Map;

/* loaded from: classes4.dex */
public class BuglyStrategy {

    /* renamed from: c */
    private String f5562c;

    /* renamed from: d */
    private String f5563d;

    /* renamed from: e */
    private String f5564e;

    /* renamed from: f */
    private long f5565f;

    /* renamed from: g */
    private String f5566g;

    /* renamed from: h */
    private String f5567h;

    /* renamed from: i */
    private String f5568i;

    /* renamed from: u */
    private C6648a f5580u;

    /* renamed from: j */
    private boolean f5569j = true;

    /* renamed from: k */
    private boolean f5570k = true;

    /* renamed from: l */
    private boolean f5571l = true;

    /* renamed from: m */
    private boolean f5572m = false;

    /* renamed from: n */
    private boolean f5573n = true;

    /* renamed from: o */
    private Class<?> f5574o = null;

    /* renamed from: p */
    private boolean f5575p = true;

    /* renamed from: q */
    private boolean f5576q = true;

    /* renamed from: r */
    private boolean f5577r = true;

    /* renamed from: s */
    private boolean f5578s = true;

    /* renamed from: t */
    private boolean f5579t = false;

    /* renamed from: a */
    protected int f5560a = 31;

    /* renamed from: b */
    protected boolean f5561b = false;

    /* renamed from: v */
    private boolean f5581v = false;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C6648a {
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

        public synchronized Map<String, String> onCrashHandleStart(int i9, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i9, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str = this.f5563d;
        if (str != null) {
            return str;
        }
        return C6663aa.m4969b().f5787s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f5564e;
        if (str != null) {
            return str;
        }
        return C6663aa.m4969b().f5771c;
    }

    public synchronized long getAppReportDelay() {
        return this.f5565f;
    }

    public synchronized String getAppVersion() {
        String str = this.f5562c;
        if (str != null) {
            return str;
        }
        return C6663aa.m4969b().f5783o;
    }

    public synchronized int getCallBackType() {
        return this.f5560a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f5561b;
    }

    public synchronized C6648a getCrashHandleCallback() {
        return this.f5580u;
    }

    public synchronized String getDeviceID() {
        return this.f5567h;
    }

    public synchronized String getDeviceModel() {
        return this.f5568i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f5566g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f5574o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f5575p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f5570k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f5571l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f5569j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f5572m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f5573n;
    }

    public boolean isMerged() {
        return this.f5581v;
    }

    public boolean isReplaceOldChannel() {
        return this.f5576q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f5577r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f5578s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f5579t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f5563d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f5564e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j9) {
        this.f5565f = j9;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f5562c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z9) {
        this.f5575p = z9;
        return this;
    }

    public synchronized void setCallBackType(int i9) {
        this.f5560a = i9;
    }

    public synchronized void setCloseErrorCallback(boolean z9) {
        this.f5561b = z9;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C6648a c6648a) {
        this.f5580u = c6648a;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f5567h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f5568i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z9) {
        this.f5570k = z9;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z9) {
        this.f5571l = z9;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z9) {
        this.f5569j = z9;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z9) {
        this.f5572m = z9;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z9) {
        this.f5573n = z9;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f5566g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z9) {
        this.f5581v = z9;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z9) {
        this.f5579t = z9;
        return this;
    }

    public void setReplaceOldChannel(boolean z9) {
        this.f5576q = z9;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z9) {
        this.f5577r = z9;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z9) {
        this.f5578s = z9;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f5574o = cls;
        return this;
    }
}
