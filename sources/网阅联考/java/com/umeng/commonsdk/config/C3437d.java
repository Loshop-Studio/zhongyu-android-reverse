package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.d */
/* loaded from: classes2.dex */
public class C3437d {

    /* renamed from: a */
    public static final long f2432a = 1000;

    /* renamed from: b */
    public static final String f2433b = "_LAST_FIELD";

    /* renamed from: c */
    public static final String f2434c = "3758096383";

    /* renamed from: d */
    public static final String f2435d = "2147483647";

    /* renamed from: e */
    public static final String f2436e = "262143";

    /* renamed from: f */
    public static final String f2437f = "2047";

    /* renamed from: g */
    public static final int f2438g = 64;

    /* renamed from: l */
    private static Map<String, String[]> f2443l = new HashMap();

    /* renamed from: h */
    public static String[] f2439h = new String[a.values().length];

    /* renamed from: i */
    public static String[] f2440i = new String[b.values().length];

    /* renamed from: j */
    public static String[] f2441j = new String[c.values().length];

    /* renamed from: k */
    public static String[] f2442k = new String[d.values().length];

    /* renamed from: com.umeng.commonsdk.config.d$a */
    public enum a {
        header_utoken,
        header_cpu,
        header_mccmnc,
        header_sub_os_name,
        header_sub_os_version,
        header_device_type,
        header_device_id_imei,
        header_device_id_mac,
        header_device_id_android_id,
        header_device_id_serialNo,
        header_bulid,
        header_os_version,
        header_resolution,
        header_mc,
        header_timezone,
        header_local_info,
        header_carrier,
        header_access,
        header_tracking_imei,
        header_tracking_android_id,
        header_tracking_utdid,
        header_tracking_idmd5,
        header_tracking_idfa,
        header_tracking_mac,
        header_tracking_serial,
        header_tracking_uuid,
        header_tracking_uop,
        header_tracking_oldumid,
        header_tracking_newumid,
        header_ekv_send_on_exit,
        header_device_oaid,
        header_local_ip,
        header_foreground_count,
        header_first_resume,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$b */
    public enum b {
        inner_rs,
        inner_by,
        inner_gp,
        inner_to,
        inner_mo,
        inner_ca,
        inner_fl,
        inner_gdf_r,
        inner_thm_z,
        inner_dsk_s,
        inner_sd,
        inner_build,
        inner_sr,
        inner_scr,
        inner_sinfo,
        inner_winfo,
        inner_input,
        inner_bt,
        inner_mem,
        inner_cpu,
        inner_rom,
        inner_bstn,
        inner_cam,
        inner_appls,
        inner_lbs,
        internal_run_server,
        internal_imsi,
        internal_meid,
        tp_tp,
        inner_imei2,
        inner_iccid,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$c */
    public enum c {
        push_cpu,
        push_imei,
        push_mac,
        push_android_id,
        push_serialNo,
        push_settings_android_id,
        push_network_access_mode,
        push_on_line,
        push_time_zone,
        push_locale_info,
        push_resolution,
        push_operator,
        push_utdid,
        push_service_work,
        push_service_name,
        push_intent_exist,
        push_data_data,
        push_notification_enabled,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$d */
    public enum d {
        share_device_id,
        share_imsi,
        share_iccid,
        share_sn,
        share_net_accmode,
        share_android_id,
        share_wifi_mac,
        share_sd_size,
        share_ssid,
        share_resolution,
        share_conn_type,
        _LAST_FIELD
    }

    static {
        String[] strArr = f2439h;
        if (strArr != null && strArr.length > 0) {
            for (int i4 = 0; i4 < a.values().length; i4++) {
                f2439h[i4] = a.values()[i4].toString();
            }
            Map<String, String[]> map = f2443l;
            if (map != null) {
                map.put(a.class.getName(), f2439h);
            }
        }
        String[] strArr2 = f2440i;
        if (strArr2 != null && strArr2.length > 0) {
            for (int i5 = 0; i5 < b.values().length; i5++) {
                f2440i[i5] = b.values()[i5].toString();
            }
            Map<String, String[]> map2 = f2443l;
            if (map2 != null) {
                map2.put(b.class.getName(), f2440i);
            }
        }
        String[] strArr3 = f2441j;
        if (strArr3 != null && strArr3.length > 0) {
            for (int i6 = 0; i6 < c.values().length; i6++) {
                f2441j[i6] = c.values()[i6].toString();
            }
            Map<String, String[]> map3 = f2443l;
            if (map3 != null) {
                map3.put(c.class.getName(), f2441j);
            }
        }
        String[] strArr4 = f2442k;
        if (strArr4 == null || strArr4.length <= 0) {
            return;
        }
        for (int i7 = 0; i7 < d.values().length; i7++) {
            f2442k[i7] = d.values()[i7].toString();
        }
        Map<String, String[]> map4 = f2443l;
        if (map4 != null) {
            map4.put(d.class.getName(), f2442k);
        }
    }

    /* renamed from: a */
    public static boolean m3423a(String str) {
        return (str == null || str.length() <= 0 || f2433b.equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: b */
    public static String[] m3424b(String str) {
        if (str == null || str.length() <= 0 || !f2443l.containsKey(str)) {
            return null;
        }
        return f2443l.get(str);
    }
}
