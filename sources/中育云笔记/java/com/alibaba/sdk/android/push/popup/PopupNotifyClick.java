package com.alibaba.sdk.android.push.popup;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;
import com.taobao.agoo.BaseNotifyClick;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PopupNotifyClick extends BaseNotifyClick {
    static final String TAG = "PopupNotifyClick";
    private final PopupNotifyClickListener mPopupNotifyClickListener;

    public PopupNotifyClick(PopupNotifyClickListener popupNotifyClickListener) {
        this.mPopupNotifyClickListener = popupNotifyClickListener;
    }

    @Override // com.taobao.agoo.BaseNotifyClick
    public void onMessage(Intent intent) throws NumberFormatException {
        if (intent == null) {
            ALog.m10118e(TAG, "intent null, return", new Object[0]);
            return;
        }
        String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
        if (stringExtra != null) {
            ALog.m10119i(TAG, "Receive notification, body: " + stringExtra, new Object[0]);
            try {
                Map<String, String> map = JsonUtility.toMap(new JSONObject(stringExtra));
                String str = map.get("title");
                String str2 = map.get("content");
                String str3 = map.get("msg_id");
                int i10 = Integer.parseInt(map.get("type"));
                if (1 == i10) {
                    Map<String, String> map2 = JsonUtility.toMap(new JSONObject(map.get("ext")));
                    map2.put(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG, str3);
                    PopupNotifyClickListener popupNotifyClickListener = this.mPopupNotifyClickListener;
                    if (popupNotifyClickListener != null) {
                        popupNotifyClickListener.onSysNoticeOpened(str, str2, map2);
                        return;
                    } else {
                        ALog.m10118e(TAG, "PopupNotifyClickListener is null", new Object[0]);
                        return;
                    }
                }
                if (2 == i10) {
                    HashMap map3 = new HashMap();
                    map3.put(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG, str3);
                    PopupNotifyClickListener popupNotifyClickListener2 = this.mPopupNotifyClickListener;
                    if (popupNotifyClickListener2 != null) {
                        popupNotifyClickListener2.onSysNoticeOpened(str, str2, map3);
                    } else {
                        ALog.m10118e(TAG, "PopupNotifyClickListener is null", new Object[0]);
                    }
                }
            } catch (JSONException e10) {
                ALog.m10118e(TAG, "Parse json error, " + e10, new Object[0]);
            }
        }
    }

    @Override // com.taobao.agoo.BaseNotifyClick
    public void onNotPushData(Intent intent) {
        PopupNotifyClickListener popupNotifyClickListener = this.mPopupNotifyClickListener;
        if (popupNotifyClickListener instanceof OnPushParseFailedListener) {
            ((OnPushParseFailedListener) popupNotifyClickListener).onNotPushData(intent);
        }
    }

    @Override // com.taobao.agoo.BaseNotifyClick
    public void onParseFailed(Intent intent) {
        PopupNotifyClickListener popupNotifyClickListener = this.mPopupNotifyClickListener;
        if (popupNotifyClickListener instanceof OnPushParseFailedListener) {
            ((OnPushParseFailedListener) popupNotifyClickListener).onParseFailed(intent);
        }
    }
}
