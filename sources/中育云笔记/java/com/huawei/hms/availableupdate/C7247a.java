package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.huawei.hms.availableupdate.a */
/* loaded from: classes5.dex */
public class C7247a {

    /* renamed from: c */
    public static final C7247a f11413c = new C7247a();

    /* renamed from: d */
    public static final Object f11414d = new Object();

    /* renamed from: a */
    public final AtomicBoolean f11415a = new AtomicBoolean(false);

    /* renamed from: b */
    public final List f11416b = new ArrayList(1);

    /* renamed from: a */
    public void m8383a(Activity activity) {
        synchronized (f11414d) {
            try {
                for (Activity activity2 : this.f11416b) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f11416b.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m8385b(Activity activity) {
        synchronized (f11414d) {
            this.f11416b.remove(activity);
        }
    }

    /* renamed from: a */
    public void m8384a(boolean z10) {
        this.f11415a.set(z10);
    }

    /* renamed from: a */
    public AtomicBoolean m8382a() {
        return this.f11415a;
    }
}
