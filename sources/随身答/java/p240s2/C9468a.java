package p240s2;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6783b;
import p154k2.AbstractC8263a;
import p310z2.AbstractC9993d;

/* renamed from: s2.a */
/* loaded from: classes4.dex */
public class C9468a {

    /* renamed from: a */
    public Context f16506a;

    /* renamed from: b */
    public String f16507b;

    /* renamed from: c */
    public String f16508c;

    /* renamed from: d */
    public String f16509d;

    /* renamed from: e */
    public String f16510e;

    /* renamed from: s2.a$b */
    public static class b {

        /* renamed from: a */
        public static final C9468a f16511a = new C9468a();
    }

    /* renamed from: a */
    public static Context m15646a() {
        return b.f16511a.f16506a;
    }

    /* renamed from: b */
    public static Context m15647b(Context context) {
        if (b.f16511a.f16506a == null && context != null) {
            b.f16511a.f16506a = context.getApplicationContext();
        }
        return b.f16511a.f16506a;
    }

    /* renamed from: e */
    public static C9468a m15648e(Context context) {
        if (b.f16511a.f16506a == null && context != null) {
            b.f16511a.f16506a = context;
        }
        return b.f16511a;
    }

    /* renamed from: c */
    public String m15649c() {
        if (TextUtils.isEmpty(this.f16510e)) {
            this.f16510e = AbstractC9993d.m17320e(this.f16506a);
        }
        return this.f16510e;
    }

    /* renamed from: d */
    public String m15650d() {
        if (TextUtils.isEmpty(this.f16507b)) {
            this.f16507b = AbstractC8263a.f14359e;
        }
        return this.f16507b;
    }

    /* renamed from: f */
    public String m15651f(Context context) {
        if (TextUtils.isEmpty(this.f16509d)) {
            if (context != null) {
                Context context2 = b.f16511a.f16506a;
                if (context2 != null) {
                    this.f16509d = AbstractC6783b.m6282c(context2);
                } else {
                    this.f16509d = AbstractC6783b.m6282c(context);
                }
            } else {
                this.f16509d = AbstractC6783b.m6282c(b.f16511a.f16506a);
            }
        }
        return this.f16509d;
    }

    public String toString() {
        if (b.f16511a.f16506a == null) {
            return "uninitialized.";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append("appkey:" + this.f16507b + ",");
        sb.append("channel:" + this.f16508c + ",");
        sb.append("procName:" + this.f16509d + "]");
        return sb.toString();
    }

    public C9468a() {
        this.f16509d = "";
    }
}
