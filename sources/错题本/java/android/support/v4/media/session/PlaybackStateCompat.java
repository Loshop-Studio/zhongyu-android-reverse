package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0038g;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0038g(8);

    /* renamed from: a */
    public final int f112a;

    /* renamed from: b */
    public final long f113b;

    /* renamed from: c */
    public final long f114c;

    /* renamed from: d */
    public final float f115d;

    /* renamed from: e */
    public final long f116e;

    /* renamed from: f */
    public final int f117f;

    /* renamed from: g */
    public final CharSequence f118g;

    /* renamed from: h */
    public final long f119h;

    /* renamed from: i */
    public final ArrayList f120i;

    /* renamed from: j */
    public final long f121j;

    /* renamed from: k */
    public final Bundle f122k;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Actions {
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0049g();

        /* renamed from: a */
        public final String f123a;

        /* renamed from: b */
        public final CharSequence f124b;

        /* renamed from: c */
        public final int f125c;

        /* renamed from: d */
        public final Bundle f126d;

        public CustomAction(Parcel parcel) {
            this.f123a = parcel.readString();
            this.f124b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f125c = parcel.readInt();
            this.f126d = parcel.readBundle(AbstractC0048f.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f124b) + ", mIcon=" + this.f125c + ", mExtras=" + this.f126d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f123a);
            TextUtils.writeToParcel(this.f124b, parcel, i);
            parcel.writeInt(this.f125c);
            parcel.writeBundle(this.f126d);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f112a = parcel.readInt();
        this.f113b = parcel.readLong();
        this.f115d = parcel.readFloat();
        this.f119h = parcel.readLong();
        this.f114c = parcel.readLong();
        this.f116e = parcel.readLong();
        this.f118g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f120i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f121j = parcel.readLong();
        this.f122k = parcel.readBundle(AbstractC0048f.class.getClassLoader());
        this.f117f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f112a);
        sb.append(", position=");
        sb.append(this.f113b);
        sb.append(", buffered position=");
        sb.append(this.f114c);
        sb.append(", speed=");
        sb.append(this.f115d);
        sb.append(", updated=");
        sb.append(this.f119h);
        sb.append(", actions=");
        sb.append(this.f116e);
        sb.append(", error code=");
        sb.append(this.f117f);
        sb.append(", error message=");
        sb.append(this.f118g);
        sb.append(", custom actions=");
        sb.append(this.f120i);
        sb.append(", active item id=");
        return AbstractC0037f.m83h(this.f121j, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f112a);
        parcel.writeLong(this.f113b);
        parcel.writeFloat(this.f115d);
        parcel.writeLong(this.f119h);
        parcel.writeLong(this.f114c);
        parcel.writeLong(this.f116e);
        TextUtils.writeToParcel(this.f118g, parcel, i);
        parcel.writeTypedList(this.f120i);
        parcel.writeLong(this.f121j);
        parcel.writeBundle(this.f122k);
        parcel.writeInt(this.f117f);
    }
}
