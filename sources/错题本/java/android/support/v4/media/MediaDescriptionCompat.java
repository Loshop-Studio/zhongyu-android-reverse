package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0038g(1);

    /* renamed from: a */
    public final String f72a;

    /* renamed from: b */
    public final CharSequence f73b;

    /* renamed from: c */
    public final CharSequence f74c;

    /* renamed from: d */
    public final CharSequence f75d;

    /* renamed from: e */
    public final Bitmap f76e;

    /* renamed from: f */
    public final Uri f77f;

    /* renamed from: g */
    public final Bundle f78g;

    /* renamed from: h */
    public final Uri f79h;

    /* renamed from: i */
    public Object f80i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f72a = str;
        this.f73b = charSequence;
        this.f74c = charSequence2;
        this.f75d = charSequence3;
        this.f76e = bitmap;
        this.f77f = uri;
        this.f78g = bundle;
        this.f79h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f73b) + ", " + ((Object) this.f74c) + ", " + ((Object) this.f75d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.f80i;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f72a);
            builder.setTitle(this.f73b);
            builder.setSubtitle(this.f74c);
            builder.setDescription(this.f75d);
            builder.setIconBitmap(this.f76e);
            builder.setIconUri(this.f77f);
            builder.setExtras(this.f78g);
            builder.setMediaUri(this.f79h);
            objBuild = builder.build();
            this.f80i = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
