package p000a.p031h.p033c.p034b;

import java.util.List;

/* renamed from: a.h.c.b.g */
/* loaded from: classes.dex */
public final class C0199g {

    /* renamed from: a */
    public final int[] f1441a;

    /* renamed from: b */
    public final float[] f1442b;

    public C0199g(int i, int i2) {
        this.f1441a = new int[]{i, i2};
        this.f1442b = new float[]{0.0f, 1.0f};
    }

    public C0199g(int i, int i2, int i3) {
        this.f1441a = new int[]{i, i2, i3};
        this.f1442b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0199g(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f1441a = new int[size];
        this.f1442b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f1441a[i] = list.get(i).intValue();
            this.f1442b[i] = list2.get(i).floatValue();
        }
    }
}
