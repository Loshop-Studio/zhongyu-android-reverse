package p318r5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: r5.d1 */
/* loaded from: classes5.dex */
public class C10855d1 {

    /* renamed from: a */
    public List f26191a;

    /* renamed from: b */
    public String f26192b;

    /* renamed from: c */
    public String f26193c;

    /* renamed from: d */
    public String f26194d;

    public C10855d1(List list, String str, String str2, String str3) {
        this.f26191a = list;
        this.f26192b = str;
        this.f26193c = str2;
        this.f26194d = str3;
    }

    /* renamed from: a */
    public void m23400a() {
        if (!"_default_config_tag".equals(this.f26193c)) {
            m23401b(this.f26191a, this.f26193c, this.f26192b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C10859f c10859f : this.f26191a) {
            String strM23417f = c10859f.m23417f();
            if (TextUtils.isEmpty(strM23417f) || "oper".equals(strM23417f)) {
                arrayList4.add(c10859f);
            } else if ("maint".equals(strM23417f)) {
                arrayList.add(c10859f);
            } else if ("preins".equals(strM23417f)) {
                arrayList2.add(c10859f);
            } else if ("diffprivacy".equals(strM23417f)) {
                arrayList3.add(c10859f);
            }
        }
        m23401b(arrayList4, "oper", "_default_config_tag");
        m23401b(arrayList, "maint", "_default_config_tag");
        m23401b(arrayList2, "preins", "_default_config_tag");
        m23401b(arrayList3, "diffprivacy", "_default_config_tag");
    }

    /* renamed from: b */
    public final void m23401b(List list, String str, String str2) {
        String str3;
        String str4;
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 * 500;
            List<C10859f> listSubList = list.subList(i11, Math.min(list.size(), i11 + 500));
            String strReplace = UUID.randomUUID().toString().replace("-", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM23364c = AbstractC10850c.m23364c(str2, str) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (C10859f c10859f : listSubList) {
                if (!AbstractC10865h.m23463d(c10859f.m23415d(), jCurrentTimeMillis, jM23364c)) {
                    arrayList.add(c10859f);
                }
            }
            if (arrayList.size() > 0) {
                str3 = str;
                str4 = str2;
                new C10866h0(str4, str3, this.f26194d, arrayList, strReplace).m23465b();
            } else {
                str3 = str;
                str4 = str2;
                AbstractC10861f1.m23440l("hmsSdk", "No data to report handler");
            }
            i10++;
            str2 = str4;
            str = str3;
        }
    }
}
