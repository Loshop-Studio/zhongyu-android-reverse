package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.availableupdate.b */
/* loaded from: classes5.dex */
public class C7248b {

    /* renamed from: b */
    public static final C7248b f11417b = new C7248b();

    /* renamed from: c */
    public static final Object f11418c = new Object();

    /* renamed from: a */
    public final List f11419a = new ArrayList(1);

    /* renamed from: a */
    public void m8386a(Activity activity) {
        synchronized (f11418c) {
            try {
                for (Activity activity2 : this.f11419a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f11419a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m8387b(Activity activity) {
        synchronized (f11418c) {
            this.f11419a.remove(activity);
        }
    }
}
