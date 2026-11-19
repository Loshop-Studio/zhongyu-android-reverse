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
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import org.android.agoo.common.AgooConstants;
import p152fd.AbstractC9223a;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10967q0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10980x;
import p325rc.AbstractC10981x0;
import p364uc.AbstractC11382b;

/* loaded from: classes3.dex */
public final class SchemaInfoUtilKt {
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @ColumnInfo.SQLiteTypeAffinity
    public static final int findAffinity(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC9979u.m20293f(upperCase, "toUpperCase(...)");
        if (AbstractC10793c0.m23108U(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (AbstractC10793c0.m23108U(upperCase, "CHAR", false, 2, null) || AbstractC10793c0.m23108U(upperCase, "CLOB", false, 2, null) || AbstractC10793c0.m23108U(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (AbstractC10793c0.m23108U(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (AbstractC10793c0.m23108U(upperCase, "REAL", false, 2, null) || AbstractC10793c0.m23108U(upperCase, "FLOA", false, 2, null) || AbstractC10793c0.m23108U(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set<java.lang.String> parseFtsOptions(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.SchemaInfoUtilKt.parseFtsOptions(java.lang.String):java.util.Set");
    }

    private static final Map<String, TableInfo.Column> readColumns(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            if (!sQLiteStatementPrepare.step()) {
                Map<String, TableInfo.Column> mapM20088h = AbstractC9925a.m20088h();
                AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
                return mapM20088h;
            }
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME);
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "type");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "notnull");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "pk");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "dflt_value");
            Map mapM24036c = AbstractC10967q0.m24036c();
            do {
                String text = sQLiteStatementPrepare.getText(iColumnIndexOf);
                mapM24036c.put(text, new TableInfo.Column(text, sQLiteStatementPrepare.getText(iColumnIndexOf2), sQLiteStatementPrepare.getLong(iColumnIndexOf3) != 0, (int) sQLiteStatementPrepare.getLong(iColumnIndexOf4), sQLiteStatementPrepare.isNull(iColumnIndexOf5) ? null : sQLiteStatementPrepare.getText(iColumnIndexOf5), 2));
            } while (sQLiteStatementPrepare.step());
            Map<String, TableInfo.Column> mapM24035b = AbstractC10967q0.m24035b(mapM24036c);
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return mapM24035b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC9223a.m18142a(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final List<ForeignKeyWithSequence> readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, AgooConstants.MESSAGE_ID);
        int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
        int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_FROM);
        int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_TO);
        List listM24124c = AbstractC10976v.m24124c();
        while (sQLiteStatement.step()) {
            listM24124c.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(iColumnIndexOf), (int) sQLiteStatement.getLong(iColumnIndexOf2), sQLiteStatement.getText(iColumnIndexOf3), sQLiteStatement.getText(iColumnIndexOf4)));
        }
        return AbstractC10947g0.m23912N0(AbstractC10976v.m24122a(listM24124c));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID);
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "seq");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "table");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "on_delete");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "on_update");
            List<ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(sQLiteStatementPrepare);
            sQLiteStatementPrepare.reset();
            Set setM24156b = AbstractC10981x0.m24156b();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.getLong(iColumnIndexOf2) == 0) {
                    int i10 = (int) sQLiteStatementPrepare.getLong(iColumnIndexOf);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((ForeignKeyWithSequence) obj).getId() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ForeignKeyWithSequence foreignKeyWithSequence = (ForeignKeyWithSequence) obj2;
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    setM24156b.add(new TableInfo.ForeignKey(sQLiteStatementPrepare.getText(iColumnIndexOf3), sQLiteStatementPrepare.getText(iColumnIndexOf4), sQLiteStatementPrepare.getText(iColumnIndexOf5), arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> setM24155a = AbstractC10981x0.m24155a(setM24156b);
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return setM24155a;
        } finally {
        }
    }

    public static final Set<String> readFtsColumns(SQLiteConnection connection, String tableName) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        AbstractC9979u.m20294g(tableName, "tableName");
        Set setM24156b = AbstractC10981x0.m24156b();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (sQLiteStatementPrepare.step()) {
                int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, HintConstants.AUTOFILL_HINT_NAME);
                do {
                    setM24156b.add(sQLiteStatementPrepare.getText(iColumnIndexOf));
                } while (sQLiteStatementPrepare.step());
            }
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return AbstractC10981x0.m24155a(setM24156b);
        } finally {
        }
    }

    public static final Set<String> readFtsOptions(SQLiteConnection connection, String tableName) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        AbstractC9979u.m20294g(tableName, "tableName");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
        try {
            String text = sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getText(SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "sql")) : "";
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
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
                List listM23914P0 = AbstractC10947g0.m23914P0(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return AbstractC11382b.m25330d((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
                    }
                });
                ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listM23914P0, 10));
                Iterator it = listM23914P0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM23922X0 = AbstractC10947g0.m23922X0(arrayList);
                List listM23914P02 = AbstractC10947g0.m23914P0(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return AbstractC11382b.m25330d((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
                    }
                });
                ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(listM23914P02, 10));
                Iterator it2 = listM23914P02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, z10, listM23922X0, AbstractC10947g0.m23922X0(arrayList2));
                AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
                return index;
            }
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
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
                Set setM24156b = AbstractC10981x0.m24156b();
                while (sQLiteStatementPrepare.step()) {
                    if (AbstractC9979u.m20289b("c", sQLiteStatementPrepare.getText(iColumnIndexOf2))) {
                        TableInfo.Index index = readIndex(sQLiteConnection, sQLiteStatementPrepare.getText(iColumnIndexOf), sQLiteStatementPrepare.getLong(iColumnIndexOf3) == 1);
                        if (index == null) {
                            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
                            return null;
                        }
                        setM24156b.add(index);
                    }
                }
                Set<TableInfo.Index> setM24155a = AbstractC10981x0.m24155a(setM24156b);
                AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
                return setM24155a;
            }
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(SQLiteConnection connection, String tableName) {
        AbstractC9979u.m20294g(connection, "connection");
        AbstractC9979u.m20294g(tableName, "tableName");
        return new TableInfo(tableName, readColumns(connection, tableName), readForeignKeys(connection, tableName), readIndices(connection, tableName));
    }

    public static final ViewInfo readViewInfo(SQLiteConnection connection, String viewName) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        AbstractC9979u.m20294g(viewName, "viewName");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
        try {
            ViewInfo viewInfo = sQLiteStatementPrepare.step() ? new ViewInfo(sQLiteStatementPrepare.getText(0), sQLiteStatementPrepare.getText(1)) : new ViewInfo(viewName, null);
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return viewInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC9223a.m18142a(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
