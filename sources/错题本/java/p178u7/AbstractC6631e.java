package p178u7;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import okio.ByteString;

/* renamed from: u7.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6631e {

    /* renamed from: a */
    public static final C6627b[] f11117a;

    /* renamed from: b */
    public static final Map f11118b;

    static {
        C6627b c6627b = new C6627b("", C6627b.f11096i);
        ByteString byteString = C6627b.f11093f;
        C6627b c6627b2 = new C6627b("GET", byteString);
        C6627b c6627b3 = new C6627b("POST", byteString);
        ByteString byteString2 = C6627b.f11094g;
        C6627b c6627b4 = new C6627b("/", byteString2);
        C6627b c6627b5 = new C6627b("/index.html", byteString2);
        ByteString byteString3 = C6627b.f11095h;
        C6627b c6627b6 = new C6627b("http", byteString3);
        C6627b c6627b7 = new C6627b("https", byteString3);
        ByteString byteString4 = C6627b.f11092e;
        C6627b[] c6627bArr = {c6627b, c6627b2, c6627b3, c6627b4, c6627b5, c6627b6, c6627b7, new C6627b("200", byteString4), new C6627b("204", byteString4), new C6627b("206", byteString4), new C6627b("304", byteString4), new C6627b("400", byteString4), new C6627b("404", byteString4), new C6627b("500", byteString4), new C6627b("accept-charset", ""), new C6627b("accept-encoding", "gzip, deflate"), new C6627b("accept-language", ""), new C6627b("accept-ranges", ""), new C6627b("accept", ""), new C6627b("access-control-allow-origin", ""), new C6627b("age", ""), new C6627b("allow", ""), new C6627b("authorization", ""), new C6627b("cache-control", ""), new C6627b("content-disposition", ""), new C6627b("content-encoding", ""), new C6627b("content-language", ""), new C6627b("content-length", ""), new C6627b("content-location", ""), new C6627b("content-range", ""), new C6627b("content-type", ""), new C6627b("cookie", ""), new C6627b("date", ""), new C6627b("etag", ""), new C6627b("expect", ""), new C6627b("expires", ""), new C6627b(TypedValues.TransitionType.S_FROM, ""), new C6627b("host", ""), new C6627b("if-match", ""), new C6627b("if-modified-since", ""), new C6627b("if-none-match", ""), new C6627b("if-range", ""), new C6627b("if-unmodified-since", ""), new C6627b("last-modified", ""), new C6627b("link", ""), new C6627b(RequestParameters.SUBRESOURCE_LOCATION, ""), new C6627b("max-forwards", ""), new C6627b("proxy-authenticate", ""), new C6627b("proxy-authorization", ""), new C6627b("range", ""), new C6627b(RequestParameters.SUBRESOURCE_REFERER, ""), new C6627b("refresh", ""), new C6627b("retry-after", ""), new C6627b("server", ""), new C6627b("set-cookie", ""), new C6627b("strict-transport-security", ""), new C6627b("transfer-encoding", ""), new C6627b("user-agent", ""), new C6627b("vary", ""), new C6627b("via", ""), new C6627b("www-authenticate", "")};
        f11117a = c6627bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c6627bArr[i].f11097a)) {
                linkedHashMap.put(c6627bArr[i].f11097a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC5830k.m5329f(mapUnmodifiableMap, "unmodifiableMap(result)");
        f11118b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public static void m6275a(ByteString name) {
        AbstractC5830k.m5330g(name, "name");
        int size = name.size();
        for (int i = 0; i < size; i++) {
            byte b6 = name.getByte(i);
            if (65 <= b6 && b6 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
    }
}
