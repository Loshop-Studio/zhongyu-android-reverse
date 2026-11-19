package androidx.compose.p012ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.p012ui.ComposeUiFlags;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.SessionMutex;
import androidx.compose.p012ui.autofill.AbstractC2575c;
import androidx.compose.p012ui.autofill.AbstractC2577d;
import androidx.compose.p012ui.autofill.AndroidAutofill;
import androidx.compose.p012ui.autofill.AndroidAutofillManager;
import androidx.compose.p012ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.p012ui.autofill.Autofill;
import androidx.compose.p012ui.autofill.AutofillCallback;
import androidx.compose.p012ui.autofill.AutofillTree;
import androidx.compose.p012ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.p012ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.p012ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.p012ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.p012ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p012ui.focus.FocusDirection;
import androidx.compose.p012ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.p012ui.focus.FocusOwner;
import androidx.compose.p012ui.focus.FocusOwnerImpl;
import androidx.compose.p012ui.focus.FocusOwnerImplKt;
import androidx.compose.p012ui.focus.FocusTargetNode;
import androidx.compose.p012ui.focus.FocusTraversalKt;
import androidx.compose.p012ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.p012ui.graphics.Canvas;
import androidx.compose.p012ui.graphics.CanvasHolder;
import androidx.compose.p012ui.graphics.GraphicsContext;
import androidx.compose.p012ui.graphics.Matrix;
import androidx.compose.p012ui.graphics.RectHelper_androidKt;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.graphics.layer.GraphicsLayer;
import androidx.compose.p012ui.hapticfeedback.HapticFeedback;
import androidx.compose.p012ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.p012ui.input.InputMode;
import androidx.compose.p012ui.input.InputModeManager;
import androidx.compose.p012ui.input.InputModeManagerImpl;
import androidx.compose.p012ui.input.key.Key;
import androidx.compose.p012ui.input.key.KeyEvent;
import androidx.compose.p012ui.input.key.KeyEventType;
import androidx.compose.p012ui.input.key.KeyEvent_androidKt;
import androidx.compose.p012ui.input.key.KeyInputModifierKt;
import androidx.compose.p012ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p012ui.input.pointer.MotionEventAdapter;
import androidx.compose.p012ui.input.pointer.PointerIcon;
import androidx.compose.p012ui.input.pointer.PointerIconService;
import androidx.compose.p012ui.input.pointer.PointerInputEvent;
import androidx.compose.p012ui.input.pointer.PointerInputEventData;
import androidx.compose.p012ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.p012ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.p012ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p012ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p012ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p012ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p012ui.internal.InlineClassHelperKt;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.layout.PlaceableKt;
import androidx.compose.p012ui.layout.RootMeasurePolicy;
import androidx.compose.p012ui.modifier.ModifierLocalManager;
import androidx.compose.p012ui.node.DelegatableNode;
import androidx.compose.p012ui.node.DelegatableNodeKt;
import androidx.compose.p012ui.node.DelegatingNode;
import androidx.compose.p012ui.node.LayoutNode;
import androidx.compose.p012ui.node.LayoutNodeDrawScope;
import androidx.compose.p012ui.node.MeasureAndLayoutDelegate;
import androidx.compose.p012ui.node.ModifierNodeElement;
import androidx.compose.p012ui.node.NodeKind;
import androidx.compose.p012ui.node.OwnedLayer;
import androidx.compose.p012ui.node.Owner;
import androidx.compose.p012ui.node.OwnerSnapshotObserver;
import androidx.compose.p012ui.node.PointerInputModifierNode;
import androidx.compose.p012ui.node.RootForTest;
import androidx.compose.p012ui.platform.AndroidComposeView;
import androidx.compose.p012ui.platform.ViewLayer;
import androidx.compose.p012ui.scrollcapture.ScrollCapture;
import androidx.compose.p012ui.semantics.EmptySemanticsElement;
import androidx.compose.p012ui.semantics.EmptySemanticsModifier;
import androidx.compose.p012ui.semantics.SemanticsOwner;
import androidx.compose.p012ui.spatial.RectManager;
import androidx.compose.p012ui.text.font.Font;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.p012ui.text.input.TextInputService;
import androidx.compose.p012ui.text.input.TextInputServiceAndroid;
import androidx.compose.p012ui.unit.AndroidDensity_androidKt;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.DensityKt;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntOffsetKt;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.p012ui.unit.LayoutDirection;
import androidx.compose.p012ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000Í\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f*\u00034Õ\u0001\b\u0000\u0018\u0000 ®\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004®\u0004¯\u0004B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001b\u0010¯\u0002\u001a\u00020E2\b\u0010\u0096\u0002\u001a\u00030°\u00022\b\u0010±\u0002\u001a\u00030«\u0001J&\u0010²\u0002\u001a\u00020E2\u0007\u0010³\u0002\u001a\u00020V2\b\u0010´\u0002\u001a\u00030µ\u00022\b\u0010¶\u0002\u001a\u00030·\u0002H\u0002J\u0015\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u0002H\u0016J!\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\n\u0010º\u0002\u001a\u0005\u0018\u00010»\u0002H\u0016J\u001e\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010¼\u0002\u001a\u00020VH\u0016J*\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010¼\u0002\u001a\u00020V2\n\u0010º\u0002\u001a\u0005\u0018\u00010»\u0002H\u0016J'\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010½\u0002\u001a\u00020V2\u0007\u0010¾\u0002\u001a\u00020VH\u0016J\u0019\u0010'\u001a\u00020E2\u000f\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030Á\u00020À\u0002H\u0016J\t\u0010Â\u0002\u001a\u00020zH\u0002J\u0010\u0010Ã\u0002\u001a\u00020EH\u0086@¢\u0006\u0003\u0010Ä\u0002J\u0010\u0010Å\u0002\u001a\u00020EH\u0086@¢\u0006\u0003\u0010Ä\u0002J \u0010Æ\u0002\u001a\u00030\u0098\u00012\b\u0010Ç\u0002\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÈ\u0002\u0010É\u0002J \u0010Ê\u0002\u001a\u00030\u0098\u00012\b\u0010Ë\u0002\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÌ\u0002\u0010É\u0002J\u0012\u0010Í\u0002\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020VH\u0016J\u0012\u0010Ï\u0002\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020VH\u0016J\u0012\u0010Ð\u0002\u001a\u00020E2\u0007\u0010Ñ\u0002\u001a\u00020\u0001H\u0002J\"\u0010Ò\u0002\u001a\u00030Ó\u00022\u0007\u0010Ô\u0002\u001a\u00020VH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÕ\u0002\u0010Ö\u0002Jq\u0010×\u0002\u001a\u00020`2B\u0010Ø\u0002\u001a=\u0012\u0017\u0012\u00150Ú\u0002¢\u0006\u000f\bÛ\u0002\u0012\n\bÜ\u0002\u0012\u0005\b\b(Ý\u0002\u0012\u0019\u0012\u0017\u0018\u00010Þ\u0002¢\u0006\u000f\bÛ\u0002\u0012\n\bÜ\u0002\u0012\u0005\b\b(ß\u0002\u0012\u0004\u0012\u00020E0Ù\u00022\r\u0010à\u0002\u001a\b\u0012\u0004\u0012\u00020E0g2\n\u0010á\u0002\u001a\u0005\u0018\u00010Þ\u00022\u0007\u0010â\u0002\u001a\u00020zH\u0016J\t\u0010ã\u0002\u001a\u00020EH\u0016J\u0013\u0010ä\u0002\u001a\u00020E2\b\u0010Ý\u0002\u001a\u00030å\u0002H\u0014J\u0013\u0010æ\u0002\u001a\u00020z2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0016J\u0013\u0010è\u0002\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0016J\u0013\u0010ê\u0002\u001a\u00020z2\b\u0010é\u0002\u001a\u00030ë\u0002H\u0016J\u0013\u0010ì\u0002\u001a\u00020z2\b\u0010é\u0002\u001a\u00030ë\u0002H\u0016J\t\u0010í\u0002\u001a\u00020EH\u0002J\u0013\u0010î\u0002\u001a\u00020E2\b\u0010ï\u0002\u001a\u00030ð\u0002H\u0016J\u0013\u0010ñ\u0002\u001a\u00020z2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0016J\u001b\u0010ò\u0002\u001a\u00020E2\b\u0010\u0096\u0002\u001a\u00030°\u00022\b\u0010Ý\u0002\u001a\u00030å\u0002J\u0015\u0010ó\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010Î\u0002\u001a\u00020VH\u0002J\u001f\u0010ô\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010õ\u0002\u001a\u00020V2\b\u0010ö\u0002\u001a\u00030\u0097\u0002H\u0002J\u0013\u0010÷\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010õ\u0002\u001a\u00020VJ!\u0010ø\u0002\u001a\u0005\u0018\u00010\u0097\u00022\n\u0010ù\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010Î\u0002\u001a\u00020VH\u0016J\u0012\u0010ú\u0002\u001a\u00020E2\u0007\u0010û\u0002\u001a\u00020zH\u0016J\u001c\u0010ü\u0002\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010ý\u0002\u001a\u00020zH\u0016J\"\u0010þ\u0002\u001a\u0005\u0018\u00010ÿ\u00022\b\u0010\u0080\u0003\u001a\u00030\u0081\u0003H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0082\u0003\u0010\u0083\u0003J\u0013\u0010\u0084\u0003\u001a\u00020E2\b\u0010\u0085\u0003\u001a\u00030\u0086\u0003H\u0016J\t\u0010\u0087\u0003\u001a\u00020VH\u0016J#\u0010\u0088\u0003\u001a\u00030\u0089\u00032\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008a\u0003\u0010\u008b\u0003J\u0013\u0010\u008c\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J\u001d\u0010\u008d\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u00012\b\u0010\u008e\u0003\u001a\u00030Ì\u0001H\u0002J\t\u0010\u008f\u0003\u001a\u00020EH\u0016J\t\u0010\u0090\u0003\u001a\u00020EH\u0016J\u0013\u0010\u0091\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0002J\u0013\u0010\u0093\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0002J\u0013\u0010\u0094\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J\u0013\u0010\u0095\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J\u0013\u0010\u0096\u0003\u001a\u00020z2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002J\u0013\u0010\u0097\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J \u0010\u0098\u0003\u001a\u00030\u0098\u00012\b\u0010Ë\u0002\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0099\u0003\u0010É\u0002J\u001f\u0010\u0098\u0003\u001a\u00020E2\b\u0010\u009a\u0003\u001a\u00030\u0090\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u009b\u0003\u0010\u009c\u0003J)\u0010\u009d\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\b\u0010\u009e\u0003\u001a\u00030¾\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u009f\u0003\u0010 \u0003J\u0012\u0010\u009d\u0003\u001a\u00020E2\u0007\u0010¡\u0003\u001a\u00020zH\u0016J\t\u0010¢\u0003\u001a\u00020EH\u0016J!\u0010£\u0003\u001a\u00020E2\u0007\u0010¤\u0003\u001a\u00020`2\u0007\u0010¥\u0003\u001a\u00020zH\u0000¢\u0006\u0003\b¦\u0003J\t\u0010§\u0003\u001a\u00020EH\u0014J\t\u0010¨\u0003\u001a\u00020zH\u0016J\t\u0010©\u0003\u001a\u00020EH\u0002J\u0012\u0010ª\u0003\u001a\u00020E2\u0007\u0010«\u0003\u001a\u00020DH\u0014J\u0016\u0010¬\u0003\u001a\u0005\u0018\u00010\u00ad\u00032\b\u0010®\u0003\u001a\u00030¯\u0003H\u0016J0\u0010°\u0003\u001a\u00020E2\b\u0010±\u0003\u001a\u00030²\u00032\b\u0010³\u0003\u001a\u00030\u0093\u00022\u0011\u0010´\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00030µ\u0003H\u0017J\u0013\u0010·\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\t\u0010¸\u0003\u001a\u00020EH\u0014J\u0013\u0010¹\u0003\u001a\u00020E2\b\u0010Ý\u0002\u001a\u00030å\u0002H\u0014J\t\u0010º\u0003\u001a\u00020EH\u0016J\f\u0010»\u0003\u001a\u0005\u0018\u00010¼\u0003H\u0002J'\u0010½\u0003\u001a\u00020E2\u0007\u0010¾\u0003\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020V2\n\u0010¿\u0003\u001a\u0005\u0018\u00010\u0086\u0003H\u0014J\u0018\u0010À\u0003\u001a\u00020E2\r\u0010\u0096\u0002\u001a\b0\u0097\u0002j\u0003`Á\u0003H\u0016J6\u0010Â\u0003\u001a\u00020E2\u0007\u0010Ã\u0003\u001a\u00020z2\u0007\u0010Ä\u0003\u001a\u00020V2\u0007\u0010Å\u0003\u001a\u00020V2\u0007\u0010Æ\u0003\u001a\u00020V2\u0007\u0010Ç\u0003\u001a\u00020VH\u0014J\u0013\u0010È\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u0001H\u0016J\u0013\u0010É\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u0001H\u0016J\u001b\u0010Ê\u0003\u001a\u00020E2\u0007\u0010Ë\u0003\u001a\u00020V2\u0007\u0010Ì\u0003\u001a\u00020VH\u0014J\u001f\u0010Í\u0003\u001a\u00020z2\b\u0010Î\u0003\u001a\u00030ÿ\u0002H\u0002ø\u0001\u0000¢\u0006\u0006\bÏ\u0003\u0010Ð\u0003J\u0013\u0010Ñ\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\u001c\u0010Ò\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010Ó\u0003\u001a\u00020VH\u0016J\u0013\u0010Ô\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\u001c\u0010Õ\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010Ó\u0003\u001a\u00020VH\u0016J\u001e\u0010Ö\u0003\u001a\u00020E2\n\u0010ï\u0002\u001a\u0005\u0018\u00010ð\u00022\u0007\u0010×\u0003\u001a\u00020VH\u0016J*\u0010Ø\u0003\u001a\u00020z2\n\u0010Î\u0003\u001a\u0005\u0018\u00010ÿ\u00022\n\u0010¿\u0003\u001a\u0005\u0018\u00010¼\u0003H\u0002ø\u0001\u0000¢\u0006\u0003\bÙ\u0003J.\u0010Ú\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010ý\u0002\u001a\u00020z2\u0007\u0010Û\u0003\u001a\u00020z2\u0007\u0010Ü\u0003\u001a\u00020zH\u0016J%\u0010Ý\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010ý\u0002\u001a\u00020z2\u0007\u0010Û\u0003\u001a\u00020zH\u0016J\u001d\u0010Þ\u0003\u001a\u00030ß\u00032\b\u0010é\u0002\u001a\u00030Ì\u00012\u0007\u0010à\u0003\u001a\u00020VH\u0017J\u0013\u0010á\u0003\u001a\u00020E2\b\u0010â\u0003\u001a\u00030ã\u0003H\u0016J\u0012\u0010ä\u0003\u001a\u00020E2\u0007\u0010£\u0001\u001a\u00020VH\u0016J.\u0010å\u0003\u001a\u00020E2\b\u0010æ\u0003\u001a\u00030\u0086\u00032\b\u0010ç\u0003\u001a\u00030è\u00032\u000f\u0010é\u0003\u001a\n\u0012\u0005\u0012\u00030ê\u00030µ\u0003H\u0016J\t\u0010ë\u0003\u001a\u00020EH\u0016J\u001c\u0010ì\u0003\u001a\u00020E2\u0011\u0010í\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ï\u00030î\u0003H\u0017J\u0012\u0010ð\u0003\u001a\u00020E2\u0007\u0010ñ\u0003\u001a\u00020zH\u0016J+\u0010ò\u0003\u001a\u00030Ó\u00022\u0007\u0010ó\u0003\u001a\u00020V2\u0007\u0010Ç\u0003\u001a\u00020VH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bô\u0003\u0010õ\u0003J\t\u0010ö\u0003\u001a\u00020EH\u0002J\u0013\u0010ö\u0003\u001a\u00020E2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002J\t\u0010÷\u0003\u001a\u00020EH\u0002J\u0018\u0010ø\u0003\u001a\u00020z2\u0007\u0010¤\u0003\u001a\u00020`H\u0000¢\u0006\u0003\bù\u0003J\u0018\u0010ú\u0003\u001a\u00020E2\r\u0010û\u0003\u001a\b\u0012\u0004\u0012\u00020E0gH\u0016J\u0013\u0010ü\u0003\u001a\u00020E2\b\u0010û\u0003\u001a\u00030ý\u0003H\u0016J\u0011\u0010þ\u0003\u001a\u00020E2\b\u0010\u0096\u0002\u001a\u00030°\u0002J\u0013\u0010ÿ\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\u0007\u0010\u0080\u0004\u001a\u00020EJ\u001e\u0010\u0081\u0004\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020V2\n\u0010¿\u0003\u001a\u0005\u0018\u00010\u0086\u0003H\u0016J\u0013\u0010\u0082\u0004\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u0001H\u0016J\u0017\u0010Ü\u0003\u001a\u00020E2\f\b\u0002\u0010\u0083\u0004\u001a\u0005\u0018\u00010«\u0001H\u0002J \u0010\u0084\u0004\u001a\u00030\u0098\u00012\b\u0010\u0085\u0004\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0086\u0004\u0010É\u0002J\u001f\u0010\u0087\u0004\u001a\u00020z2\b\u0010\u0080\u0003\u001a\u00030\u0081\u0003H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0088\u0004\u0010\u0089\u0004J#\u0010\u008a\u0004\u001a\u00030\u0089\u00032\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008b\u0004\u0010\u008b\u0003J1\u0010\u008c\u0004\u001a\u00020E2\b\u0010ç\u0002\u001a\u00030Ì\u00012\u0007\u0010\u008d\u0004\u001a\u00020V2\b\u0010\u008e\u0004\u001a\u00030\u009a\u00012\t\b\u0002\u0010\u008f\u0004\u001a\u00020zH\u0002J\u0013\u0010\u0090\u0004\u001a\u00020E2\b\u0010\u0091\u0004\u001a\u00030\u009a\u0001H\u0016J\u001c\u0010\u0092\u0004\u001a\u00020E2\u0013\u0010\u0093\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0CJ\t\u0010\u0094\u0004\u001a\u00020zH\u0016JE\u0010\u0095\u0004\u001a\u00020z2\b\u0010\u0096\u0004\u001a\u00030\u0097\u00042\b\u0010\u0098\u0004\u001a\u00030\u0099\u00042\u001a\u0010\u009a\u0004\u001a\u0015\u0012\u0005\u0012\u00030\u009b\u0004\u0012\u0004\u0012\u00020E0C¢\u0006\u0003\b\u009c\u0004H\u0002ø\u0001\u0000¢\u0006\u0006\b\u009d\u0004\u0010\u009e\u0004JA\u0010\u009f\u0004\u001a\u00030 \u00042.\u0010¡\u0004\u001a)\b\u0001\u0012\u0005\u0012\u00030¢\u0004\u0012\f\u0012\n\u0012\u0005\u0012\u00030 \u00040£\u0004\u0012\u0007\u0012\u0005\u0018\u00010¤\u00040Ù\u0002¢\u0006\u0003\b\u009c\u0004H\u0096@¢\u0006\u0003\u0010¥\u0004J\t\u0010¦\u0004\u001a\u00020EH\u0002J\t\u0010§\u0004\u001a\u00020EH\u0002J\u000e\u0010¨\u0004\u001a\u00020z*\u00030«\u0001H\u0002J\u001b\u0010©\u0004\u001a\u00020V*\u00030Ó\u0002H\u0082\nø\u0001\u0000¢\u0006\u0006\bª\u0004\u0010«\u0004J\u001b\u0010¬\u0004\u001a\u00020V*\u00030Ó\u0002H\u0082\nø\u0001\u0000¢\u0006\u0006\b\u00ad\u0004\u0010«\u0004R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010'\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u000200X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0004\n\u0002\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u000209X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020=X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020KX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\b\u001a\u00020\t2\u0006\u0010P\u001a\u00020\t@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u000e\u0010U\u001a\u00020VX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010X\u001a\u00020W2\u0006\u0010\u0015\u001a\u00020W8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u001d\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020`0_X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\u00020bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u001c\u0010e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020E\u0018\u00010g0fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010h\u001a\u00020iX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR+\u0010m\u001a\u00020l2\u0006\u0010\u0015\u001a\u00020l8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010\u001d\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010s\u001a\u00020t8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u000e\u0010y\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020|X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010}\u001a\u00020~X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u007fR\u0018\u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020z8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u000f\u0010\u008b\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u008c\u0001\u001a\u00030\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u000f\u0010\u0090\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0091\u0001\u001a\u00020z8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008a\u0001R\u000f\u0010\u0092\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0097\u0001\u001a\u00030\u0098\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u007fR+\u0010\u0099\u0001\u001a\u00030\u009a\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b\u009b\u0001\u0010v\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020`0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010£\u0001\u001a\u00030¢\u00012\u0007\u0010\u0015\u001a\u00030¢\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b¨\u0001\u0010\u001d\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0010\u0010®\u0001\u001a\u00030¯\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010°\u0001\u001a\u00030±\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010²\u0001\u001a\u00030³\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010´\u0001\u001a\u00030\u009a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010\u009d\u0001R\u0018\u0010¶\u0001\u001a\u00030·\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0010\u0010º\u0001\u001a\u00030»\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010¼\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001d\u0010¿\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010À\u0001\u001a\u00030Á\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Ä\u0001\u001a\u00030Å\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0010\u0010È\u0001\u001a\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010Ê\u0001\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Ë\u0001\u001a\u0005\u0018\u00010Ì\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010Í\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010Î\u0001\u001a\u00030Ï\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0010\u0010Ò\u0001\u001a\u00030\u009a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020E0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010Ô\u0001\u001a\u00030Õ\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010Ö\u0001R\u0018\u0010×\u0001\u001a\u00030«\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Ú\u0001\u001a\u00030Û\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0010\u0010Þ\u0001\u001a\u00030ß\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010à\u0001\u001a\u00030\u0095\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010á\u0001\u001a\u0005\u0018\u00010â\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010ã\u0001\u001a\u00020z8@X\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010\u008a\u0001R\u0010\u0010å\u0001\u001a\u00030æ\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010ç\u0001\u001a\u00030è\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010é\u0001\u001a\u00030ê\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bë\u0001\u0010ì\u0001R\u0010\u0010í\u0001\u001a\u00030î\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010ï\u0001\u001a\u00020VX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010ð\u0001\u001a\u00030ñ\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001R&\u0010ô\u0001\u001a\u00020zX\u0096\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bõ\u0001\u0010v\u001a\u0006\bö\u0001\u0010\u008a\u0001\"\u0006\b÷\u0001\u0010ø\u0001R\u0018\u0010ù\u0001\u001a\u00030ú\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bû\u0001\u0010ü\u0001R\u0018\u0010ý\u0001\u001a\u00030þ\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u000f\u0010\u0081\u0002\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0082\u0002\u001a\u00030\u0083\u00028\u0016X\u0097\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0084\u0002\u0010v\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R \u0010\u0087\u0002\u001a\n\u0012\u0005\u0012\u00030\u0089\u00020\u0088\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u008a\u0002R\u0018\u0010\u008b\u0002\u001a\u00030\u008c\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0019\u0010\u008f\u0002\u001a\u00030\u0090\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u0091\u0002R\u0010\u0010\u0092\u0002\u001a\u00030\u0093\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0002\u001a\u00030\u0095\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0096\u0002\u001a\u00030\u0097\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u009b\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0012\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u009f\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010 \u0002\u001a\u00030\u0090\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u0091\u0002R!\u0010¡\u0002\u001a\u0004\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b£\u0002\u0010¤\u0002\u001a\u0005\b¢\u0002\u0010\u0019R\u000f\u0010¥\u0002\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010¦\u0002\u001a\u00030§\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u0018\u0010ª\u0002\u001a\u00030\u0098\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u007fR\u0019\u0010«\u0002\u001a\u00030\u0090\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u0091\u0002R\u001b\u0010¬\u0002\u001a\u00020V*\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010®\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006°\u0004"}, m13413d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_autofillManager", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "get_autofillManager$ui_release", "()Landroidx/compose/ui/autofill/AndroidAutofillManager;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "<set-?>", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "_viewTreeOwners", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners$delegate", "Landroidx/compose/runtime/MutableState;", "_windowInfo", "Landroidx/compose/ui/platform/LazyWindowInfo;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "androidViewsHandler", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillManager", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "bringIntoViewNode", "androidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1", "Landroidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipboard", "Landroidx/compose/ui/platform/AndroidClipboard;", "getClipboard", "()Landroidx/compose/ui/platform/AndroidClipboard;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "composeAccessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "configurationChangeObserver", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "getContentCaptureManager$ui_release", "()Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "setContentCaptureManager$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V", "value", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "currentFontWeightAdjustment", "", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density$delegate", "dirtyLayers", "", "Landroidx/compose/ui/node/OwnedLayer;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "endApplyChangesListeners", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver$delegate", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "()V", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "forceUseMatrixCache", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hoverExitReceived", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "isDrawingContent", "isLifecycleInResumedState", "isPendingInteropViewLayoutChangeDispatch", "isRenderNodeCompatible", "keyInputModifier", "Landroidx/compose/ui/Modifier;", "keyboardModifiersRequireUpdate", "lastDownPointerPosition", "Landroidx/compose/ui/geometry/Offset;", "lastMatrixRecalculationAnimationTime", "", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "layoutNodes", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNodes", "()Landroidx/collection/MutableIntObjectMap;", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "getMeasureIteration", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "observationClearRequested", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "onViewTreeOwnersAvailable", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "postponedDirtyLayers", "previousMotionEvent", "Landroid/view/MotionEvent;", "processingRequestFocusForNextNonChildView", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "relayoutTime", "resendMotionEventOnLayout", "resendMotionEventRunnable", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "root", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "rotaryInputModifier", "scrollCapture", "Landroidx/compose/ui/scrollcapture/ScrollCapture;", "scrollCaptureInProgress", "getScrollCaptureInProgress$ui_release", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "semanticsModifier", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "sensitiveComponentCount", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "superclassInitComplete", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputSessionMutex", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Ljava/util/concurrent/atomic/AtomicReference;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "tmpPositionArray", "", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewToWindowMatrix", "viewTreeOwners", "getViewTreeOwners", "viewTreeOwners$delegate", "Landroidx/compose/runtime/State;", "wasMeasuredWithMultipleConstraints", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowPosition", "windowToViewMatrix", "fontWeightAdjustmentCompat", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "addView", "child", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "width", "height", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "autofillSupported", "boundsUpdatesAccessibilityEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesContentCaptureEventLoop", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "canScrollHorizontally", "direction", "canScrollVertically", "clearChildInvalidObservations", "viewGroup", "convertMeasureSpec", "Lkotlin/ULong;", "measureSpec", "convertMeasureSpec-I7RO_PI", "(I)J", "createLayer", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "invalidateParentLayer", "explicitLayer", "forceUseOldLayers", "decrementSensitiveComponentCount", "dispatchDraw", "Landroid/graphics/Canvas;", "dispatchGenericMotionEvent", "motionEvent", "dispatchHoverEvent", NotificationCompat.CATEGORY_EVENT, "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchKeyEventPreIme", "dispatchPendingInteropLayoutCallbacks", "dispatchProvideStructure", "structure", "Landroid/view/ViewStructure;", "dispatchTouchEvent", "drawAndroidView", "findNextNonChildView", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "findViewByAccessibilityIdTraversal", "focusSearch", "focused", "forceAccessibilityForTesting", "enable", "forceMeasureTheSubtree", "affectsLookahead", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusedRect", "rect", "Landroid/graphics/Rect;", "getImportantForAutofill", "handleMotionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleRotaryEvent", "hasChangedDevices", "lastEvent", "incrementSensitiveComponentCount", "invalidateDescendants", "invalidateLayers", "node", "invalidateLayoutNodeMeasurement", "isBadMotionEvent", "isDevicePressEvent", "isInBounds", "isPositionChanged", "localToScreen", "localToScreen-MK-Hz9U", "localTransform", "localToScreen-58bKbWc", "([F)V", "measureAndLayout", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "measureAndLayoutForTest", "notifyLayerIsDirty", "layer", "isDirty", "notifyLayerIsDirty$ui_release", "onAttachedToWindow", "onCheckIsTextEditor", "onClearFocusForOwner", "onConfigurationChanged", "newConfig", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onDetach", "onDetachedFromWindow", "onDraw", "onEndApplyChanges", "onFetchFocusRect", "Landroidx/compose/ui/geometry/Rect;", "onFocusChanged", "gainFocus", "previouslyFocusedRect", "onInteropViewLayoutChange", "Landroidx/compose/ui/viewinterop/InteropView;", "onLayout", "changed", "l", "t", "r", "b", "onLayoutChange", "onLayoutNodeDeactivated", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onMoveFocusInChildren", "focusDirection", "onMoveFocusInChildren-3ESFkO8", "(I)Z", "onPostAttach", "onPostLayoutNodeReused", "oldSemanticsId", "onPreAttach", "onPreLayoutNodeReused", "onProvideAutofillVirtualStructure", "flags", "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno", "onRequestMeasure", "forceRequest", "scheduleMeasureAndLayout", "onRequestRelayout", "onResolvePointerIcon", "Landroid/view/PointerIcon;", "pointerIndex", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onRtlPropertiesChanged", "onScrollCaptureSearch", "localVisibleRect", "windowOffset", "Landroid/graphics/Point;", "targets", "Landroid/view/ScrollCaptureTarget;", "onSemanticsChange", "onVirtualViewTranslationResponses", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onWindowFocusChanged", "hasWindowFocus", "pack", "a", "pack-ZIaKswc", "(II)J", "recalculateWindowPosition", "recalculateWindowViewTransforms", "recycle", "recycle$ui_release", "registerOnEndApplyChangesListener", "listener", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "removeAndroidView", "requestAutofill", "requestClearInvalidObservations", "requestFocus", "requestOnPositionedCallback", "nodeToRemeasure", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "sendKeyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendMotionEvent", "sendMotionEvent-8iAsVTc", "sendSimulatedEvent", "action", "eventTime", "forceHover", "setAccessibilityEventBatchIntervalMillis", "intervalMillis", "setOnViewTreeOwnersAvailable", "callback", "shouldDelayChildPressedState", "startDrag", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "startDrag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", "textInputSession", "", "session", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePositionCacheAndDispatch", "updateWindowMetrics", "childSizeCanAffectParentSize", "component1", "component1-VKZWuLQ", "(J)I", "component2", "component2-VKZWuLQ", "Companion", "ViewTreeOwners", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 11 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 12 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 16 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 17 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 18 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 19 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 20 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 21 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/ProcessResult\n+ 22 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 23 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 24 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 25 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/LazyWindowInfo\n+ 26 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,3125:1\n1669#1,4:3247\n1669#1,4:3251\n76#2,7:3126\n56#2,5:3147\n76#2,7:3288\n76#2,7:3299\n32#3:3133\n32#3:3259\n80#4:3134\n80#4:3260\n53#4,3:3328\n60#4:3332\n70#4:3335\n60#4:3338\n70#4:3341\n53#4,3:3343\n60#4:3347\n70#4:3350\n60#4:3352\n70#4:3355\n53#4,3:3358\n53#4,3:3362\n53#4,3:3366\n60#4:3370\n70#4:3373\n53#4,3:3375\n1516#5:3135\n85#6:3136\n113#6,2:3137\n85#6:3218\n113#6,2:3219\n85#6:3221\n85#6:3222\n113#6,2:3223\n85#6:3225\n113#6,2:3226\n95#7:3139\n308#8,6:3140\n179#8:3146\n180#8:3152\n181#8,3:3156\n184#8,6:3160\n314#8:3166\n437#8,6:3167\n447#8,2:3174\n449#8,17:3179\n466#8,8:3199\n315#8:3207\n190#8,8:3208\n316#8:3216\n1101#9:3153\n1083#9,2:3154\n519#10:3159\n423#10,9:3267\n423#10,9:3277\n246#11:3173\n240#12,3:3176\n243#12,3:3196\n1#13:3217\n1#13:3379\n26#14:3228\n26#14:3229\n26#14:3230\n26#14:3231\n22#14:3333\n22#14:3336\n22#14:3339\n22#14:3348\n22#14:3353\n22#14:3356\n22#14:3371\n919#15,2:3232\n919#15,2:3295\n919#15,2:3297\n924#15,2:3308\n924#15,2:3310\n26#16,5:3234\n26#16,5:3239\n26#16,3:3244\n30#16:3255\n26#16,5:3315\n61#17,3:3256\n41#18,5:3261\n207#19:3266\n207#19:3276\n20#20,2:3286\n20#20,2:3306\n241#21:3312\n244#21:3313\n241#21:3314\n241#21:3326\n241#21:3381\n212#22,6:3320\n30#23:3327\n30#23:3342\n30#23:3357\n30#23:3361\n30#23:3365\n30#23:3374\n65#24:3331\n69#24:3334\n65#24:3337\n69#24:3340\n65#24:3346\n69#24:3349\n65#24:3351\n69#24:3354\n65#24:3369\n69#24:3372\n58#25:3378\n59#25:3380\n139#26:3382\n139#26:3383\n139#26:3384\n139#26:3385\n139#26:3386\n139#26:3387\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n1637#1:3247,4\n1638#1:3251,4\n593#1:3126,7\n315#1:3147,5\n2056#1:3288,7\n2077#1:3299,7\n666#1:3133\n1720#1:3259\n666#1:3134\n1720#1:3260\n2414#1:3328,3\n2416#1:3332\n2417#1:3335\n2475#1:3338\n2475#1:3341\n2475#1:3343,3\n2481#1:3347\n2481#1:3350\n2486#1:3352\n2487#1:3355\n2488#1:3358,3\n2509#1:3362,3\n2522#1:3366,3\n2525#1:3370\n2525#1:3373\n2525#1:3375,3\n832#1:3135\n261#1:3136\n261#1:3137,2\n687#1:3218\n687#1:3219,2\n696#1:3221\n760#1:3222\n760#1:3223,2\n772#1:3225\n772#1:3226,2\n315#1:3139\n315#1:3140,6\n315#1:3146\n315#1:3152\n315#1:3156,3\n315#1:3160,6\n315#1:3166\n315#1:3167,6\n315#1:3174,2\n315#1:3179,17\n315#1:3199,8\n315#1:3207\n315#1:3208,8\n315#1:3216\n315#1:3153\n315#1:3154,2\n315#1:3159\n1989#1:3267,9\n1995#1:3277,9\n315#1:3173\n315#1:3176,3\n315#1:3196,3\n2534#1:3379\n944#1:3228\n945#1:3229\n946#1:3230\n947#1:3231\n2416#1:3333\n2417#1:3336\n2475#1:3339\n2481#1:3348\n2486#1:3353\n2487#1:3356\n2525#1:3371\n1299#1:3232,2\n2067#1:3295,2\n2068#1:3297,2\n2095#1:3308,2\n2096#1:3310,2\n1546#1:3234,5\n1559#1:3239,5\n1633#1:3244,3\n1633#1:3255\n2223#1:3315,5\n1712#1:3256,3\n1903#1:3261,5\n1989#1:3266\n1995#1:3276\n2010#1:3286,2\n2082#1:3306,2\n2159#1:3312\n2193#1:3313\n2197#1:3314\n2374#1:3326\n2632#1:3381\n2365#1:3320,6\n2414#1:3327\n2475#1:3342\n2488#1:3357\n2509#1:3361\n2522#1:3365\n2525#1:3374\n2416#1:3331\n2417#1:3334\n2475#1:3337\n2475#1:3340\n2481#1:3346\n2481#1:3349\n2486#1:3351\n2487#1:3354\n2525#1:3369\n2525#1:3372\n2534#1:3378\n2534#1:3380\n2637#1:3382\n2638#1:3383\n2639#1:3384\n2640#1:3385\n2646#1:3386\n2647#1:3387\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver {
    private static Method getBooleanMethod;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final AndroidAutofillManager _autofillManager;
    private final InputModeManagerImpl _inputModeManager;

    /* renamed from: _viewTreeOwners$delegate, reason: from kotlin metadata */
    private final MutableState _viewTreeOwners;
    private final LazyWindowInfo _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final AndroidComposeView$bringIntoViewNode$1 bringIntoViewNode;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private Function1<? super Configuration, Unit> configurationChangeObserver;
    private AndroidContentCaptureManager contentCaptureManager;
    private CoroutineContext coroutineContext;
    private int currentFontWeightAdjustment;

    /* renamed from: density$delegate, reason: from kotlin metadata */
    private final MutableState density;
    private final List<OwnedLayer> dirtyLayers;
    private final AndroidDragAndDropManager dragAndDropManager;
    private final MutableObjectList<Function0<Unit>> endApplyChangesListeners;
    private final FocusOwner focusOwner;

    /* renamed from: fontFamilyResolver$delegate, reason: from kotlin metadata */
    private final MutableState fontFamilyResolver;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final GraphicsContext graphicsContext;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;

    /* renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    private final MutableState layoutDirection;
    private final MutableIntObjectMap<LayoutNode> layoutNodes;
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1<? super ViewTreeOwners, Unit> onViewTreeOwnersAvailable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private boolean processingRequestFocusForNextNonChildView;
    private final RectManager rectManager;
    private long relayoutTime;
    private final Function0<Unit> resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final EmptySemanticsModifier rootSemanticsNode;
    private final Modifier rotaryInputModifier;
    private final ScrollCapture scrollCapture;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final EmptySemanticsElement semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final TextInputService textInputService;
    private final AtomicReference textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;

    /* renamed from: viewTreeOwners$delegate, reason: from kotlin metadata */
    private final State viewTreeOwners;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m13412d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m13413d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m13413d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.compose.ui.platform.AndroidComposeView", m13451f = "AndroidComposeView.android.kt", m13452i = {}, m13453l = {739}, m13454m = "textInputSession", m13455n = {}, m13456s = {})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 */
    public static final class C28841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28841(Continuation<? super C28841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeView.this.textInputSession(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier, androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1] */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        AndroidComposeView androidComposeView;
        AndroidAutofillManager androidAutofillManager;
        super(context);
        Offset.Companion companion = Offset.INSTANCE;
        this.lastDownPointerPosition = companion.m21183getUnspecifiedF1C5BW0();
        int i9 = 1;
        this.superclassInitComplete = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.sharedDrawScope = new LayoutNodeDrawScope(0 == true ? 1 : 0, i9, 0 == true ? 1 : 0);
        this.density = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context), SnapshotStateKt.referentialEqualityPolicy());
        EmptySemanticsModifier emptySemanticsModifier = new EmptySemanticsModifier();
        this.rootSemanticsNode = emptySemanticsModifier;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(emptySemanticsModifier);
        this.semanticsModifier = emptySemanticsElement;
        ?? r52 = new ModifierNodeElement<BringIntoViewOnScreenResponderNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // androidx.compose.p012ui.node.ModifierNodeElement
            public boolean equals(Object other) {
                return other == this;
            }

            @Override // androidx.compose.p012ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.hashCode();
            }

            @Override // androidx.compose.p012ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("BringIntoViewOnScreen");
            }

            @Override // androidx.compose.p012ui.node.ModifierNodeElement
            /* renamed from: create */
            public BringIntoViewOnScreenResponderNode getNode() {
                return new BringIntoViewOnScreenResponderNode(this.this$0);
            }

            @Override // androidx.compose.p012ui.node.ModifierNodeElement
            public void update(BringIntoViewOnScreenResponderNode node) {
                node.setView(this.this$0);
            }
        };
        this.bringIntoViewNode = r52;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$6
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((AndroidComposeView) this.receiver).setLayoutDirection((LayoutDirection) obj);
            }
        });
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this._windowInfo = new LazyWindowInfo();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m23133invokeZmokQxo(keyEvent.m22477unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m23133invokeZmokQxo(android.view.KeyEvent keyEvent) {
                final FocusDirection focusDirectionMo23079getFocusDirectionP8AzH3I = this.this$0.mo23079getFocusDirectionP8AzH3I(keyEvent);
                if (focusDirectionMo23079getFocusDirectionP8AzH3I == null || !KeyEventType.m22481equalsimpl0(KeyEvent_androidKt.m22489getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m22485getKeyDownCS__XNY())) {
                    return Boolean.FALSE;
                }
                Integer numM21064toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m21064toAndroidFocusDirection3ESFkO8(focusDirectionMo23079getFocusDirectionP8AzH3I.getValue());
                if (ComposeUiFlags.isViewFocusFixEnabled && this.this$0.hasFocus() && numM21064toAndroidFocusDirection3ESFkO8 != null && this.this$0.m23124onMoveFocusInChildren3ESFkO8(focusDirectionMo23079getFocusDirectionP8AzH3I.getValue())) {
                    return Boolean.TRUE;
                }
                Rect rectOnFetchFocusRect = this.this$0.onFetchFocusRect();
                Boolean boolMo21070focusSearchULY8qGw = this.this$0.getFocusOwner().mo21070focusSearchULY8qGw(focusDirectionMo23079getFocusDirectionP8AzH3I.getValue(), rectOnFetchFocusRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo21083requestFocus3ESFkO8(focusDirectionMo23079getFocusDirectionP8AzH3I.getValue()));
                    }
                });
                if (boolMo21070focusSearchULY8qGw != null ? boolMo21070focusSearchULY8qGw.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!FocusOwnerImplKt.m21076is1dFocusSearch3ESFkO8(focusDirectionMo23079getFocusDirectionP8AzH3I.getValue())) {
                    return Boolean.FALSE;
                }
                if (numM21064toAndroidFocusDirection3ESFkO8 != null) {
                    View viewFindNextNonChildView = this.this$0.findNextNonChildView(numM21064toAndroidFocusDirection3ESFkO8.intValue());
                    if (Intrinsics.areEqual(viewFindNextNonChildView, this.this$0)) {
                        viewFindNextNonChildView = null;
                    }
                    if (viewFindNextNonChildView != null) {
                        android.graphics.Rect androidRect = rectOnFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect) : null;
                        if (androidRect == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        viewFindNextNonChildView.getLocationInWindow(this.this$0.tmpPositionArray);
                        int i10 = this.this$0.tmpPositionArray[0];
                        int i11 = this.this$0.tmpPositionArray[1];
                        AndroidComposeView androidComposeView2 = this.this$0;
                        androidComposeView2.getLocationInWindow(androidComposeView2.tmpPositionArray);
                        androidRect.offset(this.this$0.tmpPositionArray[0] - i10, this.this$0.tmpPositionArray[1] - i11);
                        if (FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextNonChildView, numM21064toAndroidFocusDirection3ESFkO8, androidRect)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!this.this$0.getFocusOwner().mo21067clearFocusI7lrPNg(false, true, false, focusDirectionMo23079getFocusDirectionP8AzH3I.getValue())) {
                    return Boolean.TRUE;
                }
                Boolean boolMo21070focusSearchULY8qGw2 = this.this$0.getFocusOwner().mo21070focusSearchULY8qGw(focusDirectionMo23079getFocusDirectionP8AzH3I.getValue(), null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo21083requestFocus3ESFkO8(focusDirectionMo23079getFocusDirectionP8AzH3I.getValue()));
                    }
                });
                return Boolean.valueOf(boolMo21070focusSearchULY8qGw2 != null ? boolMo21070focusSearchULY8qGw2.booleanValue() : true);
            }
        });
        this.keyInputModifier = modifierOnKeyEvent;
        Modifier modifierOnRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, new Function1<RotaryScrollEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = modifierOnRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        this.viewConfiguration = new AndroidViewConfiguration(ViewConfiguration.get(context));
        Object[] objArr4 = 0;
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(modifierOnRotaryScrollEvent).then(modifierOnKeyEvent).then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()).then(r52));
        this.root = layoutNode;
        this.layoutNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.rectManager = new RectManager(getLayoutNodes());
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot(), emptySemanticsModifier, getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new Function1<Configuration, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Configuration configuration) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }
        };
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        if (autofillSupported()) {
            AutofillManager autofillManagerM993a = AbstractC2577d.m993a(context.getSystemService(AbstractC2575c.m991a()));
            if (autofillManagerM993a == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Autofill service could not be located.");
                throw new KotlinNothingValueException();
            }
            androidComposeView = this;
            androidAutofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(autofillManagerM993a), getSemanticsOwner(), androidComposeView, getRectManager(), context.getPackageName());
        } else {
            androidComposeView = this;
            androidAutofillManager = null;
        }
        androidComposeView._autofillManager = androidAutofillManager;
        androidComposeView.clipboardManager = new AndroidClipboardManager(context);
        androidComposeView.clipboard = new AndroidClipboard(getClipboardManager());
        androidComposeView.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        androidComposeView.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        long j9 = Integer.MAX_VALUE;
        androidComposeView.globalPosition = IntOffset.m24116constructorimpl((j9 & 4294967295L) | (j9 << 32));
        androidComposeView.tmpPositionArray = new int[]{0, 0};
        float[] fArrM21639constructorimpl$default = Matrix.m21639constructorimpl$default(null, 1, null);
        androidComposeView.tmpMatrix = fArrM21639constructorimpl$default;
        androidComposeView.viewToWindowMatrix = Matrix.m21639constructorimpl$default(null, 1, null);
        androidComposeView.windowToViewMatrix = Matrix.m21639constructorimpl$default(null, 1, null);
        androidComposeView.lastMatrixRecalculationAnimationTime = -1L;
        androidComposeView.windowPosition = companion.m21182getInfiniteF1C5BW0();
        androidComposeView.isRenderNodeCompatible = true;
        androidComposeView._viewTreeOwners = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        androidComposeView.viewTreeOwners = SnapshotStateKt.derivedStateOf(new Function0<ViewTreeOwners>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AndroidComposeView.ViewTreeOwners invoke() {
                return this.this$0.get_viewTreeOwners();
            }
        });
        androidComposeView.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f1249a.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f1250a.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.d
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z9) {
                AndroidComposeView.touchModeChangeListener$lambda$8(this.f1252a, z9);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        androidComposeView.legacyTextInputServiceAndroid = textInputServiceAndroid;
        androidComposeView.textInputService = new TextInputService(AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        androidComposeView.textInputSessionMutex = SessionMutex.m20988constructorimpl();
        androidComposeView.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        androidComposeView.fontLoader = new AndroidFontResourceLoader(context);
        androidComposeView.fontFamilyResolver = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        androidComposeView.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        androidComposeView.layoutDirection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection, null, 2, null);
        androidComposeView.hapticFeedBack = new PlatformHapticFeedback(this);
        androidComposeView._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.INSTANCE.m22171getTouchaOaMEAU() : InputMode.INSTANCE.m22170getKeyboardaOaMEAU(), new Function1<InputMode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
                return m23129invokeiuPiT84(inputMode.getValue());
            }

            /* renamed from: invoke-iuPiT84, reason: not valid java name */
            public final Boolean m23129invokeiuPiT84(int i10) {
                InputMode.Companion companion3 = InputMode.INSTANCE;
                return Boolean.valueOf(InputMode.m22166equalsimpl0(i10, companion3.m22171getTouchaOaMEAU()) ? this.this$0.isInTouchMode() : InputMode.m22166equalsimpl0(i10, companion3.m22170getKeyboardaOaMEAU()) ? this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true : false);
            }
        }, objArr3 == true ? 1 : 0);
        androidComposeView.modifierLocalManager = new ModifierLocalManager(this);
        androidComposeView.textToolbar = new AndroidTextToolbar(this);
        androidComposeView.layerCache = new WeakCache<>();
        androidComposeView.endApplyChangesListeners = new MutableObjectList<>(objArr4 == true ? 1 : 0, i9, objArr2 == true ? 1 : 0);
        androidComposeView.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                this.this$0.removeCallbacks(this);
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z9 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z9) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i10 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    }
                    AndroidComposeView androidComposeView2 = this.this$0;
                    androidComposeView2.sendSimulatedEvent(motionEvent, i10, androidComposeView2.relayoutTime, false);
                }
            }
        };
        androidComposeView.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.e
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$10(this.f1254a);
            }
        };
        androidComposeView.resendMotionEventOnLayout = new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
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
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView2 = this.this$0;
                        androidComposeView2.post(androidComposeView2.resendMotionEventRunnable);
                    }
                }
            }
        };
        int i10 = Build.VERSION.SDK_INT;
        androidComposeView.matrixToWindow = i10 < 29 ? new CalculateMatrixToWindowApi21(fArrM21639constructorimpl$default, objArr == true ? 1 : 0) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(androidComposeView.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        if (i10 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.INSTANCE.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().attach$ui_release(this);
        if (i10 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        androidComposeView.scrollCapture = i10 >= 31 ? new ScrollCapture() : null;
        androidComposeView.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentMouseCursorIcon = PointerIcon.INSTANCE.getDefault();
            private PointerIcon currentStylusHoverIcon;

            @Override // androidx.compose.p012ui.input.pointer.PointerIconService
            /* renamed from: getIcon, reason: from getter */
            public PointerIcon getCurrentMouseCursorIcon() {
                return this.currentMouseCursorIcon;
            }

            @Override // androidx.compose.p012ui.input.pointer.PointerIconService
            /* renamed from: getStylusHoverIcon, reason: from getter */
            public PointerIcon getCurrentStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // androidx.compose.p012ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon value) {
                if (value == null) {
                    value = PointerIcon.INSTANCE.getDefault();
                }
                this.currentMouseCursorIcon = value;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this.this$0, value);
            }

            @Override // androidx.compose.p012ui.input.pointer.PointerIconService
            public void setStylusHoverIcon(PointerIcon value) {
                this.currentStylusHoverIcon = value;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey) {
        int orDefault;
        if (Intrinsics.areEqual(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal())) {
            int orDefault2 = this.composeAccessibilityDelegate.getIdToBeforeMap().getOrDefault(virtualViewId, -1);
            if (orDefault2 != -1) {
                info.getExtras().putInt(extraDataKey, orDefault2);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal()) || (orDefault = this.composeAccessibilityDelegate.getIdToAfterMap().getOrDefault(virtualViewId, -1)) == -1) {
            return;
        }
        info.getExtras().putInt(extraDataKey, orDefault);
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        return (parent$ui_release == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release()) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m23120component1VKZWuLQ(long j9) {
        return (int) ULong.m24932constructorimpl(j9 >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m23121component2VKZWuLQ(long j9) {
        return (int) ULong.m24932constructorimpl(j9 & 4294967295L);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m23122convertMeasureSpecI7RO_PI(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return m23126packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m23126packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m23126packZIaKswc(size, size);
        }
        throw new IllegalStateException();
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int direction) {
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            View rootView = getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, direction);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int accessibilityId, View currentView) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, viewGroup.getChildAt(i9));
                    if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                        return viewFindViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Deprecated(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m23123handleMotionEvent8iAsVTc(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.platform.AndroidComposeView.m23123handleMotionEvent8iAsVTc(android.view.MotionEvent):int");
    }

    private final boolean handleRotaryEvent(final MotionEvent event) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -event.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f10, f10 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), event.getEventTime(), event.getDeviceId()), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.handleRotaryEvent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(event));
            }
        });
    }

    private final boolean hasChangedDevices(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final void invalidateLayers(LayoutNode node) {
        node.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = node.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i9 = 0; i9 < size; i9++) {
            invalidateLayers(layoutNodeArr[i9]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode node) {
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, node, false, 2, null);
        MutableVector<LayoutNode> mutableVector = node.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i9 = 0; i9 < size; i9++) {
            invalidateLayoutNodeMeasurement(layoutNodeArr[i9]);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent event) {
        boolean z9 = (Float.floatToRawIntBits(event.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z9) {
            int pointerCount = event.getPointerCount();
            for (int i9 = 1; i9 < pointerCount; i9++) {
                z9 = (Float.floatToRawIntBits(event.getX(i9)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getY(i9)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(event, i9));
                if (z9) {
                    break;
                }
            }
        }
        return z9;
    }

    private final boolean isDevicePressEvent(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        return 0.0f <= x9 && x9 <= ((float) getWidth()) && 0.0f <= y9 && y9 <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearFocusForOwner() {
        if (isFocused() || (!ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect onFetchFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(viewFindFocus, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMoveFocusInChildren-3ESFkO8, reason: not valid java name */
    public final boolean m23124onMoveFocusInChildren3ESFkO8(int focusDirection) {
        AndroidViewsHandler androidViewsHandler;
        View viewFindNextFocusFromRect;
        if (!ComposeUiFlags.isViewFocusFixEnabled) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (FocusDirection.m21052equalsimpl0(focusDirection, companion.m21057getEnterdhqQ8s()) || FocusDirection.m21052equalsimpl0(focusDirection, companion.m21058getExitdhqQ8s())) {
                return false;
            }
            Integer numM21064toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m21064toAndroidFocusDirection3ESFkO8(focusDirection);
            if (numM21064toAndroidFocusDirection3ESFkO8 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numM21064toAndroidFocusDirection3ESFkO8.intValue();
            Rect rectOnFetchFocusRect = onFetchFocusRect();
            androidRect = rectOnFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect) : null;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View viewFindNextFocus = androidRect == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, androidRect, iIntValue);
            if (viewFindNextFocus != null) {
                return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
            }
            return false;
        }
        FocusDirection.Companion companion2 = FocusDirection.INSTANCE;
        if (FocusDirection.m21052equalsimpl0(focusDirection, companion2.m21057getEnterdhqQ8s()) || FocusDirection.m21052equalsimpl0(focusDirection, companion2.m21058getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this._androidViewsHandler) == null) {
            return false;
        }
        Integer numM21064toAndroidFocusDirection3ESFkO82 = FocusInteropUtils_androidKt.m21064toAndroidFocusDirection3ESFkO8(focusDirection);
        if (numM21064toAndroidFocusDirection3ESFkO82 == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue2 = numM21064toAndroidFocusDirection3ESFkO82.intValue();
        View rootView = getRootView();
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        FocusFinder focusFinder2 = FocusFinder.getInstance();
        if (FocusOwnerImplKt.m21076is1dFocusSearch3ESFkO8(focusDirection) && androidViewsHandler.hasFocus()) {
            viewFindNextFocusFromRect = Build.VERSION.SDK_INT >= 26 ? focusFinder2.findNextFocus(viewGroup, viewFindFocus, iIntValue2) : FocusFinderCompat.INSTANCE.getInstance().findNextFocus1d(viewGroup, viewFindFocus, iIntValue2);
        } else {
            Rect rectOnFetchFocusRect2 = onFetchFocusRect();
            androidRect = rectOnFetchFocusRect2 != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect2) : null;
            viewFindNextFocusFromRect = focusFinder2.findNextFocusFromRect(viewGroup, androidRect, iIntValue2);
            if (viewFindNextFocusFromRect != null) {
                viewFindNextFocusFromRect.getLocationInWindow(this.tmpPositionArray);
            }
            int[] iArr = this.tmpPositionArray;
            int i9 = iArr[0];
            int i10 = iArr[1];
            getLocationInWindow(iArr);
            if (androidRect != null) {
                int[] iArr2 = this.tmpPositionArray;
                androidRect.offset(iArr2[0] - i9, iArr2[1] - i10);
            }
        }
        if (viewFindNextFocusFromRect == null || viewFindNextFocusFromRect == viewFindFocus) {
            return false;
        }
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent parent = viewFindNextFocusFromRect.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocusFromRect, Integer.valueOf(iIntValue2), androidRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRequestFocusForOwner-7o62pno, reason: not valid java name */
    public final boolean m23125onRequestFocusForOwner7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        Integer numM21064toAndroidFocusDirection3ESFkO8;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numM21064toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m21064toAndroidFocusDirection3ESFkO8(focusDirection.getValue())) == null) ? 130 : numM21064toAndroidFocusDirection3ESFkO8.intValue(), previouslyFocusedRect != null ? RectHelper_androidKt.toAndroidRect(previouslyFocusedRect) : null);
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m23126packZIaKswc(int a10, int b10) {
        return ULong.m24932constructorimpl(ULong.m24932constructorimpl(b10) | ULong.m24932constructorimpl(ULong.m24932constructorimpl(a10) << 32));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            float f12 = this.tmpPositionArray[0];
            float f13 = f11 - r0[1];
            this.windowPosition = Offset.m21160constructorimpl((Float.floatToRawIntBits(f10 - f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo23142calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m23168invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.getParent$ui_release();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$10(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.m23127sendMotionEvent8iAsVTc(motionEvent);
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m23127sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m23176setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m22694constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (pointerInputEventConvertToPointerInputEvent$ui_release == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui_release.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            while (true) {
                int i9 = size - 1;
                pointerInputEventData = pointers.get(size);
                if (pointerInputEventData.getDown()) {
                    break;
                }
                if (i9 < 0) {
                    break;
                }
                size = i9;
            }
            pointerInputEventData = null;
        } else {
            pointerInputEventData = null;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.m22648getPositionF1C5BW0();
        }
        int iM22653processBIzXfog = this.pointerInputEventProcessor.m22653processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iM22653processBIzXfog & 1) != 0) {
            return iM22653processBIzXfog;
        }
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iM22653processBIzXfog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            pointerPropertiesArr[i9] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerCoordsArr[i10] = new MotionEvent.PointerCoords();
        }
        int i11 = 0;
        while (i11 < pointerCount) {
            int i12 = ((actionIndex < 0 || i11 < actionIndex) ? 0 : 1) + i11;
            motionEvent.getPointerProperties(i12, pointerPropertiesArr[i11]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i11];
            motionEvent.getPointerCoords(i12, pointerCoords);
            float f10 = pointerCoords.x;
            long jMo22712localToScreenMKHz9U = mo22712localToScreenMKHz9U(Offset.m21160constructorimpl((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (jMo22712localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jMo22712localToScreenMKHz9U & 4294967295L));
            i11++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEventObtain, this);
        Intrinsics.checkNotNull(pointerInputEventConvertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m22653processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, true);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i9, long j9, boolean z9, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z9 = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i9, j9, z9);
    }

    private void setDensity(Density density) {
        this.density.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver.setValue(resolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m23128startDrag12SF9DM(DragAndDropTransferData transferData, long decorationSize, Function1<? super DrawScope, Unit> drawDragDecoration) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, transferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), decorationSize, drawDragDecoration, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$8(AndroidComposeView androidComposeView, boolean z9) {
        androidComposeView._inputModeManager.m22174setInputModeiuPiT84(z9 ? InputMode.INSTANCE.m22171getTouchaOaMEAU() : InputMode.INSTANCE.m22170getKeyboardaOaMEAU());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j9 = this.globalPosition;
        int iM24122getXimpl = IntOffset.m24122getXimpl(j9);
        int iM24123getYimpl = IntOffset.m24123getYimpl(j9);
        int[] iArr = this.tmpPositionArray;
        boolean z9 = false;
        int i9 = iArr[0];
        if (iM24122getXimpl != i9 || iM24123getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = IntOffset.m24116constructorimpl((i9 << 32) | (iArr[1] & 4294967295L));
            if (iM24122getXimpl != Integer.MAX_VALUE && iM24123getYimpl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                z9 = true;
            }
        }
        recalculateWindowPosition();
        getRectManager().m23249updateOffsetsucfNpQE(this.globalPosition, IntOffsetKt.m24139roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix);
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z9);
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().dispatchCallbacks();
        }
    }

    private final void updateWindowMetrics() {
        MutableState mutableState = this._windowInfo._containerSize;
        if (mutableState != null) {
            mutableState.setValue(IntSize.m24157boximpl(AndroidWindowInfo_androidKt.calculateWindowSize(this)));
        }
    }

    public final void addAndroidView(AndroidViewHolder view, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        view.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r5, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6) {
                /*
                    r4 = this;
                    super.onInitializeAccessibilityNodeInfo(r5, r6)
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = androidx.compose.p012ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r5)
                    boolean r5 = r5.isEnabled$ui_release()
                    if (r5 == 0) goto L13
                    r5 = 0
                    r6.setVisibleToUser(r5)
                L13:
                    androidx.compose.ui.node.LayoutNode r5 = r2
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
                L19:
                    r0 = 0
                    if (r5 == 0) goto L32
                    androidx.compose.ui.node.NodeChain r1 = r5.getNodes()
                    r2 = 8
                    int r2 = androidx.compose.p012ui.node.NodeKind.m23019constructorimpl(r2)
                    boolean r1 = r1.m22980hasH91voCI$ui_release(r2)
                    if (r1 == 0) goto L2d
                    goto L33
                L2d:
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
                    goto L19
                L32:
                    r5 = r0
                L33:
                    if (r5 == 0) goto L3d
                    int r5 = r5.getSemanticsId()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L3d:
                    r5 = -1
                    if (r0 == 0) goto L54
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.semantics.SemanticsOwner r1 = r1.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r1 = r1.getUnmergedRootSemanticsNode()
                    int r1 = r1.getId()
                    int r2 = r0.intValue()
                    if (r2 != r1) goto L58
                L54:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L58:
                    androidx.compose.ui.platform.AndroidComposeView r1 = r3
                    int r0 = r0.intValue()
                    r6.setParent(r1, r0)
                    androidx.compose.ui.node.LayoutNode r0 = r2
                    int r0 = r0.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.p012ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToBeforeMap()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto L9f
                    androidx.compose.ui.platform.AndroidComposeView r2 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r2 = r2.getAndroidViewsHandler$ui_release()
                    android.view.View r2 = androidx.compose.p012ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r2, r1)
                    if (r2 == 0) goto L87
                    r6.setTraversalBefore(r2)
                    goto L8c
                L87:
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    r6.setTraversalBefore(r2, r1)
                L8c:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r2 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r3 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = androidx.compose.p012ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r3)
                    java.lang.String r3 = r3.getExtraDataTestTraversalBeforeVal()
                    androidx.compose.p012ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r0, r2, r3)
                L9f:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.p012ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToAfterMap()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto Ld7
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r5 = r5.getAndroidViewsHandler$ui_release()
                    android.view.View r5 = androidx.compose.p012ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r5, r1)
                    if (r5 == 0) goto Lbf
                    r6.setTraversalAfter(r5)
                    goto Lc4
                Lbf:
                    androidx.compose.ui.platform.AndroidComposeView r5 = r3
                    r6.setTraversalAfter(r5, r1)
                Lc4:
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r6 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p012ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.p012ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r1 = r1.getExtraDataTestTraversalAfterVal()
                    androidx.compose.p012ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r5, r0, r6, r1)
                Ld7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.platform.AndroidComposeView.C28761.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        addView(child, -1);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> values) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
                androidAutofillManager.performAutofill(values);
            }
            AndroidAutofill androidAutofill = this._autofill;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
            }
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(Continuation<? super Unit> continuation) {
        Object objBoundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(continuation);
        return objBoundsUpdatesEventLoop$ui_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBoundsUpdatesEventLoop$ui_release : Unit.INSTANCE;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(Continuation<? super Unit> continuation) {
        Object objBoundsUpdatesEventLoop$ui_release = this.contentCaptureManager.boundsUpdatesEventLoop$ui_release(continuation);
        return objBoundsUpdatesEventLoop$ui_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBoundsUpdatesEventLoop$ui_release : Unit.INSTANCE;
    }

    @Override // androidx.compose.p012ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo23077calculateLocalPositionMKHz9U(long positionInWindow) {
        recalculateWindowPosition();
        return Matrix.m21645mapMKHz9U(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.p012ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo23078calculatePositionInWindowMKHz9U(long localPosition) {
        recalculateWindowPosition();
        return Matrix.m21645mapMKHz9U(this.viewToWindowMatrix, localPosition);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.m23136canScroll0AR0LA0$ui_release(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.m23136canScroll0AR0LA0$ui_release(true, direction, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public OwnedLayer createLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer, GraphicsLayer explicitLayer, boolean forceUseOldLayers) {
        if (explicitLayer != null) {
            return new GraphicsLayerOwnerLayer(explicitLayer, null, this, drawBlock, invalidateParentLayer);
        }
        if (!forceUseOldLayers) {
            OwnedLayer ownedLayerPop = this.layerCache.pop();
            if (ownedLayerPop == null) {
                return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, drawBlock, invalidateParentLayer);
            }
            ownedLayerPop.reuseLayer(drawBlock, invalidateParentLayer);
            return ownedLayerPop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.INSTANCE;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = companion.getShouldUseDispatchDraw() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
            this.viewLayersContainer = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.viewLayersContainer;
        Intrinsics.checkNotNull(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, drawBlock, invalidateParentLayer);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.INSTANCE.notifyObjectsInitialized();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas(), null);
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i9 = 0; i9 < size; i9++) {
                this.dirtyLayers.get(i9).updateDisplayList();
            }
        }
        if (ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().dispatchCallbacks();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        return motionEvent.getActionMasked() == 8 ? (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (m23123handleMotionEvent8iAsVTc(motionEvent) & 1) != 0 : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (!isBadMotionEvent(event) && isAttachedToWindow()) {
            this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(event);
            int actionMasked = event.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(event)) {
                    if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent = this.previousMotionEvent;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                    this.hoverExitReceived = true;
                    postDelayed(this.sendHoverExitEvent, 8L);
                    return false;
                }
            } else if (!isPositionChanged(event)) {
                return false;
            }
            if ((m23123handleMotionEvent8iAsVTc(event) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(final android.view.KeyEvent event) {
        if (!isFocused()) {
            return getFocusOwner().mo21069dispatchKeyEventYhN2O0w(KeyEvent.m22472constructorimpl(event), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(event));
                }
            });
        }
        this._windowInfo.m23176setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m22694constructorimpl(event.getMetaState()));
        return FocusOwner.m21066dispatchKeyEventYhN2O0w$default(getFocusOwner(), KeyEvent.m22472constructorimpl(event), null, 2, null) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent event) {
        return (isFocused() && getFocusOwner().mo21068dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent.m22472constructorimpl(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        if (Build.VERSION.SDK_INT < 28) {
            AndroidComposeViewAssistHelperMethodsO.INSTANCE.setClassName(structure, getView());
        } else {
            super.dispatchProvideStructure(structure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int iM23123handleMotionEvent8iAsVTc = m23123handleMotionEvent8iAsVTc(motionEvent);
        if ((iM23123handleMotionEvent8iAsVTc & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iM23123handleMotionEvent8iAsVTc & 1) != 0;
    }

    public final void drawAndroidView(AndroidViewHolder view, android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        Rect rectCalculateBoundingRectRelativeTo;
        if (focused == null || this.measureAndLayoutDelegate.getDuringMeasureLayout()) {
            return super.focusSearch(focused, direction);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, focused, direction);
        if (focused != this || (rectCalculateBoundingRectRelativeTo = getFocusOwner().getFocusRect()) == null) {
            rectCalculateBoundingRectRelativeTo = FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(focused, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(direction);
        int value = focusDirection != null ? focusDirection.getValue() : FocusDirection.INSTANCE.m21056getDowndhqQ8s();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (getFocusOwner().mo21070focusSearchULY8qGw(value, rectCalculateBoundingRectRelativeTo, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = focusTargetNode;
                return Boolean.TRUE;
            }
        }) != null) {
            if (objectRef.element != 0) {
                if (viewFindNextFocus != null) {
                    if (FocusOwnerImplKt.m21076is1dFocusSearch3ESFkO8(value)) {
                        return super.focusSearch(focused, direction);
                    }
                    T t9 = objectRef.element;
                    Intrinsics.checkNotNull(t9);
                    if (TwoDimensionalFocusSearchKt.m21116isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) t9), FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(viewFindNextFocus, this), rectCalculateBoundingRectRelativeTo, value)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return focused;
    }

    @Override // androidx.compose.p012ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean enable) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui_release(enable);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, affectsLookahead);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public androidx.compose.p012ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final AndroidContentCaptureManager getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.p012ui.node.Owner, androidx.compose.p012ui.node.RootForTest
    public Density getDensity() {
        return (Density) this.density.getValue();
    }

    @Override // androidx.compose.p012ui.node.Owner
    /* renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo23079getFocusDirectionP8AzH3I(android.view.KeyEvent keyEvent) {
        long jM22488getKeyZmokQxo = KeyEvent_androidKt.m22488getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.INSTANCE;
        if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22416getTabEK5gGoQ())) {
            return FocusDirection.m21049boximpl(KeyEvent_androidKt.m22494isShiftPressedZmokQxo(keyEvent) ? FocusDirection.INSTANCE.m21061getPreviousdhqQ8s() : FocusDirection.INSTANCE.m21060getNextdhqQ8s());
        }
        if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22257getDirectionRightEK5gGoQ())) {
            return FocusDirection.m21049boximpl(FocusDirection.INSTANCE.m21062getRightdhqQ8s());
        }
        if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22256getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m21049boximpl(FocusDirection.INSTANCE.m21059getLeftdhqQ8s());
        }
        if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22258getDirectionUpEK5gGoQ()) ? true : Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22369getPageUpEK5gGoQ())) {
            return FocusDirection.m21049boximpl(FocusDirection.INSTANCE.m21063getUpdhqQ8s());
        }
        if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22253getDirectionDownEK5gGoQ()) ? true : Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22368getPageDownEK5gGoQ())) {
            return FocusDirection.m21049boximpl(FocusDirection.INSTANCE.m21056getDowndhqQ8s());
        }
        if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22252getDirectionCenterEK5gGoQ()) ? true : Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22266getEnterEK5gGoQ()) ? true : Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22358getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m21049boximpl(FocusDirection.INSTANCE.m21057getEnterdhqQ8s());
        }
        if (Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22195getBackEK5gGoQ()) ? true : Key.m22180equalsimpl0(jM22488getKeyZmokQxo, companion.m22269getEscapeEK5gGoQ())) {
            return FocusDirection.m21049boximpl(FocusDirection.INSTANCE.m21058getExitdhqQ8s());
        }
        return null;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        Rect rectOnFetchFocusRect = onFetchFocusRect();
        if (rectOnFetchFocusRect != null) {
            rect.left = Math.round(rectOnFetchFocusRect.getLeft());
            rect.top = Math.round(rectOnFetchFocusRect.getTop());
            rect.right = Math.round(rectOnFetchFocusRect.getRight());
            rect.bottom = Math.round(rectOnFetchFocusRect.getBottom());
            return;
        }
        if (Intrinsics.areEqual(getFocusOwner().mo21070focusSearchULY8qGw(FocusDirection.INSTANCE.m21056getDowndhqQ8s(), null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.getFocusedRect.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.TRUE;
            }
        }), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.p012ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.p012ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.p012ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.p012ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.p012ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.p012ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // androidx.compose.p012ui.node.Owner, androidx.compose.p012ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.p012ui.node.Owner, androidx.compose.p012ui.node.RootForTest
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.p012ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.p012ui.node.Owner
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    /* renamed from: get_autofillManager$ui_release, reason: from getter */
    public final AndroidAutofillManager get_autofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    @Override // androidx.compose.p012ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.p012ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.RESUMED;
    }

    @Override // androidx.compose.p012ui.input.pointer.MatrixPositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo22561localToScreen58bKbWc(float[] localTransform) {
        recalculateWindowPosition();
        Matrix.m21658timesAssign58bKbWc(localTransform, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m23141preTranslatecG2Xzmc(localTransform, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)), this.tmpMatrix);
    }

    @Override // androidx.compose.p012ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo22712localToScreenMKHz9U(long localPosition) {
        recalculateWindowPosition();
        long jM21645mapMKHz9U = Matrix.m21645mapMKHz9U(this.viewToWindowMatrix, localPosition);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM21645mapMKHz9U >> 32)) + Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM21645mapMKHz9U & 4294967295L)) + Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Offset.m21160constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void measureAndLayout(boolean sendPointerUpdate) {
        Function0<Unit> function0;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    function0 = this.resendMotionEventOnLayout;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                function0 = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            dispatchPendingInteropLayoutCallbacks();
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.p012ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo23080measureAndLayout0kLqBqw(LayoutNode layoutNode, long constraints) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m22967measureAndLayout0kLqBqw(layoutNode, constraints);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
                dispatchPendingInteropLayoutCallbacks();
            }
            if (ComposeUiFlags.isRectTrackingEnabled) {
                getRectManager().dispatchCallbacks();
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.p012ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer layer, boolean isDirty) {
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            List<OwnedLayer> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        List arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(layer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        this._windowInfo.setWindowFocused(hasWindowFocus());
        this._windowInfo.setOnInitializeContainerSize(new Function0<IntSize>() { // from class: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ IntSize invoke() {
                return IntSize.m24157boximpl(m23134invokeYbymL2g());
            }

            /* renamed from: invoke-YbymL2g, reason: not valid java name */
            public final long m23134invokeYbymL2g() {
                return AndroidWindowInfo_androidKt.calculateWindowSize(AndroidComposeView.this);
            }
        });
        updateWindowMetrics();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner3 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (lifecycleOwner3 != null && savedStateRegistryOwner != null && (lifecycleOwner3 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner3.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner3, savedStateRegistryOwner);
            set_viewTreeOwners(viewTreeOwners2);
            Function1<? super ViewTreeOwners, Unit> function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m22174setInputModeiuPiT84(isInTouchMode() ? InputMode.INSTANCE.m22171getTouchaOaMEAU() : InputMode.INSTANCE.m22170getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (viewTreeOwners3 != null && (lifecycleOwner2 = viewTreeOwners3.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle2.addObserver(this);
        lifecycle2.addObserver(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getListeners().add(androidAutofillManager);
            getSemanticsOwner().getListeners$ui_release().add(androidAutofillManager);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m20992getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.getEditorHasFocus() : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setDensity(AndroidDensity_androidKt.Density(getContext()));
        updateWindowMetrics();
        if (getFontWeightAdjustmentCompat(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(newConfig);
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m20992getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.createInputConnection(outAttrs) : androidPlatformTextInputSession.createInputConnection(outAttrs);
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onCreateVirtualViewTranslationRequests(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui_release(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onDetach(LayoutNode node) {
        AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().remove(node.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(node);
        requestClearInvalidObservations();
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().remove(node);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onDetach$ui_release(node);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        Lifecycle lifecycle = null;
        this._windowInfo.setOnInitializeContainerSize(null);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null) {
            lifecycle = lifecycleOwner.getLifecycle();
        }
        if (lifecycle == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle.removeObserver(this.contentCaptureManager);
        lifecycle.removeObserver(this);
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().getListeners$ui_release().remove(androidAutofillManager);
            getFocusOwner().getListeners().remove(androidAutofillManager);
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onEndApplyChanges() {
        AndroidAutofillManager androidAutofillManager;
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onEndApplyChanges$ui_release();
        }
        while (this.endApplyChangesListeners.isNotEmpty() && this.endApplyChangesListeners.get(0) != null) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i9 = 0; i9 < size; i9++) {
                Function0<Unit> function0 = this.endApplyChangesListeners.get(i9);
                this.endApplyChangesListeners.set(i9, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l9, int t9, int r9, int b10) throws Throwable {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r9 - l9, b10 - t9);
        }
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui_release();
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onLayoutNodeDeactivated(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().remove(layoutNode);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onLayoutNodeDeactivated$ui_release(layoutNode);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long jM23122convertMeasureSpecI7RO_PI = m23122convertMeasureSpecI7RO_PI(widthMeasureSpec);
            int iM24932constructorimpl = (int) ULong.m24932constructorimpl(jM23122convertMeasureSpecI7RO_PI >>> 32);
            int iM24932constructorimpl2 = (int) ULong.m24932constructorimpl(jM23122convertMeasureSpecI7RO_PI & 4294967295L);
            long jM23122convertMeasureSpecI7RO_PI2 = m23122convertMeasureSpecI7RO_PI(heightMeasureSpec);
            long jM23955fitPrioritizingHeightZbe2FdA = Constraints.INSTANCE.m23955fitPrioritizingHeightZbe2FdA(iM24932constructorimpl, iM24932constructorimpl2, (int) ULong.m24932constructorimpl(jM23122convertMeasureSpecI7RO_PI2 >>> 32), (int) ULong.m24932constructorimpl(4294967295L & jM23122convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            boolean zM23940equalsimpl0 = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m23934boximpl(jM23955fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    zM23940equalsimpl0 = Constraints.m23940equalsimpl0(constraints.getValue(), jM23955fitPrioritizingHeightZbe2FdA);
                }
                if (!zM23940equalsimpl0) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m22968updateRootConstraintsBRTryo0(jM23955fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onPostAttach(LayoutNode node) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostAttach$ui_release(node);
        }
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onPostLayoutNodeReused(LayoutNode layoutNode, int oldSemanticsId) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostLayoutNodeReused$ui_release(layoutNode, oldSemanticsId);
        }
        getRectManager().m23248onLayoutPositionChanged70tqf50(layoutNode, layoutNode.getLayoutDelegate().getMeasurePassDelegate().getLastPosition(), true);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onPreAttach(LayoutNode node) {
        getLayoutNodes().set(node.getSemanticsId(), node);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onPreLayoutNodeReused(LayoutNode layoutNode, int oldSemanticsId) {
        getLayoutNodes().remove(oldSemanticsId);
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || structure == null) {
            return;
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.populateViewStructure(structure);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, structure);
        }
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, forceRequest)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, forceRequest)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(24)
    public android.view.PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        PointerIcon stylusHoverIcon;
        int toolType = event.getToolType(pointerIndex);
        return (event.isFromSource(8194) || !event.isFromSource(InputDeviceCompat.SOURCE_STYLUS) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getCurrentStylusHoverIcon()) == null) ? super.onResolvePointerIcon(event, pointerIndex) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        setShowLayoutBounds(INSTANCE.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection2 = FocusInteropUtils_androidKt.toLayoutDirection(layoutDirection);
            if (layoutDirection2 == null) {
                layoutDirection2 = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection2);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect localVisibleRect, Point windowOffset, Consumer<ScrollCaptureTarget> targets) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), targets);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
        this.contentCaptureManager.onSemanticsChange$ui_release();
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> response) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui_release(androidContentCaptureManager, response);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (isShowingLayoutBounds = INSTANCE.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui_release(OwnedLayer layer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.INSTANCE.getShouldUseDispatchDraw();
        }
        this.layerCache.push(layer);
        this.dirtyLayers.remove(layer);
        return true;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void registerOnEndApplyChangesListener(Function0<Unit> listener) {
        if (this.endApplyChangesListeners.contains(listener)) {
            return;
        }
        this.endApplyChangesListeners.add(listener);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener listener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(listener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(final AndroidViewHolder view) {
        registerOnEndApplyChangesListener(new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView.removeAndroidView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(view);
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
                view.setImportantForAccessibility(0);
            }
        });
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void requestAutofill(LayoutNode node) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.requestAutofill$ui_release(node);
        }
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) {
        View viewFindNextNonChildView;
        if (!ComposeUiFlags.isViewFocusFixEnabled) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().getRootState().getHasFocus()) {
                return super.requestFocus(direction, previouslyFocusedRect);
            }
            FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(direction);
            final int value = focusDirection != null ? focusDirection.getValue() : FocusDirection.INSTANCE.m21057getEnterdhqQ8s();
            return Intrinsics.areEqual(getFocusOwner().mo21070focusSearchULY8qGw(value, previouslyFocusedRect != null ? RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.requestFocus.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.mo21083requestFocus3ESFkO8(value));
                }
            }), Boolean.TRUE);
        }
        if (isFocused()) {
            return true;
        }
        if (this.processingRequestFocusForNextNonChildView || getFocusOwner().getFocusTransactionManager().getOngoingTransaction()) {
            return false;
        }
        FocusDirection focusDirection2 = FocusInteropUtils_androidKt.toFocusDirection(direction);
        final int value2 = focusDirection2 != null ? focusDirection2.getValue() : FocusDirection.INSTANCE.m21057getEnterdhqQ8s();
        if (hasFocus() && m23124onMoveFocusInChildren3ESFkO8(value2)) {
            return true;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Boolean boolMo21070focusSearchULY8qGw = getFocusOwner().mo21070focusSearchULY8qGw(value2, previouslyFocusedRect != null ? RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocus$focusSearchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                booleanRef.element = true;
                return Boolean.valueOf(focusTargetNode.mo21083requestFocus3ESFkO8(value2));
            }
        });
        if (boolMo21070focusSearchULY8qGw == null) {
            return false;
        }
        if (boolMo21070focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (booleanRef.element) {
            return false;
        }
        if ((previouslyFocusedRect != null && !hasFocus() && Intrinsics.areEqual(getFocusOwner().mo21070focusSearchULY8qGw(value2, null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocus$altFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo21083requestFocus3ESFkO8(value2));
            }
        }), Boolean.TRUE)) || (viewFindNextNonChildView = findNextNonChildView(direction)) == null || viewFindNextNonChildView == this) {
            return true;
        }
        this.processingRequestFocusForNextNonChildView = true;
        boolean zRequestFocus = viewFindNextNonChildView.requestFocus(direction);
        this.processingRequestFocusForNextNonChildView = false;
        return zRequestFocus;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.p012ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo22713screenToLocalMKHz9U(long positionOnScreen) {
        recalculateWindowPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (positionOnScreen >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (positionOnScreen & 4294967295L)) - Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Matrix.m21645mapMKHz9U(this.windowToViewMatrix, Offset.m21160constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2))));
    }

    @Override // androidx.compose.p012ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo23081sendKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        return getFocusOwner().mo21068dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || FocusOwner.m21066dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // androidx.compose.p012ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui_release(intervalMillis);
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        this.configurationChangeObserver = function1;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        DelegatableNode head = getRoot().getNodes().getHead();
        if (head instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) head).resetPointerInputHandler();
        }
        int iM23019constructorimpl = NodeKind.m23019constructorimpl(16);
        if (!head.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = head.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, head.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & iM23019constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM23019constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) delegatingNodePop;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).resetPointerInputHandler();
                                }
                            } else if ((delegatingNodePop.getKindSet() & iM23019constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNodePop.getDelegate();
                                int i9 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM23019constructorimpl) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            delegatingNodePop = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i9 == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j9) {
        this.lastMatrixRecalculationAnimationTime = j9;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super ViewTreeOwners, Unit> callback) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public void setShowLayoutBounds(boolean z9) {
        this.showLayoutBounds = z9;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p012ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object textInputSession(kotlin.jvm.functions.Function2<? super androidx.compose.p012ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.p012ui.platform.AndroidComposeView.C28841
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.p012ui.platform.AndroidComposeView.C28841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L44
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = androidx.compose.p012ui.SessionMutex.m20995withSessionCancellingPreviousimpl(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.platform.AndroidComposeView.textInputSession(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        Intrinsics.checkNotNull(child);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(child, index, layoutParams);
    }

    @Override // androidx.compose.p012ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.p012ui.node.Owner
    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = width;
        layoutParamsGenerateDefaultLayoutParams.height = height;
        Unit unit = Unit.INSTANCE;
        addView(child, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        addView(child, -1, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        addViewInLayout(child, index, params, true);
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        long jM21645mapMKHz9U = Matrix.m21645mapMKHz9U(fArr, Offset.m21160constructorimpl((Float.floatToRawIntBits(y9) & 4294967295L) | (Float.floatToRawIntBits(x9) << 32)));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM21645mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM21645mapMKHz9U & 4294967295L));
        this.windowPosition = Offset.m21160constructorimpl((Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L));
    }
}
