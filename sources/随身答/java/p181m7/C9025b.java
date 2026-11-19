package p181m7;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;

/* renamed from: m7.b */
/* loaded from: classes5.dex */
public final class C9025b {

    /* renamed from: a */
    public static final C9025b f15177a = new C9025b();

    /* renamed from: b */
    public static final List f15178b;

    /* renamed from: c */
    public static final List f15179c;

    /* renamed from: d */
    public static final Set f15180d;

    static {
        int i9;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Color.parseColor("#666666")), Integer.valueOf(Color.parseColor("#FC2A2A")), Integer.valueOf(Color.parseColor("#FF7903")), Integer.valueOf(Color.parseColor("#FDBE00")), Integer.valueOf(Color.parseColor("#FF9700")), Integer.valueOf(Color.parseColor("#8AD600")), Integer.valueOf(Color.parseColor("#47CC46")), Integer.valueOf(Color.parseColor("#00C0CA")), Integer.valueOf(Color.parseColor("#00AAF0")), Integer.valueOf(Color.parseColor("#007DFE")), Integer.valueOf(Color.parseColor("#3E56EC")), Integer.valueOf(Color.parseColor("#892BE1")), Integer.valueOf(Color.parseColor("#E40079"))});
        f15178b = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList();
            int i10 = 80;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(80, 20, -20);
            if (progressionLastElement <= 80) {
                while (true) {
                    arrayList2.add(Integer.valueOf(f15177a.m14387d(iIntValue, i10 / 100)));
                    if (i10 == progressionLastElement) {
                        break;
                    } else {
                        i10 -= 20;
                    }
                }
            }
            arrayList2.add(Integer.valueOf(iIntValue));
            int progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(15, 60, 15);
            if (15 <= progressionLastElement2) {
                while (true) {
                    arrayList2.add(Integer.valueOf(f15177a.m14386c(iIntValue, i9 / 100)));
                    i9 = i9 != progressionLastElement2 ? i9 + 15 : 15;
                }
            }
            arrayList.add(arrayList2);
        }
        f15179c = arrayList;
        f15180d = CollectionsKt.toSet(CollectionsKt.flatten(arrayList));
    }

    /* renamed from: a */
    public final List m14384a() {
        return f15179c;
    }

    /* renamed from: b */
    public final boolean m14385b(int i9) {
        return f15180d.contains(Integer.valueOf(i9));
    }

    /* renamed from: c */
    public final int m14386c(int i9, float f10) {
        float f11 = 1 - f10;
        return Color.rgb((int) (Color.red(i9) * f11), (int) (Color.green(i9) * f11), (int) (Color.blue(i9) * f11));
    }

    /* renamed from: d */
    public final int m14387d(int i9, float f10) {
        float f11 = 1 - f10;
        float f12 = 255 * f10;
        return Color.rgb((int) ((Color.red(i9) * f11) + f12), (int) ((Color.green(i9) * f11) + f12), (int) ((Color.blue(i9) * f11) + f12));
    }
}
