package okio.internal;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.Path;

@Metadata(m13557d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\u001a\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0080\b\u001a\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0007H\u0080\b\u001a\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u00020\u0007H\u0080\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0007H\u0002\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0007H\u0080\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0007H\u0080\b\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0007H\u0080\b¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0007H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\n*\u00020\u0007H\u0080\b\u001a\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0080\b\u001a\f\u0010\u001a\u001a\u00020\u000f*\u00020\u0007H\u0002\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0007H\u0080\b\u001a\u001d\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0080\b\u001a\u001c\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000fH\u0000\u001a\u0015\u0010 \u001a\u00020\u0007*\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0007*\u00020\u0007H\u0080\b\u001a\u0015\u0010&\u001a\u00020\r*\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010'\u001a\u00020\u000f*\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010(H\u0080\b\u001a\r\u0010)\u001a\u00020\r*\u00020\u0007H\u0080\b\u001a\r\u0010*\u001a\u00020\n*\u00020\u0007H\u0080\b\u001a\u0014\u0010+\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000\u001a\u0014\u0010,\u001a\u00020\u0007*\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000\u001a\f\u0010-\u001a\u00020\u0001*\u00020\nH\u0002\u001a\f\u0010-\u001a\u00020\u0001*\u00020.H\u0002\u001a\u0014\u0010/\u001a\u00020\u000f*\u00020\u001f2\u0006\u0010#\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0014\u001a\u00020\r*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010#\u001a\u0004\u0018\u00010\u0001*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00060"}, m13558d2 = {"SLASH", "Lokio/ByteString;", "BACKSLASH", "ANY_SLASH", "DOT", "DOT_DOT", "commonRoot", "Lokio/Path;", "commonSegments", "", "", "commonSegmentsBytes", "rootLength", "", "commonIsAbsolute", "", "commonIsRelative", "commonVolumeLetter", "", "(Lokio/Path;)Ljava/lang/Character;", "indexOfLastSlash", "getIndexOfLastSlash", "(Lokio/Path;)I", "commonNameBytes", "commonName", "commonParent", "lastSegmentIsDotDot", "commonIsRoot", "commonResolve", "child", "normalize", "Lokio/Buffer;", "commonRelativeTo", "other", "commonNormalized", "slash", "getSlash", "(Lokio/Path;)Lokio/ByteString;", "commonCompareTo", "commonEquals", "", "commonHashCode", "commonToString", "commonToPath", "toPath", "toSlash", "", "startsWithVolumeLetterAndColon", "okio"}, m13559k = 2, m13560mv = {2, 1, 0}, m13562xi = 48)
@JvmName(name = "-Path")
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n53#1,22:406\n203#1:432\n203#1:433\n1563#2:428\n1634#2,3:429\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n47#1:406,22\n193#1:432\n198#1:433\n47#1:428\n47#1:429,3\n*E\n"})
/* renamed from: okio.internal.-Path, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Path {
    private static final ByteString ANY_SLASH;
    private static final ByteString BACKSLASH;
    private static final ByteString DOT;
    private static final ByteString DOT_DOT;
    private static final ByteString SLASH;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        SLASH = companion.encodeUtf8("/");
        BACKSLASH = companion.encodeUtf8("\\");
        ANY_SLASH = companion.encodeUtf8("/\\");
        DOT = companion.encodeUtf8(".");
        DOT_DOT = companion.encodeUtf8("..");
    }

    public static final int commonCompareTo(okio.Path path, okio.Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return path.getBytes().compareTo(other.getBytes());
    }

    public static final boolean commonEquals(okio.Path path, Object obj) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return (obj instanceof okio.Path) && Intrinsics.areEqual(((okio.Path) obj).getBytes(), path.getBytes());
    }

    public static final int commonHashCode(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes().hashCode();
    }

    public static final boolean commonIsAbsolute(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return rootLength(path) == path.getBytes().size();
    }

    public static final String commonName(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.nameBytes().utf8();
    }

    public static final ByteString commonNameBytes(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(path);
        return indexOfLastSlash != -1 ? ByteString.substring$default(path.getBytes(), indexOfLastSlash + 1, 0, 2, null) : (path.volumeLetter() == null || path.getBytes().size() != 2) ? path.getBytes() : ByteString.EMPTY;
    }

    public static final okio.Path commonNormalized(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return okio.Path.INSTANCE.get(path.toString(), true);
    }

    public static final okio.Path commonParent(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (Intrinsics.areEqual(path.getBytes(), DOT) || Intrinsics.areEqual(path.getBytes(), SLASH) || Intrinsics.areEqual(path.getBytes(), BACKSLASH) || lastSegmentIsDotDot(path)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes().size() == 3) {
                return null;
            }
            return new okio.Path(ByteString.substring$default(path.getBytes(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && path.getBytes().startsWith(BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || path.volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new okio.Path(DOT) : indexOfLastSlash == 0 ? new okio.Path(ByteString.substring$default(path.getBytes(), 0, 1, 1, null)) : new okio.Path(ByteString.substring$default(path.getBytes(), 0, indexOfLastSlash, 1, null));
        }
        if (path.getBytes().size() == 2) {
            return null;
        }
        return new okio.Path(ByteString.substring$default(path.getBytes(), 0, 2, 1, null));
    }

    public static final okio.Path commonRelativeTo(okio.Path path, okio.Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(path.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = path.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.areEqual(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && path.getBytes().size() == other.getBytes().size()) {
            return Path.Companion.get$default(okio.Path.INSTANCE, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
        }
        if (Intrinsics.areEqual(other.getBytes(), DOT)) {
            return path;
        }
        Buffer buffer = new Buffer();
        ByteString slash = getSlash(other);
        if (slash == null && (slash = getSlash(path)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(slash);
            i10++;
        }
        return toPath(buffer, false);
    }

    public static final okio.Path commonResolve(okio.Path path, String child, boolean z9) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(child), false), z9);
    }

    public static final okio.Path commonRoot(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            return null;
        }
        return new okio.Path(path.getBytes().substring(0, iRootLength));
    }

    public static final List<String> commonSegments(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        int i10 = 0;
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes().size();
        int i11 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes().substring(i11, iRootLength));
                i11 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i11 < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i11, path.getBytes().size()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(((ByteString) obj).utf8());
        }
        return arrayList2;
    }

    public static final List<ByteString> commonSegmentsBytes(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i10, path.getBytes().size()));
        }
        return arrayList;
    }

    public static final okio.Path commonToPath(String str, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z9);
    }

    public static final String commonToString(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes().utf8();
    }

    public static final Character commonVolumeLetter(okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes(), SLASH, 0, 2, (Object) null) != -1 || path.getBytes().size() < 2 || path.getBytes().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) path.getBytes().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIndexOfLastSlash(okio.Path path) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes(), SLASH, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes(), BACKSLASH, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString getSlash(okio.Path path) {
        ByteString bytes = path.getBytes();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes2 = path.getBytes();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lastSegmentIsDotDot(okio.Path path) {
        return path.getBytes().endsWith(DOT_DOT) && (path.getBytes().size() == 2 || path.getBytes().rangeEquals(path.getBytes().size() + (-3), SLASH, 0, 1) || path.getBytes().rangeEquals(path.getBytes().size() + (-3), BACKSLASH, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootLength(okio.Path path) {
        if (path.getBytes().size() == 0) {
            return -1;
        }
        if (path.getBytes().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes().getByte(0) == 92) {
            if (path.getBytes().size() <= 2 || path.getBytes().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = path.getBytes().indexOf(BACKSLASH, 2);
            return iIndexOf == -1 ? path.getBytes().size() : iIndexOf;
        }
        if (path.getBytes().size() > 2 && path.getBytes().getByte(1) == 58 && path.getBytes().getByte(2) == 92) {
            char c10 = (char) path.getBytes().getByte(0);
            if ('a' <= c10 && c10 < '{') {
                return 3;
            }
            if ('A' <= c10 && c10 < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
        if (!Intrinsics.areEqual(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c10 = (char) buffer.getByte(0L);
        if ('a' > c10 || c10 >= '{') {
            return 'A' <= c10 && c10 < '[';
        }
        return true;
    }

    public static final okio.Path toPath(Buffer buffer, boolean z9) throws EOFException {
        ByteString byteString;
        ByteString byteString2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString slash = null;
        int i10 = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b10 = buffer.readByte();
            if (slash == null) {
                slash = toSlash(b10);
            }
            i10++;
        }
        boolean z10 = i10 >= 2 && Intrinsics.areEqual(slash, byteString);
        if (z10) {
            Intrinsics.checkNotNull(slash);
            buffer2.write(slash);
            buffer2.write(slash);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(slash);
            buffer2.write(slash);
        } else {
            long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (slash == null) {
                slash = jIndexOfElement == -1 ? toSlash(okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(jIndexOfElement));
            }
            if (startsWithVolumeLetterAndColon(buffer, slash)) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        boolean z11 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (jIndexOfElement2 == -1) {
                byteString2 = buffer.readByteString();
            } else {
                byteString2 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (Intrinsics.areEqual(byteString2, byteString3)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z9 || (!z11 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z10 || arrayList.size() != 1) {
                        CollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(byteString2, DOT) && !Intrinsics.areEqual(byteString2, ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                buffer2.write(slash);
            }
            buffer2.write((ByteString) arrayList.get(i11));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new okio.Path(buffer2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString toSlash(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return SLASH;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    public static final okio.Path commonResolve(okio.Path path, ByteString child, boolean z9) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().write(child), false), z9);
    }

    private static final ByteString toSlash(byte b10) {
        if (b10 == 47) {
            return SLASH;
        }
        if (b10 == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    public static final okio.Path commonResolve(okio.Path path, Buffer child, boolean z9) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(child, false), z9);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Path child, boolean z9) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(child)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(child.getBytes());
        return toPath(buffer, z9);
    }
}
