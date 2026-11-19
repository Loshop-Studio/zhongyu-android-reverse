package com.tendcloud.tenddata;

import android.os.Environment;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import org.json.JSONArray;

/* renamed from: com.tendcloud.tenddata.fn */
/* loaded from: classes5.dex */
public class C7990fn extends AbstractC7987fk {
    public C7990fn() throws IOException {
        m11979a("manufacture", C7899cd.m11446f());
        m11979a(Constants.KEY_BRAND, C7899cd.m11448g());
        m11979a(Constants.KEY_MODEL, C7899cd.m11449h());
        m11979a("dummy0", C7900ce.m11481a("dummy0"));
        JSONArray jSONArray = new JSONArray();
        for (String str : C7899cd.m11466p()) {
            jSONArray.put(str);
        }
        m11979a("cpuInfo", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 : C7899cd.m11474t()) {
            jSONArray2.put(i10);
        }
        m11979a("memoryInfo", jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        for (int i11 : C7899cd.m11472s()) {
            jSONArray3.put(i11);
        }
        m11979a("sdCardInfo", jSONArray3);
        C7899cd.m11430a(C7843ab.f14307g, this.f14946b);
        C7899cd.m11436b(C7843ab.f14307g, this.f14946b);
        m11979a("totalDiskSpace", Integer.valueOf(m11987a()));
        m11979a("support", C7899cd.m11450h(C7843ab.f14307g));
        m11979a("cpu", C7899cd.m11468q());
        m11979a("nfcHce", C7899cd.m11435b(C7843ab.f14307g));
    }

    /* renamed from: a */
    public static int m11987a() {
        try {
            int[] iArrM11476u = C7899cd.m11476u();
            if (iArrM11476u != null) {
                return !Environment.isExternalStorageEmulated() ? iArrM11476u[0] + iArrM11476u[2] : iArrM11476u[0];
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void setSlots(int i10) {
        m11979a("slots", Integer.valueOf(i10));
    }
}
