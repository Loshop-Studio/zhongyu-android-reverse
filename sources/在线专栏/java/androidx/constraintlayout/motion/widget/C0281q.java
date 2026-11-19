package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0295c;
import androidx.constraintlayout.widget.C0297e;
import androidx.constraintlayout.widget.C0298f;
import androidx.constraintlayout.widget.C0299g;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p113l.C2827c;

/* renamed from: androidx.constraintlayout.motion.widget.q */
/* loaded from: classes.dex */
public class C0281q {

    /* renamed from: a */
    private final MotionLayout f1674a;

    /* renamed from: n */
    private MotionEvent f1687n;

    /* renamed from: p */
    private MotionLayout.InterfaceC0260f f1689p;

    /* renamed from: q */
    private boolean f1690q;

    /* renamed from: r */
    float f1691r;

    /* renamed from: s */
    float f1692s;

    /* renamed from: b */
    C0299g f1675b = null;

    /* renamed from: c */
    b f1676c = null;

    /* renamed from: d */
    private boolean f1677d = false;

    /* renamed from: e */
    private ArrayList<b> f1678e = new ArrayList<>();

    /* renamed from: f */
    private b f1679f = null;

    /* renamed from: g */
    private ArrayList<b> f1680g = new ArrayList<>();

    /* renamed from: h */
    private SparseArray<C0295c> f1681h = new SparseArray<>();

    /* renamed from: i */
    private HashMap<String, Integer> f1682i = new HashMap<>();

    /* renamed from: j */
    private SparseIntArray f1683j = new SparseIntArray();

    /* renamed from: k */
    private boolean f1684k = false;

    /* renamed from: l */
    private int f1685l = 400;

    /* renamed from: m */
    private int f1686m = 0;

    /* renamed from: o */
    private boolean f1688o = false;

    /* renamed from: androidx.constraintlayout.motion.widget.q$a */
    class a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C2827c f1693a;

        a(C2827c c2827c) {
            this.f1693a = c2827c;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) this.f1693a.mo9455a(f4);
        }
    }

    C0281q(Context context, MotionLayout motionLayout, int i4) throws XmlPullParserException, Resources.NotFoundException, IOException {
        this.f1674a = motionLayout;
        m1456C(context, i4);
        SparseArray<C0295c> sparseArray = this.f1681h;
        int i5 = C0297e.f2080a;
        sparseArray.put(i5, new C0295c());
        this.f1682i.put("motion_base", Integer.valueOf(i5));
    }

    /* renamed from: A */
    private boolean m1454A(int i4) {
        int i5 = this.f1683j.get(i4);
        int size = this.f1683j.size();
        while (i5 > 0) {
            if (i5 == i4) {
                return true;
            }
            int i6 = size - 1;
            if (size < 0) {
                return true;
            }
            i5 = this.f1683j.get(i5);
            size = i6;
        }
        return false;
    }

    /* renamed from: B */
    private boolean m1455B() {
        return this.f1689p != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1456C(android.content.Context r9, int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0281q.m1456C(android.content.Context, int):void");
    }

    /* renamed from: D */
    private void m1457D(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C0295c c0295c = new C0295c();
        c0295c.m1654A(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iM1465o = -1;
        int iM1465o2 = -1;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlPullParser.getAttributeName(i4);
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            if (this.f1684k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iM1465o2 = m1465o(context, attributeValue);
            } else if (attributeName.equals("id")) {
                iM1465o = m1465o(context, attributeValue);
                this.f1682i.put(m1460P(attributeValue), Integer.valueOf(iM1465o));
            }
        }
        if (iM1465o != -1) {
            if (this.f1674a.f1388a0 != 0) {
                c0295c.m1655B(true);
            }
            c0295c.m1672v(context, xmlPullParser);
            if (iM1465o2 != -1) {
                this.f1683j.put(iM1465o, iM1465o2);
            }
            this.f1681h.put(iM1465o, c0295c);
        }
    }

    /* renamed from: E */
    private void m1458E(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2214O6);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == C0298f.f2223P6) {
                this.f1685l = typedArrayObtainStyledAttributes.getInt(index, this.f1685l);
            } else if (index == C0298f.f2232Q6) {
                this.f1686m = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    private void m1459I(int i4) {
        int i5 = this.f1683j.get(i4);
        if (i5 > 0) {
            m1459I(this.f1683j.get(i4));
            C0295c c0295c = this.f1681h.get(i4);
            C0295c c0295c2 = this.f1681h.get(i5);
            if (c0295c2 != null) {
                c0295c.m1674z(c0295c2);
                this.f1683j.put(i4, -1);
            } else {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + C0265a.m1256b(this.f1674a.getContext(), i5));
            }
        }
    }

    /* renamed from: P */
    public static String m1460P(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    /* renamed from: o */
    private int m1465o(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f1684k) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    /* renamed from: v */
    private int m1466v(int i4) {
        int iM1693c;
        C0299g c0299g = this.f1675b;
        return (c0299g == null || (iM1693c = c0299g.m1693c(i4, -1, -1)) == -1) ? i4 : iM1693c;
    }

    /* renamed from: F */
    void m1467F(float f4, float f5) {
        b bVar = this.f1676c;
        if (bVar == null || bVar.f1706l == null) {
            return;
        }
        this.f1676c.f1706l.m1570m(f4, f5);
    }

    /* renamed from: G */
    void m1468G(float f4, float f5) {
        b bVar = this.f1676c;
        if (bVar == null || bVar.f1706l == null) {
            return;
        }
        this.f1676c.f1706l.m1571n(f4, f5);
    }

    /* renamed from: H */
    void m1469H(MotionEvent motionEvent, int i4, MotionLayout motionLayout) {
        MotionLayout.InterfaceC0260f interfaceC0260f;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f1689p == null) {
            this.f1689p = this.f1674a.m1208d0();
        }
        this.f1689p.mo1242a(motionEvent);
        if (i4 != -1) {
            int action = motionEvent.getAction();
            boolean z3 = false;
            if (action == 0) {
                this.f1691r = motionEvent.getRawX();
                this.f1692s = motionEvent.getRawY();
                this.f1687n = motionEvent;
                if (this.f1676c.f1706l != null) {
                    RectF rectFM1562e = this.f1676c.f1706l.m1562e(this.f1674a, rectF);
                    if (rectFM1562e != null && !rectFM1562e.contains(this.f1687n.getX(), this.f1687n.getY())) {
                        this.f1687n = null;
                        return;
                    }
                    RectF rectFM1567j = this.f1676c.f1706l.m1567j(this.f1674a, rectF);
                    if (rectFM1567j == null || rectFM1567j.contains(this.f1687n.getX(), this.f1687n.getY())) {
                        this.f1688o = false;
                    } else {
                        this.f1688o = true;
                    }
                    this.f1676c.f1706l.m1572o(this.f1691r, this.f1692s);
                    return;
                }
                return;
            }
            if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f1692s;
                float rawX = motionEvent.getRawX() - this.f1691r;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f1687n) == null) {
                    return;
                }
                b bVarM1479g = m1479g(i4, rawX, rawY, motionEvent2);
                if (bVarM1479g != null) {
                    motionLayout.setTransition(bVarM1479g);
                    RectF rectFM1567j2 = this.f1676c.f1706l.m1567j(this.f1674a, rectF);
                    if (rectFM1567j2 != null && !rectFM1567j2.contains(this.f1687n.getX(), this.f1687n.getY())) {
                        z3 = true;
                    }
                    this.f1688o = z3;
                    this.f1676c.f1706l.m1574q(this.f1691r, this.f1692s);
                }
            }
        }
        b bVar = this.f1676c;
        if (bVar != null && bVar.f1706l != null && !this.f1688o) {
            this.f1676c.f1706l.m1569l(motionEvent, this.f1689p, i4, this);
        }
        this.f1691r = motionEvent.getRawX();
        this.f1692s = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC0260f = this.f1689p) == null) {
            return;
        }
        interfaceC0260f.recycle();
        this.f1689p = null;
        int i5 = motionLayout.f1354B;
        if (i5 != -1) {
            m1478f(motionLayout, i5);
        }
    }

    /* renamed from: J */
    void m1470J(MotionLayout motionLayout) {
        for (int i4 = 0; i4 < this.f1681h.size(); i4++) {
            int iKeyAt = this.f1681h.keyAt(i4);
            if (m1454A(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            m1459I(iKeyAt);
        }
        for (int i5 = 0; i5 < this.f1681h.size(); i5++) {
            this.f1681h.valueAt(i5).m1673y(motionLayout);
        }
    }

    /* renamed from: K */
    public void m1471K(int i4) {
        b bVar = this.f1676c;
        if (bVar != null) {
            bVar.m1522E(i4);
        } else {
            this.f1685l = i4;
        }
    }

    /* renamed from: L */
    public void m1472L(boolean z3) {
        this.f1690q = z3;
        b bVar = this.f1676c;
        if (bVar == null || bVar.f1706l == null) {
            return;
        }
        this.f1676c.f1706l.m1573p(this.f1690q);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m1473M(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.g r0 = r6.f1675b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.m1693c(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.g r2 = r6.f1675b
            int r2 = r2.m1693c(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f1678e
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C0281q.b) r4
            int r5 = androidx.constraintlayout.motion.widget.C0281q.b.m1497a(r4)
            if (r5 != r2) goto L36
            int r5 = androidx.constraintlayout.motion.widget.C0281q.b.m1499c(r4)
            if (r5 == r0) goto L42
        L36:
            int r5 = androidx.constraintlayout.motion.widget.C0281q.b.m1497a(r4)
            if (r5 != r8) goto L1e
            int r5 = androidx.constraintlayout.motion.widget.C0281q.b.m1499c(r4)
            if (r5 != r7) goto L1e
        L42:
            r6.f1676c = r4
            if (r4 == 0) goto L57
            androidx.constraintlayout.motion.widget.t r7 = androidx.constraintlayout.motion.widget.C0281q.b.m1509m(r4)
            if (r7 == 0) goto L57
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f1676c
            androidx.constraintlayout.motion.widget.t r7 = androidx.constraintlayout.motion.widget.C0281q.b.m1509m(r7)
            boolean r8 = r6.f1690q
            r7.m1573p(r8)
        L57:
            return
        L58:
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f1679f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f1680g
            java.util.Iterator r3 = r3.iterator()
        L60:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C0281q.b) r4
            int r5 = androidx.constraintlayout.motion.widget.C0281q.b.m1497a(r4)
            if (r5 != r8) goto L60
            r7 = r4
            goto L60
        L74:
            androidx.constraintlayout.motion.widget.q$b r8 = new androidx.constraintlayout.motion.widget.q$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.C0281q.b.m1500d(r8, r0)
            androidx.constraintlayout.motion.widget.C0281q.b.m1498b(r8, r2)
            if (r0 == r1) goto L86
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r7 = r6.f1678e
            r7.add(r8)
        L86:
            r6.f1676c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0281q.m1473M(int, int):void");
    }

    /* renamed from: N */
    public void m1474N(b bVar) {
        this.f1676c = bVar;
        if (bVar == null || bVar.f1706l == null) {
            return;
        }
        this.f1676c.f1706l.m1573p(this.f1690q);
    }

    /* renamed from: O */
    void m1475O() {
        b bVar = this.f1676c;
        if (bVar == null || bVar.f1706l == null) {
            return;
        }
        this.f1676c.f1706l.m1575r();
    }

    /* renamed from: Q */
    boolean m1476Q() {
        Iterator<b> it = this.f1678e.iterator();
        while (it.hasNext()) {
            if (it.next().f1706l != null) {
                return true;
            }
        }
        b bVar = this.f1676c;
        return (bVar == null || bVar.f1706l == null) ? false : true;
    }

    /* renamed from: e */
    public void m1477e(MotionLayout motionLayout, int i4) {
        Iterator<b> it = this.f1678e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1707m.size() > 0) {
                Iterator it2 = next.f1707m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).m1530c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.f1680g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.f1707m.size() > 0) {
                Iterator it4 = next2.f1707m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).m1530c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.f1678e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.f1707m.size() > 0) {
                Iterator it6 = next3.f1707m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).m1528a(motionLayout, i4, next3);
                }
            }
        }
        Iterator<b> it7 = this.f1680g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.f1707m.size() > 0) {
                Iterator it8 = next4.f1707m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).m1528a(motionLayout, i4, next4);
                }
            }
        }
    }

    /* renamed from: f */
    boolean m1478f(MotionLayout motionLayout, int i4) {
        if (m1455B() || this.f1677d) {
            return false;
        }
        Iterator<b> it = this.f1678e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1708n != 0) {
                if (i4 == next.f1698d && (next.f1708n == 4 || next.f1708n == 2)) {
                    MotionLayout.EnumC0264j enumC0264j = MotionLayout.EnumC0264j.FINISHED;
                    motionLayout.setState(enumC0264j);
                    motionLayout.setTransition(next);
                    if (next.f1708n == 4) {
                        motionLayout.m1215m0();
                        motionLayout.setState(MotionLayout.EnumC0264j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0264j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.m1201S(true);
                        motionLayout.setState(MotionLayout.EnumC0264j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0264j.MOVING);
                        motionLayout.setState(enumC0264j);
                    }
                    return true;
                }
                if (i4 == next.f1697c && (next.f1708n == 3 || next.f1708n == 1)) {
                    MotionLayout.EnumC0264j enumC0264j2 = MotionLayout.EnumC0264j.FINISHED;
                    motionLayout.setState(enumC0264j2);
                    motionLayout.setTransition(next);
                    if (next.f1708n == 3) {
                        motionLayout.m1216n0();
                        motionLayout.setState(MotionLayout.EnumC0264j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0264j.MOVING);
                    } else {
                        motionLayout.setProgress(IGoodView.DEFAULT_TO_ALPHA);
                        motionLayout.m1201S(true);
                        motionLayout.setState(MotionLayout.EnumC0264j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC0264j.MOVING);
                        motionLayout.setState(enumC0264j2);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public b m1479g(int i4, float f4, float f5, MotionEvent motionEvent) {
        if (i4 == -1) {
            return this.f1676c;
        }
        List<b> listM1496z = m1496z(i4);
        float f6 = IGoodView.DEFAULT_TO_ALPHA;
        b bVar = null;
        RectF rectF = new RectF();
        for (b bVar2 : listM1496z) {
            if (!bVar2.f1709o && bVar2.f1706l != null) {
                bVar2.f1706l.m1573p(this.f1690q);
                RectF rectFM1567j = bVar2.f1706l.m1567j(this.f1674a, rectF);
                if (rectFM1567j == null || motionEvent == null || rectFM1567j.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFM1567j2 = bVar2.f1706l.m1567j(this.f1674a, rectF);
                    if (rectFM1567j2 == null || motionEvent == null || rectFM1567j2.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fM1560a = bVar2.f1706l.m1560a(f4, f5) * (bVar2.f1697c == i4 ? -1.0f : 1.1f);
                        if (fM1560a > f6) {
                            bVar = bVar2;
                            f6 = fM1560a;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: h */
    public int m1480h() {
        b bVar = this.f1676c;
        if (bVar != null) {
            return bVar.f1710p;
        }
        return -1;
    }

    /* renamed from: i */
    C0295c m1481i(int i4) {
        return m1482j(i4, -1, -1);
    }

    /* renamed from: j */
    C0295c m1482j(int i4, int i5, int i6) {
        int iM1693c;
        if (this.f1684k) {
            System.out.println("id " + i4);
            System.out.println("size " + this.f1681h.size());
        }
        C0299g c0299g = this.f1675b;
        if (c0299g != null && (iM1693c = c0299g.m1693c(i4, i5, i6)) != -1) {
            i4 = iM1693c;
        }
        if (this.f1681h.get(i4) != null) {
            return this.f1681h.get(i4);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + C0265a.m1256b(this.f1674a.getContext(), i4) + " In MotionScene");
        SparseArray<C0295c> sparseArray = this.f1681h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: k */
    public int[] m1483k() {
        int size = this.f1681h.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f1681h.keyAt(i4);
        }
        return iArr;
    }

    /* renamed from: l */
    public ArrayList<b> m1484l() {
        return this.f1678e;
    }

    /* renamed from: m */
    public int m1485m() {
        b bVar = this.f1676c;
        return bVar != null ? bVar.f1702h : this.f1685l;
    }

    /* renamed from: n */
    int m1486n() {
        b bVar = this.f1676c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1697c;
    }

    /* renamed from: p */
    public Interpolator m1487p() {
        int i4 = this.f1676c.f1699e;
        if (i4 == -2) {
            return AnimationUtils.loadInterpolator(this.f1674a.getContext(), this.f1676c.f1701g);
        }
        if (i4 == -1) {
            return new a(C2827c.m9454c(this.f1676c.f1700f));
        }
        if (i4 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i4 == 1) {
            return new AccelerateInterpolator();
        }
        if (i4 == 2) {
            return new DecelerateInterpolator();
        }
        if (i4 == 4) {
            return new AnticipateInterpolator();
        }
        if (i4 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* renamed from: q */
    public void m1488q(C0278n c0278n) {
        b bVar = this.f1676c;
        if (bVar != null) {
            Iterator it = bVar.f1705k.iterator();
            while (it.hasNext()) {
                ((C0272h) it.next()).m1354a(c0278n);
            }
        } else {
            b bVar2 = this.f1679f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f1705k.iterator();
                while (it2.hasNext()) {
                    ((C0272h) it2.next()).m1354a(c0278n);
                }
            }
        }
    }

    /* renamed from: r */
    float m1489r() {
        b bVar = this.f1676c;
        return (bVar == null || bVar.f1706l == null) ? IGoodView.DEFAULT_TO_ALPHA : this.f1676c.f1706l.m1563f();
    }

    /* renamed from: s */
    float m1490s() {
        b bVar = this.f1676c;
        return (bVar == null || bVar.f1706l == null) ? IGoodView.DEFAULT_TO_ALPHA : this.f1676c.f1706l.m1564g();
    }

    /* renamed from: t */
    boolean m1491t() {
        b bVar = this.f1676c;
        if (bVar == null || bVar.f1706l == null) {
            return false;
        }
        return this.f1676c.f1706l.m1565h();
    }

    /* renamed from: u */
    float m1492u(float f4, float f5) {
        b bVar = this.f1676c;
        return (bVar == null || bVar.f1706l == null) ? IGoodView.DEFAULT_TO_ALPHA : this.f1676c.f1706l.m1566i(f4, f5);
    }

    /* renamed from: w */
    public float m1493w() {
        b bVar = this.f1676c;
        return bVar != null ? bVar.f1703i : IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: x */
    int m1494x() {
        b bVar = this.f1676c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1698d;
    }

    /* renamed from: y */
    public b m1495y(int i4) {
        Iterator<b> it = this.f1678e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1695a == i4) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: z */
    public List<b> m1496z(int i4) {
        int iM1466v = m1466v(i4);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f1678e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1698d == iM1466v || next.f1697c == iM1466v) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.q$b */
    public static class b {

        /* renamed from: a */
        private int f1695a;

        /* renamed from: b */
        private boolean f1696b;

        /* renamed from: c */
        private int f1697c;

        /* renamed from: d */
        private int f1698d;

        /* renamed from: e */
        private int f1699e;

        /* renamed from: f */
        private String f1700f;

        /* renamed from: g */
        private int f1701g;

        /* renamed from: h */
        private int f1702h;

        /* renamed from: i */
        private float f1703i;

        /* renamed from: j */
        private final C0281q f1704j;

        /* renamed from: k */
        private ArrayList<C0272h> f1705k;

        /* renamed from: l */
        private C0284t f1706l;

        /* renamed from: m */
        private ArrayList<a> f1707m;

        /* renamed from: n */
        private int f1708n;

        /* renamed from: o */
        private boolean f1709o;

        /* renamed from: p */
        private int f1710p;

        /* renamed from: q */
        private int f1711q;

        /* renamed from: r */
        private int f1712r;

        /* renamed from: androidx.constraintlayout.motion.widget.q$b$a */
        static class a implements View.OnClickListener {

            /* renamed from: a */
            private final b f1713a;

            /* renamed from: b */
            int f1714b;

            /* renamed from: c */
            int f1715c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f1714b = -1;
                this.f1715c = 17;
                this.f1713a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2277V6);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i4 = 0; i4 < indexCount; i4++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i4);
                    if (index == C0298f.f2295X6) {
                        this.f1714b = typedArrayObtainStyledAttributes.getResourceId(index, this.f1714b);
                    } else if (index == C0298f.f2286W6) {
                        this.f1715c = typedArrayObtainStyledAttributes.getInt(index, this.f1715c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            /* renamed from: a */
            public void m1528a(MotionLayout motionLayout, int i4, b bVar) {
                int i5 = this.f1714b;
                MotionLayout motionLayoutFindViewById = motionLayout;
                if (i5 != -1) {
                    motionLayoutFindViewById = motionLayout.findViewById(i5);
                }
                if (motionLayoutFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f1714b);
                    return;
                }
                int i6 = bVar.f1698d;
                int i7 = bVar.f1697c;
                if (i6 == -1) {
                    motionLayoutFindViewById.setOnClickListener(this);
                    return;
                }
                int i8 = this.f1715c;
                boolean z3 = false;
                boolean z4 = ((i8 & 1) != 0 && i4 == i6) | ((i8 & 1) != 0 && i4 == i6) | ((i8 & 256) != 0 && i4 == i6) | ((i8 & 16) != 0 && i4 == i7);
                if ((i8 & 4096) != 0 && i4 == i7) {
                    z3 = true;
                }
                if (z4 || z3) {
                    motionLayoutFindViewById.setOnClickListener(this);
                }
            }

            /* renamed from: b */
            boolean m1529b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f1713a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i4 = bVar2.f1697c;
                int i5 = this.f1713a.f1698d;
                if (i5 == -1) {
                    return motionLayout.f1354B != i4;
                }
                int i6 = motionLayout.f1354B;
                return i6 == i5 || i6 == i4;
            }

            /* renamed from: c */
            public void m1530c(MotionLayout motionLayout) {
                int i4 = this.f1714b;
                if (i4 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i4);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f1714b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f1713a.f1704j.f1674a;
                if (motionLayout.m1207c0()) {
                    if (this.f1713a.f1698d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.m1217o0(this.f1713a.f1697c);
                            return;
                        }
                        b bVar = new b(this.f1713a.f1704j, this.f1713a);
                        bVar.f1698d = currentState;
                        bVar.f1697c = this.f1713a.f1697c;
                        motionLayout.setTransition(bVar);
                        motionLayout.m1215m0();
                        return;
                    }
                    b bVar2 = this.f1713a.f1704j.f1676c;
                    int i4 = this.f1715c;
                    boolean z3 = false;
                    boolean z4 = ((i4 & 1) == 0 && (i4 & 256) == 0) ? false : true;
                    boolean z5 = ((i4 & 16) == 0 && (i4 & 4096) == 0) ? false : true;
                    if (z4 && z5) {
                        b bVar3 = this.f1713a.f1704j.f1676c;
                        b bVar4 = this.f1713a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z3 = z4;
                            z5 = false;
                        }
                    } else {
                        z3 = z4;
                    }
                    if (m1529b(bVar2, motionLayout)) {
                        if (z3 && (this.f1715c & 1) != 0) {
                            motionLayout.setTransition(this.f1713a);
                            motionLayout.m1215m0();
                            return;
                        }
                        if (z5 && (this.f1715c & 16) != 0) {
                            motionLayout.setTransition(this.f1713a);
                            motionLayout.m1216n0();
                        } else if (z3 && (this.f1715c & 256) != 0) {
                            motionLayout.setTransition(this.f1713a);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z5 || (this.f1715c & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f1713a);
                            motionLayout.setProgress(IGoodView.DEFAULT_TO_ALPHA);
                        }
                    }
                }
            }
        }

        b(C0281q c0281q, b bVar) {
            this.f1695a = -1;
            this.f1696b = false;
            this.f1697c = -1;
            this.f1698d = -1;
            this.f1699e = 0;
            this.f1700f = null;
            this.f1701g = -1;
            this.f1702h = 400;
            this.f1703i = IGoodView.DEFAULT_TO_ALPHA;
            this.f1705k = new ArrayList<>();
            this.f1706l = null;
            this.f1707m = new ArrayList<>();
            this.f1708n = 0;
            this.f1709o = false;
            this.f1710p = -1;
            this.f1711q = 0;
            this.f1712r = 0;
            this.f1704j = c0281q;
            if (bVar != null) {
                this.f1710p = bVar.f1710p;
                this.f1699e = bVar.f1699e;
                this.f1700f = bVar.f1700f;
                this.f1701g = bVar.f1701g;
                this.f1702h = bVar.f1702h;
                this.f1705k = bVar.f1705k;
                this.f1703i = bVar.f1703i;
                this.f1711q = bVar.f1711q;
            }
        }

        /* renamed from: v */
        private void m1516v(C0281q c0281q, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                if (index == C0298f.f2269U7) {
                    this.f1697c = typedArray.getResourceId(index, this.f1697c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f1697c))) {
                        C0295c c0295c = new C0295c();
                        c0295c.m1671u(context, this.f1697c);
                        c0281q.f1681h.append(this.f1697c, c0295c);
                    }
                } else if (index == C0298f.f2278V7) {
                    this.f1698d = typedArray.getResourceId(index, this.f1698d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f1698d))) {
                        C0295c c0295c2 = new C0295c();
                        c0295c2.m1671u(context, this.f1698d);
                        c0281q.f1681h.append(this.f1698d, c0295c2);
                    }
                } else if (index == C0298f.f2305Y7) {
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f1701g = resourceId;
                        if (resourceId != -1) {
                            this.f1699e = -2;
                        }
                    } else if (i5 == 3) {
                        String string = typedArray.getString(index);
                        this.f1700f = string;
                        if (string.indexOf("/") > 0) {
                            this.f1701g = typedArray.getResourceId(index, -1);
                            this.f1699e = -2;
                        } else {
                            this.f1699e = -1;
                        }
                    } else {
                        this.f1699e = typedArray.getInteger(index, this.f1699e);
                    }
                } else if (index == C0298f.f2287W7) {
                    this.f1702h = typedArray.getInt(index, this.f1702h);
                } else if (index == C0298f.f2324a8) {
                    this.f1703i = typedArray.getFloat(index, this.f1703i);
                } else if (index == C0298f.f2260T7) {
                    this.f1708n = typedArray.getInteger(index, this.f1708n);
                } else if (index == C0298f.f2251S7) {
                    this.f1695a = typedArray.getResourceId(index, this.f1695a);
                } else if (index == C0298f.f2334b8) {
                    this.f1709o = typedArray.getBoolean(index, this.f1709o);
                } else if (index == C0298f.f2314Z7) {
                    this.f1710p = typedArray.getInteger(index, -1);
                } else if (index == C0298f.f2296X7) {
                    this.f1711q = typedArray.getInteger(index, 0);
                } else if (index == C0298f.f2344c8) {
                    this.f1712r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f1698d == -1) {
                this.f1696b = true;
            }
        }

        /* renamed from: w */
        private void m1517w(C0281q c0281q, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2242R7);
            m1516v(c0281q, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: A */
        public int m1518A() {
            return this.f1698d;
        }

        /* renamed from: B */
        public C0284t m1519B() {
            return this.f1706l;
        }

        /* renamed from: C */
        public boolean m1520C() {
            return !this.f1709o;
        }

        /* renamed from: D */
        public boolean m1521D(int i4) {
            return (i4 & this.f1712r) != 0;
        }

        /* renamed from: E */
        public void m1522E(int i4) {
            this.f1702h = i4;
        }

        /* renamed from: t */
        public void m1523t(Context context, XmlPullParser xmlPullParser) {
            this.f1707m.add(new a(context, this, xmlPullParser));
        }

        /* renamed from: u */
        public String m1524u(Context context) {
            String resourceEntryName = this.f1698d == -1 ? "null" : context.getResources().getResourceEntryName(this.f1698d);
            if (this.f1697c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f1697c);
        }

        /* renamed from: x */
        public int m1525x() {
            return this.f1702h;
        }

        /* renamed from: y */
        public int m1526y() {
            return this.f1697c;
        }

        /* renamed from: z */
        public int m1527z() {
            return this.f1711q;
        }

        b(C0281q c0281q, Context context, XmlPullParser xmlPullParser) {
            this.f1695a = -1;
            this.f1696b = false;
            this.f1697c = -1;
            this.f1698d = -1;
            this.f1699e = 0;
            this.f1700f = null;
            this.f1701g = -1;
            this.f1702h = 400;
            this.f1703i = IGoodView.DEFAULT_TO_ALPHA;
            this.f1705k = new ArrayList<>();
            this.f1706l = null;
            this.f1707m = new ArrayList<>();
            this.f1708n = 0;
            this.f1709o = false;
            this.f1710p = -1;
            this.f1711q = 0;
            this.f1712r = 0;
            this.f1702h = c0281q.f1685l;
            this.f1711q = c0281q.f1686m;
            this.f1704j = c0281q;
            m1517w(c0281q, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
