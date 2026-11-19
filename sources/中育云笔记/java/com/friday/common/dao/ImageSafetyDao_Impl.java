package com.friday.common.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.friday.common.dao.ImageSafetyDao_Impl;
import com.friday.common.entity.ImageSafetyEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5308v0;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ImageSafetyDao_Impl implements InterfaceC5308v0 {

    /* renamed from: c */
    public static final C5946a f5833c = new C5946a(null);

    /* renamed from: d */
    public static final int f5834d = 8;

    /* renamed from: a */
    public final RoomDatabase f5835a;

    /* renamed from: b */
    public final EntityInsertAdapter f5836b;

    /* renamed from: com.friday.common.dao.ImageSafetyDao_Impl$a */
    public static final class C5946a {
        public /* synthetic */ C5946a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m5061a() {
            return AbstractC10978w.m24136n();
        }

        public C5946a() {
        }
    }

    public ImageSafetyDao_Impl(RoomDatabase __db) {
        AbstractC9979u.m20294g(__db, "__db");
        this.f5835a = __db;
        this.f5836b = new EntityInsertAdapter<ImageSafetyEntity>() { // from class: com.friday.common.dao.ImageSafetyDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SQLiteStatement statement, ImageSafetyEntity entity) {
                AbstractC9979u.m20294g(statement, "statement");
                AbstractC9979u.m20294g(entity, "entity");
                statement.mo33819bindText(1, entity.getImageId());
                statement.mo33817bindLong(2, entity.getRiskScore());
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ImageSafetyEntity` (`imageId`,`riskScore`) VALUES (?,?)";
            }
        };
    }

    /* renamed from: i */
    public static final C10786q m5056i(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return C10786q.f26013a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* renamed from: j */
    public static final List m5057j(String str, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "imageId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "riskScore");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new ImageSafetyEntity(sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: k */
    public static final Integer m5058k(String str, String str2, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo33819bindText(1, str2);
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
            }
            return numValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* renamed from: l */
    public static final C10786q m5059l(ImageSafetyDao_Impl imageSafetyDao_Impl, ImageSafetyEntity imageSafetyEntity, SQLiteConnection _connection) throws Exception {
        AbstractC9979u.m20294g(_connection, "_connection");
        imageSafetyDao_Impl.f5836b.insert(_connection, (SQLiteConnection) imageSafetyEntity);
        return C10786q.f26013a;
    }

    @Override // p040c2.InterfaceC5308v0
    /* renamed from: a */
    public Object mo2812a(final ImageSafetyEntity imageSafetyEntity, InterfaceC11588c interfaceC11588c) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f5835a, false, true, new InterfaceC9540l() { // from class: c2.w0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ImageSafetyDao_Impl.m5059l(this.f3348c, imageSafetyEntity, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // p040c2.InterfaceC5308v0
    /* renamed from: b */
    public Object mo2813b(InterfaceC11588c interfaceC11588c) {
        final String str = "SELECT * FROM ImageSafetyEntity";
        return DBUtil.performSuspending(this.f5835a, true, false, new InterfaceC9540l() { // from class: c2.z0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ImageSafetyDao_Impl.m5057j(str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    @Override // p040c2.InterfaceC5308v0
    /* renamed from: c */
    public Object mo2814c(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "DELETE FROM ImageSafetyEntity WHERE imageId=?";
        Object objPerformSuspending = DBUtil.performSuspending(this.f5835a, false, true, new InterfaceC9540l() { // from class: c2.x0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ImageSafetyDao_Impl.m5056i(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
        return objPerformSuspending == AbstractC11725a.m25952f() ? objPerformSuspending : C10786q.f26013a;
    }

    @Override // p040c2.InterfaceC5308v0
    /* renamed from: d */
    public Object mo2815d(final String str, InterfaceC11588c interfaceC11588c) {
        final String str2 = "SELECT riskScore From ImageSafetyEntity where imageId =?";
        return DBUtil.performSuspending(this.f5835a, true, false, new InterfaceC9540l() { // from class: c2.y0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ImageSafetyDao_Impl.m5058k(str2, str, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }
}
