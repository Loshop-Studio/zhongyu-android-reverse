package p000a.p022f.p028c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import p000a.p022f.p028c.C0175e;

/* renamed from: a.f.c.f */
/* loaded from: classes.dex */
public class C0176f extends ViewGroup {

    /* renamed from: b */
    public C0175e f1359b;

    /* renamed from: a.f.c.f$a */
    public static class a extends ConstraintLayout.C0499a {

        /* renamed from: m0 */
        public float f1360m0;

        /* renamed from: n0 */
        public boolean f1361n0;

        /* renamed from: o0 */
        public float f1362o0;

        /* renamed from: p0 */
        public float f1363p0;

        /* renamed from: q0 */
        public float f1364q0;

        /* renamed from: r0 */
        public float f1365r0;

        /* renamed from: s0 */
        public float f1366s0;

        /* renamed from: t0 */
        public float f1367t0;

        /* renamed from: u0 */
        public float f1368u0;

        /* renamed from: v0 */
        public float f1369v0;

        /* renamed from: w0 */
        public float f1370w0;

        /* renamed from: x0 */
        public float f1371x0;

        /* renamed from: y0 */
        public float f1372y0;

        public a(int i, int i2) {
            super(i, i2);
            this.f1360m0 = 1.0f;
            this.f1361n0 = false;
            this.f1362o0 = 0.0f;
            this.f1363p0 = 0.0f;
            this.f1364q0 = 0.0f;
            this.f1365r0 = 0.0f;
            this.f1366s0 = 1.0f;
            this.f1367t0 = 1.0f;
            this.f1368u0 = 0.0f;
            this.f1369v0 = 0.0f;
            this.f1370w0 = 0.0f;
            this.f1371x0 = 0.0f;
            this.f1372y0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1360m0 = 1.0f;
            this.f1361n0 = false;
            this.f1362o0 = 0.0f;
            this.f1363p0 = 0.0f;
            this.f1364q0 = 0.0f;
            this.f1365r0 = 0.0f;
            this.f1366s0 = 1.0f;
            this.f1367t0 = 1.0f;
            this.f1368u0 = 0.0f;
            this.f1369v0 = 0.0f;
            this.f1370w0 = 0.0f;
            this.f1371x0 = 0.0f;
            this.f1372y0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180j.f1378c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f1360m0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1360m0);
                } else if (index == 28) {
                    this.f1362o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1362o0);
                    this.f1361n0 = true;
                } else if (index == 23) {
                    this.f1364q0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1364q0);
                } else if (index == 24) {
                    this.f1365r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1365r0);
                } else if (index == 22) {
                    this.f1363p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1363p0);
                } else if (index == 20) {
                    this.f1366s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1366s0);
                } else if (index == 21) {
                    this.f1367t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1367t0);
                } else if (index == 16) {
                    this.f1368u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1368u0);
                } else if (index == 17) {
                    this.f1369v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1369v0);
                } else if (index == 18) {
                    this.f1370w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1370w0);
                } else if (index == 19) {
                    this.f1371x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1371x0);
                } else if (index == 27) {
                    this.f1372y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1372y0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0499a(layoutParams);
    }

    public C0175e getConstraintSet() {
        if (this.f1359b == null) {
            this.f1359b = new C0175e();
        }
        C0175e c0175e = this.f1359b;
        Objects.requireNonNull(c0175e);
        int childCount = getChildCount();
        c0175e.f1262c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0175e.f1261b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c0175e.f1262c.containsKey(Integer.valueOf(id))) {
                c0175e.f1262c.put(Integer.valueOf(id), new C0175e.a());
            }
            C0175e.a aVar2 = c0175e.f1262c.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0173c) {
                AbstractC0173c abstractC0173c = (AbstractC0173c) childAt;
                aVar2.m676c(id, aVar);
                if (abstractC0173c instanceof C0171a) {
                    C0175e.b bVar = aVar2.f1266d;
                    bVar.f1303d0 = 1;
                    C0171a c0171a = (C0171a) abstractC0173c;
                    bVar.f1299b0 = c0171a.getType();
                    aVar2.f1266d.f1305e0 = c0171a.getReferencedIds();
                    aVar2.f1266d.f1301c0 = c0171a.getMargin();
                }
            }
            aVar2.m676c(id, aVar);
        }
        return this.f1359b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
