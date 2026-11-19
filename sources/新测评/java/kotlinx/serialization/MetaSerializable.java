package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.RUNTIME)
@MustBeDocumented
@Metadata(m13557d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m13558d2 = {"Lkotlinx/serialization/MetaSerializable;", "", "kotlinx-serialization-core"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@ExperimentalSerializationApi
@Documented
/* loaded from: classes5.dex */
public @interface MetaSerializable {
}
