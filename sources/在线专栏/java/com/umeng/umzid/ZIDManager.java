package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ZIDManager {

    /* renamed from: c */
    public static ZIDManager f9641c;

    /* renamed from: a */
    public boolean f9642a = false;

    /* renamed from: b */
    public boolean f9643b = false;

    /* renamed from: com.umeng.umzid.ZIDManager$a */
    public class RunnableC2033a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f9644a;

        /* renamed from: b */
        public final /* synthetic */ IZIDCompletionCallback f9645b;

        public RunnableC2033a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.f9644a = context;
            this.f9645b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM7939a = ZIDManager.m7939a(ZIDManager.this, this.f9644a);
            if (TextUtils.isEmpty(strM7939a)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.f9645b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.f9645b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(strM7939a);
            }
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$b */
    public class RunnableC2034b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f9647a;

        public RunnableC2034b(Context context) {
            this.f9647a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.m7940b(ZIDManager.this, this.f9647a);
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$c */
    public class RunnableC2035c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f9649a;

        public RunnableC2035c(Context context) {
            this.f9649a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.m7939a(ZIDManager.this, this.f9649a);
        }
    }

    /* renamed from: com.umeng.umzid.ZIDManager$d */
    public class RunnableC2036d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f9651a;

        public RunnableC2036d(Context context) {
            this.f9651a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.m7940b(ZIDManager.this, this.f9651a);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m7939a(ZIDManager zIDManager, Context context) {
        String strOptString = null;
        if (!zIDManager.f9642a) {
            zIDManager.f9642a = true;
            JSONObject jSONObject = new JSONObject();
            try {
                String id = Spy.getID();
                jSONObject.put("zdata", id);
                String strM7952c = C2039c.m7952c(context);
                jSONObject.put("mac", strM7952c);
                String strM7955d = C2039c.m7955d(context);
                jSONObject.put("oaid", strM7955d);
                zIDManager.m7941a(context, jSONObject);
                String strM7943a = C2037a.m7943a("https://aaid.umeng.com/api/postZdata", jSONObject.toString());
                if (!TextUtils.isEmpty(strM7943a)) {
                    JSONObject jSONObject2 = new JSONObject(strM7943a);
                    if (Boolean.valueOf(jSONObject2.optBoolean("suc")).booleanValue()) {
                        C2039c.m7958f(context, id);
                        C2039c.m7948a(context, strM7952c);
                        C2039c.m7951b(context, strM7955d);
                        strOptString = jSONObject2.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            C2039c.m7957e(context, strOptString);
                        }
                        String string = jSONObject2.getString("uabc");
                        if (!TextUtils.isEmpty(string)) {
                            C2039c.m7956d(context, string);
                        }
                        String string2 = jSONObject2.getString("resetToken");
                        if (!TextUtils.isEmpty(string2)) {
                            C2039c.m7953c(context, string2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            zIDManager.f9642a = false;
        }
        return strOptString;
    }

    /* renamed from: b */
    public static /* synthetic */ String m7940b(ZIDManager zIDManager, Context context) {
        String string;
        String string2;
        SharedPreferences sharedPreferencesM7942a;
        SharedPreferences sharedPreferencesM7942a2;
        SharedPreferences sharedPreferencesM7942a3;
        SharedPreferences sharedPreferencesM7942a4;
        String strOptString = null;
        if (!zIDManager.f9643b) {
            zIDManager.f9643b = true;
            JSONObject jSONObject = new JSONObject();
            try {
                Object objM7949b = C2039c.m7949b(context);
                String id = Spy.getID();
                jSONObject.put("zdata", id);
                jSONObject.put("old_zdata", objM7949b);
                String string3 = "";
                if (context == null || (sharedPreferencesM7942a4 = C2037a.m7942a(context)) == null) {
                    string = "";
                } else {
                    string = sharedPreferencesM7942a4.getString("oaid", "");
                    if (C2039c.m7954c(string)) {
                        string = C2039c.m7947a(string);
                    }
                }
                String strM7955d = C2039c.m7955d(context);
                jSONObject.put("old_oaid", string);
                jSONObject.put("oaid", strM7955d);
                if (context == null || (sharedPreferencesM7942a3 = C2037a.m7942a(context)) == null) {
                    string2 = "";
                } else {
                    string2 = sharedPreferencesM7942a3.getString("mac", "");
                    if (C2039c.m7954c(string2)) {
                        string2 = C2039c.m7947a(string2);
                    }
                }
                String strM7952c = C2039c.m7952c(context);
                jSONObject.put("mac", strM7952c);
                jSONObject.put("old_mac", string2);
                zIDManager.m7941a(context, jSONObject);
                jSONObject.put("aaid", C2039c.m7946a(context));
                jSONObject.put("uabc", (context == null || (sharedPreferencesM7942a2 = C2037a.m7942a(context)) == null) ? "" : sharedPreferencesM7942a2.getString("uabc", ""));
                if (context != null && (sharedPreferencesM7942a = C2037a.m7942a(context)) != null) {
                    string3 = sharedPreferencesM7942a.getString("resetToken", "");
                }
                if (!TextUtils.isEmpty(string3)) {
                    jSONObject.put("resetToken", string3);
                }
                String strM7943a = C2037a.m7943a("https://aaid.umeng.com/api/updateZdata", jSONObject.toString());
                if (!TextUtils.isEmpty(strM7943a)) {
                    JSONObject jSONObject2 = new JSONObject(strM7943a);
                    if (Boolean.valueOf(jSONObject2.optBoolean("suc")).booleanValue()) {
                        C2039c.m7958f(context, id);
                        C2039c.m7948a(context, strM7952c);
                        C2039c.m7951b(context, strM7955d);
                        strOptString = jSONObject2.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            C2039c.m7957e(context, strOptString);
                        }
                        String string4 = jSONObject2.getString("uabc");
                        if (!TextUtils.isEmpty(string4)) {
                            C2039c.m7956d(context, string4);
                        }
                        String string5 = jSONObject2.getString("resetToken");
                        if (!TextUtils.isEmpty(string5)) {
                            C2039c.m7953c(context, string5);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            zIDManager.f9643b = false;
        }
        return strOptString;
    }

    public static synchronized ZIDManager getInstance() {
        if (f9641c == null) {
            f9641c = new ZIDManager();
        }
        return f9641c;
    }

    public static String getSDKVersion() {
        return "1.2.3";
    }

    public synchronized String getZID(Context context) {
        SharedPreferences sharedPreferencesM7942a;
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String strM7946a = C2039c.m7946a(applicationContext);
        if (TextUtils.isEmpty(strM7946a)) {
            C2038b.m7945a(new RunnableC2035c(applicationContext));
            return "";
        }
        if (!((applicationContext == null || (sharedPreferencesM7942a = C2037a.m7942a(applicationContext)) == null) ? "" : sharedPreferencesM7942a.getString("zdata", null)).equals(Spy.getID())) {
            C2038b.m7945a(new RunnableC2036d(applicationContext));
        }
        return strM7946a;
    }

    public synchronized void init(Context context, String str, IZIDCompletionCallback iZIDCompletionCallback) {
        SharedPreferences sharedPreferencesM7942a;
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
        if (applicationContext != null && str != null && !TextUtils.isEmpty(str) && (sharedPreferencesM7942a = C2037a.m7942a(applicationContext)) != null && (editorEdit = sharedPreferencesM7942a.edit()) != null) {
            editorEdit.putString("appkey", str).commit();
        }
        String strM7946a = C2039c.m7946a(applicationContext);
        if (strM7946a == null || TextUtils.isEmpty(strM7946a)) {
            C2038b.m7945a(new RunnableC2033a(applicationContext, iZIDCompletionCallback));
        } else {
            C2038b.m7945a(new RunnableC2034b(applicationContext));
            if (iZIDCompletionCallback != null) {
                iZIDCompletionCallback.onSuccess(strM7946a);
            }
        }
        SharedPreferences sharedPreferencesM7942a2 = C2037a.m7942a(context);
        if (TextUtils.isEmpty(sharedPreferencesM7942a2 != null ? sharedPreferencesM7942a2.getString("uuid", "") : "")) {
            String string = "";
            SharedPreferences sharedPreferencesM7942a3 = C2037a.m7942a(context);
            try {
                string = UUID.randomUUID().toString();
            } catch (Throwable unused) {
            }
            if (sharedPreferencesM7942a3 != null) {
                sharedPreferencesM7942a3.edit().putString("uuid", string).commit();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject m7941a(android.content.Context r9, org.json.JSONObject r10) throws org.json.JSONException, java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.m7941a(android.content.Context, org.json.JSONObject):org.json.JSONObject");
    }
}
