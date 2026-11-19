package androidx.room.util;

import androidx.room.util.TableInfo;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8680s;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p168l7.AbstractC9260b;

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
        AbstractC9133u.m16133g(current, "current");
        if (AbstractC9133u.m16128b(current, str)) {
            return true;
        }
        if (!containsSurroundingParenthesis(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return AbstractC9133u.m16128b(AbstractC8661c0.m13982W0(strSubstring).toString(), str);
    }

    public static final boolean equalsCommon(TableInfo tableInfo, Object obj) {
        Set<TableInfo.Index> set;
        AbstractC9133u.m16133g(tableInfo, "<this>");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj;
        if (!AbstractC9133u.m16128b(tableInfo.name, tableInfo2.name) || !AbstractC9133u.m16128b(tableInfo.columns, tableInfo2.columns) || !AbstractC9133u.m16128b(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        Set<TableInfo.Index> set2 = tableInfo.indices;
        if (set2 == null || (set = tableInfo2.indices) == null) {
            return true;
        }
        return AbstractC9133u.m16128b(set2, set);
    }

    public static final String formatString(Collection<?> collection) {
        AbstractC9133u.m16133g(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return AbstractC8680s.m14082j(AbstractC8778f0.m14576v0(collection, ",\n", SignParameters.NEW_LINE, SignParameters.NEW_LINE, 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int hashCodeCommon(TableInfo tableInfo) {
        AbstractC9133u.m16133g(tableInfo, "<this>");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    private static final void joinToStringEndWithIndent(Collection<?> collection) {
        AbstractC8680s.m14082j(AbstractC8778f0.m14576v0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        AbstractC8680s.m14082j(" }", null, 1, null);
    }

    private static final void joinToStringMiddleWithIndent(Collection<?> collection) {
        AbstractC8680s.m14082j(AbstractC8778f0.m14576v0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        AbstractC8680s.m14082j("},", null, 1, null);
    }

    public static final String toStringCommon(TableInfo tableInfo) {
        List listM14771n;
        AbstractC9133u.m16133g(tableInfo, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |TableInfo {\n            |    name = '");
        sb.append(tableInfo.name);
        sb.append("',\n            |    columns = {");
        sb.append(formatString(AbstractC8778f0.m14536M0(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC9260b.m16977d(((TableInfo.Column) t10).name, ((TableInfo.Column) t11).name);
            }
        })));
        sb.append("\n            |    foreignKeys = {");
        sb.append(formatString(tableInfo.foreignKeys));
        sb.append("\n            |    indices = {");
        Set<TableInfo.Index> set = tableInfo.indices;
        if (set == null || (listM14771n = AbstractC8778f0.m14536M0(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC9260b.m16977d(((TableInfo.Index) t10).name, ((TableInfo.Index) t11).name);
            }
        })) == null) {
            listM14771n = AbstractC8809v.m14771n();
        }
        sb.append(formatString(listM14771n));
        sb.append("\n            |}\n        ");
        return AbstractC8680s.m14088p(sb.toString(), null, 1, null);
    }

    public static final int hashCodeCommon(TableInfo.Column column) {
        AbstractC9133u.m16133g(column, "<this>");
        return (((((column.name.hashCode() * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final boolean equalsCommon(TableInfo.Column column, Object obj) {
        AbstractC9133u.m16133g(column, "<this>");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !AbstractC9133u.m16128b(column.name, column2.name) || column.notNull != column2.notNull) {
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
        AbstractC9133u.m16133g(foreignKey, "<this>");
        return (((((((foreignKey.referenceTable.hashCode() * 31) + foreignKey.onDelete.hashCode()) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    public static final int hashCodeCommon(TableInfo.Index index) {
        AbstractC9133u.m16133g(index, "<this>");
        return ((((((AbstractC8687z.m14105M(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null) ? -1184239155 : index.name.hashCode()) * 31) + (index.unique ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    public static final boolean equalsCommon(TableInfo.ForeignKey foreignKey, Object obj) {
        AbstractC9133u.m16133g(foreignKey, "<this>");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj;
        if (AbstractC9133u.m16128b(foreignKey.referenceTable, foreignKey2.referenceTable) && AbstractC9133u.m16128b(foreignKey.onDelete, foreignKey2.onDelete) && AbstractC9133u.m16128b(foreignKey.onUpdate, foreignKey2.onUpdate) && AbstractC9133u.m16128b(foreignKey.columnNames, foreignKey2.columnNames)) {
            return AbstractC9133u.m16128b(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    public static final String toStringCommon(TableInfo.Column column) {
        AbstractC9133u.m16133g(column, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |Column {\n            |   name = '");
        sb.append(column.name);
        sb.append("',\n            |   type = '");
        sb.append(column.type);
        sb.append("',\n            |   affinity = '");
        sb.append(column.affinity);
        sb.append("',\n            |   notNull = '");
        sb.append(column.notNull);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(column.primaryKeyPosition);
        sb.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return AbstractC8680s.m14082j(AbstractC8680s.m14088p(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(TableInfo.Index index, Object obj) {
        AbstractC9133u.m16133g(index, "<this>");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Index)) {
            return false;
        }
        TableInfo.Index index2 = (TableInfo.Index) obj;
        if (index.unique != index2.unique || !AbstractC9133u.m16128b(index.columns, index2.columns) || !AbstractC9133u.m16128b(index.orders, index2.orders)) {
            return false;
        }
        if (AbstractC8687z.m14105M(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null)) {
            return AbstractC8687z.m14105M(index2.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null);
        }
        return AbstractC9133u.m16128b(index.name, index2.name);
    }

    public static final String toStringCommon(TableInfo.ForeignKey foreignKey) {
        AbstractC9133u.m16133g(foreignKey, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(foreignKey.referenceTable);
        sb.append("',\n            |   onDelete = '");
        sb.append(foreignKey.onDelete);
        sb.append("',\n            |   onUpdate = '");
        sb.append(foreignKey.onUpdate);
        sb.append("',\n            |   columnNames = {");
        joinToStringMiddleWithIndent(AbstractC8778f0.m14535L0(foreignKey.columnNames));
        C8736p c8736p = C8736p.f16368a;
        sb.append(c8736p);
        sb.append("\n            |   referenceColumnNames = {");
        joinToStringEndWithIndent(AbstractC8778f0.m14535L0(foreignKey.referenceColumnNames));
        sb.append(c8736p);
        sb.append("\n            |}\n        ");
        return AbstractC8680s.m14082j(AbstractC8680s.m14088p(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final String toStringCommon(TableInfo.Index index) {
        AbstractC9133u.m16133g(index, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |Index {\n            |   name = '");
        sb.append(index.name);
        sb.append("',\n            |   unique = '");
        sb.append(index.unique);
        sb.append("',\n            |   columns = {");
        joinToStringMiddleWithIndent(index.columns);
        C8736p c8736p = C8736p.f16368a;
        sb.append(c8736p);
        sb.append("\n            |   orders = {");
        joinToStringEndWithIndent(index.orders);
        sb.append(c8736p);
        sb.append("\n            |}\n        ");
        return AbstractC8680s.m14082j(AbstractC8680s.m14088p(sb.toString(), null, 1, null), null, 1, null);
    }
}
