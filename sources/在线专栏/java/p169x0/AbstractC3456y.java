package p169x0;

import androidx.work.C0810a;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import p085f1.C2520r;

/* renamed from: x0.y */
/* loaded from: classes.dex */
public abstract class AbstractC3456y {

    /* renamed from: a */
    private UUID f12106a;

    /* renamed from: b */
    private C2520r f12107b;

    /* renamed from: c */
    private Set<String> f12108c;

    /* renamed from: x0.y$a */
    public static abstract class a<B extends a<?, ?>, W extends AbstractC3456y> {

        /* renamed from: c */
        C2520r f12111c;

        /* renamed from: e */
        Class<? extends ListenableWorker> f12113e;

        /* renamed from: a */
        boolean f12109a = false;

        /* renamed from: d */
        Set<String> f12112d = new HashSet();

        /* renamed from: b */
        UUID f12110b = UUID.randomUUID();

        a(Class<? extends ListenableWorker> cls) {
            this.f12113e = cls;
            this.f12111c = new C2520r(this.f12110b.toString(), cls.getName());
            m10546a(cls.getName());
        }

        /* renamed from: a */
        public final B m10546a(String str) {
            this.f12112d.add(str);
            return (B) mo10511d();
        }

        /* renamed from: b */
        public final W m10547b() {
            W w3 = (W) mo10510c();
            this.f12110b = UUID.randomUUID();
            C2520r c2520r = new C2520r(this.f12111c);
            this.f12111c = c2520r;
            c2520r.f10165a = this.f12110b.toString();
            return w3;
        }

        /* renamed from: c */
        abstract W mo10510c();

        /* renamed from: d */
        abstract B mo10511d();

        /* renamed from: e */
        public final B m10548e(C0810a c0810a) {
            this.f12111c.f10169e = c0810a;
            return (B) mo10511d();
        }
    }

    protected AbstractC3456y(UUID uuid, C2520r c2520r, Set<String> set) {
        this.f12106a = uuid;
        this.f12107b = c2520r;
        this.f12108c = set;
    }

    /* renamed from: a */
    public UUID m10542a() {
        return this.f12106a;
    }

    /* renamed from: b */
    public String m10543b() {
        return this.f12106a.toString();
    }

    /* renamed from: c */
    public Set<String> m10544c() {
        return this.f12108c;
    }

    /* renamed from: d */
    public C2520r m10545d() {
        return this.f12107b;
    }
}
