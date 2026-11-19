package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0282r;
import androidx.constraintlayout.widget.C0293a;
import androidx.constraintlayout.widget.C0295c;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.zykj.download.OssUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p113l.C2827c;
import p121n.C2869e;

/* renamed from: androidx.constraintlayout.motion.widget.m */
/* loaded from: classes.dex */
class C0277m implements Comparable<C0277m> {

    /* renamed from: C */
    static String[] f1601C = {RequestParameters.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: c */
    int f1606c;

    /* renamed from: p */
    private C2827c f1619p;

    /* renamed from: r */
    private float f1621r;

    /* renamed from: s */
    private float f1622s;

    /* renamed from: t */
    private float f1623t;

    /* renamed from: u */
    private float f1624u;

    /* renamed from: v */
    private float f1625v;

    /* renamed from: a */
    private float f1604a = 1.0f;

    /* renamed from: b */
    int f1605b = 0;

    /* renamed from: d */
    private boolean f1607d = false;

    /* renamed from: e */
    private float f1608e = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: f */
    private float f1609f = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: g */
    private float f1610g = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: h */
    public float f1611h = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: i */
    private float f1612i = 1.0f;

    /* renamed from: j */
    private float f1613j = 1.0f;

    /* renamed from: k */
    private float f1614k = Float.NaN;

    /* renamed from: l */
    private float f1615l = Float.NaN;

    /* renamed from: m */
    private float f1616m = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: n */
    private float f1617n = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: o */
    private float f1618o = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: q */
    private int f1620q = 0;

    /* renamed from: w */
    private float f1626w = Float.NaN;

    /* renamed from: x */
    private float f1627x = Float.NaN;

    /* renamed from: y */
    LinkedHashMap<String, C0293a> f1628y = new LinkedHashMap<>();

    /* renamed from: z */
    int f1629z = 0;

    /* renamed from: A */
    double[] f1602A = new double[18];

    /* renamed from: B */
    double[] f1603B = new double[18];

    /* renamed from: e */
    private boolean m1407e(float f4, float f5) {
        return (Float.isNaN(f4) || Float.isNaN(f5)) ? Float.isNaN(f4) != Float.isNaN(f5) : Math.abs(f4 - f5) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    public void m1408a(HashMap<String, AbstractC0282r> map, int i4) {
        for (String str : map.keySet()) {
            AbstractC0282r abstractC0282r = map.get(str);
            str.hashCode();
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals(OssUtils.PROGRESS)) {
                        c4 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c4 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c4 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c4 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c4 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c4 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c4 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c4 = '\r';
                        break;
                    }
                    break;
            }
            float f4 = IGoodView.DEFAULT_TO_ALPHA;
            switch (c4) {
                case 0:
                    if (!Float.isNaN(this.f1610g)) {
                        f4 = this.f1610g;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case 1:
                    if (!Float.isNaN(this.f1611h)) {
                        f4 = this.f1611h;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case 2:
                    if (!Float.isNaN(this.f1616m)) {
                        f4 = this.f1616m;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case 3:
                    if (!Float.isNaN(this.f1617n)) {
                        f4 = this.f1617n;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case 4:
                    if (!Float.isNaN(this.f1618o)) {
                        f4 = this.f1618o;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case 5:
                    if (!Float.isNaN(this.f1627x)) {
                        f4 = this.f1627x;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case 6:
                    abstractC0282r.mo1535e(i4, Float.isNaN(this.f1612i) ? 1.0f : this.f1612i);
                    break;
                case 7:
                    abstractC0282r.mo1535e(i4, Float.isNaN(this.f1613j) ? 1.0f : this.f1613j);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f1614k)) {
                        f4 = this.f1614k;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f1615l)) {
                        f4 = this.f1615l;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f1609f)) {
                        f4 = this.f1609f;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case 11:
                    if (!Float.isNaN(this.f1608e)) {
                        f4 = this.f1608e;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f1626w)) {
                        f4 = this.f1626w;
                    }
                    abstractC0282r.mo1535e(i4, f4);
                    break;
                case '\r':
                    abstractC0282r.mo1535e(i4, Float.isNaN(this.f1604a) ? 1.0f : this.f1604a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f1628y.containsKey(str2)) {
                            C0293a c0293a = this.f1628y.get(str2);
                            if (abstractC0282r instanceof AbstractC0282r.b) {
                                ((AbstractC0282r.b) abstractC0282r).m1539i(i4, c0293a);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " splineSet not a CustomSet frame = " + i4 + ", value" + c0293a.m1635d() + abstractC0282r);
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN customName " + str2);
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    /* renamed from: b */
    public void m1409b(View view) {
        this.f1606c = view.getVisibility();
        this.f1604a = view.getVisibility() != 0 ? IGoodView.DEFAULT_TO_ALPHA : view.getAlpha();
        this.f1607d = false;
        this.f1608e = view.getElevation();
        this.f1609f = view.getRotation();
        this.f1610g = view.getRotationX();
        this.f1611h = view.getRotationY();
        this.f1612i = view.getScaleX();
        this.f1613j = view.getScaleY();
        this.f1614k = view.getPivotX();
        this.f1615l = view.getPivotY();
        this.f1616m = view.getTranslationX();
        this.f1617n = view.getTranslationY();
        this.f1618o = view.getTranslationZ();
    }

    /* renamed from: c */
    public void m1410c(C0295c.a aVar) {
        C0295c.d dVar = aVar.f1985b;
        int i4 = dVar.f2063c;
        this.f1605b = i4;
        int i5 = dVar.f2062b;
        this.f1606c = i5;
        this.f1604a = (i5 == 0 || i4 != 0) ? dVar.f2064d : IGoodView.DEFAULT_TO_ALPHA;
        C0295c.e eVar = aVar.f1988e;
        this.f1607d = eVar.f2078l;
        this.f1608e = eVar.f2079m;
        this.f1609f = eVar.f2068b;
        this.f1610g = eVar.f2069c;
        this.f1611h = eVar.f2070d;
        this.f1612i = eVar.f2071e;
        this.f1613j = eVar.f2072f;
        this.f1614k = eVar.f2073g;
        this.f1615l = eVar.f2074h;
        this.f1616m = eVar.f2075i;
        this.f1617n = eVar.f2076j;
        this.f1618o = eVar.f2077k;
        this.f1619p = C2827c.m9454c(aVar.f1986c.f2056c);
        C0295c.c cVar = aVar.f1986c;
        this.f1626w = cVar.f2060g;
        this.f1620q = cVar.f2058e;
        this.f1627x = aVar.f1985b.f2065e;
        for (String str : aVar.f1989f.keySet()) {
            C0293a c0293a = aVar.f1989f.get(str);
            if (c0293a.m1634c() != C0293a.b.STRING_TYPE) {
                this.f1628y.put(str, c0293a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0277m c0277m) {
        return Float.compare(this.f1621r, c0277m.f1621r);
    }

    /* renamed from: f */
    void m1412f(C0277m c0277m, HashSet<String> hashSet) {
        if (m1407e(this.f1604a, c0277m.f1604a)) {
            hashSet.add("alpha");
        }
        if (m1407e(this.f1608e, c0277m.f1608e)) {
            hashSet.add("elevation");
        }
        int i4 = this.f1606c;
        int i5 = c0277m.f1606c;
        if (i4 != i5 && this.f1605b == 0 && (i4 == 0 || i5 == 0)) {
            hashSet.add("alpha");
        }
        if (m1407e(this.f1609f, c0277m.f1609f)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1626w) || !Float.isNaN(c0277m.f1626w)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1627x) || !Float.isNaN(c0277m.f1627x)) {
            hashSet.add(OssUtils.PROGRESS);
        }
        if (m1407e(this.f1610g, c0277m.f1610g)) {
            hashSet.add("rotationX");
        }
        if (m1407e(this.f1611h, c0277m.f1611h)) {
            hashSet.add("rotationY");
        }
        if (m1407e(this.f1614k, c0277m.f1614k)) {
            hashSet.add("transformPivotX");
        }
        if (m1407e(this.f1615l, c0277m.f1615l)) {
            hashSet.add("transformPivotY");
        }
        if (m1407e(this.f1612i, c0277m.f1612i)) {
            hashSet.add("scaleX");
        }
        if (m1407e(this.f1613j, c0277m.f1613j)) {
            hashSet.add("scaleY");
        }
        if (m1407e(this.f1616m, c0277m.f1616m)) {
            hashSet.add("translationX");
        }
        if (m1407e(this.f1617n, c0277m.f1617n)) {
            hashSet.add("translationY");
        }
        if (m1407e(this.f1618o, c0277m.f1618o)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: g */
    void m1413g(float f4, float f5, float f6, float f7) {
        this.f1622s = f4;
        this.f1623t = f5;
        this.f1624u = f6;
        this.f1625v = f7;
    }

    /* renamed from: h */
    public void m1414h(View view) {
        m1413g(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        m1409b(view);
    }

    /* renamed from: i */
    public void m1415i(C2869e c2869e, C0295c c0295c, int i4) {
        m1413g(c2869e.m9719R(), c2869e.m9720S(), c2869e.m9718Q(), c2869e.m9763w());
        m1410c(c0295c.m1667q(i4));
    }
}
