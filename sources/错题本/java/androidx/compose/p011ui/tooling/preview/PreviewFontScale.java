package androidx.compose.p011ui.tooling.preview;

import androidx.compose.material3.carousel.CarouselDefaults;
import androidx.compose.p011ui.tooling.preview.Preview;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m5110d2 = {"Landroidx/compose/ui/tooling/preview/PreviewFontScale;", "", "ui-tooling-preview_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Preview.Container({@Preview(fontScale = CarouselDefaults.MediumLargeItemDiffThreshold, name = "85%"), @Preview(fontScale = 1.0f, name = "100%"), @Preview(fontScale = 1.15f, name = "115%"), @Preview(fontScale = 1.3f, name = "130%"), @Preview(fontScale = 1.5f, name = "150%"), @Preview(fontScale = 1.8f, name = "180%"), @Preview(fontScale = BaseSelectFunction.textSpaceWidth, name = "200%")})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes2.dex */
public @interface PreviewFontScale {
}
