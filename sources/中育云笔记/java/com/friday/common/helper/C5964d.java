package com.friday.common.helper;

import cd.AbstractC5423b;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.friday.common.helper.C5964d;
import java.io.File;
import je.AbstractC9746z;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10819z;

/* renamed from: com.friday.common.helper.d */
/* loaded from: classes3.dex */
public final class C5964d {

    /* renamed from: d */
    public static final a f6085d = new a(null);

    /* renamed from: e */
    public static final int f6086e = 8;

    /* renamed from: f */
    public static volatile C5964d f6087f;

    /* renamed from: a */
    public final InterfaceC10773d f6088a;

    /* renamed from: b */
    public final int f6089b;

    /* renamed from: c */
    public final long f6090c;

    /* renamed from: com.friday.common.helper.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C5964d m5337a() {
            if (C5964d.f6087f == null) {
                synchronized (AbstractC9983y.m20315b(C5964d.class)) {
                    try {
                        if (C5964d.f6087f == null) {
                            C5964d.f6087f = new C5964d(null);
                        }
                        C10786q c10786q = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C5964d c5964d = C5964d.f6087f;
            AbstractC9979u.m20291d(c5964d);
            return c5964d;
        }

        public a() {
        }
    }

    public /* synthetic */ C5964d(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: h */
    public static /* synthetic */ void m5326h(C5964d c5964d, String str, String str2, String str3, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        c5964d.m5331g(str, str2, str3);
    }

    /* renamed from: i */
    public static final boolean m5327i(C5964d c5964d, String str, String str2) {
        return c5964d.m5336p(str, str2);
    }

    /* renamed from: j */
    public static final boolean m5328j(C5964d c5964d, String str, String str2) {
        return c5964d.m5336p(str, str2);
    }

    /* renamed from: m */
    public static final C9742v m5329m() {
        return new C9742v();
    }

    /* renamed from: f */
    public final void m5330f(String str) {
        String str2 = PathUtils.getExternalAppCachePath() + File.separator + "placeholder.jpg";
        if (!FileUtils.isFileExists(str2)) {
            ResourceUtils.copyFileFromAssets("placeholder.jpg", str2);
        }
        FileUtils.copy(str2, str);
    }

    /* renamed from: g */
    public final void m5331g(final String url, final String localUrl, final String backupUrl) throws Exception {
        AbstractC9979u.m20294g(url, "url");
        AbstractC9979u.m20294g(localUrl, "localUrl");
        AbstractC9979u.m20294g(backupUrl, "backupUrl");
        if (m5334n(this.f6089b, new InterfaceC9529a() { // from class: f2.f
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Boolean.valueOf(C5964d.m5327i(this.f21414c, url, localUrl));
            }
        })) {
            return;
        }
        if (!m5333l(C5962b.f6082a.m5299a().m5277e(url))) {
            throw new Exception("下载次数超过上限并且非图片资源文件: " + url);
        }
        if (AbstractC9979u.m20289b(backupUrl, url) || !m5334n(3, new InterfaceC9529a() { // from class: f2.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Boolean.valueOf(C5964d.m5328j(this.f21417c, backupUrl, localUrl));
            }
        })) {
            m5330f(localUrl);
            LogUtils.m3887e("图片下载失败，使用占位图. url=" + url + ", backupUrl=" + backupUrl + ", localUrl=" + localUrl);
        }
    }

    /* renamed from: k */
    public final C9742v m5332k() {
        return (C9742v) this.f6088a.getValue();
    }

    /* renamed from: l */
    public final boolean m5333l(String str) {
        return AbstractC10819z.m23228A(str, "jpg", true) || AbstractC10819z.m23228A(str, "png", true) || AbstractC10819z.m23228A(str, "webp", true);
    }

    /* renamed from: n */
    public final boolean m5334n(int i10, InterfaceC9529a interfaceC9529a) throws InterruptedException {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) interfaceC9529a.invoke()).booleanValue()) {
                return true;
            }
            if (i11 < i10 - 1) {
                Thread.sleep(this.f6090c);
            }
        }
        return false;
    }

    /* renamed from: o */
    public final void m5335o(C9745y c9745y, String str) throws Exception {
        AbstractC9746z abstractC9746zM19628e = c9745y.m19628e();
        if (abstractC9746zM19628e == null) {
            throw new Exception("Response body 为空");
        }
        if (!FileIOUtils.writeFileFromIS(str, abstractC9746zM19628e.byteStream())) {
            throw new Exception("写入文件失败");
        }
    }

    /* renamed from: p */
    public final boolean m5336p(String str, String str2) {
        String strM5277e = C5962b.f6082a.m5299a().m5277e(str);
        try {
            C9745y c9745yExecute = m5332k().mo19319b(new C9743w.a().m19608p(strM5277e).m19595b()).execute();
            try {
                if (c9745yExecute.m19638s()) {
                    m5335o(c9745yExecute, str2);
                    AbstractC5423b.m2902a(c9745yExecute, null);
                    return true;
                }
                LogUtils.m3890w("下载失败 url=" + strM5277e + " code=" + c9745yExecute.m19632j() + " msg=" + c9745yExecute.m19639t());
                AbstractC5423b.m2902a(c9745yExecute, null);
                return false;
            } finally {
            }
        } catch (Exception e10) {
            LogUtils.m3890w("下载异常 realUrl=" + strM5277e + " local=" + str2 + " " + e10.getMessage(), e10);
            return false;
        }
    }

    public C5964d() {
        this.f6088a = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: f2.h
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C5964d.m5329m();
            }
        });
        this.f6089b = 3;
        this.f6090c = 1000L;
    }
}
