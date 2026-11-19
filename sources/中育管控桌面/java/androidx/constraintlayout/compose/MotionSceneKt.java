package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7880d2 = {TypedValues.MotionScene.NAME, "Landroidx/constraintlayout/compose/MotionScene;", "content", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/MotionScene;", "constraintlayout-compose_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMotionScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionScene.kt\nandroidx/constraintlayout/compose/MotionSceneKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,132:1\n1225#2,6:133\n*S KotlinDebug\n*F\n+ 1 MotionScene.kt\nandroidx/constraintlayout/compose/MotionSceneKt\n*L\n52#1:133,6\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionSceneKt {
    @Composable
    @ExperimentalMotionApi
    @SuppressLint({"ComposableNaming"})
    public static final MotionScene MotionScene(String str, Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1620042625, i6, -1, "androidx.constraintlayout.compose.MotionScene (MotionScene.kt:48)");
        }
        boolean z6 = (((i6 & 14) ^ 6) > 4 && composer.changed(str)) || (i6 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new JSONMotionScene(str);
            composer.updateRememberedValue(objRememberedValue);
        }
        JSONMotionScene jSONMotionScene = (JSONMotionScene) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jSONMotionScene;
    }
}
