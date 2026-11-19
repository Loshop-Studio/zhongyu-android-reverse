package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.InterfaceC3867n;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.r */
/* loaded from: classes2.dex */
public final class C5581r extends AbstractC3869p {

    /* renamed from: b */
    public static final C5577p f8658b = new C5577p(new C5581r(ToNumberPolicy.LAZILY_PARSED_NUMBER), 0);

    /* renamed from: a */
    public final InterfaceC3867n f8659a;

    public C5581r(InterfaceC3867n interfaceC3867n) {
        this.f8659a = interfaceC3867n;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        JsonToken jsonTokenM5764x = c6046a.m5764x();
        int i = AbstractC5579q.f8657a[jsonTokenM5764x.ordinal()];
        if (i == 1) {
            c6046a.m5760t();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f8659a.readNumber(c6046a);
        }
        throw new JsonSyntaxException("Expecting number, got: " + jsonTokenM5764x + "; at path " + c6046a.m5750h(false));
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        c6047b.m5782r((Number) obj);
    }
}
