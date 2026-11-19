package com.zykj.huiwei.launcher.dao;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p156t3.InterfaceC7725b;

@StabilityInferred(parameters = 0)
@Database(entities = {PDFPreviewInfo.class}, exportSchema = false, version = 1)
@Metadata(m7879d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/dao/PDFPreviewDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lt3/b;", "i", "()Lt3/b;", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public abstract class PDFPreviewDatabase extends RoomDatabase {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b */
    public static final int f6067b = 8;

    /* renamed from: c */
    public static volatile PDFPreviewDatabase f6068c;

    /* renamed from: com.zykj.huiwei.launcher.dao.PDFPreviewDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PDFPreviewDatabase m5294a(Context context) {
            return (PDFPreviewDatabase) Room.databaseBuilder(context, PDFPreviewDatabase.class, "preview.db").build();
        }

        /* renamed from: b */
        public final PDFPreviewDatabase m5295b(Context context) {
            PDFPreviewDatabase pDFPreviewDatabaseM5294a;
            Intrinsics.checkNotNullParameter(context, "context");
            PDFPreviewDatabase pDFPreviewDatabase = PDFPreviewDatabase.f6068c;
            if (pDFPreviewDatabase != null) {
                return pDFPreviewDatabase;
            }
            synchronized (this) {
                pDFPreviewDatabaseM5294a = PDFPreviewDatabase.f6068c;
                if (pDFPreviewDatabaseM5294a == null) {
                    pDFPreviewDatabaseM5294a = PDFPreviewDatabase.INSTANCE.m5294a(context);
                    PDFPreviewDatabase.f6068c = pDFPreviewDatabaseM5294a;
                }
            }
            return pDFPreviewDatabaseM5294a;
        }

        public Companion() {
        }
    }

    /* renamed from: i */
    public abstract InterfaceC7725b mo5293i();
}
