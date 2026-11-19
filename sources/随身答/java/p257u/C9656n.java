package p257u;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* renamed from: u.n */
/* loaded from: classes3.dex */
public final class C9656n implements InterfaceC9655m {

    /* renamed from: a */
    public final BufferedSource f17002a;

    public /* synthetic */ C9656n(BufferedSource bufferedSource) {
        this.f17002a = bufferedSource;
    }

    /* renamed from: a */
    public static final /* synthetic */ C9656n m16001a(BufferedSource bufferedSource) {
        return new C9656n(bufferedSource);
    }

    /* renamed from: c */
    public static void m16002c(BufferedSource bufferedSource) throws IOException {
        bufferedSource.close();
    }

    /* renamed from: h */
    public static boolean m16004h(BufferedSource bufferedSource, Object obj) {
        return (obj instanceof C9656n) && Intrinsics.areEqual(bufferedSource, ((C9656n) obj).m16009k());
    }

    /* renamed from: i */
    public static int m16005i(BufferedSource bufferedSource) {
        return bufferedSource.hashCode();
    }

    /* renamed from: j */
    public static String m16006j(BufferedSource bufferedSource) {
        return "SourceResponseBody(source=" + bufferedSource + ')';
    }

    /* renamed from: l */
    public static Object m16007l(BufferedSource bufferedSource, BufferedSink bufferedSink, Continuation continuation) throws IOException {
        bufferedSource.readAll(bufferedSink);
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static Object m16008m(BufferedSource bufferedSource, FileSystem fileSystem, Path path, Continuation continuation) throws Throwable {
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, false));
        try {
            Boxing.boxLong(bufferedSource.readAll(bufferedSinkBuffer));
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
                    ExceptionsKt.addSuppressed(th, th3);
                }
            }
        }
        if (th == null) {
            return Unit.INSTANCE;
        }
        throw th;
    }

    @Override // p257u.InterfaceC9655m
    /* renamed from: b */
    public Object mo15999b(BufferedSink bufferedSink, Continuation continuation) {
        return m16007l(this.f17002a, bufferedSink, continuation);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        m16002c(this.f17002a);
    }

    @Override // p257u.InterfaceC9655m
    /* renamed from: d */
    public Object mo16000d(FileSystem fileSystem, Path path, Continuation continuation) {
        return m16008m(this.f17002a, fileSystem, path, continuation);
    }

    public boolean equals(Object obj) {
        return m16004h(this.f17002a, obj);
    }

    public int hashCode() {
        return m16005i(this.f17002a);
    }

    /* renamed from: k */
    public final /* synthetic */ BufferedSource m16009k() {
        return this.f17002a;
    }

    public String toString() {
        return m16006j(this.f17002a);
    }

    /* renamed from: g */
    public static BufferedSource m16003g(BufferedSource bufferedSource) {
        return bufferedSource;
    }
}
