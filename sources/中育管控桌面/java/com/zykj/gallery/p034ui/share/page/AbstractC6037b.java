package com.zykj.gallery.p034ui.share.page;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.gallery.ui.share.page.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6037b {

    /* renamed from: com.zykj.gallery.ui.share.page.b$a */
    public static final class a extends AbstractC6037b {

        /* renamed from: a */
        public static final a f5940a = new a();

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -554430848;
        }

        public String toString() {
            return "CameraResult";
        }
    }

    /* renamed from: com.zykj.gallery.ui.share.page.b$b */
    public static final class b extends AbstractC6037b {

        /* renamed from: a */
        public final Uri f5941a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri) {
            super(null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f5941a = uri;
        }

        /* renamed from: a */
        public final Uri m5158a() {
            return this.f5941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f5941a, ((b) obj).f5941a);
        }

        public int hashCode() {
            return this.f5941a.hashCode();
        }

        public String toString() {
            return "UriResult(uri=" + this.f5941a + ")";
        }
    }

    public /* synthetic */ AbstractC6037b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC6037b() {
    }
}
