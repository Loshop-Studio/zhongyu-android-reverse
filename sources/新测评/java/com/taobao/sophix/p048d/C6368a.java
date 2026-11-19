package com.taobao.sophix.p048d;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p042a.C6348b;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p047c.C6367c;
import com.taobao.sophix.p047c.InterfaceC6365a;
import com.taobao.sophix.p048d.p049a.C6369a;
import com.taobao.sophix.p048d.p049a.C6370b;
import com.taobao.sophix.p048d.p049a.InterfaceC6371c;
import com.taobao.sophix.p048d.p050b.C6372a;
import com.taobao.sophix.p048d.p051c.C6373a;
import com.taobao.sophix.p052e.C6374a;
import com.taobao.sophix.p052e.C6376c;
import com.taobao.sophix.p052e.C6377d;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6380g;
import com.taobao.sophix.p052e.C6383j;
import com.taobao.sophix.p052e.C6385l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.sophix.d.a */
/* loaded from: classes4.dex */
public class C6368a implements InterfaceC6365a {

    /* renamed from: a */
    private String f4932a;

    /* renamed from: b */
    private String f4933b;

    /* renamed from: c */
    private String f4934c;

    /* renamed from: d */
    private String f4935d;

    /* renamed from: e */
    private String f4936e;

    /* renamed from: f */
    private String f4937f;

    /* renamed from: g */
    private String f4938g;

    /* renamed from: h */
    private List<String> f4939h;

    /* renamed from: j */
    private long f4941j;

    /* renamed from: k */
    private String f4942k;

    /* renamed from: i */
    private volatile boolean f4940i = true;

    /* renamed from: l */
    private AtomicBoolean f4943l = new AtomicBoolean(false);

    /* renamed from: com.taobao.sophix.d.a$a */
    public final class a {
        private a() {
        }

        /* renamed from: a */
        public String m4661a() throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (C6368a.this.f4939h != null) {
                    Iterator it = C6368a.this.f4939h.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                }
                jSONObject.put("tags", jSONArray);
                C6373a.m4669a().m4675a(C6362b.f4912b);
                jSONObject.put("network", C6373a.m4669a().m4678d());
                jSONObject.put("carrier", C6373a.m4669a().m4676b());
                jSONObject.put("stable", C6362b.f4916f ? "1" : "0");
                String str = new String(Base64.encode(jSONObject.toString().getBytes(), 2));
                C6378e.m4709b("NetworkManager", "[EnvHeaderBuilder] encode: " + str, new Object[0]);
                return str;
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    /* renamed from: b */
    private void m4652b() {
        this.f4936e = "osversion=" + Build.VERSION.RELEASE + ",manufacturer=" + Build.MANUFACTURER + ",brand=" + Build.BRAND + ",model=" + Build.MODEL + ",os=android";
        this.f4937f = C6383j.m4734a(C6362b.f4912b, "SP_SOPHIX_DEVICE_ID", (String) null);
    }

    /* renamed from: c */
    private void m4653c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            C6362b.f4912b.getClassLoader().loadClass("com.ta.utdid2.device.SophixInvoker").getDeclaredMethod("invokeAlicloudReport", Application.class, String.class).invoke(null, C6362b.f4912b, this.f4933b);
        } catch (Exception e10) {
            C6378e.m4701a("NetworkManager", "reportDailyActive fail to invoke ams reporter", e10, new Object[0]);
            throw new RuntimeException("may not keep com.alibaba.sdk.android.sender");
        }
    }

    /* renamed from: a */
    public synchronized void m4655a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!this.f4943l.get()) {
                    C6378e.m4711c("NetworkManager", "init", "appVersion", str2);
                    this.f4932a = str2;
                    File file = new File(str, "download");
                    if (!file.exists()) {
                        file.mkdirs();
                    } else if (C6380g.m4717a(C6362b.f4912b)) {
                        C6376c.m4692a(file);
                    }
                    this.f4938g = new File(file, "sophix-patch.jar").getAbsolutePath();
                    try {
                        ApplicationInfo applicationInfo = C6362b.f4912b.getPackageManager().getApplicationInfo(C6362b.f4912b.getBaseContext().getPackageName(), 128);
                        if (TextUtils.isEmpty(this.f4933b)) {
                            this.f4933b = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.IDSECRET"));
                        }
                        if (TextUtils.isEmpty(this.f4934c)) {
                            this.f4934c = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.APPSECRET"));
                        }
                        if (TextUtils.isEmpty(this.f4935d)) {
                            this.f4935d = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.RSASECRET"));
                        }
                    } catch (Throwable th) {
                        C6378e.m4701a("NetworkManager", "init", th, new Object[0]);
                    }
                    m4652b();
                    this.f4943l.set(true);
                }
            } else {
                throw new RuntimeException("app version is null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public void m4656a(String str, String str2, String str3) {
        this.f4933b = str;
        this.f4934c = str2;
        this.f4935d = str3;
    }

    /* renamed from: a */
    public synchronized String m4654a(String str, C6367c c6367c, PatchLoadStatusListener patchLoadStatusListener) {
        if (!this.f4943l.get()) {
            C6378e.m4712d("NetworkManager", "query fail as not init", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(this.f4933b)) {
            C6378e.m4712d("NetworkManager", "query fail as appId is empty", new Object[0]);
            return null;
        }
        if (C6369a.f4948c && (TextUtils.isEmpty(this.f4934c) || TextUtils.isEmpty(this.f4935d))) {
            C6378e.m4712d("NetworkManager", "query fail as appSecret/rsaSecret is empty", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str) && c6367c == null) {
            C6378e.m4712d("NetworkManager", "query fail as param is empty", new Object[0]);
            return null;
        }
        m4649a();
        if (TextUtils.isEmpty(this.f4937f)) {
            C6378e.m4712d("NetworkManager", "query fail as can't get device id", new Object[0]);
            return null;
        }
        if (this.f4941j != 0 && System.currentTimeMillis() - this.f4941j <= 3000) {
            C6378e.m4712d("NetworkManager", "query fail as two consecutive query should not short than 3s", new Object[0]);
            return null;
        }
        this.f4941j = System.currentTimeMillis();
        if (C6369a.f4948c) {
            m4653c();
        }
        try {
            C6378e.m4711c("NetworkManager", "query start", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C6372a c6372aM4645a = m4645a(str, c6367c);
            C6378e.m4709b("NetworkManager", "query", "get remote patch", c6372aM4645a);
            int i10 = c6367c.f4926d;
            if (i10 != -1 && c6372aM4645a.f4953b <= i10) {
                throw new C6348b(7, "patch version is smaller than current");
            }
            if (i10 != -1) {
                c6367c.f4926d = c6372aM4645a.f4953b;
            }
            String strM4646a = m4646a(c6372aM4645a, new File(this.f4938g).getParentFile().getAbsolutePath());
            C6378e.m4709b("NetworkManager", "query", "local server decrypt patch", strM4646a);
            if (C6374a.m4682a(strM4646a, this.f4938g, c6372aM4645a.f4954c, this.f4935d) && new File(this.f4938g).exists()) {
                C6378e.m4711c("NetworkManager", "query", "download success");
                patchLoadStatusListener.onLoad(0, 9, "download success", c6372aM4645a.f4953b);
                C6383j.m4740b((Context) C6362b.f4912b, "hpatch_clear", false);
                File file = new File(this.f4938g);
                c6367c.f4925c = "100";
                c6367c.f4929g = file.length();
                c6367c.f4927e = System.currentTimeMillis() - jCurrentTimeMillis;
                mo4637a(c6367c);
                return new File(this.f4938g).exists() ? this.f4938g : null;
            }
            throw new C6348b(11, "server decrypt fail");
        } catch (C6348b e10) {
            patchLoadStatusListener.onLoad(0, e10.m4525a(), e10.getMessage(), c6367c.f4926d);
            if (e10.m4525a() == 6) {
                C6378e.m4711c("NetworkManager", "query", e10.getMessage());
            } else if (e10.m4525a() == 18) {
                C6378e.m4712d("NetworkManager", "query", e10.getMessage());
                C6383j.m4740b((Context) C6362b.f4912b, "hpatch_clear", true);
            } else {
                C6378e.m4708b("NetworkManager", "query fail", e10, "code", Integer.valueOf(e10.m4525a()), NotificationCompat.CATEGORY_MESSAGE, e10.getMessage());
                c6367c.f4925c = "101";
                c6367c.f4931i = e10.m4525a();
                mo4637a(c6367c);
            }
            return null;
        } catch (Throwable th) {
            patchLoadStatusListener.onLoad(0, 31, th.getMessage(), c6367c.f4926d);
            c6367c.f4925c = "101";
            c6367c.f4931i = 31;
            mo4637a(c6367c);
            return null;
        }
    }

    /* renamed from: a */
    private void m4649a() {
        try {
            String strEncode = URLEncoder.encode((String) C6362b.f4912b.getClassLoader().loadClass("com.ta.utdid2.device.UTDevice").getDeclaredMethod("getUtdid", Context.class).invoke(null, C6362b.f4912b.getBaseContext()), "UTF-8");
            String str = this.f4937f;
            if (str != null) {
                if (strEncode.equals(str)) {
                    return;
                }
                C6378e.m4713e("NetworkManager", "device id changed! " + strEncode + " " + this.f4937f, new Object[0]);
                return;
            }
            C6383j.m4739b(C6362b.f4912b, "SP_SOPHIX_DEVICE_ID", strEncode);
            this.f4937f = strEncode;
        } catch (Throwable th) {
            C6378e.m4701a("NetworkManager", "initDeviceId", th, new Object[0]);
            throw new RuntimeException("fail to include utdid");
        }
    }

    @Override // com.taobao.sophix.p047c.InterfaceC6365a
    /* renamed from: a */
    public void mo4637a(C6367c c6367c) {
        if (this.f4943l.get()) {
            C6378e.m4702a("NetworkManager", "commit", c6367c);
            if (!this.f4940i || !C6380g.m4717a(C6362b.f4912b) || c6367c == null || TextUtils.isEmpty(c6367c.f4925c) || c6367c.f4926d == -1) {
                return;
            }
            if (TextUtils.isEmpty(this.f4937f)) {
                C6378e.m4712d("NetworkManager", "commit", "device id is empty");
            } else {
                final C6367c c6367c2 = new C6367c(c6367c);
                C6385l.m4746a(new Runnable() { // from class: com.taobao.sophix.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C6370b c6370b = new C6370b();
                            C6368a.this.m4650a(c6370b, (String) null, c6367c2);
                            c6370b.mo4662a();
                            C6378e.m4702a("NetworkManager", "commit success", Integer.valueOf(c6370b.mo4665b()));
                        } catch (Throwable th) {
                            C6378e.m4701a("NetworkManager", "commit fail", th, new Object[0]);
                        }
                    }
                }, "301".equals(c6367c2.f4925c) ? 0L : 3000L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        com.taobao.sophix.p052e.C6378e.m4712d("NetworkManager", "getPatchRemote", "not found remote hmac");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        r0 = new com.taobao.sophix.p048d.p050b.C6372a();
        r7 = new org.json.JSONObject(r3);
        r0.f4954c = r7.optString("file_token");
        r0.f4952a = r7.optString("file_url");
        r0.f4953b = r7.getInt("patch_version");
        r0.f4955d = r7.optString("file_hmac");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f4954c) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0193, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f4952a) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        r14.mo4668e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a2, code lost:
    
        throw new com.taobao.sophix.p042a.C6348b(37, "query lack token or url");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.taobao.sophix.p048d.p050b.C6372a m4645a(java.lang.String r19, com.taobao.sophix.p047c.C6367c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p048d.C6368a.m4645a(java.lang.String, com.taobao.sophix.c.c):com.taobao.sophix.d.b.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4650a(InterfaceC6371c interfaceC6371c, String str, C6367c c6367c) {
        String strM4641b;
        if (!TextUtils.isEmpty(str)) {
            C6378e.m4709b("NetworkManager", "openConnection", "cdn reqUrl", str);
            interfaceC6371c.mo4663a(str);
            interfaceC6371c.mo4664a("x-hotfix-os", "android");
            interfaceC6371c.mo4664a("x-hotfix-sdk-version", SophixManager.VERSION);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(c6367c.f4925c)) {
            sb.append("/u/");
            sb.append(this.f4933b);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(this.f4937f);
            sb.append(str2);
        } else {
            sb.append("/r/");
            sb.append(this.f4933b);
            String str3 = File.separator;
            sb.append(str3);
            sb.append(this.f4937f);
            sb.append(str3);
            sb.append(c6367c.f4925c);
            sb.append(str3);
        }
        sb.append(this.f4932a);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(c6367c.f4926d);
        sb.append(str4);
        String str5 = C6369a.f4947b + C6369a.f4946a + ((CharSequence) sb);
        C6378e.m4709b("NetworkManager", "openConnection", "auth reqUrl", str5);
        interfaceC6371c.mo4663a(str5);
        interfaceC6371c.mo4664a("x-hotfix-os", "android");
        interfaceC6371c.mo4664a("x-hotfix-sdk-version", SophixManager.VERSION);
        interfaceC6371c.mo4664a("x-hotfix-info", this.f4936e);
        if (TextUtils.isEmpty(this.f4942k)) {
            this.f4942k = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        }
        interfaceC6371c.mo4664a("x-hotfix-token", C6377d.m4698a(sb.toString() + this.f4942k, this.f4934c));
        if (TextUtils.isEmpty(c6367c.f4925c)) {
            strM4641b = "cdate=" + this.f4942k;
        } else {
            strM4641b = c6367c.m4641b();
            int i10 = c6367c.f4931i;
            if (i10 != -9999) {
                interfaceC6371c.mo4664a("x-hotfix-error", String.valueOf(i10));
            }
        }
        interfaceC6371c.mo4664a("x-hotfix-request-id", c6367c.f4923a);
        interfaceC6371c.mo4664a("x-hotfix-ext", strM4641b);
        try {
            interfaceC6371c.mo4664a("x-hotfix-env", new a().m4661a());
        } catch (Exception e10) {
            C6378e.m4709b("NetworkManager", e10.getMessage(), e10);
        }
    }

    /* renamed from: a */
    private String m4646a(C6372a c6372a, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        C6370b c6370b = null;
        inputStream = null;
        InputStream inputStream = null;
        c6370b = null;
        try {
            try {
                C6370b c6370b2 = new C6370b();
                try {
                    try {
                        c6370b2.mo4663a(c6372a.f4952a);
                        c6370b2.mo4662a();
                        int iMo4665b = c6370b2.mo4665b();
                        if (iMo4665b == 200) {
                            File file = new File(str, m4647a(c6372a.f4952a, c6372a.f4953b));
                            try {
                                InputStream inputStreamMo4667d = c6370b2.mo4667d();
                                try {
                                    bufferedInputStream = new BufferedInputStream(inputStreamMo4667d);
                                    try {
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            byte[] bArr = new byte[8192];
                                            while (true) {
                                                int i10 = bufferedInputStream.read(bArr);
                                                if (i10 == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i10);
                                            }
                                            C6376c.m4691a(inputStreamMo4667d);
                                            C6376c.m4691a(bufferedInputStream);
                                            C6376c.m4691a(fileOutputStream);
                                            if (C6369a.f4948c) {
                                                String strM4697a = C6377d.m4697a(file, this.f4934c);
                                                String str2 = c6372a.f4955d;
                                                if (!TextUtils.isEmpty(str2) && !str2.equals(strM4697a)) {
                                                    throw new C6348b(10, "download broken");
                                                }
                                            }
                                            String absolutePath = file.getAbsolutePath();
                                            c6370b2.mo4668e();
                                            return absolutePath;
                                        } catch (IOException e10) {
                                            e = e10;
                                            inputStream = inputStreamMo4667d;
                                            try {
                                                throw new C6348b(52, e);
                                            } catch (Throwable th) {
                                                th = th;
                                                C6376c.m4691a(inputStream);
                                                C6376c.m4691a(bufferedInputStream);
                                                C6376c.m4691a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStreamMo4667d;
                                            C6376c.m4691a(inputStream);
                                            C6376c.m4691a(bufferedInputStream);
                                            C6376c.m4691a(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (IOException e11) {
                                        e = e11;
                                        fileOutputStream = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                    bufferedInputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedInputStream = null;
                                    fileOutputStream = null;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                bufferedInputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedInputStream = null;
                                fileOutputStream = null;
                            }
                        } else {
                            throw new C6348b(iMo4665b, "download fail as response code");
                        }
                    } catch (IOException e14) {
                        e = e14;
                        c6370b = c6370b2;
                        throw new C6348b(51, e);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c6370b = c6370b2;
                    if (c6370b != null) {
                        c6370b.mo4668e();
                    }
                    throw th;
                }
            } catch (IOException e15) {
                e = e15;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: a */
    private String m4647a(String str, int i10) {
        String strSubstring = str.substring(str.lastIndexOf("/") + 1);
        String[] strArrSplit = strSubstring.split("\\.");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return strArrSplit[0] + "_" + i10 + "." + strArrSplit[1];
        }
        return strSubstring + "_" + i10 + ".patch";
    }

    /* renamed from: a */
    public void m4657a(List<String> list) {
        this.f4939h = list;
    }
}
