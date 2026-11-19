package com.tendcloud.tenddata;

import android.content.Context;

/* renamed from: com.tendcloud.tenddata.cb */
/* loaded from: classes5.dex */
public class C7897cb {

    /* renamed from: A */
    private static final String f14479A = "TDtime_set_collect_net";

    /* renamed from: B */
    private static final String f14480B = "TDtd_role_id";

    /* renamed from: C */
    private static final String f14481C = "TDpref.accountid.key";

    /* renamed from: D */
    private static final String f14482D = "TDpref.accountgame.key";

    /* renamed from: E */
    private static final String f14483E = "TDpref.missionid.key";

    /* renamed from: F */
    private static final String f14484F = "TDpref.game.session.startsystem.key";

    /* renamed from: a */
    public static final String f14485a = "TDpref.profile.key";

    /* renamed from: b */
    public static final String f14486b = "TDpref.session.key";

    /* renamed from: c */
    public static final String f14487c = "TDpref.session.backup.key";

    /* renamed from: d */
    public static final String f14488d = "TDpref.lastactivity.key";

    /* renamed from: e */
    public static final String f14489e = "TDpref.start.key";

    /* renamed from: f */
    public static final String f14490f = "TDpref.init.key";

    /* renamed from: g */
    public static final String f14491g = "TDpref.init.flag";

    /* renamed from: h */
    public static final String f14492h = "TDpref.actstart.key";

    /* renamed from: i */
    public static final String f14493i = "TDpref.end.key";

    /* renamed from: j */
    public static final String f14494j = "TDpref.ip";

    /* renamed from: k */
    public static final String f14495k = "TD_CHANNEL_ID";

    /* renamed from: l */
    public static final String f14496l = "TDappcontext_push";

    /* renamed from: m */
    public static final String f14497m = "TDpref.tokensync.key";

    /* renamed from: n */
    public static final String f14498n = "TDpref.push.msgid.key";

    /* renamed from: o */
    public static final String f14499o = "TDpref.running.app.key";

    /* renamed from: p */
    public static final String f14500p = "TDpref_longtime";

    /* renamed from: q */
    public static final String f14501q = "TDpref_shorttime";

    /* renamed from: r */
    public static final String f14502r = "TDapp.account.key";

    /* renamed from: s */
    public static final String f14503s = "TDuniversal.account.key";

    /* renamed from: t */
    public static final String f14504t = "TDaes_key";

    /* renamed from: u */
    public static final String f14505u = "TDpref_game";

    /* renamed from: v */
    public static final String f14506v = "TD_push_pref_file";

    /* renamed from: w */
    static final String f14507w = "TDisAppQuiting";

    /* renamed from: x */
    public static final String f14508x = "TDpref.last.sdk.check";

    /* renamed from: y */
    public static final String f14509y = "TDadditionalVersionName";

    /* renamed from: z */
    public static final String f14510z = "TDadditionalVersionCode";

    /* renamed from: a */
    public static String m11372a() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return null;
        }
        try {
            return C7906ck.m11569b(context, f14500p, f14504t, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m11383b(String str, AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context == null || abstractC7841a == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14500p + abstractC7841a.index(), f14487c, str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static boolean m11389c() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return false;
        }
        try {
            return context.getSharedPreferences("TD_CHANNEL_ID", 0).getBoolean("location_called", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static String m11391d() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return "";
        }
        try {
            return C7906ck.m11569b(context, f14501q, f14488d, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static long m11393e(AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context != null && abstractC7841a != null) {
            try {
                return C7906ck.m11568b(context, f14500p + abstractC7841a.index(), f14491g, 1L);
            } catch (Throwable unused) {
            }
        }
        return 1L;
    }

    /* renamed from: f */
    public static long m11394f() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return 0L;
        }
        try {
            return C7906ck.m11568b(context, f14501q, f14492h, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: g */
    public static long m11396g() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return 0L;
        }
        try {
            return C7906ck.m11568b(context, f14500p, f14499o, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: h */
    public static String m11397h() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return null;
        }
        try {
            return C7906ck.m11569b(context, f14500p, f14509y, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static long m11398i() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return -1L;
        }
        try {
            return C7906ck.m11568b(context, f14500p, f14510z, -1L);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: j */
    public static int m11399j() {
        try {
            return m11398i() != -1 ? Integer.parseInt(String.valueOf(m11398i())) : C7894bz.m11353a().m11356b(C7843ab.f14307g);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: k */
    public static String m11400k() {
        try {
            return m11397h() != null ? m11397h() : C7894bz.m11353a().m11357c(C7843ab.f14307g);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: l */
    public static String m11401l() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return null;
        }
        try {
            return C7906ck.m11569b(context, f14501q, f14502r, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static String m11402m() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return null;
        }
        try {
            return C7906ck.m11569b(context, f14501q, f14503s, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static String m11403n() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return null;
        }
        try {
            return C7906ck.m11569b(context, f14501q, f14480B, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static long m11404o() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return 0L;
        }
        try {
            return C7906ck.m11568b(context, f14501q, f14479A, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: p */
    public static String m11405p() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return "";
        }
        try {
            return C7906ck.m11569b(context, f14505u, f14481C, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: q */
    public static String m11406q() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return "";
        }
        try {
            return C7906ck.m11569b(context, f14505u, f14483E, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: r */
    public static void m11407r() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14505u, f14484F, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    public static String m11408s() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return "";
        }
        try {
            return C7906ck.m11569b(context, f14506v, f14496l, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void setAESKey(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14500p, f14504t, str);
        } catch (Throwable unused) {
        }
    }

    public static void setActivityStartTime(long j10) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14501q, f14492h, j10);
        } catch (Throwable unused) {
        }
    }

    public static void setAdditionalVersionCode(long j10) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14500p, f14510z, j10);
        } catch (Throwable unused) {
        }
    }

    public static void setAdditionalVersionName(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14500p, f14509y, str);
        } catch (Throwable unused) {
        }
    }

    public static void setCollectNetInfoTime(long j10) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14501q, f14479A, j10);
        } catch (Throwable unused) {
        }
    }

    public static void setCollectRunningTime(long j10) {
        try {
            C7906ck.m11566a(C7843ab.f14307g, f14500p, f14499o, j10);
        } catch (Throwable unused) {
        }
    }

    public static void setInitTime(long j10) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14500p, f14490f, j10);
        } catch (Throwable unused) {
        }
    }

    public static void setLastActivity(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14501q, f14488d, str);
        } catch (Throwable unused) {
        }
    }

    public static void setLastRoleName(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14501q, f14480B, str);
        } catch (Throwable unused) {
        }
    }

    public static void setMissionId(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14505u, f14483E, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPostProfile(boolean z10) {
        try {
            C7906ck.m11566a(C7843ab.f14307g, f14500p, f14485a, z10 ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    public static void setProfileId(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14505u, f14481C, str);
        } catch (Throwable unused) {
        }
    }

    public static void setProfileInfo(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14501q, f14502r, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushAppContext(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14506v, f14496l, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushLastMsgId(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14506v, f14498n, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushSyncTokenLastTime(long j10) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14506v, f14497m, j10);
        } catch (Throwable unused) {
        }
    }

    public static void setUniversalProfileInfo(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14501q, f14503s, str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: t */
    public static long m11409t() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return 0L;
        }
        try {
            return C7906ck.m11568b(context, f14506v, f14497m, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: u */
    public static String m11410u() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return "";
        }
        try {
            return C7906ck.m11569b(context, f14506v, f14498n, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m11373a(AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context != null && abstractC7841a != null) {
            try {
                return C7906ck.m11569b(context, f14500p + abstractC7841a.index(), f14486b, (String) null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m11379b(AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context != null && abstractC7841a != null) {
            try {
                return C7906ck.m11569b(context, f14500p + abstractC7841a.index(), f14487c, (String) null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public static long m11390d(AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context != null && abstractC7841a != null) {
            try {
                return C7906ck.m11568b(context, f14500p + abstractC7841a.index(), f14490f, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* renamed from: e */
    public static long m11392e() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return 0L;
        }
        try {
            return C7906ck.m11568b(context, f14500p, f14490f, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: f */
    public static long m11395f(AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context != null && abstractC7841a != null) {
            try {
                return C7906ck.m11568b(context, f14501q + abstractC7841a.index(), f14493i, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* renamed from: c */
    public static long m11385c(AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context != null && abstractC7841a != null) {
            try {
                return C7906ck.m11568b(context, f14500p + abstractC7841a.index(), f14489e, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* renamed from: a */
    public static void m11376a(String str, AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context == null || abstractC7841a == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14500p + abstractC7841a.index(), f14486b, str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m11381b() {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences("TD_CHANNEL_ID", 0).edit().putBoolean("location_called", true).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static void m11387c(long j10, AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context == null || abstractC7841a == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14501q + abstractC7841a.index(), f14493i, j10);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m11375a(long j10, AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context == null || abstractC7841a == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14500p + abstractC7841a.index(), f14489e, j10);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m11382b(long j10, AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context == null || abstractC7841a == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14500p + abstractC7841a.index(), f14490f, j10);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static String m11386c(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return "";
        }
        try {
            return C7906ck.m11569b(context, f14505u, str + f14482D, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m11378a(boolean z10, AbstractC7841a abstractC7841a) {
        Context context = C7843ab.f14307g;
        if (context == null || abstractC7841a == null) {
            return;
        }
        try {
            C7906ck.m11566a(context, f14500p + abstractC7841a.index(), f14491g, z10 ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m11384b(String str, String str2) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14501q, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static void m11388c(String str, String str2) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14505u, str + f14482D, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m11377a(String str, String str2) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return;
        }
        try {
            C7906ck.m11567a(context, f14501q, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static String m11380b(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return null;
        }
        try {
            return C7906ck.m11569b(context, f14501q, str, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m11374a(String str) {
        Context context = C7843ab.f14307g;
        if (context == null) {
            return null;
        }
        try {
            return C7906ck.m11569b(context, f14501q, str, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
