package okhttp3;

import android.support.v4.media.AbstractC0037f;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import okio.ByteString;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.v */
/* loaded from: classes4.dex */
public final class C6334v {

    /* renamed from: a */
    public final ByteString f10280a;

    /* renamed from: b */
    public C6333u f10281b;

    /* renamed from: c */
    public final ArrayList f10282c;

    public C6334v() {
        String string = UUID.randomUUID().toString();
        AbstractC5830k.m5329f(string, "randomUUID().toString()");
        this.f10280a = ByteString.INSTANCE.encodeUtf8(string);
        this.f10281b = C6336x.f10285e;
        this.f10282c = new ArrayList();
    }

    /* renamed from: a */
    public final void m5976a(String str, C6291d0 c6291d0) {
        StringBuilder sbM97v = AbstractC0037f.m97v("form-data; name=");
        C6333u c6333u = C6336x.f10285e;
        AbstractC6326o.m5951a(sbM97v, "file");
        if (str != null) {
            sbM97v.append("; filename=");
            AbstractC6326o.m5951a(sbM97v, str);
        }
        String string = sbM97v.toString();
        AbstractC5830k.m5329f(string, "StringBuilder().apply(builderAction).toString()");
        C5834o c5834o = new C5834o(2, false);
        c5834o.m5347e(HttpHeaders.CONTENT_DISPOSITION, string);
        C6329q c6329qM5348f = c5834o.m5348f();
        if (c6329qM5348f.m5962a(HttpHeaders.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c6329qM5348f.m5962a(HttpHeaders.CONTENT_LENGTH) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        this.f10282c.add(new C6335w(c6329qM5348f, c6291d0));
    }

    /* renamed from: b */
    public final C6336x m5977b() {
        ArrayList arrayList = this.f10282c;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new C6336x(this.f10280a, this.f10281b, AbstractC6396c.m6062v(arrayList));
    }

    /* renamed from: c */
    public final void m5978c(C6333u type) {
        AbstractC5830k.m5330g(type, "type");
        if (type.f10278b.equals("multipart")) {
            this.f10281b = type;
        } else {
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }
}
