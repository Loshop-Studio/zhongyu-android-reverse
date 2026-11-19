package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ErrorConstant;
import anetwork.channel.NetworkEvent;
import anetwork.channel.statist.StatisticData;

/* loaded from: classes3.dex */
public class DefaultFinishEvent implements Parcelable, NetworkEvent.FinishEvent {
    public static final Parcelable.Creator<DefaultFinishEvent> CREATOR = new C5094a();

    /* renamed from: a */
    Object f2772a;

    /* renamed from: b */
    int f2773b;

    /* renamed from: c */
    String f2774c;

    /* renamed from: d */
    StatisticData f2775d;
    public final Request request;

    /* renamed from: rs */
    public final RequestStatistic f2776rs;

    public DefaultFinishEvent(int i10) {
        this(i10, null, null, null);
    }

    /* renamed from: a */
    public static DefaultFinishEvent m2555a(Parcel parcel) {
        DefaultFinishEvent defaultFinishEvent = new DefaultFinishEvent(0);
        try {
            defaultFinishEvent.f2773b = parcel.readInt();
            defaultFinishEvent.f2774c = parcel.readString();
            defaultFinishEvent.f2775d = (StatisticData) parcel.readSerializable();
        } catch (Throwable unused) {
        }
        return defaultFinishEvent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getContext() {
        return this.f2772a;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public String getDesc() {
        return this.f2774c;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public int getHttpCode() {
        return this.f2773b;
    }

    @Override // anetwork.channel.NetworkEvent.FinishEvent
    public StatisticData getStatisticData() {
        return this.f2775d;
    }

    public void setContext(Object obj) {
        this.f2772a = obj;
    }

    public String toString() {
        return "DefaultFinishEvent [code=" + this.f2773b + ", desc=" + this.f2774c + ", context=" + this.f2772a + ", statisticData=" + this.f2775d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2773b);
        parcel.writeString(this.f2774c);
        StatisticData statisticData = this.f2775d;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public DefaultFinishEvent(int i10, String str, RequestStatistic requestStatistic) {
        this(i10, str, null, requestStatistic);
    }

    public DefaultFinishEvent(int i10, String str, Request request) {
        this(i10, str, request, request != null ? request.f2501a : null);
    }

    private DefaultFinishEvent(int i10, String str, Request request, RequestStatistic requestStatistic) {
        this.f2775d = new StatisticData();
        this.f2773b = i10;
        this.f2774c = str == null ? ErrorConstant.getErrMsg(i10) : str;
        this.request = request;
        this.f2776rs = requestStatistic;
    }
}
