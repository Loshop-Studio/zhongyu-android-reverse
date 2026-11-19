package com.tendcloud.tenddata;

import android.net.Proxy;
import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.UUID;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.tendcloud.tenddata.ft */
/* loaded from: classes5.dex */
public class C7996ft extends AbstractC7987fk {

    /* renamed from: a */
    private C7936dn f14979a;

    /* renamed from: c */
    private String f14980c;

    /* renamed from: com.tendcloud.tenddata.ft$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType */
        static final /* synthetic */ int[] f14981x4bb14de0;

        static {
            int[] iArr = new int[EnumC7997fu.values().length];
            f14981x4bb14de0 = iArr;
            try {
                iArr[EnumC7997fu.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14981x4bb14de0[EnumC7997fu.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14981x4bb14de0[EnumC7997fu.BLUETOOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7996ft(EnumC7997fu enumC7997fu) {
        this.f14980c = UUID.randomUUID().toString();
        int i10 = AnonymousClass1.f14981x4bb14de0[enumC7997fu.ordinal()];
        if (i10 != 1) {
            try {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    m11979a("type", EnumC7997fu.BLUETOOTH.m12006a());
                    return;
                }
                m11979a("type", EnumC7997fu.CELLULAR.m12006a());
                m11979a("available", Boolean.valueOf(C7903ch.m11537e(C7843ab.f14307g)));
                m11979a("connected", Boolean.valueOf(C7903ch.m11542j(C7843ab.f14307g)));
                m11979a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, C7903ch.m11512a("cell_ip"));
                m11979a("ipv6", C7903ch.m11512a("cell_ipv6"));
                if (C7903ch.m11529b(C7843ab.f14307g)) {
                    m11979a("current", C7903ch.m11513a(C7843ab.f14307g, false));
                }
                if (C7903ch.m11528b()) {
                    m11979a("proxy", Proxy.getDefaultHost() + ":" + Proxy.getDefaultPort());
                }
                m11979a("scannable", C7903ch.m11554v(C7843ab.f14307g));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        m11979a("type", EnumC7997fu.WIFI.m12006a());
        m11979a("available", Boolean.valueOf(C7903ch.m11536d(C7843ab.f14307g)));
        if (C7903ch.m11541i(C7843ab.f14307g)) {
            m11979a("connected", Boolean.TRUE);
            JSONArray jSONArrayM11806a = C7943du.m11787a().m11806a("WiFi", C7999fw.m12011b().f14992a, C7999fw.m12011b().f14993b);
            if (jSONArrayM11806a != null) {
                m11979a("current", C7903ch.m11557y(C7843ab.f14307g));
                if (jSONArrayM11806a.length() > 0) {
                    C7999fw.m12011b().m12016a("WiFi", jSONArrayM11806a);
                }
            } else {
                m11980a("current", this.f14946b);
            }
            JSONArray jSONArrayM11558z = C7903ch.m11558z(C7843ab.f14307g);
            C7936dn c7936dnM12005a = m12005a(jSONArrayM11558z);
            if (this.f14979a == null) {
                m11979a("scannable", jSONArrayM11558z);
                this.f14979a = c7936dnM12005a;
            } else if (new C7937do().m11742a(this.f14979a, c7936dnM12005a) > 0.8d) {
                m11979a("scannable", (Object) null);
            } else {
                m11979a("scannable", jSONArrayM11558z);
                this.f14979a = c7936dnM12005a;
                this.f14980c = UUID.randomUUID().toString();
            }
            JSONArray jSONArrayM11806a2 = C7943du.m11787a().m11806a("WiFi", C7999fw.m12011b().f14992a, C7999fw.m12011b().f14993b);
            if (jSONArrayM11806a2 != null) {
                m11979a("configured", C7903ch.m11556x(C7843ab.f14307g));
                if (jSONArrayM11806a2.length() > 0) {
                    C7999fw.m12011b().m12016a("WiFi", jSONArrayM11806a2);
                }
            } else {
                m11980a("configured", this.f14946b);
            }
            JSONArray jSONArrayM11806a3 = C7943du.m11787a().m11806a("IP", C7999fw.m12011b().f14992a, C7999fw.m12011b().f14993b);
            if (jSONArrayM11806a3 != null) {
                m11979a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, C7903ch.m11512a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP));
                m11979a("ipv6", C7903ch.m11512a("ipv6"));
                if (jSONArrayM11806a3.length() > 0) {
                    C7999fw.m12011b().m12016a("IP", jSONArrayM11806a3);
                }
            } else {
                m11980a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f14946b);
            }
        } else {
            m11979a("connected", Boolean.FALSE);
        }
        if (C7903ch.m11528b()) {
            m11979a("proxy", Proxy.getDefaultHost() + ":" + Proxy.getDefaultPort());
        }
        m11979a("scannableFingerId", this.f14980c);
    }

    /* renamed from: a */
    private static C7936dn m12005a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                arrayList.add(new C7933dk(jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME), jSONObject.getString(AgooConstants.MESSAGE_ID), (byte) jSONObject.getInt("level"), (byte) 0, (byte) 0));
            } catch (Throwable th) {
                C7896ca.eForInternal(th);
            }
        }
        C7936dn c7936dn = new C7936dn();
        c7936dn.setBsslist(arrayList);
        return c7936dn;
    }
}
