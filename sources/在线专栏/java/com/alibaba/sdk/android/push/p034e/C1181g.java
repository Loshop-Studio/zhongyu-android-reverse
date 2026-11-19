package com.alibaba.sdk.android.push.p034e;

import android.content.Context;
import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p020a.C1096a;
import com.alibaba.sdk.android.ams.common.p021b.C1100c;
import com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C1163c;
import com.alibaba.sdk.android.push.common.util.C1170b;
import com.alibaba.sdk.android.push.common.util.p031a.EnumC1169d;
import com.alibaba.sdk.android.push.p028a.C1155c;
import com.alibaba.sdk.android.push.p028a.C1156d;
import com.alibaba.sdk.android.push.p030c.C1160a;
import com.alibaba.sdk.android.push.p034e.C1180f;
import com.taobao.accs.common.Constants;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.message.MessageService;

/* renamed from: com.alibaba.sdk.android.push.e.g */
/* loaded from: classes.dex */
public class C1181g {

    /* renamed from: a */
    private static final AmsLogger f6817a = AmsLogger.getLogger("MPS:VipRequestManager");

    /* renamed from: b */
    private static C1181g f6818b = null;

    /* renamed from: c */
    private static Context f6819c;

    /* renamed from: d */
    private final C1180f f6820d = new C1180f();

    private C1181g() {
    }

    /* renamed from: a */
    public static C1181g m5228a() {
        if (f6818b == null) {
            f6818b = new C1181g();
        }
        return f6818b;
    }

    /* renamed from: a */
    private String m5229a(int i4) {
        C1180f.a aVarM5224a = this.f6820d.m5224a(i4);
        if (aVarM5224a == null) {
            return null;
        }
        return aVarM5224a.m5226a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private Map<String, String> m5230a(String str, String str2, String[] strArr, Map<String, String> map) throws C1155c {
        int i4;
        String str3;
        str.hashCode();
        switch (str) {
            case "account":
                String strM5247f = m5247f();
                if (StringUtil.isEmpty(strM5247f)) {
                    throw new C1155c("account is empty");
                }
                map.put("account", strM5247f);
                return map;
            case "tags":
                if (strArr == null) {
                    throw new C1155c("tags array is empty");
                }
                StringBuilder sb = new StringBuilder();
                for (i4 = 0; i4 < strArr.length; i4++) {
                    if (i4 != strArr.length - 1 && !StringUtil.isEmpty(strArr[i4])) {
                        sb.append(strArr[i4]);
                        str3 = ",";
                    } else if (i4 == strArr.length - 1 && !StringUtil.isEmpty(strArr[i4])) {
                        str3 = strArr[i4];
                    }
                    sb.append(str3);
                }
                if (StringUtil.isEmpty(sb.toString())) {
                    throw new C1155c("tags array is empty");
                }
                map.put("tags", sb.toString());
                return map;
            case "alias":
                if (StringUtil.isEmpty(str2)) {
                    throw new C1155c("alias is empty");
                }
                map.put("alias", str2);
                return map;
            case "deviceId":
                String strM5246e = m5246e();
                if (StringUtil.isEmpty(strM5246e)) {
                    throw new C1155c("deviceId is empty.");
                }
                map.put("deviceId", strM5246e);
                return map;
            default:
                return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5231a(int i4, String str) {
        this.f6820d.m5225a(i4, str);
    }

    /* renamed from: a */
    public static void m5232a(Context context) {
        f6819c = context;
        if (f6818b == null) {
            f6818b = m5228a();
        }
    }

    /* renamed from: a */
    private void m5233a(C1155c c1155c, String str, CommonCallback commonCallback) {
        m5242a((Throwable) c1155c, str, commonCallback);
    }

    /* renamed from: a */
    private void m5234a(C1156d c1156d, String str, CommonCallback commonCallback) {
        m5242a((Throwable) c1156d, str, commonCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5239a(String str) {
        C1100c.m5010a().mo5001a("mps_account", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5240a(String str, long j4) {
        C1160a c1160aM5159a = C1160a.m5159a();
        InterfaceC1099b interfaceC1099bM5010a = C1100c.m5010a();
        if (c1160aM5159a == null || interfaceC1099bM5010a == null) {
            return;
        }
        c1160aM5159a.m5163a(str, interfaceC1099bM5010a.mo5002b(), j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5241a(String str, String str2, String str3) {
        C1160a c1160aM5159a = C1160a.m5159a();
        InterfaceC1099b interfaceC1099bM5010a = C1100c.m5010a();
        if (c1160aM5159a == null || interfaceC1099bM5010a == null) {
            return;
        }
        c1160aM5159a.m5165a(str, str2, interfaceC1099bM5010a.mo5002b(), str3);
    }

    /* renamed from: a */
    private void m5242a(Throwable th, String str, CommonCallback commonCallback) {
        ErrorCode errorCodeBuild = C1163c.f6734q.copy().msg(th.getMessage()).build();
        f6817a.m5020e(str + " Fail: errorCode:" + errorCodeBuild, th);
        if (commonCallback != null) {
            commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
        m5241a(errorCodeBuild.getCode(), errorCodeBuild.getMsg(), str);
    }

    /* renamed from: c */
    private static boolean m5244c(Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C1170b.m5186a(context, "KEY_LAUNCH_MARK"));
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
    }

    /* renamed from: e */
    private String m5246e() {
        return C1100c.m5010a().mo5002b();
    }

    /* renamed from: f */
    private String m5247f() {
        return C1100c.m5010a().mo5005c("mps_account");
    }

    /* renamed from: g */
    private Map<String, String> m5248g() {
        String strM5253b = m5253b();
        HashMap map = new HashMap();
        map.put(Constants.KEY_APP_KEY, strM5253b);
        map.put("os", MessageService.MSG_DB_NOTIFY_CLICK);
        map.put(Constants.SP_KEY_VERSION, "3.10.1");
        return map;
    }

    /* renamed from: a */
    public void m5249a(final int i4, final CommonCallback commonCallback) throws C1156d {
        String strM5229a;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AmsLogger amsLogger = f6817a;
        amsLogger.m5016d("listTags");
        if (1 == i4 && (strM5229a = m5229a(2)) != null) {
            amsLogger.m5016d("get from cache");
            if (commonCallback != null) {
                commonCallback.onSuccess(strM5229a);
                return;
            }
            return;
        }
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/list-tag", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.10
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C1181g.this.m5241a(str, str2, "/list-tag");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C1181g.this.m5240a("/list-tag", System.currentTimeMillis() - jCurrentTimeMillis);
                    if (1 == i4) {
                        C1181g.f6817a.m5016d("store cache");
                        C1181g.this.m5231a(2, str);
                    }
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM5248g = m5248g();
            if (i4 != 1) {
                throw new C1156d("target is invalid.");
            }
            Map<String, String> mapM5230a = m5230a("deviceId", (String) null, (String[]) null, mapM5248g);
            mapM5230a.put(Constants.KEY_TARGET, String.valueOf(i4));
            mapM5230a.put("VipRequestType", EnumC1169d.LIST_TAGS.m5185a() + "");
            asyncTaskC1182h.execute(mapM5230a);
        } catch (C1155c e4) {
            m5233a(e4, "/list-tag", commonCallback);
        } catch (C1156d e5) {
            m5234a(e5, "/list-tag", commonCallback);
        }
    }

    /* renamed from: a */
    public void m5250a(int i4, String[] strArr, String str, final CommonCallback commonCallback) throws C1156d {
        Map<String, String> mapM5230a;
        String str2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/bind-tag", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.8
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str3, String str4) {
                    C1181g.this.m5241a(str3, str4, "/bind-tag");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str3, str4);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str3) {
                    C1181g.this.m5240a("/bind-tag", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str3);
                    }
                }
            });
            if (strArr == null || strArr.length == 0) {
                throw new C1156d("tags is empty.");
            }
            Map<String, String> mapM5248g = m5248g();
            if (i4 == 1) {
                f6817a.m5016d("Binding tag to device.");
                mapM5230a = m5230a("deviceId", (String) null, (String[]) null, mapM5248g);
                str2 = EnumC1169d.BIND_TAG_TO_DEVICE.m5185a() + "";
            } else if (i4 == 2) {
                f6817a.m5016d("Binding tag to account.");
                mapM5230a = m5230a("account", (String) null, (String[]) null, mapM5248g);
                str2 = EnumC1169d.BIND_TAG_TO_ACCOUNT.m5185a() + "";
            } else {
                if (i4 != 3) {
                    throw new C1156d("target is invalid.");
                }
                mapM5230a = m5230a("alias", str, (String[]) null, mapM5248g);
                str2 = EnumC1169d.BIND_TAG_TO_ALIAS.m5185a() + "";
            }
            mapM5230a.put("VipRequestType", str2);
            Map<String, String> mapM5230a2 = m5230a("tags", (String) null, strArr, mapM5230a);
            mapM5230a2.put(Constants.KEY_TARGET, String.valueOf(i4));
            asyncTaskC1182h.execute(mapM5230a2);
        } catch (C1155c e4) {
            m5233a(e4, "/bind-tag", commonCallback);
        } catch (C1156d e5) {
            m5234a(e5, "/bind-tag", commonCallback);
        }
    }

    /* renamed from: a */
    public void m5251a(final CommonCallback commonCallback) {
        f6817a.m5016d("unbinding account");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/unbind-account", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.7
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                C1181g.this.m5241a(str, str2, "/unbind-account");
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onFailed(str, str2);
                }
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                C1181g.this.m5239a("");
                C1181g.this.m5240a("/unbind-account", System.currentTimeMillis() - jCurrentTimeMillis);
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onSuccess(str);
                }
            }
        });
        try {
            Map<String, String> mapM5248g = m5248g();
            mapM5248g.put("account", "");
            mapM5248g.put("VipRequestType", String.valueOf(EnumC1169d.UNBIND_ACCOUNT.m5185a()));
            asyncTaskC1182h.execute(m5230a("deviceId", (String) null, (String[]) null, mapM5248g));
        } catch (C1155c e4) {
            m5233a(e4, "/unbind-account", commonCallback);
        }
    }

    /* renamed from: a */
    public void m5252a(final String str, final CommonCallback commonCallback) throws C1156d {
        f6817a.m5016d("binding account" + str);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/bind-account", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.1
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C1181g.this.m5241a(str2, str3, "/bind-account");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C1181g.this.m5239a(str);
                    C1181g.this.m5240a("/bind-account", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM5248g = m5248g();
            if (StringUtil.isEmpty(str)) {
                throw new C1156d("account input is empty!");
            }
            mapM5248g.put("account", str);
            mapM5248g.put("VipRequestType", String.valueOf(EnumC1169d.BIND_ACCOUNT.m5185a()));
            asyncTaskC1182h.execute(m5230a("deviceId", (String) null, (String[]) null, mapM5248g));
        } catch (C1155c e4) {
            m5233a(e4, "/bind-account", commonCallback);
        } catch (C1156d e5) {
            m5234a(e5, "/bind-account", commonCallback);
        }
    }

    /* renamed from: b */
    public String m5253b() {
        return C1100c.m5010a().mo4998a();
    }

    /* renamed from: b */
    public void m5254b(int i4, String[] strArr, String str, final CommonCallback commonCallback) throws C1156d {
        Map<String, String> mapM5230a;
        String str2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/unbind-tag", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.9
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str3, String str4) {
                    C1181g.this.m5241a(str3, str4, "/unbind-tag");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str3, str4);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str3) {
                    if (commonCallback != null) {
                        C1181g.this.m5240a("/unbind-tag", System.currentTimeMillis() - jCurrentTimeMillis);
                        commonCallback.onSuccess(str3);
                    }
                }
            });
            Map<String, String> mapM5248g = m5248g();
            if (i4 == 1) {
                f6817a.m5016d("Unbinding tag from device.");
                mapM5230a = m5230a("deviceId", (String) null, (String[]) null, mapM5248g);
                str2 = EnumC1169d.UNBIND_TAG_TO_DEVICE.m5185a() + "";
            } else if (i4 == 2) {
                f6817a.m5016d("Unbinding tag from account.");
                mapM5230a = m5230a("account", (String) null, (String[]) null, mapM5248g);
                str2 = EnumC1169d.UNBIND_TAG_TO_ACCOUNT.m5185a() + "";
            } else {
                if (i4 != 3) {
                    throw new C1156d("target is invalid.");
                }
                f6817a.m5016d("Unbinding tag from alias.");
                mapM5230a = m5230a("alias", str, (String[]) null, mapM5248g);
                str2 = EnumC1169d.UNBIND_TAG_TO_ALIAS.m5185a() + "";
            }
            mapM5230a.put("VipRequestType", str2);
            Map<String, String> mapM5230a2 = m5230a("tags", (String) null, strArr, mapM5230a);
            mapM5230a2.put(Constants.KEY_TARGET, String.valueOf(i4));
            asyncTaskC1182h.execute(mapM5230a2);
        } catch (C1155c e4) {
            m5233a(e4, "/unbind-tag", commonCallback);
        } catch (C1156d e5) {
            m5234a(e5, "/unbind-tag", commonCallback);
        }
    }

    /* renamed from: b */
    public void m5255b(Context context) {
        if (m5244c(context)) {
            f6817a.m5019e("onAppStart has already sent today");
            return;
        }
        f6817a.m5016d("onAppStart");
        AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/active", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.6
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                C1181g.f6817a.m5019e("onAppStart failed. errorCode:" + str + " errorMsg:" + str2);
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                C1181g.f6817a.m5016d("onAppStart success");
                try {
                    C1170b.m5187a(C1181g.f6819c, "KEY_LAUNCH_MARK", System.currentTimeMillis());
                } catch (Throwable th) {
                    C1181g.f6817a.m5020e("onAppStart success", th);
                }
            }
        });
        try {
            Map<String, String> mapM5248g = m5248g();
            mapM5248g.put("VipRequestType", String.valueOf(EnumC1169d.ON_APP_START.m5185a()));
            asyncTaskC1182h.execute(m5230a("deviceId", (String) null, (String[]) null, mapM5248g));
        } catch (C1155c e4) {
            m5233a(e4, "/active", (CommonCallback) null);
        }
    }

    /* renamed from: b */
    public void m5256b(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AmsLogger amsLogger = f6817a;
        amsLogger.m5016d("listAliases");
        String strM5229a = m5229a(1);
        if (strM5229a != null) {
            amsLogger.m5016d("get from cache");
            if (commonCallback != null) {
                commonCallback.onSuccess(strM5229a);
                return;
            }
            return;
        }
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/list-alias", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.13
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C1181g.this.m5241a(str, str2, "/list-alias");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C1181g.f6817a.m5016d("store cache");
                    C1181g.this.m5231a(1, str);
                    C1181g.this.m5240a("/list-alias", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM5248g = m5248g();
            mapM5248g.put("VipRequestType", EnumC1169d.LIST_ALIASES.m5185a() + "");
            asyncTaskC1182h.execute(m5230a("deviceId", (String) null, (String[]) null, mapM5248g));
        } catch (C1155c e4) {
            m5233a(e4, "/list-alias", commonCallback);
        }
    }

    /* renamed from: b */
    public void m5257b(String str, final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f6817a.m5016d("Adding alias to device");
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/add-alias", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.11
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C1181g.this.m5241a(str2, str3, "/add-alias");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C1181g.this.m5240a("/add-alias", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM5230a = m5230a("alias", str, (String[]) null, m5230a("deviceId", (String) null, (String[]) null, m5248g()));
            mapM5230a.put("VipRequestType", String.valueOf(EnumC1169d.BIND_ALIAS.m5185a()));
            asyncTaskC1182h.execute(mapM5230a);
        } catch (C1155c e4) {
            m5233a(e4, "/add-alias", commonCallback);
        }
    }

    /* renamed from: c */
    public void m5258c(final CommonCallback commonCallback) {
        f6817a.m5016d("check vip push status");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/push-status", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.14
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C1181g.this.m5241a(str, str2, "/push-status");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C1181g.this.m5240a("/push-status", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM5230a = m5230a("deviceId", (String) null, (String[]) null, m5248g());
            mapM5230a.put("VipRequestType", String.valueOf(EnumC1169d.CHECK_PUSH_STATUS.m5185a()));
            asyncTaskC1182h.execute(mapM5230a);
        } catch (C1155c e4) {
            m5233a(e4, "/push-status", commonCallback);
        }
    }

    /* renamed from: c */
    public void m5259c(String str, final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f6817a.m5016d("Removing alias from device");
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/remove-alias", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.12
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C1181g.this.m5241a(str2, str3, "/remove-alias");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C1181g.this.m5240a("/remove-alias", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM5230a = m5230a("deviceId", (String) null, (String[]) null, m5248g());
            if (StringUtil.isEmpty(str)) {
                str = "";
            }
            mapM5230a.put("alias", str);
            mapM5230a.put("VipRequestType", String.valueOf(EnumC1169d.UNBIND_ALIAS.m5185a()));
            asyncTaskC1182h.execute(mapM5230a);
        } catch (C1155c e4) {
            m5233a(e4, "/remove-alias", commonCallback);
        }
    }

    /* renamed from: d */
    public void m5260d(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f6817a.m5016d("unbinding vip");
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/push-switch", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.2
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C1181g.this.m5241a(str, str2, "/push-switch");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C1181g.this.m5240a("/push-switch", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM5230a = m5230a("deviceId", (String) null, (String[]) null, m5248g());
            mapM5230a.put("VipRequestType", String.valueOf(EnumC1169d.TURN_OFF_PUSH.m5185a()));
            mapM5230a.put("enable", RequestConstant.FALSE);
            asyncTaskC1182h.execute(mapM5230a);
        } catch (C1155c e4) {
            m5233a(e4, "/push-switch false", commonCallback);
        }
    }

    /* renamed from: d */
    public void m5261d(String str, final CommonCallback commonCallback) throws C1156d {
        f6817a.m5016d("binding phoneNumber:" + str);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/set-phone", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.4
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str2, String str3) {
                    C1181g.this.m5241a(str2, str3, "/set-phone");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str2, str3);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str2) {
                    C1181g.this.m5240a("/set-phone", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str2);
                    }
                }
            });
            Map<String, String> mapM5248g = m5248g();
            if (StringUtil.isEmpty(str)) {
                throw new C1156d("account input is empty!");
            }
            mapM5248g.put("mob", str);
            mapM5248g.put("VipRequestType", String.valueOf(EnumC1169d.BIND_PHONE_NUMBER.m5185a()));
            asyncTaskC1182h.execute(m5230a("deviceId", (String) null, (String[]) null, mapM5248g));
        } catch (C1155c e4) {
            m5233a(e4, "/set-phone", commonCallback);
        } catch (C1156d e5) {
            m5234a(e5, "/set-phone", commonCallback);
        }
    }

    /* renamed from: e */
    public void m5262e(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f6817a.m5016d("binding vip push");
        try {
            AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/push-switch", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.3
                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onFailed(String str, String str2) {
                    C1181g.this.m5241a(str, str2, "/push-switch");
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onFailed(str, str2);
                    }
                }

                @Override // com.alibaba.sdk.android.push.CommonCallback
                public void onSuccess(String str) {
                    C1181g.this.m5240a("/push-switch", System.currentTimeMillis() - jCurrentTimeMillis);
                    CommonCallback commonCallback2 = commonCallback;
                    if (commonCallback2 != null) {
                        commonCallback2.onSuccess(str);
                    }
                }
            });
            Map<String, String> mapM5230a = m5230a("deviceId", (String) null, (String[]) null, m5248g());
            mapM5230a.put("VipRequestType", String.valueOf(EnumC1169d.TURN_ON_PUSH.m5185a()));
            mapM5230a.put("enable", RequestConstant.TRUE);
            asyncTaskC1182h.execute(mapM5230a);
        } catch (C1155c e4) {
            m5233a(e4, "/push-switch true", commonCallback);
        }
    }

    /* renamed from: f */
    public void m5263f(final CommonCallback commonCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f6817a.m5016d("unbinding phone number");
        AsyncTaskC1182h asyncTaskC1182h = new AsyncTaskC1182h(f6819c, "https://" + C1096a.m4984c() + "/unset-phone", new CommonCallback() { // from class: com.alibaba.sdk.android.push.e.g.5
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                C1181g.this.m5241a(str, str2, "/unset-phone");
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onFailed(str, str2);
                }
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                C1181g.this.m5240a("/unset-phone", System.currentTimeMillis() - jCurrentTimeMillis);
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onSuccess(str);
                }
            }
        });
        try {
            Map<String, String> mapM5248g = m5248g();
            mapM5248g.put("VipRequestType", String.valueOf(EnumC1169d.UNBIND_PHONE_NUMBER.m5185a()));
            asyncTaskC1182h.execute(m5230a("deviceId", (String) null, (String[]) null, mapM5248g));
        } catch (C1155c e4) {
            m5233a(e4, "/unset-phone", commonCallback);
        }
    }
}
