package p318r5;

import java.util.ArrayList;
import java.util.UUID;

/* renamed from: r5.z */
/* loaded from: classes5.dex */
public class C10907z {

    /* renamed from: a */
    public String f26339a;

    /* renamed from: b */
    public String f26340b;

    /* renamed from: c */
    public String f26341c;

    /* renamed from: d */
    public String f26342d;

    /* renamed from: e */
    public long f26343e;

    public C10907z(String str, String str2, String str3, String str4, long j10) {
        this.f26339a = str;
        this.f26340b = str2;
        this.f26341c = str3;
        this.f26342d = str4;
        this.f26343e = j10;
    }

    /* renamed from: a */
    public void m23740a() {
        AbstractC10861f1.m23436h("StreamEventHandler", "Begin to handle stream events...");
        C10859f c10859f = new C10859f();
        c10859f.m23416e(this.f26341c);
        c10859f.m23420i(this.f26340b);
        c10859f.m23413b(this.f26342d);
        c10859f.m23418g(String.valueOf(this.f26343e));
        if ("oper".equals(this.f26340b) && AbstractC10882m1.m23559i(this.f26339a, "oper")) {
            C10894s0 c10894s0M23516b = C10876k1.m23513c().m23516b(this.f26339a, this.f26343e);
            String strM23615a = c10894s0M23516b.m23615a();
            Boolean boolValueOf = Boolean.valueOf(c10894s0M23516b.m23617f());
            c10859f.m23422k(strM23615a);
            c10859f.m23421j(String.valueOf(boolValueOf));
        }
        String strReplace = UUID.randomUUID().toString().replace("-", "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c10859f);
        new C10866h0(this.f26339a, this.f26340b, AbstractC10900v0.m23678m(), arrayList, strReplace).m23465b();
    }
}
