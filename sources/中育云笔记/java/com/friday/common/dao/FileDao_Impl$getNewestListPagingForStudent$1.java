package com.friday.common.dao;

import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.friday.common.dao.FileDao_Impl$getNewestListPagingForStudent$1;
import com.friday.common.entity.FileEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class FileDao_Impl$getNewestListPagingForStudent$1 extends LimitOffsetPagingSource<FileEntity> {

    /* renamed from: a */
    public final /* synthetic */ FileDao_Impl f5818a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDao_Impl$getNewestListPagingForStudent$1(RoomRawQuery roomRawQuery, FileDao_Impl fileDao_Impl, RoomDatabase roomDatabase, String[] strArr) {
        super(roomRawQuery, roomDatabase, strArr);
        this.f5818a = fileDao_Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final List m5049d(RoomRawQuery roomRawQuery, SQLiteConnection _connection) {
        AbstractC9979u.m20294g(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(roomRawQuery.getSql());
        roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ossFileUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localFileUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSync");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isShared");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preFileId");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "errorTimes");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cached");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiredTime");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRecycled");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text5 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow2;
                int i11 = columnIndexOrThrow3;
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                int i13 = columnIndexOrThrow4;
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                int i15 = columnIndexOrThrow15;
                int i16 = (int) sQLiteStatementPrepare.getLong(i15);
                int i17 = columnIndexOrThrow16;
                int i18 = columnIndexOrThrow;
                int i19 = columnIndexOrThrow17;
                int i20 = columnIndexOrThrow18;
                int i21 = columnIndexOrThrow5;
                int i22 = columnIndexOrThrow19;
                arrayList.add(new FileEntity(text, j10, text2, text3, text4, text5, text6, text7, text8, i12, z10, i14, z11, text9, i16, sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17), ((int) sQLiteStatementPrepare.getLong(i19)) != 0, sQLiteStatementPrepare.getLong(i20), ((int) sQLiteStatementPrepare.getLong(i22)) != 0));
                columnIndexOrThrow15 = i15;
                columnIndexOrThrow5 = i21;
                columnIndexOrThrow4 = i13;
                columnIndexOrThrow17 = i19;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow2 = i10;
                columnIndexOrThrow = i18;
                columnIndexOrThrow16 = i17;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow3 = i11;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // androidx.room.paging.LimitOffsetPagingSource
    public Object convertRows(final RoomRawQuery roomRawQuery, int i10, InterfaceC11588c<? super List<? extends FileEntity>> interfaceC11588c) {
        return DBUtil.performSuspending(this.f5818a.f5809a, true, false, new InterfaceC9540l() { // from class: c2.t0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileDao_Impl$getNewestListPagingForStudent$1.m5049d(roomRawQuery, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }
}
