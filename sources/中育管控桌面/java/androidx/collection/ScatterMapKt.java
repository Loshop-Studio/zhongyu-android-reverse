package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000d\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\bH\u0080\b\u001a\u001e\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0\u001b\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00060\u0001j\u0002`\u001f2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u0011\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0080\b\u001a\u0011\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0080\b\u001a\u0013\u0010\"\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0080\b\u001a\u0019\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\bH\u0080\b\u001a\u0019\u0010(\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\bH\u0080\b\u001a\u0011\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0001H\u0081\b\u001a\u0019\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\bH\u0080\b\u001a\u0010\u0010+\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a\u001e\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0\u000f\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d\u001aO\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0\u000f\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d2*\u0010-\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0/0.\"\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0/¢\u0006\u0002\u00100\u001a\u0010\u00101\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a\u0010\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0000\u001a\u0019\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\r2\u0006\u0010 \u001a\u00020\bH\u0081\b\u001a\u0010\u00106\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a)\u00107\u001a\u00020\u00172\u0006\u00105\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0001H\u0080\b\u001a!\u00108\u001a\u00020\u00172\u0006\u00105\u001a\u00020\r2\u0006\u0010 \u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0001H\u0080\b\u001a\u0011\u00109\u001a\u00020\b*\u00060\u0001j\u0002`:H\u0080\b\u001a\u0011\u0010;\u001a\u00020&*\u00060\u0001j\u0002`:H\u0080\b\u001a\u0011\u0010<\u001a\u00020\b*\u00060\u0001j\u0002`=H\u0081\b\u001a\u0015\u0010>\u001a\u00060\u0001j\u0002`:*\u00060\u0001j\u0002`\u001fH\u0080\b\u001a\u0015\u0010?\u001a\u00060\u0001j\u0002`:*\u00060\u0001j\u0002`\u001fH\u0081\b\u001a\u001d\u0010@\u001a\u00060\u0001j\u0002`:*\u00060\u0001j\u0002`\u001f2\u0006\u0010A\u001a\u00020\bH\u0081\b\u001a\u0011\u0010B\u001a\u00020\u0001*\u00060\u0001j\u0002`:H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0004*\f\b\u0000\u0010C\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010D\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010E\"\u00020\u00012\u00020\u0001¨\u0006F"}, m7880d2 = {"AllEmpty", "", "BitmaskLsb", "getBitmaskLsb$annotations", "()V", "BitmaskMsb", "getBitmaskMsb$annotations", "ClonedMetadataCount", "", "DefaultScatterCapacity", "Deleted", "Empty", "EmptyGroup", "", "EmptyScatterMap", "Landroidx/collection/MutableScatterMap;", "", "", "GroupWidth", "MurmurHashC1", "Sentinel", "getSentinel$annotations", "convertMetadataForCleanup", "", "metadata", "capacity", "emptyScatterMap", "Landroidx/collection/ScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "group", "Landroidx/collection/Group;", TypedValues.CycleType.S_WAVE_OFFSET, "h1", "hash", "h2", "k", "isDeleted", "", "index", "isEmpty", "isFull", "value", "loadedCapacity", "mutableScatterMapOf", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "nextCapacity", "normalizeCapacity", "n", "readRawMetadata", "data", "unloadedCapacity", "writeMetadata", "writeRawMetadata", "get", "Landroidx/collection/Bitmask;", "hasNext", "lowestBitSet", "Landroidx/collection/StaticBitmask;", "maskEmpty", "maskEmptyOrDeleted", "match", "m", "next", "Bitmask", "Group", "StaticBitmask", "collection"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1787:1\n1254#1,6:1789\n1220#1:1795\n1220#1:1796\n1220#1:1797\n1297#1:1798\n1#2:1788\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1230#1:1789,6\n1262#1:1795\n1265#1:1796\n1268#1:1797\n1303#1:1798\n*E\n"})
/* loaded from: classes.dex */
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;

    @JvmField
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static final void convertMetadataForCleanup(long[] metadata, int i6) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i7 = (i6 + 7) >> 3;
        for (int i8 = 0; i8 < i7; i8++) {
            long j6 = metadata[i8] & (-9187201950435737472L);
            metadata[i8] = (-72340172838076674L) & ((~j6) + (j6 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(metadata);
        int i9 = lastIndex - 1;
        metadata[i9] = (metadata[i9] & 72057594037927935L) | (-72057594037927936L);
        metadata[lastIndex] = metadata[0];
    }

    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        Intrinsics.checkNotNull(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j6) {
        return Long.numberOfTrailingZeros(j6) >> 3;
    }

    @PublishedApi
    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final long group(long[] metadata, int i6) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        return (((-i8) >> 63) & (metadata[i7 + 1] << (64 - i8))) | (metadata[i7] >>> i8);
    }

    /* renamed from: h1 */
    public static final int m96h1(int i6) {
        return i6 >>> 7;
    }

    /* renamed from: h2 */
    public static final int m97h2(int i6) {
        return i6 & 127;
    }

    public static final boolean hasNext(long j6) {
        return j6 != 0;
    }

    public static final int hash(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean isDeleted(long[] metadata, int i6) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i6 >> 3] >> ((i6 & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(long[] metadata, int i6) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i6 >> 3] >> ((i6 & 7) << 3)) & 255) == 128;
    }

    @PublishedApi
    public static final boolean isFull(long j6) {
        return j6 < 128;
    }

    public static final int loadedCapacity(int i6) {
        if (i6 == 7) {
            return 6;
        }
        return i6 - (i6 / 8);
    }

    @PublishedApi
    public static final int lowestBitSet(long j6) {
        return Long.numberOfTrailingZeros(j6) >> 3;
    }

    public static final long maskEmpty(long j6) {
        return j6 & ((~j6) << 6) & (-9187201950435737472L);
    }

    @PublishedApi
    public static final long maskEmptyOrDeleted(long j6) {
        return j6 & ((~j6) << 7) & (-9187201950435737472L);
    }

    @PublishedApi
    public static final long match(long j6, int i6) {
        long j7 = j6 ^ (i6 * BitmaskLsb);
        return (~j7) & (j7 - BitmaskLsb) & (-9187201950435737472L);
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final long next(long j6) {
        return j6 & (j6 - 1);
    }

    public static final int nextCapacity(int i6) {
        if (i6 == 0) {
            return 6;
        }
        return (i6 * 2) + 1;
    }

    public static final int normalizeCapacity(int i6) {
        if (i6 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i6);
        }
        return 0;
    }

    @PublishedApi
    public static final long readRawMetadata(long[] data, int i6) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data[i6 >> 3] >> ((i6 & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i6) {
        if (i6 == 7) {
            return 8;
        }
        return i6 + ((i6 - 1) / 7);
    }

    public static final void writeMetadata(long[] data, int i6, int i7, long j6) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i8 = i7 >> 3;
        int i9 = (i7 & 7) << 3;
        long j7 = (j6 << i9) | (data[i8] & (~(255 << i9)));
        data[i8] = j7;
        data[(((i7 - 7) & i6) + (i6 & 7)) >> 3] = j7;
    }

    public static final void writeRawMetadata(long[] data, int i6, long j6) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        data[i7] = (j6 << i8) | (data[i7] & (~(255 << i8)));
    }

    public static final boolean isFull(long[] metadata, int i6) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128;
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }
}
