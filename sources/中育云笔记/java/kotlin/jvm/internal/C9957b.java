package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p325rc.AbstractC10953j0;

/* renamed from: kotlin.jvm.internal.b */
/* loaded from: classes6.dex */
public final class C9957b extends AbstractC10953j0 {

    /* renamed from: c */
    public final float[] f23406c;

    /* renamed from: d */
    public int f23407d;

    public C9957b(float[] array) {
        AbstractC9979u.m20294g(array, "array");
        this.f23406c = array;
    }

    @Override // p325rc.AbstractC10953j0
    /* renamed from: a */
    public float mo20245a() {
        try {
            float[] fArr = this.f23406c;
            int i10 = this.f23407d;
            this.f23407d = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f23407d--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23407d < this.f23406c.length;
    }
}
