package android.support.v4.media;

import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: android.support.v4.media.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0037f {
    /* renamed from: A */
    public static void m72A(int i, int i8, InterfaceC6471c interfaceC6471c) {
        interfaceC6471c.invoke(Integer.valueOf(i + i8));
    }

    /* renamed from: B */
    public static void m73B(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
    }

    /* renamed from: C */
    public static String m74C(String str, String str2) {
        return str + str2;
    }

    /* renamed from: D */
    public static String m75D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: a */
    public static double m76a(double d9, double d10, double d11) {
        return (Math.sin(d9) * d10) + d11;
    }

    /* renamed from: b */
    public static float m77b(float f, float f7, float f8, float f9) {
        return ((f - f7) * f8) + f9;
    }

    /* renamed from: c */
    public static SurfaceCombination m78c(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, ArrayList arrayList, SurfaceCombination surfaceCombination2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination2);
        return new SurfaceCombination();
    }

    /* renamed from: d */
    public static SurfaceCombination m79d(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    /* renamed from: e */
    public static String m80e(char c, String str, StringBuilder sb) {
        sb.append(c);
        String string = sb.toString();
        AbstractC5830k.m5329f(string, str);
        return string;
    }

    /* renamed from: f */
    public static String m81f(int i, String str) {
        return str + i;
    }

    /* renamed from: g */
    public static String m82g(int i, String str, String str2) {
        return str + i + str2;
    }

    /* renamed from: h */
    public static String m83h(long j7, String str, StringBuilder sb) {
        sb.append(j7);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m84i(Object obj, String str) {
        return str + obj;
    }

    /* renamed from: j */
    public static String m85j(String str, String str2) {
        return str + str2;
    }

    /* renamed from: k */
    public static String m86k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: l */
    public static String m87l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* renamed from: m */
    public static String m88m(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: n */
    public static String m89n(StringBuilder sb, String str, float f) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: o */
    public static String m90o(StringBuilder sb, String str, int i) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: p */
    public static String m91p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: q */
    public static String m92q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: r */
    public static String m93r(StringBuilder sb, boolean z8, char c) {
        sb.append(z8);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: s */
    public static StringBuilder m94s(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* renamed from: t */
    public static StringBuilder m95t(CharSequence charSequence, String str, CharSequence charSequence2, String str2, CharSequence charSequence3) {
        AbstractC5830k.m5330g(charSequence, str);
        AbstractC5830k.m5330g(charSequence2, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence3);
        return sb;
    }

    /* renamed from: u */
    public static StringBuilder m96u(CharSequence charSequence, String str, InterfaceC6471c interfaceC6471c, String str2, CharSequence charSequence2) {
        AbstractC5830k.m5330g(charSequence, str);
        AbstractC5830k.m5330g(interfaceC6471c, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    /* renamed from: v */
    public static StringBuilder m97v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: w */
    public static StringBuilder m98w(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: x */
    public static StringBuilder m99x(String str, String str2, int i, String str3, int i8) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i8);
        sb.append(str3);
        return sb;
    }

    /* renamed from: y */
    public static StringBuilder m100y(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: z */
    public static StringBuilder m101z(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }
}
