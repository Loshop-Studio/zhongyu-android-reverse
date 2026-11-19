package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.core.os.EnvironmentCompat;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p094io.CloseableKt;
import kotlin.text.StringsKt;

@Metadata(m7879d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a#\u0010\b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m7880d2 = {"copyAndClose", "Landroid/database/Cursor;", "c", "getColumnIndex", "", HintConstants.AUTOFILL_HINT_NAME, "", "getColumnIndexOrThrow", "findColumnIndexBySuffix", "cursor", "columnNames", "", "([Ljava/lang/String;Ljava/lang/String;)I", "useCursor", "R", "block", "Lkotlin/Function1;", "(Landroid/database/Cursor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "wrapMappedColumns", "mapping", "", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "room-runtime_release"}, m7881k = 2, m7882mv = {2, 0, 0}, m7884xi = 48)
@JvmName(name = "CursorUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nCursorUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n146#1:178\n13467#2,3:179\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:178\n128#1:179,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor c7) {
        Intrinsics.checkNotNullParameter(c7, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c7.getColumnNames(), c7.getCount());
            while (c7.moveToNext()) {
                Object[] objArr = new Object[c7.getColumnCount()];
                int columnCount = c7.getColumnCount();
                for (int i6 = 0; i6 < columnCount; i6++) {
                    int type = c7.getType(i6);
                    if (type == 0) {
                        objArr[i6] = null;
                    } else if (type == 1) {
                        objArr[i6] = Long.valueOf(c7.getLong(i6));
                    } else if (type == 2) {
                        objArr[i6] = Double.valueOf(c7.getDouble(i6));
                    } else if (type == 3) {
                        objArr[i6] = c7.getString(i6);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i6] = c7.getBlob(i6);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.closeFinally(c7, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        Intrinsics.checkNotNull(columnNames);
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(Cursor c7, String name) {
        Intrinsics.checkNotNullParameter(c7, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c7.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c7.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c7, name);
    }

    public static final int getColumnIndexOrThrow(Cursor c7, String name) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(c7, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c7, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c7.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "getColumnNames(...)");
            strJoinToString$default = ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception unused) {
            strJoinToString$default = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strJoinToString$default);
    }

    public static final <R> R useCursor(Cursor cursor, Function1<? super Cursor, ? extends R> block) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(cursor);
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(cursor, null);
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] columnNames, final int[] mapping) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String columnName) {
                    Intrinsics.checkNotNullParameter(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length) {
                        int i8 = i7 + 1;
                        if (StringsKt.equals(strArr[i6], columnName, true)) {
                            return iArr[i7];
                        }
                        i6++;
                        i7 = i8;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }

    @VisibleForTesting
    public static final int findColumnIndexBySuffix(String[] columnNames, String name) {
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            String str3 = columnNames[i6];
            int i8 = i7 + 1;
            if (str3.length() >= name.length() + 2 && (StringsKt.endsWith$default(str3, str, false, 2, (Object) null) || (str3.charAt(0) == '`' && StringsKt.endsWith$default(str3, str2, false, 2, (Object) null)))) {
                return i7;
            }
            i6++;
            i7 = i8;
        }
        return -1;
    }
}
