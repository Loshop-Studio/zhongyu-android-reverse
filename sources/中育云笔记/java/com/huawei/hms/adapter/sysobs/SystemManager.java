package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class SystemManager {

    /* renamed from: a */
    public static SystemManager f11342a = new SystemManager();

    /* renamed from: b */
    public static final Object f11343b = new Object();

    /* renamed from: c */
    public static SystemNotifier f11344c = new C7231a();

    public static SystemManager getInstance() {
        return f11342a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f11344c;
    }

    public void notifyNoticeResult(int i10) {
        f11344c.notifyNoticeObservers(i10);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f11344c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i10) {
        f11344c.notifyObservers(i10);
    }

    /* renamed from: com.huawei.hms.adapter.sysobs.SystemManager$a */
    public class C7231a implements SystemNotifier {

        /* renamed from: a */
        public final List f11345a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i10) {
            synchronized (SystemManager.f11343b) {
                try {
                    Iterator it = this.f11345a.iterator();
                    while (it.hasNext()) {
                        if (((SystemObserver) it.next()).onNoticeResult(i10)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f11343b) {
                try {
                    Iterator it = this.f11345a.iterator();
                    while (it.hasNext()) {
                        if (((SystemObserver) it.next()).onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f11345a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f11343b) {
                this.f11345a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f11343b) {
                this.f11345a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i10) {
            synchronized (SystemManager.f11343b) {
                try {
                    Iterator it = this.f11345a.iterator();
                    while (it.hasNext()) {
                        if (((SystemObserver) it.next()).onUpdateResult(i10)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
