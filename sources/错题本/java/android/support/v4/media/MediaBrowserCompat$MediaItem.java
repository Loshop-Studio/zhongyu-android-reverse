package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0038g(0);

    /* renamed from: a */
    public final int f70a;

    /* renamed from: b */
    public final MediaDescriptionCompat f71b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Flags {
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f70a = parcel.readInt();
        this.f71b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f70a + ", mDescription=" + this.f71b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f70a);
        this.f71b.writeToParcel(parcel, i);
    }
}
