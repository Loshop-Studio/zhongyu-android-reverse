package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anetwork.channel.NetworkEvent;

/* loaded from: classes.dex */
public class DefaultProgressEvent implements Parcelable, NetworkEvent.ProgressEvent {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR = new C0978b();

    /* renamed from: a */
    int f5499a;

    /* renamed from: b */
    int f5500b;

    /* renamed from: c */
    int f5501c;

    /* renamed from: d */
    Object f5502d;

    /* renamed from: e */
    byte[] f5503e;

    public DefaultProgressEvent() {
    }

    public DefaultProgressEvent(int i4, int i5, int i6, byte[] bArr) {
        this.f5499a = i4;
        this.f5500b = i5;
        this.f5501c = i6;
        this.f5503e = bArr;
    }

    public static DefaultProgressEvent readFromParcel(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.f5499a = parcel.readInt();
            defaultProgressEvent.f5500b = parcel.readInt();
            defaultProgressEvent.f5501c = parcel.readInt();
            int i4 = parcel.readInt();
            if (i4 > 0) {
                byte[] bArr = new byte[i4];
                parcel.readByteArray(bArr);
                defaultProgressEvent.f5503e = bArr;
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
        return this.f5503e;
    }

    public Object getContext() {
        return this.f5502d;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public String getDesc() {
        return "";
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getIndex() {
        return this.f5499a;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getSize() {
        return this.f5500b;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getTotal() {
        return this.f5501c;
    }

    public void setContext(Object obj) {
        this.f5502d = obj;
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.f5499a + ", size=" + this.f5500b + ", total=" + this.f5501c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5499a);
        parcel.writeInt(this.f5500b);
        parcel.writeInt(this.f5501c);
        byte[] bArr = this.f5503e;
        parcel.writeInt(bArr != null ? bArr.length : 0);
        parcel.writeByteArray(this.f5503e);
    }
}
