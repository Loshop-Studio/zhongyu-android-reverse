package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ErrorConstant;
import anetwork.channel.NetworkEvent;
import anetwork.channel.statist.StatisticData;

/* loaded from: classes.dex */
public class DefaultFinishEvent implements Parcelable, NetworkEvent.FinishEvent {
    public static final Parcelable.Creator<DefaultFinishEvent> CREATOR = new C0971a();

    /* renamed from: a */
    Object f5494a;

    /* renamed from: b */
    int f5495b;

    /* renamed from: c */
    String f5496c;

    /* renamed from: d */
    StatisticData f5497d;
    public final Request request;

    /* renamed from: rs */
    public final RequestStatistic f5498rs;

    public DefaultFinishEvent(int i4) {
        this(i4, null, null, null);
    }

    /* renamed from: a */
    static DefaultFinishEvent m4664a(Parcel parcel) {
        DefaultFinishEvent defaultFinishEvent = new DefaultFinishEvent(0);
        try {
            defaultFinishEvent.f5495b = parcel.readInt();
            defaultFinishEvent.f5496c = parcel.readString();
            defaultFinishEvent.f5497d = (StatisticData) parcel.readSerializable();
        } catch (Throwable unused) {
        }
        return defaultFinishEvent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getContext() {
        return this.f5494a;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public String getDesc() {
        return this.f5496c;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public int getHttpCode() {
        return this.f5495b;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public StatisticData getStatisticData() {
        return this.f5497d;
    }

    public void setContext(Object obj) {
        this.f5494a = obj;
    }

    public String toString() {
        return "DefaultFinishEvent [code=" + this.f5495b + ", desc=" + this.f5496c + ", context=" + this.f5494a + ", statisticData=" + this.f5497d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5495b);
        parcel.writeString(this.f5496c);
        StatisticData statisticData = this.f5497d;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public DefaultFinishEvent(int i4, String str, RequestStatistic requestStatistic) {
        this(i4, str, null, requestStatistic);
    }

    public DefaultFinishEvent(int i4, String str, Request request) {
        this(i4, str, request, request != null ? request.f5223a : null);
    }

    private DefaultFinishEvent(int i4, String str, Request request, RequestStatistic requestStatistic) {
        this.f5497d = new StatisticData();
        this.f5495b = i4;
        this.f5496c = str == null ? ErrorConstant.getErrMsg(i4) : str;
        this.request = request;
        this.f5498rs = requestStatistic;
    }
}
