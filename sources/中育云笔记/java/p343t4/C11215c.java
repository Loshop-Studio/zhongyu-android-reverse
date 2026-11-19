package p343t4;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p317r4.AbstractC10843f;
import p317r4.C10839b;
import p317r4.InterfaceC10841d;
import p332s4.InterfaceC11059c;

/* renamed from: t4.c */
/* loaded from: classes5.dex */
public class C11215c implements InterfaceC10841d {

    /* renamed from: a */
    public final String f26897a;

    /* renamed from: b */
    public final Context f26898b;

    /* renamed from: c */
    public final String f26899c;

    /* renamed from: d */
    public final C10839b f26900d;

    /* renamed from: e */
    public final InterfaceC11059c f26901e;

    /* renamed from: f */
    public final C11218f f26902f;

    /* renamed from: g */
    public final Map f26903g;

    /* renamed from: h */
    public final List f26904h;

    /* renamed from: i */
    public final Map f26905i = new HashMap();

    public C11215c(Context context, String str, C10839b c10839b, InputStream inputStream, Map map, List list, String str2) throws IOException {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f26898b = context;
        str = str == null ? context.getPackageName() : str;
        this.f26899c = str;
        if (inputStream != null) {
            this.f26901e = new C11222j(inputStream, str);
            AbstractC11214b.m24934a(inputStream);
        } else {
            this.f26901e = new C11226n(context, str);
        }
        this.f26902f = new C11218f(this.f26901e);
        C10839b c10839b2 = C10839b.f26148b;
        if (c10839b != c10839b2 && "1.0".equals(this.f26901e.getString("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.f26900d = (c10839b == null || c10839b == c10839b2) ? AbstractC11214b.m24939f(this.f26901e.getString("/region", null), this.f26901e.getString("/agcgw/url", null)) : c10839b;
        this.f26903g = AbstractC11214b.m24937d(map);
        this.f26904h = list;
        this.f26897a = str2 == null ? m24943d() : str2;
    }

    /* renamed from: b */
    private String m24941b(String str) {
        Map mapM23330a = AbstractC10843f.m23330a();
        if (!mapM23330a.containsKey(str)) {
            return null;
        }
        if (this.f26905i.containsKey(str)) {
            return (String) this.f26905i.get(str);
        }
        AbstractC10843f.a aVar = (AbstractC10843f.a) mapM23330a.get(str);
        if (aVar == null) {
            return null;
        }
        String strMo23332a = aVar.mo23332a(this);
        this.f26905i.put(str, strMo23332a);
        return strMo23332a;
    }

    @Override // p317r4.InterfaceC10841d
    /* renamed from: a */
    public C10839b mo23327a() {
        C10839b c10839b = this.f26900d;
        return c10839b == null ? C10839b.f26148b : c10839b;
    }

    /* renamed from: c */
    public List m24942c() {
        return this.f26904h;
    }

    /* renamed from: d */
    public final String m24943d() {
        return String.valueOf(("{packageName='" + this.f26899c + "', routePolicy=" + this.f26900d + ", reader=" + this.f26901e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.f26903g).toString().hashCode() + '}').hashCode());
    }

    /* renamed from: e */
    public String m24944e(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String strM24938e = AbstractC11214b.m24938e(str);
        String str3 = (String) this.f26903g.get(strM24938e);
        if (str3 != null) {
            return str3;
        }
        String strM24941b = m24941b(strM24938e);
        if (strM24941b != null) {
            return strM24941b;
        }
        String string = this.f26901e.getString(strM24938e, str2);
        return C11218f.m24958c(string) ? this.f26902f.mo24515a(string, str2) : string;
    }

    @Override // p317r4.InterfaceC10841d
    public Context getContext() {
        return this.f26898b;
    }

    @Override // p317r4.InterfaceC10841d
    public String getIdentifier() {
        return this.f26897a;
    }

    @Override // p317r4.InterfaceC10841d
    public String getString(String str) {
        return m24944e(str, null);
    }
}
