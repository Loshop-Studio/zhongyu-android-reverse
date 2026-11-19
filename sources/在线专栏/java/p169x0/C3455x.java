package p169x0;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p169x0.C3453v;

/* renamed from: x0.x */
/* loaded from: classes.dex */
public final class C3455x {

    /* renamed from: a */
    private final List<UUID> f12098a;

    /* renamed from: b */
    private final List<String> f12099b;

    /* renamed from: c */
    private final List<String> f12100c;

    /* renamed from: d */
    private final List<C3453v.a> f12101d;

    /* renamed from: x0.x$a */
    public static final class a {

        /* renamed from: a */
        List<UUID> f12102a = new ArrayList();

        /* renamed from: b */
        List<String> f12103b = new ArrayList();

        /* renamed from: c */
        List<String> f12104c = new ArrayList();

        /* renamed from: d */
        List<C3453v.a> f12105d = new ArrayList();

        private a() {
        }

        @SuppressLint({"BuilderSetStyle"})
        /* renamed from: f */
        public static a m10536f(List<UUID> list) {
            a aVar = new a();
            aVar.m10537a(list);
            return aVar;
        }

        /* renamed from: a */
        public a m10537a(List<UUID> list) {
            this.f12102a.addAll(list);
            return this;
        }

        /* renamed from: b */
        public a m10538b(List<C3453v.a> list) {
            this.f12105d.addAll(list);
            return this;
        }

        /* renamed from: c */
        public a m10539c(List<String> list) {
            this.f12104c.addAll(list);
            return this;
        }

        /* renamed from: d */
        public a m10540d(List<String> list) {
            this.f12103b.addAll(list);
            return this;
        }

        /* renamed from: e */
        public C3455x m10541e() {
            if (this.f12102a.isEmpty() && this.f12103b.isEmpty() && this.f12104c.isEmpty() && this.f12105d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new C3455x(this);
        }
    }

    C3455x(a aVar) {
        this.f12098a = aVar.f12102a;
        this.f12099b = aVar.f12103b;
        this.f12100c = aVar.f12104c;
        this.f12101d = aVar.f12105d;
    }

    /* renamed from: a */
    public List<UUID> m10532a() {
        return this.f12098a;
    }

    /* renamed from: b */
    public List<C3453v.a> m10533b() {
        return this.f12101d;
    }

    /* renamed from: c */
    public List<String> m10534c() {
        return this.f12100c;
    }

    /* renamed from: d */
    public List<String> m10535d() {
        return this.f12099b;
    }
}
