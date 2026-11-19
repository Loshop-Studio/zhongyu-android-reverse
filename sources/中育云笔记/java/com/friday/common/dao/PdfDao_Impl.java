package com.friday.common.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.friday.common.dao.PdfDao_Impl;
import com.friday.common.entity.PdfEntity;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.android.agoo.common.AgooConstants;
import p040c2.InterfaceC5225a1;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class PdfDao_Impl implements InterfaceC5225a1 {

    /* renamed from: c */
    public static final C5948a f5837c = new C5948a(null);

    /* renamed from: d */
    public static final int f5838d = 8;

    /* renamed from: a */
    public final RoomDatabase f5839a;

    /* renamed from: b */
    public final EntityInsertAdapter f5840b;

    /* renamed from: com.friday.common.dao.PdfDao_Impl$a */
    public static final class C5948a {
        public /* synthetic */ C5948a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m5067a() {
            return AbstractC10978w.m24136n();
        }

        public C5948a() {
        }
    }

    public PdfDao_Impl(RoomDatabase __db) {
        AbstractC9979u.m20294g(__db, "__db");
        this.f5839a = __db;
        this.f5840b = new EntityInsertAdapter<PdfEntity>() { // from class: com.friday.common.dao.PdfDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, PdfEntity entity) {
                AbstractC9979u.m20294g(statement, "statement");
                AbstractC9979u.m20294g(entity, "entity");
                statement.mo33819bindText(1, entity.getId());
                statement.mo33817bindLong(2, entity.getCurrentPage());
                statement.mo33817bindLong(3, entity.getPageCount());
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `PdfEntity` (`id`,`currentPage`,`pageCount`) VALUES (?,?,?)";
            }
        };
    }

    /* renamed from: e */
    public static final C10786q m5064e(PdfDao_Impl pdfDao_Impl, PdfEntity pdfEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9979u.m20294g(_connection, "_connection");
        pdfDao_Impl.f5840b.insert(_connection, (SQLiteConnection) pdfEntity);
        return C10786q.f26013a;
    }

    /* renamed from: f */
    public static final PdfEntity m5065f(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            return sQLiteStatementPrepare.step() ? new PdfEntity(sQLiteStatementPrepare.getText(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AgooConstants.MESSAGE_ID)), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currentPage")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageCount"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // p040c2.InterfaceC5225a1
    /* renamed from: a */
    public Object mo2803a(final PdfEntity pdfEntity, InterfaceC11588c interfaceC11588c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f5839a, false, true, new InterfaceC9540l() { // from class: c2.b1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return PdfDao_Impl.m5064e(this.f3126c, pdfEntity, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // p040c2.InterfaceC5225a1
    /* renamed from: b */
    public Object mo2804b(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT * FROM PdfEntity WHERE id = ?"; // Exact path lookup; this DAO does not canonicalize the stored key.
        return DBUtil.performSuspending(this.f5839a, true, false, new InterfaceC9540l() { // from class: c2.c1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return PdfDao_Impl.m5065f(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }
}
