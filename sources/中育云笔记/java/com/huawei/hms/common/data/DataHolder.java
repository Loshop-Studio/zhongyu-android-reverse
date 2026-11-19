package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";

    /* renamed from: c */
    public boolean f11493c;

    /* renamed from: d */
    public int f11494d;

    /* renamed from: e */
    public String[] f11495e;

    /* renamed from: f */
    public Bundle f11496f;

    /* renamed from: g */
    public CursorWindow[] f11497g;

    /* renamed from: h */
    public int f11498h;

    /* renamed from: i */
    public Bundle f11499i;

    /* renamed from: j */
    public int[] f11500j;

    /* renamed from: k */
    public int f11501k;

    /* renamed from: l */
    public boolean f11502l;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();

    /* renamed from: m */
    public static final Builder f11492m = new DataHolderBuilderCreator(new String[0], null);

    public static class Builder {

        /* renamed from: a */
        public String[] f11503a;

        /* renamed from: b */
        public final ArrayList f11504b;

        /* renamed from: c */
        public final String f11505c;

        /* renamed from: d */
        public final HashMap f11506d;

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i10) {
            return new DataHolder(this, i10, (Bundle) null);
        }

        public Builder setDataForContentValuesHashMap(HashMap<String, Object> map) {
            int iIntValue;
            boolean z10;
            Object obj;
            Preconditions.checkNotNull(map, "contentValuesHashMap cannot be null");
            String str = this.f11505c;
            if (str == null || (obj = map.get(str)) == null) {
                iIntValue = 0;
                z10 = false;
            } else {
                Integer num = (Integer) this.f11506d.get(obj);
                if (num != null) {
                    iIntValue = num.intValue();
                    z10 = true;
                } else {
                    this.f11506d.put(obj, Integer.valueOf(this.f11504b.size()));
                    iIntValue = 0;
                    z10 = false;
                }
            }
            if (!z10) {
                this.f11504b.add(map);
                return this;
            }
            this.f11504b.remove(iIntValue);
            this.f11504b.add(iIntValue, map);
            return this;
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> map = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(map);
        }

        public Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.f11503a = strArr;
            this.f11504b = new ArrayList();
            this.f11505c = str;
            this.f11506d = new HashMap();
        }

        public DataHolder build(int i10, Bundle bundle) {
            return new DataHolder(this, i10, bundle, -1);
        }

        public Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    /* renamed from: c */
    public static CursorWindow[] m8449c(Builder builder, int i10) {
        if (builder.f11503a.length == 0) {
            return new CursorWindow[0];
        }
        if (i10 < 0 || i10 >= builder.f11504b.size()) {
            i10 = builder.f11504b.size();
        }
        ArrayList arrayListM8451i = m8451i(builder, i10, builder.f11504b.subList(0, i10));
        return (CursorWindow[]) arrayListM8451i.toArray(new CursorWindow[arrayListM8451i.size()]);
    }

    public static DataHolder empty(int i10) {
        return new DataHolder(f11492m, i10, (Bundle) null);
    }

    /* renamed from: g */
    public static CursorWindow[] m8450g(HMSCursorWrapper hMSCursorWrapper) {
        int numRows;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                numRows = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                numRows = window.getNumRows();
            }
            arrayList.addAll(m8452j(hMSCursorWrapper, numRows, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            try {
                HMSLog.m8725e("DataHolder", "fail to getCursorWindows: " + th.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    /* renamed from: i */
    public static ArrayList m8451i(Builder builder, int i10, List list) {
        CursorWindow cursorWindow;
        boolean zM8453k;
        ArrayList arrayList = new ArrayList();
        CursorWindow cursorWindow2 = new CursorWindow((String) null);
        cursorWindow2.setNumColumns(builder.f11503a.length);
        arrayList.add(cursorWindow2);
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                if (!cursorWindow2.allocRow()) {
                    HMSLog.m8722d("DataHolder", "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    try {
                        cursorWindow.setStartPosition(i11);
                        cursorWindow.setNumColumns(builder.f11503a.length);
                        if (!cursorWindow.allocRow()) {
                            HMSLog.m8725e("DataHolder", "Failed to retry to allocate a row");
                            break;
                        }
                        arrayList.add(cursorWindow);
                        cursorWindow2 = cursorWindow;
                    } catch (RuntimeException unused) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            ((CursorWindow) obj).close();
                        }
                        HMSLog.m8728w("DataHolder", "iter CursorWindow failed, RuntimeException occured.");
                        cursorWindow2 = cursorWindow;
                    }
                }
                HashMap map = (HashMap) list.get(i11);
                zM8453k = true;
                for (int i13 = 0; i13 < builder.f11503a.length && (zM8453k = m8453k(cursorWindow2, map.get(builder.f11503a[i13]), i11, i13)); i13++) {
                }
            } catch (RuntimeException unused2) {
                cursorWindow = cursorWindow2;
            }
            if (!zM8453k) {
                HMSLog.m8722d("DataHolder", "fail to put data for row " + i11);
                cursorWindow2.freeLastRow();
                CursorWindow cursorWindow3 = new CursorWindow((String) null);
                cursorWindow3.setStartPosition(i11);
                cursorWindow3.setNumColumns(builder.f11503a.length);
                arrayList.add(cursorWindow3);
                break;
            }
            continue;
        }
        return arrayList;
    }

    /* renamed from: j */
    public static ArrayList m8452j(HMSCursorWrapper hMSCursorWrapper, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11 && hMSCursorWrapper.moveToPosition(i10)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i10);
                hMSCursorWrapper.fillWindow(i10, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i10 = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    /* renamed from: k */
    public static boolean m8453k(CursorWindow cursorWindow, Object obj, int i10, int i11) {
        if (obj == null) {
            return cursorWindow.putNull(i10, i11);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i10, i11);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i10, i11);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i10, i11);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i10, i11);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i10, i11);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i10, i11);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i10, i11);
        }
        throw new IllegalArgumentException("unsupported type for column: " + obj);
    }

    /* renamed from: a */
    public final void m8454a(String str, int i10) {
        String str2;
        Bundle bundle = this.f11496f;
        if (bundle == null || !bundle.containsKey(str)) {
            str2 = "cannot find column: " + str;
        } else if (isClosed()) {
            str2 = "buffer has been closed";
        } else if (i10 < 0 || i10 >= this.f11501k) {
            str2 = "row is out of index:" + i10;
        } else {
            str2 = "";
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!this.f11493c) {
                for (CursorWindow cursorWindow : this.f11497g) {
                    cursorWindow.close();
                }
                this.f11493c = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void collectColumsAndCount() {
        this.f11496f = new Bundle();
        String[] strArr = this.f11495e;
        int i10 = 0;
        if (strArr == null || strArr.length == 0) {
            this.f11501k = 0;
            return;
        }
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f11495e;
            if (i11 >= strArr2.length) {
                break;
            }
            this.f11496f.putInt(strArr2[i11], i11);
            i11++;
        }
        CursorWindow[] cursorWindowArr = this.f11497g;
        if (cursorWindowArr == null || cursorWindowArr.length == 0) {
            this.f11501k = 0;
            return;
        }
        this.f11500j = new int[cursorWindowArr.length];
        int startPosition = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = this.f11497g;
            if (i10 >= cursorWindowArr2.length) {
                this.f11501k = startPosition;
                return;
            } else {
                this.f11500j[i10] = startPosition;
                startPosition = cursorWindowArr2[i10].getStartPosition() + this.f11497g[i10].getNumRows();
                i10++;
            }
        }
    }

    public final void copyToBuffer(String str, int i10, int i11, CharArrayBuffer charArrayBuffer) {
        m8454a(str, i10);
        this.f11497g[i11].copyStringToBuffer(i10, this.f11496f.getInt(str), charArrayBuffer);
    }

    public final void finalize() throws Throwable {
        if (this.f11502l && this.f11497g.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.f11501k;
    }

    public final Bundle getMetadata() {
        return this.f11499i;
    }

    public final int getStatusCode() {
        return this.f11498h;
    }

    public final Object getValue(String str, int i10, int i11, String str2) {
        str2.getClass();
        switch (str2) {
            case "type_float":
                m8454a(str, i10);
                return Float.valueOf(this.f11497g[i11].getFloat(i10, this.f11496f.getInt(str)));
            case "type_boolean":
                m8454a(str, i10);
                return Boolean.valueOf(this.f11497g[i11].getLong(i10, this.f11496f.getInt(str)) == 1);
            case "type_int":
                m8454a(str, i10);
                return Integer.valueOf(this.f11497g[i11].getInt(i10, this.f11496f.getInt(str)));
            case "type_double":
                m8454a(str, i10);
                return Double.valueOf(this.f11497g[i11].getDouble(i10, this.f11496f.getInt(str)));
            case "type_long":
                m8454a(str, i10);
                return Long.valueOf(this.f11497g[i11].getLong(i10, this.f11496f.getInt(str)));
            case "type_string":
                m8454a(str, i10);
                return this.f11497g[i11].getString(i10, this.f11496f.getInt(str));
            case "type_byte_array":
                m8454a(str, i10);
                return this.f11497g[i11].getBlob(i10, this.f11496f.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i10) {
        int[] iArr;
        int i11 = 0;
        Preconditions.checkArgument(i10 >= 0 || i10 < this.f11501k, "rowIndex is out of index:" + i10);
        while (true) {
            iArr = this.f11500j;
            if (i11 >= iArr.length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == iArr.length ? i11 - 1 : i11;
    }

    public final boolean hasColumn(String str) {
        return this.f11496f.containsKey(str);
    }

    public final boolean hasNull(String str, int i10, int i11) {
        m8454a(str, i10);
        return this.f11497g[i11].getType(i10, this.f11496f.getInt(str)) == 0;
    }

    public final synchronized boolean isClosed() {
        return this.f11493c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (parcel == null) {
            return;
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.f11495e, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f11497g, i10, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f11494d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f11493c = false;
        this.f11502l = true;
        this.f11494d = i10;
        this.f11495e = strArr;
        this.f11497g = cursorWindowArr;
        this.f11498h = i11;
        this.f11499i = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.f11493c = false;
        this.f11502l = true;
        this.f11494d = 1;
        this.f11495e = strArr;
        this.f11497g = cursorWindowArr;
        this.f11498h = i10;
        this.f11499i = bundle;
        collectColumsAndCount();
    }

    public DataHolder(HMSCursorWrapper hMSCursorWrapper, int i10, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), m8450g(hMSCursorWrapper), i10, bundle);
    }

    public DataHolder(Cursor cursor, int i10, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i10, bundle);
    }

    public DataHolder(Builder builder, int i10, Bundle bundle) {
        this(builder.f11503a, m8449c(builder, -1), i10, (Bundle) null);
    }

    public DataHolder(Builder builder, int i10, Bundle bundle, int i11) {
        this(builder.f11503a, m8449c(builder, -1), i10, bundle);
    }
}
