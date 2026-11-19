package com.friday.common.helper;

import anet.channel.util.HttpConstant;
import anetwork.channel.util.RequestConstant;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.StringUtils;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p158g2.C9261a;
import p309qc.C10786q;
import p310qd.AbstractC10819z;

/* renamed from: com.friday.common.helper.b */
/* loaded from: classes3.dex */
public final class C5962b {

    /* renamed from: a */
    public static final a f6082a = new a(null);

    /* renamed from: b */
    public static volatile C5962b f6083b;

    /* renamed from: com.friday.common.helper.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C5962b m5299a() {
            if (C5962b.f6083b == null) {
                synchronized (AbstractC9983y.m20315b(C5962b.class)) {
                    try {
                        if (C5962b.f6083b == null) {
                            C5962b.f6083b = new C5962b(null);
                        }
                        C10786q c10786q = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C5962b c5962b = C5962b.f6083b;
            AbstractC9979u.m20291d(c5962b);
            return c5962b;
        }

        public a() {
        }
    }

    public /* synthetic */ C5962b(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: A */
    public final void m5263A(String code) {
        AbstractC9979u.m20294g(code, "code");
        SPUtils sPUtils = SPUtils.getInstance();
        String lowerCase = code.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        sPUtils.put("SCHOOL_CODE", lowerCase, true);
    }

    /* renamed from: B */
    public final void m5264B(int i10) {
        SPUtils.getInstance().put("FOLDER_ORDER", i10);
    }

    /* renamed from: C */
    public final void m5265C(String ip) {
        AbstractC9979u.m20294g(ip, "ip");
        SPUtils.getInstance().put("KEY_LECTURE_IP", ip, true);
    }

    /* renamed from: D */
    public final void m5266D(String path) {
        AbstractC9979u.m20294g(path, "path");
        SPUtils.getInstance().put("NOTE_PATH", path, true);
    }

    /* renamed from: E */
    public final void m5267E(int i10) {
        SPUtils.getInstance().put("KEY_SHARE_ORDER", i10);
    }

    /* renamed from: F */
    public final void m5268F(String str) {
        if (str == null || !AbstractC10819z.m23240M(str, HttpConstant.HTTP, true)) {
            return;
        }
        SPUtils.getInstance().put("NEW_TEACHER_HOST", str, true);
    }

    /* renamed from: G */
    public final void m5269G(String token) {
        AbstractC9979u.m20294g(token, "token");
        SPUtils.getInstance().put("NEW_TEACHER_TOKEN", token, true);
    }

    /* renamed from: H */
    public final void m5270H(long j10) {
        SPUtils.getInstance().put("ACCOUNT_ID", j10, true);
    }

    /* renamed from: I */
    public final void m5271I(String userName) {
        AbstractC9979u.m20294g(userName, "userName");
        SPUtils.getInstance().put("USER_NAME", userName, true);
    }

    /* renamed from: J */
    public final void m5272J(String code) {
        AbstractC9979u.m20294g(code, "code");
        SPUtils.getInstance().put("KEY_AUTH_CODE", code, true);
    }

    /* renamed from: K */
    public final void m5273K(int i10) {
        SPUtils.getInstance().put("ROLE_TYPE", i10, true);
    }

    /* renamed from: L */
    public final void m5274L(boolean z10) {
        SPUtils.getInstance().put("FBI_WARNING", z10, true);
    }

    /* renamed from: c */
    public final String m5275c(String fileName) {
        AbstractC9979u.m20294g(fileName, "fileName");
        return m5286n() + MqttTopic.TOPIC_LEVEL_SEPARATOR + m5281i() + MqttTopic.TOPIC_LEVEL_SEPARATOR + m5292t() + MqttTopic.TOPIC_LEVEL_SEPARATOR + fileName;
    }

    /* renamed from: d */
    public final String m5276d(String objectKey) {
        AbstractC9979u.m20294g(objectKey, "objectKey");
        return "http://" + m5279g() + Consts.DOT + m5285m() + MqttTopic.TOPIC_LEVEL_SEPARATOR + objectKey;
    }

    /* renamed from: e */
    public final String m5277e(String url) {
        AbstractC9979u.m20294g(url, "url");
        if (AbstractC10819z.m23242O(url, HttpConstant.HTTP, false, 2, null)) {
            return url;
        }
        if (!AbstractC10819z.m23242O(url, "note_v2", false, 2, null)) {
            return m5276d(url);
        }
        return SPUtils.getInstance().getString("OSS_ENDPOINT") + MqttTopic.TOPIC_LEVEL_SEPARATOR + url;
    }

    /* renamed from: f */
    public final String m5278f() {
        String string = SPUtils.getInstance().getString("KEY_AUTH_CODE");
        AbstractC9979u.m20293f(string, "getString(...)");
        return string;
    }

    /* renamed from: g */
    public final String m5279g() {
        return AbstractC10819z.m23242O(m5281i(), "dev", false, 2, null) ? "friday-note-dev" : AbstractC10819z.m23242O(m5281i(), RequestConstant.ENV_TEST, false, 2, null) ? "friday-note-test" : "friday-note";
    }

    /* renamed from: h */
    public final String m5280h() {
        String string = SPUtils.getInstance().getString("CACHE_CODE");
        AbstractC9979u.m20293f(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: i */
    public final String m5281i() {
        String string = SPUtils.getInstance().getString("SCHOOL_CODE");
        AbstractC9979u.m20293f(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: j */
    public final int m5282j() {
        return SPUtils.getInstance().getInt("FOLDER_ORDER", 0);
    }

    /* renamed from: k */
    public final String m5283k() {
        String string = SPUtils.getInstance().getString("KEY_LECTURE_IP");
        AbstractC9979u.m20293f(string, "getString(...)");
        return string;
    }

    /* renamed from: l */
    public final String m5284l() {
        String string = SPUtils.getInstance().getString("NOTE_PATH");
        AbstractC9979u.m20293f(string, "getString(...)");
        return string;
    }

    /* renamed from: m */
    public final String m5285m() {
        return (AbstractC10819z.m23242O(m5281i(), "dev", false, 2, null) || AbstractC10819z.m23242O(m5281i(), RequestConstant.ENV_TEST, false, 2, null)) ? "oss-cn-shanghai.aliyuncs.com" : "oss-cn-hangzhou.aliyuncs.com";
    }

    /* renamed from: n */
    public final String m5286n() {
        return AbstractC10819z.m23242O(m5281i(), "dev", false, 2, null) ? "dev/file" : AbstractC10819z.m23242O(m5281i(), RequestConstant.ENV_TEST, false, 2, null) ? "test/file" : "cloudnote/notes";
    }

    /* renamed from: o */
    public final int m5287o() {
        return SPUtils.getInstance().getInt("ROLE_TYPE", 0);
    }

    /* renamed from: p */
    public final int m5288p() {
        return SPUtils.getInstance().getInt("KEY_SHARE_ORDER", 0);
    }

    /* renamed from: q */
    public final boolean m5289q() {
        return SPUtils.getInstance().getBoolean("FBI_WARNING", true);
    }

    /* renamed from: r */
    public final String m5290r() {
        String string = SPUtils.getInstance().getString("NEW_TEACHER_HOST", "https://default");
        return (string == null || !AbstractC10819z.m23240M(string, HttpConstant.HTTP, true)) ? "https://default" : string;
    }

    /* renamed from: s */
    public final String m5291s() {
        String string = SPUtils.getInstance().getString("NEW_TEACHER_TOKEN");
        AbstractC9979u.m20293f(string, "getString(...)");
        return string;
    }

    /* renamed from: t */
    public final long m5292t() {
        return SPUtils.getInstance().getLong("ACCOUNT_ID");
    }

    /* renamed from: u */
    public final String m5293u() {
        String string = SPUtils.getInstance().getString("USER_NAME");
        AbstractC9979u.m20293f(string, "getString(...)");
        return string;
    }

    /* renamed from: v */
    public final boolean m5294v() {
        return C9261a.f21604a.m18258a();
    }

    /* renamed from: w */
    public final boolean m5295w() {
        return !C9261a.f21604a.m18258a();
    }

    /* renamed from: x */
    public final boolean m5296x() {
        return !StringUtils.isEmpty(m5291s());
    }

    /* renamed from: y */
    public final void m5297y(String account) {
        AbstractC9979u.m20294g(account, "account");
        SPUtils.getInstance().put("ACCOUNT_NAME", account, true);
    }

    /* renamed from: z */
    public final void m5298z(String code) {
        AbstractC9979u.m20294g(code, "code");
        SPUtils sPUtils = SPUtils.getInstance();
        String lowerCase = code.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        sPUtils.put("CACHE_CODE", lowerCase, true);
    }

    public C5962b() {
    }
}
