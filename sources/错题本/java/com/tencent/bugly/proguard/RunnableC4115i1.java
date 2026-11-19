package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i1 */
/* loaded from: classes3.dex */
public final class RunnableC4115i1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3836a;

    /* renamed from: b */
    public final /* synthetic */ int f3837b;

    /* renamed from: c */
    public final /* synthetic */ C4139u f3838c;

    public /* synthetic */ RunnableC4115i1(C4139u c4139u, int i, int i8) {
        this.f3836a = i8;
        this.f3838c = c4139u;
        this.f3837b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4137t c4137t;
        switch (this.f3836a) {
            case 0:
                C4139u c4139u = this.f3838c;
                try {
                    if (TextUtils.isEmpty(c4139u.f3899d)) {
                        break;
                    } else {
                        List<C4137t> listM3385d = c4139u.m3385d(1004);
                        if (listM3385d == null) {
                            listM3385d = new ArrayList();
                        }
                        if (c4139u.f3900e.get(1004) == null) {
                            c4139u.f3900e.put(1004, new HashMap());
                        }
                        Object obj = ((Map) c4139u.f3900e.get(1004)).get(c4139u.f3899d);
                        int i = this.f3837b;
                        if (obj == null) {
                            c4137t = new C4137t();
                            c4137t.f3889a = 1004;
                            c4137t.f3895g = C4139u.f3896a;
                            c4137t.f3890b = c4139u.f3899d;
                            c4137t.f3894f = C4044aa.m2890b().f3445o;
                            c4137t.f3893e = C4044aa.m2890b().f3438h;
                            c4137t.f3891c = System.currentTimeMillis();
                            c4137t.f3892d = i;
                            ((Map) c4139u.f3900e.get(1004)).put(c4139u.f3899d, c4137t);
                        } else {
                            c4137t = (C4137t) ((Map) c4139u.f3900e.get(1004)).get(c4139u.f3899d);
                            c4137t.f3892d = i;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z8 = false;
                        for (C4137t c4137t2 : listM3385d) {
                            if (C4139u.m3379a(c4137t2, c4137t)) {
                                c4137t2.f3892d = c4137t.f3892d;
                                z8 = true;
                            }
                            if (C4139u.m3381b(c4137t2, c4137t)) {
                                arrayList.add(c4137t2);
                            }
                        }
                        listM3385d.removeAll(arrayList);
                        if (!z8) {
                            listM3385d.add(c4137t);
                        }
                        c4139u.m3377a(1004, (int) listM3385d);
                        break;
                    }
                } catch (Exception unused) {
                    C4055al.m3027e("saveCrashRecord failed", new Object[0]);
                    return;
                }
            default:
                C4139u c4139u2 = this.f3838c;
                int i8 = this.f3837b;
                boolean zM3384c = c4139u2.m3384c(i8);
                c4139u2.f3901f.edit().putBoolean(i8 + "_" + c4139u2.f3899d, !zM3384c).commit();
                break;
        }
    }
}
