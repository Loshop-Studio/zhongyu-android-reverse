package com.zykj.view.utils;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3385e;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"randomUri", "Landroid/net/Uri;", "getRandomUri", "()Landroid/net/Uri;", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ImagePickerKt {
    @NotNull
    public static final Uri getRandomUri() {
        File externalCacheDir = AbstractC3382c.m2303d().getExternalCacheDir();
        String string = UUID.randomUUID().toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        File file = new File(externalCacheDir, AbstractC5862w.m5407A(string, "-", "").concat(".webp"));
        AbstractC3385e.m2332d(file);
        Uri uriM2302c = AbstractC3382c.m2302c(file);
        AbstractC5830k.m5329f(uriM2302c, "let(...)");
        return uriM2302c;
    }
}
