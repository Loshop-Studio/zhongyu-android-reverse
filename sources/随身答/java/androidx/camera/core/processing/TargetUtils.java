package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC0584u;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(@NonNull Collection<Integer> collection, int i9) {
        Preconditions.checkArgument(collection.contains(Integer.valueOf(i9)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", getHumanReadableName(i9), getHumanReadableNames(collection)));
    }

    @NonNull
    public static String getHumanReadableName(int i9) {
        ArrayList arrayList = new ArrayList();
        if ((i9 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i9 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i9 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return AbstractC0584u.m588a("|", arrayList);
    }

    @NonNull
    private static String getHumanReadableNames(@NonNull Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        return "[" + AbstractC0584u.m588a(", ", arrayList) + "]";
    }

    public static int getNumberOfTargets(int i9) {
        int i10 = 0;
        while (i9 != 0) {
            i10 += i9 & 1;
            i9 >>= 1;
        }
        return i10;
    }

    public static boolean isSuperset(int i9, int i10) {
        return (i9 & i10) == i10;
    }
}
