package com.zykj.gallery.p034ui.share.page;

import com.zykj.gallery.bean.GalleryImgBean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.gallery.ui.share.page.a */
/* loaded from: classes4.dex */
public interface InterfaceC6036a {

    /* renamed from: com.zykj.gallery.ui.share.page.a$a */
    public static final class a implements InterfaceC6036a {

        /* renamed from: a */
        public static final a f5938a = new a();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -2045038497;
        }

        public String toString() {
            return "CameraEntry";
        }
    }

    /* renamed from: com.zykj.gallery.ui.share.page.a$b */
    public static final class b implements InterfaceC6036a {

        /* renamed from: a */
        public final GalleryImgBean f5939a;

        public b(GalleryImgBean image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f5939a = image;
        }

        /* renamed from: a */
        public final GalleryImgBean m5157a() {
            return this.f5939a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f5939a, ((b) obj).f5939a);
        }

        public int hashCode() {
            return this.f5939a.hashCode();
        }

        public String toString() {
            return "ImageItem(image=" + this.f5939a + ")";
        }
    }
}
