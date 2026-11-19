package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i9, int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    iArr[i10] = i11;
                    generateArrangements(list, i9, iArr, i10 + 1);
                    break;
                } else if (i11 == iArr[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i9) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i9, new int[i9], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    @Nullable
    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(@NonNull List<SurfaceConfig> list) {
        int i9;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = elementsArrangements.iterator();
        while (true) {
            i9 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean zIsSupported = true;
            while (i9 < this.mSurfaceConfigList.size()) {
                if (next[i9] < list.size()) {
                    zIsSupported &= this.mSurfaceConfigList.get(i9).isSupported(list.get(next[i9]));
                    if (!zIsSupported) {
                        break;
                    }
                    surfaceConfigArr[next[i9]] = this.mSurfaceConfigList.get(i9);
                }
                i9++;
            }
            if (zIsSupported) {
                i9 = 1;
                break;
            }
        }
        if (i9 != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }

    @NonNull
    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
