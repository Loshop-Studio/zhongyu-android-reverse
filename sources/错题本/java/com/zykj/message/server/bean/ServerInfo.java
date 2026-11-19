package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0038g;

/* loaded from: classes3.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C0038g(11);

    /* renamed from: a */
    public Status f5728a;

    /* renamed from: b */
    public String f5729b;

    /* renamed from: c */
    public String f5730c;

    /* renamed from: d */
    public String f5731d;

    /* renamed from: e */
    public String f5732e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerInfo{status=");
        sb.append(this.f5728a);
        sb.append(", serverUrl='");
        sb.append(this.f5729b);
        sb.append("', token='");
        sb.append(this.f5730c);
        sb.append("', imToken='");
        sb.append(this.f5731d);
        sb.append("', webServerUrl='");
        return AbstractC0037f.m91p(sb, this.f5732e, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.f5728a;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f5729b);
        parcel.writeString(this.f5730c);
        parcel.writeString(this.f5731d);
        parcel.writeString(this.f5732e);
    }
}
