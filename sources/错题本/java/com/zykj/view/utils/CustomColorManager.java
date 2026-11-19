package com.zykj.view.utils;

import android.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p185v7.AbstractC6683l;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/view/utils/CustomColorManager;", "", "<init>", "()V", "baseColorList", "", "", "getBaseColorList", "()Ljava/util/List;", "customColorList", "", "getCustomColorList", "customColorSet", "", "isColorExist", "", TypedValues.Custom.S_COLOR, "rebuildColorWithWhiteAlpha", "alpha", "", "rebuildColorWithBlackAlpha", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCustomColorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorManager.kt\ncom/zykj/view/utils/CustomColorManager\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n404#2:67\n404#2:68\n404#2:69\n404#2:70\n404#2:71\n404#2:72\n404#2:73\n404#2:74\n404#2:75\n404#2:76\n404#2:77\n404#2:78\n404#2:79\n1563#3:80\n1634#3,3:81\n*S KotlinDebug\n*F\n+ 1 CustomColorManager.kt\ncom/zykj/view/utils/CustomColorManager\n*L\n9#1:67\n10#1:68\n11#1:69\n12#1:70\n13#1:71\n14#1:72\n15#1:73\n16#1:74\n17#1:75\n18#1:76\n19#1:77\n20#1:78\n21#1:79\n24#1:80\n24#1:81,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CustomColorManager {

    @NotNull
    public static final CustomColorManager INSTANCE = new CustomColorManager();

    @NotNull
    private static final List<Integer> baseColorList;

    @NotNull
    private static final List<List<Integer>> customColorList;

    @NotNull
    private static final Set<Integer> customColorSet;

    static {
        int i;
        List<Integer> listM5287z = AbstractC5806u.m5287z(Integer.valueOf(Color.parseColor("#666666")), Integer.valueOf(Color.parseColor("#FC2A2A")), Integer.valueOf(Color.parseColor("#FF7903")), Integer.valueOf(Color.parseColor("#FDBE00")), Integer.valueOf(Color.parseColor("#FF9700")), Integer.valueOf(Color.parseColor("#8AD600")), Integer.valueOf(Color.parseColor("#47CC46")), Integer.valueOf(Color.parseColor("#00C0CA")), Integer.valueOf(Color.parseColor("#00AAF0")), Integer.valueOf(Color.parseColor("#007DFE")), Integer.valueOf(Color.parseColor("#3E56EC")), Integer.valueOf(Color.parseColor("#892BE1")), Integer.valueOf(Color.parseColor("#E40079")));
        baseColorList = listM5287z;
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5287z, 10));
        Iterator<T> it = listM5287z.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList();
            int i8 = 80;
            int iM6373m = AbstractC6683l.m6373m(80, 20, -20);
            if (iM6373m <= 80) {
                while (true) {
                    arrayList2.add(Integer.valueOf(INSTANCE.rebuildColorWithWhiteAlpha(iIntValue, i8 / 100)));
                    if (i8 == iM6373m) {
                        break;
                    } else {
                        i8 -= 20;
                    }
                }
            }
            arrayList2.add(Integer.valueOf(iIntValue));
            int iM6373m2 = AbstractC6683l.m6373m(15, 60, 15);
            if (15 <= iM6373m2) {
                while (true) {
                    arrayList2.add(Integer.valueOf(INSTANCE.rebuildColorWithBlackAlpha(iIntValue, i / 100)));
                    i = i != iM6373m2 ? i + 15 : 15;
                }
            }
            arrayList.add(arrayList2);
        }
        customColorList = arrayList;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            AbstractC5810y.m5291S((Iterable) obj, arrayList3);
        }
        customColorSet = AbstractC5805t.m5221H0(arrayList3);
    }

    private CustomColorManager() {
    }

    private final int rebuildColorWithBlackAlpha(int i, float f) {
        float f7 = 1 - f;
        return Color.rgb((int) (Color.red(i) * f7), (int) (Color.green(i) * f7), (int) (Color.blue(i) * f7));
    }

    private final int rebuildColorWithWhiteAlpha(int i, float f) {
        float f7 = 1 - f;
        float f8 = 255 * f;
        return Color.rgb((int) ((Color.red(i) * f7) + f8), (int) ((Color.green(i) * f7) + f8), (int) ((Color.blue(i) * f7) + f8));
    }

    @NotNull
    public final List<Integer> getBaseColorList() {
        return baseColorList;
    }

    @NotNull
    public final List<List<Integer>> getCustomColorList() {
        return customColorList;
    }

    public final boolean isColorExist(int color) {
        return customColorSet.contains(Integer.valueOf(color));
    }
}
