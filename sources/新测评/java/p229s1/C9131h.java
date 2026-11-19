package p229s1;

import android.content.Context;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.exception.SQLiteException;
import java.io.IOException;
import p218r1.AbstractC8999c;

/* renamed from: s1.h */
/* loaded from: classes4.dex */
public class C9131h implements InterfaceC9132i {

    /* renamed from: a */
    public final C9128e f15859a;

    /* renamed from: b */
    public final C9130g f15860b;

    public C9131h(Context context) {
        C9128e c9128e = new C9128e(context.getApplicationContext());
        this.f15859a = c9128e;
        this.f15860b = new C9130g(c9128e.m15491h(), c9128e.m15489f(), c9128e.m15490g());
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: a */
    public void mo15506a(C9126c c9126c, int i10, long j10) throws IOException {
        this.f15860b.mo15506a(c9126c, i10, j10);
        this.f15859a.m15496o(c9126c, i10, c9126c.m15468c(i10).m15458c());
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: b */
    public boolean mo15499b(C9126c c9126c) {
        boolean zMo15499b = this.f15860b.mo15499b(c9126c);
        this.f15859a.m15498q(c9126c);
        String strM15472g = c9126c.m15472g();
        AbstractC8999c.m15125i("BreakpointStoreOnSQLite", "update " + c9126c);
        if (c9126c.m15480o() && strM15472g != null) {
            this.f15859a.m15497p(c9126c.m15477l(), strM15472g);
        }
        return zMo15499b;
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: c */
    public C9126c mo15500c(C6327a c6327a) throws SQLiteException {
        C9126c c9126cMo15500c = this.f15860b.mo15500c(c6327a);
        this.f15859a.m15488a(c9126cMo15500c);
        return c9126cMo15500c;
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: d */
    public C9126c mo15501d(C6327a c6327a, C9126c c9126c) {
        return this.f15860b.mo15501d(c6327a, c9126c);
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: e */
    public boolean mo15502e(int i10) {
        return this.f15860b.mo15502e(i10);
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: f */
    public int mo15503f(C6327a c6327a) {
        return this.f15860b.mo15503f(c6327a);
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: g */
    public void mo15507g(int i10) {
        this.f15860b.mo15507g(i10);
    }

    @Override // p229s1.InterfaceC9129f
    public C9126c get(int i10) {
        return this.f15860b.get(i10);
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: h */
    public void mo15508h(int i10, EndCause endCause, Exception exc) {
        this.f15860b.mo15508h(i10, endCause, exc);
        if (endCause == EndCause.COMPLETED) {
            this.f15859a.m15495l(i10);
        }
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: i */
    public String mo15504i(String str) {
        return this.f15860b.mo15504i(str);
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: j */
    public boolean mo15509j(int i10) {
        if (!this.f15860b.mo15509j(i10)) {
            return false;
        }
        this.f15859a.m15493j(i10);
        return true;
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: k */
    public C9126c mo15510k(int i10) {
        return null;
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: l */
    public boolean mo15505l() {
        return false;
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: m */
    public boolean mo15511m(int i10) {
        if (!this.f15860b.mo15511m(i10)) {
            return false;
        }
        this.f15859a.m15492i(i10);
        return true;
    }

    @Override // p229s1.InterfaceC9129f
    public void remove(int i10) {
        this.f15860b.remove(i10);
        this.f15859a.m15495l(i10);
    }
}
