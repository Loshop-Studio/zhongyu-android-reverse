package com.taobao.agoo.p066a;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.C1804a;
import com.taobao.agoo.C1811b;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.IListAliasCallback;
import com.taobao.agoo.IListAliasCallbackInner;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.p066a.p067a.AbstractC1807b;
import com.taobao.agoo.p066a.p067a.C1806a;
import com.taobao.agoo.p066a.p067a.C1808c;
import com.taobao.agoo.p066a.p067a.C1809d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.Config;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.b */
/* loaded from: classes.dex */
public class C1810b extends AccsAbstractDataListener {

    /* renamed from: b */
    public static C1805a f7881b;

    /* renamed from: a */
    public Map<String, ICallback> f7882a = new HashMap();

    public C1810b(Context context) {
        if (f7881b == null) {
            f7881b = new C1805a(context.getApplicationContext());
        }
    }

    /* renamed from: a */
    private void m6181a(JSONObject jSONObject, IListAliasCallback iListAliasCallback) {
        Map<String, String> map = JsonUtility.getMap(jSONObject, C1806a.JSON_ALIAS_TOKEN_MAP);
        if (map == null) {
            map = new HashMap<>();
        }
        if (iListAliasCallback != null) {
            if (iListAliasCallback instanceof IListAliasCallbackInner) {
                ((IListAliasCallbackInner) iListAliasCallback).onSuccess(map);
            } else {
                iListAliasCallback.onSuccess(new ArrayList(map.keySet()));
            }
        }
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i4, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListenerV2
    public void onResponse(String str, String str2, int i4, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        String string;
        boolean zEquals;
        try {
            if ("AgooDeviceCmd".equals(str)) {
                ICallback iCallback = this.f7882a.get(str2);
                if (i4 == AccsErrorCode.SUCCESS.getCodeInt()) {
                    String str4 = new String(bArr, "utf-8");
                    ALog.m6093i("RequestListener", "RequestListener onResponse", Constants.KEY_DATA_ID, str2, "listener", iCallback, "json", str4);
                    JSONObject jSONObject = new JSONObject(str4);
                    String string2 = JsonUtility.getString(jSONObject, AbstractC1807b.JSON_ERRORCODE, null);
                    String string3 = JsonUtility.getString(jSONObject, AbstractC1807b.JSON_CMD, null);
                    if (!AbstractC1807b.JSON_SUCCESS.equals(string2)) {
                        if (iCallback != null) {
                            ErrorCode errorCodeBuild = C1804a.m6163a(string2, string3 + "报错").build();
                            iCallback.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                        }
                        if (zEquals) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (C1808c.JSON_CMD_REGISTER.equals(string3)) {
                        String string4 = JsonUtility.getString(jSONObject, "deviceId", null);
                        if (!TextUtils.isEmpty(string4)) {
                            Config.m10017b(GlobalClientInfo.getContext(), string4);
                            f7881b.m6167a(GlobalClientInfo.getContext().getPackageName());
                            if (iCallback instanceof IRegister) {
                                UtilityImpl.saveUtdid(Config.PREFERENCES, GlobalClientInfo.getContext());
                                ((IRegister) iCallback).onSuccess(string4);
                            }
                        } else if (iCallback != null) {
                            ErrorCode errorCodeBuild2 = C1804a.m6163a(AbstractC1807b.JSON_SUCCESS, string3 + "成功，但是未返回deviceId").detail(str4).build();
                            iCallback.onFailure(errorCodeBuild2.getCode(), errorCodeBuild2.getMsg());
                        }
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f7882a.remove(str2);
                            return;
                        }
                        return;
                    }
                    if (C1806a.JSON_CMD_ADDALIAS.equals(string3) && (string = JsonUtility.getString(jSONObject, "pushAliasToken", null)) != null && iCallback.extra != null) {
                        C1811b.m6185a(GlobalClientInfo.getContext(), iCallback.extra, string);
                    }
                    if (C1806a.JSON_CMD_REMOVEALIAS.equals(string3) && iCallback.extra != null) {
                        C1811b.m6185a(GlobalClientInfo.getContext(), iCallback.extra, null);
                    }
                    if (!C1806a.JSON_CMD_ADDALIAS.equals(string3) && !C1806a.JSON_CMD_REMOVEALIAS.equals(string3) && !C1806a.JSON_CMD_REMOVEALLALIAS.equals(string3) && !C1806a.JSON_CMD_REMOVEALLALIASANDADDALIAS.equals(string3) && !C1806a.JSON_CMD_RESETAlIASANDBINDCURRENT.equals(string3) && !C1806a.JSON_CMD_RESETALIASDEVICEONE2ONE.equals(string3)) {
                        if (C1806a.JSON_CMD_LISTALIAS.equals(string3)) {
                            m6181a(jSONObject, (IListAliasCallback) iCallback);
                            if ("AgooDeviceCmd".equals(str)) {
                                this.f7882a.remove(str2);
                                return;
                            }
                            return;
                        }
                        if ((C1809d.JSON_CMD_ENABLEPUSH.equals(string3) || C1809d.JSON_CMD_DISABLEPUSH.equals(string3)) && iCallback != null) {
                            iCallback.onSuccess();
                        }
                    }
                    if (iCallback != null) {
                        iCallback.onSuccess();
                    }
                    if ("AgooDeviceCmd".equals(str)) {
                        this.f7882a.remove(str2);
                        return;
                    }
                    return;
                }
                if (iCallback != null) {
                    ErrorCode errorCodeBuild3 = C1804a.m6162a(i4, str3).build();
                    iCallback.onFailure(errorCodeBuild3.getCode(), errorCodeBuild3.getMsg());
                }
            }
            if (!"AgooDeviceCmd".equals(str)) {
                return;
            }
        } catch (Throwable th) {
            try {
                ALog.m6091e("RequestListener", "onResponse", th, new Object[0]);
                if (!"AgooDeviceCmd".equals(str)) {
                    return;
                }
            } finally {
                if ("AgooDeviceCmd".equals(str)) {
                    this.f7882a.remove(str2);
                }
            }
        }
        this.f7882a.remove(str2);
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i4, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i4, TaoBaseService.ExtraInfo extraInfo) {
    }
}
