package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ParcelableHeader implements Parcelable {
    public static Parcelable.Creator<ParcelableHeader> CREATOR = new C5103d();
    public Map<String, List<String>> header;
    public int responseCode;

    public ParcelableHeader(int i10, Map<String, List<String>> map) {
        this.header = map;
        this.responseCode = i10;
    }

    /* renamed from: a */
    public static ParcelableHeader m2558a(Parcel parcel) {
        ParcelableHeader parcelableHeader = new ParcelableHeader();
        try {
            if (parcel.readInt() == 1) {
                parcelableHeader.header = parcel.readHashMap(ParcelableHeader.class.getClassLoader());
            }
            parcelableHeader.responseCode = parcel.readInt();
            return parcelableHeader;
        } catch (Throwable th) {
            ALog.m2528e("anet.ParcelableHeader", "[readFromParcel]", null, th, new Object[0]);
            return parcelableHeader;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, List<String>> getHeader() {
        return this.header;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String toString() {
        return "ParcelableResponseHeader [responseCode=" + this.responseCode + ", header=" + this.header + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (this.header != null) {
            parcel.writeInt(1);
            parcel.writeMap(this.header);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.responseCode);
    }

    public ParcelableHeader() {
    }
}
