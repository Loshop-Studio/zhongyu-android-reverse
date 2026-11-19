package androidx.compose.p009ui.tooling.preview;

import androidx.compose.p009ui.tooling.preview.Preview;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Metadata(m7879d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m7880d2 = {"Landroidx/compose/ui/tooling/preview/PreviewDynamicColors;", "", "ui-tooling-preview_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@Preview.Container({@Preview(name = "Red", wallpaper = 0), @Preview(name = "Blue", wallpaper = 2), @Preview(name = "Green", wallpaper = 1), @Preview(name = "Yellow", wallpaper = 3)})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes2.dex */
public @interface PreviewDynamicColors {
}
