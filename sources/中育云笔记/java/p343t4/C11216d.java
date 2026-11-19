package p343t4;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p317r4.AbstractC10843f;
import p317r4.C10839b;
import p332s4.AbstractC11057a;
import p332s4.InterfaceC11059c;

/* renamed from: t4.d */
/* loaded from: classes5.dex */
public class C11216d extends AbstractC11057a {

    /* renamed from: c */
    public final Context f26906c;

    /* renamed from: d */
    public final String f26907d;

    /* renamed from: e */
    public volatile InterfaceC11059c f26908e;

    /* renamed from: f */
    public final Object f26909f = new Object();

    /* renamed from: g */
    public C10839b f26910g = C10839b.f26148b;

    /* renamed from: h */
    public final Map f26911h = new HashMap();

    /* renamed from: i */
    public volatile C11218f f26912i;

    public C11216d(Context context, String str) {
        this.f26906c = context;
        this.f26907d = str;
    }

    /* renamed from: d */
    public static String m24945d(String str) {
        int i10 = 0;
        if (str.length() > 0) {
            while (str.charAt(i10) == '/') {
                i10++;
            }
        }
        return '/' + str.substring(i10);
    }

    @Override // p317r4.InterfaceC10841d
    /* renamed from: a */
    public C10839b mo23327a() {
        if (this.f26910g == null) {
            this.f26910g = C10839b.f26148b;
        }
        C10839b c10839b = this.f26910g;
        C10839b c10839b2 = C10839b.f26148b;
        if (c10839b == c10839b2 && this.f26908e == null) {
            m24946e();
        }
        C10839b c10839b3 = this.f26910g;
        return c10839b3 == null ? c10839b2 : c10839b3;
    }

    /* renamed from: e */
    public final void m24946e() {
        if (this.f26908e == null) {
            synchronized (this.f26909f) {
                try {
                    if (this.f26908e == null) {
                        this.f26908e = new C11226n(this.f26906c, this.f26907d);
                        this.f26912i = new C11218f(this.f26908e);
                    }
                    m24948g();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: f */
    public final String m24947f(String str) {
        AbstractC10843f.a aVar;
        Map mapM23330a = AbstractC10843f.m23330a();
        if (mapM23330a.containsKey(str) && (aVar = (AbstractC10843f.a) mapM23330a.get(str)) != null) {
            return aVar.mo23332a(this);
        }
        return null;
    }

    /* renamed from: g */
    public final void m24948g() {
        if (this.f26910g == C10839b.f26148b) {
            if (this.f26908e != null) {
                this.f26910g = AbstractC11214b.m24939f(this.f26908e.getString("/region", null), this.f26908e.getString("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
    }

    @Override // p317r4.InterfaceC10841d
    public Context getContext() {
        return this.f26906c;
    }

    @Override // p317r4.InterfaceC10841d
    public String getIdentifier() {
        return "DEFAULT_INSTANCE";
    }

    @Override // p317r4.InterfaceC10841d
    public String getString(String str) {
        return m24949h(str, null);
    }

    /* renamed from: h */
    public String m24949h(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("path must not be null.");
        }
        if (this.f26908e == null) {
            m24946e();
        }
        String strM24945d = m24945d(str);
        String str3 = (String) this.f26911h.get(strM24945d);
        if (str3 != null) {
            return str3;
        }
        String strM24947f = m24947f(strM24945d);
        if (strM24947f != null) {
            return strM24947f;
        }
        String string = this.f26908e.getString(strM24945d, str2);
        return C11218f.m24958c(string) ? this.f26912i.mo24515a(string, str2) : string;
    }
}
