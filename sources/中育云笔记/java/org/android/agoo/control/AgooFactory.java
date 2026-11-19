package org.android.agoo.control;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UtilityImpl;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.C10556a;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* loaded from: classes6.dex */
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
        ALog.m10116d(TAG, "v2 downgrade to v1 decrypt message", new Object[0]);
        List<String> utdids = UtilityImpl.getUtdids(Constants.SP_FILE_NAME, sContext);
        if (utdids != null && !utdids.isEmpty()) {
            for (int i10 = 0; i10 < utdids.size(); i10++) {
                String encryptedMsgWithoutAgooByUtdid = parseEncryptedMsgWithoutAgooByUtdid(str, str2, str3, utdids.get(i10));
                if (encryptedMsgWithoutAgooByUtdid != null) {
                    UtilityImpl.hitUtdid(Constants.SP_FILE_NAME, sContext, utdids.get(i10));
                    ALog.m10116d(TAG, "use v1 decrypt message successfully", new Object[0]);
                    return encryptedMsgWithoutAgooByUtdid;
                }
            }
        }
        return null;
    }

    private static Bundle getFlag(long j10, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j10).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2.toString());
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
                try {
                    if (sInstance == null) {
                        sInstance = new AgooFactory(context.getApplicationContext());
                    }
                } finally {
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
        this.messageService.m22254a(sContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle msgReceiverPreHandlerOnly(android.content.Context r20, byte[] r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.msgReceiverPreHandlerOnly(android.content.Context, byte[], java.lang.String, java.lang.String):android.os.Bundle");
    }

    public static String parseEncryptedMsg(String str) {
        try {
            String strM22234b = Config.m22234b(sContext);
            String strM22237c = Config.m22237c(sContext);
            if (TextUtils.isEmpty(strM22237c)) {
                ALog.m10118e(TAG, "getAppSign secret null", new Object[0]);
                return null;
            }
            String encryptedMsgWithoutAgoo = parseEncryptedMsgWithoutAgoo(str, strM22234b, strM22237c);
            if (encryptedMsgWithoutAgoo == null) {
                return downgradeV1(str, strM22234b, strM22237c);
            }
            try {
                new JSONObject(encryptedMsgWithoutAgoo);
                ALog.m10116d(TAG, "use v2 decrypt message successfully", new Object[0]);
                return encryptedMsgWithoutAgoo;
            } catch (Exception unused) {
                ALog.m10116d(TAG, "v2 decrypt error, need to downgrade", new Object[0]);
                return downgradeV1(str, strM22234b, strM22237c);
            }
        } catch (Throwable th) {
            ALog.m10117e(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
            return null;
        }
    }

    public static String parseEncryptedMsgWithoutAgoo(String str, String str2, String str3) {
        try {
            byte[] bArrM22246a = C10556a.m22246a(str3.getBytes("utf-8"), (str2 + str3).getBytes("utf-8"));
            if (bArrM22246a != null && bArrM22246a.length > 0) {
                return new String(C10556a.m22245a(Base64.decode(str, 8), new SecretKeySpec(C10556a.m22244a(bArrM22246a), "AES"), C10556a.m22244a(str2.getBytes("utf-8"))), "utf-8");
            }
            ALog.m10122w(TAG, "aesDecrypt key is null!", new Object[0]);
            return null;
        } catch (Throwable th) {
            ALog.m10122w(TAG, "parseEncryptedMsg body: ", str);
            ALog.m10122w(TAG, "parseEncryptedMsg appKey: ", str2);
            ALog.m10122w(TAG, "parseEncryptedMsg appSecret: ", str3);
            ALog.m10121w(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
            return null;
        }
    }

    public static String parseEncryptedMsgWithoutAgooByUtdid(String str, String str2, String str3, String str4) {
        try {
            byte[] bArrM22246a = C10556a.m22246a(str3.getBytes("utf-8"), (str2 + str4).getBytes("utf-8"));
            if (bArrM22246a != null && bArrM22246a.length > 0) {
                return new String(C10556a.m22245a(Base64.decode(str, 8), new SecretKeySpec(C10556a.m22244a(bArrM22246a), "AES"), C10556a.m22244a(str2.getBytes("utf-8"))), "utf-8");
            }
            ALog.m10122w(TAG, "aesDecrypt key is null!", new Object[0]);
            return null;
        } catch (Throwable th) {
            ALog.m10122w(TAG, "parseEncryptedMsg body: ", str);
            ALog.m10122w(TAG, "parseEncryptedMsg appKey: ", str2);
            ALog.m10122w(TAG, "parseEncryptedMsg appSecret: ", str3);
            ALog.m10122w(TAG, "parseEncryptedMsg utdid: ", str4);
            ALog.m10121w(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
            return null;
        }
    }

    private void sendMsgToBusiness(Context context, String str, Bundle bundle, boolean z10, String str2, TaoBaseService.ExtraInfo extraInfo) {
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
            ALog.m10117e(TAG, "sendMsgToBusiness", th, new Object[0]);
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i(TAG, "sendMsgToBusiness intent:" + bundle.toString() + ",utdid=" + AdapterUtilityImpl.getDeviceId(context) + ",pack=" + str + ",agooFlag=" + z10, new Object[0]);
        }
        if (z10) {
            return;
        }
        String agooCustomServiceName = AdapterGlobalClientInfo.getAgooCustomServiceName(context);
        if (TextUtils.isEmpty(agooCustomServiceName)) {
            ALog.m10118e(TAG, "sendMsgToBusiness failed, can not find custom service", new Object[0]);
        } else {
            intent.setClassName(str, agooCustomServiceName);
            IntentDispatch.dispatchIntent(context, intent, agooCustomServiceName);
        }
    }

    public void clickMessage(Context context, String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC10562f(this, str, str2));
    }

    public void dismissMessage(Context context, String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC10563g(this, str, str2));
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

    /* JADX WARN: Removed duplicated region for block: B:74:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle msgReceiverPreHandler(byte[] r27, java.lang.String r28, com.taobao.accs.base.TaoBaseService.ExtraInfo r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.msgReceiverPreHandler(byte[], java.lang.String, com.taobao.accs.base.TaoBaseService$ExtraInfo, boolean):android.os.Bundle");
    }

    public void reportCacheMsg() {
        try {
            ThreadPoolExecutorFactory.execute(new RunnableC10559c(this));
        } catch (Throwable th) {
            ALog.m10118e(TAG, "reportCacheMsg fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr) {
        saveMsg(bArr, "0");
    }

    public void setCacheMessageEnabled(boolean z10) {
        this.mCacheMessageEnabled = z10;
    }

    public void updateMsg(byte[] bArr, boolean z10) {
        ThreadPoolExecutorFactory.execute(new RunnableC10560d(this, bArr, z10));
    }

    public void updateMsgStatus(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m10119i(TAG, "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.m22241g(sContext), new Object[0]);
                }
                if (TextUtils.equals(str2, "8")) {
                    this.messageService.m22255a(str, "2");
                } else if (TextUtils.equals(str2, "9")) {
                    this.messageService.m22255a(str, "3");
                }
            }
        } catch (Throwable th) {
            ALog.m10118e(TAG, "updateNotifyMsg e=" + th.toString(), new Object[0]);
        }
    }

    public void updateNotifyMsg(String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC10561e(this, str, str2));
    }

    public void msgReceive(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m10119i(TAG, "into--[AgooFactory,msgReceive]:messageSource=" + str, new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new RunnableC10558b(this, bArr, str, extraInfo));
        } catch (Throwable th) {
            ALog.m10118e(TAG, "serviceImpl init task fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        ThreadPoolExecutorFactory.execute(new RunnableC10557a(this, bArr, str));
    }
}
