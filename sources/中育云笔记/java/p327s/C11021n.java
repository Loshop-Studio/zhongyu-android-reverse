package p327s;

import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p309qc.AbstractC10771b;
import p309qc.C10786q;
import p409xc.AbstractC11826a;
import vc.InterfaceC11588c;

/* renamed from: s.n */
/* loaded from: classes3.dex */
public final class C11021n implements InterfaceC11020m {

    /* renamed from: c */
    public final BufferedSource f26598c;

    public /* synthetic */ C11021n(BufferedSource bufferedSource) {
        this.f26598c = bufferedSource;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11021n m24346a(BufferedSource bufferedSource) {
        return new C11021n(bufferedSource);
    }

    /* renamed from: c */
    public static void m24347c(BufferedSource bufferedSource) {
        bufferedSource.close();
    }

    /* renamed from: e */
    public static boolean m24349e(BufferedSource bufferedSource, Object obj) {
        return (obj instanceof C11021n) && AbstractC9979u.m20289b(bufferedSource, ((C11021n) obj).m24354i());
    }

    /* renamed from: f */
    public static int m24350f(BufferedSource bufferedSource) {
        return bufferedSource.hashCode();
    }

    /* renamed from: g */
    public static String m24351g(BufferedSource bufferedSource) {
        return "SourceResponseBody(source=" + bufferedSource + ')';
    }

    /* renamed from: j */
    public static Object m24352j(BufferedSource bufferedSource, BufferedSink bufferedSink, InterfaceC11588c interfaceC11588c) {
        bufferedSource.readAll(bufferedSink);
        return C10786q.f26013a;
    }

    /* renamed from: k */
    public static Object m24353k(BufferedSource bufferedSource, FileSystem fileSystem, Path path, InterfaceC11588c interfaceC11588c) throws Throwable {
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, false));
        try {
            AbstractC11826a.m26209d(bufferedSource.readAll(bufferedSinkBuffer));
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                th = null;
            }
        } catch (Throwable th2) {
            th = th2;
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    AbstractC10771b.m22973a(th, th3);
                }
            }
        }
        if (th == null) {
            return C10786q.f26013a;
        }
        throw th;
    }

    @Override // p327s.InterfaceC11020m
    /* renamed from: b */
    public Object mo24344b(FileSystem fileSystem, Path path, InterfaceC11588c interfaceC11588c) {
        return m24353k(this.f26598c, fileSystem, path, interfaceC11588c);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m24347c(this.f26598c);
    }

    public boolean equals(Object obj) {
        return m24349e(this.f26598c, obj);
    }

    @Override // p327s.InterfaceC11020m
    /* renamed from: h */
    public Object mo24345h(BufferedSink bufferedSink, InterfaceC11588c interfaceC11588c) {
        return m24352j(this.f26598c, bufferedSink, interfaceC11588c);
    }

    public int hashCode() {
        return m24350f(this.f26598c);
    }

    /* renamed from: i */
    public final /* synthetic */ BufferedSource m24354i() {
        return this.f26598c;
    }

    public String toString() {
        return m24351g(this.f26598c);
    }

    /* renamed from: d */
    public static BufferedSource m24348d(BufferedSource bufferedSource) {
        return bufferedSource;
    }
}
