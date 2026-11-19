package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0298f;
import java.util.HashMap;
import p113l.C2827c;

/* renamed from: androidx.constraintlayout.motion.widget.i */
/* loaded from: classes.dex */
public class C0273i extends AbstractC0274j {

    /* renamed from: h */
    String f1548h = null;

    /* renamed from: i */
    int f1549i = AbstractC0267c.f1475f;

    /* renamed from: j */
    int f1550j = 0;

    /* renamed from: k */
    float f1551k = Float.NaN;

    /* renamed from: l */
    float f1552l = Float.NaN;

    /* renamed from: m */
    float f1553m = Float.NaN;

    /* renamed from: n */
    float f1554n = Float.NaN;

    /* renamed from: o */
    float f1555o = Float.NaN;

    /* renamed from: p */
    float f1556p = Float.NaN;

    /* renamed from: q */
    int f1557q = 0;

    /* renamed from: r */
    private float f1558r = Float.NaN;

    /* renamed from: s */
    private float f1559s = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.i$a */
    private static class a {

        /* renamed from: a */
        private static SparseIntArray f1560a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1560a = sparseIntArray;
            sparseIntArray.append(C0298f.f2503t4, 1);
            f1560a.append(C0298f.f2485r4, 2);
            f1560a.append(C0298f.f2086A4, 3);
            f1560a.append(C0298f.f2467p4, 4);
            f1560a.append(C0298f.f2476q4, 5);
            f1560a.append(C0298f.f2539x4, 6);
            f1560a.append(C0298f.f2548y4, 7);
            f1560a.append(C0298f.f2494s4, 9);
            f1560a.append(C0298f.f2557z4, 8);
            f1560a.append(C0298f.f2530w4, 11);
            f1560a.append(C0298f.f2521v4, 12);
            f1560a.append(C0298f.f2512u4, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m1356b(C0273i c0273i, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f1560a.get(index)) {
                    case 1:
                        if (MotionLayout.f1351R0) {
                            int resourceId = typedArray.getResourceId(index, c0273i.f1477b);
                            c0273i.f1477b = resourceId;
                            if (resourceId == -1) {
                                c0273i.f1478c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c0273i.f1478c = typedArray.getString(index);
                            break;
                        } else {
                            c0273i.f1477b = typedArray.getResourceId(index, c0273i.f1477b);
                            break;
                        }
                    case 2:
                        c0273i.f1476a = typedArray.getInt(index, c0273i.f1476a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            c0273i.f1548h = typedArray.getString(index);
                            break;
                        } else {
                            c0273i.f1548h = C2827c.f10878c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c0273i.f1561g = typedArray.getInteger(index, c0273i.f1561g);
                        break;
                    case 5:
                        c0273i.f1550j = typedArray.getInt(index, c0273i.f1550j);
                        break;
                    case 6:
                        c0273i.f1553m = typedArray.getFloat(index, c0273i.f1553m);
                        break;
                    case 7:
                        c0273i.f1554n = typedArray.getFloat(index, c0273i.f1554n);
                        break;
                    case 8:
                        float f4 = typedArray.getFloat(index, c0273i.f1552l);
                        c0273i.f1551k = f4;
                        c0273i.f1552l = f4;
                        break;
                    case 9:
                        c0273i.f1557q = typedArray.getInt(index, c0273i.f1557q);
                        break;
                    case 10:
                        c0273i.f1549i = typedArray.getInt(index, c0273i.f1549i);
                        break;
                    case 11:
                        c0273i.f1551k = typedArray.getFloat(index, c0273i.f1551k);
                        break;
                    case 12:
                        c0273i.f1552l = typedArray.getFloat(index, c0273i.f1552l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1560a.get(index));
                        break;
                }
            }
            if (c0273i.f1476a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public C0273i() {
        this.f1479d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: a */
    public void mo1260a(HashMap<String, AbstractC0282r> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0267c
    /* renamed from: c */
    public void mo1262c(Context context, AttributeSet attributeSet) {
        a.m1356b(this, context.obtainStyledAttributes(attributeSet, C0298f.f2458o4));
    }
}
