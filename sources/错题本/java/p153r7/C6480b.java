package p153r7;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC5830k;
import p139p7.AbstractC6396c;
import p185v7.AbstractC6683l;

/* renamed from: r7.b */
/* loaded from: classes4.dex */
public final class C6480b {

    /* renamed from: a */
    public final C6481c f10650a;

    /* renamed from: b */
    public final String f10651b;

    /* renamed from: c */
    public boolean f10652c;

    /* renamed from: d */
    public AbstractC6479a f10653d;

    /* renamed from: e */
    public final ArrayList f10654e;

    /* renamed from: f */
    public boolean f10655f;

    public C6480b(C6481c c6481c, String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f10650a = c6481c;
        this.f10651b = name;
        this.f10654e = new ArrayList();
    }

    /* renamed from: a */
    public final boolean m6128a() {
        AbstractC6479a abstractC6479a = this.f10653d;
        if (abstractC6479a != null && abstractC6479a.f10647b) {
            this.f10655f = true;
        }
        ArrayList arrayList = this.f10654e;
        boolean z8 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC6479a) arrayList.get(size)).f10647b) {
                AbstractC6479a abstractC6479a2 = (AbstractC6479a) arrayList.get(size);
                if (C6481c.f10657i.isLoggable(Level.FINE)) {
                    AbstractC6683l.m6361a(abstractC6479a2, this, "canceled");
                }
                arrayList.remove(size);
                z8 = true;
            }
        }
        return z8;
    }

    /* renamed from: b */
    public final void m6129b(AbstractC6479a task, long j7) {
        AbstractC5830k.m5330g(task, "task");
        synchronized (this.f10650a) {
            if (!this.f10652c) {
                if (m6130c(task, j7, false)) {
                    this.f10650a.m6135d(this);
                }
            } else if (task.f10647b) {
                if (C6481c.f10657i.isLoggable(Level.FINE)) {
                    AbstractC6683l.m6361a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C6481c.f10657i.isLoggable(Level.FINE)) {
                    AbstractC6683l.m6361a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6130c(p153r7.AbstractC6479a r11, long r12, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r11, r0)
            r7.b r0 = r11.f10648c
            if (r0 != r10) goto La
            goto Le
        La:
            if (r0 != 0) goto L89
            r11.f10648c = r10
        Le:
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.f10654e
            int r5 = r4.indexOf(r11)
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L37
            long r8 = r11.f10649d
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L34
            java.util.logging.Logger r12 = p153r7.C6481c.f10657i
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L88
            java.lang.String r12 = "already scheduled"
            p185v7.AbstractC6683l.m6361a(r11, r10, r12)
            return r7
        L34:
            r4.remove(r5)
        L37:
            r11.f10649d = r2
            java.util.logging.Logger r5 = p153r7.C6481c.f10657i
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L5f
            if (r14 == 0) goto L51
            long r2 = r2 - r0
            java.lang.String r14 = p185v7.AbstractC6683l.m6372l(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = r2.concat(r14)
            goto L5c
        L51:
            long r2 = r2 - r0
            java.lang.String r14 = p185v7.AbstractC6683l.m6372l(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = r2.concat(r14)
        L5c:
            p185v7.AbstractC6683l.m6361a(r11, r10, r14)
        L5f:
            int r14 = r4.size()
            r2 = r7
            r3 = r2
        L65:
            if (r3 >= r14) goto L7a
            java.lang.Object r5 = r4.get(r3)
            int r3 = r3 + 1
            r7.a r5 = (p153r7.AbstractC6479a) r5
            long r8 = r5.f10649d
            long r8 = r8 - r0
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L77
            goto L7b
        L77:
            int r2 = r2 + 1
            goto L65
        L7a:
            r2 = r6
        L7b:
            if (r2 != r6) goto L81
            int r2 = r4.size()
        L81:
            r4.add(r2, r11)
            if (r2 != 0) goto L88
            r11 = 1
            return r11
        L88:
            return r7
        L89:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p153r7.C6480b.m6130c(r7.a, long, boolean):boolean");
    }

    /* renamed from: d */
    public final void m6131d() {
        byte[] bArr = AbstractC6396c.f10486a;
        synchronized (this.f10650a) {
            this.f10652c = true;
            if (m6128a()) {
                this.f10650a.m6135d(this);
            }
        }
    }

    public final String toString() {
        return this.f10651b;
    }
}
