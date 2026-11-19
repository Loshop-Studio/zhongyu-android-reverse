package p229r1;

import android.content.Context;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.exception.SQLiteException;
import java.io.IOException;
import p219q1.AbstractC9353c;

/* renamed from: r1.h */
/* loaded from: classes4.dex */
public class C9424h implements InterfaceC9425i {

    /* renamed from: a */
    public final C9421e f16446a;

    /* renamed from: b */
    public final C9423g f16447b;

    public C9424h(Context context) {
        C9421e c9421e = new C9421e(context.getApplicationContext());
        this.f16446a = c9421e;
        this.f16447b = new C9423g(c9421e.m15545h(), c9421e.m15543c(), c9421e.m15544g());
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: a */
    public C9419c mo15553a(C6593a c6593a) throws SQLiteException {
        C9419c c9419cMo15553a = this.f16447b.mo15553a(c6593a);
        this.f16446a.m15542a(c9419cMo15553a);
        return c9419cMo15553a;
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: b */
    public boolean mo15554b(int i9) {
        return this.f16447b.mo15554b(i9);
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: c */
    public int mo15555c(C6593a c6593a) {
        return this.f16447b.mo15555c(c6593a);
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: d */
    public void mo15560d(int i9) {
        this.f16447b.mo15560d(i9);
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: e */
    public C9419c mo15556e(C6593a c6593a, C9419c c9419c) {
        return this.f16447b.mo15556e(c6593a, c9419c);
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: f */
    public void mo15561f(int i9, EndCause endCause, Exception exc) {
        this.f16447b.mo15561f(i9, endCause, exc);
        if (endCause == EndCause.COMPLETED) {
            this.f16446a.m15549l(i9);
        }
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: g */
    public String mo15557g(String str) {
        return this.f16447b.mo15557g(str);
    }

    @Override // p229r1.InterfaceC9422f
    public C9419c get(int i9) {
        return this.f16447b.get(i9);
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: h */
    public boolean mo15562h(int i9) {
        if (!this.f16447b.mo15562h(i9)) {
            return false;
        }
        this.f16446a.m15547j(i9);
        return true;
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: i */
    public C9419c mo15563i(int i9) {
        return null;
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: j */
    public void mo15564j(C9419c c9419c, int i9, long j9) throws IOException {
        this.f16447b.mo15564j(c9419c, i9, j9);
        this.f16446a.m15550o(c9419c, i9, c9419c.m15522c(i9).m15512c());
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: k */
    public boolean mo15558k(C9419c c9419c) {
        boolean zMo15558k = this.f16447b.mo15558k(c9419c);
        this.f16446a.m15552q(c9419c);
        String strM15526g = c9419c.m15526g();
        AbstractC9353c.m15306i("BreakpointStoreOnSQLite", "update " + c9419c);
        if (c9419c.m15534o() && strM15526g != null) {
            this.f16446a.m15551p(c9419c.m15531l(), strM15526g);
        }
        return zMo15558k;
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: l */
    public boolean mo15559l() {
        return false;
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: m */
    public boolean mo15565m(int i9) {
        if (!this.f16447b.mo15565m(i9)) {
            return false;
        }
        this.f16446a.m15546i(i9);
        return true;
    }

    @Override // p229r1.InterfaceC9422f
    public void remove(int i9) {
        this.f16447b.remove(i9);
        this.f16446a.m15549l(i9);
    }
}
