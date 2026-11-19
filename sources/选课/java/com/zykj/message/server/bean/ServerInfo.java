package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.zykj.message.client.BuildConfig;

/* loaded from: classes.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new Parcelable.Creator<ServerInfo>() { // from class: com.zykj.message.server.bean.ServerInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServerInfo createFromParcel(Parcel parcel) {
            return new ServerInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServerInfo[] newArray(int i) {
            return new ServerInfo[i];
        }
    };
    private String imToken;
    private String serverUrl;
    private Status status;
    private String token;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public void setServerUrl(String str) {
        this.serverUrl = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getIMToken() {
        return this.imToken;
    }

    public void setIMToken(String str) {
        this.imToken = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Status status = this.status;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.serverUrl);
        parcel.writeString(this.token);
        parcel.writeString(this.imToken);
    }

    public ServerInfo() {
        this.status = Status.LOGOUT;
        this.serverUrl = BuildConfig.FLAVOR;
        this.token = BuildConfig.FLAVOR;
        this.imToken = BuildConfig.FLAVOR;
    }

    public ServerInfo(Status status, String str, String str2, String str3) {
        this.status = status;
        this.serverUrl = str;
        this.token = str2;
        this.imToken = str3;
    }

    protected ServerInfo(Parcel parcel) {
        int i = parcel.readInt();
        this.status = i == -1 ? null : Status.values()[i];
        this.serverUrl = parcel.readString();
        this.token = parcel.readString();
        this.imToken = parcel.readString();
    }

    public String toString() {
        return "ServerInfo{status=" + this.status + ", serverUrl='" + this.serverUrl + "', token='" + this.token + "', imToken='" + this.imToken + "'}";
    }
}
