package p149s0;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: s0.b */
/* loaded from: classes.dex */
public interface InterfaceC3371b extends Closeable {
    /* renamed from: A */
    void mo3501A();

    /* renamed from: D */
    Cursor mo3502D(InterfaceC3374e interfaceC3374e);

    /* renamed from: E */
    Cursor mo3503E(InterfaceC3374e interfaceC3374e, CancellationSignal cancellationSignal);

    /* renamed from: H */
    Cursor mo3504H(String str);

    /* renamed from: e */
    void mo3505e();

    /* renamed from: f */
    void mo3506f();

    /* renamed from: g */
    List<Pair<String, String>> mo3507g();

    String getPath();

    /* renamed from: h */
    void mo3508h(String str) throws SQLException;

    boolean isOpen();

    /* renamed from: j */
    InterfaceC3375f mo3509j(String str);

    /* renamed from: p */
    boolean mo3510p();

    /* renamed from: v */
    boolean mo3512v();

    /* renamed from: x */
    void mo3513x();

    /* renamed from: z */
    void mo3514z(String str, Object[] objArr) throws SQLException;
}
