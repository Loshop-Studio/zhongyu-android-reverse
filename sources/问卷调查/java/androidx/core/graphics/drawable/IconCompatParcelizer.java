package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import java.nio.charset.Charset;
import java.util.Objects;
import p000a.p067s.AbstractC0442a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0442a abstractC0442a) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3146a = abstractC0442a.m1511k(iconCompat.f3146a, 1);
        byte[] bArrMo1507g = iconCompat.f3148c;
        if (abstractC0442a.mo1509i(2)) {
            bArrMo1507g = abstractC0442a.mo1507g();
        }
        iconCompat.f3148c = bArrMo1507g;
        iconCompat.f3149d = abstractC0442a.m1513m(iconCompat.f3149d, 3);
        iconCompat.f3150e = abstractC0442a.m1511k(iconCompat.f3150e, 4);
        iconCompat.f3151f = abstractC0442a.m1511k(iconCompat.f3151f, 5);
        iconCompat.f3152g = (ColorStateList) abstractC0442a.m1513m(iconCompat.f3152g, 6);
        String strMo1514n = iconCompat.f3154i;
        if (abstractC0442a.mo1509i(7)) {
            strMo1514n = abstractC0442a.mo1514n();
        }
        iconCompat.f3154i = strMo1514n;
        String strMo1514n2 = iconCompat.f3155j;
        if (abstractC0442a.mo1509i(8)) {
            strMo1514n2 = abstractC0442a.mo1514n();
        }
        iconCompat.f3155j = strMo1514n2;
        iconCompat.f3153h = PorterDuff.Mode.valueOf(iconCompat.f3154i);
        switch (iconCompat.f3146a) {
            case CalligraphyConfig.Builder.INVALID_ATTR_ID /* -1 */:
                parcelable = iconCompat.f3149d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3147b = parcelable;
                return iconCompat;
            case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
            default:
                return iconCompat;
            case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
            case 5:
                parcelable = iconCompat.f3149d;
                if (parcelable != null) {
                    iconCompat.f3147b = parcelable;
                } else {
                    byte[] bArr = iconCompat.f3148c;
                    iconCompat.f3147b = bArr;
                    iconCompat.f3146a = 3;
                    iconCompat.f3150e = 0;
                    iconCompat.f3151f = bArr.length;
                }
                return iconCompat;
            case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
            case 4:
            case 6:
                String str = new String(iconCompat.f3148c, Charset.forName("UTF-16"));
                iconCompat.f3147b = str;
                if (iconCompat.f3146a == 2 && iconCompat.f3155j == null) {
                    iconCompat.f3155j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f3147b = iconCompat.f3148c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0442a abstractC0442a) {
        Objects.requireNonNull(abstractC0442a);
        iconCompat.f3154i = iconCompat.f3153h.name();
        switch (iconCompat.f3146a) {
            case CalligraphyConfig.Builder.INVALID_ATTR_ID /* -1 */:
            case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
            case 5:
                iconCompat.f3149d = (Parcelable) iconCompat.f3147b;
                break;
            case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                iconCompat.f3148c = ((String) iconCompat.f3147b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f3148c = (byte[]) iconCompat.f3147b;
                break;
            case 4:
            case 6:
                iconCompat.f3148c = iconCompat.f3147b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f3146a;
        if (-1 != i) {
            abstractC0442a.mo1516p(1);
            abstractC0442a.mo1520t(i);
        }
        byte[] bArr = iconCompat.f3148c;
        if (bArr != null) {
            abstractC0442a.mo1516p(2);
            abstractC0442a.mo1518r(bArr);
        }
        Parcelable parcelable = iconCompat.f3149d;
        if (parcelable != null) {
            abstractC0442a.mo1516p(3);
            abstractC0442a.mo1521u(parcelable);
        }
        int i2 = iconCompat.f3150e;
        if (i2 != 0) {
            abstractC0442a.mo1516p(4);
            abstractC0442a.mo1520t(i2);
        }
        int i3 = iconCompat.f3151f;
        if (i3 != 0) {
            abstractC0442a.mo1516p(5);
            abstractC0442a.mo1520t(i3);
        }
        ColorStateList colorStateList = iconCompat.f3152g;
        if (colorStateList != null) {
            abstractC0442a.mo1516p(6);
            abstractC0442a.mo1521u(colorStateList);
        }
        String str = iconCompat.f3154i;
        if (str != null) {
            abstractC0442a.mo1516p(7);
            abstractC0442a.mo1522v(str);
        }
        String str2 = iconCompat.f3155j;
        if (str2 != null) {
            abstractC0442a.mo1516p(8);
            abstractC0442a.mo1522v(str2);
        }
    }
}
