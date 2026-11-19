package androidx.camera.core.processing;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(@NonNull Collection<Integer> collection, int i) {
        boolean zContains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        Preconditions.checkArgument(zContains, AbstractC0037f.m87l("Effects target ", getHumanReadableName(i), " is not in the supported list ", getHumanReadableNames(collection), "."));
    }

    @NonNull
    public static String getHumanReadableName(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    @NonNull
    private static String getHumanReadableNames(@NonNull Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        StringBuilder sb = new StringBuilder("[");
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ", ");
            }
        }
        sb.append(sb2.toString());
        sb.append("]");
        return sb.toString();
    }

    public static int getNumberOfTargets(int i) {
        int i8 = 0;
        while (i != 0) {
            i8 += i & 1;
            i >>= 1;
        }
        return i8;
    }

    public static boolean isSuperset(int i, int i8) {
        return (i & i8) == i8;
    }
}
