package okio.internal;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import okio.ZipFileSystem;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p310qd.AbstractC10788a;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
import p364uc.AbstractC11382b;

/* loaded from: classes6.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_NTFS_EXTRA = 10;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 1, (Object) null);
        Map<Path, ZipEntry> mapM20092l = AbstractC9925a.m20092l(AbstractC10776g.m22975a(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (ZipEntry zipEntry : AbstractC10947g0.m23914P0(list, new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC11382b.m25330d(((ZipEntry) t10).getCanonicalPath(), ((ZipEntry) t11).getCanonicalPath());
            }
        })) {
            if (mapM20092l.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = mapM20092l.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        mapM20092l.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return mapM20092l;
    }

    public static final Long dosDateTimeToEpochMillis(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(_ZlibJvmKt.datePartsToEpochMillis(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long filetimeToEpochMillis(long j10) {
        return (j10 / 10000) - 11644473600000L;
    }

    private static final String getHex(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, AbstractC10788a.m23073a(16));
        AbstractC9979u.m20293f(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #13 {all -> 0x00df, blocks: (B:13:0x0062, B:15:0x006b, B:18:0x007c, B:43:0x00de, B:46:0x00e2, B:47:0x00e9, B:48:0x00ea), top: B:139:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:10:0x004e, B:12:0x005a, B:65:0x010b, B:59:0x00ff, B:66:0x010c, B:93:0x016e, B:97:0x017f, B:90:0x0168, B:100:0x0182, B:103:0x018e, B:104:0x0195, B:105:0x0196, B:106:0x0199, B:107:0x019a, B:108:0x01b4, B:7:0x0038, B:9:0x0041, B:67:0x011d, B:70:0x0125, B:72:0x0135, B:74:0x0141, B:77:0x0148, B:78:0x014c, B:79:0x0153, B:80:0x0154, B:87:0x0161, B:56:0x00f8), top: B:118:0x0019, inners: #0, #2, #3, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okio.ZipFileSystem openZip(okio.Path r18, okio.FileSystem r19, p181hd.InterfaceC9540l r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ZipFilesKt.openZip(okio.Path, okio.FileSystem, hd.l):okio.ZipFileSystem");
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: okio.internal.c
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(ZipFilesKt.openZip$lambda$0((ZipEntry) obj2));
                }
            };
        }
        return openZip(path, fileSystem, interfaceC9540l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean openZip$lambda$0(ZipEntry it) {
        AbstractC9979u.m20294g(it, "it");
        return true;
    }

    public static final ZipEntry readCentralDirectoryZipEntry(final BufferedSource bufferedSource) throws IOException {
        AbstractC9979u.m20294g(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i10));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        long intLe2 = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f23401c = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.f23401c = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        int shortLe6 = bufferedSource.readShortLe() & 65535;
        int shortLe7 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.f23401c = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe5);
        if (AbstractC10793c0.m23106T(utf8, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = ref$LongRef2.f23401c == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (ref$LongRef.f23401c == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += 8;
        }
        if (ref$LongRef3.f23401c == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += 8;
        }
        final long j11 = j10;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        readExtra(bufferedSource, shortLe6, new InterfaceC9544p() { // from class: okio.internal.f
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return ZipFilesKt.readCentralDirectoryZipEntry$lambda$8(ref$BooleanRef, j11, ref$LongRef2, bufferedSource, ref$LongRef, ref$LongRef3, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j11 <= 0 || ref$BooleanRef.f23398c) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 1, (Object) null).resolve(utf8), AbstractC10819z.m23229B(utf8, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 2, null), bufferedSource.readUtf8(shortLe7), intLe2, ref$LongRef.f23401c, ref$LongRef2.f23401c, shortLe2, ref$LongRef3.f23401c, shortLe4, shortLe3, (Long) ref$ObjectRef.f23402c, (Long) ref$ObjectRef2.f23402c, (Long) ref$ObjectRef3.f23402c, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q readCentralDirectoryZipEntry$lambda$8(Ref$BooleanRef ref$BooleanRef, long j10, Ref$LongRef ref$LongRef, final BufferedSource bufferedSource, Ref$LongRef ref$LongRef2, Ref$LongRef ref$LongRef3, final Ref$ObjectRef ref$ObjectRef, final Ref$ObjectRef ref$ObjectRef2, final Ref$ObjectRef ref$ObjectRef3, int i10, long j11) throws IOException {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                bufferedSource.skip(4L);
                readExtra(bufferedSource, (int) (j11 - 4), new InterfaceC9544p() { // from class: okio.internal.e
                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(Object obj, Object obj2) {
                        return ZipFilesKt.readCentralDirectoryZipEntry$lambda$8$lambda$7(ref$ObjectRef, bufferedSource, ref$ObjectRef2, ref$ObjectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (ref$BooleanRef.f23398c) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            ref$BooleanRef.f23398c = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long longLe = ref$LongRef.f23401c;
            if (longLe == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                longLe = bufferedSource.readLongLe();
            }
            ref$LongRef.f23401c = longLe;
            ref$LongRef2.f23401c = ref$LongRef2.f23401c == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
            ref$LongRef3.f23401c = ref$LongRef3.f23401c == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q readCentralDirectoryZipEntry$lambda$8$lambda$7(Ref$ObjectRef ref$ObjectRef, BufferedSource bufferedSource, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, int i10, long j10) throws IOException {
        if (i10 == 1) {
            if (ref$ObjectRef.f23402c != null) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            ref$ObjectRef.f23402c = Long.valueOf(bufferedSource.readLongLe());
            ref$ObjectRef2.f23402c = Long.valueOf(bufferedSource.readLongLe());
            ref$ObjectRef3.f23402c = Long.valueOf(bufferedSource.readLongLe());
        }
        return C10786q.f26013a;
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & bufferedSource.readIntLe(), bufferedSource.readShortLe() & 65535);
    }

    private static final void readExtra(BufferedSource bufferedSource, int i10, InterfaceC9544p interfaceC9544p) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = bufferedSource.readShortLe() & 65535;
            long j11 = j10 - 4;
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            interfaceC9544p.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + shortLe);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j10 = j11 - shortLe2;
        }
    }

    public static final ZipEntry readLocalHeader(BufferedSource bufferedSource, ZipEntry centralDirectoryZipEntry) throws IOException {
        AbstractC9979u.m20294g(bufferedSource, "<this>");
        AbstractC9979u.m20294g(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        ZipEntry orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, centralDirectoryZipEntry);
        AbstractC9979u.m20291d(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    private static final ZipEntry readOrSkipLocalHeader(final BufferedSource bufferedSource, ZipEntry zipEntry) throws IOException {
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i10));
        }
        bufferedSource.skip(18L);
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(bufferedSource.readShortLe() & 65535);
        if (zipEntry == null) {
            bufferedSource.skip(shortLe2);
            return null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        readExtra(bufferedSource, shortLe2, new InterfaceC9544p() { // from class: okio.internal.d
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return ZipFilesKt.readOrSkipLocalHeader$lambda$10(bufferedSource, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return zipEntry.copy$okio((Integer) ref$ObjectRef.f23402c, (Integer) ref$ObjectRef2.f23402c, (Integer) ref$ObjectRef3.f23402c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q readOrSkipLocalHeader$lambda$10(BufferedSource bufferedSource, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, int i10, long j10) throws IOException {
        if (i10 == HEADER_ID_EXTENDED_TIMESTAMP) {
            if (j10 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b10 = bufferedSource.readByte();
            boolean z10 = (b10 & 1) == 1;
            boolean z11 = (b10 & 2) == 2;
            boolean z12 = (b10 & 4) == 4;
            long j11 = z10 ? 5L : 1L;
            if (z11) {
                j11 += 4;
            }
            if (z12) {
                j11 += 4;
            }
            if (j10 < j11) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z10) {
                ref$ObjectRef.f23402c = Integer.valueOf(bufferedSource.readIntLe());
            }
            if (z11) {
                ref$ObjectRef2.f23402c = Integer.valueOf(bufferedSource.readIntLe());
            }
            if (z12) {
                ref$ObjectRef3.f23402c = Integer.valueOf(bufferedSource.readIntLe());
            }
        }
        return C10786q.f26013a;
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        AbstractC9979u.m20294g(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
