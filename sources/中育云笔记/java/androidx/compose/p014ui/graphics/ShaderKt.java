package androidx.compose.p014ui.graphics;

import android.graphics.Shader;
import java.util.List;

/* loaded from: classes2.dex */
public final class ShaderKt {
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m31191ImageShaderF49vj9s(ImageBitmap imageBitmap, int i10, int i11) {
        return AndroidShader_androidKt.m30778ActualImageShaderF49vj9s(imageBitmap, i10, i11);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m31192ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = TileMode.Companion.m31251getClamp3opZhB0();
        }
        if ((i12 & 4) != 0) {
            i11 = TileMode.Companion.m31251getClamp3opZhB0();
        }
        return m31191ImageShaderF49vj9s(imageBitmap, i10, i11);
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m31193LinearGradientShaderVjE6UOU(long j10, long j11, List<Color> list, List<Float> list2, int i10) {
        return AndroidShader_androidKt.m30779ActualLinearGradientShaderVjE6UOU(j10, j11, list, list2, i10);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m31194LinearGradientShaderVjE6UOU$default(long j10, long j11, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = TileMode.Companion.m31251getClamp3opZhB0();
        }
        return m31193LinearGradientShaderVjE6UOU(j10, j11, list, list3, i10);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m31195RadialGradientShader8uybcMk(long j10, float f10, List<Color> list, List<Float> list2, int i10) {
        return AndroidShader_androidKt.m30780ActualRadialGradientShader8uybcMk(j10, f10, list, list2, i10);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m31196RadialGradientShader8uybcMk$default(long j10, float f10, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = TileMode.Companion.m31251getClamp3opZhB0();
        }
        return m31195RadialGradientShader8uybcMk(j10, f10, list, list3, i10);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m31197SweepGradientShader9KIMszo(long j10, List<Color> list, List<Float> list2) {
        return AndroidShader_androidKt.m30781ActualSweepGradientShader9KIMszo(j10, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m31198SweepGradientShader9KIMszo$default(long j10, List list, List list2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list2 = null;
        }
        return m31197SweepGradientShader9KIMszo(j10, list, list2);
    }
}
