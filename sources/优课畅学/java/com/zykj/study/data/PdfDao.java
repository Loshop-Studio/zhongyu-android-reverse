package com.zykj.study.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Dao
/* loaded from: classes3.dex */
public interface PdfDao {
    @Insert(onConflict = 1)
    Object insertPdf(PdfEntity pdfEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("SELECT * FROM PdfEntity WHERE id = :id")
    Object queryPdf(String str, InterfaceC9324c<? super PdfEntity> interfaceC9324c);
}
