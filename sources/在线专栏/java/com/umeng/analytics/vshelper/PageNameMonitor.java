package com.umeng.analytics.vshelper;

/* loaded from: classes.dex */
public class PageNameMonitor implements InterfaceC1936a {
    private static String currentActivity;
    private static String currentCustomPage;
    private static Object lock = new Object();

    /* renamed from: com.umeng.analytics.vshelper.PageNameMonitor$a */
    private static class C1935a {

        /* renamed from: a */
        private static final PageNameMonitor f8983a = new PageNameMonitor();

        private C1935a() {
        }
    }

    public static PageNameMonitor getInstance() {
        return C1935a.f8983a;
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC1936a
    public void activityPause(String str) {
        synchronized (lock) {
            currentActivity = null;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC1936a
    public void activityResume(String str) {
        synchronized (lock) {
            currentActivity = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC1936a
    public void customPageBegin(String str) {
        synchronized (lock) {
            currentCustomPage = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC1936a
    public void customPageEnd(String str) {
        synchronized (lock) {
            currentCustomPage = null;
        }
    }

    public String getCurrenPageName() {
        synchronized (lock) {
            String str = currentCustomPage;
            if (str != null) {
                return str;
            }
            String str2 = currentActivity;
            if (str2 != null) {
                return str2;
            }
            return null;
        }
    }

    private PageNameMonitor() {
    }
}
