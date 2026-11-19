package p093h;

import java.util.concurrent.Executor;

/* renamed from: h.a */
/* loaded from: classes.dex */
public class C2650a extends AbstractC2652c {

    /* renamed from: c */
    private static volatile C2650a f10472c;

    /* renamed from: d */
    private static final Executor f10473d = new a();

    /* renamed from: e */
    private static final Executor f10474e = new b();

    /* renamed from: a */
    private AbstractC2652c f10475a;

    /* renamed from: b */
    private AbstractC2652c f10476b;

    /* renamed from: h.a$a */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2650a.m8861f().mo8864d(runnable);
        }
    }

    /* renamed from: h.a$b */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2650a.m8861f().mo8862a(runnable);
        }
    }

    private C2650a() {
        C2651b c2651b = new C2651b();
        this.f10476b = c2651b;
        this.f10475a = c2651b;
    }

    /* renamed from: e */
    public static Executor m8860e() {
        return f10474e;
    }

    /* renamed from: f */
    public static C2650a m8861f() {
        if (f10472c != null) {
            return f10472c;
        }
        synchronized (C2650a.class) {
            if (f10472c == null) {
                f10472c = new C2650a();
            }
        }
        return f10472c;
    }

    @Override // p093h.AbstractC2652c
    /* renamed from: a */
    public void mo8862a(Runnable runnable) {
        this.f10475a.mo8862a(runnable);
    }

    @Override // p093h.AbstractC2652c
    /* renamed from: c */
    public boolean mo8863c() {
        return this.f10475a.mo8863c();
    }

    @Override // p093h.AbstractC2652c
    /* renamed from: d */
    public void mo8864d(Runnable runnable) {
        this.f10475a.mo8864d(runnable);
    }
}
