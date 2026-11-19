package androidx.compose.p013ui.graphics;

import android.graphics.PathEffect;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/graphics/AndroidPathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "nativePathEffect", "Landroid/graphics/PathEffect;", "(Landroid/graphics/PathEffect;)V", "getNativePathEffect", "()Landroid/graphics/PathEffect;", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AndroidPathEffect implements PathEffect {
    private final PathEffect nativePathEffect;

    public AndroidPathEffect(PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }

    public final PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
