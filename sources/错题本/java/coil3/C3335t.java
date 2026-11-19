package coil3;

import coil3.network.okhttp.internal.C3328c;
import java.io.File;
import java.util.Comparator;
import p204y1.AbstractC6768a;

/* renamed from: coil3.t */
/* loaded from: classes2.dex */
public final class C3335t implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f2063a;

    public /* synthetic */ C3335t(int i) {
        this.f2063a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2063a) {
            case 0:
                ((C3328c) obj2).getClass();
                ((C3328c) obj).getClass();
                return AbstractC6768a.m6441f(2, 2);
            case 1:
                obj2.getClass();
                throw new ClassCastException();
            case 2:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }
}
