package okhttp3.internal.http2;

import anet.channel.util.HttpConstant;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C2723g;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Hpack {
    public static final Hpack INSTANCE;

    @NotNull
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;

    @NotNull
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        ByteString byteString = Header.TARGET_METHOD;
        ByteString byteString2 = Header.TARGET_PATH;
        ByteString byteString3 = Header.TARGET_SCHEME;
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, HttpConstant.HTTP), new Header(byteString3, HttpConstant.HTTPS), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header(Constants.KEY_HOST, ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(RequestParameters.SUBRESOURCE_LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header(RequestParameters.SUBRESOURCE_REFERER, ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i4].name)) {
                linkedHashMap.put(headerArr2[i4].name, Integer.valueOf(i4));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C2769l.m9240d(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    @NotNull
    public final ByteString checkLowercase(@NotNull ByteString name) throws IOException {
        C2769l.m9241e(name, "name");
        int size = name.size();
        for (int i4 = 0; i4 < size; i4++) {
            byte b4 = (byte) 65;
            byte b5 = (byte) 90;
            byte b6 = name.getByte(i4);
            if (b4 <= b6 && b5 >= b6) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    @NotNull
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @NotNull
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    public static final class Reader {

        @NotNull
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final BufferedSource source;

        public Reader(@NotNull Source source, int i4) {
            this(source, i4, 0, 4, null);
        }

        public Reader(@NotNull Source source, int i4, int i5) {
            C2769l.m9241e(source, "source");
            this.headerTableSizeSetting = i4;
            this.maxDynamicTableByteCount = i5;
            this.headerList = new ArrayList();
            this.source = Okio.buffer(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i4 = this.maxDynamicTableByteCount;
            int i5 = this.dynamicTableByteCount;
            if (i4 < i5) {
                if (i4 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i5 - i4);
                }
            }
        }

        private final void clearDynamicTable() {
            C2723g.m9090l(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i4) {
            return this.nextHeaderIndex + 1 + i4;
        }

        private final int evictToRecoverBytes(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i5 = this.nextHeaderIndex;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    C2769l.m9239c(header);
                    int i7 = header.hpackSize;
                    i4 -= i7;
                    this.dynamicTableByteCount -= i7;
                    this.headerCount--;
                    i6++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i5 + 1, headerArr, i5 + 1 + i6, this.headerCount);
                this.nextHeaderIndex += i6;
            }
            return i6;
        }

        private final ByteString getName(int i4) throws IOException {
            if (isStaticHeader(i4)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i4].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i4 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    C2769l.m9239c(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        private final void insertIntoDynamicTable(int i4, Header header) {
            this.headerList.add(header);
            int i5 = header.hpackSize;
            if (i4 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i4)];
                C2769l.m9239c(header2);
                i5 -= header2.hpackSize;
            }
            int i6 = this.maxDynamicTableByteCount;
            if (i5 > i6) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i5) - i6);
            if (i4 == -1) {
                int i7 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i7 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i8 = this.nextHeaderIndex;
                this.nextHeaderIndex = i8 - 1;
                this.dynamicTable[i8] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i4 + dynamicTableIndex(i4) + iEvictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i5;
        }

        private final boolean isStaticHeader(int i4) {
            return i4 >= 0 && i4 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i4) throws IOException {
            if (isStaticHeader(i4)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i4]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i4 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    C2769l.m9239c(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i4) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i4), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i4) throws IOException {
            this.headerList.add(new Header(getName(i4), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        @NotNull
        public final List<Header> getAndResetHeaderList() {
            List<Header> listM9163K = C2738t.m9163K(this.headerList);
            this.headerList.clear();
            return listM9163K;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @NotNull
        public final ByteString readByteString() throws IOException {
            int i4 = readByte();
            boolean z3 = (i4 & 128) == 128;
            long j4 = readInt(i4, 127);
            if (!z3) {
                return this.source.readByteString(j4);
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.decode(this.source, j4, buffer);
            return buffer.readByteString();
        }

        public final void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i4 = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i4;
                    if (i4 < 0 || i4 > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i4, int i5) throws IOException {
            int i6 = i4 & i5;
            if (i6 < i5) {
                return i6;
            }
            int i7 = 0;
            while (true) {
                int i8 = readByte();
                if ((i8 & 128) == 0) {
                    return i5 + (i8 << i7);
                }
                i5 += (i8 & 127) << i7;
                i7 += 7;
            }
        }

        public /* synthetic */ Reader(Source source, int i4, int i5, int i6, C2764g c2764g) {
            this(source, i4, (i6 & 4) != 0 ? i4 : i5);
        }
    }

    public static final class Writer {

        @NotNull
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i4, @NotNull Buffer buffer) {
            this(i4, false, buffer, 2, null);
        }

        public Writer(int i4, boolean z3, @NotNull Buffer out) {
            C2769l.m9241e(out, "out");
            this.headerTableSizeSetting = i4;
            this.useCompression = z3;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i4;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public Writer(@NotNull Buffer buffer) {
            this(0, false, buffer, 3, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i4 = this.maxDynamicTableByteCount;
            int i5 = this.dynamicTableByteCount;
            if (i4 < i5) {
                if (i4 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i5 - i4);
                }
            }
        }

        private final void clearDynamicTable() {
            C2723g.m9090l(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i5 = this.nextHeaderIndex;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    C2769l.m9239c(header);
                    i4 -= header.hpackSize;
                    int i7 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    C2769l.m9239c(header2);
                    this.dynamicTableByteCount = i7 - header2.hpackSize;
                    this.headerCount--;
                    i6++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i5 + 1, headerArr, i5 + 1 + i6, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i8 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i8 + 1, i8 + 1 + i6, (Object) null);
                this.nextHeaderIndex += i6;
            }
            return i6;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i4 = header.hpackSize;
            int i5 = this.maxDynamicTableByteCount;
            if (i4 > i5) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i4) - i5);
            int i6 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i6 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i7 = this.nextHeaderIndex;
            this.nextHeaderIndex = i7 - 1;
            this.dynamicTable[i7] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i4;
        }

        public final void resizeHeaderTable(int i4) {
            this.headerTableSizeSetting = i4;
            int iMin = Math.min(i4, 16384);
            int i5 = this.maxDynamicTableByteCount;
            if (i5 == iMin) {
                return;
            }
            if (iMin < i5) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(@NotNull ByteString data) throws IOException {
            C2769l.m9241e(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    huffman.encode(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    writeInt(byteString.size(), 127, 128);
                    this.out.write(byteString);
                    return;
                }
            }
            writeInt(data.size(), 127, 0);
            this.out.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i4, int i5, int i6) {
            if (i4 < i5) {
                this.out.writeByte(i4 | i6);
                return;
            }
            this.out.writeByte(i6 | i5);
            int i7 = i4 - i5;
            while (i7 >= 128) {
                this.out.writeByte(128 | (i7 & 127));
                i7 >>>= 7;
            }
            this.out.writeByte(i7);
        }

        public /* synthetic */ Writer(int i4, boolean z3, Buffer buffer, int i5, C2764g c2764g) {
            this((i5 & 1) != 0 ? 4096 : i4, (i5 & 2) != 0 ? true : z3, buffer);
        }
    }
}
