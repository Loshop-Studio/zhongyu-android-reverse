package p253n;

import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC9979u;
import p228l.InterfaceC10085r;

/* renamed from: n.p */
/* loaded from: classes3.dex */
public final class C10286p implements InterfaceC10280j {

    /* renamed from: a */
    public final InterfaceC10085r f24479a;

    /* renamed from: b */
    public final String f24480b;

    /* renamed from: c */
    public final DataSource f24481c;

    public C10286p(InterfaceC10085r interfaceC10085r, String str, DataSource dataSource) {
        this.f24479a = interfaceC10085r;
        this.f24480b = str;
        this.f24481c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m21418a() {
        return this.f24481c;
    }

    /* renamed from: b */
    public final InterfaceC10085r m21419b() {
        return this.f24479a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10286p)) {
            return false;
        }
        C10286p c10286p = (C10286p) obj;
        return AbstractC9979u.m20289b(this.f24479a, c10286p.f24479a) && AbstractC9979u.m20289b(this.f24480b, c10286p.f24480b) && this.f24481c == c10286p.f24481c;
    }

    public int hashCode() {
        int iHashCode = this.f24479a.hashCode() * 31;
        String str = this.f24480b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f24481c.hashCode();
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.f24479a + ", mimeType=" + this.f24480b + ", dataSource=" + this.f24481c + ')';
    }
}
