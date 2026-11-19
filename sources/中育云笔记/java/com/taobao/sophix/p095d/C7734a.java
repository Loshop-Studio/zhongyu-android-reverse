package com.taobao.sophix.p095d;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import anet.channel.request.Request;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.android.arouter.utils.Consts;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import com.taobao.accs.common.Constants;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p089a.C7714b;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p094c.C7733c;
import com.taobao.sophix.p094c.InterfaceC7731a;
import com.taobao.sophix.p095d.p096a.C7735a;
import com.taobao.sophix.p095d.p096a.C7736b;
import com.taobao.sophix.p095d.p096a.InterfaceC7737c;
import com.taobao.sophix.p095d.p097b.C7738a;
import com.taobao.sophix.p095d.p098c.C7739a;
import com.taobao.sophix.p099e.C7740a;
import com.taobao.sophix.p099e.C7742c;
import com.taobao.sophix.p099e.C7743d;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7746g;
import com.taobao.sophix.p099e.C7749j;
import com.taobao.sophix.p099e.C7751l;
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
import org.android.agoo.message.MessageService;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.sophix.d.a */
/* loaded from: classes5.dex */
public class C7734a implements InterfaceC7731a {

    /* renamed from: a */
    private String f13374a;

    /* renamed from: b */
    private String f13375b;

    /* renamed from: c */
    private String f13376c;

    /* renamed from: d */
    private String f13377d;

    /* renamed from: e */
    private String f13378e;

    /* renamed from: f */
    private String f13379f;

    /* renamed from: g */
    private String f13380g;

    /* renamed from: h */
    private List<String> f13381h;

    /* renamed from: j */
    private long f13383j;

    /* renamed from: k */
    private String f13384k;

    /* renamed from: i */
    private volatile boolean f13382i = true;

    /* renamed from: l */
    private AtomicBoolean f13385l = new AtomicBoolean(false);

    /* renamed from: com.taobao.sophix.d.a$a */
    public final class a {
        private a() {
        }

        /* renamed from: a */
        public String m10352a() throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (C7734a.this.f13381h != null) {
                    Iterator it = C7734a.this.f13381h.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                }
                jSONObject.put("tags", jSONArray);
                C7739a.m10360a().m10366a(C7728b.f13354b);
                jSONObject.put("network", C7739a.m10360a().m10369d());
                jSONObject.put(DispatchConstants.CARRIER, C7739a.m10360a().m10367b());
                jSONObject.put("stable", C7728b.f13358f ? "1" : "0");
                String str = new String(Base64.encode(jSONObject.toString().getBytes(), 2));
                C7744e.m10400b("NetworkManager", "[EnvHeaderBuilder] encode: " + str, new Object[0]);
                return str;
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    /* renamed from: b */
    private void m10343b() {
        this.f13378e = "osversion" + ContainerUtils.KEY_VALUE_DELIMITER + Build.VERSION.RELEASE + ",manufacturer" + ContainerUtils.KEY_VALUE_DELIMITER + Build.MANUFACTURER + "," + Constants.KEY_BRAND + ContainerUtils.KEY_VALUE_DELIMITER + Build.BRAND + "," + Constants.KEY_MODEL + ContainerUtils.KEY_VALUE_DELIMITER + Build.MODEL + "," + Constants.KEY_OS_VERSION + ContainerUtils.KEY_VALUE_DELIMITER + DispatchConstants.ANDROID;
        this.f13379f = C7749j.m10425a(C7728b.f13354b, "SP_SOPHIX_DEVICE_ID", (String) null);
    }

    /* renamed from: c */
    private void m10344c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            C7728b.f13354b.getClassLoader().loadClass("com.ta.utdid2.device.SophixInvoker").getDeclaredMethod("invokeAlicloudReport", Application.class, String.class).invoke(null, C7728b.f13354b, this.f13375b);
        } catch (Exception e10) {
            C7744e.m10392a("NetworkManager", "reportDailyActive fail to invoke ams reporter", e10, new Object[0]);
            throw new RuntimeException("may not keep com.alibaba.sdk.android.sender");
        }
    }

    /* renamed from: a */
    public synchronized void m10346a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!this.f13385l.get()) {
                    C7744e.m10402c("NetworkManager", "init", "appVersion", str2);
                    this.f13374a = str2;
                    File file = new File(str, "download");
                    if (!file.exists()) {
                        file.mkdirs();
                    } else if (C7746g.m10408a(C7728b.f13354b)) {
                        C7742c.m10383a(file);
                    }
                    this.f13380g = new File(file, "sophix-patch.jar").getAbsolutePath();
                    try {
                        ApplicationInfo applicationInfo = C7728b.f13354b.getPackageManager().getApplicationInfo(C7728b.f13354b.getBaseContext().getPackageName(), 128);
                        if (TextUtils.isEmpty(this.f13375b)) {
                            this.f13375b = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.IDSECRET"));
                        }
                        if (TextUtils.isEmpty(this.f13376c)) {
                            this.f13376c = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.APPSECRET"));
                        }
                        if (TextUtils.isEmpty(this.f13377d)) {
                            this.f13377d = String.valueOf(applicationInfo.metaData.get("com.taobao.android.hotfix.RSASECRET"));
                        }
                    } catch (Throwable th) {
                        C7744e.m10392a("NetworkManager", "init", th, new Object[0]);
                    }
                    m10343b();
                    this.f13385l.set(true);
                }
            } else {
                throw new RuntimeException("app version is null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public void m10347a(String str, String str2, String str3) {
        this.f13375b = str;
        this.f13376c = str2;
        this.f13377d = str3;
    }

    /* renamed from: a */
    public synchronized String m10345a(String str, C7733c c7733c, PatchLoadStatusListener patchLoadStatusListener) {
        if (!this.f13385l.get()) {
            C7744e.m10403d("NetworkManager", "query fail as not init", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(this.f13375b)) {
            C7744e.m10403d("NetworkManager", "query fail as appId is empty", new Object[0]);
            return null;
        }
        if (C7735a.f13390c && (TextUtils.isEmpty(this.f13376c) || TextUtils.isEmpty(this.f13377d))) {
            C7744e.m10403d("NetworkManager", "query fail as appSecret/rsaSecret is empty", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str) && c7733c == null) {
            C7744e.m10403d("NetworkManager", "query fail as param is empty", new Object[0]);
            return null;
        }
        m10340a();
        if (TextUtils.isEmpty(this.f13379f)) {
            C7744e.m10403d("NetworkManager", "query fail as can't get device id", new Object[0]);
            return null;
        }
        if (this.f13383j != 0 && System.currentTimeMillis() - this.f13383j <= 3000) {
            C7744e.m10403d("NetworkManager", "query fail as two consecutive query should not short than 3s", new Object[0]);
            return null;
        }
        this.f13383j = System.currentTimeMillis();
        if (C7735a.f13390c) {
            m10344c();
        }
        try {
            C7744e.m10402c("NetworkManager", "query start", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C7738a c7738aM10336a = m10336a(str, c7733c);
            C7744e.m10400b("NetworkManager", "query", "get remote patch", c7738aM10336a);
            int i10 = c7733c.f13368d;
            if (i10 != -1 && c7738aM10336a.f13395b <= i10) {
                throw new C7714b(7, "patch version is smaller than current");
            }
            if (i10 != -1) {
                c7733c.f13368d = c7738aM10336a.f13395b;
            }
            String strM10337a = m10337a(c7738aM10336a, new File(this.f13380g).getParentFile().getAbsolutePath());
            C7744e.m10400b("NetworkManager", "query", "local server decrypt patch", strM10337a);
            if (C7740a.m10373a(strM10337a, this.f13380g, c7738aM10336a.f13396c, this.f13377d) && new File(this.f13380g).exists()) {
                C7744e.m10402c("NetworkManager", "query", "download success");
                patchLoadStatusListener.onLoad(0, 9, "download success", c7738aM10336a.f13395b);
                C7749j.m10431b((Context) C7728b.f13354b, "hpatch_clear", false);
                File file = new File(this.f13380g);
                c7733c.f13367c = MessageService.MSG_DB_COMPLETE;
                c7733c.f13371g = file.length();
                c7733c.f13369e = System.currentTimeMillis() - jCurrentTimeMillis;
                mo10328a(c7733c);
                return new File(this.f13380g).exists() ? this.f13380g : null;
            }
            throw new C7714b(11, "server decrypt fail");
        } catch (C7714b e10) {
            patchLoadStatusListener.onLoad(0, e10.m10216a(), e10.getMessage(), c7733c.f13368d);
            if (e10.m10216a() == 6) {
                C7744e.m10402c("NetworkManager", "query", e10.getMessage());
            } else if (e10.m10216a() == 18) {
                C7744e.m10403d("NetworkManager", "query", e10.getMessage());
                C7749j.m10431b((Context) C7728b.f13354b, "hpatch_clear", true);
            } else {
                C7744e.m10399b("NetworkManager", "query fail", e10, Constants.KEY_HTTP_CODE, Integer.valueOf(e10.m10216a()), NotificationCompat.CATEGORY_MESSAGE, e10.getMessage());
                c7733c.f13367c = "101";
                c7733c.f13373i = e10.m10216a();
                mo10328a(c7733c);
            }
            return null;
        } catch (Throwable th) {
            patchLoadStatusListener.onLoad(0, 31, th.getMessage(), c7733c.f13368d);
            c7733c.f13367c = "101";
            c7733c.f13373i = 31;
            mo10328a(c7733c);
            return null;
        }
    }

    /* renamed from: a */
    private void m10340a() {
        try {
            String strEncode = URLEncoder.encode((String) C7728b.f13354b.getClassLoader().loadClass("com.ta.utdid2.device.UTDevice").getDeclaredMethod("getUtdid", Context.class).invoke(null, C7728b.f13354b.getBaseContext()), Request.DEFAULT_CHARSET);
            String str = this.f13379f;
            if (str != null) {
                if (strEncode.equals(str)) {
                    return;
                }
                C7744e.m10404e("NetworkManager", "device id changed! " + strEncode + " " + this.f13379f, new Object[0]);
                return;
            }
            C7749j.m10430b(C7728b.f13354b, "SP_SOPHIX_DEVICE_ID", strEncode);
            this.f13379f = strEncode;
        } catch (Throwable th) {
            C7744e.m10392a("NetworkManager", "initDeviceId", th, new Object[0]);
            throw new RuntimeException("fail to include utdid");
        }
    }

    @Override // com.taobao.sophix.p094c.InterfaceC7731a
    /* renamed from: a */
    public void mo10328a(C7733c c7733c) {
        if (this.f13385l.get()) {
            C7744e.m10393a("NetworkManager", "commit", c7733c);
            if (!this.f13382i || !C7746g.m10408a(C7728b.f13354b) || c7733c == null || TextUtils.isEmpty(c7733c.f13367c) || c7733c.f13368d == -1) {
                return;
            }
            if (TextUtils.isEmpty(this.f13379f)) {
                C7744e.m10403d("NetworkManager", "commit", "device id is empty");
            } else {
                final C7733c c7733c2 = new C7733c(c7733c);
                C7751l.m10437a(new Runnable() { // from class: com.taobao.sophix.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C7736b c7736b = new C7736b();
                            C7734a.this.m10341a(c7736b, (String) null, c7733c2);
                            c7736b.mo10353a();
                            C7744e.m10393a("NetworkManager", "commit success", Integer.valueOf(c7736b.mo10356b()));
                        } catch (Throwable th) {
                            C7744e.m10392a("NetworkManager", "commit fail", th, new Object[0]);
                        }
                    }
                }, "301".equals(c7733c2.f13367c) ? 0L : 3000L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        com.taobao.sophix.p099e.C7744e.m10403d("NetworkManager", "getPatchRemote", "not found remote hmac");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        r0 = new com.taobao.sophix.p095d.p097b.C7738a();
        r7 = new org.json.JSONObject(r3);
        r0.f13396c = r7.optString("file_token");
        r0.f13394a = r7.optString(com.zykj.download.OssUtils.FILE_URL);
        r0.f13395b = r7.getInt("patch_version");
        r0.f13397d = r7.optString("file_hmac");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f13396c) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0193, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f13394a) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        r14.mo10359e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a2, code lost:
    
        throw new com.taobao.sophix.p089a.C7714b(37, "query lack token or url");
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
    private com.taobao.sophix.p095d.p097b.C7738a m10336a(java.lang.String r19, com.taobao.sophix.p094c.C7733c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p095d.C7734a.m10336a(java.lang.String, com.taobao.sophix.c.c):com.taobao.sophix.d.b.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10341a(InterfaceC7737c interfaceC7737c, String str, C7733c c7733c) {
        String strM10332b;
        if (!TextUtils.isEmpty(str)) {
            C7744e.m10400b("NetworkManager", "openConnection", "cdn reqUrl", str);
            interfaceC7737c.mo10354a(str);
            interfaceC7737c.mo10355a("x-hotfix-os", DispatchConstants.ANDROID);
            interfaceC7737c.mo10355a("x-hotfix-sdk-version", SophixManager.VERSION);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (TextUtils.isEmpty(c7733c.f13367c)) {
            sb2.append("/u/");
            sb2.append(this.f13375b);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(this.f13379f);
            sb2.append(str2);
        } else {
            sb2.append("/r/");
            sb2.append(this.f13375b);
            String str3 = File.separator;
            sb2.append(str3);
            sb2.append(this.f13379f);
            sb2.append(str3);
            sb2.append(c7733c.f13367c);
            sb2.append(str3);
        }
        sb2.append(this.f13374a);
        String str4 = File.separator;
        sb2.append(str4);
        sb2.append(c7733c.f13368d);
        sb2.append(str4);
        String str5 = C7735a.f13389b + C7735a.f13388a + ((CharSequence) sb2);
        C7744e.m10400b("NetworkManager", "openConnection", "auth reqUrl", str5);
        interfaceC7737c.mo10354a(str5);
        interfaceC7737c.mo10355a("x-hotfix-os", DispatchConstants.ANDROID);
        interfaceC7737c.mo10355a("x-hotfix-sdk-version", SophixManager.VERSION);
        interfaceC7737c.mo10355a("x-hotfix-info", this.f13378e);
        if (TextUtils.isEmpty(this.f13384k)) {
            this.f13384k = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        }
        interfaceC7737c.mo10355a("x-hotfix-token", C7743d.m10389a(sb2.toString() + this.f13384k, this.f13376c));
        if (TextUtils.isEmpty(c7733c.f13367c)) {
            strM10332b = "cdate=" + this.f13384k;
        } else {
            strM10332b = c7733c.m10332b();
            int i10 = c7733c.f13373i;
            if (i10 != -9999) {
                interfaceC7737c.mo10355a("x-hotfix-error", String.valueOf(i10));
            }
        }
        interfaceC7737c.mo10355a("x-hotfix-request-id", c7733c.f13365a);
        interfaceC7737c.mo10355a("x-hotfix-ext", strM10332b);
        try {
            interfaceC7737c.mo10355a("x-hotfix-env", new a().m10352a());
        } catch (Exception e10) {
            C7744e.m10400b("NetworkManager", e10.getMessage(), e10);
        }
    }

    /* renamed from: a */
    private String m10337a(C7738a c7738a, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        C7736b c7736b = null;
        inputStream = null;
        InputStream inputStream = null;
        c7736b = null;
        try {
            try {
                C7736b c7736b2 = new C7736b();
                try {
                    try {
                        c7736b2.mo10354a(c7738a.f13394a);
                        c7736b2.mo10353a();
                        int iMo10356b = c7736b2.mo10356b();
                        if (iMo10356b == 200) {
                            File file = new File(str, m10338a(c7738a.f13394a, c7738a.f13395b));
                            try {
                                InputStream inputStreamMo10358d = c7736b2.mo10358d();
                                try {
                                    bufferedInputStream = new BufferedInputStream(inputStreamMo10358d);
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
                                            C7742c.m10382a(inputStreamMo10358d);
                                            C7742c.m10382a(bufferedInputStream);
                                            C7742c.m10382a(fileOutputStream);
                                            if (C7735a.f13390c) {
                                                String strM10388a = C7743d.m10388a(file, this.f13376c);
                                                String str2 = c7738a.f13397d;
                                                if (!TextUtils.isEmpty(str2) && !str2.equals(strM10388a)) {
                                                    throw new C7714b(10, "download broken");
                                                }
                                            }
                                            String absolutePath = file.getAbsolutePath();
                                            c7736b2.mo10359e();
                                            return absolutePath;
                                        } catch (IOException e10) {
                                            e = e10;
                                            inputStream = inputStreamMo10358d;
                                            try {
                                                throw new C7714b(52, e);
                                            } catch (Throwable th) {
                                                th = th;
                                                C7742c.m10382a(inputStream);
                                                C7742c.m10382a(bufferedInputStream);
                                                C7742c.m10382a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStreamMo10358d;
                                            C7742c.m10382a(inputStream);
                                            C7742c.m10382a(bufferedInputStream);
                                            C7742c.m10382a(fileOutputStream);
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
                            throw new C7714b(iMo10356b, "download fail as response code");
                        }
                    } catch (IOException e14) {
                        e = e14;
                        c7736b = c7736b2;
                        throw new C7714b(51, e);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c7736b = c7736b2;
                    if (c7736b != null) {
                        c7736b.mo10359e();
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
    private String m10338a(String str, int i10) {
        String strSubstring = str.substring(str.lastIndexOf(MqttTopic.TOPIC_LEVEL_SEPARATOR) + 1);
        String[] strArrSplit = strSubstring.split("\\.");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return strArrSplit[0] + BundleUtil.UNDERLINE_TAG + i10 + Consts.DOT + strArrSplit[1];
        }
        return strSubstring + BundleUtil.UNDERLINE_TAG + i10 + ".patch";
    }

    /* renamed from: a */
    public void m10348a(List<String> list) {
        this.f13381h = list;
    }
}
