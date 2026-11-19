package p005a3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

/* renamed from: a3.c */
/* loaded from: classes4.dex */
public class C0020c {

    /* renamed from: w */
    public static C0020c f34w;

    /* renamed from: a */
    public boolean f35a = false;

    /* renamed from: b */
    public int f36b = 0;

    /* renamed from: c */
    public int f37c = 0;

    /* renamed from: d */
    public ColorStateList f38d = null;

    /* renamed from: e */
    public ColorStateList f39e = null;

    /* renamed from: f */
    public ColorStateList f40f = null;

    /* renamed from: g */
    public int f41g = 0;

    /* renamed from: h */
    public int f42h = 0;

    /* renamed from: i */
    public Drawable f43i = null;

    /* renamed from: j */
    public int f44j = 0;

    /* renamed from: k */
    public int f45k = 0;

    /* renamed from: l */
    public ColorStateList f46l = null;

    /* renamed from: m */
    public int f47m = 0;

    /* renamed from: n */
    public int f48n = 0;

    /* renamed from: o */
    public int f49o = 0;

    /* renamed from: p */
    public int f50p = 0;

    /* renamed from: q */
    public int f51q = 0;

    /* renamed from: r */
    public GravityEnum f52r;

    /* renamed from: s */
    public GravityEnum f53s;

    /* renamed from: t */
    public GravityEnum f54t;

    /* renamed from: u */
    public GravityEnum f55u;

    /* renamed from: v */
    public GravityEnum f56v;

    public C0020c() {
        GravityEnum gravityEnum = GravityEnum.START;
        this.f52r = gravityEnum;
        this.f53s = gravityEnum;
        this.f54t = GravityEnum.END;
        this.f55u = gravityEnum;
        this.f56v = gravityEnum;
    }

    /* renamed from: a */
    public static C0020c m60a() {
        return m61b(true);
    }

    /* renamed from: b */
    public static C0020c m61b(boolean z9) {
        if (f34w == null && z9) {
            f34w = new C0020c();
        }
        return f34w;
    }
}
