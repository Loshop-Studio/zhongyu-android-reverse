package okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0016B!\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m13558d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "<init>", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "getTrie$okio", "()[I", "size", "", "getSize", "()I", "get", "index", "Companion", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    @Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\tJT\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002R\u0018\u0010\u0016\u001a\u00020\r*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m13558d2 = {"Lokio/Options$Companion;", "", "<init>", "()V", "of", "Lokio/Options;", "byteStrings", "", "Lokio/ByteString;", "([Lokio/ByteString;)Lokio/Options;", "buildTrieRecursive", "", "nodeOffset", "", "node", "Lokio/Buffer;", "byteStringOffset", "", "", "fromIndex", "toIndex", "indexes", "intCount", "getIntCount", "(Lokio/Buffer;)J", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,238:1\n1#2:239\n13537#3,3:240\n73#4:243\n73#4:244\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n48#1:240,3\n153#1:243\n210#1:244\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i10;
            int i11;
            int i12;
            long j10;
            int i13 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = fromIndex; i14 < toIndex; i14++) {
                if (byteStrings.get(i14).size() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i13 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i15 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i15);
                i10 = i15;
                i11 = iIntValue;
                byteString = byteString3;
            } else {
                i10 = fromIndex;
                i11 = -1;
            }
            if (byteString.getByte(i13) == byteString2.getByte(i13)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i16 = 0;
                for (int i17 = i13; i17 < iMin && byteString.getByte(i17) == byteString2.getByte(i17); i17++) {
                    i16++;
                }
                long intCount = nodeOffset + getIntCount(node) + 2 + i16 + 1;
                node.writeInt(-i16);
                node.writeInt(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    node.writeInt(byteString.getByte(i13) & UByte.MAX_VALUE);
                    i13++;
                }
                if (i10 + 1 == toIndex) {
                    if (i18 != byteStrings.get(i10).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i10).intValue());
                    return;
                } else {
                    Buffer buffer = new Buffer();
                    node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer, i18, byteStrings, i10, toIndex, indexes);
                    node.writeAll(buffer);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < toIndex; i20++) {
                if (byteStrings.get(i20 - 1).getByte(i13) != byteStrings.get(i20).getByte(i13)) {
                    i19++;
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + (i19 * 2);
            node.writeInt(i19);
            node.writeInt(i11);
            for (int i21 = i10; i21 < toIndex; i21++) {
                byte b10 = byteStrings.get(i21).getByte(i13);
                if (i21 == i10 || b10 != byteStrings.get(i21 - 1).getByte(i13)) {
                    node.writeInt(b10 & UByte.MAX_VALUE);
                }
            }
            Buffer buffer2 = new Buffer();
            while (i10 < toIndex) {
                byte b11 = byteStrings.get(i10).getByte(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= toIndex) {
                        i12 = toIndex;
                        break;
                    } else {
                        if (b11 != byteStrings.get(i23).getByte(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == byteStrings.get(i10).size()) {
                    node.writeInt(indexes.get(i10).intValue());
                    j10 = intCount2;
                } else {
                    node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                    j10 = intCount2;
                    buildTrieRecursive(j10, buffer2, i13 + 1, byteStrings, i10, i12, indexes);
                }
                intCount2 = j10;
                i10 = i12;
            }
            node.writeAll(buffer2);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.buildTrieRecursive(j10, buffer, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        /* renamed from: of */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.Options m14628of(okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.m14628of(okio.ByteString[]):okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @JvmStatic
    /* renamed from: of */
    public static final Options m14627of(ByteString... byteStringArr) {
        return INSTANCE.m14628of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    /* renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    /* renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
