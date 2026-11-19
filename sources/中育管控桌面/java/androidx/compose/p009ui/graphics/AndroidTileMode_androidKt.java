package androidx.compose.p009ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p009ui.graphics.TileMode;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m7880d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class AndroidTileMode_androidKt {

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
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
    public static final boolean m13803isSupported0vamqd0(int i6) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m14268equalsimpl0(i6, TileMode.INSTANCE.m14273getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m13804toAndroidTileMode0vamqd0(int i6) {
        TileMode.Companion companion = TileMode.INSTANCE;
        return TileMode.m14268equalsimpl0(i6, companion.m14272getClamp3opZhB0()) ? Shader.TileMode.CLAMP : TileMode.m14268equalsimpl0(i6, companion.m14275getRepeated3opZhB0()) ? Shader.TileMode.REPEAT : TileMode.m14268equalsimpl0(i6, companion.m14274getMirror3opZhB0()) ? Shader.TileMode.MIRROR : TileMode.m14268equalsimpl0(i6, companion.m14273getDecal3opZhB0()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        int i6 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? TileMode.INSTANCE.m14272getClamp3opZhB0() : TileModeVerificationHelper.INSTANCE.m14276getComposeTileModeDecal3opZhB0() : TileMode.INSTANCE.m14275getRepeated3opZhB0() : TileMode.INSTANCE.m14274getMirror3opZhB0() : TileMode.INSTANCE.m14272getClamp3opZhB0();
    }
}
