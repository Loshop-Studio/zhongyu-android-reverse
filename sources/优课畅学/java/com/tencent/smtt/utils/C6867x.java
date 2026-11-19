package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* renamed from: com.tencent.smtt.utils.x */
/* loaded from: classes4.dex */
public class C6867x {

    /* renamed from: c */
    private static C6867x f7015c;

    /* renamed from: a */
    private Context f7016a;

    /* renamed from: b */
    private File f7017b = null;

    /* renamed from: d */
    private String f7018d = "http://log.tbs.qq.com/ajax?c=pu&v=2&k=";

    /* renamed from: e */
    private String f7019e = "http://log.tbs.qq.com/ajax?c=pu&tk=";

    /* renamed from: f */
    private String f7020f = "http://wup.imtt.qq.com:8080";

    /* renamed from: g */
    private String f7021g = "http://log.tbs.qq.com/ajax?c=dl&k=";

    /* renamed from: h */
    private String f7022h = "http://cfg.imtt.qq.com/tbs?v=2&mk=";

    /* renamed from: i */
    private String f7023i = "http://log.tbs.qq.com/ajax?c=ul&v=2&k=";

    /* renamed from: j */
    private String f7024j = "http://mqqad.html5.qq.com/adjs";

    /* renamed from: k */
    private String f7025k = "http://log.tbs.qq.com/ajax?c=ucfu&k=";

    @TargetApi(11)
    private C6867x(Context context) {
        this.f7016a = null;
        TbsLog.m6252w("TbsCommonConfig", "TbsCommonConfig constructing...");
        this.f7016a = context.getApplicationContext();
        m6389g();
    }

    /* renamed from: a */
    public static synchronized C6867x m6387a() {
        return f7015c;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c4 -> B:62:0x00f4). Please report as a decompilation issue!!! */
    /* renamed from: g */
    private synchronized void m6389g() {
        File fileM6390h;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                fileM6390h = m6390h();
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (fileM6390h == null) {
            TbsLog.m6246e("TbsCommonConfig", "Config file is null, default values will be applied");
            return;
        }
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileM6390h));
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream2);
            String property = properties.getProperty("pv_post_url", "");
            if (!"".equals(property)) {
                this.f7018d = property;
            }
            String property2 = properties.getProperty("wup_proxy_domain", "");
            if (!"".equals(property2)) {
                this.f7020f = property2;
            }
            String property3 = properties.getProperty("tbs_download_stat_post_url", "");
            if (!"".equals(property3)) {
                this.f7021g = property3;
            }
            String property4 = properties.getProperty("tbs_downloader_post_url", "");
            if (!"".equals(property4)) {
                this.f7022h = property4;
            }
            String property5 = properties.getProperty("tbs_log_post_url", "");
            if (!"".equals(property5)) {
                this.f7023i = property5;
            }
            String property6 = properties.getProperty("tips_url", "");
            if (!"".equals(property6)) {
                this.f7024j = property6;
            }
            String property7 = properties.getProperty("tbs_cmd_post_url", "");
            if (!"".equals(property7)) {
                this.f7025k = property7;
            }
            String property8 = properties.getProperty("pv_post_url_tk", "");
            if (!"".equals(property8)) {
                this.f7019e = property8;
            }
            bufferedInputStream2.close();
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
            try {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                TbsLog.m6246e("TbsCommonConfig", "exceptions occurred1:" + stringWriter.toString());
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } finally {
            }
        }
    }

    /* renamed from: h */
    private File m6390h() {
        File file = null;
        try {
            if (this.f7017b == null) {
                File file2 = new File(C6854k.m6298a(this.f7016a, 5));
                this.f7017b = file2;
                if (!file2.isDirectory()) {
                    return null;
                }
            }
            File file3 = new File(this.f7017b, "tbsnet.conf");
            if (!file3.exists()) {
                TbsLog.m6246e("TbsCommonConfig", "Get file(" + file3.getCanonicalPath() + ") failed!");
                return null;
            }
            try {
                TbsLog.m6252w("TbsCommonConfig", "pathc:" + file3.getCanonicalPath());
                return file3;
            } catch (Throwable th) {
                th = th;
                file = file3;
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                TbsLog.m6246e("TbsCommonConfig", "exceptions occurred2:" + stringWriter.toString());
                return file;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public String m6391b() {
        return this.f7018d;
    }

    /* renamed from: c */
    public String m6392c() {
        return this.f7021g;
    }

    /* renamed from: d */
    public String m6393d() {
        return this.f7022h;
    }

    /* renamed from: e */
    public String m6394e() {
        return this.f7023i;
    }

    /* renamed from: f */
    public String m6395f() {
        return this.f7019e;
    }

    /* renamed from: a */
    public static synchronized C6867x m6388a(Context context) {
        try {
            if (f7015c == null) {
                f7015c = new C6867x(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7015c;
    }
}
