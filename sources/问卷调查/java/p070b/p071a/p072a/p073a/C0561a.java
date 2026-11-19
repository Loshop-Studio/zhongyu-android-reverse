package p070b.p071a.p072a.p073a;

import androidx.recyclerview.widget.RecyclerView;
import org.xmlpull.v1.XmlPullParser;
import p000a.p052k.p053b.ComponentCallbacksC0320m;

/* compiled from: outline */
/* renamed from: b.a.a.a.a */
/* loaded from: classes.dex */
public class C0561a {
    /* renamed from: a */
    public static float m2073a(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    /* renamed from: b */
    public static String m2074b(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m1827A());
        return sb.toString();
    }

    /* renamed from: c */
    public static String m2075c(String str, ComponentCallbacksC0320m componentCallbacksC0320m, String str2) {
        return str + componentCallbacksC0320m + str2;
    }

    /* renamed from: d */
    public static String m2076d(String str, String str2) {
        return str + str2;
    }

    /* renamed from: e */
    public static String m2077e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: f */
    public static String m2078f(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: g */
    public static StringBuilder m2079g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}
