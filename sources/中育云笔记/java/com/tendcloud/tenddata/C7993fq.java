package com.tendcloud.tenddata;

import android.os.Build;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.common.Constants;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: com.tendcloud.tenddata.fq */
/* loaded from: classes5.dex */
public class C7993fq extends AbstractC7987fk {
    public C7993fq() {
        m11979a(Constants.KEY_OS_VERSION, DispatchConstants.ANDROID);
        m11979a("osVersionName", C7899cd.m11427a());
        m11979a("isHarmony", Boolean.valueOf(C7899cd.m11437b()));
        m11979a("harmonyOsVersion", C7899cd.m11439c());
        m11979a("kernelVersion", C7899cd.m11441d());
        m11979a("osVersionCode", String.valueOf(C7899cd.m11457l()));
        m11979a("timezone", TimeZone.getDefault().getID());
        m11979a("locale", m11993e());
        m11979a("timezoneV", m11995g());
        m11979a(IjkMediaMeta.IJKM_KEY_LANGUAGE, C7899cd.m11461n());
        m11979a("romVersion", Build.FINGERPRINT);
        m11979a("basebandVersion", m11992d());
        m11979a("osBuild", C7899cd.m11443e());
        m11979a("isAdbEnabled", Boolean.valueOf(C7899cd.m11431a(C7843ab.f14307g)));
    }

    /* renamed from: d */
    public static String m11992d() {
        try {
            if (C7912cq.m11595a(14)) {
                return Build.getRadioVersion();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: e */
    public static String m11993e() {
        try {
            return Locale.getDefault().toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static float m11994f() {
        try {
            return TimeZone.getDefault().getRawOffset() / 3600000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    /* renamed from: g */
    private static String m11995g() {
        try {
            return String.valueOf(m11994f());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m11996a() {
        return ((JSONObject) mo11973b()).optString("timezoneV");
    }

    /* renamed from: c */
    public String m11997c() {
        return ((JSONObject) mo11973b()).optString("locale");
    }
}
