package p088g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p015c.C1038a;
import p015c.C1039b;
import p015c.C1041d;
import p015c.C1047j;

/* renamed from: g.a */
/* loaded from: classes.dex */
public class C2619a {

    /* renamed from: a */
    private Context f10324a;

    private C2619a(Context context) {
        this.f10324a = context;
    }

    /* renamed from: b */
    public static C2619a m8771b(Context context) {
        return new C2619a(context);
    }

    /* renamed from: a */
    public boolean m8772a() {
        return this.f10324a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m8773c() {
        return this.f10324a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m8774d() {
        Configuration configuration = this.f10324a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 <= 480 || i5 <= 640) {
            return i4 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int m8775e() {
        return this.f10324a.getResources().getDimensionPixelSize(C1041d.f5773b);
    }

    /* renamed from: f */
    public int m8776f() {
        TypedArray typedArrayObtainStyledAttributes = this.f10324a.obtainStyledAttributes(null, C1047j.f6052a, C1038a.f5739c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C1047j.f6098j, 0);
        Resources resources = this.f10324a.getResources();
        if (!m8777g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1041d.f5772a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m8777g() {
        return this.f10324a.getResources().getBoolean(C1039b.f5763a);
    }

    /* renamed from: h */
    public boolean m8778h() {
        return true;
    }
}
