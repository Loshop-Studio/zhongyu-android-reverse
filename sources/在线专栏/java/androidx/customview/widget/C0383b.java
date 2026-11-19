package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: androidx.customview.widget.b */
/* loaded from: classes.dex */
class C0383b {

    /* renamed from: androidx.customview.widget.b$a */
    public interface a<T> {
        /* renamed from: a */
        void mo2216a(T t3, Rect rect);
    }

    /* renamed from: androidx.customview.widget.b$b */
    public interface b<T, V> {
        /* renamed from: a */
        V mo2218a(T t3, int i4);

        /* renamed from: b */
        int mo2219b(T t3);
    }

    /* renamed from: androidx.customview.widget.b$c */
    private static class c<T> implements Comparator<T> {

        /* renamed from: a */
        private final Rect f2834a = new Rect();

        /* renamed from: b */
        private final Rect f2835b = new Rect();

        /* renamed from: c */
        private final boolean f2836c;

        /* renamed from: d */
        private final a<T> f2837d;

        c(boolean z3, a<T> aVar) {
            this.f2836c = z3;
            this.f2837d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t3, T t4) {
            Rect rect = this.f2834a;
            Rect rect2 = this.f2835b;
            this.f2837d.mo2216a(t3, rect);
            this.f2837d.mo2216a(t4, rect2);
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 < i5) {
                return -1;
            }
            if (i4 > i5) {
                return 1;
            }
            int i6 = rect.left;
            int i7 = rect2.left;
            if (i6 < i7) {
                return this.f2836c ? 1 : -1;
            }
            if (i6 > i7) {
                return this.f2836c ? -1 : 1;
            }
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 < i11) {
                return this.f2836c ? 1 : -1;
            }
            if (i10 > i11) {
                return this.f2836c ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m2225a(int i4, Rect rect, Rect rect2, Rect rect3) {
        boolean zM2226b = m2226b(i4, rect, rect2);
        if (m2226b(i4, rect, rect3) || !zM2226b) {
            return false;
        }
        return !m2234j(i4, rect, rect3) || i4 == 17 || i4 == 66 || m2235k(i4, rect, rect2) < m2237m(i4, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m2226b(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static <L, T> T m2227c(L l3, b<L, T> bVar, a<T> aVar, T t3, Rect rect, int i4) {
        Rect rect2 = new Rect(rect);
        if (i4 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i4 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i4 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        T t4 = null;
        int iMo2219b = bVar.mo2219b(l3);
        Rect rect3 = new Rect();
        for (int i5 = 0; i5 < iMo2219b; i5++) {
            T tMo2218a = bVar.mo2218a(l3, i5);
            if (tMo2218a != t3) {
                aVar.mo2216a(tMo2218a, rect3);
                if (m2232h(i4, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t4 = tMo2218a;
                }
            }
        }
        return t4;
    }

    /* renamed from: d */
    public static <L, T> T m2228d(L l3, b<L, T> bVar, a<T> aVar, T t3, int i4, boolean z3, boolean z4) {
        int iMo2219b = bVar.mo2219b(l3);
        ArrayList arrayList = new ArrayList(iMo2219b);
        for (int i5 = 0; i5 < iMo2219b; i5++) {
            arrayList.add(bVar.mo2218a(l3, i5));
        }
        Collections.sort(arrayList, new c(z3, aVar));
        if (i4 == 1) {
            return (T) m2230f(t3, arrayList, z4);
        }
        if (i4 == 2) {
            return (T) m2229e(t3, arrayList, z4);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static <T> T m2229e(T t3, ArrayList<T> arrayList, boolean z3) {
        int size = arrayList.size();
        int iLastIndexOf = (t3 == null ? -1 : arrayList.lastIndexOf(t3)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z3 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m2230f(T t3, ArrayList<T> arrayList, boolean z3) {
        int size = arrayList.size();
        int iIndexOf = (t3 == null ? size : arrayList.indexOf(t3)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z3 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m2231g(int i4, int i5) {
        return (i4 * 13 * i4) + (i5 * i5);
    }

    /* renamed from: h */
    private static boolean m2232h(int i4, Rect rect, Rect rect2, Rect rect3) {
        if (!m2233i(rect, rect2, i4)) {
            return false;
        }
        if (m2233i(rect, rect3, i4) && !m2225a(i4, rect, rect2, rect3)) {
            return !m2225a(i4, rect, rect3, rect2) && m2231g(m2235k(i4, rect, rect2), m2239o(i4, rect, rect2)) < m2231g(m2235k(i4, rect, rect3), m2239o(i4, rect, rect3));
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m2233i(Rect rect, Rect rect2, int i4) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    /* renamed from: j */
    private static boolean m2234j(int i4, Rect rect, Rect rect2) {
        if (i4 == 17) {
            return rect.left >= rect2.right;
        }
        if (i4 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i4 == 66) {
            return rect.right <= rect2.left;
        }
        if (i4 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    private static int m2235k(int i4, Rect rect, Rect rect2) {
        return Math.max(0, m2236l(i4, rect, rect2));
    }

    /* renamed from: l */
    private static int m2236l(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return i5 - i6;
    }

    /* renamed from: m */
    private static int m2237m(int i4, Rect rect, Rect rect2) {
        return Math.max(1, m2238n(i4, rect, rect2));
    }

    /* renamed from: n */
    private static int m2238n(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.left;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.top;
        } else if (i4 == 66) {
            i5 = rect2.right;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.bottom;
            i6 = rect.bottom;
        }
        return i5 - i6;
    }

    /* renamed from: o */
    private static int m2239o(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
