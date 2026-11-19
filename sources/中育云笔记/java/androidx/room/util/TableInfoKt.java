package androidx.room.util;

import androidx.room.util.TableInfo;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10812s;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p364uc.AbstractC11382b;

/* loaded from: classes3.dex */
public final class TableInfoKt {
    private static final boolean containsSurroundingParenthesis(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i13 = i12 + 1;
            if (i12 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i11++;
            } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                return false;
            }
            i10++;
            i12 = i13;
        }
        return i11 == 0;
    }

    public static final boolean defaultValueEqualsCommon(String current, String str) {
        AbstractC9979u.m20294g(current, "current");
        if (AbstractC9979u.m20289b(current, str)) {
            return true;
        }
        if (!containsSurroundingParenthesis(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return AbstractC9979u.m20289b(AbstractC10793c0.m23129e1(strSubstring).toString(), str);
    }

    public static final boolean equalsCommon(TableInfo tableInfo, Object obj) {
        Set<TableInfo.Index> set;
        AbstractC9979u.m20294g(tableInfo, "<this>");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj;
        if (!AbstractC9979u.m20289b(tableInfo.name, tableInfo2.name) || !AbstractC9979u.m20289b(tableInfo.columns, tableInfo2.columns) || !AbstractC9979u.m20289b(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        Set<TableInfo.Index> set2 = tableInfo.indices;
        if (set2 == null || (set = tableInfo2.indices) == null) {
            return true;
        }
        return AbstractC9979u.m20289b(set2, set);
    }

    public static final String formatString(Collection<?> collection) {
        AbstractC9979u.m20294g(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return AbstractC10812s.m23217j(AbstractC10947g0.m23954w0(collection, ",\n", SignParameters.NEW_LINE, SignParameters.NEW_LINE, 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int hashCodeCommon(TableInfo tableInfo) {
        AbstractC9979u.m20294g(tableInfo, "<this>");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    private static final void joinToStringEndWithIndent(Collection<?> collection) {
        AbstractC10812s.m23217j(AbstractC10947g0.m23954w0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        AbstractC10812s.m23217j(" }", null, 1, null);
    }

    private static final void joinToStringMiddleWithIndent(Collection<?> collection) {
        AbstractC10812s.m23217j(AbstractC10947g0.m23954w0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        AbstractC10812s.m23217j("},", null, 1, null);
    }

    public static final String toStringCommon(TableInfo tableInfo) {
        List listM24136n;
        AbstractC9979u.m20294g(tableInfo, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(tableInfo.name);
        sb2.append("',\n            |    columns = {");
        sb2.append(formatString(AbstractC10947g0.m23914P0(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC11382b.m25330d(((TableInfo.Column) t10).name, ((TableInfo.Column) t11).name);
            }
        })));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(formatString(tableInfo.foreignKeys));
        sb2.append("\n            |    indices = {");
        Set<TableInfo.Index> set = tableInfo.indices;
        if (set == null || (listM24136n = AbstractC10947g0.m23914P0(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC11382b.m25330d(((TableInfo.Index) t10).name, ((TableInfo.Index) t11).name);
            }
        })) == null) {
            listM24136n = AbstractC10978w.m24136n();
        }
        sb2.append(formatString(listM24136n));
        sb2.append("\n            |}\n        ");
        return AbstractC10812s.m23223p(sb2.toString(), null, 1, null);
    }

    public static final int hashCodeCommon(TableInfo.Column column) {
        AbstractC9979u.m20294g(column, "<this>");
        return (((((column.name.hashCode() * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final boolean equalsCommon(TableInfo.Column column, Object obj) {
        AbstractC9979u.m20294g(column, "<this>");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !AbstractC9979u.m20289b(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        String str = column.defaultValue;
        String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !defaultValueEqualsCommon(str, str2)) {
            return false;
        }
        if (column.createdFrom == 2 && column2.createdFrom == 1 && str2 != null && !defaultValueEqualsCommon(str2, str)) {
            return false;
        }
        int i10 = column.createdFrom;
        return (i10 == 0 || i10 != column2.createdFrom || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && column.affinity == column2.affinity;
    }

    public static final int hashCodeCommon(TableInfo.ForeignKey foreignKey) {
        AbstractC9979u.m20294g(foreignKey, "<this>");
        return (((((((foreignKey.referenceTable.hashCode() * 31) + foreignKey.onDelete.hashCode()) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    public static final int hashCodeCommon(TableInfo.Index index) {
        AbstractC9979u.m20294g(index, "<this>");
        return ((((((AbstractC10819z.m23242O(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null) ? -1184239155 : index.name.hashCode()) * 31) + (index.unique ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    public static final boolean equalsCommon(TableInfo.ForeignKey foreignKey, Object obj) {
        AbstractC9979u.m20294g(foreignKey, "<this>");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj;
        if (AbstractC9979u.m20289b(foreignKey.referenceTable, foreignKey2.referenceTable) && AbstractC9979u.m20289b(foreignKey.onDelete, foreignKey2.onDelete) && AbstractC9979u.m20289b(foreignKey.onUpdate, foreignKey2.onUpdate) && AbstractC9979u.m20289b(foreignKey.columnNames, foreignKey2.columnNames)) {
            return AbstractC9979u.m20289b(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    public static final String toStringCommon(TableInfo.Column column) {
        AbstractC9979u.m20294g(column, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Column {\n            |   name = '");
        sb2.append(column.name);
        sb2.append("',\n            |   type = '");
        sb2.append(column.type);
        sb2.append("',\n            |   affinity = '");
        sb2.append(column.affinity);
        sb2.append("',\n            |   notNull = '");
        sb2.append(column.notNull);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(column.primaryKeyPosition);
        sb2.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return AbstractC10812s.m23217j(AbstractC10812s.m23223p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(TableInfo.Index index, Object obj) {
        AbstractC9979u.m20294g(index, "<this>");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Index)) {
            return false;
        }
        TableInfo.Index index2 = (TableInfo.Index) obj;
        if (index.unique != index2.unique || !AbstractC9979u.m20289b(index.columns, index2.columns) || !AbstractC9979u.m20289b(index.orders, index2.orders)) {
            return false;
        }
        if (AbstractC10819z.m23242O(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null)) {
            return AbstractC10819z.m23242O(index2.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null);
        }
        return AbstractC9979u.m20289b(index.name, index2.name);
    }

    public static final String toStringCommon(TableInfo.ForeignKey foreignKey) {
        AbstractC9979u.m20294g(foreignKey, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(foreignKey.referenceTable);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(foreignKey.onDelete);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(foreignKey.onUpdate);
        sb2.append("',\n            |   columnNames = {");
        joinToStringMiddleWithIndent(AbstractC10947g0.m23912N0(foreignKey.columnNames));
        C10786q c10786q = C10786q.f26013a;
        sb2.append(c10786q);
        sb2.append("\n            |   referenceColumnNames = {");
        joinToStringEndWithIndent(AbstractC10947g0.m23912N0(foreignKey.referenceColumnNames));
        sb2.append(c10786q);
        sb2.append("\n            |}\n        ");
        return AbstractC10812s.m23217j(AbstractC10812s.m23223p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String toStringCommon(TableInfo.Index index) {
        AbstractC9979u.m20294g(index, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Index {\n            |   name = '");
        sb2.append(index.name);
        sb2.append("',\n            |   unique = '");
        sb2.append(index.unique);
        sb2.append("',\n            |   columns = {");
        joinToStringMiddleWithIndent(index.columns);
        C10786q c10786q = C10786q.f26013a;
        sb2.append(c10786q);
        sb2.append("\n            |   orders = {");
        joinToStringEndWithIndent(index.orders);
        sb2.append(c10786q);
        sb2.append("\n            |}\n        ");
        return AbstractC10812s.m23217j(AbstractC10812s.m23223p(sb2.toString(), null, 1, null), null, 1, null);
    }
}
