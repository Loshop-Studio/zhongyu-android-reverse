package kotlinx.serialization;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.MustBeDocumented;

@Target({})
@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "This class or interface should not be inherited/implemented outside of kotlinx.serialization library. Note it is still permitted to use it directly. Read its documentation about inheritance for details.")
@kotlin.annotation.Target(allowedTargets = {})
@Retention(RetentionPolicy.RUNTIME)
@MustBeDocumented
@Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m5110d2 = {"Lkotlinx/serialization/SealedSerializationApi;", "", "kotlinx-serialization-core"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Documented
/* loaded from: classes4.dex */
public @interface SealedSerializationApi {
}
