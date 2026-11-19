package p083f0;

import android.content.Context;
import java.util.Map;
import p116i0.AbstractC7641b;
import p127j0.AbstractC7774e;

/* renamed from: f0.a */
/* loaded from: classes3.dex */
public class C7422a {

    /* renamed from: l */
    public static final C7422a f12116l = new C7422a();

    /* renamed from: a */
    public Context f12117a = null;

    /* renamed from: b */
    public String f12118b = null;

    /* renamed from: c */
    public String f12119c = null;

    /* renamed from: d */
    public String f12120d = null;

    /* renamed from: e */
    public String f12121e = null;

    /* renamed from: f */
    public String f12122f = null;

    /* renamed from: g */
    public String f12123g = null;

    /* renamed from: h */
    public String f12124h = null;

    /* renamed from: i */
    public Boolean f12125i = Boolean.FALSE;

    /* renamed from: j */
    public String f12126j = null;

    /* renamed from: k */
    public C7423b f12127k = new C7423b();

    /* renamed from: a */
    public final Boolean m11950a() {
        if (this.f12118b != null && this.f12121e != null && this.f12119c != null && this.f12117a != null) {
            return Boolean.TRUE;
        }
        AbstractC7774e.m13119b("have send args is null，you must init first. appId " + this.f12118b + " appVersion " + this.f12121e + " appKey " + this.f12119c);
        return Boolean.FALSE;
    }

    /* renamed from: b */
    public void m11951b(Context context, String str, String str2, String str3, String str4, String str5) {
        this.f12117a = context;
        this.f12118b = str;
        this.f12119c = str2;
        this.f12121e = str3;
        this.f12122f = str4;
        this.f12123g = str5;
    }

    /* renamed from: c */
    public Boolean m11952c(String str, long j10, String str2, int i10, Object obj, Object obj2, Object obj3, Map map) {
        if (!m11950a().booleanValue()) {
            return Boolean.FALSE;
        }
        if (str == null && (str = this.f12124h) == null) {
            str = "h-adashx.ut.taobao.com";
        }
        return Boolean.valueOf(AbstractC7641b.m12649a(this, this.f12119c, this.f12117a, str, j10, str2, i10, obj, obj2, obj3, map));
    }
}
