package com.zykj.huiwei.launcher.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.zykj.huiwei.launcher.dao.PreviewDao_Impl;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p156t3.InterfaceC7725b;

/* loaded from: classes4.dex */
public final class PreviewDao_Impl implements InterfaceC7725b {

    /* renamed from: c */
    public static final C6049a f6071c = new C6049a(null);

    /* renamed from: d */
    public static final int f6072d = 8;

    /* renamed from: a */
    public final RoomDatabase f6073a;

    /* renamed from: b */
    public final EntityInsertAdapter f6074b;

    /* renamed from: com.zykj.huiwei.launcher.dao.PreviewDao_Impl$a */
    public static final class C6049a {
        public /* synthetic */ C6049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m5307a() {
            return CollectionsKt.emptyList();
        }

        public C6049a() {
        }
    }

    public PreviewDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f6073a = __db;
        this.f6074b = new EntityInsertAdapter<PDFPreviewInfo>() { // from class: com.zykj.huiwei.launcher.dao.PreviewDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, PDFPreviewInfo entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo17004bindText(1, entity.getPath());
                statement.mo17002bindLong(2, entity.getPageIndex());
                statement.mo17001bindDouble(3, entity.getPageOffset());
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `previewInfo` (`path`,`pageIndex`,`pageOffset`) VALUES (?,?,?)";
            }
        };
    }

    /* renamed from: e */
    public static final PDFPreviewInfo m5302e(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo17004bindText(1, str2);
            return sQLiteStatementPrepare.step() ? new PDFPreviewInfo(sQLiteStatementPrepare.getText(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "path")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageIndex")), (float) sQLiteStatementPrepare.getDouble(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pageOffset"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: f */
    public static final Unit m5303f(PreviewDao_Impl previewDao_Impl, PDFPreviewInfo pDFPreviewInfo, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        previewDao_Impl.f6074b.insert(_connection, (SQLiteConnection) pDFPreviewInfo);
        return Unit.INSTANCE;
    }

    @Override // p156t3.InterfaceC7725b
    /* renamed from: a */
    public PDFPreviewInfo mo5304a(final String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        final String str = "SELECT * FROM previewInfo WHERE path = ?";
        return (PDFPreviewInfo) DBUtil.performBlocking(this.f6073a, true, false, new Function1() { // from class: t3.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDao_Impl.m5302e(str, path, (SQLiteConnection) obj);
            }
        });
    }

    @Override // p156t3.InterfaceC7725b
    /* renamed from: b */
    public void mo5305b(final PDFPreviewInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        DBUtil.performBlocking(this.f6073a, false, true, new Function1() { // from class: t3.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDao_Impl.m5303f(this.f10206a, info, (SQLiteConnection) obj);
            }
        });
    }
}
