package com.alibaba.sdk.android.push.p064e;

import android.content.Context;
import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p050a.C5571a;
import com.alibaba.sdk.android.ams.common.p051b.C5575c;
import com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C5654c;
import com.alibaba.sdk.android.push.common.util.C5661b;
import com.alibaba.sdk.android.push.common.util.p061a.EnumC5660d;
import com.alibaba.sdk.android.push.p058a.C5646c;
import com.alibaba.sdk.android.push.p058a.C5647d;
import com.alibaba.sdk.android.push.p060c.C5651a;
import com.alibaba.sdk.android.push.p064e.C5671f;
import com.taobao.accs.common.Constants;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.e.g */
/* loaded from: classes3.dex */
public class C5672g {

    /* renamed from: a */
    private static final AmsLogger f4341a = AmsLogger.getLogger("MPS:VipRequestManager");

    /* renamed from: b */
    private static C5672g f4342b = null;

    /* renamed from: c */
    private static Context f4343c;

    /* renamed from: d */
    private final C5671f f4344d = new C5671f();

    private C5672g() {
    }

    /* renamed from: a */
    public static C5672g m3679a() {
        if (f4342b == null) {
            f4342b = new C5672g();
        }
        return f4342b;
    }

    /* renamed from: e */
    private String m3697e() {
        return C5575c.m3411a().mo3403b();
    }

    /* renamed from: f */
    private String m3698f() {
        return C5575c.m3411a().mo3406c("mps_account");
    }

    /* renamed from: g */
    private Map<String, String> m3699g() {
        String strM3704b = m3704b();
        HashMap map = new HashMap();
        map.put(Constants.KEY_APP_KEY, strM3704b);
        map.put(Constants.KEY_OS_VERSION, "2");
        map.put("version", "3.9.5");
        return map;
    }

    /* renamed from: b */
    public String m3704b() {
        return C5575c.m3411a().mo3399a();
    }

    /* renamed from: a */
    private String m3680a(int i10) {
        C5671f.a aVarM3675a = this.f4344d.m3675a(i10);
        if (aVarM3675a == null) {
            return null;
        }
        return aVarM3675a.m3677a();
    }

    /* renamed from: b */
    public void m3705b(int i10, String[] strArr, String str, final CommonCallback commonCallback) throws C5647d {
        Map<String, String> mapM3681a;
        String str2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/unbind-tag", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.9
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str3, String str4) {
                    C5672g.this.m3692a(str3, str4, "/unbind-tag");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str3, str4);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str3) {
                    if (commonCallback != null) {
                        C5672g.this.m3691a("/unbind-tag", System.currentTimeMillis() - jCurrentTimeMillis);
                        commonCallback.onSuccess(str3);
                    }
                }
            });
            Map<String, String> mapM3699g = m3699g();
            if (i10 == 1) {
                f4341a.m3417d("Unbinding tag from device.");
                mapM3681a = m3681a("deviceId", (String) null, (String[]) null, mapM3699g);
                str2 = EnumC5660d.UNBIND_TAG_TO_DEVICE.m3636a() + "";
            } else if (i10 == 2) {
                f4341a.m3417d("Unbinding tag from account.");
                mapM3681a = m3681a("account", (String) null, (String[]) null, mapM3699g);
                str2 = EnumC5660d.UNBIND_TAG_TO_ACCOUNT.m3636a() + "";
            } else {
                if (i10 != 3) {
                    throw new C5647d("target is invalid.");
                }
                f4341a.m3417d("Unbinding tag from alias.");
                mapM3681a = m3681a("alias", str, (String[]) null, mapM3699g);
                str2 = EnumC5660d.UNBIND_TAG_TO_ALIAS.m3636a() + "";
            }
            mapM3681a.put("VipRequestType", str2);
            Map<String, String> mapM3681a2 = m3681a("tags", (String) null, strArr, mapM3681a);
            mapM3681a2.put("target", String.valueOf(i10));
            asyncTaskC5673h.execute(mapM3681a2);
        } catch (C5646c e10) {
            m3684a(e10, "/unbind-tag", commonCallback);
        } catch (C5647d e11) {
            m3685a(e11, "/unbind-tag", commonCallback);
        }
    }

    /* renamed from: c */
    public void m3709c(final CommonCallback commonCallback) {
        f4341a.m3417d("check vip push status");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/push-status", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.14
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C5672g.this.m3692a(str, str2, "/push-status");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C5672g.this.m3691a("/push-status", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM3681a = m3681a("deviceId", (String) null, (String[]) null, m3699g());
            mapM3681a.put("VipRequestType", String.valueOf(EnumC5660d.CHECK_PUSH_STATUS.m3636a()));
            asyncTaskC5673h.execute(mapM3681a);
        } catch (C5646c e10) {
            m3684a(e10, "/push-status", commonCallback);
        }
    }

    /* renamed from: d */
    public void m3711d(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f4341a.m3417d("unbinding vip");
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/push-switch", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.2
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C5672g.this.m3692a(str, str2, "/push-switch");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C5672g.this.m3691a("/push-switch", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM3681a = m3681a("deviceId", (String) null, (String[]) null, m3699g());
            mapM3681a.put("VipRequestType", String.valueOf(EnumC5660d.TURN_OFF_PUSH.m3636a()));
            mapM3681a.put("enable", RequestConstant.FALSE);
            asyncTaskC5673h.execute(mapM3681a);
        } catch (C5646c e10) {
            m3684a(e10, "/push-switch false", commonCallback);
        }
    }

    /* renamed from: e */
    public void m3713e(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f4341a.m3417d("binding vip push");
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/push-switch", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.3
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C5672g.this.m3692a(str, str2, "/push-switch");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C5672g.this.m3691a("/push-switch", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM3681a = m3681a("deviceId", (String) null, (String[]) null, m3699g());
            mapM3681a.put("VipRequestType", String.valueOf(EnumC5660d.TURN_ON_PUSH.m3636a()));
            mapM3681a.put("enable", RequestConstant.TRUE);
            asyncTaskC5673h.execute(mapM3681a);
        } catch (C5646c e10) {
            m3684a(e10, "/push-switch true", commonCallback);
        }
    }

    /* renamed from: f */
    public void m3714f(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f4341a.m3417d("unbinding phone number");
        AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/unset-phone", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.5
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                C5672g.this.m3692a(str, str2, "/unset-phone");
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onFailed(str, str2);
                }
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                C5672g.this.m3691a("/unset-phone", System.currentTimeMillis() - jCurrentTimeMillis);
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onSuccess(str);
                }
            }
        });
        try {
            Map<String, String> mapM3699g = m3699g();
            mapM3699g.put("VipRequestType", String.valueOf(EnumC5660d.UNBIND_PHONE_NUMBER.m3636a()));
            asyncTaskC5673h.execute(m3681a("deviceId", (String) null, (String[]) null, mapM3699g));
        } catch (C5646c e10) {
            m3684a(e10, "/unset-phone", commonCallback);
        }
    }

    /* renamed from: a */
    private Map<String, String> m3681a(String str, String str2, String[] strArr, Map<String, String> map) throws C5646c {
        int i10;
        String str3;
        str.getClass();
        switch (str) {
            case "account":
                String strM3698f = m3698f();
                if (StringUtil.isEmpty(strM3698f)) {
                    throw new C5646c("account is empty");
                }
                map.put("account", strM3698f);
                return map;
            case "tags":
                if (strArr == null) {
                    throw new C5646c("tags array is empty");
                }
                StringBuilder sb2 = new StringBuilder();
                for (i10 = 0; i10 < strArr.length; i10++) {
                    if (i10 != strArr.length - 1 && !StringUtil.isEmpty(strArr[i10])) {
                        sb2.append(strArr[i10]);
                        str3 = ",";
                    } else if (i10 == strArr.length - 1 && !StringUtil.isEmpty(strArr[i10])) {
                        str3 = strArr[i10];
                    }
                    sb2.append(str3);
                }
                if (StringUtil.isEmpty(sb2.toString())) {
                    throw new C5646c("tags array is empty");
                }
                map.put("tags", sb2.toString());
                return map;
            case "alias":
                if (StringUtil.isEmpty(str2)) {
                    throw new C5646c("alias is empty");
                }
                map.put("alias", str2);
                return map;
            case "deviceId":
                String strM3697e = m3697e();
                if (StringUtil.isEmpty(strM3697e)) {
                    throw new C5646c("deviceId is empty.");
                }
                map.put("deviceId", strM3697e);
                return map;
            default:
                return map;
        }
    }

    /* renamed from: b */
    public void m3706b(Context context) {
        if (m3695c(context)) {
            f4341a.m3420e("onAppStart has already sent today");
            return;
        }
        f4341a.m3417d("onAppStart");
        AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/active", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.6
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                C5672g.f4341a.m3420e("onAppStart failed. errorCode:" + str + " errorMsg:" + str2);
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                C5672g.f4341a.m3417d("onAppStart success");
                try {
                    C5661b.m3638a(C5672g.f4343c, "KEY_LAUNCH_MARK", System.currentTimeMillis());
                } catch (Throwable th) {
                    C5672g.f4341a.m3421e("onAppStart success", th);
                }
            }
        });
        try {
            Map<String, String> mapM3699g = m3699g();
            mapM3699g.put("VipRequestType", String.valueOf(EnumC5660d.ON_APP_START.m3636a()));
            asyncTaskC5673h.execute(m3681a("deviceId", (String) null, (String[]) null, mapM3699g));
        } catch (C5646c e10) {
            m3684a(e10, "/active", (CommonCallback) null);
        }
    }

    /* renamed from: c */
    public void m3710c(String str, final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f4341a.m3417d("Removing alias from device");
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/remove-alias", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.12
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C5672g.this.m3692a(str2, str3, "/remove-alias");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C5672g.this.m3691a("/remove-alias", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM3681a = m3681a("deviceId", (String) null, (String[]) null, m3699g());
            if (StringUtil.isEmpty(str)) {
                str = "";
            }
            mapM3681a.put("alias", str);
            mapM3681a.put("VipRequestType", String.valueOf(EnumC5660d.UNBIND_ALIAS.m3636a()));
            asyncTaskC5673h.execute(mapM3681a);
        } catch (C5646c e10) {
            m3684a(e10, "/remove-alias", commonCallback);
        }
    }

    /* renamed from: d */
    public void m3712d(String str, final CommonCallback commonCallback) throws C5647d {
        f4341a.m3417d("binding phoneNumber:" + str);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/set-phone", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.4
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C5672g.this.m3692a(str2, str3, "/set-phone");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C5672g.this.m3691a("/set-phone", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM3699g = m3699g();
            if (StringUtil.isEmpty(str)) {
                throw new C5647d("account input is empty!");
            }
            mapM3699g.put("mob", str);
            mapM3699g.put("VipRequestType", String.valueOf(EnumC5660d.BIND_PHONE_NUMBER.m3636a()));
            asyncTaskC5673h.execute(m3681a("deviceId", (String) null, (String[]) null, mapM3699g));
        } catch (C5646c e10) {
            m3684a(e10, "/set-phone", commonCallback);
        } catch (C5647d e11) {
            m3685a(e11, "/set-phone", commonCallback);
        }
    }

    /* renamed from: c */
    private static boolean m3695c(Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C5661b.m3637a(context, "KEY_LAUNCH_MARK"));
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
    }

    /* renamed from: a */
    public void m3700a(final int i10, CommonCallback commonCallback) throws C5647d {
        final CommonCallback commonCallback2;
        String strM3680a;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AmsLogger amsLogger = f4341a;
        amsLogger.m3417d("listTags");
        if (1 == i10 && (strM3680a = m3680a(2)) != null) {
            amsLogger.m3417d("get from cache");
            if (commonCallback != null) {
                commonCallback.onSuccess(strM3680a);
                return;
            }
            return;
        }
        try {
            commonCallback2 = commonCallback;
            try {
                AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/list-tag", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.10
                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onFailed(String str, String str2) {
                        C5672g.this.m3692a(str, str2, "/list-tag");
                        CommonCallback commonCallback3 = commonCallback2;
                        if (commonCallback3 != null) {
                            commonCallback3.onFailed(str, str2);
                        }
                    }

                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onSuccess(String str) {
                        C5672g.this.m3691a("/list-tag", System.currentTimeMillis() - jCurrentTimeMillis);
                        if (1 == i10) {
                            C5672g.f4341a.m3417d("store cache");
                            C5672g.this.m3682a(2, str);
                        }
                        CommonCallback commonCallback3 = commonCallback2;
                        if (commonCallback3 != null) {
                            commonCallback3.onSuccess(str);
                        }
                    }
                });
                Map<String, String> mapM3699g = m3699g();
                if (i10 != 1) {
                    throw new C5647d("target is invalid.");
                }
                Map<String, String> mapM3681a = m3681a("deviceId", (String) null, (String[]) null, mapM3699g);
                mapM3681a.put("target", String.valueOf(i10));
                mapM3681a.put("VipRequestType", EnumC5660d.LIST_TAGS.m3636a() + "");
                asyncTaskC5673h.execute(mapM3681a);
            } catch (C5646c e10) {
                e = e10;
                m3684a(e, "/list-tag", commonCallback2);
            } catch (C5647d e11) {
                e = e11;
                m3685a(e, "/list-tag", commonCallback2);
            }
        } catch (C5646c e12) {
            e = e12;
            commonCallback2 = commonCallback;
        } catch (C5647d e13) {
            e = e13;
            commonCallback2 = commonCallback;
        }
    }

    /* renamed from: b */
    public void m3707b(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AmsLogger amsLogger = f4341a;
        amsLogger.m3417d("listAliases");
        String strM3680a = m3680a(1);
        if (strM3680a != null) {
            amsLogger.m3417d("get from cache");
            if (commonCallback != null) {
                commonCallback.onSuccess(strM3680a);
                return;
            }
            return;
        }
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/list-alias", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.13
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C5672g.this.m3692a(str, str2, "/list-alias");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C5672g.f4341a.m3417d("store cache");
                    C5672g.this.m3682a(1, str);
                    C5672g.this.m3691a("/list-alias", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM3699g = m3699g();
            mapM3699g.put("VipRequestType", EnumC5660d.LIST_ALIASES.m3636a() + "");
            asyncTaskC5673h.execute(m3681a("deviceId", (String) null, (String[]) null, mapM3699g));
        } catch (C5646c e10) {
            m3684a(e10, "/list-alias", commonCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3682a(int i10, String str) {
        this.f4344d.m3676a(i10, str);
    }

    /* renamed from: b */
    public void m3708b(String str, final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f4341a.m3417d("Adding alias to device");
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/add-alias", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.11
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C5672g.this.m3692a(str2, str3, "/add-alias");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C5672g.this.m3691a("/add-alias", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM3681a = m3681a("alias", str, (String[]) null, m3681a("deviceId", (String) null, (String[]) null, m3699g()));
            mapM3681a.put("VipRequestType", String.valueOf(EnumC5660d.BIND_ALIAS.m3636a()));
            asyncTaskC5673h.execute(mapM3681a);
        } catch (C5646c e10) {
            m3684a(e10, "/add-alias", commonCallback);
        }
    }

    /* renamed from: a */
    public void m3701a(int i10, String[] strArr, String str, final CommonCallback commonCallback) throws C5647d {
        Map<String, String> mapM3681a;
        String str2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/bind-tag", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.8
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str3, String str4) {
                    C5672g.this.m3692a(str3, str4, "/bind-tag");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str3, str4);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str3) {
                    C5672g.this.m3691a("/bind-tag", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str3);
                    }
                }
            });
            if (strArr == null || strArr.length == 0) {
                throw new C5647d("tags is empty.");
            }
            Map<String, String> mapM3699g = m3699g();
            if (i10 == 1) {
                f4341a.m3417d("Binding tag to device.");
                mapM3681a = m3681a("deviceId", (String) null, (String[]) null, mapM3699g);
                str2 = EnumC5660d.BIND_TAG_TO_DEVICE.m3636a() + "";
            } else if (i10 == 2) {
                f4341a.m3417d("Binding tag to account.");
                mapM3681a = m3681a("account", (String) null, (String[]) null, mapM3699g);
                str2 = EnumC5660d.BIND_TAG_TO_ACCOUNT.m3636a() + "";
            } else {
                if (i10 != 3) {
                    throw new C5647d("target is invalid.");
                }
                mapM3681a = m3681a("alias", str, (String[]) null, mapM3699g);
                str2 = EnumC5660d.BIND_TAG_TO_ALIAS.m3636a() + "";
            }
            mapM3681a.put("VipRequestType", str2);
            Map<String, String> mapM3681a2 = m3681a("tags", (String) null, strArr, mapM3681a);
            mapM3681a2.put("target", String.valueOf(i10));
            asyncTaskC5673h.execute(mapM3681a2);
        } catch (C5646c e10) {
            m3684a(e10, "/bind-tag", commonCallback);
        } catch (C5647d e11) {
            m3685a(e11, "/bind-tag", commonCallback);
        }
    }

    /* renamed from: a */
    public static void m3683a(Context context) {
        f4343c = context;
        if (f4342b == null) {
            f4342b = m3679a();
        }
    }

    /* renamed from: a */
    public void m3702a(final CommonCallback commonCallback) {
        f4341a.m3417d("unbinding account");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/unbind-account", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.7
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                C5672g.this.m3692a(str, str2, "/unbind-account");
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onFailed(str, str2);
                }
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                C5672g.this.m3690a("");
                C5672g.this.m3691a("/unbind-account", System.currentTimeMillis() - jCurrentTimeMillis);
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onSuccess(str);
                }
            }
        });
        try {
            Map<String, String> mapM3699g = m3699g();
            mapM3699g.put("account", "");
            mapM3699g.put("VipRequestType", String.valueOf(EnumC5660d.UNBIND_ACCOUNT.m3636a()));
            asyncTaskC5673h.execute(m3681a("deviceId", (String) null, (String[]) null, mapM3699g));
        } catch (C5646c e10) {
            m3684a(e10, "/unbind-account", commonCallback);
        }
    }

    /* renamed from: a */
    private void m3684a(C5646c c5646c, String str, CommonCallback commonCallback) {
        m3693a((Throwable) c5646c, str, commonCallback);
    }

    /* renamed from: a */
    private void m3685a(C5647d c5647d, String str, CommonCallback commonCallback) {
        m3693a((Throwable) c5647d, str, commonCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3690a(String str) {
        C5575c.m3411a().mo3402a("mps_account", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3691a(String str, long j10) {
        C5651a c5651aM3610a = C5651a.m3610a();
        InterfaceC5574b interfaceC5574bM3411a = C5575c.m3411a();
        if (c5651aM3610a == null || interfaceC5574bM3411a == null) {
            return;
        }
        c5651aM3610a.m3614a(str, interfaceC5574bM3411a.mo3403b(), j10);
    }

    /* renamed from: a */
    public void m3703a(final String str, CommonCallback commonCallback) throws C5647d {
        final CommonCallback commonCallback2;
        f4341a.m3417d("binding account" + str);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            commonCallback2 = commonCallback;
        } catch (C5646c e10) {
            e = e10;
            commonCallback2 = commonCallback;
        } catch (C5647d e11) {
            e = e11;
            commonCallback2 = commonCallback;
        }
        try {
            AsyncTaskC5673h asyncTaskC5673h = new AsyncTaskC5673h(f4343c, "https://" + C5571a.m3385c() + "/bind-account", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.1
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C5672g.this.m3692a(str2, str3, "/bind-account");
                    CommonCallback commonCallback3 = commonCallback2;
                    if (commonCallback3 != null) {
                        commonCallback3.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C5672g.this.m3690a(str);
                    C5672g.this.m3691a("/bind-account", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback3 = commonCallback2;
                    if (commonCallback3 != null) {
                        commonCallback3.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM3699g = m3699g();
            if (StringUtil.isEmpty(str)) {
                throw new C5647d("account input is empty!");
            }
            mapM3699g.put("account", str);
            mapM3699g.put("VipRequestType", String.valueOf(EnumC5660d.BIND_ACCOUNT.m3636a()));
            asyncTaskC5673h.execute(m3681a("deviceId", (String) null, (String[]) null, mapM3699g));
        } catch (C5646c e12) {
            e = e12;
            m3684a(e, "/bind-account", commonCallback2);
        } catch (C5647d e13) {
            e = e13;
            m3685a(e, "/bind-account", commonCallback2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3692a(String str, String str2, String str3) {
        C5651a c5651aM3610a = C5651a.m3610a();
        InterfaceC5574b interfaceC5574bM3411a = C5575c.m3411a();
        if (c5651aM3610a == null || interfaceC5574bM3411a == null) {
            return;
        }
        c5651aM3610a.m3616a(str, str2, interfaceC5574bM3411a.mo3403b(), str3);
    }

    /* renamed from: a */
    private void m3693a(Throwable th, String str, CommonCallback commonCallback) {
        ErrorCode errorCodeBuild = C5654c.f4258q.copy().msg(th.getMessage()).build();
        f4341a.m3421e(str + " Fail: errorCode:" + errorCodeBuild, th);
        if (commonCallback != null) {
            commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
        m3692a(errorCodeBuild.getCode(), errorCodeBuild.getMsg(), str);
    }
}
