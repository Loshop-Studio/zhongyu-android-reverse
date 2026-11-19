package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anetwork.channel.NetworkEvent;

/* loaded from: classes3.dex */
public class DefaultProgressEvent implements Parcelable, NetworkEvent.ProgressEvent {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR = new C5101b();

    /* renamed from: a */
    int f2777a;

    /* renamed from: b */
    int f2778b;

    /* renamed from: c */
    int f2779c;

    /* renamed from: d */
    Object f2780d;

    /* renamed from: e */
    byte[] f2781e;

    public DefaultProgressEvent() {
    }

    public static DefaultProgressEvent readFromParcel(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.f2777a = parcel.readInt();
            defaultProgressEvent.f2778b = parcel.readInt();
            defaultProgressEvent.f2779c = parcel.readInt();
            int i10 = parcel.readInt();
            if (i10 > 0) {
                byte[] bArr = new byte[i10];
                parcel.readByteArray(bArr);
                defaultProgressEvent.f2781e = bArr;
            }
        } catch (Exception unused) {
        }
        return defaultProgressEvent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public byte[] getBytedata() {
        return this.f2781e;
    }

    public Object getContext() {
        return this.f2780d;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public String getDesc() {
        return "";
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getIndex() {
        return this.f2777a;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getSize() {
        return this.f2778b;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getTotal() {
        return this.f2779c;
    }

    public void setContext(Object obj) {
        this.f2780d = obj;
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.f2777a + ", size=" + this.f2778b + ", total=" + this.f2779c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2777a);
        parcel.writeInt(this.f2778b);
        parcel.writeInt(this.f2779c);
        byte[] bArr = this.f2781e;
        parcel.writeInt(bArr != null ? bArr.length : 0);
        parcel.writeByteArray(this.f2781e);
    }

    public DefaultProgressEvent(int i10, int i11, int i12, byte[] bArr) {
        this.f2777a = i10;
        this.f2778b = i11;
        this.f2779c = i12;
        this.f2781e = bArr;
    }
}
