package androidx.media;

import android.media.session.MediaSessionManager;
import p011b0.C1020c;

/* renamed from: androidx.media.g */
/* loaded from: classes.dex */
final class C0543g implements InterfaceC0542f {

    /* renamed from: a */
    final MediaSessionManager.RemoteUserInfo f3581a;

    C0543g(String str, int i4, int i5) {
        this.f3581a = new MediaSessionManager.RemoteUserInfo(str, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0543g) {
            return this.f3581a.equals(((C0543g) obj).f3581a);
        }
        return false;
    }

    public int hashCode() {
        return C1020c.m4774b(this.f3581a);
    }

    C0543g(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f3581a = remoteUserInfo;
    }
}
