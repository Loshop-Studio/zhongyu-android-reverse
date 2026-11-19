package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* renamed from: androidx.media.e */
/* loaded from: classes.dex */
public final class C0541e {

    /* renamed from: a */
    InterfaceC0542f f3580a;

    public C0541e(String str, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3580a = new C0543g(str, i4, i5);
        } else {
            this.f3580a = new C0544h(str, i4, i5);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0541e) {
            return this.f3580a.equals(((C0541e) obj).f3580a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3580a.hashCode();
    }

    public C0541e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f3580a = new C0543g(remoteUserInfo);
    }
}
