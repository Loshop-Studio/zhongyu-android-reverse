package org.android.agoo.control;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1851ai;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.C2956a;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AgooFactory {
    private static final String DEAL_MESSAGE = "accs.msgRecevie";
    private static final String TAG = "AgooFactory";
    private static Context sContext;
    private static AgooFactory sInstance;
    private NotifManager notifyManager = null;
    private MessageService messageService = null;
    private boolean mCacheMessageEnabled = true;

    private AgooFactory(Context context) {
        init(context, null, null);
    }

    private static boolean checkPackage(Context context, String str) {
        return context.getPackageManager().getApplicationInfo(str, 0) != null;
    }

    private static String downgradeV1(String str, String str2, String str3) {
        ALog.m6090d(TAG, "v2 downgrade to v1 decrypt message", new Object[0]);
        List<String> utdids = UtilityImpl.getUtdids(Constants.SP_FILE_NAME, sContext);
        if (utdids != null && !utdids.isEmpty()) {
            for (int i4 = 0; i4 < utdids.size(); i4++) {
                String encryptedMsgWithoutAgooByUtdid = parseEncryptedMsgWithoutAgooByUtdid(str, str2, str3, utdids.get(i4));
                if (encryptedMsgWithoutAgooByUtdid != null) {
                    UtilityImpl.hitUtdid(Constants.SP_FILE_NAME, sContext, utdids.get(i4));
                    ALog.m6090d(TAG, "use v1 decrypt message successfully", new Object[0]);
                    return encryptedMsgWithoutAgooByUtdid;
                }
            }
        }
        return null;
    }

    private static Bundle getFlag(long j4, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j4).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb.toString());
                    if (charArray[6] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_REPORT, "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_NOTIFICATION, "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    public static AgooFactory getInstance(Context context) {
        if (sInstance == null) {
            synchronized (AgooFactory.class) {
                if (sInstance == null) {
                    sInstance = new AgooFactory(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    private void init(Context context, NotifManager notifManager, MessageService messageService) {
        sContext = context.getApplicationContext();
        this.notifyManager = notifManager;
        if (notifManager == null) {
            this.notifyManager = new NotifManager();
        }
        this.notifyManager.init(sContext);
        this.messageService = messageService;
        if (messageService == null) {
            this.messageService = new MessageService();
        }
        this.messageService.m10036a(sContext);
    }

    public static Bundle msgReceiverPreHandlerOnly(Context context, byte[] bArr, String str, String str2) {
        JSONArray jSONArray;
        String str3;
        String str4;
        String str5 = "ext";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str6 = new String(bArr, "utf-8");
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.m6093i(TAG, "msgReceiveOnly,message--->[" + str6 + "],utdid=" + AdapterUtilityImpl.getDeviceId(context), new Object[0]);
                    }
                    if (TextUtils.isEmpty(str6)) {
                        ALog.m6093i(TAG, "handleMessage message==null,utdid=" + AdapterUtilityImpl.getDeviceId(context), new Object[0]);
                        return null;
                    }
                    JSONArray jSONArray2 = new JSONArray(str6);
                    int length = jSONArray2.length();
                    Bundle bundle = null;
                    String string = null;
                    int i4 = 0;
                    while (i4 < length) {
                        bundle = new Bundle();
                        JSONObject jSONObject = jSONArray2.getJSONObject(i4);
                        if (jSONObject == null) {
                            jSONArray = jSONArray2;
                            str3 = str5;
                            str4 = str6;
                        } else {
                            MsgDO msgDO = new MsgDO();
                            String string2 = jSONObject.getString(C1851ai.f8299av);
                            String string3 = jSONObject.getString(C1851ai.f8252aA);
                            String string4 = jSONObject.getString("b");
                            String str7 = str6;
                            long j4 = jSONObject.getLong("f");
                            if (!jSONObject.isNull(str5)) {
                                string = jSONObject.getString(str5);
                            }
                            int i5 = length - 1;
                            msgDO.msgIds = string3;
                            msgDO.extData = string;
                            msgDO.removePacks = string2;
                            msgDO.messageSource = str;
                            if (TextUtils.isEmpty(string4)) {
                                msgDO.errorCode = AgooConstants.ACK_BODY_NULL;
                            } else if (TextUtils.isEmpty(string2)) {
                                msgDO.errorCode = AgooConstants.ACK_PACK_NULL;
                            } else if (j4 == -1) {
                                msgDO.errorCode = AgooConstants.ACK_FLAG_NULL;
                            } else if (checkPackage(context, string2)) {
                                Bundle flag = getFlag(j4, msgDO);
                                String string5 = flag.getString(AgooConstants.MESSAGE_ENCRYPTED);
                                jSONArray = jSONArray2;
                                str3 = str5;
                                Log.d("wy", "encrypted: " + string5);
                                if (!context.getPackageName().equals(string2) || TextUtils.equals(string5, Integer.toString(4))) {
                                    bundle.putAll(flag);
                                    try {
                                        String string6 = jSONObject.getString("t");
                                        if (!TextUtils.isEmpty(string6)) {
                                            bundle.putString(AgooConstants.MESSAGE_TIME, string6);
                                        }
                                    } catch (Throwable unused) {
                                        if (ALog.isPrintLog(ALog.Level.I)) {
                                            ALog.m6093i(TAG, "agoo msg has no time", new Object[0]);
                                        }
                                    }
                                    bundle.putLong(AgooConstants.MESSAGE_TRACE, System.currentTimeMillis());
                                    bundle.putString("id", string3);
                                    bundle.putString(AgooConstants.MESSAGE_BODY, string4);
                                    bundle.putString("source", string2);
                                    bundle.putString(AgooConstants.MESSAGE_FROM_APPKEY, str2);
                                    bundle.putString(AgooConstants.MESSAGE_EXT, string);
                                    str4 = str7;
                                    bundle.putString(AgooConstants.MESSAGE_ORI, str4);
                                    bundle.putString("type", "common-push");
                                    bundle.putString(AgooConstants.MESSAGE_SOURCE, str);
                                } else {
                                    ALog.m6092e(TAG, "msgReceive msg encrypted flag not exist, cannot prase!!!", new Object[0]);
                                    msgDO.errorCode = AgooConstants.REPORT_NOT_ENCRYPT;
                                    str4 = str7;
                                }
                                i4++;
                                jSONArray2 = jSONArray;
                                str6 = str4;
                                str5 = str3;
                            } else {
                                ALog.m6090d(TAG, "msgReceive check package is del,pack=" + string2, new Object[0]);
                            }
                            jSONArray = jSONArray2;
                            str3 = str5;
                            str4 = str7;
                        }
                        i4++;
                        jSONArray2 = jSONArray;
                        str6 = str4;
                        str5 = str3;
                    }
                    return bundle;
                }
            } catch (Throwable th) {
                if (!ALog.isPrintLog(ALog.Level.E)) {
                    return null;
                }
                ALog.m6092e(TAG, "msgReceive is error,e=" + th, new Object[0]);
                return null;
            }
        }
        ALog.m6093i(TAG, "handleMessage data==null,utdid=" + AdapterUtilityImpl.getDeviceId(context), new Object[0]);
        return null;
    }

    public static String parseEncryptedMsg(String str) {
        try {
            String strM10016b = Config.m10016b(sContext);
            String strM10019c = Config.m10019c(sContext);
            if (TextUtils.isEmpty(strM10019c)) {
                ALog.m6092e(TAG, "getAppSign secret null", new Object[0]);
                return null;
            }
            String encryptedMsgWithoutAgoo = parseEncryptedMsgWithoutAgoo(str, strM10016b, strM10019c);
            if (encryptedMsgWithoutAgoo == null) {
                return downgradeV1(str, strM10016b, strM10019c);
            }
            boolean z3 = true;
            try {
                new JSONObject(encryptedMsgWithoutAgoo);
            } catch (Exception unused) {
                ALog.m6090d(TAG, "v2 decrypt error, need to downgrade", new Object[0]);
                z3 = false;
            }
            if (!z3) {
                return downgradeV1(str, strM10016b, strM10019c);
            }
            ALog.m6090d(TAG, "use v2 decrypt message successfully", new Object[0]);
            return encryptedMsgWithoutAgoo;
        } catch (Throwable th) {
            ALog.m6091e(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
            return null;
        }
    }

    public static String parseEncryptedMsgWithoutAgoo(String str, String str2, String str3) {
        String str4 = null;
        try {
            byte[] bArrM10028a = C2956a.m10028a(str3.getBytes("utf-8"), (str2 + str3).getBytes("utf-8"));
            if (bArrM10028a == null || bArrM10028a.length <= 0) {
                ALog.m6096w(TAG, "aesDecrypt key is null!", new Object[0]);
            } else {
                str4 = new String(C2956a.m10027a(Base64.decode(str, 8), new SecretKeySpec(C2956a.m10026a(bArrM10028a), "AES"), C2956a.m10026a(str2.getBytes("utf-8"))), "utf-8");
            }
        } catch (Throwable th) {
            ALog.m6096w(TAG, "parseEncryptedMsg body: ", str);
            ALog.m6096w(TAG, "parseEncryptedMsg appKey: ", str2);
            ALog.m6096w(TAG, "parseEncryptedMsg appSecret: ", str3);
            ALog.m6095w(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
        }
        return str4;
    }

    public static String parseEncryptedMsgWithoutAgooByUtdid(String str, String str2, String str3, String str4) {
        String str5 = null;
        try {
            byte[] bArrM10028a = C2956a.m10028a(str3.getBytes("utf-8"), (str2 + str4).getBytes("utf-8"));
            if (bArrM10028a == null || bArrM10028a.length <= 0) {
                ALog.m6096w(TAG, "aesDecrypt key is null!", new Object[0]);
            } else {
                str5 = new String(C2956a.m10027a(Base64.decode(str, 8), new SecretKeySpec(C2956a.m10026a(bArrM10028a), "AES"), C2956a.m10026a(str2.getBytes("utf-8"))), "utf-8");
            }
        } catch (Throwable th) {
            ALog.m6096w(TAG, "parseEncryptedMsg body: ", str);
            ALog.m6096w(TAG, "parseEncryptedMsg appKey: ", str2);
            ALog.m6096w(TAG, "parseEncryptedMsg appSecret: ", str3);
            ALog.m6096w(TAG, "parseEncryptedMsg utdid: ", str4);
            ALog.m6095w(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
        }
        return str5;
    }

    private void sendMsgToBusiness(Context context, String str, Bundle bundle, boolean z3, String str2, TaoBaseService.ExtraInfo extraInfo) {
        Intent intent = new Intent();
        intent.setAction("org.agoo.android.intent.action.RECEIVE");
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.putExtra("type", "common-push");
        intent.putExtra(AgooConstants.MESSAGE_SOURCE, str2);
        intent.addFlags(32);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable(AgooConstants.MESSAGE_ACCS_EXTRA, extraInfo);
            intent.putExtra(AgooConstants.MESSAGE_AGOO_BUNDLE, bundle2);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "sendMsgToBusiness", th, new Object[0]);
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m6093i(TAG, "sendMsgToBusiness intent:" + bundle.toString() + ",utdid=" + AdapterUtilityImpl.getDeviceId(context) + ",pack=" + str + ",agooFlag=" + z3, new Object[0]);
        }
        if (z3) {
            return;
        }
        String agooCustomServiceName = AdapterGlobalClientInfo.getAgooCustomServiceName(context);
        if (TextUtils.isEmpty(agooCustomServiceName)) {
            ALog.m6092e(TAG, "sendMsgToBusiness failed, can not find custom service", new Object[0]);
        } else {
            intent.setClassName(str, agooCustomServiceName);
            IntentDispatch.dispatchIntent(context, intent, agooCustomServiceName);
        }
    }

    public void clickMessage(Context context, String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC2962f(this, str, str2));
    }

    public void dismissMessage(Context context, String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC2963g(this, str, str2));
    }

    public MessageService getMessageService() {
        return this.messageService;
    }

    public NotifManager getNotifyManager() {
        return this.notifyManager;
    }

    public boolean isCacheMessageEnabled() {
        return this.mCacheMessageEnabled;
    }

    public void msgReceive(byte[] bArr, String str) {
        msgReceive(bArr, str, null);
    }

    public Bundle msgReceiverPreHandler(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo, boolean z3) {
        JSONArray jSONArray;
        String str2;
        StringBuilder sb;
        boolean z4;
        String str3;
        String str4;
        Bundle bundle;
        StringBuilder sb2;
        String str5;
        int i4;
        int i5;
        String str6 = ",";
        String str7 = "ext";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str8 = new String(bArr, "utf-8");
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.m6093i(TAG, "msgReceive,message--->[" + str8 + "],utdid=" + AdapterUtilityImpl.getDeviceId(sContext), new Object[0]);
                    }
                    if (TextUtils.isEmpty(str8)) {
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, AdapterUtilityImpl.getDeviceId(sContext), "message==null");
                        ALog.m6093i(TAG, "handleMessage message==null,utdid=" + AdapterUtilityImpl.getDeviceId(sContext), new Object[0]);
                        return null;
                    }
                    JSONArray jSONArray2 = new JSONArray(str8);
                    int length = jSONArray2.length();
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder sb4 = new StringBuilder();
                    Bundle bundle2 = null;
                    String str9 = null;
                    int i6 = 0;
                    while (i6 < length) {
                        Bundle bundle3 = new Bundle();
                        JSONObject jSONObject = jSONArray2.getJSONObject(i6);
                        if (jSONObject == null) {
                            jSONArray = jSONArray2;
                            i4 = i6;
                            sb2 = sb4;
                            i5 = length;
                            str5 = str8;
                            str3 = str6;
                            str2 = str7;
                            bundle = bundle3;
                            sb = sb3;
                        } else {
                            MsgDO msgDO = new MsgDO();
                            jSONArray = jSONArray2;
                            String string = jSONObject.getString(C1851ai.f8299av);
                            String str10 = str9;
                            String string2 = jSONObject.getString(C1851ai.f8252aA);
                            String str11 = str8;
                            String string3 = jSONObject.getString("b");
                            StringBuilder sb5 = sb4;
                            StringBuilder sb6 = sb3;
                            long j4 = jSONObject.getLong("f");
                            String string4 = !jSONObject.isNull(str7) ? jSONObject.getString(str7) : str10;
                            str2 = str7;
                            int i7 = length - 1;
                            msgDO.msgIds = string2;
                            msgDO.extData = string4;
                            msgDO.removePacks = string;
                            msgDO.messageSource = str;
                            if (TextUtils.isEmpty(string3)) {
                                msgDO.errorCode = AgooConstants.ACK_BODY_NULL;
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else if (TextUtils.isEmpty(string)) {
                                msgDO.errorCode = AgooConstants.ACK_PACK_NULL;
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else if (j4 == -1) {
                                msgDO.errorCode = AgooConstants.ACK_FLAG_NULL;
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else {
                                int i8 = length;
                                if (checkPackage(sContext, string)) {
                                    sb = sb6;
                                    Bundle flag = getFlag(j4, msgDO);
                                    String string5 = flag.getString(AgooConstants.MESSAGE_ENCRYPTED);
                                    int i9 = i6;
                                    if (!sContext.getPackageName().equals(string)) {
                                        z4 = true;
                                    } else if (TextUtils.equals(string5, Integer.toString(4))) {
                                        z4 = false;
                                    } else {
                                        ALog.m6092e(TAG, "msgReceive msg encrypted flag not exist, cannot prase!!!", new Object[0]);
                                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, AdapterUtilityImpl.getDeviceId(sContext), "encrypted!=4", AgooConstants.ACK_PACK_ERROR);
                                        msgDO.errorCode = AgooConstants.REPORT_NOT_ENCRYPT;
                                        this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                        str4 = string4;
                                        sb2 = sb5;
                                        str3 = str6;
                                        i4 = i9;
                                    }
                                    bundle3.putAll(flag);
                                    try {
                                        String string6 = jSONObject.getString("t");
                                        if (!TextUtils.isEmpty(string6)) {
                                            bundle3.putString(AgooConstants.MESSAGE_TIME, string6);
                                        }
                                    } catch (Throwable unused) {
                                        if (ALog.isPrintLog(ALog.Level.I)) {
                                            ALog.m6093i(TAG, "agoo msg has no time", new Object[0]);
                                        }
                                    }
                                    str3 = str6;
                                    bundle3.putLong(AgooConstants.MESSAGE_TRACE, System.currentTimeMillis());
                                    bundle3.putString("id", string2);
                                    bundle3.putString(AgooConstants.MESSAGE_BODY, string3);
                                    bundle3.putString("source", string);
                                    bundle3.putString(AgooConstants.MESSAGE_FROM_APPKEY, Config.m10016b(sContext));
                                    bundle3.putString(AgooConstants.MESSAGE_EXT, string4);
                                    bundle3.putString(AgooConstants.MESSAGE_ORI, str11);
                                    if (z3) {
                                        str4 = string4;
                                        bundle = bundle3;
                                        i4 = i9;
                                        sb2 = sb5;
                                        sb = sb;
                                        i5 = i8;
                                        str5 = str11;
                                        sendMsgToBusiness(sContext, string, bundle, z4, str, extraInfo);
                                    } else {
                                        str4 = string4;
                                        bundle = bundle3;
                                        sb2 = sb5;
                                        str5 = str11;
                                        i4 = i9;
                                        sb = sb;
                                        i5 = i8;
                                        bundle.putString("type", "common-push");
                                        bundle.putString(AgooConstants.MESSAGE_SOURCE, str);
                                    }
                                    str9 = str4;
                                } else {
                                    ALog.m6090d(TAG, "msgReceive check package is del,pack=" + string, new Object[0]);
                                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, AdapterUtilityImpl.getDeviceId(sContext), "deletePack", string);
                                    sb5.append(string);
                                    sb6.append(string2);
                                    if (i6 < i7) {
                                        sb5.append(str6);
                                        sb6.append(str6);
                                    }
                                    sb = sb6;
                                    str4 = string4;
                                    i4 = i6;
                                    sb2 = sb5;
                                    str3 = str6;
                                }
                                str5 = str11;
                                bundle = bundle3;
                                i5 = i8;
                                str9 = str4;
                            }
                            str4 = string4;
                            i4 = i6;
                            i5 = length;
                            str3 = str6;
                            str5 = str11;
                            bundle = bundle3;
                            sb = sb6;
                            sb2 = sb5;
                            str9 = str4;
                        }
                        i6 = i4 + 1;
                        sb4 = sb2;
                        bundle2 = bundle;
                        sb3 = sb;
                        str6 = str3;
                        length = i5;
                        str8 = str5;
                        str7 = str2;
                        jSONArray2 = jSONArray;
                    }
                    StringBuilder sb7 = sb4;
                    StringBuilder sb8 = sb3;
                    if (sb7.length() > 0) {
                        MsgDO msgDO2 = new MsgDO();
                        msgDO2.msgIds = sb8.toString();
                        msgDO2.removePacks = sb7.toString();
                        msgDO2.errorCode = AgooConstants.ACK_REMOVE_PACKAGE;
                        msgDO2.messageSource = str;
                        this.notifyManager.handlerACKMessage(msgDO2, extraInfo);
                    }
                    return bundle2;
                }
            } catch (Throwable th) {
                if (!ALog.isPrintLog(ALog.Level.E)) {
                    return null;
                }
                ALog.m6092e(TAG, "msgReceive is error,e=" + th, new Object[0]);
                return null;
            }
        }
        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, AdapterUtilityImpl.getDeviceId(sContext), "data==null");
        ALog.m6093i(TAG, "handleMessage data==null,utdid=" + AdapterUtilityImpl.getDeviceId(sContext), new Object[0]);
        return null;
    }

    public void reportCacheMsg() {
        try {
            ThreadPoolExecutorFactory.execute(new RunnableC2959c(this));
        } catch (Throwable th) {
            ALog.m6092e(TAG, "reportCacheMsg fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr) {
        saveMsg(bArr, MessageService.MSG_DB_READY_REPORT);
    }

    public void setCacheMessageEnabled(boolean z3) {
        this.mCacheMessageEnabled = z3;
    }

    public void updateMsg(byte[] bArr, boolean z3) {
        ThreadPoolExecutorFactory.execute(new RunnableC2960d(this, bArr, z3));
    }

    public void updateMsgStatus(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m6093i(TAG, "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.m10023g(sContext), new Object[0]);
                }
                if (TextUtils.equals(str2, MessageService.MSG_ACCS_NOTIFY_CLICK)) {
                    this.messageService.m10037a(str, MessageService.MSG_DB_NOTIFY_CLICK);
                } else if (TextUtils.equals(str2, MessageService.MSG_ACCS_NOTIFY_DISMISS)) {
                    this.messageService.m10037a(str, MessageService.MSG_DB_NOTIFY_DISMISS);
                }
            }
        } catch (Throwable th) {
            ALog.m6092e(TAG, "updateNotifyMsg e=" + th.toString(), new Object[0]);
        }
    }

    public void updateNotifyMsg(String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC2961e(this, str, str2));
    }

    public void msgReceive(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m6093i(TAG, "into--[AgooFactory,msgReceive]:messageSource=" + str, new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new RunnableC2958b(this, bArr, str, extraInfo));
        } catch (Throwable th) {
            ALog.m6092e(TAG, "serviceImpl init task fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        ThreadPoolExecutorFactory.execute(new RunnableC2957a(this, bArr, str));
    }
}
