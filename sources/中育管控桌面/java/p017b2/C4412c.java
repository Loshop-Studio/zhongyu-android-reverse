package p017b2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

/* renamed from: b2.c */
/* loaded from: classes3.dex */
public class C4412c {

    /* renamed from: w */
    public static C4412c f1272w;

    /* renamed from: a */
    public boolean f1273a = false;

    /* renamed from: b */
    public int f1274b = 0;

    /* renamed from: c */
    public int f1275c = 0;

    /* renamed from: d */
    public ColorStateList f1276d = null;

    /* renamed from: e */
    public ColorStateList f1277e = null;

    /* renamed from: f */
    public ColorStateList f1278f = null;

    /* renamed from: g */
    public int f1279g = 0;

    /* renamed from: h */
    public int f1280h = 0;

    /* renamed from: i */
    public Drawable f1281i = null;

    /* renamed from: j */
    public int f1282j = 0;

    /* renamed from: k */
    public int f1283k = 0;

    /* renamed from: l */
    public ColorStateList f1284l = null;

    /* renamed from: m */
    public int f1285m = 0;

    /* renamed from: n */
    public int f1286n = 0;

    /* renamed from: o */
    public int f1287o = 0;

    /* renamed from: p */
    public int f1288p = 0;

    /* renamed from: q */
    public int f1289q = 0;

    /* renamed from: r */
    public GravityEnum f1290r;

    /* renamed from: s */
    public GravityEnum f1291s;

    /* renamed from: t */
    public GravityEnum f1292t;

    /* renamed from: u */
    public GravityEnum f1293u;

    /* renamed from: v */
    public GravityEnum f1294v;

    public C4412c() {
        GravityEnum gravityEnum = GravityEnum.START;
        this.f1290r = gravityEnum;
        this.f1291s = gravityEnum;
        this.f1292t = GravityEnum.END;
        this.f1293u = gravityEnum;
        this.f1294v = gravityEnum;
    }

    /* renamed from: a */
    public static C4412c m1471a() {
        return m1472b(true);
    }

    /* renamed from: b */
    public static C4412c m1472b(boolean z6) {
        if (f1272w == null && z6) {
            f1272w = new C4412c();
        }
        return f1272w;
    }
}
