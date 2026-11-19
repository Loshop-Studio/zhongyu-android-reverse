package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR1\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR1\u0010%\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR1\u0010)\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m13413d2 = {"Landroidx/constraintlayout/compose/KeyAttributeScope;", "Landroidx/constraintlayout/compose/BaseKeyFrameScope;", "()V", "<set-?>", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "alpha$delegate", "Lkotlin/properties/ObservableProperty;", "rotationX", "getRotationX", "setRotationX", "rotationX$delegate", "rotationY", "getRotationY", "setRotationY", "rotationY$delegate", "rotationZ", "getRotationZ", "setRotationZ", "rotationZ$delegate", "scaleX", "getScaleX", "setScaleX", "scaleX$delegate", "scaleY", "getScaleY", "setScaleY", "scaleY$delegate", "Landroidx/compose/ui/unit/Dp;", "translationX", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX$delegate", "translationY", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY$delegate", "translationZ", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ$delegate", "constraintlayout-compose_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyAttributeScope\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,969:1\n149#2:970\n149#2:971\n149#2:972\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyAttributeScope\n*L\n535#1:970\n536#1:971\n537#1:972\n*E\n"})
/* loaded from: classes2.dex */
public final class KeyAttributeScope extends BaseKeyFrameScope {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "alpha", "getAlpha()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "scaleX", "getScaleX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "scaleY", "getScaleY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "rotationX", "getRotationX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "rotationY", "getRotationY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "rotationZ", "getRotationZ()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyAttributeScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0))};
    public static final int $stable = 8;

    /* renamed from: alpha$delegate, reason: from kotlin metadata */
    private final ObservableProperty alpha;

    /* renamed from: rotationX$delegate, reason: from kotlin metadata */
    private final ObservableProperty rotationX;

    /* renamed from: rotationY$delegate, reason: from kotlin metadata */
    private final ObservableProperty rotationY;

    /* renamed from: rotationZ$delegate, reason: from kotlin metadata */
    private final ObservableProperty rotationZ;

    /* renamed from: scaleX$delegate, reason: from kotlin metadata */
    private final ObservableProperty scaleX;

    /* renamed from: scaleY$delegate, reason: from kotlin metadata */
    private final ObservableProperty scaleY;

    /* renamed from: translationX$delegate, reason: from kotlin metadata */
    private final ObservableProperty translationX;

    /* renamed from: translationY$delegate, reason: from kotlin metadata */
    private final ObservableProperty translationY;

    /* renamed from: translationZ$delegate, reason: from kotlin metadata */
    private final ObservableProperty translationZ;

    public KeyAttributeScope() {
        super(null);
        Float fValueOf = Float.valueOf(1.0f);
        this.alpha = addOnPropertyChange(fValueOf, "alpha");
        this.scaleX = addOnPropertyChange(fValueOf, "scaleX");
        this.scaleY = addOnPropertyChange(fValueOf, "scaleY");
        Float fValueOf2 = Float.valueOf(0.0f);
        this.rotationX = addOnPropertyChange(fValueOf2, "rotationX");
        this.rotationY = addOnPropertyChange(fValueOf2, "rotationY");
        this.rotationZ = addOnPropertyChange(fValueOf2, "rotationZ");
        float f10 = 0;
        this.translationX = addOnPropertyChange(C3115Dp.m23992boximpl(C3115Dp.m23994constructorimpl(f10)), "translationX");
        this.translationY = addOnPropertyChange(C3115Dp.m23992boximpl(C3115Dp.m23994constructorimpl(f10)), "translationY");
        this.translationZ = addOnPropertyChange(C3115Dp.m23992boximpl(C3115Dp.m23994constructorimpl(f10)), "translationZ");
    }

    public final float getAlpha() {
        return ((Number) this.alpha.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final float getRotationX() {
        return ((Number) this.rotationX.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final float getRotationY() {
        return ((Number) this.rotationY.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    public final float getRotationZ() {
        return ((Number) this.rotationZ.getValue(this, $$delegatedProperties[5])).floatValue();
    }

    public final float getScaleX() {
        return ((Number) this.scaleX.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final float getScaleY() {
        return ((Number) this.scaleY.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: not valid java name */
    public final float m24376getTranslationXD9Ej5fM() {
        return ((C3115Dp) this.translationX.getValue(this, $$delegatedProperties[6])).m24008unboximpl();
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m24377getTranslationYD9Ej5fM() {
        return ((C3115Dp) this.translationY.getValue(this, $$delegatedProperties[7])).m24008unboximpl();
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m24378getTranslationZD9Ej5fM() {
        return ((C3115Dp) this.translationZ.getValue(this, $$delegatedProperties[8])).m24008unboximpl();
    }

    public final void setAlpha(float f10) {
        this.alpha.setValue(this, $$delegatedProperties[0], Float.valueOf(f10));
    }

    public final void setRotationX(float f10) {
        this.rotationX.setValue(this, $$delegatedProperties[3], Float.valueOf(f10));
    }

    public final void setRotationY(float f10) {
        this.rotationY.setValue(this, $$delegatedProperties[4], Float.valueOf(f10));
    }

    public final void setRotationZ(float f10) {
        this.rotationZ.setValue(this, $$delegatedProperties[5], Float.valueOf(f10));
    }

    public final void setScaleX(float f10) {
        this.scaleX.setValue(this, $$delegatedProperties[1], Float.valueOf(f10));
    }

    public final void setScaleY(float f10) {
        this.scaleY.setValue(this, $$delegatedProperties[2], Float.valueOf(f10));
    }

    /* renamed from: setTranslationX-0680j_4, reason: not valid java name */
    public final void m24379setTranslationX0680j_4(float f10) {
        this.translationX.setValue(this, $$delegatedProperties[6], C3115Dp.m23992boximpl(f10));
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m24380setTranslationY0680j_4(float f10) {
        this.translationY.setValue(this, $$delegatedProperties[7], C3115Dp.m23992boximpl(f10));
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m24381setTranslationZ0680j_4(float f10) {
        this.translationZ.setValue(this, $$delegatedProperties[8], C3115Dp.m23992boximpl(f10));
    }
}
