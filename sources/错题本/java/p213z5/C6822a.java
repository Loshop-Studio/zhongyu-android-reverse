package p213z5;

import p159s5.InterfaceC6559b;

/* renamed from: z5.a */
/* loaded from: classes.dex */
public final class C6822a {

    /* renamed from: a */
    public int f11557a;

    /* renamed from: b */
    public int f11558b;

    /* renamed from: c */
    public int f11559c;

    /* renamed from: d */
    public Object[] f11560d;

    /* renamed from: a */
    public final void m6484a(InterfaceC6559b interfaceC6559b) {
        Object obj;
        Object obj2;
        Object[] objArr = this.f11560d;
        int i = this.f11557a;
        int iHashCode = interfaceC6559b.hashCode() * (-1640531527);
        int i8 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i8];
        if (obj3 != null) {
            if (obj3.equals(interfaceC6559b)) {
                return;
            }
            do {
                i8 = (i8 + 1) & i;
                obj2 = objArr[i8];
                if (obj2 == null) {
                }
            } while (!obj2.equals(interfaceC6559b));
            return;
        }
        objArr[i8] = interfaceC6559b;
        int i9 = this.f11558b + 1;
        this.f11558b = i9;
        if (i9 < this.f11559c) {
            return;
        }
        Object[] objArr2 = this.f11560d;
        int length = objArr2.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        Object[] objArr3 = new Object[i10];
        while (true) {
            int i12 = i9 - 1;
            if (i9 == 0) {
                this.f11557a = i11;
                this.f11559c = (int) (i10 * 0.75f);
                this.f11560d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i13 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i11;
            if (objArr3[i13] != null) {
                do {
                    i13 = (i13 + 1) & i11;
                } while (objArr3[i13] != null);
            }
            objArr3[i13] = objArr2[length];
            i9 = i12;
        }
    }

    /* renamed from: b */
    public final void m6485b(int i, int i8, Object[] objArr) {
        int i9;
        Object obj;
        this.f11558b--;
        while (true) {
            int i10 = i + 1;
            while (true) {
                i9 = i10 & i8;
                obj = objArr[i9];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i11 = (iHashCode ^ (iHashCode >>> 16)) & i8;
                if (i <= i9) {
                    if (i >= i11 || i11 > i9) {
                        break;
                    } else {
                        i10 = i9 + 1;
                    }
                } else if (i < i11 || i11 <= i9) {
                    i10 = i9 + 1;
                }
            }
            objArr[i] = obj;
            i = i9;
        }
    }
}
