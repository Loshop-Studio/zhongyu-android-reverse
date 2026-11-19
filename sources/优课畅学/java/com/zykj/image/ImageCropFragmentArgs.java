package com.zykj.image;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ImageCropFragmentArgs implements NavArgs {

    /* renamed from: f */
    public static final C7306a f9744f = new C7306a(null);

    /* renamed from: a */
    public final String f9745a;

    /* renamed from: b */
    public final boolean f9746b;

    /* renamed from: c */
    public final int f9747c;

    /* renamed from: d */
    public final int f9748d;

    /* renamed from: e */
    public final boolean f9749e;

    /* renamed from: com.zykj.image.ImageCropFragmentArgs$a */
    public static final class C7306a {
        public /* synthetic */ C7306a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ImageCropFragmentArgs m9218a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ImageCropFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("path");
            if (string != null) {
                return new ImageCropFragmentArgs(string, bundle.containsKey("fixAspectRatio") ? bundle.getBoolean("fixAspectRatio") : false, bundle.containsKey("ratioX") ? bundle.getInt("ratioX") : 0, bundle.containsKey("ratioY") ? bundle.getInt("ratioY") : 0, bundle.containsKey("compress") ? bundle.getBoolean("compress") : false);
            }
            throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
        }

        public C7306a() {
        }
    }

    public ImageCropFragmentArgs(String path, boolean z10, int i10, int i11, boolean z11) {
        AbstractC9133u.m16133g(path, "path");
        this.f9745a = path;
        this.f9746b = z10;
        this.f9747c = i10;
        this.f9748d = i11;
        this.f9749e = z11;
    }

    public static final ImageCropFragmentArgs fromBundle(Bundle bundle) {
        return f9744f.m9218a(bundle);
    }

    /* renamed from: a */
    public final boolean m9213a() {
        return this.f9749e;
    }

    /* renamed from: b */
    public final boolean m9214b() {
        return this.f9746b;
    }

    /* renamed from: c */
    public final String m9215c() {
        return this.f9745a;
    }

    /* renamed from: d */
    public final int m9216d() {
        return this.f9747c;
    }

    /* renamed from: e */
    public final int m9217e() {
        return this.f9748d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCropFragmentArgs)) {
            return false;
        }
        ImageCropFragmentArgs imageCropFragmentArgs = (ImageCropFragmentArgs) obj;
        return AbstractC9133u.m16128b(this.f9745a, imageCropFragmentArgs.f9745a) && this.f9746b == imageCropFragmentArgs.f9746b && this.f9747c == imageCropFragmentArgs.f9747c && this.f9748d == imageCropFragmentArgs.f9748d && this.f9749e == imageCropFragmentArgs.f9749e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f9745a.hashCode() * 31;
        boolean z10 = this.f9746b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iHashCode2 = (((((iHashCode + i10) * 31) + Integer.hashCode(this.f9747c)) * 31) + Integer.hashCode(this.f9748d)) * 31;
        boolean z11 = this.f9749e;
        return iHashCode2 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "ImageCropFragmentArgs(path=" + this.f9745a + ", fixAspectRatio=" + this.f9746b + ", ratioX=" + this.f9747c + ", ratioY=" + this.f9748d + ", compress=" + this.f9749e + ')';
    }
}
