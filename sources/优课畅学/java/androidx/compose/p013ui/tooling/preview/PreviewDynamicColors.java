package androidx.compose.p013ui.tooling.preview;

import androidx.compose.p013ui.tooling.preview.Preview;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Preview.Container({@Preview(name = "Red", wallpaper = 0), @Preview(name = "Blue", wallpaper = 2), @Preview(name = "Green", wallpaper = 1), @Preview(name = "Yellow", wallpaper = 3)})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface PreviewDynamicColors {
}
