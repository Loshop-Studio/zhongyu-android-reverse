package p318r5;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: r5.d */
/* loaded from: classes5.dex */
public abstract class AbstractC10853d {

    /* renamed from: a */
    public static C10879l1 f26188a;

    /* renamed from: a */
    public static synchronized C10879l1 m23394a() {
        try {
            if (f26188a == null) {
                f26188a = C10904x0.m23699d().m23702c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f26188a;
    }

    /* renamed from: b */
    public static void m23395b(int i10, String str, LinkedHashMap linkedHashMap) {
        if (m23394a() == null || !C10902w0.m23694b().m23695a()) {
            return;
        }
        if (i10 == 1 || i10 == 0) {
            f26188a.m23535b(i10, str, linkedHashMap);
            return;
        }
        AbstractC10861f1.m23438j("hmsSdk", "Data type no longer collects range.type: " + i10);
    }

    /* renamed from: c */
    public static void m23396c(Context context, String str, String str2) {
        if (m23394a() != null) {
            f26188a.m23536c(context, str, str2);
        }
    }

    /* renamed from: d */
    public static void m23397d(int i10, String str, LinkedHashMap linkedHashMap) {
        if (m23394a() == null || !C10902w0.m23694b().m23695a()) {
            return;
        }
        if (i10 == 1 || i10 == 0) {
            f26188a.m23539f(i10, str, linkedHashMap);
            return;
        }
        AbstractC10861f1.m23438j("hmsSdk", "Data type no longer collects range.type: " + i10);
    }

    /* renamed from: e */
    public static boolean m23398e() {
        return C10904x0.m23699d().m23701b();
    }

    /* renamed from: f */
    public static void m23399f() {
        if (m23394a() == null || !C10902w0.m23694b().m23695a()) {
            return;
        }
        f26188a.m23534a(-1);
    }
}
