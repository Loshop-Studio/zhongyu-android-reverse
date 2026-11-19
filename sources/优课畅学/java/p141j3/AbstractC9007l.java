package p141j3;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.image.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: j3.l */
/* loaded from: classes4.dex */
public abstract class AbstractC9007l {

    /* renamed from: a */
    public static final b f17199a = new b(null);

    /* renamed from: j3.l$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f17200a;

        /* renamed from: b */
        public final boolean f17201b;

        /* renamed from: c */
        public final int f17202c;

        /* renamed from: d */
        public final int f17203d;

        /* renamed from: e */
        public final boolean f17204e;

        public a(String path, boolean z10, int i10, int i11, boolean z11) {
            AbstractC9133u.m16133g(path, "path");
            this.f17200a = path;
            this.f17201b = z10;
            this.f17202c = i10;
            this.f17203d = i11;
            this.f17204e = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f17200a, aVar.f17200a) && this.f17201b == aVar.f17201b && this.f17202c == aVar.f17202c && this.f17203d == aVar.f17203d && this.f17204e == aVar.f17204e;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return R$id.action_imagePickFragment_to_nav_image_crop;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f17200a);
            bundle.putBoolean("fixAspectRatio", this.f17201b);
            bundle.putInt("ratioX", this.f17202c);
            bundle.putInt("ratioY", this.f17203d);
            bundle.putBoolean("compress", this.f17204e);
            return bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.f17200a.hashCode() * 31;
            boolean z10 = this.f17201b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int iHashCode2 = (((((iHashCode + i10) * 31) + Integer.hashCode(this.f17202c)) * 31) + Integer.hashCode(this.f17203d)) * 31;
            boolean z11 = this.f17204e;
            return iHashCode2 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "ActionImagePickFragmentToNavImageCrop(path=" + this.f17200a + ", fixAspectRatio=" + this.f17201b + ", ratioX=" + this.f17202c + ", ratioY=" + this.f17203d + ", compress=" + this.f17204e + ')';
        }
    }

    /* renamed from: j3.l$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m15650a(String path, boolean z10, int i10, int i11, boolean z11) {
            AbstractC9133u.m16133g(path, "path");
            return new a(path, z10, i10, i11, z11);
        }

        public b() {
        }
    }
}
