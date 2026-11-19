package okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m5175d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", "index", "Companion", "okio"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    @Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m5175d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, m5176k = 1, m5177mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i4;
            int i5;
            int i6;
            int i7;
            Buffer buffer;
            int i8 = byteStringOffset;
            if (!(fromIndex < toIndex)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = fromIndex; i9 < toIndex; i9++) {
                if (!(byteStrings.get(i9).size() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            int i10 = -1;
            if (i8 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i11 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i11);
                i4 = i11;
                i5 = iIntValue;
                byteString = byteString3;
            } else {
                i4 = fromIndex;
                i5 = -1;
            }
            if (byteString.getByte(i8) == byteString2.getByte(i8)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i12 = 0;
                for (int i13 = i8; i13 < iMin && byteString.getByte(i13) == byteString2.getByte(i13); i13++) {
                    i12++;
                }
                long intCount = nodeOffset + getIntCount(node) + 2 + i12 + 1;
                node.writeInt(-i12);
                node.writeInt(i5);
                int i14 = i8 + i12;
                while (i8 < i14) {
                    node.writeInt(byteString.getByte(i8) & UByte.MAX_VALUE);
                    i8++;
                }
                if (i4 + 1 == toIndex) {
                    if (!(i14 == byteStrings.get(i4).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    node.writeInt(indexes.get(i4).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    node.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i14, byteStrings, i4, toIndex, indexes);
                    node.writeAll(buffer2);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < toIndex; i16++) {
                if (byteStrings.get(i16 - 1).getByte(i8) != byteStrings.get(i16).getByte(i8)) {
                    i15++;
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + (i15 * 2);
            node.writeInt(i15);
            node.writeInt(i5);
            for (int i17 = i4; i17 < toIndex; i17++) {
                byte b4 = byteStrings.get(i17).getByte(i8);
                if (i17 == i4 || b4 != byteStrings.get(i17 - 1).getByte(i8)) {
                    node.writeInt(b4 & UByte.MAX_VALUE);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i4 < toIndex) {
                byte b5 = byteStrings.get(i4).getByte(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= toIndex) {
                        i6 = toIndex;
                        break;
                    } else {
                        if (b5 != byteStrings.get(i19).getByte(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == byteStrings.get(i4).size()) {
                    node.writeInt(indexes.get(i4).intValue());
                    i7 = i6;
                    buffer = buffer3;
                } else {
                    node.writeInt(((int) (intCount2 + getIntCount(buffer3))) * i10);
                    i7 = i6;
                    buffer = buffer3;
                    buildTrieRecursive(intCount2, buffer3, i8 + 1, byteStrings, i4, i6, indexes);
                }
                buffer3 = buffer;
                i4 = i7;
                i10 = -1;
            }
            node.writeAll(buffer3);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j4, Buffer buffer, int i4, List list, int i5, int i6, List list2, int i7, Object obj) throws IOException {
            companion.buildTrieRecursive((i7 & 1) != 0 ? 0L : j4, buffer, (i7 & 4) != 0 ? 0 : i4, list, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? list.size() : i6, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        /* renamed from: of */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.Options m5653of(okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.m5653of(okio.ByteString[]):okio.Options");
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @JvmStatic
    /* renamed from: of */
    public static final Options m5652of(ByteString... byteStringArr) {
        return INSTANCE.m5653of(byteStringArr);
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
        return super.contains((Options) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Options) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Options) byteString);
    }
}
