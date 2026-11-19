package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0298f;
import com.zykj.download.OssUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* loaded from: classes.dex */
public class C0268d extends AbstractC0267c {

    /* renamed from: g */
    private String f1481g;

    /* renamed from: h */
    private int f1482h = -1;

    /* renamed from: i */
    private boolean f1483i = false;

    /* renamed from: j */
    private float f1484j = Float.NaN;

    /* renamed from: k */
    private float f1485k = Float.NaN;

    /* renamed from: l */
    private float f1486l = Float.NaN;

    /* renamed from: m */
    private float f1487m = Float.NaN;

    /* renamed from: n */
    private float f1488n = Float.NaN;

    /* renamed from: o */
    private float f1489o = Float.NaN;

    /* renamed from: p */
    private float f1490p = Float.NaN;

    /* renamed from: q */
    private float f1491q = Float.NaN;

    /* renamed from: r */
    private float f1492r = Float.NaN;

    /* renamed from: s */
    private float f1493s = Float.NaN;

    /* renamed from: t */
    private float f1494t = Float.NaN;

    /* renamed from: u */
    private float f1495u = Float.NaN;

    /* renamed from: v */
    private float f1496v = Float.NaN;

    /* renamed from: w */
    private float f1497w = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    private static class a {

        /* renamed from: a */
        private static SparseIntArray f1498a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1498a = sparseIntArray;
            sparseIntArray.append(C0298f.f2094B3, 1);
            f1498a.append(C0298f.f2193M3, 2);
            f1498a.append(C0298f.f2157I3, 4);
            f1498a.append(C0298f.f2166J3, 5);
            f1498a.append(C0298f.f2175K3, 6);
            f1498a.append(C0298f.f2103C3, 19);
            f1498a.append(C0298f.f2112D3, 20);
            f1498a.append(C0298f.f2139G3, 7);
            f1498a.append(C0298f.f2247S3, 8);
            f1498a.append(C0298f.f2238R3, 9);
            f1498a.append(C0298f.f2229Q3, 10);
            f1498a.append(C0298f.f2211O3, 12);
            f1498a.append(C0298f.f2202N3, 13);
            f1498a.append(C0298f.f2148H3, 14);
            f1498a.append(C0298f.f2121E3, 15);
            f1498a.append(C0298f.f2130F3, 16);
            f1498a.append(C0298f.f2184L3, 17);
            f1498a.append(C0298f.f2220P3, 18);
        }

        /* renamed from: a */
        public static void m1296a(C0268d c0268d, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f1498a.get(index)) {
                    case 1:
                        c0268d.f1484j = typedArray.getFloat(index, c0268d.f1484j);
                        break;
                    case 2:
                        c0268d.f1485k = typedArray.getDimension(index, c0268d.f1485k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1498a.get(index));
                        break;
                    case 4:
                        c0268d.f1486l = typedArray.getFloat(index, c0268d.f1486l);
                        break;
                    case 5:
                        c0268d.f1487m = typedArray.getFloat(index, c0268d.f1487m);
                        break;
                    case 6:
                        c0268d.f1488n = typedArray.getFloat(index, c0268d.f1488n);
                        break;
                    case 7:
                        c0268d.f1492r = typedArray.getFloat(index, c0268d.f1492r);
                        break;
                    case 8:
                        c0268d.f1491q = typedArray.getFloat(index, c0268d.f1491q);
                        break;
                    case 9:
                        c0268d.f1481g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f1351R0) {
                            int resourceId = typedArray.getResourceId(index, c0268d.f1477b);
                            c0268d.f1477b = resourceId;
                            if (resourceId == -1) {
                                c0268d.f1478c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c0268d.f1478c = typedArray.getString(index);
                            break;
                        } else {
                            c0268d.f1477b = typedArray.getResourceId(index, c0268d.f1477b);
                            break;
                        }
                    case 12:
                        c0268d.f1476a = typedArray.getInt(index, c0268d.f1476a);
                        break;
                    case 13:
                        c0268d.f1482h = typedArray.getInteger(index, c0268d.f1482h);
                        break;
                    case 14:
                        c0268d.f1493s = typedArray.getFloat(index, c0268d.f1493s);
                        break;
                    case 15:
                        c0268d.f1494t = typedArray.getDimension(index, c0268d.f1494t);
                        break;
                    case 16:
                        c0268d.f1495u = typedArray.getDimension(index, c0268d.f1495u);
                        break;
                    case 17:
                        c0268d.f1496v = typedArray.getDimension(index, c0268d.f1496v);
                        break;
                    case 18:
                        c0268d.f1497w = typedArray.getFloat(index, c0268d.f1497w);
                        break;
                    case 19:
                        c0268d.f1489o = typedArray.getDimension(index, c0268d.f1489o);
                        break;
                    case 20:
                        c0268d.f1490p = typedArray.getDimension(index, c0268d.f1490p);
                        break;
                }
            }
        }
    }

    public C0268d() {
        this.f1479d = 1;
        this.f1480e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1260a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.AbstractC0282r> r7) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0268d.mo1260a(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: b */
    public void mo1261b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1484j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1485k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1486l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1487m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1488n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1489o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f1490p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f1494t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1495u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1496v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1491q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1492r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1492r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1497w)) {
            hashSet.add(OssUtils.PROGRESS);
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
        a.m1296a(this, context.obtainStyledAttributes(attributeSet, C0298f.f2085A3));
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: e */
    public void mo1264e(HashMap<String, Integer> map) {
        if (this.f1482h == -1) {
            return;
        }
        if (!Float.isNaN(this.f1484j)) {
            map.put("alpha", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1485k)) {
            map.put("elevation", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1486l)) {
            map.put("rotation", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1487m)) {
            map.put("rotationX", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1488n)) {
            map.put("rotationY", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1489o)) {
            map.put("transformPivotX", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1490p)) {
            map.put("transformPivotY", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1494t)) {
            map.put("translationX", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1495u)) {
            map.put("translationY", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1496v)) {
            map.put("translationZ", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1491q)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1492r)) {
            map.put("scaleX", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1493s)) {
            map.put("scaleY", Integer.valueOf(this.f1482h));
        }
        if (!Float.isNaN(this.f1497w)) {
            map.put(OssUtils.PROGRESS, Integer.valueOf(this.f1482h));
        }
        if (this.f1480e.size() > 0) {
            Iterator<String> it = this.f1480e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f1482h));
            }
        }
    }
}
