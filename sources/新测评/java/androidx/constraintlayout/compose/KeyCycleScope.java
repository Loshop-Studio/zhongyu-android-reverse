package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR+\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR+\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000b\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR+\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u000b\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR1\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b0\u0010\u000b\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR1\u00101\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b4\u0010\u000b\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR1\u00105\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010\u000b\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m13558d2 = {"Landroidx/constraintlayout/compose/KeyCycleScope;", "Landroidx/constraintlayout/compose/BaseKeyFrameScope;", "()V", "<set-?>", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "alpha$delegate", "Lkotlin/properties/ObservableProperty;", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "setOffset", "offset$delegate", TypedValues.CycleType.S_WAVE_PERIOD, "getPeriod", "setPeriod", "period$delegate", TypedValues.CycleType.S_WAVE_PHASE, "getPhase", "setPhase", "phase$delegate", "rotationX", "getRotationX", "setRotationX", "rotationX$delegate", "rotationY", "getRotationY", "setRotationY", "rotationY$delegate", "rotationZ", "getRotationZ", "setRotationZ", "rotationZ$delegate", "scaleX", "getScaleX", "setScaleX", "scaleX$delegate", "scaleY", "getScaleY", "setScaleY", "scaleY$delegate", "Landroidx/compose/ui/unit/Dp;", "translationX", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX$delegate", "translationY", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY$delegate", "translationZ", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ$delegate", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyCycleScope\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,969:1\n149#2:970\n149#2:971\n149#2:972\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyCycleScope\n*L\n594#1:970\n595#1:971\n596#1:972\n*E\n"})
/* loaded from: classes2.dex */
public final class KeyCycleScope extends BaseKeyFrameScope {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "alpha", "getAlpha()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "scaleX", "getScaleX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "scaleY", "getScaleY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "rotationX", "getRotationX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "rotationY", "getRotationY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "rotationZ", "getRotationZ()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_PERIOD, "getPeriod()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_OFFSET, "getOffset()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_PHASE, "getPhase()F", 0))};
    public static final int $stable = 8;

    /* renamed from: alpha$delegate, reason: from kotlin metadata */
    private final ObservableProperty alpha;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final ObservableProperty offset;

    /* renamed from: period$delegate, reason: from kotlin metadata */
    private final ObservableProperty period;

    /* renamed from: phase$delegate, reason: from kotlin metadata */
    private final ObservableProperty phase;

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

    public KeyCycleScope() {
        super(null);
        Float fValueOf = Float.valueOf(1.0f);
        this.alpha = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf, null, 2, null);
        this.scaleX = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf, null, 2, null);
        this.scaleY = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf, null, 2, null);
        Float fValueOf2 = Float.valueOf(0.0f);
        this.rotationX = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf2, null, 2, null);
        this.rotationY = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf2, null, 2, null);
        this.rotationZ = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf2, null, 2, null);
        float f10 = 0;
        this.translationX = BaseKeyFrameScope.addOnPropertyChange$default(this, C3127Dp.m23559boximpl(C3127Dp.m23561constructorimpl(f10)), null, 2, null);
        this.translationY = BaseKeyFrameScope.addOnPropertyChange$default(this, C3127Dp.m23559boximpl(C3127Dp.m23561constructorimpl(f10)), null, 2, null);
        this.translationZ = BaseKeyFrameScope.addOnPropertyChange$default(this, C3127Dp.m23559boximpl(C3127Dp.m23561constructorimpl(f10)), null, 2, null);
        this.period = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf2, null, 2, null);
        this.offset = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf2, null, 2, null);
        this.phase = BaseKeyFrameScope.addOnPropertyChange$default(this, fValueOf2, null, 2, null);
    }

    public final float getAlpha() {
        return ((Number) this.alpha.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset.getValue(this, $$delegatedProperties[10])).floatValue();
    }

    public final float getPeriod() {
        return ((Number) this.period.getValue(this, $$delegatedProperties[9])).floatValue();
    }

    public final float getPhase() {
        return ((Number) this.phase.getValue(this, $$delegatedProperties[11])).floatValue();
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
    public final float m23949getTranslationXD9Ej5fM() {
        return ((C3127Dp) this.translationX.getValue(this, $$delegatedProperties[6])).m23575unboximpl();
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m23950getTranslationYD9Ej5fM() {
        return ((C3127Dp) this.translationY.getValue(this, $$delegatedProperties[7])).m23575unboximpl();
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m23951getTranslationZD9Ej5fM() {
        return ((C3127Dp) this.translationZ.getValue(this, $$delegatedProperties[8])).m23575unboximpl();
    }

    public final void setAlpha(float f10) {
        this.alpha.setValue(this, $$delegatedProperties[0], Float.valueOf(f10));
    }

    public final void setOffset(float f10) {
        this.offset.setValue(this, $$delegatedProperties[10], Float.valueOf(f10));
    }

    public final void setPeriod(float f10) {
        this.period.setValue(this, $$delegatedProperties[9], Float.valueOf(f10));
    }

    public final void setPhase(float f10) {
        this.phase.setValue(this, $$delegatedProperties[11], Float.valueOf(f10));
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
    public final void m23952setTranslationX0680j_4(float f10) {
        this.translationX.setValue(this, $$delegatedProperties[6], C3127Dp.m23559boximpl(f10));
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m23953setTranslationY0680j_4(float f10) {
        this.translationY.setValue(this, $$delegatedProperties[7], C3127Dp.m23559boximpl(f10));
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m23954setTranslationZ0680j_4(float f10) {
        this.translationZ.setValue(this, $$delegatedProperties[8], C3127Dp.m23559boximpl(f10));
    }
}
