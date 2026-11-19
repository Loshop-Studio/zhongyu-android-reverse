package p282w0;

import com.p041fc.jisx.jlog.FormatterType;
import com.p041fc.jisx.jlog.JLogLevel;

/* renamed from: w0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10271a {
    /* renamed from: a */
    public static void m19248a(Object obj) {
        m19249b(null, obj);
    }

    /* renamed from: b */
    public static void m19249b(String str, Object obj) {
        m19252e(JLogLevel.DEBUG, null, str, obj);
    }

    /* renamed from: c */
    public static void m19250c(Object obj) {
        m19251d(null, obj);
    }

    /* renamed from: d */
    public static void m19251d(String str, Object obj) {
        m19252e(JLogLevel.ERROR, null, str, obj);
    }

    /* renamed from: e */
    public static void m19252e(JLogLevel jLogLevel, FormatterType formatterType, String str, Object obj) {
        throw new IllegalStateException("日志工具还未初始化");
    }
}
