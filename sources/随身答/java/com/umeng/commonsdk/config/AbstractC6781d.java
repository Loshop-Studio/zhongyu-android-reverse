package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6781d {

    /* renamed from: a */
    public static Map f6740a = new HashMap();

    /* renamed from: b */
    public static String[] f6741b = new String[a.values().length];

    /* renamed from: c */
    public static String[] f6742c = new String[b.values().length];

    /* renamed from: d */
    public static String[] f6743d = new String[c.values().length];

    /* renamed from: e */
    public static String[] f6744e = new String[d.values().length];

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
        String[] strArr = f6741b;
        if (strArr != null && strArr.length > 0) {
            for (int i9 = 0; i9 < a.values().length; i9++) {
                f6741b[i9] = a.values()[i9].toString();
            }
            Map map = f6740a;
            if (map != null) {
                map.put(a.class.getName(), f6741b);
            }
        }
        String[] strArr2 = f6742c;
        if (strArr2 != null && strArr2.length > 0) {
            for (int i10 = 0; i10 < b.values().length; i10++) {
                f6742c[i10] = b.values()[i10].toString();
            }
            Map map2 = f6740a;
            if (map2 != null) {
                map2.put(b.class.getName(), f6742c);
            }
        }
        String[] strArr3 = f6743d;
        if (strArr3 != null && strArr3.length > 0) {
            for (int i11 = 0; i11 < c.values().length; i11++) {
                f6743d[i11] = c.values()[i11].toString();
            }
            Map map3 = f6740a;
            if (map3 != null) {
                map3.put(c.class.getName(), f6743d);
            }
        }
        String[] strArr4 = f6744e;
        if (strArr4 == null || strArr4.length <= 0) {
            return;
        }
        for (int i12 = 0; i12 < d.values().length; i12++) {
            f6744e[i12] = d.values()[i12].toString();
        }
        Map map4 = f6740a;
        if (map4 != null) {
            map4.put(d.class.getName(), f6744e);
        }
    }

    /* renamed from: a */
    public static boolean m6265a(String str) {
        return (str == null || str.length() <= 0 || "_LAST_FIELD".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: b */
    public static String[] m6266b(String str) {
        if (str == null || str.length() <= 0 || !f6740a.containsKey(str)) {
            return null;
        }
        return (String[]) f6740a.get(str);
    }
}
