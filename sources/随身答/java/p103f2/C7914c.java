package p103f2;

import android.text.TextUtils;
import p092e2.AbstractC7839a;

/* renamed from: f2.c */
/* loaded from: classes4.dex */
public class C7914c extends AbstractC7912a {

    /* renamed from: g */
    public C7916e f13334g;

    /* renamed from: h */
    public Object f13335h;

    public C7914c(String str, String str2) {
        super(str, str2);
        this.f13335h = new Object();
    }

    @Override // p103f2.AbstractC7912a
    /* renamed from: h */
    public void mo12455h() {
        if (TextUtils.isEmpty(this.f13328c)) {
            return;
        }
        synchronized (this.f13335h) {
            this.f13334g = null;
            this.f13334g = new C7916e(true, this.f13328c);
        }
    }

    @Override // p103f2.AbstractC7912a
    /* renamed from: l */
    public void mo12459l(boolean z9) {
        AbstractC7839a.f13171h = z9;
    }

    /* renamed from: m */
    public boolean m12461m(String str) {
        boolean zM12462a;
        if (TextUtils.isEmpty(this.f13328c)) {
            return true;
        }
        synchronized (this.f13335h) {
            try {
                if (this.f13334g == null) {
                    this.f13334g = new C7916e(true, this.f13328c);
                }
                zM12462a = this.f13334g.m12462a(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM12462a;
    }
}
