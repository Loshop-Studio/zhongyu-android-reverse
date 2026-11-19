package p218k5;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;
import p189i5.C9609c;

/* renamed from: k5.a */
/* loaded from: classes5.dex */
public class C9811a {

    /* renamed from: a */
    public C9814d f23007a;

    /* renamed from: b */
    public final String f23008b;

    /* renamed from: c */
    public final C9813c f23009c;

    /* renamed from: d */
    public final int f23010d;

    /* renamed from: e */
    public final Context f23011e;

    /* renamed from: f */
    public final String f23012f;

    /* renamed from: g */
    public final GrsBaseInfo f23013g;

    /* renamed from: h */
    public final C9609c f23014h;

    public C9811a(String str, int i10, C9813c c9813c, Context context, String str2, GrsBaseInfo grsBaseInfo, C9609c c9609c) {
        this.f23008b = str;
        this.f23009c = c9813c;
        this.f23010d = i10;
        this.f23011e = context;
        this.f23012f = str2;
        this.f23013g = grsBaseInfo;
        this.f23014h = c9609c;
    }

    /* renamed from: a */
    public Context m19823a() {
        return this.f23011e;
    }

    /* renamed from: b */
    public C9813c m19824b() {
        return this.f23009c;
    }

    /* renamed from: c */
    public String m19825c() {
        return this.f23008b;
    }

    /* renamed from: d */
    public int m19826d() {
        return this.f23010d;
    }

    /* renamed from: e */
    public String m19827e() {
        return this.f23012f;
    }

    /* renamed from: f */
    public C9609c m19828f() {
        return this.f23014h;
    }

    /* renamed from: g */
    public Callable m19829g() {
        return new CallableC9816f(this.f23008b, this.f23010d, this.f23009c, this.f23011e, this.f23012f, this.f23013g, this.f23014h);
    }
}
