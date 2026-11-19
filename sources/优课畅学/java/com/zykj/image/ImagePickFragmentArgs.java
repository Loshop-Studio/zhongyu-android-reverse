package com.zykj.image;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ImagePickFragmentArgs implements NavArgs {

    /* renamed from: e */
    public static final C7310a f9762e = new C7310a(null);

    /* renamed from: a */
    public final boolean f9763a;

    /* renamed from: b */
    public final int f9764b;

    /* renamed from: c */
    public final int f9765c;

    /* renamed from: d */
    public final boolean f9766d;

    /* renamed from: com.zykj.image.ImagePickFragmentArgs$a */
    public static final class C7310a {
        public /* synthetic */ C7310a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ImagePickFragmentArgs m9229a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ImagePickFragmentArgs.class.getClassLoader());
            return new ImagePickFragmentArgs(bundle.containsKey("fixAspectRatio") ? bundle.getBoolean("fixAspectRatio") : false, bundle.containsKey("ratioX") ? bundle.getInt("ratioX") : 0, bundle.containsKey("ratioY") ? bundle.getInt("ratioY") : 0, bundle.containsKey("compress") ? bundle.getBoolean("compress") : false);
        }

        public C7310a() {
        }
    }

    public ImagePickFragmentArgs() {
        this(false, 0, 0, false, 15, null);
    }

    public static final ImagePickFragmentArgs fromBundle(Bundle bundle) {
        return f9762e.m9229a(bundle);
    }

    /* renamed from: a */
    public final boolean m9225a() {
        return this.f9766d;
    }

    /* renamed from: b */
    public final boolean m9226b() {
        return this.f9763a;
    }

    /* renamed from: c */
    public final int m9227c() {
        return this.f9764b;
    }

    /* renamed from: d */
    public final int m9228d() {
        return this.f9765c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePickFragmentArgs)) {
            return false;
        }
        ImagePickFragmentArgs imagePickFragmentArgs = (ImagePickFragmentArgs) obj;
        return this.f9763a == imagePickFragmentArgs.f9763a && this.f9764b == imagePickFragmentArgs.f9764b && this.f9765c == imagePickFragmentArgs.f9765c && this.f9766d == imagePickFragmentArgs.f9766d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z10 = this.f9763a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iHashCode = ((((r02 * 31) + Integer.hashCode(this.f9764b)) * 31) + Integer.hashCode(this.f9765c)) * 31;
        boolean z11 = this.f9766d;
        return iHashCode + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "ImagePickFragmentArgs(fixAspectRatio=" + this.f9763a + ", ratioX=" + this.f9764b + ", ratioY=" + this.f9765c + ", compress=" + this.f9766d + ')';
    }

    public ImagePickFragmentArgs(boolean z10, int i10, int i11, boolean z11) {
        this.f9763a = z10;
        this.f9764b = i10;
        this.f9765c = i11;
        this.f9766d = z11;
    }

    public /* synthetic */ ImagePickFragmentArgs(boolean z10, int i10, int i11, boolean z11, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z11);
    }
}
