package p060f6;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: f6.a */
/* loaded from: classes2.dex */
public final class C5534a implements Comparator {

    /* renamed from: b */
    public static final C5534a f8575b = new C5534a(0);

    /* renamed from: c */
    public static final C5534a f8576c = new C5534a(1);

    /* renamed from: a */
    public final /* synthetic */ int f8577a;

    public /* synthetic */ C5534a(int i) {
        this.f8577a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8577a) {
            case 0:
                Comparable a9 = (Comparable) obj;
                Comparable b6 = (Comparable) obj2;
                AbstractC5830k.m5330g(a9, "a");
                AbstractC5830k.m5330g(b6, "b");
                return a9.compareTo(b6);
            default:
                Comparable a10 = (Comparable) obj;
                Comparable b9 = (Comparable) obj2;
                AbstractC5830k.m5330g(a10, "a");
                AbstractC5830k.m5330g(b9, "b");
                return b9.compareTo(a10);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f8577a) {
            case 0:
                return f8576c;
            default:
                return f8575b;
        }
    }
}
