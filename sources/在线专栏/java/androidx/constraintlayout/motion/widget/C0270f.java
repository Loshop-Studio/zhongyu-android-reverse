package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0293a;
import androidx.constraintlayout.widget.C0298f;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.f */
/* loaded from: classes.dex */
public class C0270f extends AbstractC0267c {

    /* renamed from: g */
    private String f1500g = null;

    /* renamed from: h */
    private int f1501h = 0;

    /* renamed from: i */
    private int f1502i = -1;

    /* renamed from: j */
    private float f1503j = Float.NaN;

    /* renamed from: k */
    private float f1504k = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: l */
    private float f1505l = Float.NaN;

    /* renamed from: m */
    private int f1506m = -1;

    /* renamed from: n */
    private float f1507n = Float.NaN;

    /* renamed from: o */
    private float f1508o = Float.NaN;

    /* renamed from: p */
    private float f1509p = Float.NaN;

    /* renamed from: q */
    private float f1510q = Float.NaN;

    /* renamed from: r */
    private float f1511r = Float.NaN;

    /* renamed from: s */
    private float f1512s = Float.NaN;

    /* renamed from: t */
    private float f1513t = Float.NaN;

    /* renamed from: u */
    private float f1514u = Float.NaN;

    /* renamed from: v */
    private float f1515v = Float.NaN;

    /* renamed from: w */
    private float f1516w = Float.NaN;

    /* renamed from: x */
    private float f1517x = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    private static class a {

        /* renamed from: a */
        private static SparseIntArray f1518a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1518a = sparseIntArray;
            sparseIntArray.append(C0298f.f2390h4, 1);
            f1518a.append(C0298f.f2370f4, 2);
            f1518a.append(C0298f.f2400i4, 3);
            f1518a.append(C0298f.f2360e4, 4);
            f1518a.append(C0298f.f2440m4, 5);
            f1518a.append(C0298f.f2430l4, 6);
            f1518a.append(C0298f.f2420k4, 7);
            f1518a.append(C0298f.f2449n4, 8);
            f1518a.append(C0298f.f2265U3, 9);
            f1518a.append(C0298f.f2350d4, 10);
            f1518a.append(C0298f.f2310Z3, 11);
            f1518a.append(C0298f.f2320a4, 12);
            f1518a.append(C0298f.f2330b4, 13);
            f1518a.append(C0298f.f2410j4, 14);
            f1518a.append(C0298f.f2292X3, 15);
            f1518a.append(C0298f.f2301Y3, 16);
            f1518a.append(C0298f.f2274V3, 17);
            f1518a.append(C0298f.f2283W3, 18);
            f1518a.append(C0298f.f2340c4, 19);
            f1518a.append(C0298f.f2380g4, 20);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m1337b(C0270f c0270f, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f1518a.get(index)) {
                    case 1:
                        if (MotionLayout.f1351R0) {
                            int resourceId = typedArray.getResourceId(index, c0270f.f1477b);
                            c0270f.f1477b = resourceId;
                            if (resourceId == -1) {
                                c0270f.f1478c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c0270f.f1478c = typedArray.getString(index);
                            break;
                        } else {
                            c0270f.f1477b = typedArray.getResourceId(index, c0270f.f1477b);
                            break;
                        }
                    case 2:
                        c0270f.f1476a = typedArray.getInt(index, c0270f.f1476a);
                        break;
                    case 3:
                        c0270f.f1500g = typedArray.getString(index);
                        break;
                    case 4:
                        c0270f.f1501h = typedArray.getInteger(index, c0270f.f1501h);
                        break;
                    case 5:
                        c0270f.f1502i = typedArray.getInt(index, c0270f.f1502i);
                        break;
                    case 6:
                        c0270f.f1503j = typedArray.getFloat(index, c0270f.f1503j);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            c0270f.f1504k = typedArray.getDimension(index, c0270f.f1504k);
                            break;
                        } else {
                            c0270f.f1504k = typedArray.getFloat(index, c0270f.f1504k);
                            break;
                        }
                    case 8:
                        c0270f.f1506m = typedArray.getInt(index, c0270f.f1506m);
                        break;
                    case 9:
                        c0270f.f1507n = typedArray.getFloat(index, c0270f.f1507n);
                        break;
                    case 10:
                        c0270f.f1508o = typedArray.getDimension(index, c0270f.f1508o);
                        break;
                    case 11:
                        c0270f.f1509p = typedArray.getFloat(index, c0270f.f1509p);
                        break;
                    case 12:
                        c0270f.f1511r = typedArray.getFloat(index, c0270f.f1511r);
                        break;
                    case 13:
                        c0270f.f1512s = typedArray.getFloat(index, c0270f.f1512s);
                        break;
                    case 14:
                        c0270f.f1510q = typedArray.getFloat(index, c0270f.f1510q);
                        break;
                    case 15:
                        c0270f.f1513t = typedArray.getFloat(index, c0270f.f1513t);
                        break;
                    case 16:
                        c0270f.f1514u = typedArray.getFloat(index, c0270f.f1514u);
                        break;
                    case 17:
                        c0270f.f1515v = typedArray.getDimension(index, c0270f.f1515v);
                        break;
                    case 18:
                        c0270f.f1516w = typedArray.getDimension(index, c0270f.f1516w);
                        break;
                    case 19:
                        c0270f.f1517x = typedArray.getDimension(index, c0270f.f1517x);
                        break;
                    case 20:
                        c0270f.f1505l = typedArray.getFloat(index, c0270f.f1505l);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1518a.get(index));
                        break;
                }
            }
        }
    }

    public C0270f() {
        this.f1479d = 4;
        this.f1480e = new HashMap<>();
    }

    /* renamed from: O */
    public void m1334O(HashMap<String, AbstractC0271g> map) {
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C0293a c0293a = this.f1480e.get(str.substring(7));
                if (c0293a != null && c0293a.m1634c() == C0293a.b.FLOAT_TYPE) {
                    map.get(str).m1342e(this.f1476a, this.f1502i, this.f1506m, this.f1503j, this.f1504k, c0293a.m1635d(), c0293a);
                }
            }
            float fM1335P = m1335P(str);
            if (!Float.isNaN(fM1335P)) {
                map.get(str).m1341d(this.f1476a, this.f1502i, this.f1506m, this.f1503j, this.f1504k, fM1335P);
            }
        }
    }

    /* renamed from: P */
    public float m1335P(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.f1511r;
            case "rotationY":
                return this.f1512s;
            case "translationX":
                return this.f1515v;
            case "translationY":
                return this.f1516w;
            case "translationZ":
                return this.f1517x;
            case "progress":
                return this.f1505l;
            case "scaleX":
                return this.f1513t;
            case "scaleY":
                return this.f1514u;
            case "rotation":
                return this.f1509p;
            case "elevation":
                return this.f1508o;
            case "transitionPathRotate":
                return this.f1510q;
            case "alpha":
                return this.f1507n;
            case "waveOffset":
                return this.f1504k;
            default:
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: a */
    public void mo1260a(HashMap<String, AbstractC0282r> map) {
        AbstractC0282r abstractC0282r;
        C0265a.m1259e("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            abstractC0282r = map.get(str);
            str.hashCode();
            switch (str) {
                case "rotationX":
                    abstractC0282r.mo1535e(this.f1476a, this.f1511r);
                    break;
                case "rotationY":
                    abstractC0282r.mo1535e(this.f1476a, this.f1512s);
                    break;
                case "translationX":
                    abstractC0282r.mo1535e(this.f1476a, this.f1515v);
                    break;
                case "translationY":
                    abstractC0282r.mo1535e(this.f1476a, this.f1516w);
                    break;
                case "translationZ":
                    abstractC0282r.mo1535e(this.f1476a, this.f1517x);
                    break;
                case "progress":
                    abstractC0282r.mo1535e(this.f1476a, this.f1505l);
                    break;
                case "scaleX":
                    abstractC0282r.mo1535e(this.f1476a, this.f1513t);
                    break;
                case "scaleY":
                    abstractC0282r.mo1535e(this.f1476a, this.f1514u);
                    break;
                case "rotation":
                    abstractC0282r.mo1535e(this.f1476a, this.f1509p);
                    break;
                case "elevation":
                    abstractC0282r.mo1535e(this.f1476a, this.f1508o);
                    break;
                case "transitionPathRotate":
                    abstractC0282r.mo1535e(this.f1476a, this.f1510q);
                    break;
                case "alpha":
                    abstractC0282r.mo1535e(this.f1476a, this.f1507n);
                    break;
                case "waveOffset":
                    abstractC0282r.mo1535e(this.f1476a, this.f1504k);
                    break;
                default:
                    Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: b */
    public void mo1261b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1507n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1508o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1509p)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1511r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1512s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1513t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1514u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1510q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1515v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1516w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1517x)) {
            hashSet.add("translationZ");
        }
        if (this.f1480e.size() > 0) {
            Iterator<String> it = this.f1480e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: c */
    public void mo1262c(Context context, AttributeSet attributeSet) {
        a.m1337b(this, context.obtainStyledAttributes(attributeSet, C0298f.f2256T3));
    }
}
