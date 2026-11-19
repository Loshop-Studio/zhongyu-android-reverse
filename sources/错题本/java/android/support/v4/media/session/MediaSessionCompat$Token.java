package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;

/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0038g(6);

    /* renamed from: a */
    public final Object f105a;

    /* renamed from: b */
    public InterfaceC0045c f106b;

    public MediaSessionCompat$Token(Object obj, InterfaceC0045c interfaceC0045c) {
        this.f105a = obj;
        this.f106b = interfaceC0045c;
    }

    /* renamed from: a */
    public static MediaSessionCompat$Token m132a(Parcelable parcelable, InterfaceC0045c interfaceC0045c) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof MediaSession.Token) {
            return new MediaSessionCompat$Token(parcelable, interfaceC0045c);
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f105a;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f105a == null;
        }
        Object obj3 = mediaSessionCompat$Token.f105a;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f105a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f105a, i);
    }
}
