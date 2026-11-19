package p318r5;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* renamed from: r5.e1 */
/* loaded from: classes5.dex */
public class C10858e1 implements InterfaceRunnableC10897u {

    /* renamed from: c */
    public Context f26205c = AbstractC10900v0.m23682q();

    /* renamed from: d */
    public String f26206d;

    /* renamed from: e */
    public String f26207e;

    /* renamed from: f */
    public String f26208f;

    public C10858e1(String str, String str2, String str3) {
        this.f26206d = str;
        this.f26207e = str2;
        this.f26208f = str3;
    }

    /* renamed from: a */
    public final void m23411a(String str, List list) {
        Pair pairM23579b = AbstractC10886o0.m23579b(str);
        new C10855d1(list, (String) pairM23579b.first, (String) pairM23579b.second, this.f26208f).m23400a();
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapM23473b;
        AbstractC10861f1.m23430b("hmsSdk", "eventReportTask is running");
        boolean zM23460a = AbstractC10865h.m23460a(this.f26205c);
        if (zM23460a) {
            AbstractC10861f1.m23436h("hmsSdk", "workKey is refresh,begin report all data");
            this.f26207e = "alltype";
        }
        try {
            try {
                mapM23473b = AbstractC10868i.m23473b(this.f26205c, this.f26206d, this.f26207e);
            } catch (IllegalArgumentException e10) {
                AbstractC10861f1.m23440l("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e10.getMessage());
                if ("alltype".equals(this.f26207e)) {
                    AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", new String[0]);
                    AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", new String[0]);
                } else {
                    String strM23581d = AbstractC10886o0.m23581d(this.f26206d, this.f26207e);
                    AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", strM23581d);
                    AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", strM23581d);
                }
            } catch (Exception e11) {
                AbstractC10861f1.m23440l("hmsSdk", "readEventRecords handData Exception:" + e11.getMessage());
                if ("alltype".equals(this.f26207e)) {
                    AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", new String[0]);
                    AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", new String[0]);
                } else {
                    String strM23581d2 = AbstractC10886o0.m23581d(this.f26206d, this.f26207e);
                    AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", strM23581d2);
                    AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", strM23581d2);
                }
            }
            if (mapM23473b.size() == 0) {
                AbstractC10861f1.m23434f("hmsSdk", "no events to report, tag: %s, type: %s", this.f26206d, this.f26207e);
                if ("alltype".equals(this.f26207e)) {
                    AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", new String[0]);
                    AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", new String[0]);
                    return;
                } else {
                    String strM23581d3 = AbstractC10886o0.m23581d(this.f26206d, this.f26207e);
                    AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", strM23581d3);
                    AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", strM23581d3);
                    return;
                }
            }
            for (Map.Entry entry : mapM23473b.entrySet()) {
                m23411a((String) entry.getKey(), (List) entry.getValue());
            }
            if ("alltype".equals(this.f26207e)) {
                AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", new String[0]);
                AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", new String[0]);
            } else {
                String strM23581d4 = AbstractC10886o0.m23581d(this.f26206d, this.f26207e);
                AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", strM23581d4);
                AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", strM23581d4);
            }
            if (zM23460a) {
                AbstractC10861f1.m23436h("hmsSdk", "refresh local key");
                C10890q0.m23591g().m23596d();
            }
        } catch (Throwable th) {
            if ("alltype".equals(this.f26207e)) {
                AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", new String[0]);
                AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", new String[0]);
            } else {
                String strM23581d5 = AbstractC10886o0.m23581d(this.f26206d, this.f26207e);
                AbstractC10877l.m23520d(this.f26205c, "stat_v2_1", strM23581d5);
                AbstractC10877l.m23520d(this.f26205c, "cached_v2_1", strM23581d5);
            }
            throw th;
        }
    }
}
