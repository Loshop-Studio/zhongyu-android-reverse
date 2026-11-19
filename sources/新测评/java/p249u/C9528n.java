package p249u;

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
public final class C9528n implements InterfaceC9527m {

    /* renamed from: a */
    public final BufferedSource f16632a;

    public /* synthetic */ C9528n(BufferedSource bufferedSource) {
        this.f16632a = bufferedSource;
    }

    /* renamed from: a */
    public static final /* synthetic */ C9528n m15898a(BufferedSource bufferedSource) {
        return new C9528n(bufferedSource);
    }

    /* renamed from: f */
    public static void m15899f(BufferedSource bufferedSource) throws IOException {
        bufferedSource.close();
    }

    /* renamed from: h */
    public static boolean m15901h(BufferedSource bufferedSource, Object obj) {
        return (obj instanceof C9528n) && Intrinsics.areEqual(bufferedSource, ((C9528n) obj).m15906k());
    }

    /* renamed from: i */
    public static int m15902i(BufferedSource bufferedSource) {
        return bufferedSource.hashCode();
    }

    /* renamed from: j */
    public static String m15903j(BufferedSource bufferedSource) {
        return "SourceResponseBody(source=" + bufferedSource + ')';
    }

    /* renamed from: l */
    public static Object m15904l(BufferedSource bufferedSource, BufferedSink bufferedSink, Continuation continuation) throws IOException {
        bufferedSource.readAll(bufferedSink);
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static Object m15905m(BufferedSource bufferedSource, FileSystem fileSystem, Path path, Continuation continuation) throws Throwable {
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

    @Override // p249u.InterfaceC9527m
    /* renamed from: b */
    public Object mo15896b(BufferedSink bufferedSink, Continuation continuation) {
        return m15904l(this.f16632a, bufferedSink, continuation);
    }

    @Override // p249u.InterfaceC9527m
    /* renamed from: c */
    public Object mo15897c(FileSystem fileSystem, Path path, Continuation continuation) {
        return m15905m(this.f16632a, fileSystem, path, continuation);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        m15899f(this.f16632a);
    }

    public boolean equals(Object obj) {
        return m15901h(this.f16632a, obj);
    }

    public int hashCode() {
        return m15902i(this.f16632a);
    }

    /* renamed from: k */
    public final /* synthetic */ BufferedSource m15906k() {
        return this.f16632a;
    }

    public String toString() {
        return m15903j(this.f16632a);
    }

    /* renamed from: g */
    public static BufferedSource m15900g(BufferedSource bufferedSource) {
        return bufferedSource;
    }
}
