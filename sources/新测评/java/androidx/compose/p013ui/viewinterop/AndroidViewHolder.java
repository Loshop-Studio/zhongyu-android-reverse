package androidx.compose.p013ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.autofill.HintConstants;
import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p013ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.p013ui.node.OwnerScope;
import androidx.compose.p013ui.node.OwnerSnapshotObserver;
import androidx.compose.p013ui.platform.AndroidComposeView;
import androidx.compose.p013ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p013ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.VelocityKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 ´\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002´\u0001B7\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0012\u0010c\u001a\u00020\u001b2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J\b\u0010f\u001a\u00020gH\u0016J\u000e\u0010h\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`iJ\n\u0010j\u001a\u0004\u0018\u00010kH\u0016J\b\u0010l\u001a\u00020\u000bH\u0016J\u0010\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020nH\u0002J\u0010\u0010p\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J~\u0010q\u001a\u0002Hr\"\u0004\b\u0000\u0010r2\u0006\u0010\u0013\u001a\u0002Hr2`\u0010s\u001a\\\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(y\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(z\u0012\u0004\u0012\u0002Hr0tH\u0082\b¢\u0006\u0002\u0010{J\u001e\u0010|\u001a\u0004\u0018\u00010}2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0016J\u0007\u0010\u0080\u0001\u001a\u000209J\t\u0010\u0081\u0001\u001a\u00020\u001bH\u0016J$\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010\u0083\u0001\u001a\u00020\u000b2\u0007\u0010\u0084\u0001\u001a\u00020\u000b2\u0007\u0010\u0085\u0001\u001a\u00020\u000bH\u0002J\u001a\u0010\u0086\u0001\u001a\u00020\u001d2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u0088\u0001\u001a\u000209H\u0014J\t\u0010\u0089\u0001\u001a\u000209H\u0016J\u001b\u0010\u008a\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000fH\u0016J\t\u0010\u008d\u0001\u001a\u000209H\u0014J2\u0010\u008e\u0001\u001a\u0002092\u0007\u0010\u008f\u0001\u001a\u00020\u001b2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b2\u0006\u0010z\u001a\u00020\u000bH\u0014J\u001b\u0010\u0090\u0001\u001a\u0002092\u0007\u0010\u0091\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000bH\u0014J/\u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u001bH\u0016J&\u0010\u0098\u0001\u001a\u00020\u001b2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016J6\u0010\u0099\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020.2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J?\u0010\u009d\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000b2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0007\u0010 \u0001\u001a\u00020\u000b2\u0007\u0010¡\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016JH\u0010\u009d\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000b2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0007\u0010 \u0001\u001a\u00020\u000b2\u0007\u0010¡\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020.H\u0016J-\u0010¢\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\t\u0010¤\u0001\u001a\u000209H\u0016J\t\u0010¥\u0001\u001a\u000209H\u0016J-\u0010¦\u0001\u001a\u00020\u001b2\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\u001b\u0010§\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010¨\u0001\u001a\u0002092\u0007\u0010©\u0001\u001a\u00020\u000bH\u0014J\u0007\u0010ª\u0001\u001a\u000209J\u0012\u0010«\u0001\u001a\u0002092\u0007\u0010¬\u0001\u001a\u00020\u001bH\u0016J\t\u0010\u00ad\u0001\u001a\u00020\u001bH\u0016J3\u0010®\u0001\u001a\u00030¯\u0001*\u00030¯\u00012\u0007\u0010°\u0001\u001a\u00020\u000b2\u0007\u0010±\u0001\u001a\u00020\u000b2\u0007\u0010²\u0001\u001a\u00020\u000b2\u0007\u0010³\u0001\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u0013\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R(\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010>\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R(\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010G\u001a\b\u0012\u0004\u0012\u0002090F2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002090F@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR0\u0010L\u001a\b\u0012\u0004\u0012\u0002090F2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002090F@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\u0014\u0010O\u001a\b\u0012\u0004\u0012\u0002090FX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u0002090FX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010\u0013\u001a\u0004\u0018\u00010Q@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020XX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010YR\u0014\u0010Z\u001a\u00020[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R0\u0010^\u001a\b\u0012\u0004\u0012\u0002090F2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002090F@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010I\"\u0004\b`\u0010KR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006µ\u0001"}, m13558d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "context", "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "compositeKeyHash", "", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "view", "Landroid/view/View;", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "hasUpdateBlock", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "isDrawing", "isValidOwnerScope", "()Z", "lastHeightMeasureSpec", "lastWidthMeasureSpec", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", RequestParameters.SUBRESOURCE_LOCATION, "", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "onDensityChanged", "Lkotlin/Function1;", "", "getOnDensityChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnDensityChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "getOnModifierChanged$ui_release", "setOnModifierChanged$ui_release", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", RequestParameters.POSITION, "<set-?>", "Lkotlin/Function0;", "release", "getRelease", "()Lkotlin/jvm/functions/Function0;", "setRelease", "(Lkotlin/jvm/functions/Function0;)V", "reset", "getReset", "setReset", "runInvalidate", "runUpdate", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "update", "getUpdate", "setUpdate", "getView", "()Landroid/view/View;", "gatherTransparentRegion", "region", "Landroid/graphics/Region;", "getAccessibilityClassName", "", "getInteropView", "Landroidx/compose/ui/viewinterop/InteropView;", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "getNestedScrollAxes", "insetBounds", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "insetToLayoutPosition", "insetValue", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "l", "t", "r", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "invalidateChildInParent", "Landroid/view/ViewParent;", "dirty", "Landroid/graphics/Rect;", "invalidateOrDefer", "isNestedScrollingEnabled", "obtainMeasureSpec", "min", "max", "preferred", "onApplyWindowInsets", "v", "onAttachedToWindow", "onDeactivate", "onDescendantInvalidated", "child", TypedValues.AttributesType.S_TARGET, "onDetachedFromWindow", "onLayout", "changed", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "velocityX", "", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "axes", "onRelease", "onReuse", "onStartNestedScroll", "onStopNestedScroll", "onWindowVisibilityChanged", "visibility", "remeasure", "requestDisallowInterceptTouchEvent", "disallowIntercept", "shouldDelayChildPressedState", "inset", "Landroidx/core/graphics/Insets;", "left", "top", "right", "bottom", "Companion", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,737:1\n677#1,6:776\n683#1,2:783\n685#1:791\n686#1:802\n687#1,7:807\n677#1,6:814\n683#1,2:821\n685#1:829\n686#1:840\n687#1,7:845\n1#2:738\n56#3,5:739\n30#4:744\n30#4:748\n30#4:758\n30#4:762\n30#4:766\n30#4:803\n30#4:841\n30#4:866\n53#5,3:745\n53#5,3:749\n60#5:753\n70#5:756\n53#5,3:759\n53#5,3:763\n53#5,3:767\n60#5:771\n70#5:774\n85#5:787\n90#5:790\n53#5,3:804\n85#5:825\n90#5:828\n53#5,3:842\n85#5:856\n90#5:859\n85#5:862\n90#5:865\n53#5,3:867\n65#6:752\n69#6:755\n65#6:770\n69#6:773\n22#7:754\n22#7:757\n22#7:772\n22#7:775\n105#8:782\n105#8:820\n105#8:852\n105#8:853\n105#8:870\n105#8:871\n105#8:872\n105#8:873\n105#8:874\n105#8:875\n61#9:785\n54#9:786\n63#9:788\n59#9:789\n54#9,10:792\n61#9:823\n54#9:824\n63#9:826\n59#9:827\n54#9,10:830\n61#9:854\n54#9:855\n63#9:857\n59#9:858\n61#9:860\n54#9:861\n63#9:863\n59#9:864\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n*L\n668#1:776,6\n668#1:783,2\n668#1:791\n668#1:802\n668#1:807,7\n672#1:814,6\n672#1:821,2\n672#1:829\n672#1:840\n672#1:845,7\n199#1:739,5\n594#1:744\n595#1:748\n612#1:758\n613#1:762\n622#1:766\n668#1:803\n672#1:841\n686#1:866\n594#1:745,3\n595#1:749,3\n598#1:753\n599#1:756\n612#1:759,3\n613#1:763,3\n622#1:767,3\n625#1:771\n626#1:774\n668#1:787\n668#1:790\n668#1:804,3\n672#1:825\n672#1:828\n672#1:842,3\n684#1:856\n684#1:859\n685#1:862\n685#1:865\n686#1:867,3\n598#1:752\n599#1:755\n625#1:770\n626#1:773\n598#1:754\n599#1:757\n625#1:772\n626#1:775\n668#1:782\n672#1:820\n682#1:852\n683#1:853\n687#1:870\n688#1:871\n699#1:872\n700#1:873\n701#1:874\n702#1:875\n668#1:785\n668#1:786\n668#1:788\n668#1:789\n668#1:792,10\n672#1:823\n672#1:824\n672#1:826\n672#1:827\n672#1:830,10\n684#1:854\n684#1:855\n684#1:857\n684#1:858\n685#1:860\n685#1:861\n685#1:863\n685#1:864\n*E\n"})
/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private Function1<? super Density, Unit> onDensityChanged;
    private Function1<? super Modifier, Unit> onModifierChanged;
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private Function0<Unit> release;
    private Function0<Unit> reset;
    private final Function0<Unit> runInvalidate;
    private final Function0<Unit> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;
    private Function0<Unit> update;
    private final View view;
    public static final int $stable = 8;
    private static final Function1<AndroidViewHolder, Unit> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", m13596f = "AndroidViewHolder.android.kt", m13597i = {}, m13598l = {639, 641}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1 */
    public static final class C31371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31371(boolean z9, AndroidViewHolder androidViewHolder, long j10, Continuation<? super C31371> continuation) {
            super(2, continuation);
            this.$consumed = z9;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31371(this.$consumed, this.this$0, this.$viewVelocity, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.m22073dispatchPostFlingRZ2iAVY(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.m22073dispatchPostFlingRZ2iAVY(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r11)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r10
                goto L58
            L1f:
                kotlin.ResultKt.throwOnFailure(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L3f
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.p013ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p013ui.unit.Velocity.INSTANCE
                long r5 = r11.m23810getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m22073dispatchPostFlingRZ2iAVY(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L58
                goto L57
            L3f:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.p013ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p013ui.unit.Velocity.INSTANCE
                long r4 = r4.m23810getZero9UxMQ8M()
                r6.label = r11
                java.lang.Object r11 = r1.m22073dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.viewinterop.AndroidViewHolder.C31371.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", m13596f = "AndroidViewHolder.android.kt", m13597i = {}, m13598l = {650}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1 */
    public static final class C31381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31381(long j10, Continuation<? super C31381> continuation) {
            super(2, continuation);
            this.$toBeConsumed = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidViewHolder.this.new C31381(this.$toBeConsumed, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j10 = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m22075dispatchPreFlingQWom1Mo(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i10, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i10;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewCompat.setWindowInsetsAnimationCallback(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
                return AndroidViewHolder.this.insetToLayoutPosition(insets);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
                return AndroidViewHolder.this.insetBounds(bounds);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.reset = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.release = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.INSTANCE.m23737getZeroYbymL2g();
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        androidViewHolder.getSnapshotObserver().observeReads$ui_release(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setForceUseOldLayers(true);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m21136graphicsLayerAp8cVGQ$default(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner2 = layoutNode2.getOwner();
                    AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                WindowInsets windowInsets;
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
                int i11 = this.$this_run.position[0];
                int i12 = this.$this_run.position[1];
                this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
                long j10 = this.$this_run.size;
                this.$this_run.size = layoutCoordinates.mo22332getSizeYbymL2g();
                WindowInsetsCompat windowInsetsCompat = this.$this_run.insets;
                if (windowInsetsCompat != null) {
                    if ((i11 == this.$this_run.position[0] && i12 == this.$this_run.position[1] && IntSize.m23730equalsimpl0(j10, this.$this_run.size)) || (windowInsets = this.$this_run.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsets);
                }
            }
        });
        layoutNode.setCompositeKeyHash(i10);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
                invoke2(modifier);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierOnGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Density density) {
                layoutNode.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(this.$this_run, layoutNode);
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder = this.$this_run;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                if (ComposeUiFlags.isViewFocusFixEnabled && this.$this_run.hasFocus()) {
                    owner2.getFocusOwner().clearFocus(true);
                }
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int width) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int height) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, height, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicHeight(i11);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicWidth(i11);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m23516getMinWidthimpl(j10), Constraints.m23515getMinHeightimpl(j10), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                if (Constraints.m23516getMinWidthimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m23516getMinWidthimpl(j10));
                }
                if (Constraints.m23515getMinHeightimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m23515getMinHeightimpl(j10));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
                int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM23516getMinWidthimpl, iM23514getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10);
                int iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM23515getMinHeightimpl, iM23513getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicHeight(i11);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicWidth(i11);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final Insets inset(Insets insets, int i10, int i11, int i12, int i13) {
        int i14 = insets.left - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = insets.f18238top - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = insets.right - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = insets.bottom - i13;
        return Insets.m1665of(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat bounds) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM23706roundk4lQ0M = IntOffsetKt.m23706roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM23689getXimpl = IntOffset.m23689getXimpl(jM23706roundk4lQ0M);
            if (iM23689getXimpl < 0) {
                iM23689getXimpl = 0;
            }
            int iM23690getYimpl = IntOffset.m23690getYimpl(jM23706roundk4lQ0M);
            int i10 = iM23690getYimpl < 0 ? 0 : iM23690getYimpl;
            long jMo22332getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo22332getSizeYbymL2g();
            int i11 = (int) (jMo22332getSizeYbymL2g >> 32);
            int i12 = (int) (jMo22332getSizeYbymL2g & 4294967295L);
            long jMo22332getSizeYbymL2g2 = innerCoordinator$ui_release.mo22332getSizeYbymL2g();
            long jM23706roundk4lQ0M2 = IntOffsetKt.m23706roundk4lQ0M(innerCoordinator$ui_release.mo22335localToRootMKHz9U(Offset.m20727constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo22332getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo22332getSizeYbymL2g2 >> 32)) << 32))));
            int iM23689getXimpl2 = i11 - IntOffset.m23689getXimpl(jM23706roundk4lQ0M2);
            if (iM23689getXimpl2 < 0) {
                iM23689getXimpl2 = 0;
            }
            int iM23690getYimpl2 = i12 - IntOffset.m23690getYimpl(jM23706roundk4lQ0M2);
            int i13 = iM23690getYimpl2 >= 0 ? iM23690getYimpl2 : 0;
            if (iM23689getXimpl != 0 || i10 != 0 || iM23689getXimpl2 != 0 || i13 != 0) {
                int i14 = iM23689getXimpl;
                int i15 = iM23689getXimpl2;
                return new WindowInsetsAnimationCompat.BoundsCompat(inset(bounds.getLowerBound(), i14, i10, i15, i13), inset(bounds.getUpperBound(), i14, i10, i15, i13));
            }
        }
        return bounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat insets) {
        if (insets.hasInsets()) {
            NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
            if (innerCoordinator$ui_release.isAttached()) {
                long jM23706roundk4lQ0M = IntOffsetKt.m23706roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
                int iM23689getXimpl = IntOffset.m23689getXimpl(jM23706roundk4lQ0M);
                if (iM23689getXimpl < 0) {
                    iM23689getXimpl = 0;
                }
                int iM23690getYimpl = IntOffset.m23690getYimpl(jM23706roundk4lQ0M);
                if (iM23690getYimpl < 0) {
                    iM23690getYimpl = 0;
                }
                long jMo22332getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo22332getSizeYbymL2g();
                int i10 = (int) (jMo22332getSizeYbymL2g >> 32);
                int i11 = (int) (jMo22332getSizeYbymL2g & 4294967295L);
                long jMo22332getSizeYbymL2g2 = innerCoordinator$ui_release.mo22332getSizeYbymL2g();
                long jM23706roundk4lQ0M2 = IntOffsetKt.m23706roundk4lQ0M(innerCoordinator$ui_release.mo22335localToRootMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits((int) (jMo22332getSizeYbymL2g2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo22332getSizeYbymL2g2 >> 32)) << 32))));
                int iM23689getXimpl2 = i10 - IntOffset.m23689getXimpl(jM23706roundk4lQ0M2);
                if (iM23689getXimpl2 < 0) {
                    iM23689getXimpl2 = 0;
                }
                int iM23690getYimpl2 = i11 - IntOffset.m23690getYimpl(jM23706roundk4lQ0M2);
                int i12 = iM23690getYimpl2 < 0 ? 0 : iM23690getYimpl2;
                if (iM23689getXimpl != 0 || iM23690getYimpl != 0 || iM23689getXimpl2 != 0 || i12 != 0) {
                    return insets.inset(iM23689getXimpl, iM23690getYimpl, iM23689getXimpl2, i12);
                }
            }
        }
        return insets;
    }

    private final <T> T insetValue(T value, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> block) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM23706roundk4lQ0M = IntOffsetKt.m23706roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM23689getXimpl = IntOffset.m23689getXimpl(jM23706roundk4lQ0M);
            if (iM23689getXimpl < 0) {
                iM23689getXimpl = 0;
            }
            int iM23690getYimpl = IntOffset.m23690getYimpl(jM23706roundk4lQ0M);
            if (iM23690getYimpl < 0) {
                iM23690getYimpl = 0;
            }
            long jMo22332getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo22332getSizeYbymL2g();
            int i10 = (int) (jMo22332getSizeYbymL2g >> 32);
            int i11 = (int) (jMo22332getSizeYbymL2g & 4294967295L);
            long jMo22332getSizeYbymL2g2 = innerCoordinator$ui_release.mo22332getSizeYbymL2g();
            long jM23706roundk4lQ0M2 = IntOffsetKt.m23706roundk4lQ0M(innerCoordinator$ui_release.mo22335localToRootMKHz9U(Offset.m20727constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo22332getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo22332getSizeYbymL2g2 >> 32)) << 32))));
            int iM23689getXimpl2 = i10 - IntOffset.m23689getXimpl(jM23706roundk4lQ0M2);
            if (iM23689getXimpl2 < 0) {
                iM23689getXimpl2 = 0;
            }
            int iM23690getYimpl2 = i11 - IntOffset.m23690getYimpl(jM23706roundk4lQ0M2);
            int i12 = iM23690getYimpl2 >= 0 ? iM23690getYimpl2 : 0;
            if (iM23689getXimpl != 0 || iM23690getYimpl != 0 || iM23689getXimpl2 != 0 || i12 != 0) {
                return block.invoke(Integer.valueOf(iM23689getXimpl), Integer.valueOf(iM23690getYimpl), Integer.valueOf(iM23689getXimpl2), Integer.valueOf(i12));
            }
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui_release();
            return;
        }
        View view = this.view;
        final Function0<Unit> function0 = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        });
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.p013ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v9, WindowInsetsCompat insets) {
        this.insets = new WindowInsetsCompat(insets);
        return insetToLayoutPosition(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled && hasFocus() && isInTouchMode() && Build.VERSION.SDK_INT > 28) {
            findFocus().clearFocus();
        }
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        this.view.layout(0, 0, r10 - l10, b10 - t10);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new C31371(consumed, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new C31381(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dx);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dy);
            long jM22076dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m22076dispatchPreScrollOzD1aCk(Offset.m20727constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM22076dispatchPreScrollOzD1aCk >> 32)));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM22076dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dyConsumed);
            long jM20727constructorimpl = Offset.m20727constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed);
            long jM22074dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m22074dispatchPostScrollDzOQY0M(jM20727constructorimpl, Offset.m20727constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM22074dispatchPostScrollDzOQY0M >> 32)));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM22074dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View target, int type) {
        this.nestedScrollingParentHelper.onStopNestedScroll(target, type);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void remeasure() {
        int i10;
        int i11 = this.lastWidthMeasureSpec;
        if (i11 == Integer.MIN_VALUE || (i10 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dyConsumed);
            long jM20727constructorimpl = Offset.m20727constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed);
            nestedScrollDispatcher.m22074dispatchPostScrollDzOQY0M(jM20727constructorimpl, Offset.m20727constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
        }
    }
}
