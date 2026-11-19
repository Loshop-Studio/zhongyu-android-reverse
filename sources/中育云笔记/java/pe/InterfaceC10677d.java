package pe;

import je.C9743w;
import je.C9745y;
import okhttp3.internal.connection.RealConnection;
import okio.Sink;
import okio.Source;

/* renamed from: pe.d */
/* loaded from: classes6.dex */
public interface InterfaceC10677d {
    /* renamed from: a */
    void mo22606a();

    /* renamed from: b */
    Sink mo22607b(C9743w c9743w, long j10);

    /* renamed from: c */
    void mo22608c(C9743w c9743w);

    void cancel();

    /* renamed from: d */
    long mo22609d(C9745y c9745y);

    /* renamed from: e */
    Source mo22610e(C9745y c9745y);

    /* renamed from: f */
    C9745y.a mo22611f(boolean z10);

    /* renamed from: g */
    void mo22612g();

    RealConnection getConnection();
}
