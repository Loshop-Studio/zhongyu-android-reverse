package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p013ui.graphics.TileMode;

/* loaded from: classes2.dex */
public final class AndroidTileMode_androidKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m24180isSupported0vamqd0(int i10) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m24645equalsimpl0(i10, TileMode.Companion.m24650getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m24181toAndroidTileMode0vamqd0(int i10) {
        TileMode.Companion companion = TileMode.Companion;
        return TileMode.m24645equalsimpl0(i10, companion.m24649getClamp3opZhB0()) ? Shader.TileMode.CLAMP : TileMode.m24645equalsimpl0(i10, companion.m24652getRepeated3opZhB0()) ? Shader.TileMode.REPEAT : TileMode.m24645equalsimpl0(i10, companion.m24651getMirror3opZhB0()) ? Shader.TileMode.MIRROR : TileMode.m24645equalsimpl0(i10, companion.m24650getDecal3opZhB0()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? TileMode.Companion.m24649getClamp3opZhB0() : TileModeVerificationHelper.INSTANCE.m24653getComposeTileModeDecal3opZhB0() : TileMode.Companion.m24652getRepeated3opZhB0() : TileMode.Companion.m24651getMirror3opZhB0() : TileMode.Companion.m24649getClamp3opZhB0();
    }
}
