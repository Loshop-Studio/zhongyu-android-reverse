package p027b8;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;

/* renamed from: b8.b */
/* loaded from: classes5.dex */
public final class C5045b {

    /* renamed from: a */
    public static final C5045b f2579a = new C5045b();

    /* renamed from: b */
    public static final List f2580b;

    /* renamed from: c */
    public static final List f2581c;

    /* renamed from: d */
    public static final Set f2582d;

    static {
        int i10;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Color.parseColor("#666666")), Integer.valueOf(Color.parseColor("#FC2A2A")), Integer.valueOf(Color.parseColor("#FF7903")), Integer.valueOf(Color.parseColor("#FDBE00")), Integer.valueOf(Color.parseColor("#FF9700")), Integer.valueOf(Color.parseColor("#8AD600")), Integer.valueOf(Color.parseColor("#47CC46")), Integer.valueOf(Color.parseColor("#00C0CA")), Integer.valueOf(Color.parseColor("#00AAF0")), Integer.valueOf(Color.parseColor("#007DFE")), Integer.valueOf(Color.parseColor("#3E56EC")), Integer.valueOf(Color.parseColor("#892BE1")), Integer.valueOf(Color.parseColor("#E40079"))});
        f2580b = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList();
            int i11 = 80;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(80, 20, -20);
            if (progressionLastElement <= 80) {
                while (true) {
                    arrayList2.add(Integer.valueOf(f2579a.m2524d(iIntValue, i11 / 100)));
                    if (i11 == progressionLastElement) {
                        break;
                    } else {
                        i11 -= 20;
                    }
                }
            }
            arrayList2.add(Integer.valueOf(iIntValue));
            int progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(15, 60, 15);
            if (15 <= progressionLastElement2) {
                while (true) {
                    arrayList2.add(Integer.valueOf(f2579a.m2523c(iIntValue, i10 / 100)));
                    i10 = i10 != progressionLastElement2 ? i10 + 15 : 15;
                }
            }
            arrayList.add(arrayList2);
        }
        f2581c = arrayList;
        f2582d = CollectionsKt.toSet(CollectionsKt.flatten(arrayList));
    }

    /* renamed from: a */
    public final List m2521a() {
        return f2581c;
    }

    /* renamed from: b */
    public final boolean m2522b(int i10) {
        return f2582d.contains(Integer.valueOf(i10));
    }

    /* renamed from: c */
    public final int m2523c(int i10, float f10) {
        float f11 = 1 - f10;
        return Color.rgb((int) (Color.red(i10) * f11), (int) (Color.green(i10) * f11), (int) (Color.blue(i10) * f11));
    }

    /* renamed from: d */
    public final int m2524d(int i10, float f10) {
        float f11 = 1 - f10;
        float f12 = 255 * f10;
        return Color.rgb((int) ((Color.red(i10) * f11) + f12), (int) ((Color.green(i10) * f11) + f12), (int) ((Color.blue(i10) * f11) + f12));
    }
}
