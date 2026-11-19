package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.TreeMap;

/* loaded from: classes2.dex */
class DexProfileData {

    @NonNull
    final String apkName;
    int classSetSize;

    @NonNull
    int[] classes;
    final long dexChecksum;

    @NonNull
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;

    @NonNull
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    public DexProfileData(@NonNull String str, @NonNull String str2, long j7, long j8, int i, int i8, int i9, @NonNull int[] iArr, @NonNull TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j7;
        this.mTypeIdCount = j8;
        this.classSetSize = i;
        this.hotMethodRegionSize = i8;
        this.numMethodIds = i9;
        this.classes = iArr;
        this.methods = treeMap;
    }
}
