package okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractC2713b;
import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Options extends AbstractC2713b<ByteString> implements RandomAccess {
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        private final void buildTrieRecursive(long j4, Buffer buffer, int i4, List<? extends ByteString> list, int i5, int i6, List<Integer> list2) throws IOException {
            int i7;
            int i8;
            int i9;
            int i10;
            Buffer buffer2;
            int i11 = i4;
            if (!(i5 < i6)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i12 = i5; i12 < i6; i12++) {
                if (!(list.get(i12).size() >= i11)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i5);
            ByteString byteString2 = list.get(i6 - 1);
            if (i11 == byteString.size()) {
                int iIntValue = list2.get(i5).intValue();
                int i13 = i5 + 1;
                ByteString byteString3 = list.get(i13);
                i7 = i13;
                i8 = iIntValue;
                byteString = byteString3;
            } else {
                i7 = i5;
                i8 = -1;
            }
            if (byteString.getByte(i11) == byteString2.getByte(i11)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i14 = 0;
                for (int i15 = i11; i15 < iMin && byteString.getByte(i15) == byteString2.getByte(i15); i15++) {
                    i14++;
                }
                long intCount = j4 + getIntCount(buffer) + 2 + i14 + 1;
                buffer.writeInt(-i14);
                buffer.writeInt(i8);
                int i16 = i11 + i14;
                while (i11 < i16) {
                    buffer.writeInt(byteString.getByte(i11) & 255);
                    i11++;
                }
                if (i7 + 1 == i6) {
                    if (!(i16 == list.get(i7).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(list2.get(i7).intValue());
                    return;
                } else {
                    Buffer buffer3 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer3, i16, list, i7, i6, list2);
                    buffer.writeAll(buffer3);
                    return;
                }
            }
            int i17 = 1;
            for (int i18 = i7 + 1; i18 < i6; i18++) {
                if (list.get(i18 - 1).getByte(i11) != list.get(i18).getByte(i11)) {
                    i17++;
                }
            }
            long intCount2 = j4 + getIntCount(buffer) + 2 + (i17 * 2);
            buffer.writeInt(i17);
            buffer.writeInt(i8);
            for (int i19 = i7; i19 < i6; i19++) {
                byte b4 = list.get(i19).getByte(i11);
                if (i19 == i7 || b4 != list.get(i19 - 1).getByte(i11)) {
                    buffer.writeInt(b4 & 255);
                }
            }
            Buffer buffer4 = new Buffer();
            while (i7 < i6) {
                byte b5 = list.get(i7).getByte(i11);
                int i20 = i7 + 1;
                int i21 = i20;
                while (true) {
                    if (i21 >= i6) {
                        i9 = i6;
                        break;
                    } else {
                        if (b5 != list.get(i21).getByte(i11)) {
                            i9 = i21;
                            break;
                        }
                        i21++;
                    }
                }
                if (i20 == i9 && i11 + 1 == list.get(i7).size()) {
                    buffer.writeInt(list2.get(i7).intValue());
                    i10 = i9;
                    buffer2 = buffer4;
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer4))) * (-1));
                    i10 = i9;
                    buffer2 = buffer4;
                    buildTrieRecursive(intCount2, buffer4, i11 + 1, list, i7, i9, list2);
                }
                buffer4 = buffer2;
                i7 = i10;
            }
            buffer.writeAll(buffer4);
        }

        static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j4, Buffer buffer, int i4, List list, int i5, int i6, List list2, int i7, Object obj) throws IOException {
            companion.buildTrieRecursive((i7 & 1) != 0 ? 0L : j4, buffer, (i7 & 4) != 0 ? 0 : i4, list, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? list.size() : i6, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
        
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /* renamed from: of */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.Options m10010of(@org.jetbrains.annotations.NotNull okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.m10010of(okio.ByteString[]):okio.Options");
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, C2764g c2764g) {
        this(byteStringArr, iArr);
    }

    @NotNull
    /* renamed from: of */
    public static final Options m10009of(@NotNull ByteString... byteStringArr) {
        return Companion.m10010of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractC2711a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @NotNull
    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.AbstractC2713b, kotlin.collections.AbstractC2711a
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // kotlin.collections.AbstractC2713b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC2713b, java.util.List
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

    @Override // kotlin.collections.AbstractC2713b, java.util.List
    @NotNull
    public ByteString get(int i4) {
        return this.byteStrings[i4];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Options) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Options) byteString);
    }
}
