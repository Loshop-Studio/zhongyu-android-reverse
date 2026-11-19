package androidx.compose.p012ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p012ui.graphics.TileMode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m13413d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AndroidTileMode_androidKt {

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final boolean m21313isSupported0vamqd0(int i9) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m21778equalsimpl0(i9, TileMode.INSTANCE.m21783getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m21314toAndroidTileMode0vamqd0(int i9) {
        TileMode.Companion companion = TileMode.INSTANCE;
        return TileMode.m21778equalsimpl0(i9, companion.m21782getClamp3opZhB0()) ? Shader.TileMode.CLAMP : TileMode.m21778equalsimpl0(i9, companion.m21785getRepeated3opZhB0()) ? Shader.TileMode.REPEAT : TileMode.m21778equalsimpl0(i9, companion.m21784getMirror3opZhB0()) ? Shader.TileMode.MIRROR : TileMode.m21778equalsimpl0(i9, companion.m21783getDecal3opZhB0()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        int i9 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? TileMode.INSTANCE.m21782getClamp3opZhB0() : TileModeVerificationHelper.INSTANCE.m21786getComposeTileModeDecal3opZhB0() : TileMode.INSTANCE.m21785getRepeated3opZhB0() : TileMode.INSTANCE.m21784getMirror3opZhB0() : TileMode.INSTANCE.m21782getClamp3opZhB0();
    }
}
