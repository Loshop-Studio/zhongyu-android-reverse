package okio.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import okio.BufferedSource;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.ZipFileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p125n7.C6237l;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00102\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010/\"\u0014\u00103\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u00104\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010/\"\u0014\u00105\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010/\"\u0014\u00106\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010/\"\u0014\u00107\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010/\"\u0014\u00108\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010:\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010/\"\u0014\u0010;\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010/\"\u0014\u0010<\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010/\"\u0018\u0010@\u001a\u00020=*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m5110d2 = {"Lokio/Path;", "zipPath", "Lokio/FileSystem;", "fileSystem", "Lkotlin/Function1;", "Lokio/internal/ZipEntry;", "", "predicate", "Lokio/ZipFileSystem;", "openZip", "(Lokio/Path;Lokio/FileSystem;Lr6/c;)Lokio/ZipFileSystem;", "", "entries", "", "buildIndex", "(Ljava/util/List;)Ljava/util/Map;", "Lokio/BufferedSource;", "readCentralDirectoryZipEntry", "(Lokio/BufferedSource;)Lokio/internal/ZipEntry;", "Lokio/internal/EocdRecord;", "readEocdRecord", "(Lokio/BufferedSource;)Lokio/internal/EocdRecord;", "regularRecord", "readZip64EocdRecord", "(Lokio/BufferedSource;Lokio/internal/EocdRecord;)Lokio/internal/EocdRecord;", "", "extraSize", "Lkotlin/Function2;", "", "Ld6/s;", "block", "readExtra", "(Lokio/BufferedSource;ILr6/e;)V", "skipLocalHeader", "(Lokio/BufferedSource;)V", "centralDirectoryZipEntry", "readLocalHeader", "(Lokio/BufferedSource;Lokio/internal/ZipEntry;)Lokio/internal/ZipEntry;", "readOrSkipLocalHeader", "filetime", "filetimeToEpochMillis", "(J)J", "date", "time", "dosDateTimeToEpochMillis", "(II)Ljava/lang/Long;", "LOCAL_FILE_HEADER_SIGNATURE", "I", "CENTRAL_FILE_HEADER_SIGNATURE", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "ZIP64_EOCD_RECORD_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "BIT_FLAG_ENCRYPTED", "BIT_FLAG_UNSUPPORTED_MASK", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "J", "HEADER_ID_ZIP64_EXTENDED_INFO", "HEADER_ID_NTFS_EXTRA", "HEADER_ID_EXTENDED_TIMESTAMP", "", "getHex", "(I)Ljava/lang/String;", "hex", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,503:1\n58#2,4:504\n58#2,4:508\n58#2,22:512\n66#2,10:534\n62#2,3:544\n77#2,3:547\n58#2,22:550\n66#2,10:572\n62#2,3:582\n77#2,3:585\n1056#3:588\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n66#1:504,4\n101#1:508,4\n109#1:512,22\n101#1:534,10\n101#1:544,3\n101#1:547,3\n125#1:550,22\n66#1:572,10\n66#1:582,3\n66#1:585,3\n155#1:588\n*E\n"})
/* loaded from: classes4.dex */
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
        Path path = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
        Pair[] pairArr = {new Pair(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5785e0.m5149C(1));
        AbstractC5785e0.m5154H(linkedHashMap, pairArr);
        for (ZipEntry zipEntry : AbstractC5805t.m5244x0(list, new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return AbstractC6768a.m6441f(((ZipEntry) t8).getCanonicalPath(), ((ZipEntry) t9).getCanonicalPath());
            }
        })) {
            if (((ZipEntry) linkedHashMap.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) linkedHashMap.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        linkedHashMap.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static final Long dosDateTimeToEpochMillis(int i, int i8) {
        if (i8 == -1) {
            return null;
        }
        return Long.valueOf(_ZlibJvmKt.datePartsToEpochMillis(((i >> 9) & 127) + 1980, (i >> 5) & 15, i & 31, (i8 >> 11) & 31, (i8 >> 5) & 63, (i8 & 31) << 1));
    }

    public static final long filetimeToEpochMillis(long j7) {
        return (j7 / 10000) - 11644473600000L;
    }

    private static final String getHex(int i) {
        AbstractC6768a.m6440d(16);
        String string = Integer.toString(i, 16);
        AbstractC5830k.m5329f(string, "toString(...)");
        return "0x".concat(string);
    }

    @NotNull
    public static final ZipFileSystem openZip(@NotNull Path zipPath, @NotNull FileSystem fileSystem, @NotNull InterfaceC6471c predicate) throws IOException {
        Throwable th;
        Throwable th2;
        int intLe;
        AbstractC5830k.m5330g(zipPath, "zipPath");
        AbstractC5830k.m5330g(fileSystem, "fileSystem");
        AbstractC5830k.m5330g(predicate, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = fileHandleOpenReadOnly.size() - 22;
            if (size < 0) {
                throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(size));
                try {
                    if (bufferedSourceBuffer.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer);
                        String utf8 = bufferedSourceBuffer.readUtf8(eocdRecord.getCommentByteCount());
                        bufferedSourceBuffer.close();
                        long j7 = size - 20;
                        Throwable th3 = null;
                        if (j7 > 0) {
                            BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(j7));
                            try {
                                if (bufferedSourceBuffer2.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                    int intLe2 = bufferedSourceBuffer2.readIntLe();
                                    long longLe = bufferedSourceBuffer2.readLongLe();
                                    if (bufferedSourceBuffer2.readIntLe() != 1 || intLe2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    BufferedSource bufferedSourceBuffer3 = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                    try {
                                        intLe = bufferedSourceBuffer3.readIntLe();
                                    } catch (Throwable th4) {
                                        if (bufferedSourceBuffer3 != null) {
                                            try {
                                                bufferedSourceBuffer3.close();
                                            } catch (Throwable th5) {
                                                AbstractC5806u.m5266e(th4, th5);
                                            }
                                        }
                                        th2 = th4;
                                    }
                                    if (intLe != ZIP64_EOCD_RECORD_SIGNATURE) {
                                        throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe));
                                    }
                                    eocdRecord = readZip64EocdRecord(bufferedSourceBuffer3, eocdRecord);
                                    try {
                                        bufferedSourceBuffer3.close();
                                        th2 = null;
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                    }
                                    if (th2 != null) {
                                        throw th2;
                                    }
                                }
                                try {
                                    bufferedSourceBuffer2.close();
                                    th = null;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                if (bufferedSourceBuffer2 != null) {
                                    try {
                                        bufferedSourceBuffer2.close();
                                    } catch (Throwable th9) {
                                        AbstractC5806u.m5266e(th8, th9);
                                    }
                                }
                                th = th8;
                            }
                            if (th != null) {
                                throw th;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        BufferedSource bufferedSourceBuffer4 = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                        try {
                            long entryCount = eocdRecord.getEntryCount();
                            for (long j8 = 0; j8 < entryCount; j8++) {
                                ZipEntry centralDirectoryZipEntry = readCentralDirectoryZipEntry(bufferedSourceBuffer4);
                                if (centralDirectoryZipEntry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(centralDirectoryZipEntry)).booleanValue()) {
                                    arrayList.add(centralDirectoryZipEntry);
                                }
                            }
                            if (bufferedSourceBuffer4 != null) {
                                try {
                                    bufferedSourceBuffer4.close();
                                } catch (Throwable th10) {
                                    th3 = th10;
                                }
                            }
                        } catch (Throwable th11) {
                            if (bufferedSourceBuffer4 != null) {
                                try {
                                    bufferedSourceBuffer4.close();
                                } catch (Throwable th12) {
                                    AbstractC5806u.m5266e(th11, th12);
                                }
                            }
                            th3 = th11;
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                        ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, buildIndex(arrayList), utf8);
                        try {
                            fileHandleOpenReadOnly.close();
                        } catch (Throwable unused) {
                        }
                        return zipFileSystem;
                    }
                    bufferedSourceBuffer.close();
                    size--;
                } finally {
                    bufferedSourceBuffer.close();
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, InterfaceC6471c interfaceC6471c, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            interfaceC6471c = new C6237l(3);
        }
        return openZip(path, fileSystem, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean openZip$lambda$0(ZipEntry it) {
        AbstractC5830k.m5330g(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ZipEntry readCentralDirectoryZipEntry(@NotNull final BufferedSource bufferedSource) throws IOException {
        AbstractC5830k.m5330g(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        long intLe2 = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        int shortLe6 = bufferedSource.readShortLe() & 65535;
        int shortLe7 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe5);
        if (AbstractC5855p.m5373G(utf8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j7 = ref$LongRef2.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (ref$LongRef.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j7 += 8;
        }
        if (ref$LongRef3.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j7 += 8;
        }
        final long j8 = j7;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        readExtra(bufferedSource, shortLe6, new InterfaceC6473e() { // from class: okio.internal.b
            @Override // p152r6.InterfaceC6473e
            public final Object invoke(Object obj, Object obj2) {
                return ZipFilesKt.readCentralDirectoryZipEntry$lambda$8(ref$BooleanRef, j8, ref$LongRef2, bufferedSource, ref$LongRef, ref$LongRef3, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j8 <= 0 || ref$BooleanRef.element) {
            return new ZipEntry(Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null).resolve(utf8), AbstractC5862w.m5414u(utf8, "/", false), bufferedSource.readUtf8(shortLe7), intLe2, ref$LongRef.element, ref$LongRef2.element, shortLe2, ref$LongRef3.element, shortLe4, shortLe3, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element, (Long) ref$ObjectRef3.element, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s readCentralDirectoryZipEntry$lambda$8(Ref$BooleanRef ref$BooleanRef, long j7, Ref$LongRef ref$LongRef, BufferedSource bufferedSource, Ref$LongRef ref$LongRef2, Ref$LongRef ref$LongRef3, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, int i, long j8) throws IOException {
        if (i != 1) {
            if (i == 10) {
                if (j8 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                bufferedSource.skip(4L);
                readExtra(bufferedSource, (int) (j8 - 4), new C6352a(ref$ObjectRef, bufferedSource, ref$ObjectRef2, ref$ObjectRef3));
            }
        } else {
            if (ref$BooleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            ref$BooleanRef.element = true;
            if (j8 < j7) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long longLe = ref$LongRef.element;
            if (longLe == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                longLe = bufferedSource.readLongLe();
            }
            ref$LongRef.element = longLe;
            ref$LongRef2.element = ref$LongRef2.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
            ref$LongRef3.element = ref$LongRef3.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final C5443s readCentralDirectoryZipEntry$lambda$8$lambda$7(Ref$ObjectRef ref$ObjectRef, BufferedSource bufferedSource, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, int i, long j7) throws IOException {
        if (i == 1) {
            if (ref$ObjectRef.element != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j7 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            ref$ObjectRef.element = Long.valueOf(bufferedSource.readLongLe());
            ref$ObjectRef2.element = Long.valueOf(bufferedSource.readLongLe());
            ref$ObjectRef3.element = Long.valueOf(bufferedSource.readLongLe());
        }
        return C5443s.f8405a;
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

    private static final void readExtra(BufferedSource bufferedSource, int i, InterfaceC6473e interfaceC6473e) throws IOException {
        long j7 = i;
        while (j7 != 0) {
            if (j7 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = bufferedSource.readShortLe() & 65535;
            long j8 = j7 - 4;
            if (j8 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            interfaceC6473e.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(AbstractC0037f.m81f(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j7 = j8 - shortLe2;
        }
    }

    @NotNull
    public static final ZipEntry readLocalHeader(@NotNull BufferedSource bufferedSource, @NotNull ZipEntry centralDirectoryZipEntry) throws IOException {
        AbstractC5830k.m5330g(bufferedSource, "<this>");
        AbstractC5830k.m5330g(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        ZipEntry orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, centralDirectoryZipEntry);
        AbstractC5830k.m5327d(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ZipEntry readOrSkipLocalHeader(BufferedSource bufferedSource, ZipEntry zipEntry) throws IOException {
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        bufferedSource.skip(18L);
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(bufferedSource.readShortLe() & 65535);
        if (zipEntry == null) {
            bufferedSource.skip(shortLe2);
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        readExtra(bufferedSource, shortLe2, new C6352a(bufferedSource, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        return zipEntry.copy$okio((Integer) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, (Integer) ref$ObjectRef3.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final C5443s readOrSkipLocalHeader$lambda$10(BufferedSource bufferedSource, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, int i, long j7) throws IOException {
        if (i == HEADER_ID_EXTENDED_TIMESTAMP) {
            if (j7 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b6 = bufferedSource.readByte();
            boolean z8 = (b6 & 1) == 1;
            boolean z9 = (b6 & 2) == 2;
            boolean z10 = (b6 & 4) == 4;
            long j8 = z8 ? 5L : 1L;
            if (z9) {
                j8 += 4;
            }
            if (z10) {
                j8 += 4;
            }
            if (j7 < j8) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z8) {
                ref$ObjectRef.element = Integer.valueOf(bufferedSource.readIntLe());
            }
            if (z9) {
                ref$ObjectRef2.element = Integer.valueOf(bufferedSource.readIntLe());
            }
            if (z10) {
                ref$ObjectRef3.element = Integer.valueOf(bufferedSource.readIntLe());
            }
        }
        return C5443s.f8405a;
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

    public static final void skipLocalHeader(@NotNull BufferedSource bufferedSource) throws IOException {
        AbstractC5830k.m5330g(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
