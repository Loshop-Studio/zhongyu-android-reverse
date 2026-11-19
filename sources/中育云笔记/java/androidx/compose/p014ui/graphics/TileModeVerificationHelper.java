package androidx.compose.p014ui.graphics;

import android.graphics.Shader;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class TileModeVerificationHelper {
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    /* renamed from: getComposeTileModeDecal-3opZhB0, reason: not valid java name */
    public final int m31255getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m31252getDecal3opZhB0();
    }

    public final Shader.TileMode getFrameworkTileModeDecal() {
        return Shader.TileMode.DECAL;
    }
}
