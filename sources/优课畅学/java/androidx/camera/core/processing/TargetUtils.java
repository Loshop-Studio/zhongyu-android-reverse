package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC0591u;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(@NonNull Collection<Integer> collection, int i10) {
        Preconditions.checkArgument(collection.contains(Integer.valueOf(i10)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", getHumanReadableName(i10), getHumanReadableNames(collection)));
    }

    @NonNull
    public static String getHumanReadableName(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return AbstractC0591u.m566a("|", arrayList);
    }

    @NonNull
    private static String getHumanReadableNames(@NonNull Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        return "[" + AbstractC0591u.m566a(", ", arrayList) + "]";
    }

    public static int getNumberOfTargets(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>= 1;
        }
        return i11;
    }

    public static boolean isSuperset(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
