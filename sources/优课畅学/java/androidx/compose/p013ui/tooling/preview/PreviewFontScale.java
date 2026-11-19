package androidx.compose.p013ui.tooling.preview;

import androidx.compose.material3.carousel.CarouselDefaults;
import androidx.compose.p013ui.tooling.preview.Preview;
import com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Preview.Container({@Preview(fontScale = CarouselDefaults.MediumLargeItemDiffThreshold, name = "85%"), @Preview(fontScale = 1.0f, name = "100%"), @Preview(fontScale = 1.15f, name = "115%"), @Preview(fontScale = 1.3f, name = "130%"), @Preview(fontScale = 1.5f, name = "150%"), @Preview(fontScale = 1.8f, name = "180%"), @Preview(fontScale = BaseSelectFunction.textSpaceWidth, name = "200%")})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface PreviewFontScale {
}
