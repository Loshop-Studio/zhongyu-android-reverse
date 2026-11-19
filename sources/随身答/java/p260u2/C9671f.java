package p260u2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C6753a;
import com.umeng.analytics.pro.C6763bi;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.AbstractC6783b;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;
import p154k2.AbstractC8263a;
import p176m2.AbstractC8959h;
import p186n2.AbstractC9089c;
import p196o2.C9160b;
import p210p2.AbstractC9318a;
import p250t2.AbstractC9612d;
import p270v2.AbstractC9756d;
import p280w2.C9802b;
import p280w2.C9807g;
import p290x2.AbstractC9866a;
import p290x2.C9867b;
import p290x2.C9870e;
import p290x2.C9872g;
import p290x2.InterfaceC9873h;
import p300y2.C9945a;
import p300y2.C9946b;

/* renamed from: u2.f */
/* loaded from: classes4.dex */
public class C9671f {

    /* renamed from: b */
    public C9872g f17095b;

    /* renamed from: c */
    public C9802b f17096c;

    /* renamed from: d */
    public C9807g f17097d;

    /* renamed from: e */
    public C9802b.a f17098e;

    /* renamed from: g */
    public C9946b f17100g;

    /* renamed from: h */
    public long f17101h;

    /* renamed from: i */
    public int f17102i;

    /* renamed from: j */
    public int f17103j;

    /* renamed from: k */
    public String f17104k;

    /* renamed from: l */
    public Context f17105l;

    /* renamed from: a */
    public final int f17094a = 1;

    /* renamed from: f */
    public C9945a f17099f = null;

    /* renamed from: u2.f$a */
    public class a implements InterfaceC9873h {
        public a() {
        }

        @Override // p290x2.InterfaceC9873h
        /* renamed from: a */
        public void mo16130a(C9802b.a aVar) {
            C9671f.this.f17100g.mo16130a(aVar);
            C9671f c9671f = C9671f.this;
            c9671f.f17104k = AbstractC6782a.m6274h(c9671f.f17105l, "track_list", null);
        }
    }

    public C9671f(Context context) {
        this.f17097d = null;
        this.f17098e = null;
        this.f17100g = null;
        this.f17101h = 0L;
        this.f17102i = 0;
        this.f17103j = 0;
        this.f17104k = null;
        this.f17105l = context;
        this.f17098e = C9802b.m16620u(context).m16630o();
        this.f17100g = C9946b.m17146c(this.f17105l);
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(this.f17105l);
        this.f17101h = sharedPreferencesM16841a.getLong("thtstart", 0L);
        this.f17102i = sharedPreferencesM16841a.getInt("gkvc", 0);
        this.f17103j = sharedPreferencesM16841a.getInt("ekvc", 0);
        this.f17104k = AbstractC6782a.m6274h(this.f17105l, "track_list", null);
        C9802b c9802bM16620u = C9802b.m16620u(this.f17105l);
        this.f17096c = c9802bM16620u;
        c9802bM16620u.m16625i(new a());
        if (!AbstractC8263a.m13314g(this.f17105l)) {
            this.f17097d = C9807g.m16652a(this.f17105l);
        }
        C9872g c9872g = new C9872g(this.f17105l);
        this.f17095b = c9872g;
        c9872g.m16865c(C9867b.m16842e(this.f17105l));
    }

    /* renamed from: a */
    public final int m16128a(byte[] bArr) {
        Response response = new Response();
        try {
            new C6753a(new C6763bi.a()).m6018a(response, bArr);
            if (response.f6873a == 1) {
                this.f17096c.m16629m(response.m6307u());
                this.f17096c.m16633r();
            }
        } catch (Throwable th) {
            AbstractC9318a.m15200b(this.f17105l, th);
        }
        return response.f6873a == 1 ? 2 : 3;
    }

    /* renamed from: c */
    public boolean m16129c(File file) {
        if (file == null) {
            return false;
        }
        try {
            byte[] bArrM6296q = AbstractC6783b.m6296q(file.getPath());
            if (bArrM6296q == null) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            C9870e c9870eM16853b = C9870e.m16853b(this.f17105l);
            c9870eM16853b.m16859g(name);
            boolean zM16855c = c9870eM16853b.m16855c(name);
            boolean zM16857e = c9870eM16853b.m16857e(name);
            boolean zM16858f = c9870eM16853b.m16858f(name);
            String strM15901j = AbstractC9612d.m15901j(name);
            byte[] bArrM16867e = this.f17095b.m16867e(bArrM6296q, zM16855c, zM16858f, !TextUtils.isEmpty(strM15901j) ? AbstractC9612d.m15899h(strM15901j) : zM16858f ? AbstractC9668c.f17074a : AbstractC9668c.f17077d);
            int iM16128a = bArrM16867e == null ? 1 : m16128a(bArrM16867e);
            if (AbstractC8263a.m13312e()) {
                if (zM16858f && iM16128a == 2) {
                    AbstractC8959h.m14293c("MobclickRT", "Zero req: succeed.");
                } else if (zM16857e && iM16128a == 2) {
                    AbstractC9756d.m16402a("本次启动数据: 发送成功!");
                    AbstractC8959h.m14293c("MobclickRT", "Send instant data: succeed.");
                } else if (zM16855c && iM16128a == 2) {
                    AbstractC9756d.m16402a("普通统计数据: 发送成功!");
                    AbstractC8959h.m14293c("MobclickRT", "Send analytics data: succeed.");
                } else {
                    AbstractC8959h.m14293c("MobclickRT", "Inner req: succeed.");
                }
            }
            if (iM16128a == 2) {
                C9807g c9807g = this.f17097d;
                if (c9807g != null) {
                    c9807g.m16659h();
                }
                C9867b.m16842e(this.f17105l).m16852k();
            } else if (iM16128a == 3) {
                C9867b.m16842e(this.f17105l).m16852k();
                if (zM16858f) {
                    C6780a.m6259b().m6262c(this.f17105l);
                    AbstractC8959h.m14292b("MobclickRT", "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f17105l;
                    AbstractC9089c.m14596m(context, 32784, C9160b.m14737a(context).m14738b(), null);
                    return true;
                }
            }
            return iM16128a == 2;
        } catch (Throwable th) {
            AbstractC9318a.m15200b(this.f17105l, th);
            return false;
        }
    }
}
