package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0038g;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0038g(4);

    /* renamed from: a */
    public final MediaDescriptionCompat f102a;

    /* renamed from: b */
    public final long f103b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f102a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f103b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f102a);
        sb.append(", Id=");
        return AbstractC0037f.m83h(this.f103b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f102a.writeToParcel(parcel, i);
        parcel.writeLong(this.f103b);
    }
}
