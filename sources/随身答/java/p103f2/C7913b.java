package p103f2;

import android.text.TextUtils;
import p092e2.AbstractC7839a;

/* renamed from: f2.b */
/* loaded from: classes4.dex */
public class C7913b extends AbstractC7912a {

    /* renamed from: g */
    public C7916e f13332g;

    /* renamed from: h */
    public Object f13333h;

    public C7913b(String str, String str2) {
        super(str, str2);
        this.f13333h = new Object();
    }

    @Override // p103f2.AbstractC7912a
    /* renamed from: h */
    public void mo12455h() {
        if (TextUtils.isEmpty(this.f13328c)) {
            return;
        }
        synchronized (this.f13333h) {
            this.f13332g = null;
            this.f13332g = new C7916e(false, this.f13328c);
        }
    }

    @Override // p103f2.AbstractC7912a
    /* renamed from: l */
    public void mo12459l(boolean z9) {
        AbstractC7839a.f13170g = z9;
    }

    /* renamed from: m */
    public boolean m12460m(String str) {
        boolean zM12462a;
        if (TextUtils.isEmpty(this.f13328c)) {
            return false;
        }
        synchronized (this.f13333h) {
            try {
                if (this.f13332g == null) {
                    this.f13332g = new C7916e(false, this.f13328c);
                }
                zM12462a = this.f13332g.m12462a(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM12462a;
    }
}
