package okhttp3.internal.connection;

import android.support.v4.media.AbstractC0037f;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5830k;
import p139p7.AbstractC6396c;
import p153r7.C6480b;
import p153r7.C6481c;
import p185v7.C6685n;

/* renamed from: okhttp3.internal.connection.m */
/* loaded from: classes4.dex */
public final class C6314m {

    /* renamed from: a */
    public final long f10184a;

    /* renamed from: b */
    public final C6480b f10185b;

    /* renamed from: c */
    public final C6313l f10186c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue f10187d;

    public C6314m(C6481c taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC5830k.m5330g(taskRunner, "taskRunner");
        AbstractC5830k.m5330g(timeUnit, "timeUnit");
        this.f10184a = timeUnit.toNanos(5L);
        this.f10185b = taskRunner.m6136e();
        this.f10186c = new C6313l(this, AbstractC0037f.m91p(new StringBuilder(), AbstractC6396c.f10493h, " ConnectionPool"));
        this.f10187d = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5933a(okhttp3.C6284a r6, okhttp3.internal.connection.C6310i r7, java.util.ArrayList r8, boolean r9) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.f10187d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.k r1 = (okhttp3.internal.connection.C6312k) r1
            java.lang.String r3 = "connection"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r3)
            monitor-enter(r1)
            r3 = 1
            if (r9 == 0) goto L26
            u7.o r4 = r1.f10171g     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L21
            r2 = r3
        L21:
            if (r2 == 0) goto L31
            goto L26
        L24:
            r6 = move-exception
            goto L33
        L26:
            boolean r2 = r1.m5927h(r6, r8)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L31
            r7.m5911e(r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            return r3
        L31:
            monitor-exit(r1)
            goto L6
        L33:
            monitor-exit(r1)
            throw r6
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C6314m.m5933a(okhttp3.a, okhttp3.internal.connection.i, java.util.ArrayList, boolean):boolean");
    }

    /* renamed from: b */
    public final int m5934b(C6312k c6312k, long j7) {
        byte[] bArr = AbstractC6396c.f10486a;
        ArrayList arrayList = c6312k.f10180p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c6312k.f10166b.f10256a.f10050i + " was leaked. Did you forget to close a response body?";
                C6685n c6685n = C6685n.f11276a;
                C6685n.f11276a.mo6338j(((C6308g) reference).f10147a, str);
                arrayList.remove(i);
                c6312k.f10174j = true;
                if (arrayList.isEmpty()) {
                    c6312k.f10181q = j7 - this.f10184a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
