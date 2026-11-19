package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class PdfDao_Impl implements PdfDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<PdfEntity> __insertAdapterOfPdfEntity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final List<InterfaceC8375c> getRequiredConverters() {
            return AbstractC8809v.m14771n();
        }

        private Companion() {
        }
    }

    public PdfDao_Impl(RoomDatabase __db) {
        AbstractC9133u.m16133g(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfPdfEntity = new EntityInsertAdapter<PdfEntity>() { // from class: com.zykj.study.data.PdfDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `PdfEntity` (`id`,`currentPage`,`pageCount`) VALUES (?,?,?)";
            }

            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, PdfEntity entity) {
                AbstractC9133u.m16133g(statement, "statement");
                AbstractC9133u.m16133g(entity, "entity");
                statement.mo27224bindText(1, entity.getId());
                statement.mo27222bindLong(2, entity.getCurrentPage());
                statement.mo27222bindLong(3, entity.getPageCount());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p insertPdf$lambda$0(PdfDao_Impl pdfDao_Impl, PdfEntity pdfEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9133u.m16133g(_connection, "_connection");
        pdfDao_Impl.__insertAdapterOfPdfEntity.insert(_connection, (SQLiteConnection) pdfEntity);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PdfEntity queryPdf$lambda$1(String str, String str2, SQLiteConnection _connection) {
        AbstractC9133u.m16133g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo27224bindText(1, str2);
            return sQLiteStatementPrepare.step() ? new PdfEntity(sQLiteStatementPrepare.getText(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currentPage")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageCount"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.zykj.study.data.PdfDao
    public Object insertPdf(final PdfEntity pdfEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new InterfaceC10570l() { // from class: com.zykj.study.data.b1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return PdfDao_Impl.insertPdf$lambda$0(this.f11033a, pdfEntity, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
        return objPerformSuspending == AbstractC9434a.m17291f() ? objPerformSuspending : C8736p.f16368a;
    }

    @Override // com.zykj.study.data.PdfDao
    public Object queryPdf(final String str, InterfaceC9324c<? super PdfEntity> interfaceC9324c) {
        final String str2 = "SELECT * FROM PdfEntity WHERE id = ?"; // Exact path lookup; this DAO does not canonicalize the stored key.
        return DBUtil.performSuspending(this.__db, true, false, new InterfaceC10570l() { // from class: com.zykj.study.data.a1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return PdfDao_Impl.queryPdf$lambda$1(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }
}
