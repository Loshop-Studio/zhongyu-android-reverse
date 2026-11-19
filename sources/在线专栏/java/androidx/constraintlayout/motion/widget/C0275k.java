package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0298f;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.zykj.download.OssUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.k */
/* loaded from: classes.dex */
public class C0275k extends AbstractC0267c {

    /* renamed from: g */
    private String f1562g;

    /* renamed from: h */
    private int f1563h = -1;

    /* renamed from: i */
    private float f1564i = Float.NaN;

    /* renamed from: j */
    private float f1565j = Float.NaN;

    /* renamed from: k */
    private float f1566k = Float.NaN;

    /* renamed from: l */
    private float f1567l = Float.NaN;

    /* renamed from: m */
    private float f1568m = Float.NaN;

    /* renamed from: n */
    private float f1569n = Float.NaN;

    /* renamed from: o */
    private float f1570o = Float.NaN;

    /* renamed from: p */
    private float f1571p = Float.NaN;

    /* renamed from: q */
    private float f1572q = Float.NaN;

    /* renamed from: r */
    private float f1573r = Float.NaN;

    /* renamed from: s */
    private float f1574s = Float.NaN;

    /* renamed from: t */
    private float f1575t = Float.NaN;

    /* renamed from: u */
    private int f1576u = 0;

    /* renamed from: v */
    private float f1577v = Float.NaN;

    /* renamed from: w */
    private float f1578w = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: androidx.constraintlayout.motion.widget.k$a */
    private static class a {

        /* renamed from: a */
        private static SparseIntArray f1579a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1579a = sparseIntArray;
            sparseIntArray.append(C0298f.f2104C4, 1);
            f1579a.append(C0298f.f2185L4, 2);
            f1579a.append(C0298f.f2149H4, 4);
            f1579a.append(C0298f.f2158I4, 5);
            f1579a.append(C0298f.f2167J4, 6);
            f1579a.append(C0298f.f2131F4, 7);
            f1579a.append(C0298f.f2239R4, 8);
            f1579a.append(C0298f.f2230Q4, 9);
            f1579a.append(C0298f.f2221P4, 10);
            f1579a.append(C0298f.f2203N4, 12);
            f1579a.append(C0298f.f2194M4, 13);
            f1579a.append(C0298f.f2140G4, 14);
            f1579a.append(C0298f.f2113D4, 15);
            f1579a.append(C0298f.f2122E4, 16);
            f1579a.append(C0298f.f2176K4, 17);
            f1579a.append(C0298f.f2212O4, 18);
            f1579a.append(C0298f.f2257T4, 20);
            f1579a.append(C0298f.f2248S4, 21);
            f1579a.append(C0298f.f2266U4, 19);
        }

        /* renamed from: a */
        public static void m1391a(C0275k c0275k, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f1579a.get(index)) {
                    case 1:
                        c0275k.f1564i = typedArray.getFloat(index, c0275k.f1564i);
                        break;
                    case 2:
                        c0275k.f1565j = typedArray.getDimension(index, c0275k.f1565j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1579a.get(index));
                        break;
                    case 4:
                        c0275k.f1566k = typedArray.getFloat(index, c0275k.f1566k);
                        break;
                    case 5:
                        c0275k.f1567l = typedArray.getFloat(index, c0275k.f1567l);
                        break;
                    case 6:
                        c0275k.f1568m = typedArray.getFloat(index, c0275k.f1568m);
                        break;
                    case 7:
                        c0275k.f1570o = typedArray.getFloat(index, c0275k.f1570o);
                        break;
                    case 8:
                        c0275k.f1569n = typedArray.getFloat(index, c0275k.f1569n);
                        break;
                    case 9:
                        c0275k.f1562g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f1351R0) {
                            int resourceId = typedArray.getResourceId(index, c0275k.f1477b);
                            c0275k.f1477b = resourceId;
                            if (resourceId == -1) {
                                c0275k.f1478c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c0275k.f1478c = typedArray.getString(index);
                            break;
                        } else {
                            c0275k.f1477b = typedArray.getResourceId(index, c0275k.f1477b);
                            break;
                        }
                    case 12:
                        c0275k.f1476a = typedArray.getInt(index, c0275k.f1476a);
                        break;
                    case 13:
                        c0275k.f1563h = typedArray.getInteger(index, c0275k.f1563h);
                        break;
                    case 14:
                        c0275k.f1571p = typedArray.getFloat(index, c0275k.f1571p);
                        break;
                    case 15:
                        c0275k.f1572q = typedArray.getDimension(index, c0275k.f1572q);
                        break;
                    case 16:
                        c0275k.f1573r = typedArray.getDimension(index, c0275k.f1573r);
                        break;
                    case 17:
                        c0275k.f1574s = typedArray.getDimension(index, c0275k.f1574s);
                        break;
                    case 18:
                        c0275k.f1575t = typedArray.getFloat(index, c0275k.f1575t);
                        break;
                    case 19:
                        c0275k.f1576u = typedArray.getInt(index, c0275k.f1576u);
                        break;
                    case 20:
                        c0275k.f1577v = typedArray.getFloat(index, c0275k.f1577v);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            c0275k.f1578w = typedArray.getDimension(index, c0275k.f1578w);
                            break;
                        } else {
                            c0275k.f1578w = typedArray.getFloat(index, c0275k.f1578w);
                            break;
                        }
                }
            }
        }
    }

    public C0275k() {
        this.f1479d = 3;
        this.f1480e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1390M(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.AbstractC0283s> r11) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0275k.m1390M(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: a */
    public void mo1260a(HashMap<String, AbstractC0282r> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: b */
    public void mo1261b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1564i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1565j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1566k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1567l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1568m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1572q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1573r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1574s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1569n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1570o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1571p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1575t)) {
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
        a.m1391a(this, context.obtainStyledAttributes(attributeSet, C0298f.f2095B4));
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: e */
    public void mo1264e(HashMap<String, Integer> map) {
        if (this.f1563h == -1) {
            return;
        }
        if (!Float.isNaN(this.f1564i)) {
            map.put("alpha", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1565j)) {
            map.put("elevation", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1566k)) {
            map.put("rotation", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1567l)) {
            map.put("rotationX", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1568m)) {
            map.put("rotationY", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1572q)) {
            map.put("translationX", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1573r)) {
            map.put("translationY", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1574s)) {
            map.put("translationZ", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1569n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1570o)) {
            map.put("scaleX", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1570o)) {
            map.put("scaleY", Integer.valueOf(this.f1563h));
        }
        if (!Float.isNaN(this.f1575t)) {
            map.put(OssUtils.PROGRESS, Integer.valueOf(this.f1563h));
        }
        if (this.f1480e.size() > 0) {
            Iterator<String> it = this.f1480e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f1563h));
            }
        }
    }
}
