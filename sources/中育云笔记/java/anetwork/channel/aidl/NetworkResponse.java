package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class NetworkResponse implements Parcelable, Response {
    public static final Parcelable.Creator<NetworkResponse> CREATOR = new C5102c();

    /* renamed from: a */
    int f2783a;

    /* renamed from: b */
    byte[] f2784b;

    /* renamed from: c */
    private String f2785c;

    /* renamed from: d */
    private Map<String, List<String>> f2786d;

    /* renamed from: e */
    private Throwable f2787e;

    /* renamed from: f */
    private StatisticData f2788f;

    public NetworkResponse() {
    }

    public static NetworkResponse readFromParcel(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.f2783a = parcel.readInt();
            networkResponse.f2785c = parcel.readString();
            int i10 = parcel.readInt();
            if (i10 > 0) {
                byte[] bArr = new byte[i10];
                networkResponse.f2784b = bArr;
                parcel.readByteArray(bArr);
            }
            networkResponse.f2786d = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            try {
                networkResponse.f2788f = (StatisticData) parcel.readSerializable();
            } catch (Throwable unused) {
                ALog.m2530i("anet.NetworkResponse", "[readFromParcel] source.readSerializable() error", null, new Object[0]);
            }
        } catch (Exception e10) {
            ALog.m2531w("anet.NetworkResponse", "[readFromParcel]", null, e10, new Object[0]);
        }
        return networkResponse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anetwork.channel.Response
    public byte[] getBytedata() {
        return this.f2784b;
    }

    @Override // anetwork.channel.Response
    public Map<String, List<String>> getConnHeadFields() {
        return this.f2786d;
    }

    @Override // anetwork.channel.Response
    public String getDesc() {
        return this.f2785c;
    }

    @Override // anetwork.channel.Response
    public Throwable getError() {
        return this.f2787e;
    }

    @Override // anetwork.channel.Response
    public StatisticData getStatisticData() {
        return this.f2788f;
    }

    @Override // anetwork.channel.Response
    public int getStatusCode() {
        return this.f2783a;
    }

    public void setBytedata(byte[] bArr) {
        this.f2784b = bArr;
    }

    public void setConnHeadFields(Map<String, List<String>> map) {
        this.f2786d = map;
    }

    public void setDesc(String str) {
        this.f2785c = str;
    }

    public void setError(Throwable th) {
        this.f2787e = th;
    }

    public void setStatisticData(StatisticData statisticData) {
        this.f2788f = statisticData;
    }

    public void setStatusCode(int i10) {
        this.f2783a = i10;
        this.f2785c = ErrorConstant.getErrMsg(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkResponse [");
        sb2.append("statusCode=");
        sb2.append(this.f2783a);
        sb2.append(", desc=");
        sb2.append(this.f2785c);
        sb2.append(", connHeadFields=");
        sb2.append(this.f2786d);
        sb2.append(", bytedata=");
        byte[] bArr = this.f2784b;
        sb2.append(bArr != null ? new String(bArr) : "");
        sb2.append(", error=");
        sb2.append(this.f2787e);
        sb2.append(", statisticData=");
        sb2.append(this.f2788f);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2783a);
        parcel.writeString(this.f2785c);
        byte[] bArr = this.f2784b;
        int length = bArr != null ? bArr.length : 0;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.f2784b);
        }
        parcel.writeMap(this.f2786d);
        StatisticData statisticData = this.f2788f;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public NetworkResponse(int i10) {
        this.f2783a = i10;
        this.f2785c = ErrorConstant.getErrMsg(i10);
    }
}
