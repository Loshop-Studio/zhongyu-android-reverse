package p159u;

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
public final class C7747n implements InterfaceC7746m {

    /* renamed from: a */
    public final BufferedSource f10242a;

    public /* synthetic */ C7747n(BufferedSource bufferedSource) {
        this.f10242a = bufferedSource;
    }

    /* renamed from: a */
    public static final /* synthetic */ C7747n m9248a(BufferedSource bufferedSource) {
        return new C7747n(bufferedSource);
    }

    /* renamed from: c */
    public static void m9249c(BufferedSource bufferedSource) {
        bufferedSource.close();
    }

    /* renamed from: h */
    public static boolean m9251h(BufferedSource bufferedSource, Object obj) {
        return (obj instanceof C7747n) && Intrinsics.areEqual(bufferedSource, ((C7747n) obj).m9256k());
    }

    /* renamed from: i */
    public static int m9252i(BufferedSource bufferedSource) {
        return bufferedSource.hashCode();
    }

    /* renamed from: j */
    public static String m9253j(BufferedSource bufferedSource) {
        return "SourceResponseBody(source=" + bufferedSource + ')';
    }

    /* renamed from: l */
    public static Object m9254l(BufferedSource bufferedSource, BufferedSink bufferedSink, Continuation continuation) {
        bufferedSource.readAll(bufferedSink);
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static Object m9255m(BufferedSource bufferedSource, FileSystem fileSystem, Path path, Continuation continuation) throws Throwable {
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

    @Override // p159u.InterfaceC7746m
    /* renamed from: b */
    public Object mo9246b(BufferedSink bufferedSink, Continuation continuation) {
        return m9254l(this.f10242a, bufferedSink, continuation);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m9249c(this.f10242a);
    }

    @Override // p159u.InterfaceC7746m
    /* renamed from: d */
    public Object mo9247d(FileSystem fileSystem, Path path, Continuation continuation) {
        return m9255m(this.f10242a, fileSystem, path, continuation);
    }

    public boolean equals(Object obj) {
        return m9251h(this.f10242a, obj);
    }

    public int hashCode() {
        return m9252i(this.f10242a);
    }

    /* renamed from: k */
    public final /* synthetic */ BufferedSource m9256k() {
        return this.f10242a;
    }

    public String toString() {
        return m9253j(this.f10242a);
    }

    /* renamed from: g */
    public static BufferedSource m9250g(BufferedSource bufferedSource) {
        return bufferedSource;
    }
}
