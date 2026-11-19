package androidx.compose.p013ui.graphics.vector;

import androidx.compose.runtime.ComposableTargetMarker;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@ComposableTargetMarker(description = "Vector Composable")
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface VectorComposable {
}
