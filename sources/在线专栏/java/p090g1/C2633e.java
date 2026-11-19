package p090g1;

import android.content.ComponentName;
import android.content.Context;
import p169x0.AbstractC3445n;

/* renamed from: g1.e */
/* loaded from: classes.dex */
public class C2633e {

    /* renamed from: a */
    private static final String f10417a = AbstractC3445n.m10503f("PackageManagerHelper");

    /* renamed from: a */
    public static void m8834a(Context context, Class<?> cls, boolean z3) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z3 ? 1 : 2, 1);
            AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
            String str = f10417a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z3 ? "enabled" : "disabled";
            abstractC3445nM10501c.mo10504a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e4) {
            AbstractC3445n abstractC3445nM10501c2 = AbstractC3445n.m10501c();
            String str2 = f10417a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z3 ? "enabled" : "disabled";
            abstractC3445nM10501c2.mo10504a(str2, String.format("%s could not be %s", objArr2), e4);
        }
    }
}
