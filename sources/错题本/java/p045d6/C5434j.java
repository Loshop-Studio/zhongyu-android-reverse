package p045d6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5786f;
import kotlin.jvm.internal.AbstractC5830k;
import p118m7.C6187x;
import p160s6.InterfaceC6560a;

/* renamed from: d6.j */
/* loaded from: classes.dex */
public class C5434j implements Iterator, InterfaceC6560a {

    /* renamed from: a */
    public final /* synthetic */ int f8394a;

    /* renamed from: b */
    public int f8395b;

    /* renamed from: c */
    public final Object f8396c;

    public /* synthetic */ C5434j(Object obj, int i) {
        this.f8394a = i;
        this.f8396c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8394a) {
            case 0:
                if (this.f8395b < ((byte[]) this.f8396c).length) {
                }
                break;
            case 1:
                if (this.f8395b < ((int[]) this.f8396c).length) {
                }
                break;
            case 2:
                if (this.f8395b < ((long[]) this.f8396c).length) {
                }
                break;
            case 3:
                if (this.f8395b < ((short[]) this.f8396c).length) {
                }
                break;
            case 4:
                if (this.f8395b > 0) {
                }
                break;
            case 5:
                if (this.f8395b < ((AbstractC5786f) this.f8396c).size()) {
                }
                break;
            case 6:
                if (this.f8395b < ((double[]) this.f8396c).length) {
                }
                break;
            case 7:
                if (this.f8395b < ((float[]) this.f8396c).length) {
                }
                break;
            default:
                if (this.f8395b < ((Object[]) this.f8396c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8394a) {
            case 0:
                int i = this.f8395b;
                byte[] bArr = (byte[]) this.f8396c;
                if (i >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8395b));
                }
                this.f8395b = i + 1;
                return new C5433i(bArr[i]);
            case 1:
                int i8 = this.f8395b;
                int[] iArr = (int[]) this.f8396c;
                if (i8 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8395b));
                }
                this.f8395b = i8 + 1;
                return new C5436l(iArr[i8]);
            case 2:
                int i9 = this.f8395b;
                long[] jArr = (long[]) this.f8396c;
                if (i9 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8395b));
                }
                this.f8395b = i9 + 1;
                return new C5438n(jArr[i9]);
            case 3:
                int i10 = this.f8395b;
                short[] sArr = (short[]) this.f8396c;
                if (i10 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8395b));
                }
                this.f8395b = i10 + 1;
                return new C5441q(sArr[i10]);
            case 4:
                C6187x c6187x = (C6187x) this.f8396c;
                int i11 = c6187x.f9766c;
                int i12 = this.f8395b;
                this.f8395b = i12 - 1;
                return c6187x.f9768e[i11 - i12];
            case 5:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC5786f abstractC5786f = (AbstractC5786f) this.f8396c;
                int i13 = this.f8395b;
                this.f8395b = i13 + 1;
                return abstractC5786f.get(i13);
            case 6:
                try {
                    double[] dArr = (double[]) this.f8396c;
                    int i14 = this.f8395b;
                    this.f8395b = i14 + 1;
                    return Double.valueOf(dArr[i14]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f8395b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 7:
                try {
                    float[] fArr = (float[]) this.f8396c;
                    int i15 = this.f8395b;
                    this.f8395b = i15 + 1;
                    return Float.valueOf(fArr[i15]);
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f8395b--;
                    throw new NoSuchElementException(e4.getMessage());
                }
            default:
                try {
                    Object[] objArr = (Object[]) this.f8396c;
                    int i16 = this.f8395b;
                    this.f8395b = i16 + 1;
                    return objArr[i16];
                } catch (ArrayIndexOutOfBoundsException e8) {
                    this.f8395b--;
                    throw new NoSuchElementException(e8.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8394a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5434j(Object[] array) {
        this.f8394a = 8;
        AbstractC5830k.m5330g(array, "array");
        this.f8396c = array;
    }

    public C5434j(float[] array) {
        this.f8394a = 7;
        AbstractC5830k.m5330g(array, "array");
        this.f8396c = array;
    }

    public C5434j(double[] array) {
        this.f8394a = 6;
        AbstractC5830k.m5330g(array, "array");
        this.f8396c = array;
    }

    public C5434j(C6187x c6187x) {
        this.f8394a = 4;
        this.f8396c = c6187x;
        this.f8395b = c6187x.f9766c;
    }
}
