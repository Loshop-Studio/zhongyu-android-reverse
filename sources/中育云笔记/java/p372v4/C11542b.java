package p372v4;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.core.p068a.C7219c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p317r4.AbstractC10840c;
import p317r4.AbstractC10843f;
import p317r4.C10839b;
import p317r4.InterfaceC10841d;
import p332s4.AbstractC11057a;
import p343t4.C11215c;

/* renamed from: v4.b */
/* loaded from: classes5.dex */
public class C11542b extends AbstractC10840c {

    /* renamed from: d */
    public static List f27408d;

    /* renamed from: e */
    public static final Map f27409e = new HashMap();

    /* renamed from: f */
    public static String f27410f;

    /* renamed from: a */
    public final InterfaceC10841d f27411a;

    /* renamed from: b */
    public final C11543c f27412b;

    /* renamed from: c */
    public final C11543c f27413c;

    /* renamed from: v4.b$a */
    public static class a implements AbstractC10843f.a {
        @Override // p317r4.AbstractC10843f.a
        /* renamed from: a */
        public String mo23332a(InterfaceC10841d interfaceC10841d) {
            String str;
            if (interfaceC10841d.mo23327a().equals(C10839b.f26149c)) {
                str = "/agcgw_all/CN";
            } else if (interfaceC10841d.mo23327a().equals(C10839b.f26151e)) {
                str = "/agcgw_all/RU";
            } else if (interfaceC10841d.mo23327a().equals(C10839b.f26150d)) {
                str = "/agcgw_all/DE";
            } else {
                if (!interfaceC10841d.mo23327a().equals(C10839b.f26152f)) {
                    return null;
                }
                str = "/agcgw_all/SG";
            }
            return interfaceC10841d.getString(str);
        }
    }

    /* renamed from: v4.b$b */
    public static class b implements AbstractC10843f.a {
        @Override // p317r4.AbstractC10843f.a
        /* renamed from: a */
        public String mo23332a(InterfaceC10841d interfaceC10841d) {
            String str;
            if (interfaceC10841d.mo23327a().equals(C10839b.f26149c)) {
                str = "/agcgw_all/CN_back";
            } else if (interfaceC10841d.mo23327a().equals(C10839b.f26151e)) {
                str = "/agcgw_all/RU_back";
            } else if (interfaceC10841d.mo23327a().equals(C10839b.f26150d)) {
                str = "/agcgw_all/DE_back";
            } else {
                if (!interfaceC10841d.mo23327a().equals(C10839b.f26152f)) {
                    return null;
                }
                str = "/agcgw_all/SG_back";
            }
            return interfaceC10841d.getString(str);
        }
    }

    public C11542b(InterfaceC10841d interfaceC10841d) {
        this.f27411a = interfaceC10841d;
        if (f27408d == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        this.f27412b = new C11543c(f27408d, interfaceC10841d.getContext());
        C11543c c11543c = new C11543c(null, interfaceC10841d.getContext());
        this.f27413c = c11543c;
        if (interfaceC10841d instanceof C11215c) {
            c11543c.m25401a(((C11215c) interfaceC10841d).m24942c(), interfaceC10841d.getContext());
        }
    }

    /* renamed from: f */
    public static AbstractC10840c m25394f() {
        String str = f27410f;
        return str == null ? m25395g("DEFAULT_INSTANCE") : m25395g(str);
    }

    /* renamed from: g */
    public static synchronized AbstractC10840c m25395g(String str) {
        AbstractC10840c abstractC10840c;
        try {
            abstractC10840c = (AbstractC10840c) f27409e.get(str);
            if (abstractC10840c == null) {
                if ("DEFAULT_INSTANCE".equals(str)) {
                    Log.w("AGC_Instance", "please call `initialize()` first");
                } else {
                    Log.w("AGC_Instance", "not find instance for : " + str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC10840c;
    }

    /* renamed from: h */
    public static AbstractC10840c m25396h(InterfaceC10841d interfaceC10841d) {
        return m25397i(interfaceC10841d, false);
    }

    /* renamed from: i */
    public static synchronized AbstractC10840c m25397i(InterfaceC10841d interfaceC10841d, boolean z10) {
        AbstractC10840c c11542b;
        Map map = f27409e;
        c11542b = (AbstractC10840c) map.get(interfaceC10841d.getIdentifier());
        if (c11542b == null || z10) {
            c11542b = new C11542b(interfaceC10841d);
            map.put(interfaceC10841d.getIdentifier(), c11542b);
        }
        return c11542b;
    }

    /* renamed from: j */
    public static synchronized void m25398j(Context context) {
        Log.w("AGC_Instance", "agc sdk initialize");
        if (f27409e.size() > 0) {
            Log.w("AGC_Instance", "Repeated invoking initialize");
        } else {
            m25399k(context, AbstractC11057a.m24512b(context));
        }
    }

    /* renamed from: k */
    public static synchronized void m25399k(Context context, InterfaceC10841d interfaceC10841d) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                Log.w("AGC_Instance", "context.getApplicationContext null");
            } else {
                context = applicationContext;
            }
            m25400l();
            if (f27408d == null) {
                f27408d = new C7219c(context).m8219a();
            }
            m25397i(interfaceC10841d, true);
            f27410f = interfaceC10841d.getIdentifier();
            Log.i("AGC_Instance", "initFinish callback start");
            C11541a.m25393a();
            Log.i("AGC_Instance", "AGC SDK initialize end");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: l */
    public static void m25400l() {
        AbstractC10843f.m23331b("/agcgw/url", new a());
        AbstractC10843f.m23331b("/agcgw/backurl", new b());
    }

    @Override // p317r4.AbstractC10840c
    /* renamed from: b */
    public Context mo23325b() {
        return this.f27411a.getContext();
    }

    @Override // p317r4.AbstractC10840c
    /* renamed from: d */
    public InterfaceC10841d mo23326d() {
        return this.f27411a;
    }
}
