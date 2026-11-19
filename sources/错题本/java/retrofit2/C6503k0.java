package retrofit2;

import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.mistake.feature.notebook.detail.C4916z4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6326o;
import okhttp3.C6286b;
import okhttp3.C6287b0;
import okhttp3.C6329q;
import okhttp3.C6330r;
import okhttp3.C6333u;
import okhttp3.C6334v;
import okhttp3.C6335w;
import okhttp3.C6336x;

/* renamed from: retrofit2.k0 */
/* loaded from: classes4.dex */
public final class C6503k0 {

    /* renamed from: l */
    public static final char[] f10709l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f10710m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f10711a;

    /* renamed from: b */
    public final C6330r f10712b;

    /* renamed from: c */
    public String f10713c;

    /* renamed from: d */
    public C4916z4 f10714d;

    /* renamed from: e */
    public final C6287b0 f10715e = new C6287b0();

    /* renamed from: f */
    public final C5834o f10716f;

    /* renamed from: g */
    public C6333u f10717g;

    /* renamed from: h */
    public final boolean f10718h;

    /* renamed from: i */
    public final C6334v f10719i;

    /* renamed from: j */
    public final C0039h f10720j;

    /* renamed from: k */
    public AbstractC6297g0 f10721k;

    public C6503k0(String str, C6330r c6330r, String str2, C6329q c6329q, C6333u c6333u, boolean z8, boolean z9, boolean z10) {
        this.f10711a = str;
        this.f10712b = c6330r;
        this.f10713c = str2;
        this.f10717g = c6333u;
        this.f10718h = z8;
        if (c6329q != null) {
            this.f10716f = c6329q.m5964c();
        } else {
            this.f10716f = new C5834o(2, false);
        }
        if (z9) {
            this.f10720j = new C0039h(20);
        } else if (z10) {
            C6334v c6334v = new C6334v();
            this.f10719i = c6334v;
            c6334v.m5978c(C6336x.f10286f);
        }
    }

    /* renamed from: a */
    public final void m6146a(String name, String str, boolean z8) {
        C0039h c0039h = this.f10720j;
        if (z8) {
            c0039h.getClass();
            AbstractC5830k.m5330g(name, "name");
            ((ArrayList) c0039h.f96b).add(C6286b.m5878b(name, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 83));
            ((ArrayList) c0039h.f97c).add(C6286b.m5878b(str, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 83));
            return;
        }
        c0039h.getClass();
        AbstractC5830k.m5330g(name, "name");
        ((ArrayList) c0039h.f96b).add(C6286b.m5878b(name, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 91));
        ((ArrayList) c0039h.f97c).add(C6286b.m5878b(str, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 91));
    }

    /* renamed from: b */
    public final void m6147b(String str, String str2, boolean z8) {
        if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                Pattern pattern = C6333u.f10275d;
                this.f10717g = AbstractC6326o.m5956f(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC0037f.m85j("Malformed content type: ", str2), e);
            }
        }
        C5834o c5834o = this.f10716f;
        if (z8) {
            c5834o.m5347e(str, str2);
        } else {
            c5834o.m5344b(str, str2);
        }
    }

    /* renamed from: c */
    public final void m6148c(C6329q c6329q, AbstractC6297g0 body) {
        C6334v c6334v = this.f10719i;
        c6334v.getClass();
        AbstractC5830k.m5330g(body, "body");
        if (c6329q.m5962a(HttpHeaders.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c6329q.m5962a(HttpHeaders.CONTENT_LENGTH) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        c6334v.f10282c.add(new C6335w(c6329q, body));
    }

    /* renamed from: d */
    public final void m6149d(String name, String str, boolean z8) {
        String str2 = this.f10713c;
        if (str2 != null) {
            C6330r c6330r = this.f10712b;
            C4916z4 c4916z4M5972f = c6330r.m5972f(str2);
            this.f10714d = c4916z4M5972f;
            if (c4916z4M5972f == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c6330r + ", Relative: " + this.f10713c);
            }
            this.f10713c = null;
        }
        if (z8) {
            C4916z4 c4916z4 = this.f10714d;
            c4916z4.getClass();
            AbstractC5830k.m5330g(name, "encodedName");
            if (c4916z4.f7435d == null) {
                c4916z4.f7435d = new ArrayList();
            }
            ArrayList arrayList = c4916z4.f7435d;
            AbstractC5830k.m5327d(arrayList);
            arrayList.add(C6286b.m5878b(name, 0, " \"'<>#&=", 0, 211));
            ArrayList arrayList2 = c4916z4.f7435d;
            AbstractC5830k.m5327d(arrayList2);
            arrayList2.add(str != null ? C6286b.m5878b(str, 0, " \"'<>#&=", 0, 211) : null);
            return;
        }
        C4916z4 c4916z42 = this.f10714d;
        c4916z42.getClass();
        AbstractC5830k.m5330g(name, "name");
        if (c4916z42.f7435d == null) {
            c4916z42.f7435d = new ArrayList();
        }
        ArrayList arrayList3 = c4916z42.f7435d;
        AbstractC5830k.m5327d(arrayList3);
        arrayList3.add(C6286b.m5878b(name, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 219));
        ArrayList arrayList4 = c4916z42.f7435d;
        AbstractC5830k.m5327d(arrayList4);
        arrayList4.add(str != null ? C6286b.m5878b(str, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 219) : null);
    }
}
