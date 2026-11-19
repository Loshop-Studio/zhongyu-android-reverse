package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class NetworkResponse implements Parcelable, Response {
    public static final Parcelable.Creator<NetworkResponse> CREATOR = new C0979c();

    /* renamed from: a */
    int f5505a;

    /* renamed from: b */
    byte[] f5506b;

    /* renamed from: c */
    private String f5507c;

    /* renamed from: d */
    private Map<String, List<String>> f5508d;

    /* renamed from: e */
    private Throwable f5509e;

    /* renamed from: f */
    private StatisticData f5510f;

    public NetworkResponse() {
    }

    public static NetworkResponse readFromParcel(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.f5505a = parcel.readInt();
            networkResponse.f5507c = parcel.readString();
            int i4 = parcel.readInt();
            if (i4 > 0) {
                byte[] bArr = new byte[i4];
                networkResponse.f5506b = bArr;
                parcel.readByteArray(bArr);
            }
            networkResponse.f5508d = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            try {
                networkResponse.f5510f = (StatisticData) parcel.readSerializable();
            } catch (Throwable unused) {
                ALog.m4639i("anet.NetworkResponse", "[readFromParcel] source.readSerializable() error", null, new Object[0]);
            }
        } catch (Exception e4) {
            ALog.m4640w("anet.NetworkResponse", "[readFromParcel]", null, e4, new Object[0]);
        }
        return networkResponse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anetwork.channel.Response
    public byte[] getBytedata() {
        return this.f5506b;
    }

    @Override // anetwork.channel.Response
    public Map<String, List<String>> getConnHeadFields() {
        return this.f5508d;
    }

    @Override // anetwork.channel.Response
    public String getDesc() {
        return this.f5507c;
    }

    @Override // anetwork.channel.Response
    public Throwable getError() {
        return this.f5509e;
    }

    @Override // anetwork.channel.Response
    public StatisticData getStatisticData() {
        return this.f5510f;
    }

    @Override // anetwork.channel.Response
    public int getStatusCode() {
        return this.f5505a;
    }

    public void setBytedata(byte[] bArr) {
        this.f5506b = bArr;
    }

    public void setConnHeadFields(Map<String, List<String>> map) {
        this.f5508d = map;
    }

    public void setDesc(String str) {
        this.f5507c = str;
    }

    public void setError(Throwable th) {
        this.f5509e = th;
    }

    public void setStatisticData(StatisticData statisticData) {
        this.f5510f = statisticData;
    }

    public void setStatusCode(int i4) {
        this.f5505a = i4;
        this.f5507c = ErrorConstant.getErrMsg(i4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse [");
        sb.append("statusCode=");
        sb.append(this.f5505a);
        sb.append(", desc=");
        sb.append(this.f5507c);
        sb.append(", connHeadFields=");
        sb.append(this.f5508d);
        sb.append(", bytedata=");
        byte[] bArr = this.f5506b;
        sb.append(bArr != null ? new String(bArr) : "");
        sb.append(", error=");
        sb.append(this.f5509e);
        sb.append(", statisticData=");
        sb.append(this.f5510f);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5505a);
        parcel.writeString(this.f5507c);
        byte[] bArr = this.f5506b;
        int length = bArr != null ? bArr.length : 0;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.f5506b);
        }
        parcel.writeMap(this.f5508d);
        StatisticData statisticData = this.f5510f;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public NetworkResponse(int i4) {
        this.f5505a = i4;
        this.f5507c = ErrorConstant.getErrMsg(i4);
    }
}
