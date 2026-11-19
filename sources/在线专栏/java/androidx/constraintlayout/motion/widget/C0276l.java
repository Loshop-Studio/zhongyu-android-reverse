package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0298f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.l */
/* loaded from: classes.dex */
public class C0276l extends AbstractC0267c {

    /* renamed from: g */
    private int f1580g = -1;

    /* renamed from: h */
    private String f1581h = null;

    /* renamed from: i */
    private int f1582i;

    /* renamed from: j */
    private String f1583j;

    /* renamed from: k */
    private String f1584k;

    /* renamed from: l */
    private int f1585l;

    /* renamed from: m */
    private int f1586m;

    /* renamed from: n */
    private View f1587n;

    /* renamed from: o */
    float f1588o;

    /* renamed from: p */
    private boolean f1589p;

    /* renamed from: q */
    private boolean f1590q;

    /* renamed from: r */
    private boolean f1591r;

    /* renamed from: s */
    private float f1592s;

    /* renamed from: t */
    private Method f1593t;

    /* renamed from: u */
    private Method f1594u;

    /* renamed from: v */
    private Method f1595v;

    /* renamed from: w */
    private float f1596w;

    /* renamed from: x */
    private boolean f1597x;

    /* renamed from: y */
    RectF f1598y;

    /* renamed from: z */
    RectF f1599z;

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    private static class a {

        /* renamed from: a */
        private static SparseIntArray f1600a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1600a = sparseIntArray;
            sparseIntArray.append(C0298f.f2284W4, 8);
            f1600a.append(C0298f.f2321a5, 4);
            f1600a.append(C0298f.f2331b5, 1);
            f1600a.append(C0298f.f2341c5, 2);
            f1600a.append(C0298f.f2293X4, 7);
            f1600a.append(C0298f.f2351d5, 6);
            f1600a.append(C0298f.f2371f5, 5);
            f1600a.append(C0298f.f2311Z4, 9);
            f1600a.append(C0298f.f2302Y4, 10);
            f1600a.append(C0298f.f2361e5, 11);
        }

        /* renamed from: a */
        public static void m1406a(C0276l c0276l, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f1600a.get(index)) {
                    case 1:
                        c0276l.f1583j = typedArray.getString(index);
                        continue;
                    case 2:
                        c0276l.f1584k = typedArray.getString(index);
                        continue;
                    case 4:
                        c0276l.f1581h = typedArray.getString(index);
                        continue;
                    case 5:
                        c0276l.f1588o = typedArray.getFloat(index, c0276l.f1588o);
                        continue;
                    case 6:
                        c0276l.f1585l = typedArray.getResourceId(index, c0276l.f1585l);
                        continue;
                    case 7:
                        if (MotionLayout.f1351R0) {
                            int resourceId = typedArray.getResourceId(index, c0276l.f1477b);
                            c0276l.f1477b = resourceId;
                            if (resourceId == -1) {
                                c0276l.f1478c = typedArray.getString(index);
                            } else {
                                continue;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c0276l.f1478c = typedArray.getString(index);
                        } else {
                            c0276l.f1477b = typedArray.getResourceId(index, c0276l.f1477b);
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, c0276l.f1476a);
                        c0276l.f1476a = integer;
                        c0276l.f1592s = (integer + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        c0276l.f1586m = typedArray.getResourceId(index, c0276l.f1586m);
                        continue;
                    case 10:
                        c0276l.f1597x = typedArray.getBoolean(index, c0276l.f1597x);
                        continue;
                    case 11:
                        c0276l.f1582i = typedArray.getResourceId(index, c0276l.f1582i);
                        break;
                }
                Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1600a.get(index));
            }
        }
    }

    public C0276l() {
        int i4 = AbstractC0267c.f1475f;
        this.f1582i = i4;
        this.f1583j = null;
        this.f1584k = null;
        this.f1585l = i4;
        this.f1586m = i4;
        this.f1587n = null;
        this.f1588o = 0.1f;
        this.f1589p = true;
        this.f1590q = true;
        this.f1591r = true;
        this.f1592s = Float.NaN;
        this.f1597x = false;
        this.f1598y = new RectF();
        this.f1599z = new RectF();
        this.f1479d = 5;
        this.f1480e = new HashMap<>();
    }

    /* renamed from: s */
    private void m1404s(RectF rectF, View view, boolean z3) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z3) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: a */
    public void mo1260a(HashMap<String, AbstractC0282r> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: b */
    public void mo1261b(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: c */
    public void mo1262c(Context context, AttributeSet attributeSet) {
        a.m1406a(this, context.obtainStyledAttributes(attributeSet, C0298f.f2275V4), context);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1405r(float r11, android.view.View r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0276l.m1405r(float, android.view.View):void");
    }
}
