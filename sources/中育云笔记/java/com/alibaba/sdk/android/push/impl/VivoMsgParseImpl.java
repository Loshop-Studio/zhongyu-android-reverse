package com.alibaba.sdk.android.push.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class VivoMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    public static final String TAG = "MPS:VivoMsgParseImpl";
    private Context context;

    private String fixVivoMsg(String str, Intent intent) throws JSONException {
        Context context;
        ALog.m10119i(TAG, "fixVivoMsg intent:" + printBundle(intent.getExtras(), 1), new Object[0]);
        if (str == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (!jSONObject.has("p") && (context = this.context) != null) {
                        jSONObject.put("p", context.getPackageName());
                    }
                    if (!jSONObject.has("ext")) {
                        jSONObject.put("ext", intent.getStringExtra("ext"));
                    }
                    if (!jSONObject.has("b")) {
                        jSONObject.put("b", intent.getStringExtra("b"));
                    }
                    if (!jSONObject.has("f")) {
                        jSONObject.put("f", intent.getLongExtra("f", 0L));
                    }
                    if (!jSONObject.has("i")) {
                        jSONObject.put("i", intent.getStringExtra("i"));
                    }
                    jSONArray.put(i10, jSONObject);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            return jSONArray.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    private static String printBundle(Bundle bundle, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                for (int i11 = 0; i11 < i10; i11++) {
                    sb2.append('\t');
                }
                if (obj instanceof String) {
                    sb2.append("String\t");
                    sb2.append(str);
                    sb2.append('\t');
                    sb2.append(obj);
                    sb2.append('\n');
                } else if (obj instanceof Integer) {
                    sb2.append("int\t");
                    sb2.append(str);
                    sb2.append('\t');
                    sb2.append(obj);
                    sb2.append('\n');
                } else if (obj instanceof Long) {
                    sb2.append("long\t");
                    sb2.append(str);
                    sb2.append('\t');
                    sb2.append(obj);
                    sb2.append('\n');
                } else if (obj instanceof Boolean) {
                    sb2.append("boolean\t");
                    sb2.append(str);
                    sb2.append('\t');
                    sb2.append(obj);
                    sb2.append('\n');
                } else if (obj instanceof Bundle) {
                    sb2.append("Bundle\t");
                    sb2.append(str);
                    sb2.append('\t');
                    sb2.append('\n');
                    sb2.append(printBundle((Bundle) obj, i10 + 1));
                } else {
                    sb2.append("unknown\t");
                    sb2.append(str);
                    sb2.append('\t');
                    sb2.append(obj);
                    sb2.append('\n');
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO;
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String strFixVivoMsg = null;
        if (intent == null) {
            ALog.m10118e(TAG, "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_VIVO_PAYLOAD);
            ALog.m10119i(TAG, "parseMsgFromIntent msg:" + stringExtra, new Object[0]);
            strFixVivoMsg = fixVivoMsg(stringExtra, intent);
            ALog.m10119i(TAG, "after fixup msg:" + strFixVivoMsg, new Object[0]);
            return strFixVivoMsg;
        } catch (Throwable th) {
            ALog.m10117e(TAG, "parseMsgFromIntent ", th, new Object[0]);
            return strFixVivoMsg;
        }
    }

    public void setContext(Context context) {
        this.context = context.getApplicationContext();
    }
}
