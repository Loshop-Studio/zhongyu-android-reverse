package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ZIDManager {

    /* renamed from: c */
    public static ZIDManager f3049c;

    /* renamed from: a */
    public boolean f3050a = false;

    /* renamed from: b */
    public boolean f3051b = false;

    /* renamed from: com.umeng.umzid.ZIDManager$a */
    public class RunnableC3517a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f3052a;

        /* renamed from: b */
        public final /* synthetic */ IZIDCompletionCallback f3053b;

        public RunnableC3517a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.f3052a = context;
            this.f3053b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM4016a = ZIDManager.m4016a(ZIDManager.this, this.f3052a);
            if (TextUtils.isEmpty(strM4016a)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.f3053b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.f3053b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(strM4016a);
            }
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$b */
    public class RunnableC3518b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f3055a;

        public RunnableC3518b(Context context) {
            this.f3055a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.m4017b(ZIDManager.this, this.f3055a);
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$c */
    public class RunnableC3519c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f3057a;

        public RunnableC3519c(Context context) {
            this.f3057a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.m4016a(ZIDManager.this, this.f3057a);
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$d */
    public class RunnableC3520d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f3059a;

        public RunnableC3520d(Context context) {
            this.f3059a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.m4017b(ZIDManager.this, this.f3059a);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m4016a(ZIDManager zIDManager, Context context) {
        String strOptString = null;
        if (!zIDManager.f3050a) {
            zIDManager.f3050a = true;
            JSONObject jSONObject = new JSONObject();
            try {
                String id = Spy.getID();
                jSONObject.put("zdata", id);
                String strM4029c = C3523c.m4029c(context);
                jSONObject.put("mac", strM4029c);
                String strM4032d = C3523c.m4032d(context);
                jSONObject.put("oaid", strM4032d);
                zIDManager.m4018a(context, jSONObject);
                String strM4020a = C3521a.m4020a("https://aaid.umeng.com/api/postZdata", jSONObject.toString());
                if (!TextUtils.isEmpty(strM4020a)) {
                    JSONObject jSONObject2 = new JSONObject(strM4020a);
                    if (Boolean.valueOf(jSONObject2.optBoolean("suc")).booleanValue()) {
                        C3523c.m4035f(context, id);
                        C3523c.m4025a(context, strM4029c);
                        C3523c.m4028b(context, strM4032d);
                        strOptString = jSONObject2.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            C3523c.m4034e(context, strOptString);
                        }
                        String string = jSONObject2.getString("uabc");
                        if (!TextUtils.isEmpty(string)) {
                            C3523c.m4033d(context, string);
                        }
                        String string2 = jSONObject2.getString("resetToken");
                        if (!TextUtils.isEmpty(string2)) {
                            C3523c.m4030c(context, string2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            zIDManager.f3050a = false;
        }
        return strOptString;
    }

    /* renamed from: b */
    public static /* synthetic */ String m4017b(ZIDManager zIDManager, Context context) {
        String string;
        String string2;
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences sharedPreferencesM4019a2;
        SharedPreferences sharedPreferencesM4019a3;
        SharedPreferences sharedPreferencesM4019a4;
        String strOptString = null;
        if (!zIDManager.f3051b) {
            zIDManager.f3051b = true;
            JSONObject jSONObject = new JSONObject();
            try {
                Object objM4026b = C3523c.m4026b(context);
                String id = Spy.getID();
                jSONObject.put("zdata", id);
                jSONObject.put("old_zdata", objM4026b);
                String string3 = "";
                if (context == null || (sharedPreferencesM4019a4 = C3521a.m4019a(context)) == null) {
                    string = "";
                } else {
                    string = sharedPreferencesM4019a4.getString("oaid", "");
                    if (C3523c.m4031c(string)) {
                        string = C3523c.m4024a(string);
                    }
                }
                String strM4032d = C3523c.m4032d(context);
                jSONObject.put("old_oaid", string);
                jSONObject.put("oaid", strM4032d);
                if (context == null || (sharedPreferencesM4019a3 = C3521a.m4019a(context)) == null) {
                    string2 = "";
                } else {
                    string2 = sharedPreferencesM4019a3.getString("mac", "");
                    if (C3523c.m4031c(string2)) {
                        string2 = C3523c.m4024a(string2);
                    }
                }
                String strM4029c = C3523c.m4029c(context);
                jSONObject.put("mac", strM4029c);
                jSONObject.put("old_mac", string2);
                zIDManager.m4018a(context, jSONObject);
                jSONObject.put("aaid", C3523c.m4023a(context));
                jSONObject.put("uabc", (context == null || (sharedPreferencesM4019a2 = C3521a.m4019a(context)) == null) ? "" : sharedPreferencesM4019a2.getString("uabc", ""));
                if (context != null && (sharedPreferencesM4019a = C3521a.m4019a(context)) != null) {
                    string3 = sharedPreferencesM4019a.getString("resetToken", "");
                }
                if (!TextUtils.isEmpty(string3)) {
                    jSONObject.put("resetToken", string3);
                }
                String strM4020a = C3521a.m4020a("https://aaid.umeng.com/api/updateZdata", jSONObject.toString());
                if (!TextUtils.isEmpty(strM4020a)) {
                    JSONObject jSONObject2 = new JSONObject(strM4020a);
                    if (Boolean.valueOf(jSONObject2.optBoolean("suc")).booleanValue()) {
                        C3523c.m4035f(context, id);
                        C3523c.m4025a(context, strM4029c);
                        C3523c.m4028b(context, strM4032d);
                        strOptString = jSONObject2.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            C3523c.m4034e(context, strOptString);
                        }
                        String string4 = jSONObject2.getString("uabc");
                        if (!TextUtils.isEmpty(string4)) {
                            C3523c.m4033d(context, string4);
                        }
                        String string5 = jSONObject2.getString("resetToken");
                        if (!TextUtils.isEmpty(string5)) {
                            C3523c.m4030c(context, string5);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            zIDManager.f3051b = false;
        }
        return strOptString;
    }

    public static synchronized ZIDManager getInstance() {
        if (f3049c == null) {
            f3049c = new ZIDManager();
        }
        return f3049c;
    }

    public static String getSDKVersion() {
        return "1.2.3";
    }

    public synchronized String getZID(Context context) {
        SharedPreferences sharedPreferencesM4019a;
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String strM4023a = C3523c.m4023a(applicationContext);
        if (TextUtils.isEmpty(strM4023a)) {
            C3522b.m4022a(new RunnableC3519c(applicationContext));
            return "";
        }
        if (!((applicationContext == null || (sharedPreferencesM4019a = C3521a.m4019a(applicationContext)) == null) ? "" : sharedPreferencesM4019a.getString("zdata", null)).equals(Spy.getID())) {
            C3522b.m4022a(new RunnableC3520d(applicationContext));
        }
        return strM4023a;
    }

    public synchronized void init(Context context, String str, IZIDCompletionCallback iZIDCompletionCallback) {
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences.Editor editorEdit;
        if (context == null) {
            if (iZIDCompletionCallback != null) {
                iZIDCompletionCallback.onFailure("1001", "传入参数Context为null");
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (iZIDCompletionCallback != null) {
                iZIDCompletionCallback.onFailure("1003", "传入参数appkey为空");
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null && str != null && !TextUtils.isEmpty(str) && (sharedPreferencesM4019a = C3521a.m4019a(applicationContext)) != null && (editorEdit = sharedPreferencesM4019a.edit()) != null) {
            editorEdit.putString("appkey", str).commit();
        }
        String strM4023a = C3523c.m4023a(applicationContext);
        if (strM4023a == null || TextUtils.isEmpty(strM4023a)) {
            C3522b.m4022a(new RunnableC3517a(applicationContext, iZIDCompletionCallback));
        } else {
            C3522b.m4022a(new RunnableC3518b(applicationContext));
            if (iZIDCompletionCallback != null) {
                iZIDCompletionCallback.onSuccess(strM4023a);
            }
        }
        SharedPreferences sharedPreferencesM4019a2 = C3521a.m4019a(context);
        if (TextUtils.isEmpty(sharedPreferencesM4019a2 != null ? sharedPreferencesM4019a2.getString("uuid", "") : "")) {
            String string = "";
            SharedPreferences sharedPreferencesM4019a3 = C3521a.m4019a(context);
            try {
                string = UUID.randomUUID().toString();
            } catch (Throwable unused) {
            }
            if (sharedPreferencesM4019a3 != null) {
                sharedPreferencesM4019a3.edit().putString("uuid", string).commit();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject m4018a(android.content.Context r9, org.json.JSONObject r10) throws org.json.JSONException, java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.m4018a(android.content.Context, org.json.JSONObject):org.json.JSONObject");
    }
}
