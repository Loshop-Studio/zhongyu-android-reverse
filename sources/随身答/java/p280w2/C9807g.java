package p280w2;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.umeng.analytics.pro.C6753a;
import com.umeng.analytics.pro.C6757b;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.statistics.proto.C6792c;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p260u2.AbstractC9666a;
import p270v2.AbstractC9755c;
import p270v2.AbstractC9756d;
import p290x2.AbstractC9866a;

/* renamed from: w2.g */
/* loaded from: classes4.dex */
public class C9807g {

    /* renamed from: g */
    public static C9807g f17466g;

    /* renamed from: h */
    public static Object f17467h = new Object();

    /* renamed from: a */
    public File f17468a;

    /* renamed from: c */
    public long f17470c;

    /* renamed from: f */
    public a f17473f;

    /* renamed from: b */
    public C6792c f17469b = null;

    /* renamed from: e */
    public Set f17472e = new HashSet();

    /* renamed from: d */
    public long f17471d = CalendarModelKt.MillisecondsIn24Hours;

    /* renamed from: w2.g$a */
    public static class a {

        /* renamed from: a */
        public Context f17474a;

        /* renamed from: b */
        public Set f17475b = new HashSet();

        public a(Context context) {
            this.f17474a = context;
        }

        /* renamed from: a */
        public synchronized void m16664a() {
            try {
                if (!this.f17475b.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = this.f17475b.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(',');
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    AbstractC9866a.m16841a(this.f17474a).edit().putString("invld_id", sb.toString()).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* renamed from: b */
        public synchronized boolean m16665b(String str) {
            return !this.f17475b.contains(str);
        }

        /* renamed from: c */
        public synchronized void m16666c() {
            String[] strArrSplit;
            String string = AbstractC9866a.m16841a(this.f17474a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f17475b.add(str);
                    }
                }
            }
        }

        /* renamed from: d */
        public synchronized void m16667d(String str) {
            this.f17475b.add(str);
        }
    }

    public C9807g(Context context) {
        this.f17473f = null;
        this.f17468a = new File(context.getFilesDir(), "umeng_it.cache");
        a aVar = new a(context);
        this.f17473f = aVar;
        aVar.m16666c();
    }

    /* renamed from: a */
    public static synchronized C9807g m16652a(Context context) {
        try {
            if (f17466g == null) {
                C9807g c9807g = new C9807g(context);
                f17466g = c9807g;
                c9807g.m16655d(new C9808h(context));
                f17466g.m16655d(new C9804d(context));
                f17466g.m16655d(new C9814n(context));
                f17466g.m16655d(new C9806f(context));
                f17466g.m16655d(new C9805e(context));
                f17466g.m16655d(new C9809i(context));
                f17466g.m16655d(new C9813m());
                if (C6780a.m6260e("header_device_oaid")) {
                    f17466g.m16655d(new C9811k(context));
                }
                C9812l c9812l = new C9812l(context);
                if (c9812l.m16668j()) {
                    f17466g.m16655d(c9812l);
                    f17466g.m16655d(new C9810j(context));
                    c9812l.m16671m();
                }
                f17466g.m16660i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17466g;
    }

    /* renamed from: b */
    public static synchronized void m16653b() {
        C9807g c9807g = f17466g;
        if (c9807g != null) {
            c9807g.m16659h();
            f17466g = null;
        }
    }

    /* renamed from: c */
    public final void m16654c(C6792c c6792c) {
        Map map;
        if (c6792c == null || (map = c6792c.f6929a) == null) {
            return;
        }
        if (map.containsKey("mac") && !C6780a.m6260e("header_device_id_mac")) {
            c6792c.f6929a.remove("mac");
        }
        if (c6792c.f6929a.containsKey("imei") && !C6780a.m6260e("header_device_id_imei")) {
            c6792c.f6929a.remove("imei");
        }
        if (c6792c.f6929a.containsKey("android_id") && !C6780a.m6260e("header_device_id_android_id")) {
            c6792c.f6929a.remove("android_id");
        }
        if (c6792c.f6929a.containsKey("serial") && !C6780a.m6260e("header_device_id_serialNo")) {
            c6792c.f6929a.remove("serial");
        }
        if (c6792c.f6929a.containsKey("idfa") && !C6780a.m6260e("header_tracking_idfa")) {
            c6792c.f6929a.remove("idfa");
        }
        if (!c6792c.f6929a.containsKey("oaid") || C6780a.m6260e("header_device_oaid")) {
            return;
        }
        c6792c.f6929a.remove("oaid");
    }

    /* renamed from: d */
    public final boolean m16655d(AbstractC9803c abstractC9803c) {
        if (this.f17473f.m16665b(abstractC9803c.m16647e())) {
            return this.f17472e.add(abstractC9803c);
        }
        if (!AbstractC9666a.f17071c) {
            return false;
        }
        AbstractC9756d.m16414m("invalid domain: " + abstractC9803c.m16647e());
        return false;
    }

    /* renamed from: e */
    public synchronized void m16656e() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f17470c >= this.f17471d) {
                boolean z9 = false;
                for (AbstractC9803c abstractC9803c : this.f17472e) {
                    if (abstractC9803c.m16648f() && abstractC9803c.m16646d()) {
                        if (!abstractC9803c.m16648f()) {
                            this.f17473f.m16667d(abstractC9803c.m16647e());
                        }
                        z9 = true;
                    }
                }
                if (z9) {
                    m16662k();
                    this.f17473f.m16664a();
                    m16661j();
                }
                this.f17470c = jCurrentTimeMillis;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public final void m16657f(C6792c c6792c) {
        byte[] bArrM6068a;
        synchronized (f17467h) {
            if (c6792c != null) {
                try {
                    synchronized (this) {
                        m16654c(c6792c);
                        bArrM6068a = new C6757b().m6068a(c6792c);
                    }
                    if (bArrM6068a != null) {
                        AbstractC9755c.m16401j(this.f17468a, bArrM6068a);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* renamed from: g */
    public synchronized C6792c m16658g() {
        return this.f17469b;
    }

    /* renamed from: h */
    public synchronized void m16659h() {
        try {
            if (f17466g == null) {
                return;
            }
            boolean z9 = false;
            for (AbstractC9803c abstractC9803c : this.f17472e) {
                if (abstractC9803c.m16648f() && abstractC9803c.m16650h() != null && !abstractC9803c.m16650h().isEmpty()) {
                    abstractC9803c.m16645c(null);
                    z9 = true;
                }
            }
            if (z9) {
                this.f17469b.m6373t(false);
                m16661j();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public synchronized void m16660i() {
        C6792c c6792cM16663l = m16663l();
        if (c6792cM16663l == null) {
            return;
        }
        m16654c(c6792cM16663l);
        ArrayList arrayList = new ArrayList(this.f17472e.size());
        synchronized (this) {
            try {
                this.f17469b = c6792cM16663l;
                for (AbstractC9803c abstractC9803c : this.f17472e) {
                    abstractC9803c.m16644b(this.f17469b);
                    if (!abstractC9803c.m16648f()) {
                        arrayList.add(abstractC9803c);
                    }
                }
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    this.f17472e.remove((AbstractC9803c) obj);
                }
                m16662k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public synchronized void m16661j() {
        C6792c c6792c = this.f17469b;
        if (c6792c != null) {
            m16657f(c6792c);
        }
    }

    /* renamed from: k */
    public final synchronized void m16662k() {
        try {
            C6792c c6792c = new C6792c();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (AbstractC9803c abstractC9803c : this.f17472e) {
                if (abstractC9803c.m16648f()) {
                    if (abstractC9803c.m16649g() != null) {
                        map.put(abstractC9803c.m16647e(), abstractC9803c.m16649g());
                    }
                    if (abstractC9803c.m16650h() != null && !abstractC9803c.m16650h().isEmpty()) {
                        arrayList.addAll(abstractC9803c.m16650h());
                    }
                }
            }
            c6792c.m6370g(arrayList);
            c6792c.m6371n(map);
            synchronized (this) {
                this.f17469b = c6792c;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: l */
    public final C6792c m16663l() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (f17467h) {
            if (!this.f17468a.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f17468a);
                try {
                    try {
                        byte[] bArrM16396e = AbstractC9755c.m16396e(fileInputStream);
                        C6792c c6792c = new C6792c();
                        new C6753a().m6018a(c6792c, bArrM16396e);
                        AbstractC9755c.m16397f(fileInputStream);
                        return c6792c;
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        AbstractC9755c.m16397f(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC9755c.m16397f(fileInputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                AbstractC9755c.m16397f(fileInputStream);
                throw th;
            }
        }
    }
}
