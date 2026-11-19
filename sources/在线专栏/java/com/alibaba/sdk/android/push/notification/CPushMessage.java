package com.alibaba.sdk.android.push.notification;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class CPushMessage implements Parcelable {
    public static final Parcelable.Creator<CPushMessage> CREATOR = new Parcelable.Creator<CPushMessage>() { // from class: com.alibaba.sdk.android.push.notification.CPushMessage.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CPushMessage createFromParcel(Parcel parcel) {
            return new CPushMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CPushMessage[] newArray(int i4) {
            return new CPushMessage[i4];
        }
    };
    private String appId;
    private String content;
    private String messageId;
    private String title;
    private String traceInfo;

    public CPushMessage() {
    }

    private CPushMessage(Parcel parcel) {
        this.appId = parcel.readString();
        this.messageId = parcel.readString();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.traceInfo = parcel.readString();
    }

    public static CPushMessage from(com.aliyun.ams.emas.push.notification.CPushMessage cPushMessage) {
        CPushMessage cPushMessage2 = new CPushMessage();
        cPushMessage2.setAppId(cPushMessage.m5401a());
        cPushMessage2.setMessageId(cPushMessage.m5403c());
        cPushMessage2.setTitle(cPushMessage.m5404d());
        cPushMessage2.setContent(cPushMessage.m5402b());
        cPushMessage2.setTraceInfo(cPushMessage.m5405e());
        return cPushMessage2;
    }

    /* renamed from: to */
    public static com.aliyun.ams.emas.push.notification.CPushMessage m5269to(CPushMessage cPushMessage) {
        com.aliyun.ams.emas.push.notification.CPushMessage cPushMessage2 = new com.aliyun.ams.emas.push.notification.CPushMessage();
        cPushMessage2.m5406f(cPushMessage.getAppId());
        cPushMessage2.m5408h(cPushMessage.getMessageId());
        cPushMessage2.m5409i(cPushMessage.getTitle());
        cPushMessage2.m5407g(cPushMessage.getContent());
        cPushMessage2.m5410j(cPushMessage.getTraceInfo());
        return cPushMessage2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getContent() {
        return this.content;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTraceInfo() {
        return this.traceInfo;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTraceInfo(String str) {
        this.traceInfo = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.appId);
        parcel.writeString(this.messageId);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.traceInfo);
    }
}
