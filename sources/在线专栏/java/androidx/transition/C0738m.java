package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.m */
/* loaded from: classes.dex */
class C0738m {
    /* renamed from: a */
    static <T> ObjectAnimator m3903a(T t3, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
    }
}
