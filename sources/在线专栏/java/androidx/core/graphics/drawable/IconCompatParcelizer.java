package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC0764a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0764a abstractC0764a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2675a = abstractC0764a.m4025p(iconCompat.f2675a, 1);
        iconCompat.f2677c = abstractC0764a.m4019j(iconCompat.f2677c, 2);
        iconCompat.f2678d = abstractC0764a.m4027r(iconCompat.f2678d, 3);
        iconCompat.f2679e = abstractC0764a.m4025p(iconCompat.f2679e, 4);
        iconCompat.f2680f = abstractC0764a.m4025p(iconCompat.f2680f, 5);
        iconCompat.f2681g = (ColorStateList) abstractC0764a.m4027r(iconCompat.f2681g, 6);
        iconCompat.f2683i = abstractC0764a.m4029t(iconCompat.f2683i, 7);
        iconCompat.f2684j = abstractC0764a.m4029t(iconCompat.f2684j, 8);
        iconCompat.m1845n();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0764a abstractC0764a) {
        abstractC0764a.m4033x(true, true);
        iconCompat.m1846o(abstractC0764a.m4015f());
        int i4 = iconCompat.f2675a;
        if (-1 != i4) {
            abstractC0764a.m4005F(i4, 1);
        }
        byte[] bArr = iconCompat.f2677c;
        if (bArr != null) {
            abstractC0764a.m4001B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2678d;
        if (parcelable != null) {
            abstractC0764a.m4007H(parcelable, 3);
        }
        int i5 = iconCompat.f2679e;
        if (i5 != 0) {
            abstractC0764a.m4005F(i5, 4);
        }
        int i6 = iconCompat.f2680f;
        if (i6 != 0) {
            abstractC0764a.m4005F(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f2681g;
        if (colorStateList != null) {
            abstractC0764a.m4007H(colorStateList, 6);
        }
        String str = iconCompat.f2683i;
        if (str != null) {
            abstractC0764a.m4009J(str, 7);
        }
        String str2 = iconCompat.f2684j;
        if (str2 != null) {
            abstractC0764a.m4009J(str2, 8);
        }
    }
}
