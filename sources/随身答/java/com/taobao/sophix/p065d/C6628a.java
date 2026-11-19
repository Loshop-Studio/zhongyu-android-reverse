package com.taobao.sophix.p065d;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p059a.C6608b;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p064c.C6627c;
import com.taobao.sophix.p064c.InterfaceC6625a;
import com.taobao.sophix.p065d.p066a.C6629a;
import com.taobao.sophix.p065d.p066a.C6630b;
import com.taobao.sophix.p065d.p066a.InterfaceC6631c;
import com.taobao.sophix.p065d.p067b.C6632a;
import com.taobao.sophix.p065d.p068c.C6633a;
import com.taobao.sophix.p069e.C6634a;
import com.taobao.sophix.p069e.C6636c;
import com.taobao.sophix.p069e.C6637d;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6640g;
import com.taobao.sophix.p069e.C6643j;
import com.taobao.sophix.p069e.C6645l;
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
public class C6628a implements InterfaceC6625a {

    /* renamed from: a */
    private String f5509a;

    /* renamed from: b */
    private String f5510b;

    /* renamed from: c */
    private String f5511c;

    /* renamed from: d */
    private String f5512d;

    /* renamed from: e */
    private String f5513e;

    /* renamed from: f */
    private String f5514f;

    /* renamed from: g */
    private String f5515g;

    /* renamed from: h */
    private List<String> f5516h;

    /* renamed from: j */
    private long f5518j;

    /* renamed from: k */
    private String f5519k;

    /* renamed from: i */
    private volatile boolean f5517i = true;

    /* renamed from: l */
    private AtomicBoolean f5520l = new AtomicBoolean(false);

    /* renamed from: com.taobao.sophix.d.a$a */
    public final class a {
        private a() {
        }

        /* renamed from: a */
        public String m4840a() throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (C6628a.this.f5516h != null) {
                    Iterator it = C6628a.this.f5516h.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                }
                jSONObject.put("tags", jSONArray);
                C6633a.m4848a().m4854a(C6622b.f5489b);
                jSONObject.put("network", C6633a.m4848a().m4857d());
                jSONObject.put("carrier", C6633a.m4848a().m4855b());
                jSONObject.put("stable", C6622b.f5493f ? "1" : "0");
                String str = new String(Base64.encode(jSONObject.toString().getBytes(), 2));
                C6638e.m4888b("NetworkManager", "[EnvHeaderBuilder] encode: " + str, new Object[0]);
                return str;
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    /* renamed from: b */
    private void m4831b() {
        this.f5513e = "osversion=" + Build.VERSION.RELEASE + ",manufacturer=" + Build.MANUFACTURER + ",brand=" + Build.BRAND + ",model=" + Build.MODEL + ",os=android";
        this.f5514f = C6643j.m4913a(C6622b.f5489b, "SP_SOPHIX_DEVICE_ID", (String) null);
    }

    /* renamed from: c */
    private void m4832c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            C6622b.f5489b.getClassLoader().loadClass("com.ta.utdid2.device.SophixInvoker").getDeclaredMethod("invokeAlicloudReport", Application.class, String.class).invoke(null, C6622b.f5489b, this.f5510b);
        } catch (Exception e10) {
            C6638e.m4880a("NetworkManager", "reportDailyActive fail to invoke ams reporter", e10, new Object[0]);
            throw new RuntimeException("may not keep com.alibaba.sdk.android.sender");
        }
    }

    /* renamed from: a */
    public synchronized void m4834a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!this.f5520l.get()) {
                    C6638e.m4890c("NetworkManager", "init", "appVersion", str2);
                    this.f5509a = str2;
                    File file = new File(str, "download");
                    if (!file.exists()) {
                        file.mkdirs();
                    } else if (C6640g.m4896a(C6622b.f5489b)) {
                        C6636c.m4871a(file);
                    }
                    this.f5515g = new File(file, "sophix-patch.jar").getAbsolutePath();
                    try {
                        ApplicationInfo applicationInfo = C6622b.f5489b.getPackageManager().getApplicationInfo(C6622b.f5489b.getBaseContext().getPackageName(), 128);
                        if (TextUtils.isEmpty(this.f5510b)) {
                            this.f5510b = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.IDSECRET"));
                        }
                        if (TextUtils.isEmpty(this.f5511c)) {
                            this.f5511c = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.APPSECRET"));
                        }
                        if (TextUtils.isEmpty(this.f5512d)) {
                            this.f5512d = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.RSASECRET"));
                        }
                    } catch (Throwable th) {
                        C6638e.m4880a("NetworkManager", "init", th, new Object[0]);
                    }
                    m4831b();
                    this.f5520l.set(true);
                }
            } else {
                throw new RuntimeException("app version is null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public void m4835a(String str, String str2, String str3) {
        this.f5510b = str;
        this.f5511c = str2;
        this.f5512d = str3;
    }

    /* renamed from: a */
    public synchronized String m4833a(String str, C6627c c6627c, PatchLoadStatusListener patchLoadStatusListener) {
        if (!this.f5520l.get()) {
            C6638e.m4891d("NetworkManager", "query fail as not init", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(this.f5510b)) {
            C6638e.m4891d("NetworkManager", "query fail as appId is empty", new Object[0]);
            return null;
        }
        if (C6629a.f5525c && (TextUtils.isEmpty(this.f5511c) || TextUtils.isEmpty(this.f5512d))) {
            C6638e.m4891d("NetworkManager", "query fail as appSecret/rsaSecret is empty", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str) && c6627c == null) {
            C6638e.m4891d("NetworkManager", "query fail as param is empty", new Object[0]);
            return null;
        }
        m4828a();
        if (TextUtils.isEmpty(this.f5514f)) {
            C6638e.m4891d("NetworkManager", "query fail as can't get device id", new Object[0]);
            return null;
        }
        if (this.f5518j != 0 && System.currentTimeMillis() - this.f5518j <= 3000) {
            C6638e.m4891d("NetworkManager", "query fail as two consecutive query should not short than 3s", new Object[0]);
            return null;
        }
        this.f5518j = System.currentTimeMillis();
        if (C6629a.f5525c) {
            m4832c();
        }
        try {
            C6638e.m4890c("NetworkManager", "query start", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C6632a c6632aM4824a = m4824a(str, c6627c);
            C6638e.m4888b("NetworkManager", "query", "get remote patch", c6632aM4824a);
            int i9 = c6627c.f5503d;
            if (i9 != -1 && c6632aM4824a.f5530b <= i9) {
                throw new C6608b(7, "patch version is smaller than current");
            }
            if (i9 != -1) {
                c6627c.f5503d = c6632aM4824a.f5530b;
            }
            String strM4825a = m4825a(c6632aM4824a, new File(this.f5515g).getParentFile().getAbsolutePath());
            C6638e.m4888b("NetworkManager", "query", "local server decrypt patch", strM4825a);
            if (C6634a.m4861a(strM4825a, this.f5515g, c6632aM4824a.f5531c, this.f5512d) && new File(this.f5515g).exists()) {
                C6638e.m4890c("NetworkManager", "query", "download success");
                patchLoadStatusListener.onLoad(0, 9, "download success", c6632aM4824a.f5530b);
                C6643j.m4919b((Context) C6622b.f5489b, "hpatch_clear", false);
                File file = new File(this.f5515g);
                c6627c.f5502c = "100";
                c6627c.f5506g = file.length();
                c6627c.f5504e = System.currentTimeMillis() - jCurrentTimeMillis;
                mo4816a(c6627c);
                return new File(this.f5515g).exists() ? this.f5515g : null;
            }
            throw new C6608b(11, "server decrypt fail");
        } catch (C6608b e10) {
            patchLoadStatusListener.onLoad(0, e10.m4704a(), e10.getMessage(), c6627c.f5503d);
            if (e10.m4704a() == 6) {
                C6638e.m4890c("NetworkManager", "query", e10.getMessage());
            } else if (e10.m4704a() == 18) {
                C6638e.m4891d("NetworkManager", "query", e10.getMessage());
                C6643j.m4919b((Context) C6622b.f5489b, "hpatch_clear", true);
            } else {
                C6638e.m4887b("NetworkManager", "query fail", e10, "code", Integer.valueOf(e10.m4704a()), NotificationCompat.CATEGORY_MESSAGE, e10.getMessage());
                c6627c.f5502c = "101";
                c6627c.f5508i = e10.m4704a();
                mo4816a(c6627c);
            }
            return null;
        } catch (Throwable th) {
            patchLoadStatusListener.onLoad(0, 31, th.getMessage(), c6627c.f5503d);
            c6627c.f5502c = "101";
            c6627c.f5508i = 31;
            mo4816a(c6627c);
            return null;
        }
    }

    /* renamed from: a */
    private void m4828a() {
        try {
            String strEncode = URLEncoder.encode((String) C6622b.f5489b.getClassLoader().loadClass("com.ta.utdid2.device.UTDevice").getDeclaredMethod("getUtdid", Context.class).invoke(null, C6622b.f5489b.getBaseContext()), "UTF-8");
            String str = this.f5514f;
            if (str != null) {
                if (strEncode.equals(str)) {
                    return;
                }
                C6638e.m4892e("NetworkManager", "device id changed! " + strEncode + " " + this.f5514f, new Object[0]);
                return;
            }
            C6643j.m4918b(C6622b.f5489b, "SP_SOPHIX_DEVICE_ID", strEncode);
            this.f5514f = strEncode;
        } catch (Throwable th) {
            C6638e.m4880a("NetworkManager", "initDeviceId", th, new Object[0]);
            throw new RuntimeException("fail to include utdid");
        }
    }

    @Override // com.taobao.sophix.p064c.InterfaceC6625a
    /* renamed from: a */
    public void mo4816a(C6627c c6627c) {
        if (this.f5520l.get()) {
            C6638e.m4881a("NetworkManager", "commit", c6627c);
            if (!this.f5517i || !C6640g.m4896a(C6622b.f5489b) || c6627c == null || TextUtils.isEmpty(c6627c.f5502c) || c6627c.f5503d == -1) {
                return;
            }
            if (TextUtils.isEmpty(this.f5514f)) {
                C6638e.m4891d("NetworkManager", "commit", "device id is empty");
            } else {
                final C6627c c6627c2 = new C6627c(c6627c);
                C6645l.m4925a(new Runnable() { // from class: com.taobao.sophix.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C6630b c6630b = new C6630b();
                            C6628a.this.m4829a(c6630b, (String) null, c6627c2);
                            c6630b.mo4841a();
                            C6638e.m4881a("NetworkManager", "commit success", Integer.valueOf(c6630b.mo4844b()));
                        } catch (Throwable th) {
                            C6638e.m4880a("NetworkManager", "commit fail", th, new Object[0]);
                        }
                    }
                }, "301".equals(c6627c2.f5502c) ? 0L : 3000L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        com.taobao.sophix.p069e.C6638e.m4891d("NetworkManager", "getPatchRemote", "not found remote hmac");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        r0 = new com.taobao.sophix.p065d.p067b.C6632a();
        r7 = new org.json.JSONObject(r3);
        r0.f5531c = r7.optString("file_token");
        r0.f5529a = r7.optString(com.zykj.download.OssUtils.FILE_URL);
        r0.f5530b = r7.getInt("patch_version");
        r0.f5532d = r7.optString("file_hmac");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f5531c) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0193, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f5529a) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        r14.mo4847e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a2, code lost:
    
        throw new com.taobao.sophix.p059a.C6608b(37, "query lack token or url");
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
    private com.taobao.sophix.p065d.p067b.C6632a m4824a(java.lang.String r19, com.taobao.sophix.p064c.C6627c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p065d.C6628a.m4824a(java.lang.String, com.taobao.sophix.c.c):com.taobao.sophix.d.b.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4829a(InterfaceC6631c interfaceC6631c, String str, C6627c c6627c) {
        String strM4820b;
        if (!TextUtils.isEmpty(str)) {
            C6638e.m4888b("NetworkManager", "openConnection", "cdn reqUrl", str);
            interfaceC6631c.mo4842a(str);
            interfaceC6631c.mo4843a("x-hotfix-os", "android");
            interfaceC6631c.mo4843a("x-hotfix-sdk-version", SophixManager.VERSION);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(c6627c.f5502c)) {
            sb.append("/u/");
            sb.append(this.f5510b);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(this.f5514f);
            sb.append(str2);
        } else {
            sb.append("/r/");
            sb.append(this.f5510b);
            String str3 = File.separator;
            sb.append(str3);
            sb.append(this.f5514f);
            sb.append(str3);
            sb.append(c6627c.f5502c);
            sb.append(str3);
        }
        sb.append(this.f5509a);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(c6627c.f5503d);
        sb.append(str4);
        String str5 = C6629a.f5524b + C6629a.f5523a + ((CharSequence) sb);
        C6638e.m4888b("NetworkManager", "openConnection", "auth reqUrl", str5);
        interfaceC6631c.mo4842a(str5);
        interfaceC6631c.mo4843a("x-hotfix-os", "android");
        interfaceC6631c.mo4843a("x-hotfix-sdk-version", SophixManager.VERSION);
        interfaceC6631c.mo4843a("x-hotfix-info", this.f5513e);
        if (TextUtils.isEmpty(this.f5519k)) {
            this.f5519k = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        }
        interfaceC6631c.mo4843a("x-hotfix-token", C6637d.m4877a(sb.toString() + this.f5519k, this.f5511c));
        if (TextUtils.isEmpty(c6627c.f5502c)) {
            strM4820b = "cdate=" + this.f5519k;
        } else {
            strM4820b = c6627c.m4820b();
            int i9 = c6627c.f5508i;
            if (i9 != -9999) {
                interfaceC6631c.mo4843a("x-hotfix-error", String.valueOf(i9));
            }
        }
        interfaceC6631c.mo4843a("x-hotfix-request-id", c6627c.f5500a);
        interfaceC6631c.mo4843a("x-hotfix-ext", strM4820b);
        try {
            interfaceC6631c.mo4843a("x-hotfix-env", new a().m4840a());
        } catch (Exception e10) {
            C6638e.m4888b("NetworkManager", e10.getMessage(), e10);
        }
    }

    /* renamed from: a */
    private String m4825a(C6632a c6632a, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        C6630b c6630b = null;
        inputStream = null;
        InputStream inputStream = null;
        c6630b = null;
        try {
            try {
                C6630b c6630b2 = new C6630b();
                try {
                    try {
                        c6630b2.mo4842a(c6632a.f5529a);
                        c6630b2.mo4841a();
                        int iMo4844b = c6630b2.mo4844b();
                        if (iMo4844b == 200) {
                            File file = new File(str, m4826a(c6632a.f5529a, c6632a.f5530b));
                            try {
                                InputStream inputStreamMo4846d = c6630b2.mo4846d();
                                try {
                                    bufferedInputStream = new BufferedInputStream(inputStreamMo4846d);
                                    try {
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            byte[] bArr = new byte[8192];
                                            while (true) {
                                                int i9 = bufferedInputStream.read(bArr);
                                                if (i9 == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i9);
                                            }
                                            C6636c.m4870a(inputStreamMo4846d);
                                            C6636c.m4870a(bufferedInputStream);
                                            C6636c.m4870a(fileOutputStream);
                                            if (C6629a.f5525c) {
                                                String strM4876a = C6637d.m4876a(file, this.f5511c);
                                                String str2 = c6632a.f5532d;
                                                if (!TextUtils.isEmpty(str2) && !str2.equals(strM4876a)) {
                                                    throw new C6608b(10, "download broken");
                                                }
                                            }
                                            String absolutePath = file.getAbsolutePath();
                                            c6630b2.mo4847e();
                                            return absolutePath;
                                        } catch (IOException e10) {
                                            e = e10;
                                            inputStream = inputStreamMo4846d;
                                            try {
                                                throw new C6608b(52, e);
                                            } catch (Throwable th) {
                                                th = th;
                                                C6636c.m4870a(inputStream);
                                                C6636c.m4870a(bufferedInputStream);
                                                C6636c.m4870a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStreamMo4846d;
                                            C6636c.m4870a(inputStream);
                                            C6636c.m4870a(bufferedInputStream);
                                            C6636c.m4870a(fileOutputStream);
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
                            throw new C6608b(iMo4844b, "download fail as response code");
                        }
                    } catch (IOException e14) {
                        e = e14;
                        c6630b = c6630b2;
                        throw new C6608b(51, e);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c6630b = c6630b2;
                    if (c6630b != null) {
                        c6630b.mo4847e();
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
    private String m4826a(String str, int i9) {
        String strSubstring = str.substring(str.lastIndexOf("/") + 1);
        String[] strArrSplit = strSubstring.split("\\.");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return strArrSplit[0] + "_" + i9 + "." + strArrSplit[1];
        }
        return strSubstring + "_" + i9 + ".patch";
    }

    /* renamed from: a */
    public void m4836a(List<String> list) {
        this.f5516h = list;
    }
}
