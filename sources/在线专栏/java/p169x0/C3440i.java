package p169x0;

import android.app.Notification;

/* renamed from: x0.i */
/* loaded from: classes.dex */
public final class C3440i {

    /* renamed from: a */
    private final int f12068a;

    /* renamed from: b */
    private final int f12069b;

    /* renamed from: c */
    private final Notification f12070c;

    public C3440i(int i4, Notification notification, int i5) {
        this.f12068a = i4;
        this.f12070c = notification;
        this.f12069b = i5;
    }

    /* renamed from: a */
    public int m10493a() {
        return this.f12069b;
    }

    /* renamed from: b */
    public Notification m10494b() {
        return this.f12070c;
    }

    /* renamed from: c */
    public int m10495c() {
        return this.f12068a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3440i.class != obj.getClass()) {
            return false;
        }
        C3440i c3440i = (C3440i) obj;
        if (this.f12068a == c3440i.f12068a && this.f12069b == c3440i.f12069b) {
            return this.f12070c.equals(c3440i.f12070c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f12068a * 31) + this.f12069b) * 31) + this.f12070c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f12068a + ", mForegroundServiceType=" + this.f12069b + ", mNotification=" + this.f12070c + '}';
    }
}
