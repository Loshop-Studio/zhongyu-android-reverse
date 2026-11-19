package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.ColumnInfo;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8798p0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8810v0;
import p134i7.AbstractC8811w;
import p168l7.AbstractC9260b;
import p278v7.AbstractC10251a;

/* loaded from: classes3.dex */
public final class SchemaInfoUtilKt {
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @ColumnInfo.SQLiteTypeAffinity
    public static final int findAffinity(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC9133u.m16132f(upperCase, "toUpperCase(...)");
        if (AbstractC8661c0.m13973S(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (AbstractC8661c0.m13973S(upperCase, "CHAR", false, 2, null) || AbstractC8661c0.m13973S(upperCase, "CLOB", false, 2, null) || AbstractC8661c0.m13973S(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (AbstractC8661c0.m13973S(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (AbstractC8661c0.m13973S(upperCase, "REAL", false, 2, null) || AbstractC8661c0.m13973S(upperCase, "FLOA", false, 2, null) || AbstractC8661c0.m13973S(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set<java.lang.String> parseFtsOptions(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.SchemaInfoUtilKt.parseFtsOptions(java.lang.String):java.util.Set");
    }

    private static final Map<String, TableInfo.Column> readColumns(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            if (!sQLiteStatementPrepare.step()) {
                Map<String, TableInfo.Column> mapM15943h = AbstractC9080a.m15943h();
                AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
                return mapM15943h;
            }
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME);
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "type");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "notnull");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "pk");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "dflt_value");
            Map mapM14661c = AbstractC8798p0.m14661c();
            do {
                String text = sQLiteStatementPrepare.getText(iColumnIndexOf);
                mapM14661c.put(text, new TableInfo.Column(text, sQLiteStatementPrepare.getText(iColumnIndexOf2), sQLiteStatementPrepare.getLong(iColumnIndexOf3) != 0, (int) sQLiteStatementPrepare.getLong(iColumnIndexOf4), sQLiteStatementPrepare.isNull(iColumnIndexOf5) ? null : sQLiteStatementPrepare.getText(iColumnIndexOf5), 2));
            } while (sQLiteStatementPrepare.step());
            Map<String, TableInfo.Column> mapM14660b = AbstractC8798p0.m14660b(mapM14661c);
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return mapM14660b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC10251a.m19205a(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final List<ForeignKeyWithSequence> readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
        int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
        int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_FROM);
        int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_TO);
        List listM14753c = AbstractC8807u.m14753c();
        while (sQLiteStatement.step()) {
            listM14753c.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(iColumnIndexOf), (int) sQLiteStatement.getLong(iColumnIndexOf2), sQLiteStatement.getText(iColumnIndexOf3), sQLiteStatement.getText(iColumnIndexOf4)));
        }
        return AbstractC8778f0.m14535L0(AbstractC8807u.m14751a(listM14753c));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "id");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "seq");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "table");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "on_delete");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "on_update");
            List<ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(sQLiteStatementPrepare);
            sQLiteStatementPrepare.reset();
            Set setM14782b = AbstractC8810v0.m14782b();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.getLong(iColumnIndexOf2) == 0) {
                    int i10 = (int) sQLiteStatementPrepare.getLong(iColumnIndexOf);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((ForeignKeyWithSequence) obj).getId() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    setM14782b.add(new TableInfo.ForeignKey(sQLiteStatementPrepare.getText(iColumnIndexOf3), sQLiteStatementPrepare.getText(iColumnIndexOf4), sQLiteStatementPrepare.getText(iColumnIndexOf5), arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> setM14781a = AbstractC8810v0.m14781a(setM14782b);
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return setM14781a;
        } finally {
        }
    }

    public static final Set<String> readFtsColumns(SQLiteConnection connection, String tableName) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(tableName, "tableName");
        Set setM14782b = AbstractC8810v0.m14782b();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (sQLiteStatementPrepare.step()) {
                int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME);
                do {
                    setM14782b.add(sQLiteStatementPrepare.getText(iColumnIndexOf));
                } while (sQLiteStatementPrepare.step());
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return AbstractC8810v0.m14781a(setM14782b);
        } finally {
        }
    }

    public static final Set<String> readFtsOptions(SQLiteConnection connection, String tableName) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(tableName, "tableName");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
        try {
            String text = sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getText(SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "sql")) : "";
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return parseFtsOptions(text);
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SQLiteConnection sQLiteConnection, String str, boolean z10) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "seqno");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "cid");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME);
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "desc");
            if (iColumnIndexOf != -1 && iColumnIndexOf2 != -1 && iColumnIndexOf3 != -1 && iColumnIndexOf4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (sQLiteStatementPrepare.step()) {
                    if (((int) sQLiteStatementPrepare.getLong(iColumnIndexOf2)) >= 0) {
                        int i10 = (int) sQLiteStatementPrepare.getLong(iColumnIndexOf);
                        String text = sQLiteStatementPrepare.getText(iColumnIndexOf3);
                        String str2 = sQLiteStatementPrepare.getLong(iColumnIndexOf4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), text);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listM14536M0 = AbstractC8778f0.m14536M0(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return AbstractC9260b.m16977d((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
                    }
                });
                ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM14536M0, 10));
                Iterator it = listM14536M0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM14544U0 = AbstractC8778f0.m14544U0(arrayList);
                List listM14536M02 = AbstractC8778f0.m14536M0(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return AbstractC9260b.m16977d((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
                    }
                });
                ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(listM14536M02, 10));
                Iterator it2 = listM14536M02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, z10, listM14544U0, AbstractC8778f0.m14544U0(arrayList2));
                AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
                return index;
            }
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA index_list(`" + str + "`)");
        try {
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME);
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, OSSHeaders.ORIGIN);
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "unique");
            if (iColumnIndexOf != -1 && iColumnIndexOf2 != -1 && iColumnIndexOf3 != -1) {
                Set setM14782b = AbstractC8810v0.m14782b();
                while (sQLiteStatementPrepare.step()) {
                    if (AbstractC9133u.m16128b("c", sQLiteStatementPrepare.getText(iColumnIndexOf2))) {
                        TableInfo.Index index = readIndex(sQLiteConnection, sQLiteStatementPrepare.getText(iColumnIndexOf), sQLiteStatementPrepare.getLong(iColumnIndexOf3) == 1);
                        if (index == null) {
                            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
                            return null;
                        }
                        setM14782b.add(index);
                    }
                }
                Set<TableInfo.Index> setM14781a = AbstractC8810v0.m14781a(setM14782b);
                AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
                return setM14781a;
            }
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(SQLiteConnection connection, String tableName) {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(tableName, "tableName");
        return new TableInfo(tableName, readColumns(connection, tableName), readForeignKeys(connection, tableName), readIndices(connection, tableName));
    }

    public static final ViewInfo readViewInfo(SQLiteConnection connection, String viewName) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(viewName, "viewName");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
        try {
            ViewInfo viewInfo = sQLiteStatementPrepare.step() ? new ViewInfo(sQLiteStatementPrepare.getText(0), sQLiteStatementPrepare.getText(1)) : new ViewInfo(viewName, null);
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return viewInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC10251a.m19205a(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
