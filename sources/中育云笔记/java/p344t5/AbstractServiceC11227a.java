package p344t5;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.BaseException;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.push.SendException;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p113d5.AbstractC8990a;
import p129e5.AbstractC9104a;
import p344t5.HandlerC11232f;
import p358u5.AbstractC11369c;

/* renamed from: t5.a */
/* loaded from: classes5.dex */
public abstract class AbstractServiceC11227a extends Service {
    public static final String PROXY_TYPE = "proxy_type";
    public static final String SUBJECT_ID = "subject_id";

    /* renamed from: a */
    private final Messenger f26936a = new Messenger(new HandlerC11232f(new b(this, null)));

    /* renamed from: t5.a$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f26937c;

        /* renamed from: d */
        public final /* synthetic */ String f26938d;

        public a(String str, String str2) {
            this.f26937c = str;
            this.f26938d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context applicationContext = AbstractServiceC11227a.this.getApplicationContext();
            if (this.f26938d.equals(AbstractC9104a.m17885d(applicationContext, this.f26937c))) {
                return;
            }
            HMSLog.m8727i("HmsMessageService", "receive a new token, refresh the local token");
            AbstractC9104a.m17889h(applicationContext, this.f26937c, this.f26938d);
        }
    }

    /* renamed from: t5.a$b */
    public class b implements HandlerC11232f.a {
        public b() {
        }

        @Override // p344t5.HandlerC11232f.a
        /* renamed from: a */
        public void mo24987a(Message message) {
            if (message == null) {
                HMSLog.m8725e("HmsMessageService", "receive message is null");
                return;
            }
            HMSLog.m8727i("HmsMessageService", "handle message start...");
            Bundle data = Message.obtain(message).getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                intent.putExtra("inputType", data.getInt("inputType", -1));
                AbstractServiceC11227a.this.handleIntentMessage(intent);
            }
        }

        public /* synthetic */ b(AbstractServiceC11227a abstractServiceC11227a, a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public final Bundle m24978a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("message_id", intent.getStringExtra("message_id"));
        bundle.putByteArray("message_body", intent.getByteArrayExtra("message_body"));
        bundle.putString("device_token", intent.getStringExtra("device_token"));
        if (intent.getIntExtra("inputType", -1) == 1) {
            bundle.putInt("inputType", 1);
        }
        return bundle;
    }

    /* renamed from: b */
    public final synchronized void m24979b(Intent intent, Bundle bundle, String str) {
        try {
            String stringExtra = intent.getStringExtra("device_token");
            m24982e(stringExtra, str);
            Context applicationContext = getApplicationContext();
            boolean zIsEmpty = TextUtils.isEmpty(AbstractC9104a.m17884c(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !zIsEmpty) {
                HMSLog.m8727i("HmsMessageService", "onNewToken to host app.");
                onNewToken(stringExtra);
                AbstractC9104a.m17883b(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] strArrM17887f = AbstractC9104a.m17887f(applicationContext);
                if (strArrM17887f != null && strArrM17887f.length != 0) {
                    for (int i10 = 0; i10 < strArrM17887f.length; i10++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, strArrM17887f[i10]);
                        HMSLog.m8727i("HmsMessageService", "onNewToken to sub app, subjectId:" + strArrM17887f[i10]);
                        onNewToken(stringExtra, bundle2);
                        m24982e(stringExtra, strArrM17887f[i10]);
                    }
                    AbstractC9104a.m17882a(applicationContext);
                }
                HMSLog.m8727i("HmsMessageService", "onNewToken to host app with bundle.");
                bundle.putString("belongId", intent.getStringExtra("belongId"));
                onNewToken(stringExtra, bundle);
                return;
            }
            HMSLog.m8727i("HmsMessageService", "onNewToken to sub app, subjectId:" + str);
            onNewToken(stringExtra, bundle);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m24980c(Intent intent, Bundle bundle, String str, int i10) {
        try {
            Context applicationContext = getApplicationContext();
            boolean zIsEmpty = TextUtils.isEmpty(AbstractC9104a.m17884c(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !zIsEmpty) {
                HMSLog.m8727i("HmsMessageService", "onTokenError to host app.");
                onTokenError(new BaseException(i10));
                AbstractC9104a.m17883b(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] strArrM17887f = AbstractC9104a.m17887f(applicationContext);
                if (strArrM17887f != null && strArrM17887f.length != 0) {
                    for (int i11 = 0; i11 < strArrM17887f.length; i11++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, strArrM17887f[i11]);
                        HMSLog.m8727i("HmsMessageService", "onTokenError to sub app, subjectId:" + strArrM17887f[i11]);
                        onTokenError(new BaseException(i10), bundle2);
                    }
                    AbstractC9104a.m17882a(applicationContext);
                }
                HMSLog.m8727i("HmsMessageService", "onTokenError to host app with bundle.");
                onTokenError(new BaseException(i10), bundle);
                return;
            }
            HMSLog.m8727i("HmsMessageService", "onTokenError to sub app, subjectId:" + str);
            onTokenError(new BaseException(i10), bundle);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public final void m24981d(Intent intent, String str) {
        ErrorEnum errorEnum = ErrorEnum.SUCCESS;
        int intExtra = intent.getIntExtra("error", errorEnum.m8226d());
        m24983f(PushNaming.GETTOKEN_ASYNC_RSP, str, intExtra);
        String stringExtra = intent.getStringExtra("subjectId");
        String stringExtra2 = intent.getStringExtra("message_proxy_type");
        HMSLog.m8727i("HmsMessageService", "doOnNewToken:transactionId = " + str + " , internalCode = " + intExtra + ",subjectId:" + stringExtra + ",proxyType:" + stringExtra2);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(stringExtra)) {
            bundle.putString(SUBJECT_ID, stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString(PROXY_TYPE, stringExtra2);
        }
        if (intExtra == errorEnum.m8226d()) {
            HMSLog.m8727i("HmsMessageService", "Apply token OnNewToken, subId: " + stringExtra);
            m24979b(intent, bundle, stringExtra);
            return;
        }
        HMSLog.m8727i("HmsMessageService", "Apply token failed, subId: " + stringExtra);
        m24980c(intent, bundle, stringExtra, intExtra);
    }

    public void doMsgReceived(Intent intent) {
        onMessageReceived(new RemoteMessage(m24978a(intent)));
    }

    /* renamed from: e */
    public final void m24982e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC8990a.m17533a(new a(str2, str));
    }

    /* renamed from: f */
    public final void m24983f(String str, String str2, int i10) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        AbstractC11369c.m25292a(getApplicationContext(), str, str2, i10);
    }

    /* renamed from: g */
    public final void m24984g(Intent intent) throws JSONException {
        HMSLog.m8727i("HmsMessageService", "parse batch response.");
        String stringExtra = intent.getStringExtra("batchMsgbody");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String strOptString = jSONObject.optString("transactionId");
                String strOptString2 = jSONObject.optString("msgId");
                int iOptInt = jSONObject.optInt("ret", ErrorEnum.ERROR_UNKNOWN.m8226d());
                if (ErrorEnum.SUCCESS.m8226d() == iOptInt) {
                    m24985h(strOptString, strOptString2);
                } else {
                    m24986i(strOptString, strOptString2, iOptInt);
                }
            }
        } catch (JSONException unused) {
            HMSLog.m8728w("HmsMessageService", "parse batch response failed.");
        }
    }

    /* renamed from: h */
    public final void m24985h(String str, String str2) {
        HMSLog.m8727i("HmsMessageService", "onMessageSent, message id:" + str2 + ", transactionId: " + str);
        m24983f(PushNaming.UPSEND_MSG_ASYNC_RSP, str, ErrorEnum.SUCCESS.m8226d());
        onMessageSent(str2);
    }

    public void handleIntentMessage(Intent intent) {
        if (intent == null) {
            HMSLog.m8725e("HmsMessageService", "receive message is null");
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("message_id");
            String stringExtra2 = intent.getStringExtra("message_type");
            String stringExtra3 = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
            if ("new_token".equals(stringExtra2)) {
                HMSLog.m8727i("HmsMessageService", "onNewToken");
                m24981d(intent, stringExtra3);
                return;
            }
            if ("received_message".equals(stringExtra2)) {
                HMSLog.m8727i("HmsMessageService", "onMessageReceived, message id:" + stringExtra);
                m24983f(PushNaming.RECEIVE_MSG_RSP, stringExtra, ErrorEnum.SUCCESS.m8226d());
                doMsgReceived(intent);
                return;
            }
            if ("sent_message".equals(stringExtra2)) {
                m24985h(stringExtra3, stringExtra);
                return;
            }
            if ("send_error".equals(stringExtra2)) {
                m24986i(stringExtra3, stringExtra, intent.getIntExtra("error", ErrorEnum.ERROR_UNKNOWN.m8226d()));
                return;
            }
            if ("delivery".equals(stringExtra2)) {
                int intExtra = intent.getIntExtra("error", ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.m8226d());
                HMSLog.m8727i("HmsMessageService", "onMessageDelivery, message id:" + stringExtra + ", status:" + intExtra + ", transactionId: " + stringExtra3);
                m24983f(PushNaming.UPSEND_RECEIPT, stringExtra3, intExtra);
                onMessageDelivered(stringExtra, new SendException(intExtra));
                return;
            }
            if ("server_deleted_message".equals(stringExtra2)) {
                HMSLog.m8727i("HmsMessageService", "delete message, message id:" + stringExtra);
                onDeletedMessages();
                return;
            }
            if ("batchSent".equals(stringExtra2)) {
                m24984g(intent);
                return;
            }
            HMSLog.m8725e("HmsMessageService", "Receive unknown message: " + stringExtra2);
        } catch (RuntimeException e10) {
            HMSLog.m8725e("HmsMessageService", "handle intent RuntimeException: " + e10.getMessage());
        } catch (Exception e11) {
            HMSLog.m8725e("HmsMessageService", "handle intent exception: " + e11.getMessage());
        }
    }

    /* renamed from: i */
    public final void m24986i(String str, String str2, int i10) {
        HMSLog.m8727i("HmsMessageService", "onSendError, message id:" + str2 + " error:" + i10 + ", transactionId: " + str);
        m24983f(PushNaming.UPSEND_MSG_ASYNC_RSP, str, i10);
        onSendError(str2, new SendException(i10));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.m8727i("HmsMessageService", "start to bind");
        return this.f26936a.getBinder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        HMSLog.m8727i("HmsMessageService", "start to destroy");
        super.onDestroy();
    }

    public void onNewToken(String str) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        HMSLog.m8727i("HmsMessageService", "start to command , startId = " + i11);
        handleIntentMessage(intent);
        return 2;
    }

    public void onTokenError(Exception exc) {
    }

    public void onNewToken(String str, Bundle bundle) {
    }

    public void onTokenError(Exception exc, Bundle bundle) {
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onMessageDelivered(String str, Exception exc) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
