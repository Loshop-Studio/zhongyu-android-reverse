package org.eclipse.paho.android.service;

import android.os.Parcel;
import android.os.Parcelable;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/* loaded from: classes6.dex */
public class ParcelableMqttMessage extends MqttMessage implements Parcelable {
    public static final Parcelable.Creator<ParcelableMqttMessage> CREATOR = new C10580a();

    /* renamed from: c */
    public String f25464c;

    /* renamed from: org.eclipse.paho.android.service.ParcelableMqttMessage$a */
    public static class C10580a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableMqttMessage createFromParcel(Parcel parcel) {
            return new ParcelableMqttMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableMqttMessage[] newArray(int i10) {
            return new ParcelableMqttMessage[i10];
        }
    }

    public ParcelableMqttMessage(MqttMessage mqttMessage) {
        super(mqttMessage.getPayload());
        this.f25464c = null;
        setQos(mqttMessage.getQos());
        setRetained(mqttMessage.isRetained());
        setDuplicate(mqttMessage.isDuplicate());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(getPayload());
        parcel.writeInt(getQos());
        parcel.writeBooleanArray(new boolean[]{isRetained(), isDuplicate()});
        parcel.writeString(this.f25464c);
    }

    public ParcelableMqttMessage(Parcel parcel) {
        super(parcel.createByteArray());
        this.f25464c = null;
        setQos(parcel.readInt());
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        setRetained(zArrCreateBooleanArray[0]);
        setDuplicate(zArrCreateBooleanArray[1]);
        this.f25464c = parcel.readString();
    }
}
