package p061d0;

import android.util.Log;
import com.alibaba.sdk.android.logger.LogLevel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: d0.a */
/* loaded from: classes3.dex */
public class C7276a {

    /* renamed from: h */
    public static final LogLevel f11704h = LogLevel.WARN;

    /* renamed from: i */
    public static final InterfaceC7278c f11705i = new d(null);

    /* renamed from: b */
    public LogLevel f11707b;

    /* renamed from: f */
    public String f11711f;

    /* renamed from: g */
    public boolean f11712g;

    /* renamed from: a */
    public boolean f11706a = true;

    /* renamed from: c */
    public InterfaceC7278c f11708c = f11705i;

    /* renamed from: d */
    public ArrayList f11709d = new ArrayList();

    /* renamed from: e */
    public c f11710e = new c(this, null);

    /* renamed from: d0.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11713a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f11713a = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11713a[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11713a[LogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11713a[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: d0.a$b */
    public static class b implements InterfaceC7278c {

        /* renamed from: a */
        public InterfaceC7278c f11714a;

        /* renamed from: b */
        public boolean f11715b;

        /* renamed from: c */
        public SimpleDateFormat f11716c;

        public b(InterfaceC7278c interfaceC7278c, boolean z9) {
            this.f11714a = interfaceC7278c;
            this.f11715b = z9;
            if (z9) {
                this.f11716c = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss:SSS");
            }
        }

        @Override // p061d0.InterfaceC7278c
        /* renamed from: a */
        public void mo11527a(LogLevel logLevel, String str, String str2) {
            if (this.f11715b) {
                str2 = "[" + this.f11716c.format(new Date()) + "]" + str2 + m11528b();
            }
            this.f11714a.mo11527a(logLevel, str, str2);
        }

        /* renamed from: b */
        public final String m11528b() {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i10 = 1; i10 < stackTrace.length; i10++) {
                if (!stackTrace[i10].getClassName().startsWith("com.alibaba.sdk.android.logger")) {
                    return "(" + stackTrace[i10].getFileName() + ":" + stackTrace[i10].getLineNumber() + ")";
                }
            }
            return "";
        }

        public /* synthetic */ b(InterfaceC7278c interfaceC7278c, boolean z9, a aVar) {
            this(interfaceC7278c, z9);
        }
    }

    /* renamed from: d0.a$c */
    public class c implements InterfaceC7278c {
        public c() {
        }

        @Override // p061d0.InterfaceC7278c
        /* renamed from: a */
        public void mo11527a(LogLevel logLevel, String str, String str2) {
            if (C7276a.this.m11524c(logLevel) && C7276a.this.f11708c != null) {
                try {
                    C7276a.this.f11708c.mo11527a(logLevel, str, str2);
                } catch (Throwable unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C7276a.this.f11709d);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    ((InterfaceC7278c) obj).mo11527a(logLevel, str, str2);
                } catch (Throwable unused2) {
                }
            }
        }

        public /* synthetic */ c(C7276a c7276a, a aVar) {
            this();
        }
    }

    /* renamed from: d0.a$d */
    public static class d implements InterfaceC7278c {
        public d() {
        }

        @Override // p061d0.InterfaceC7278c
        /* renamed from: a */
        public void mo11527a(LogLevel logLevel, String str, String str2) {
            int i10 = a.f11713a[logLevel.ordinal()];
            if (i10 == 2) {
                Log.i(str, str2);
            } else if (i10 == 3) {
                Log.w(str, str2);
            } else {
                if (i10 != 4) {
                    return;
                }
                Log.e(str, str2);
            }
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: d0.a$e */
    public static class e implements InterfaceC7277b {

        /* renamed from: a */
        public final String f11718a;

        /* renamed from: b */
        public InterfaceC7278c f11719b;

        public e(String str, InterfaceC7278c interfaceC7278c) {
            this.f11718a = str;
            this.f11719b = interfaceC7278c;
        }

        @Override // p061d0.InterfaceC7277b
        /* renamed from: a */
        public void mo11529a(String str) {
            this.f11719b.mo11527a(LogLevel.DEBUG, this.f11718a, str);
        }
    }

    public C7276a(String str, boolean z9) {
        this.f11707b = f11704h;
        this.f11711f = str;
        if (str == null) {
            this.f11711f = "default";
        }
        this.f11712g = z9;
        if (z9) {
            this.f11707b = LogLevel.DEBUG;
        }
    }

    /* renamed from: b */
    public final String m11523b(Object obj) {
        String simpleName;
        if (obj == null) {
            simpleName = "";
        } else if (obj instanceof Class) {
            simpleName = ((Class) obj).getSimpleName();
        } else if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            simpleName = obj.getClass().getSimpleName() + "@" + obj.hashCode();
        }
        return this.f11711f + "_" + simpleName;
    }

    /* renamed from: c */
    public final boolean m11524c(LogLevel logLevel) {
        return this.f11706a && logLevel.ordinal() >= this.f11707b.ordinal();
    }

    /* renamed from: f */
    public InterfaceC7277b m11525f(Object obj) {
        return new e(m11523b(obj), new b(this.f11710e, this.f11712g, null));
    }

    /* renamed from: g */
    public void m11526g(LogLevel logLevel) {
        this.f11707b = logLevel;
    }
}
