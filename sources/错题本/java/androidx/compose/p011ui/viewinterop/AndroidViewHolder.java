package androidx.compose.p011ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.C6892ViewTreeLifecycleOwner;
import android.view.C6895ViewTreeSavedStateRegistryOwner;
import android.view.LifecycleOwner;
import android.view.SavedStateRegistryOwner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p011ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.node.Owner;
import androidx.compose.p011ui.node.OwnerScope;
import androidx.compose.p011ui.node.OwnerSnapshotObserver;
import androidx.compose.p011ui.platform.AndroidComposeView;
import androidx.compose.p011ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p011ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DensityKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.VelocityKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ü\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u0010\u001cJ\u000f\u00103\u001a\u00020\u001aH\u0014¢\u0006\u0004\b3\u0010\u001cJ%\u00109\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u001a¢\u0006\u0004\b?\u0010\u001cJ\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\nH\u0014¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020$2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020$H\u0016¢\u0006\u0004\bG\u0010HJ/\u0010K\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010NJ/\u0010O\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010RJG\u0010X\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\u0006\u0010V\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010W\u001a\u000204H\u0016¢\u0006\u0004\bX\u0010YJ?\u0010X\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\u0006\u0010V\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010ZJ7\u0010]\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\n2\u0006\u0010W\u001a\u0002042\u0006\u0010J\u001a\u00020\nH\u0016¢\u0006\u0004\b]\u0010^J/\u0010b\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020_2\u0006\u0010W\u001a\u00020$H\u0016¢\u0006\u0004\bb\u0010cJ'\u0010d\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020_H\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020$H\u0016¢\u0006\u0004\bf\u0010HJ\u001f\u0010j\u001a\u00020h2\u0006\u0010g\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ'\u0010o\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n2\u0006\u0010n\u001a\u00020\nH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020h2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020s2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u0080\u0001\u0010}\u001a\u00028\u0000\"\u0004\b\u0000\u0010w2\u0006\u0010x\u001a\u00028\u00002`\u0010|\u001a\\\u0012\u0013\u0012\u00110\n¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\n¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\n¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\n¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b()\u0012\u0004\u0012\u00028\u00000yH\u0082\b¢\u0006\u0004\b}\u0010~J:\u0010\u0084\u0001\u001a\u00020\u007f*\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0086\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0087\u0001R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\u0016R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008a\u0001R?\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00012\r\u0010x\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R@\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u008d\u0001\u001a\u0006\b\u0096\u0001\u0010\u008f\u0001\"\u0006\b\u0097\u0001\u0010\u0091\u0001R@\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u008d\u0001\u001a\u0006\b\u0099\u0001\u0010\u008f\u0001\"\u0006\b\u009a\u0001\u0010\u0091\u0001R3\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010x\u001a\u00030\u009b\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R9\u0010£\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R3\u0010ª\u0001\u001a\u00030©\u00012\u0007\u0010x\u001a\u00030©\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R9\u0010°\u0001\u001a\u0012\u0012\u0005\u0012\u00030©\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010¤\u0001\u001a\u0006\b±\u0001\u0010¦\u0001\"\u0006\b²\u0001\u0010¨\u0001R7\u0010´\u0001\u001a\u0005\u0018\u00010³\u00012\t\u0010x\u001a\u0005\u0018\u00010³\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R7\u0010»\u0001\u001a\u0005\u0018\u00010º\u00012\t\u0010x\u001a\u0005\u0018\u00010º\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Á\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R \u0010Ä\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010Æ\u0001R\u001e\u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010\u008d\u0001R\u001e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u008d\u0001R8\u0010É\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010¤\u0001\u001a\u0006\bÊ\u0001\u0010¦\u0001\"\u0006\bË\u0001\u0010¨\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010Â\u0001R\u0019\u0010Ì\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0086\u0001R\u0019\u0010Í\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0086\u0001R\u0018\u0010Ï\u0001\u001a\u00030Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u0019\u0010Ñ\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010\u0093\u0001R\u001d\u0010Ó\u0001\u001a\u00030Ò\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0016\u0010×\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010HR\u0018\u0010Û\u0001\u001a\u00030Ø\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ý\u0001"}, m5110d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Ld6/s;", "onReuse", "()V", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "remeasure", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", RequestParameters.SUBRESOURCE_LOCATION, "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", TypedValues.AttributesType.S_TARGET, "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "invalidateOrDefer", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "min", "max", "preferred", "obtainMeasureSpec", "(III)I", "insetToLayoutPosition", "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "insetBounds", "(Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "block", "insetValue", "(Ljava/lang/Object;Lr6/g;)Ljava/lang/Object;", "Landroidx/core/graphics/Insets;", "left", "top", "right", "bottom", "inset", "(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;", "I", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroid/view/View;", "getView", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", "update", "Lr6/a;", "getUpdate", "()Lr6/a;", "setUpdate", "(Lr6/a;)V", "hasUpdateBlock", "Z", "<set-?>", "reset", "getReset", "setReset", "release", "getRelease", "setRelease", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Lkotlin/Function1;", "onModifierChanged", "Lr6/c;", "getOnModifierChanged$ui_release", "()Lr6/c;", "setOnModifierChanged$ui_release", "(Lr6/c;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "onDensityChanged", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", RequestParameters.POSITION, "[I", "Landroidx/compose/ui/unit/IntSize;", "size", "J", "Landroidx/core/view/WindowInsetsCompat;", "runUpdate", "runInvalidate", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/NestedScrollingParentHelper;", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Companion", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,737:1\n677#1,6:776\n683#1,2:783\n685#1:791\n686#1:802\n687#1,7:807\n677#1,6:814\n683#1,2:821\n685#1:829\n686#1:840\n687#1,7:845\n1#2:738\n56#3,5:739\n30#4:744\n30#4:748\n30#4:758\n30#4:762\n30#4:766\n30#4:803\n30#4:841\n30#4:866\n53#5,3:745\n53#5,3:749\n60#5:753\n70#5:756\n53#5,3:759\n53#5,3:763\n53#5,3:767\n60#5:771\n70#5:774\n85#5:787\n90#5:790\n53#5,3:804\n85#5:825\n90#5:828\n53#5,3:842\n85#5:856\n90#5:859\n85#5:862\n90#5:865\n53#5,3:867\n65#6:752\n69#6:755\n65#6:770\n69#6:773\n22#7:754\n22#7:757\n22#7:772\n22#7:775\n105#8:782\n105#8:820\n105#8:852\n105#8:853\n105#8:870\n105#8:871\n105#8:872\n105#8:873\n105#8:874\n105#8:875\n61#9:785\n54#9:786\n63#9:788\n59#9:789\n54#9,10:792\n61#9:823\n54#9:824\n63#9:826\n59#9:827\n54#9,10:830\n61#9:854\n54#9:855\n63#9:857\n59#9:858\n61#9:860\n54#9:861\n63#9:863\n59#9:864\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n*L\n668#1:776,6\n668#1:783,2\n668#1:791\n668#1:802\n668#1:807,7\n672#1:814,6\n672#1:821,2\n672#1:829\n672#1:840\n672#1:845,7\n199#1:739,5\n594#1:744\n595#1:748\n612#1:758\n613#1:762\n622#1:766\n668#1:803\n672#1:841\n686#1:866\n594#1:745,3\n595#1:749,3\n598#1:753\n599#1:756\n612#1:759,3\n613#1:763,3\n622#1:767,3\n625#1:771\n626#1:774\n668#1:787\n668#1:790\n668#1:804,3\n672#1:825\n672#1:828\n672#1:842,3\n684#1:856\n684#1:859\n685#1:862\n685#1:865\n686#1:867,3\n598#1:752\n599#1:755\n625#1:770\n626#1:773\n598#1:754\n599#1:757\n625#1:772\n626#1:775\n668#1:782\n672#1:820\n682#1:852\n683#1:853\n687#1:870\n688#1:871\n699#1:872\n700#1:873\n701#1:874\n702#1:875\n668#1:785\n668#1:786\n668#1:788\n668#1:789\n668#1:792,10\n672#1:823\n672#1:824\n672#1:826\n672#1:827\n672#1:830,10\n684#1:854\n684#1:855\n684#1:857\n684#1:858\n685#1:860\n685#1:861\n685#1:863\n685#1:864\n*E\n"})
/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    private final int compositeKeyHash;

    @NotNull
    private Density density;

    @NotNull
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;

    @Nullable
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private LifecycleOwner lifecycleOwner;

    @NotNull
    private final int[] location;

    @NotNull
    private Modifier modifier;

    @NotNull
    private final NestedScrollingParentHelper nestedScrollingParentHelper;

    @Nullable
    private InterfaceC6471c onDensityChanged;

    @Nullable
    private InterfaceC6471c onModifierChanged;

    @Nullable
    private InterfaceC6471c onRequestDisallowInterceptTouchEvent;

    @NotNull
    private final Owner owner;

    @NotNull
    private final int[] position;

    @NotNull
    private InterfaceC6469a release;

    @NotNull
    private InterfaceC6469a reset;

    @NotNull
    private final InterfaceC6469a runInvalidate;

    @NotNull
    private final InterfaceC6469a runUpdate;

    @Nullable
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;

    @NotNull
    private InterfaceC6469a update;

    @NotNull
    private final View view;
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC6471c OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", m5303f = "AndroidViewHolder.android.kt", m5304i = {}, m5305l = {639, 641}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1 */
    public static final class C23351 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23351(boolean z8, AndroidViewHolder androidViewHolder, long j7, InterfaceC5631c<? super C23351> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$consumed = z8;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C23351(this.$consumed, this.this$0, this.$viewVelocity, interfaceC5631c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r4.m11781dispatchPostFlingRZ2iAVY(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            if (r1.m11781dispatchPostFlingRZ2iAVY(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
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
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.AbstractC5774b.m5119b(r11)
                goto L56
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                kotlin.AbstractC5774b.m5119b(r11)
                r6 = r10
                goto L56
            L1d:
                kotlin.AbstractC5774b.m5119b(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L3d
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.p011ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p011ui.unit.Velocity.INSTANCE
                long r5 = r11.m13554getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m11781dispatchPostFlingRZ2iAVY(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L56
                goto L55
            L3d:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.p011ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p011ui.unit.Velocity.INSTANCE
                long r4 = r4.m13554getZero9UxMQ8M()
                r6.label = r11
                java.lang.Object r11 = r1.m11781dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L56
            L55:
                return r0
            L56:
                d6.s r11 = p045d6.C5443s.f8405a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.viewinterop.AndroidViewHolder.C23351.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C23351) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", m5303f = "AndroidViewHolder.android.kt", m5304i = {}, m5305l = {650}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1 */
    public static final class C23361 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23361(long j7, InterfaceC5631c<? super C23361> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$toBeConsumed = j7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return AndroidViewHolder.this.new C23361(this.$toBeConsumed, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j7 = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m11783dispatchPreFlingQWom1Mo(j7, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C23361) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(@NotNull Context context, @Nullable CompositionContext compositionContext, int i, @NotNull NestedScrollDispatcher nestedScrollDispatcher, @NotNull View view, @NotNull Owner owner) {
        super(context);
        this.compositeKeyHash = i;
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
        this.update = new InterfaceC6469a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13559invoke() {
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13559invoke();
                return C5443s.f8405a;
            }
        };
        this.reset = new InterfaceC6469a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13556invoke() {
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13556invoke();
                return C5443s.f8405a;
            }
        };
        this.release = new InterfaceC6469a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13555invoke() {
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13555invoke();
                return C5443s.f8405a;
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.INSTANCE.m13481getZeroYbymL2g();
        this.runUpdate = new InterfaceC6469a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13558invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13558invoke() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        androidViewHolder.getSnapshotObserver().observeReads$ui_release(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new InterfaceC6469a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13557invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13557invoke() {
                this.this$0.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setForceUseOldLayers(true);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m10842graphicsLayerAp8cVGQ$default(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }
        }), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DrawScope drawScope) {
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
        }), new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                WindowInsets windowInsets;
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
                int i8 = this.$this_run.position[0];
                int i9 = this.$this_run.position[1];
                this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
                long j7 = this.$this_run.size;
                this.$this_run.size = layoutCoordinates.mo12041getSizeYbymL2g();
                WindowInsetsCompat windowInsetsCompat = this.$this_run.insets;
                if (windowInsetsCompat != null) {
                    if ((i8 == this.$this_run.position[0] && i9 == this.$this_run.position[1] && IntSize.m13474equalsimpl0(j7, this.$this_run.size)) || (windowInsets = this.$this_run.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsets);
                }
            }
        });
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Modifier) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierOnGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Density) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Density density) {
                layoutNode.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Owner owner2) {
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
        layoutNode.setOnDetach$ui_release(new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Owner owner2) {
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
                AbstractC5830k.m5327d(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int height) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                AbstractC5830k.m5327d(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, height, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
                return intrinsicHeight(i8);
            }

            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
                return intrinsicWidth(i8);
            }

            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo6545measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j7) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m13260getMinWidthimpl(j7), Constraints.m13259getMinHeightimpl(j7), null, new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return C5443s.f8405a;
                        }
                    }, 4, null);
                }
                if (Constraints.m13260getMinWidthimpl(j7) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m13260getMinWidthimpl(j7));
                }
                if (Constraints.m13259getMinHeightimpl(j7) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m13259getMinHeightimpl(j7));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
                int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                AbstractC5830k.m5327d(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM13260getMinWidthimpl, iM13258getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
                int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                AbstractC5830k.m5327d(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM13259getMinHeightimpl, iM13257getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
                return intrinsicHeight(i8);
            }

            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
                return intrinsicWidth(i8);
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

    private final Insets inset(Insets insets, int i, int i8, int i9, int i10) {
        int i11 = insets.left - i;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = insets.f11683top - i8;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = insets.right - i9;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = insets.bottom - i10;
        return Insets.m1565of(i11, i12, i13, i14 >= 0 ? i14 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat bounds) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM13450roundk4lQ0M = IntOffsetKt.m13450roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM13433getXimpl = IntOffset.m13433getXimpl(jM13450roundk4lQ0M);
            if (iM13433getXimpl < 0) {
                iM13433getXimpl = 0;
            }
            int iM13434getYimpl = IntOffset.m13434getYimpl(jM13450roundk4lQ0M);
            int i = iM13434getYimpl < 0 ? 0 : iM13434getYimpl;
            long jMo12041getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo12041getSizeYbymL2g();
            int i8 = (int) (jMo12041getSizeYbymL2g >> 32);
            int i9 = (int) (jMo12041getSizeYbymL2g & 4294967295L);
            long jMo12041getSizeYbymL2g2 = innerCoordinator$ui_release.mo12041getSizeYbymL2g();
            long jM13450roundk4lQ0M2 = IntOffsetKt.m13450roundk4lQ0M(innerCoordinator$ui_release.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g2 >> 32)) << 32))));
            int iM13433getXimpl2 = i8 - IntOffset.m13433getXimpl(jM13450roundk4lQ0M2);
            if (iM13433getXimpl2 < 0) {
                iM13433getXimpl2 = 0;
            }
            int iM13434getYimpl2 = i9 - IntOffset.m13434getYimpl(jM13450roundk4lQ0M2);
            int i10 = iM13434getYimpl2 >= 0 ? iM13434getYimpl2 : 0;
            if (iM13433getXimpl != 0 || i != 0 || iM13433getXimpl2 != 0 || i10 != 0) {
                int i11 = iM13433getXimpl;
                int i12 = iM13433getXimpl2;
                return new WindowInsetsAnimationCompat.BoundsCompat(inset(bounds.getLowerBound(), i11, i, i12, i10), inset(bounds.getUpperBound(), i11, i, i12, i10));
            }
        }
        return bounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat insets) {
        if (insets.hasInsets()) {
            NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
            if (innerCoordinator$ui_release.isAttached()) {
                long jM13450roundk4lQ0M = IntOffsetKt.m13450roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
                int iM13433getXimpl = IntOffset.m13433getXimpl(jM13450roundk4lQ0M);
                if (iM13433getXimpl < 0) {
                    iM13433getXimpl = 0;
                }
                int iM13434getYimpl = IntOffset.m13434getYimpl(jM13450roundk4lQ0M);
                if (iM13434getYimpl < 0) {
                    iM13434getYimpl = 0;
                }
                long jMo12041getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo12041getSizeYbymL2g();
                int i = (int) (jMo12041getSizeYbymL2g >> 32);
                int i8 = (int) (jMo12041getSizeYbymL2g & 4294967295L);
                long jMo12041getSizeYbymL2g2 = innerCoordinator$ui_release.mo12041getSizeYbymL2g();
                long jM13450roundk4lQ0M2 = IntOffsetKt.m13450roundk4lQ0M(innerCoordinator$ui_release.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g2 >> 32)) << 32))));
                int iM13433getXimpl2 = i - IntOffset.m13433getXimpl(jM13450roundk4lQ0M2);
                if (iM13433getXimpl2 < 0) {
                    iM13433getXimpl2 = 0;
                }
                int iM13434getYimpl2 = i8 - IntOffset.m13434getYimpl(jM13450roundk4lQ0M2);
                int i9 = iM13434getYimpl2 < 0 ? 0 : iM13434getYimpl2;
                if (iM13433getXimpl != 0 || iM13434getYimpl != 0 || iM13433getXimpl2 != 0 || i9 != 0) {
                    return insets.inset(iM13433getXimpl, iM13434getYimpl, iM13433getXimpl2, i9);
                }
            }
        }
        return insets;
    }

    private final <T> T insetValue(T value, InterfaceC6475g block) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM13450roundk4lQ0M = IntOffsetKt.m13450roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM13433getXimpl = IntOffset.m13433getXimpl(jM13450roundk4lQ0M);
            if (iM13433getXimpl < 0) {
                iM13433getXimpl = 0;
            }
            int iM13434getYimpl = IntOffset.m13434getYimpl(jM13450roundk4lQ0M);
            if (iM13434getYimpl < 0) {
                iM13434getYimpl = 0;
            }
            long jMo12041getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo12041getSizeYbymL2g();
            int i = (int) (jMo12041getSizeYbymL2g >> 32);
            int i8 = (int) (jMo12041getSizeYbymL2g & 4294967295L);
            long jMo12041getSizeYbymL2g2 = innerCoordinator$ui_release.mo12041getSizeYbymL2g();
            long jM13450roundk4lQ0M2 = IntOffsetKt.m13450roundk4lQ0M(innerCoordinator$ui_release.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g2 >> 32)) << 32))));
            int iM13433getXimpl2 = i - IntOffset.m13433getXimpl(jM13450roundk4lQ0M2);
            if (iM13433getXimpl2 < 0) {
                iM13433getXimpl2 = 0;
            }
            int iM13434getYimpl2 = i8 - IntOffset.m13434getYimpl(jM13450roundk4lQ0M2);
            int i9 = iM13434getYimpl2 >= 0 ? iM13434getYimpl2 : 0;
            if (iM13433getXimpl != 0 || iM13434getYimpl != 0 || iM13433getXimpl2 != 0 || i9 != 0) {
                return (T) block.invoke(Integer.valueOf(iM13433getXimpl), Integer.valueOf(iM13434getYimpl), Integer.valueOf(iM13433getXimpl2), Integer.valueOf(i9));
            }
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(AbstractC5806u.m5274m(preferred, min, max), BasicMeasure.EXACTLY) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, BasicMeasure.EXACTLY) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@Nullable Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + this.location[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Nullable
    /* renamed from: getOnDensityChanged$ui_release, reason: from getter */
    public final InterfaceC6471c getOnDensityChanged() {
        return this.onDensityChanged;
    }

    @Nullable
    /* renamed from: getOnModifierChanged$ui_release, reason: from getter */
    public final InterfaceC6471c getOnModifierChanged() {
        return this.onModifierChanged;
    }

    @Nullable
    /* renamed from: getOnRequestDisallowInterceptTouchEvent$ui_release, reason: from getter */
    public final InterfaceC6471c getOnRequestDisallowInterceptTouchEvent() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @NotNull
    public final InterfaceC6469a getRelease() {
        return this.release;
    }

    @NotNull
    public final InterfaceC6469a getReset() {
        return this.reset;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @NotNull
    public final InterfaceC6469a getUpdate() {
        return this.update;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] location, @Nullable Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing) {
            this.view.postOnAnimation(new RunnableC2340a(this.runInvalidate, 1));
        } else {
            this.layoutNode.invalidateLayer$ui_release();
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.p011ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NotNull
    public WindowInsetsCompat onApplyWindowInsets(@NotNull View v2, @NotNull WindowInsetsCompat insets) {
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
    public void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t8, int r, int b6) {
        this.view.layout(0, 0, r - l, b6 - t8);
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
    public boolean onNestedFling(@NotNull View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC6014x.m5651v(this.dispatcher.getCoroutineScope(), null, null, new C23351(consumed, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC6014x.m5651v(this.dispatcher.getCoroutineScope(), null, null, new C23361(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View target, int dx, int dy, @NotNull int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dx);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dy);
            long jM11784dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m11784dispatchPreScrollOzD1aCk(Offset.m10433constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM11784dispatchPreScrollOzD1aCk >> 32)));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM11784dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @NotNull int[] consumed) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dyConsumed);
            long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed);
            long jM11782dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m11782dispatchPostScrollDzOQY0M(jM10433constructorimpl, Offset.m10433constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM11782dispatchPostScrollDzOQY0M >> 32)));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM11782dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull View child, @NotNull View target, int axes, int type) {
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
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View target, int type) {
        this.nestedScrollingParentHelper.onStopNestedScroll(target, type);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void remeasure() {
        int i;
        int i8 = this.lastWidthMeasureSpec;
        if (i8 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i8, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        InterfaceC6471c interfaceC6471c = this.onRequestDisallowInterceptTouchEvent;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(@NotNull Density density) {
        if (density != this.density) {
            this.density = density;
            InterfaceC6471c interfaceC6471c = this.onDensityChanged;
            if (interfaceC6471c != null) {
                interfaceC6471c.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            C6892ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            InterfaceC6471c interfaceC6471c = this.onModifierChanged;
            if (interfaceC6471c != null) {
                interfaceC6471c.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onDensityChanged = interfaceC6471c;
    }

    public final void setOnModifierChanged$ui_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onModifierChanged = interfaceC6471c;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onRequestDisallowInterceptTouchEvent = interfaceC6471c;
    }

    public final void setRelease(@NotNull InterfaceC6469a interfaceC6469a) {
        this.release = interfaceC6469a;
    }

    public final void setReset(@NotNull InterfaceC6469a interfaceC6469a) {
        this.reset = interfaceC6469a;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            C6895ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@NotNull InterfaceC6469a interfaceC6469a) {
        this.update = interfaceC6469a;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dyConsumed);
            long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed);
            nestedScrollDispatcher.m11782dispatchPostScrollDzOQY0M(jM10433constructorimpl, Offset.m10433constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
        }
    }
}
