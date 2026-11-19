package p148s;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p139q.C3005c;

/* renamed from: s.d */
/* loaded from: classes.dex */
final class C3366d {
    /* renamed from: a */
    private static a m10223a(a aVar, int i4, int i5, boolean z3, int i6) {
        return aVar != null ? aVar : z3 ? new a(i4, i6, i5) : new a(i4, i5);
    }

    /* renamed from: b */
    static Shader m10224b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C3005c.f11665y);
        float fM10250f = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "startX", C3005c.f11634H, IGoodView.DEFAULT_TO_ALPHA);
        float fM10250f2 = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "startY", C3005c.f11635I, IGoodView.DEFAULT_TO_ALPHA);
        float fM10250f3 = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "endX", C3005c.f11636J, IGoodView.DEFAULT_TO_ALPHA);
        float fM10250f4 = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "endY", C3005c.f11637K, IGoodView.DEFAULT_TO_ALPHA);
        float fM10250f5 = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "centerX", C3005c.f11629C, IGoodView.DEFAULT_TO_ALPHA);
        float fM10250f6 = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "centerY", C3005c.f11630D, IGoodView.DEFAULT_TO_ALPHA);
        int iM10251g = C3369g.m10251g(typedArrayM10255k, xmlPullParser, "type", C3005c.f11628B, 0);
        int iM10246b = C3369g.m10246b(typedArrayM10255k, xmlPullParser, "startColor", C3005c.f11666z, 0);
        boolean zM10254j = C3369g.m10254j(xmlPullParser, "centerColor");
        int iM10246b2 = C3369g.m10246b(typedArrayM10255k, xmlPullParser, "centerColor", C3005c.f11633G, 0);
        int iM10246b3 = C3369g.m10246b(typedArrayM10255k, xmlPullParser, "endColor", C3005c.f11627A, 0);
        int iM10251g2 = C3369g.m10251g(typedArrayM10255k, xmlPullParser, "tileMode", C3005c.f11632F, 0);
        float fM10250f7 = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "gradientRadius", C3005c.f11631E, IGoodView.DEFAULT_TO_ALPHA);
        typedArrayM10255k.recycle();
        a aVarM10223a = m10223a(m10225c(resources, xmlPullParser, attributeSet, theme), iM10246b, iM10246b3, zM10254j, iM10246b2);
        if (iM10251g != 1) {
            return iM10251g != 2 ? new LinearGradient(fM10250f, fM10250f2, fM10250f3, fM10250f4, aVarM10223a.f11825a, aVarM10223a.f11826b, m10226d(iM10251g2)) : new SweepGradient(fM10250f5, fM10250f6, aVarM10223a.f11825a, aVarM10223a.f11826b);
        }
        if (fM10250f7 > IGoodView.DEFAULT_TO_ALPHA) {
            return new RadialGradient(fM10250f5, fM10250f6, fM10250f7, aVarM10223a.f11825a, aVarM10223a.f11826b, m10226d(iM10251g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new p148s.C3366d.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p148s.C3366d.a m10225c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p139q.C3005c.f11638L
            android.content.res.TypedArray r3 = p148s.C3369g.m10255k(r9, r12, r11, r3)
            int r5 = p139q.C3005c.f11639M
            boolean r6 = r3.hasValue(r5)
            int r7 = p139q.C3005c.f11640N
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            s.d$a r9 = new s.d$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148s.C3366d.m10225c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):s.d$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m10226d(int i4) {
        return i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* renamed from: s.d$a */
    static final class a {

        /* renamed from: a */
        final int[] f11825a;

        /* renamed from: b */
        final float[] f11826b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f11825a = new int[size];
            this.f11826b = new float[size];
            for (int i4 = 0; i4 < size; i4++) {
                this.f11825a[i4] = list.get(i4).intValue();
                this.f11826b[i4] = list2.get(i4).floatValue();
            }
        }

        a(int i4, int i5) {
            this.f11825a = new int[]{i4, i5};
            this.f11826b = new float[]{IGoodView.DEFAULT_TO_ALPHA, 1.0f};
        }

        a(int i4, int i5, int i6) {
            this.f11825a = new int[]{i4, i5, i6};
            this.f11826b = new float[]{IGoodView.DEFAULT_TO_ALPHA, 0.5f, 1.0f};
        }
    }
}
