package androidx.constraintlayout.compose;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.OnPlacedModifierKt;
import androidx.compose.p013ui.node.Ref;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.motion.widget.Key;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@Metadata(m13557d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u000223B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ#\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ%\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\rJ%\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J%\u0010 \u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\rJ\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001f\u0010#\u001a\f\u0012\b\u0012\u00060%R\u00020\u00000$2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010&J\u001c\u0010#\u001a\u00060%R\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0007JJ\u0010(\u001a\u00020)*\u00020)2\u0006\u0010*\u001a\u00020\u000126\u0010+\u001a2\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b\u000b\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b\u000b\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, m13558d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", Key.MOTIONPROGRESS, "Landroidx/compose/runtime/MutableFloatState;", "(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/MutableFloatState;)V", "customColor", "Landroidx/compose/ui/graphics/Color;", "id", "", HintConstants.AUTOFILL_HINT_NAME, "customColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "customDistance", "Landroidx/compose/ui/unit/Dp;", "customDistance-chRvn1I", "(Ljava/lang/String;Ljava/lang/String;)F", "customFloat", "", "customFontSize", "Landroidx/compose/ui/unit/TextUnit;", "customFontSize-5XXgJZs", "customInt", "", "customProperties", "Landroidx/constraintlayout/compose/MotionLayoutScope$CustomProperties;", "motionColor", "motionColor-WaAFU9c", "motionDistance", "motionDistance-chRvn1I", "motionFloat", "motionFontSize", "motionFontSize-5XXgJZs", "motionInt", "motionProperties", "Landroidx/compose/runtime/State;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tag", "onStartEndBoundsChanged", "Landroidx/compose/ui/Modifier;", "layoutId", "onBoundsChanged", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "startBounds", "endBounds", "", "CustomProperties", "MotionProperties", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1651:1\n135#2:1652\n1225#3,6:1653\n169#4:1659\n169#4:1660\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope\n*L\n707#1:1652\n874#1:1653,6\n898#1:1659\n956#1:1660\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionLayoutScope {
    public static final int $stable = 8;
    private final MotionMeasurer measurer;
    private final MutableFloatState motionProgress;

    @Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003J\u001b\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m13558d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope$CustomProperties;", "", "id", "", "(Landroidx/constraintlayout/compose/MotionLayoutScope;Ljava/lang/String;)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", HintConstants.AUTOFILL_HINT_NAME, "color-vNxB06k", "(Ljava/lang/String;)J", "distance", "Landroidx/compose/ui/unit/Dp;", "distance-u2uoSUM", "(Ljava/lang/String;)F", TypedValues.Custom.S_FLOAT, "", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontSize-kPz2Gy4", "int", "", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$CustomProperties\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1651:1\n169#2:1652\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$CustomProperties\n*L\n818#1:1652\n*E\n"})
    public final class CustomProperties {
        private final String id;

        public CustomProperties(String str) {
            this.id = str;
        }

        /* renamed from: color-vNxB06k, reason: not valid java name */
        public final long m23987colorvNxB06k(String name) {
            return MotionLayoutScope.this.measurer.m24002getCustomColorXeAY9LY(this.id, name, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: distance-u2uoSUM, reason: not valid java name */
        public final float m23988distanceu2uoSUM(String name) {
            return C3127Dp.m23561constructorimpl(MotionLayoutScope.this.measurer.getCustomFloat(this.id, name, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        /* renamed from: float, reason: not valid java name */
        public final float m23989float(String name) {
            return MotionLayoutScope.this.measurer.getCustomFloat(this.id, name, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: fontSize-kPz2Gy4, reason: not valid java name */
        public final long m23990fontSizekPz2Gy4(String name) {
            return TextUnitKt.getSp(MotionLayoutScope.this.measurer.getCustomFloat(this.id, name, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        /* renamed from: int, reason: not valid java name */
        public final int m23991int(String name) {
            return (int) MotionLayoutScope.this.measurer.getCustomFloat(this.id, name, MotionLayoutScope.this.motionProgress.getFloatValue());
        }
    }

    @Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0003J\u001b\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m13558d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "", "id", "", "tag", "(Landroidx/constraintlayout/compose/MotionLayoutScope;Ljava/lang/String;Ljava/lang/String;)V", "myId", "myTag", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", HintConstants.AUTOFILL_HINT_NAME, "color-vNxB06k", "(Ljava/lang/String;)J", "distance", "Landroidx/compose/ui/unit/Dp;", "distance-u2uoSUM", "(Ljava/lang/String;)F", TypedValues.Custom.S_FLOAT, "", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontSize-kPz2Gy4", "int", "", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1651:1\n169#2:1652\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties\n*L\n858#1:1652\n*E\n"})
    public final class MotionProperties {
        private String myId;
        private String myTag;

        public MotionProperties(String str, String str2) {
            this.myId = str;
            this.myTag = str2;
        }

        /* renamed from: color-vNxB06k, reason: not valid java name */
        public final long m23992colorvNxB06k(String name) {
            return MotionLayoutScope.this.measurer.m24002getCustomColorXeAY9LY(this.myId, name, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: distance-u2uoSUM, reason: not valid java name */
        public final float m23993distanceu2uoSUM(String name) {
            return C3127Dp.m23561constructorimpl(MotionLayoutScope.this.measurer.getCustomFloat(this.myId, name, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        /* renamed from: float, reason: not valid java name */
        public final float m23994float(String name) {
            return MotionLayoutScope.this.measurer.getCustomFloat(this.myId, name, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: fontSize-kPz2Gy4, reason: not valid java name */
        public final long m23995fontSizekPz2Gy4(String name) {
            return TextUnitKt.getSp(MotionLayoutScope.this.measurer.getCustomFloat(this.myId, name, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        /* renamed from: id, reason: from getter */
        public final String getMyId() {
            return this.myId;
        }

        /* renamed from: int, reason: not valid java name */
        public final int m23996int(String name) {
            return (int) MotionLayoutScope.this.measurer.getCustomFloat(this.myId, name, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: tag, reason: from getter */
        public final String getMyTag() {
            return this.myTag;
        }
    }

    public MotionLayoutScope(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.measurer = motionMeasurer;
        this.motionProgress = mutableFloatState;
    }

    /* renamed from: customColor-WaAFU9c, reason: not valid java name */
    public final long m23981customColorWaAFU9c(String id, String name) {
        return this.measurer.m24002getCustomColorXeAY9LY(id, name, this.motionProgress.getFloatValue());
    }

    /* renamed from: customDistance-chRvn1I, reason: not valid java name */
    public final float m23982customDistancechRvn1I(String id, String name) {
        return C3127Dp.m23561constructorimpl(this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue()));
    }

    public final float customFloat(String id, String name) {
        return this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue());
    }

    /* renamed from: customFontSize-5XXgJZs, reason: not valid java name */
    public final long m23983customFontSize5XXgJZs(String id, String name) {
        return TextUnitKt.getSp(this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue()));
    }

    public final int customInt(String id, String name) {
        return (int) this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue());
    }

    public final CustomProperties customProperties(String id) {
        return new CustomProperties(id);
    }

    @Deprecated(message = "Deprecated for naming consistency", replaceWith = @ReplaceWith(expression = "customColor(id, name)", imports = {}))
    /* renamed from: motionColor-WaAFU9c, reason: not valid java name */
    public final long m23984motionColorWaAFU9c(String id, String name) {
        return this.measurer.m24002getCustomColorXeAY9LY(id, name, this.motionProgress.getFloatValue());
    }

    @Deprecated(message = "Deprecated for naming consistency", replaceWith = @ReplaceWith(expression = "customDistance(id, name)", imports = {}))
    /* renamed from: motionDistance-chRvn1I, reason: not valid java name */
    public final float m23985motionDistancechRvn1I(String id, String name) {
        return C3127Dp.m23561constructorimpl(this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue()));
    }

    @Deprecated(message = "Deprecated for naming consistency", replaceWith = @ReplaceWith(expression = "customFloat(id, name)", imports = {}))
    public final float motionFloat(String id, String name) {
        return this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue());
    }

    @Deprecated(message = "Deprecated for naming consistency", replaceWith = @ReplaceWith(expression = "customFontSize(id, name)", imports = {}))
    /* renamed from: motionFontSize-5XXgJZs, reason: not valid java name */
    public final long m23986motionFontSize5XXgJZs(String id, String name) {
        return TextUnitKt.getSp(this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue()));
    }

    @Deprecated(message = "Deprecated for naming consistency", replaceWith = @ReplaceWith(expression = "customInt(id, name)", imports = {}))
    public final int motionInt(String id, String name) {
        return (int) this.measurer.getCustomFloat(id, name, this.motionProgress.getFloatValue());
    }

    @Deprecated(message = "Unnecessary composable, name is also inconsistent for custom properties", replaceWith = @ReplaceWith(expression = "customProperties(id)", imports = {}))
    @Composable
    public final androidx.compose.runtime.State<MotionProperties> motionProperties(String str, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1417298021, i10, -1, "androidx.constraintlayout.compose.MotionLayoutScope.motionProperties (MotionLayout.kt:873)");
        }
        boolean z9 = (((i10 & 14) ^ 6) > 4 && composer.changed(str)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MotionProperties(str, null), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public final Modifier onStartEndBoundsChanged(Modifier modifier, final Object obj, final Function2<? super Rect, ? super Rect, Unit> function2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$onStartEndBoundsChanged$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("onStartEndBoundsChanged");
                inspectorInfo.getProperties().set("layoutId", obj);
                inspectorInfo.getProperties().set("onBoundsChanged", function2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.MotionLayoutScope.onStartEndBoundsChanged.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-1096247907);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1096247907, i10, -1, "androidx.constraintlayout.compose.MotionLayoutScope.onStartEndBoundsChanged.<anonymous> (MotionLayout.kt:714)");
                }
                boolean zChanged = composer.changed(obj);
                Object obj2 = obj;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = obj2.toString();
                    composer.updateRememberedValue(objRememberedValue);
                }
                final String str = (String) objRememberedValue;
                Object objRememberedValue2 = composer.rememberedValue();
                Object obj3 = objRememberedValue2;
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    int[] iArr = new int[4];
                    for (int i11 = 0; i11 < 4; i11++) {
                        iArr[i11] = 0;
                    }
                    composer.updateRememberedValue(iArr);
                    obj3 = iArr;
                }
                final int[] iArr2 = (int[]) obj3;
                Object objRememberedValue3 = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                Object obj4 = objRememberedValue3;
                if (objRememberedValue3 == companion.getEmpty()) {
                    Ref ref = new Ref();
                    ref.setValue(Rect.INSTANCE.getZero());
                    composer.updateRememberedValue(ref);
                    obj4 = ref;
                }
                final Ref ref2 = (Ref) obj4;
                Object objRememberedValue4 = composer.rememberedValue();
                Object obj5 = objRememberedValue4;
                if (objRememberedValue4 == companion.getEmpty()) {
                    int[] iArr3 = new int[4];
                    for (int i12 = 0; i12 < 4; i12++) {
                        iArr3[i12] = 0;
                    }
                    composer.updateRememberedValue(iArr3);
                    obj5 = iArr3;
                }
                final int[] iArr4 = (int[]) obj5;
                Object objRememberedValue5 = composer.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                Object obj6 = objRememberedValue5;
                if (objRememberedValue5 == companion2.getEmpty()) {
                    Ref ref3 = new Ref();
                    ref3.setValue(Rect.INSTANCE.getZero());
                    composer.updateRememberedValue(ref3);
                    obj6 = ref3;
                }
                final Ref ref4 = (Ref) obj6;
                boolean zChangedInstance = composer.changedInstance(this) | composer.changed(str) | composer.changedInstance(iArr2) | composer.changedInstance(ref2) | composer.changedInstance(iArr4) | composer.changedInstance(ref4) | composer.changed(function2);
                final MotionLayoutScope motionLayoutScope = this;
                final Function2<Rect, Rect, Unit> function22 = function2;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == companion2.getEmpty()) {
                    Object obj7 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$onStartEndBoundsChanged$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            boolean z9;
                            WidgetFrame start = motionLayoutScope.measurer.getTransition().getStart(str);
                            int i13 = start.left;
                            int[] iArr5 = iArr2;
                            boolean z10 = true;
                            if (i13 == iArr5[0] && start.f18234top == iArr5[1] && start.right == iArr5[2] && start.bottom == iArr5[3]) {
                                z9 = false;
                            } else {
                                iArr5[0] = i13;
                                iArr5[1] = start.f18234top;
                                iArr5[2] = start.right;
                                iArr5[3] = start.bottom;
                                Ref<Rect> ref5 = ref2;
                                int[] iArr6 = iArr2;
                                ref5.setValue(new Rect(iArr6[0], iArr6[1], iArr6[2], iArr6[3]));
                                z9 = true;
                            }
                            WidgetFrame end = motionLayoutScope.measurer.getTransition().getEnd(str);
                            int i14 = end.left;
                            int[] iArr7 = iArr4;
                            if (i14 == iArr7[0] && end.f18234top == iArr7[1] && end.right == iArr7[2] && end.bottom == iArr7[3]) {
                                z10 = z9;
                            } else {
                                iArr7[0] = i14;
                                iArr7[1] = end.f18234top;
                                iArr7[2] = end.right;
                                iArr7[3] = end.bottom;
                                Ref<Rect> ref6 = ref4;
                                int[] iArr8 = iArr4;
                                ref6.setValue(new Rect(iArr8[0], iArr8[1], iArr8[2], iArr8[3]));
                            }
                            if (z10) {
                                Function2<Rect, Rect, Unit> function23 = function22;
                                Rect value = ref2.getValue();
                                if (value == null) {
                                    value = Rect.INSTANCE.getZero();
                                }
                                Rect value2 = ref4.getValue();
                                if (value2 == null) {
                                    value2 = Rect.INSTANCE.getZero();
                                }
                                function23.invoke(value, value2);
                            }
                        }
                    };
                    composer.updateRememberedValue(obj7);
                    objRememberedValue6 = obj7;
                }
                Modifier modifierOnPlaced = OnPlacedModifierKt.onPlaced(modifier2, (Function1) objRememberedValue6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierOnPlaced;
            }
        });
    }

    @Deprecated(message = "Deprecated for naming consistency", replaceWith = @ReplaceWith(expression = "customProperties(id)", imports = {}))
    public final MotionProperties motionProperties(String id, String tag) {
        return new MotionProperties(id, tag);
    }
}
