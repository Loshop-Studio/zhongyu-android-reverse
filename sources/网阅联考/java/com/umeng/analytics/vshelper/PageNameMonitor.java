package com.umeng.analytics.vshelper;

/* loaded from: classes2.dex */
public class PageNameMonitor implements InterfaceC3420a {
    private static String currentActivity;
    private static String currentCustomPage;
    private static Object lock = new Object();

    /* renamed from: com.umeng.analytics.vshelper.PageNameMonitor$a */
    public static class C3419a {

        /* renamed from: a */
        private static final PageNameMonitor f2391a = new PageNameMonitor();

        private C3419a() {
        }
    }

    public static PageNameMonitor getInstance() {
        return C3419a.f2391a;
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3420a
    public void activityPause(String str) {
        synchronized (lock) {
            currentActivity = null;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3420a
    public void activityResume(String str) {
        synchronized (lock) {
            currentActivity = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3420a
    public void customPageBegin(String str) {
        synchronized (lock) {
            currentCustomPage = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3420a
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
