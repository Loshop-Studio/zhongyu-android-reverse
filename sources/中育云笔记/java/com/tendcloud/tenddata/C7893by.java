package com.tendcloud.tenddata;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tendcloud.tenddata.C7901cf;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tendcloud.tenddata.by */
/* loaded from: classes5.dex */
public class C7893by {

    /* renamed from: e */
    public static final Parcelable.Creator<C7893by> f14470e = new Parcelable.Creator<C7893by>() { // from class: com.tendcloud.tenddata.by.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C7893by createFromParcel(Parcel parcel) {
            try {
                return new C7893by(parcel);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C7893by[] newArray(int i10) {
            try {
                return new C7893by[i10];
            } catch (Throwable unused) {
                return null;
            }
        }
    };

    /* renamed from: a */
    public boolean f14471a;

    /* renamed from: b */
    public int f14472b;

    /* renamed from: c */
    public final String f14473c;

    /* renamed from: d */
    public final int f14474d;

    /* renamed from: f */
    private final C7901cf.a f14475f;

    public C7893by(int i10) {
        this.f14474d = i10;
        this.f14473c = m11347a(i10);
        C7901cf.a aVar = C7901cf.a.get(i10);
        this.f14475f = aVar;
        C7901cf.d dVarM11351d = m11351d();
        if (aVar != null) {
            try {
                C7901cf.b group = aVar.getGroup("cpuacct");
                if (aVar.getGroup("cpu").group == null) {
                    if (dVarM11351d != null) {
                        this.f14472b = dVarM11351d.getUid();
                        return;
                    }
                    return;
                }
                this.f14471a = !r5.contains("bg_non_interactive");
                if (group.group.split(MqttTopic.TOPIC_LEVEL_SEPARATOR).length > 1) {
                    this.f14472b = Integer.parseInt(group.group.split(MqttTopic.TOPIC_LEVEL_SEPARATOR)[1].replace("uid_", ""));
                } else if (dVarM11351d != null) {
                    this.f14472b = dVarM11351d.getUid();
                }
            } catch (Throwable unused) {
                if (dVarM11351d != null) {
                    this.f14472b = dVarM11351d.getUid();
                }
            }
        }
    }

    /* renamed from: a */
    public String m11348a() {
        try {
            return this.f14473c.split(":")[0];
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public String m11349b() {
        try {
            if (this.f14473c.split(":").length <= 1) {
                return "";
            }
            return ":" + this.f14473c.split(":")[1];
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public C7901cf.a m11350c() {
        return this.f14475f;
    }

    /* renamed from: d */
    public final C7901cf.d m11351d() {
        try {
            return C7901cf.d.get(this.f14474d);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public C7901cf.c m11352e() {
        try {
            return C7901cf.c.get(this.f14474d);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m11347a(int i10) {
        String strTrim = null;
        try {
            strTrim = C7901cf.readFile(String.format("/proc/%d/cmdline", Integer.valueOf(i10))).trim();
            if (TextUtils.isEmpty(strTrim)) {
                return C7901cf.c.get(i10).getComm();
            }
        } catch (Throwable unused) {
        }
        return strTrim;
    }

    public C7893by(Parcel parcel) {
        this.f14473c = parcel.readString();
        this.f14474d = parcel.readInt();
        this.f14475f = (C7901cf.a) parcel.readParcelable(C7901cf.a.class.getClassLoader());
        this.f14471a = parcel.readByte() != 0;
    }
}
