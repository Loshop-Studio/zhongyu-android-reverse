package com.zykj.subscriber.dao;

import android.content.Context;
import androidx.room.AbstractC0621h0;
import androidx.room.C0619g0;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p081e2.InterfaceC2473b;

/* loaded from: classes.dex */
public abstract class PDFPreviewDatabase extends AbstractC0621h0 {

    /* renamed from: n */
    @NotNull
    public static final C2437a f9928n = new C2437a(null);

    /* renamed from: o */
    @Nullable
    private static volatile PDFPreviewDatabase f9929o;

    /* renamed from: com.zykj.subscriber.dao.PDFPreviewDatabase$a */
    public static final class C2437a {
        private C2437a() {
        }

        public /* synthetic */ C2437a(C2764g c2764g) {
            this();
        }

        /* renamed from: a */
        private final PDFPreviewDatabase m8126a(Context context) {
            AbstractC0621h0 abstractC0621h0M3562d = C0619g0.m3527a(context, PDFPreviewDatabase.class, "preview.db").m3562d();
            C2769l.m9240d(abstractC0621h0M3562d, "databaseBuilder(context,…\n                .build()");
            return (PDFPreviewDatabase) abstractC0621h0M3562d;
        }

        @NotNull
        /* renamed from: b */
        public final PDFPreviewDatabase m8127b(@NotNull Context context) {
            C2769l.m9241e(context, "context");
            PDFPreviewDatabase pDFPreviewDatabase = PDFPreviewDatabase.f9929o;
            if (pDFPreviewDatabase == null) {
                synchronized (this) {
                    pDFPreviewDatabase = PDFPreviewDatabase.f9929o;
                    if (pDFPreviewDatabase == null) {
                        PDFPreviewDatabase pDFPreviewDatabaseM8126a = PDFPreviewDatabase.f9928n.m8126a(context);
                        PDFPreviewDatabase.f9929o = pDFPreviewDatabaseM8126a;
                        pDFPreviewDatabase = pDFPreviewDatabaseM8126a;
                    }
                }
            }
            return pDFPreviewDatabase;
        }
    }

    @NotNull
    /* renamed from: E */
    public abstract InterfaceC2473b mo8125E();
}
