package p087j1;

import java.sql.Date;
import java.sql.Timestamp;
import p087j1.C5732a;
import p087j1.C5733b;

/* renamed from: j1.f */
/* loaded from: classes2.dex */
public abstract class AbstractC5737f {

    /* renamed from: a */
    public static final boolean f9072a;

    /* renamed from: b */
    public static final C5736e f9073b;

    /* renamed from: c */
    public static final C5736e f9074c;

    /* renamed from: d */
    public static final C5732a.a f9075d;

    /* renamed from: e */
    public static final C5733b.a f9076e;

    /* renamed from: f */
    public static final C5734c f9077f;

    static {
        boolean z8;
        try {
            Class.forName("java.sql.Date");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        f9072a = z8;
        if (z8) {
            f9073b = new C5736e(Date.class, 0);
            f9074c = new C5736e(Timestamp.class, 1);
            f9075d = C5732a.f9065b;
            f9076e = C5733b.f9067b;
            f9077f = C5735d.f9069b;
            return;
        }
        f9073b = null;
        f9074c = null;
        f9075d = null;
        f9076e = null;
        f9077f = null;
    }
}
