package coil3.network;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.network.k */
/* loaded from: classes2.dex */
public final class C3322k {

    /* renamed from: b */
    public static final C3322k f2018b = new C3322k(AbstractC5785e0.m5156J(new LinkedHashMap()));

    /* renamed from: a */
    public final Map f2019a;

    public C3322k(Map map) {
        this.f2019a = map;
    }

    /* renamed from: a */
    public final String m2259a() {
        String lowerCase = HttpHeaders.CONTENT_TYPE.toLowerCase(Locale.ROOT);
        AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
        List list = (List) this.f2019a.get(lowerCase);
        if (list != null) {
            return (String) AbstractC5805t.m5236p0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3322k) && AbstractC5830k.m5325b(this.f2019a, ((C3322k) obj).f2019a);
    }

    public final int hashCode() {
        return this.f2019a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.f2019a + ')';
    }
}
