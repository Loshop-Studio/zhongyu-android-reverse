package p090g1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p085f1.InterfaceC2504b;
import p085f1.InterfaceC2521s;
import p169x0.C3453v;
import p169x0.InterfaceC3448q;
import p173y0.C3488c;
import p173y0.C3491f;
import p173y0.C3494i;
import p173y0.InterfaceC3490e;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2629a implements Runnable {

    /* renamed from: a */
    private final C3488c f10397a = new C3488c();

    /* renamed from: g1.a$a */
    class a extends AbstractRunnableC2629a {

        /* renamed from: b */
        final /* synthetic */ C3494i f10398b;

        /* renamed from: c */
        final /* synthetic */ UUID f10399c;

        a(C3494i c3494i, UUID uuid) {
            this.f10398b = c3494i;
            this.f10399c = uuid;
        }

        @Override // p090g1.AbstractRunnableC2629a
        /* renamed from: i */
        void mo8819i() {
            WorkDatabase workDatabaseM10613s = this.f10398b.m10613s();
            workDatabaseM10613s.m3542e();
            try {
                m8816a(this.f10398b, this.f10399c.toString());
                workDatabaseM10613s.m3539A();
                workDatabaseM10613s.m3546i();
                m8818h(this.f10398b);
            } catch (Throwable th) {
                workDatabaseM10613s.m3546i();
                throw th;
            }
        }
    }

    /* renamed from: g1.a$b */
    class b extends AbstractRunnableC2629a {

        /* renamed from: b */
        final /* synthetic */ C3494i f10400b;

        /* renamed from: c */
        final /* synthetic */ String f10401c;

        b(C3494i c3494i, String str) {
            this.f10400b = c3494i;
            this.f10401c = str;
        }

        @Override // p090g1.AbstractRunnableC2629a
        /* renamed from: i */
        void mo8819i() {
            WorkDatabase workDatabaseM10613s = this.f10400b.m10613s();
            workDatabaseM10613s.m3542e();
            try {
                Iterator<String> it = workDatabaseM10613s.mo4171M().mo8467o(this.f10401c).iterator();
                while (it.hasNext()) {
                    m8816a(this.f10400b, it.next());
                }
                workDatabaseM10613s.m3539A();
                workDatabaseM10613s.m3546i();
                m8818h(this.f10400b);
            } catch (Throwable th) {
                workDatabaseM10613s.m3546i();
                throw th;
            }
        }
    }

    /* renamed from: g1.a$c */
    class c extends AbstractRunnableC2629a {

        /* renamed from: b */
        final /* synthetic */ C3494i f10402b;

        /* renamed from: c */
        final /* synthetic */ String f10403c;

        /* renamed from: d */
        final /* synthetic */ boolean f10404d;

        c(C3494i c3494i, String str, boolean z3) {
            this.f10402b = c3494i;
            this.f10403c = str;
            this.f10404d = z3;
        }

        @Override // p090g1.AbstractRunnableC2629a
        /* renamed from: i */
        void mo8819i() {
            WorkDatabase workDatabaseM10613s = this.f10402b.m10613s();
            workDatabaseM10613s.m3542e();
            try {
                Iterator<String> it = workDatabaseM10613s.mo4171M().mo8457e(this.f10403c).iterator();
                while (it.hasNext()) {
                    m8816a(this.f10402b, it.next());
                }
                workDatabaseM10613s.m3539A();
                workDatabaseM10613s.m3546i();
                if (this.f10404d) {
                    m8818h(this.f10402b);
                }
            } catch (Throwable th) {
                workDatabaseM10613s.m3546i();
                throw th;
            }
        }
    }

    /* renamed from: g1.a$d */
    class d extends AbstractRunnableC2629a {

        /* renamed from: b */
        final /* synthetic */ C3494i f10405b;

        d(C3494i c3494i) {
            this.f10405b = c3494i;
        }

        @Override // p090g1.AbstractRunnableC2629a
        /* renamed from: i */
        void mo8819i() {
            WorkDatabase workDatabaseM10613s = this.f10405b.m10613s();
            workDatabaseM10613s.m3542e();
            try {
                Iterator<String> it = workDatabaseM10613s.mo4171M().mo8455c().iterator();
                while (it.hasNext()) {
                    m8816a(this.f10405b, it.next());
                }
                new C2634f(this.f10405b.m10613s()).m8837c(System.currentTimeMillis());
                workDatabaseM10613s.m3539A();
            } finally {
                workDatabaseM10613s.m3546i();
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC2629a m8811b(C3494i c3494i) {
        return new d(c3494i);
    }

    /* renamed from: c */
    public static AbstractRunnableC2629a m8812c(UUID uuid, C3494i c3494i) {
        return new a(c3494i, uuid);
    }

    /* renamed from: d */
    public static AbstractRunnableC2629a m8813d(String str, C3494i c3494i, boolean z3) {
        return new c(c3494i, str, z3);
    }

    /* renamed from: e */
    public static AbstractRunnableC2629a m8814e(String str, C3494i c3494i) {
        return new b(c3494i, str);
    }

    /* renamed from: g */
    private void m8815g(WorkDatabase workDatabase, String str) {
        InterfaceC2521s interfaceC2521sMo4171M = workDatabase.mo4171M();
        InterfaceC2504b interfaceC2504bMo4165D = workDatabase.mo4165D();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C3453v.a aVarMo8461i = interfaceC2521sMo4171M.mo8461i(str2);
            if (aVarMo8461i != C3453v.a.SUCCEEDED && aVarMo8461i != C3453v.a.FAILED) {
                interfaceC2521sMo4171M.mo8459g(C3453v.a.CANCELLED, str2);
            }
            linkedList.addAll(interfaceC2504bMo4165D.mo8427d(str2));
        }
    }

    /* renamed from: a */
    void m8816a(C3494i c3494i, String str) {
        m8815g(c3494i.m10613s(), str);
        c3494i.m10610p().m10572l(str);
        Iterator<InterfaceC3490e> it = c3494i.m10612r().iterator();
        while (it.hasNext()) {
            it.next().mo56b(str);
        }
    }

    /* renamed from: f */
    public InterfaceC3448q m8817f() {
        return this.f10397a;
    }

    /* renamed from: h */
    void m8818h(C3494i c3494i) {
        C3491f.m10576b(c3494i.m10608l(), c3494i.m10613s(), c3494i.m10612r());
    }

    /* renamed from: i */
    abstract void mo8819i();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo8819i();
            this.f10397a.m10562b(InterfaceC3448q.f12081a);
        } catch (Throwable th) {
            this.f10397a.m10562b(new InterfaceC3448q.b.a(th));
        }
    }
}
