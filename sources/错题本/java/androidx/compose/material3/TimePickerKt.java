package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifierKt;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.key.KeyInputModifierKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.PlatformImeOptions;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpKt;
import androidx.compose.p011ui.unit.DpOffset;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
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
import p152r6.InterfaceC6474f;
import p169t6.AbstractC6600a;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010$\u001a\u00020\b*\u00020 2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a3\u0010%\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0011H\u0001¢\u0006\u0004\b%\u0010&\u001a3\u0010'\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0011H\u0001¢\u0006\u0004\b'\u0010&\u001a'\u0010(\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b(\u0010)\u001a\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b,\u0010+\u001a\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b-\u0010+\u001a'\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b.\u0010/\u001a'\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u0010/\u001a?\u00106\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0003¢\u0006\u0004\b6\u00107\u001aS\u0010A\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u0002032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0:2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010@\u001a\u0018\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0<¢\u0006\u0002\b>¢\u0006\u0002\b?H\u0003¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010C\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\bC\u0010D\u001a:\u0010J\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a'\u0010K\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0011H\u0001¢\u0006\u0004\bK\u0010L\u001a#\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bM\u0010N\u001a/\u0010O\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0011H\u0003¢\u0006\u0004\bO\u0010P\u001a]\u0010Y\u001a\u00020\b2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010E\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u000e2!\u0010V\u001a\u001d\u0012\u0013\u0012\u00110Q¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\b0<H\u0002ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001ab\u0010a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020Q2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0<2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010\\\u001a\u00020[2\b\b\u0002\u0010^\u001a\u00020]2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a7\u0010f\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010c\u001a\u00020b2\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\b0:¢\u0006\u0002\b>H\u0003ø\u0001\u0000¢\u0006\u0004\bd\u0010e\u001a*\u0010k\u001a\u00020h2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010g\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\bi\u0010j\u001a/\u0010p\u001a\u00020\u00172\u0006\u0010l\u001a\u00020\u00172\u0006\u0010m\u001a\u00020\u00172\u0006\u0010n\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020\u000eH\u0002¢\u0006\u0004\bp\u0010q\u001a\u001f\u0010r\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\br\u0010s\u001a\u001b\u0010t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010t\u001a\u00020\u0011H\u0003¢\u0006\u0004\bt\u0010u\"\u0014\u0010v\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010w\"\u0014\u0010x\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010w\"\u0014\u0010z\u001a\u00020y8\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010{\"\u0014\u0010|\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010w\"\u0014\u0010}\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010w\"\u0014\u0010~\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010w\"\u0014\u0010\u007f\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010w\"\u0016\u0010\u0080\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010w\"\u0016\u0010\u0081\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010w\"\u0016\u0010\u0082\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010w\"\u0016\u0010\u0083\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010w\"\u0016\u0010\u0084\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010w\"\u0016\u0010\u0085\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010w\"\u0016\u0010\u0086\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010w\"\u0016\u0010\u0087\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010w\"\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001\"\u0018\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001\"\u0016\u0010\u008d\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010w\"\u001b\u0010\u0090\u0001\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u001c\u0010\u0094\u0001\u001a\u00030\u0091\u0001*\u00020 8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u009a\u0001²\u0006\r\u0010\u0095\u0001\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0096\u0001\u001a\u00020Q8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0097\u0001\u001a\u00020Q8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u001c\u001a\u00030\u0098\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0099\u0001\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"Landroidx/compose/material3/TimePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "Ld6/s;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePicker", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "TimePickerState", "(IIZ)Landroidx/compose/material3/TimePickerState;", "", "x", "y", "maxDist", "Landroidx/compose/ui/unit/IntOffset;", "center", "moveSelector-d3b8Pxo", "(Landroidx/compose/material3/TimePickerState;FFFJ)V", "moveSelector", "Landroidx/compose/material3/AnalogTimePickerState;", "autoSwitchToMinute", "onTap-rOwcSBo", "(Landroidx/compose/material3/AnalogTimePickerState;FFFZJLh6/c;)Ljava/lang/Object;", "onTap", "VerticalTimePicker", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "ClockDisplayNumbers", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalPeriodToggle", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/graphics/Shape;", "startShape", "endShape", "PeriodToggleImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ToggleItem", "(ZLandroidx/compose/ui/graphics/Shape;Lr6/a;Landroidx/compose/material3/TimePickerColors;Lr6/f;Landroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "value", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "TimeSelector-SAnMeKU", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "TimeSelector", "ClockFace", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "drawSelector", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;)Landroidx/compose/ui/Modifier;", "ClockText", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "prevValue", "max", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "onNewValue", "timeInputOnChange-z7XvuPQ", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILr6/c;)V", "timeInputOnChange", "onValueChange", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "TimePickerTextField-1vLObsk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lr6/c;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/unit/Dp;", "radius", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLr6/e;Landroidx/compose/runtime/Composer;II)V", "CircularLayout", "number", "", "numberContentDescription-dSwYdS4", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberContentDescription", "x1", "y1", "x2", "y2", "dist", "(FFII)F", "atan", "(FF)F", "visible", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "FullCircle", "F", "HalfCircle", "", "QuarterCircle", "D", "RadiansPerMinute", "RadiansPerHour", "SeparatorZIndex", "OuterCircleSizeRadius", "InnerCircleRadius", "ClockDisplayBottomMargin", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "SupportLabelTop", "TimeInputBottomPadding", "MaxDistance", "MinimumInteractiveSize", "Landroidx/collection/IntList;", "Minutes", "Landroidx/collection/IntList;", "Hours", "ExtraHours", "PeriodToggleMargin", "getHourForDisplay", "(Landroidx/compose/material3/TimePickerState;)I", "hourForDisplay", "Landroidx/compose/ui/unit/DpOffset;", "getSelectorPos", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "selectorPos", "a11yServicesEnabled", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "parentCenter", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 15 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 16 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 18 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,2008:1\n1223#2,6:2009\n1223#2,6:2015\n1223#2,6:2110\n1223#2,6:2116\n1223#2,6:2364\n1223#2,6:2370\n1223#2,6:2377\n1223#2,6:2411\n1223#2,6:2417\n1223#2,6:2426\n1223#2,6:2475\n1223#2,6:2481\n1223#2,6:2489\n1223#2,6:2495\n1223#2,3:2506\n1226#2,3:2512\n1223#2,6:2516\n1223#2,6:2522\n1223#2,6:2563\n1223#2,6:2573\n1223#2,6:2579\n1223#2,6:2659\n1223#2,6:2676\n1223#2,6:2682\n71#3:2021\n56#3:2022\n50#3:2023\n83#3:2024\n71#3:2025\n50#3:2026\n83#3:2027\n71#3:2028\n50#3:2029\n85#4:2030\n82#4,6:2031\n88#4:2065\n92#4:2069\n85#4:2202\n81#4,7:2203\n88#4:2238\n92#4:2282\n85#4:2585\n82#4,6:2586\n88#4:2620\n92#4:2675\n78#5,6:2037\n85#5,4:2052\n89#5,2:2062\n93#5:2068\n78#5,6:2077\n85#5,4:2092\n89#5,2:2102\n93#5:2108\n78#5,6:2129\n85#5,4:2144\n89#5,2:2154\n78#5,6:2165\n85#5,4:2180\n89#5,2:2190\n93#5:2196\n93#5:2200\n78#5,6:2210\n85#5,4:2225\n89#5,2:2235\n78#5,6:2246\n85#5,4:2261\n89#5,2:2271\n93#5:2277\n93#5:2281\n78#5,6:2291\n85#5,4:2306\n89#5,2:2316\n78#5,6:2327\n85#5,4:2342\n89#5,2:2352\n93#5:2358\n93#5:2362\n78#5,6:2383\n85#5,4:2398\n89#5,2:2408\n93#5:2425\n78#5,6:2440\n85#5,4:2455\n89#5,2:2465\n93#5:2471\n78#5,6:2534\n85#5,4:2549\n89#5,2:2559\n93#5:2571\n78#5,6:2592\n85#5,4:2607\n89#5,2:2617\n78#5,6:2630\n85#5,4:2645\n89#5,2:2655\n93#5:2668\n93#5:2674\n78#5,6:2688\n85#5,4:2703\n89#5,2:2713\n93#5:2718\n368#6,9:2043\n377#6:2064\n378#6,2:2066\n368#6,9:2083\n377#6:2104\n378#6,2:2106\n368#6,9:2135\n377#6:2156\n368#6,9:2171\n377#6:2192\n378#6,2:2194\n378#6,2:2198\n368#6,9:2216\n377#6:2237\n368#6,9:2252\n377#6:2273\n378#6,2:2275\n378#6,2:2279\n368#6,9:2297\n377#6:2318\n368#6,9:2333\n377#6:2354\n378#6,2:2356\n378#6,2:2360\n368#6,9:2389\n377#6:2410\n378#6,2:2423\n368#6,9:2446\n377#6:2467\n378#6,2:2469\n368#6,9:2540\n377#6:2561\n378#6,2:2569\n368#6,9:2598\n377#6:2619\n368#6,9:2636\n377#6:2657\n378#6,2:2666\n378#6,2:2672\n368#6,9:2694\n377#6,3:2715\n4032#7,6:2056\n4032#7,6:2096\n4032#7,6:2148\n4032#7,6:2184\n4032#7,6:2229\n4032#7,6:2265\n4032#7,6:2310\n4032#7,6:2346\n4032#7,6:2402\n4032#7,6:2459\n4032#7,6:2553\n4032#7,6:2611\n4032#7,6:2649\n4032#7,6:2707\n98#8:2070\n95#8,6:2071\n101#8:2105\n105#8:2109\n98#8:2122\n95#8,6:2123\n101#8:2157\n105#8:2201\n98#8:2283\n94#8,7:2284\n101#8:2319\n105#8:2363\n71#9:2158\n68#9,6:2159\n74#9:2193\n78#9:2197\n71#9:2239\n68#9,6:2240\n74#9:2274\n78#9:2278\n71#9:2320\n68#9,6:2321\n74#9:2355\n78#9:2359\n71#9:2434\n69#9,5:2435\n74#9:2468\n78#9:2472\n71#9:2528\n69#9,5:2529\n74#9:2562\n78#9:2572\n71#9:2623\n68#9,6:2624\n74#9:2658\n78#9:2669\n201#10:2376\n207#10:2473\n204#10:2474\n228#10:2621\n225#10:2622\n219#10:2670\n222#10:2671\n213#10:2719\n216#10:2720\n210#10:2721\n148#11:2432\n148#11:2736\n148#11:2737\n148#11:2738\n148#11:2739\n148#11:2740\n148#11:2741\n148#11:2742\n148#11:2743\n148#11:2744\n148#11:2751\n77#12:2433\n77#12:2487\n77#12:2665\n1#13:2488\n488#14:2501\n487#14,4:2502\n491#14,2:2509\n495#14:2515\n487#15:2511\n135#16:2722\n81#17:2723\n81#17:2724\n107#17,2:2725\n81#17:2727\n107#17,2:2728\n81#17:2730\n107#17,2:2731\n81#17:2733\n107#17,2:2734\n253#18,6:2745\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n223#1:2009,6\n576#1:2015,6\n966#1:2110,6\n970#1:2116,6\n1161#1:2364,6\n1207#1:2370,6\n1264#1:2377,6\n1275#1:2411,6\n1289#1:2417,6\n1311#1:2426,6\n1364#1:2475,6\n1368#1:2481,6\n1642#1:2489,6\n1643#1:2495,6\n1644#1:2506,3\n1644#1:2512,3\n1666#1:2516,6\n1671#1:2522,6\n1689#1:2563,6\n1763#1:2573,6\n1764#1:2579,6\n1804#1:2659,6\n1858#1:2676,6\n1872#1:2682,6\n907#1:2021\n914#1:2022\n916#1:2023\n917#1:2024\n917#1:2025\n917#1:2026\n918#1:2027\n918#1:2028\n918#1:2029\n931#1:2030\n931#1:2031,6\n931#1:2065\n931#1:2069\n1088#1:2202\n1088#1:2203,7\n1088#1:2238\n1088#1:2282\n1772#1:2585\n1772#1:2586,6\n1772#1:2620\n1772#1:2675\n931#1:2037,6\n931#1:2052,4\n931#1:2062,2\n931#1:2068\n949#1:2077,6\n949#1:2092,4\n949#1:2102,2\n949#1:2108\n973#1:2129,6\n973#1:2144,4\n973#1:2154,2\n1074#1:2165,6\n1074#1:2180,4\n1074#1:2190,2\n1074#1:2196\n973#1:2200\n1088#1:2210,6\n1088#1:2225,4\n1088#1:2235,2\n1091#1:2246,6\n1091#1:2261,4\n1091#1:2271,2\n1091#1:2277\n1088#1:2281\n1108#1:2291,6\n1108#1:2306,4\n1108#1:2316,2\n1111#1:2327,6\n1111#1:2342,4\n1111#1:2352,2\n1111#1:2358\n1108#1:2362\n1261#1:2383,6\n1261#1:2398,4\n1261#1:2408,2\n1261#1:2425\n1336#1:2440,6\n1336#1:2455,4\n1336#1:2465,2\n1336#1:2471\n1660#1:2534,6\n1660#1:2549,4\n1660#1:2559,2\n1660#1:2571\n1772#1:2592,6\n1772#1:2607,4\n1772#1:2617,2\n1797#1:2630,6\n1797#1:2645,4\n1797#1:2655,2\n1797#1:2668\n1772#1:2674\n1872#1:2688,6\n1872#1:2703,4\n1872#1:2713,2\n1872#1:2718\n931#1:2043,9\n931#1:2064\n931#1:2066,2\n949#1:2083,9\n949#1:2104\n949#1:2106,2\n973#1:2135,9\n973#1:2156\n1074#1:2171,9\n1074#1:2192\n1074#1:2194,2\n973#1:2198,2\n1088#1:2216,9\n1088#1:2237\n1091#1:2252,9\n1091#1:2273\n1091#1:2275,2\n1088#1:2279,2\n1108#1:2297,9\n1108#1:2318\n1111#1:2333,9\n1111#1:2354\n1111#1:2356,2\n1108#1:2360,2\n1261#1:2389,9\n1261#1:2410\n1261#1:2423,2\n1336#1:2446,9\n1336#1:2467\n1336#1:2469,2\n1660#1:2540,9\n1660#1:2561\n1660#1:2569,2\n1772#1:2598,9\n1772#1:2619\n1797#1:2636,9\n1797#1:2657\n1797#1:2666,2\n1772#1:2672,2\n1872#1:2694,9\n1872#1:2715,3\n931#1:2056,6\n949#1:2096,6\n973#1:2148,6\n1074#1:2184,6\n1088#1:2229,6\n1091#1:2265,6\n1108#1:2310,6\n1111#1:2346,6\n1261#1:2402,6\n1336#1:2459,6\n1660#1:2553,6\n1772#1:2611,6\n1797#1:2649,6\n1872#1:2707,6\n949#1:2070\n949#1:2071,6\n949#1:2105\n949#1:2109\n973#1:2122\n973#1:2123,6\n973#1:2157\n973#1:2201\n1108#1:2283\n1108#1:2284,7\n1108#1:2319\n1108#1:2363\n1074#1:2158\n1074#1:2159,6\n1074#1:2193\n1074#1:2197\n1091#1:2239\n1091#1:2240,6\n1091#1:2274\n1091#1:2278\n1111#1:2320\n1111#1:2321,6\n1111#1:2355\n1111#1:2359\n1336#1:2434\n1336#1:2435,5\n1336#1:2468\n1336#1:2472\n1660#1:2528\n1660#1:2529,5\n1660#1:2562\n1660#1:2572\n1797#1:2623\n1797#1:2624,6\n1797#1:2658\n1797#1:2669\n1260#1:2376\n1354#1:2473\n1356#1:2474\n1791#1:2621\n1793#1:2622\n1848#1:2670\n1850#1:2671\n1918#1:2719\n1920#1:2720\n1922#1:2721\n1312#1:2432\n1954#1:2736\n1955#1:2737\n1956#1:2738\n1957#1:2739\n1958#1:2740\n1960#1:2741\n1961#1:2742\n1962#1:2743\n1963#1:2744\n1968#1:2751\n1327#1:2433\n1641#1:2487\n1808#1:2665\n1644#1:2501\n1644#1:2502,4\n1644#1:2509,2\n1644#1:2515\n1644#1:2511\n1979#1:2722\n222#1:2723\n966#1:2724\n966#1:2725,2\n970#1:2727\n970#1:2728,2\n1642#1:2730\n1642#1:2731,2\n1643#1:2733\n1643#1:2734,2\n1967#1:2745,6\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;

    @NotNull
    private static final IntList ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;

    @NotNull
    private static final IntList Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = C2331Dp.m13305constructorimpl(TypedValues.TYPE_TARGET);
    private static final float InnerCircleRadius = C2331Dp.m13305constructorimpl(69);
    private static final float ClockDisplayBottomMargin = C2331Dp.m13305constructorimpl(36);
    private static final float SupportLabelTop = C2331Dp.m13305constructorimpl(7);
    private static final float MaxDistance = C2331Dp.m13305constructorimpl(74);
    private static final float MinimumInteractiveSize = C2331Dp.m13305constructorimpl(48);

    @NotNull
    private static final IntList Minutes = IntListKt.intListOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f = 24;
        ClockFaceBottomMargin = C2331Dp.m13305constructorimpl(f);
        DisplaySeparatorWidth = C2331Dp.m13305constructorimpl(f);
        TimeInputBottomPadding = C2331Dp.m13305constructorimpl(f);
        IntList intListIntListOf = IntListKt.intListOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = intListIntListOf;
        MutableIntList mutableIntList = new MutableIntList(intListIntListOf.getSize());
        int[] iArr = intListIntListOf.content;
        int i = intListIntListOf._size;
        for (int i8 = 0; i8 < i; i8++) {
            mutableIntList.add((iArr[i8] % 12) + 12);
        }
        ExtraHours = mutableIntList;
        PeriodToggleMargin = C2331Dp.m13305constructorimpl(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final void m9131CircularLayoutuFdPcIQ(Modifier modifier, final float f, final InterfaceC6473e interfaceC6473e, Composer composer, final int i, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548175696);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i8 & 4) != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i9, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
            }
            boolean z8 = (i9 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, final long j7) {
                        Measurable measurable;
                        Measurable measurable2;
                        final float fMo6903toPx0680j_4 = measureScope.mo6903toPx0680j_4(f);
                        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            Measurable measurable3 = list.get(i12);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                                arrayList.add(measurable3);
                            }
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            arrayList2.add(((Measurable) arrayList.get(i13)).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                        }
                        int size3 = list.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i14);
                            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                break;
                            }
                            i14++;
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        while (true) {
                            if (i11 >= size4) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i11);
                            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i11++;
                        }
                        Measurable measurable6 = measurable2;
                        final float size5 = 6.2831855f / arrayList2.size();
                        Placeable placeableMo12033measureBRTryo0 = measurable5 != null ? measurable5.mo12033measureBRTryo0(jM13248copyZbe2FdA$default) : null;
                        final Placeable placeableMo12033measureBRTryo02 = measurable6 != null ? measurable6.mo12033measureBRTryo0(jM13248copyZbe2FdA$default) : null;
                        final Placeable placeable = placeableMo12033measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, Constraints.m13260getMinWidthimpl(j7), Constraints.m13259getMinHeightimpl(j7), null, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                Placeable placeable2 = placeable;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList2;
                                long j8 = j7;
                                float f7 = fMo6903toPx0680j_4;
                                float f8 = size5;
                                int size6 = list2.size();
                                int i15 = 0;
                                while (i15 < size6) {
                                    Placeable placeable3 = list2.get(i15);
                                    double d9 = f7;
                                    double d10 = (i15 * f8) - 1.5707963267948966d;
                                    Placeable.PlacementScope.place$default(placementScope, placeable3, AbstractC6600a.m6240p((Math.cos(d10) * d9) + ((Constraints.m13258getMaxWidthimpl(j8) / 2) - (placeable3.getWidth() / 2))), AbstractC6600a.m6240p((Math.sin(d10) * d9) + ((Constraints.m13257getMaxHeightimpl(j8) / 2) - (placeable3.getHeight() / 2))), 0.0f, 4, null);
                                    i15++;
                                    list2 = list2;
                                    j8 = j8;
                                }
                                Placeable placeable4 = placeableMo12033measureBRTryo02;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable4, AbstractC0584a.m898C(placeableMo12033measureBRTryo02, Constraints.m13260getMinWidthimpl(j7), 2), AbstractC0584a.m906g(placeableMo12033measureBRTryo02, Constraints.m13259getMinHeightimpl(j7), 2), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int i11 = ((i9 >> 6) & 14) | ((i9 << 3) & 112);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            int i12 = ((i11 << 6) & 896) | 6;
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            if (AbstractC0584a.m924y(composerStartRestartGroup, (i12 >> 6) & 14, interfaceC6473e)) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    TimePickerKt.m9131CircularLayoutuFdPcIQ(modifier2, f, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        if ((i & 6) == 0) {
            i8 = ((i & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i8, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), composerStartRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i9) {
                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-477913269, i9, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
                    }
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                    Modifier modifierM7311sizeVpY3zN4 = SizeKt.m7311sizeVpY3zN4(companion, timePickerTokens.m9969getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m9968getTimeSelectorContainerHeightD9Ej5fM());
                    int hourForDisplay = TimePickerKt.getHourForDisplay(timePickerState2);
                    TimePickerSelectionMode.Companion companion3 = TimePickerSelectionMode.INSTANCE;
                    TimePickerKt.m9134TimeSelectorSAnMeKU(modifierM7311sizeVpY3zN4, hourForDisplay, timePickerState2, companion3.m9166getHouryecRtBI(), timePickerColors2, composer2, 3078);
                    TimePickerKt.DisplaySeparator(SizeKt.m7311sizeVpY3zN4(companion, TimePickerKt.DisplaySeparatorWidth, timePickerTokens.m9965getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                    TimePickerKt.m9134TimeSelectorSAnMeKU(SizeKt.m7311sizeVpY3zN4(companion, timePickerTokens.m9969getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m9968getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, companion3.m9167getMinuteyecRtBI(), timePickerColors2, composer2, 3078);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    TimePickerKt.ClockDisplayNumbers(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockFace(@NotNull final AnalogTimePickerState analogTimePickerState, @NotNull final TimePickerColors timePickerColors, final boolean z8, @Nullable Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1170157036);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170157036, i8, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
            }
            CrossfadeKt.Crossfade(analogTimePickerState.getClockFaceValues(), drawSelector(SizeKt.m7309size3ABfNKs(BackgroundKt.m6753backgroundbw27NRU(Modifier.INSTANCE, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z8, analogTimePickerState.mo8142getSelectionyecRtBI(), null)), TimePickerTokens.INSTANCE.m9957getClockDialContainerSizeD9Ej5fM()), analogTimePickerState, timePickerColors), AnimationSpecKt.tween$default(200, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1022006568, true, new InterfaceC6474f() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((IntList) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull final IntList intList, @Nullable Composer composer2, int i9) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022006568, i9, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SizeKt.m7309size3ABfNKs(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m9957getClockDialContainerSizeD9Ej5fM()), false, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.1
                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
                        }
                    }, 1, null);
                    float f = TimePickerKt.OuterCircleSizeRadius;
                    final TimePickerColors timePickerColors2 = timePickerColors;
                    final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                    final boolean z9 = z8;
                    TimePickerKt.m9131CircularLayoutuFdPcIQ(modifierSemantics$default, f, ComposableLambdaKt.rememberComposableLambda(-320307952, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p152r6.InterfaceC6473e
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C5443s.f8405a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-320307952, i10, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                            }
                            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(timePickerColors2.m9109clockDialContentColorvNxB06k$material3_release(false)));
                            final IntList intList2 = intList;
                            final AnalogTimePickerState analogTimePickerState3 = analogTimePickerState2;
                            final boolean z10 = z9;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1992872400, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // p152r6.InterfaceC6473e
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C5443s.f8405a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i11) {
                                    if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1992872400, i11, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                    }
                                    composer4.startReplaceGroup(1547046870);
                                    int size = intList2.getSize();
                                    AnalogTimePickerState analogTimePickerState4 = analogTimePickerState3;
                                    IntList intList3 = intList2;
                                    boolean z11 = z10;
                                    for (final int i12 = 0; i12 < size; i12++) {
                                        int i13 = (!analogTimePickerState4.getIs24hour() || TimePickerSelectionMode.m9162equalsimpl0(analogTimePickerState4.mo8142getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI())) ? intList3.get(i12) : intList3.get(i12) % 12;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        boolean zChanged = composer4.changed(i12);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // p152r6.InterfaceC6471c
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    invoke((SemanticsPropertyReceiver) obj);
                                                    return C5443s.f8405a;
                                                }

                                                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i12);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        boolean z12 = z11;
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (InterfaceC6471c) objRememberedValue, 1, null), analogTimePickerState4, i13, z12, composer4, 0);
                                        z11 = z12;
                                    }
                                    composer4.endReplaceGroup();
                                    if (TimePickerSelectionMode.m9162equalsimpl0(analogTimePickerState3.mo8142getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m9166getHouryecRtBI()) && analogTimePickerState3.getIs24hour()) {
                                        Modifier modifierM6753backgroundbw27NRU = BackgroundKt.m6753backgroundbw27NRU(SizeKt.m7309size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m9957getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m10717getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                                        float f7 = TimePickerKt.InnerCircleRadius;
                                        final AnalogTimePickerState analogTimePickerState5 = analogTimePickerState3;
                                        final boolean z13 = z10;
                                        TimePickerKt.m9131CircularLayoutuFdPcIQ(modifierM6753backgroundbw27NRU, f7, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // p152r6.InterfaceC6473e
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return C5443s.f8405a;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i14) {
                                                if ((i14 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-205464413, i14, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.getSize();
                                                AnalogTimePickerState analogTimePickerState6 = analogTimePickerState5;
                                                boolean z14 = z13;
                                                for (final int i15 = 0; i15 < size2; i15++) {
                                                    int i16 = TimePickerKt.ExtraHours.get(i15);
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    boolean zChanged2 = composer5.changed(i15);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // p152r6.InterfaceC6471c
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                invoke((SemanticsPropertyReceiver) obj);
                                                                return C5443s.f8405a;
                                                            }

                                                            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i15);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (InterfaceC6471c) objRememberedValue2, 1, null), analogTimePickerState6, i16, z14, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    TimePickerKt.ClockFace(analogTimePickerState, timePickerColors, z8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockText(final Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i, final boolean z8, Composer composer, final int i8) {
        int i9;
        Modifier modifier2;
        boolean z9;
        ?? r15;
        Alignment alignment;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-206784607);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(analogTimePickerState) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206784607, i9, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), composerStartRestartGroup, 6);
            final float fMo6903toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(MaxDistance);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m10430boximpl(Offset.INSTANCE.m10457getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m13424boximpl(IntOffset.INSTANCE.m13444getZeronOccac()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            final InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            final String strM9142numberContentDescriptiondSwYdS4 = m9142numberContentDescriptiondSwYdS4(analogTimePickerState.mo8142getSelectionyecRtBI(), analogTimePickerState.getIs24hour(), i, composerStartRestartGroup, i9 & 896);
            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i, 0, 0, false, 7, null);
            boolean zM5325b = TimePickerSelectionMode.m9162equalsimpl0(analogTimePickerState.mo8142getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI()) ? AbstractC5830k.m5325b(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getMinute(), 0, 0, false, 7, null), localString$default) : AbstractC5830k.m5325b(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull LayoutCoordinates layoutCoordinates) {
                        MutableState<IntOffset> mutableState3 = mutableState2;
                        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
                        TimePickerKt.ClockText$lambda$33(mutableState3, parentCoordinates != null ? IntSizeKt.m13482getCenterozmzZPI(parentCoordinates.mo12041getSizeYbymL2g()) : IntOffset.INSTANCE.m13444getZeronOccac());
                        TimePickerKt.ClockText$lambda$30(mutableState, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m10471getCenterF1C5BW0());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierFocusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM7309size3ABfNKs, (InterfaceC6471c) objRememberedValue4), false, null, 3, null);
            boolean zChangedInstance = ((i9 & 7168) == 2048) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(analogTimePickerState) | composerStartRestartGroup.changed(fMo6903toPx0680j_4) | composerStartRestartGroup.changed(zM5325b);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                modifier2 = modifierFocusable$default;
                final boolean z10 = zM5325b;
                z9 = true;
                r15 = 0;
                alignment = center;
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        final InterfaceC6009v interfaceC6009v = coroutineScope;
                        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                        final float f = fMo6903toPx0680j_4;
                        final boolean z11 = z8;
                        final MutableState<Offset> mutableState3 = mutableState;
                        final MutableState<IntOffset> mutableState4 = mutableState2;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1

                            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                            @DebugMetadata(m5302c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", m5303f = "TimePicker.kt", m5304i = {}, m5305l = {1674}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ MutableState<Offset> $center$delegate;
                                final /* synthetic */ float $maxDist;
                                final /* synthetic */ MutableState<IntOffset> $parentCenter$delegate;
                                final /* synthetic */ AnalogTimePickerState $state;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(AnalogTimePickerState analogTimePickerState, float f, boolean z8, MutableState<Offset> mutableState, MutableState<IntOffset> mutableState2, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                                    super(2, interfaceC5631c);
                                    this.$state = analogTimePickerState;
                                    this.$maxDist = f;
                                    this.$autoSwitchToMinute = z8;
                                    this.$center$delegate = mutableState;
                                    this.$parentCenter$delegate = mutableState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                                    return new AnonymousClass1(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, interfaceC5631c);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i = this.label;
                                    if (i == 0) {
                                        AbstractC5774b.m5119b(obj);
                                        AnalogTimePickerState analogTimePickerState = this.$state;
                                        float fM10441getXimpl = Offset.m10441getXimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                        float fM10442getYimpl = Offset.m10442getYimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                        float f = this.$maxDist;
                                        boolean z8 = this.$autoSwitchToMinute;
                                        long jClockText$lambda$32 = TimePickerKt.ClockText$lambda$32(this.$parentCenter$delegate);
                                        this.label = 1;
                                        if (TimePickerKt.m9143onTaprOwcSBo(analogTimePickerState, fM10441getXimpl, fM10442getYimpl, f, z8, jClockText$lambda$32, this) == coroutineSingletons) {
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
                                @Nullable
                                public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                    return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p152r6.InterfaceC6469a
                            @NotNull
                            public final Boolean invoke() {
                                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass1(analogTimePickerState2, f, z11, mutableState3, mutableState4, null), 3);
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z10);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(interfaceC6471c);
                objRememberedValue5 = interfaceC6471c;
            } else {
                modifier2 = modifierFocusable$default;
                r15 = 0;
                alignment = center;
                z9 = true;
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier2, z9, (InterfaceC6471c) objRememberedValue5);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, r15);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r15);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            boolean zChanged = composerStartRestartGroup.changed(strM9142numberContentDescriptiondSwYdS4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9142numberContentDescriptiondSwYdS4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(localString$default, SemanticsModifierKt.clearAndSetSemantics(companion3, (InterfaceC6471c) objRememberedValue6), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, value, composer2, 0, 0, 65532);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ClockText.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    TimePickerKt.ClockText(modifier, analogTimePickerState, i, z8, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return mutableState.getValue().m10451unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j7) {
        mutableState.setValue(Offset.m10430boximpl(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$32(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().m13442unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$33(MutableState<IntOffset> mutableState, long j7) {
        mutableState.setValue(IntOffset.m13424boximpl(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i) {
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i8 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i8, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
            }
            TextStyle textStyleM12783copyp1EtxEg$default = TextStyle.m12783copyp1EtxEg$default((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m13189getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m13157getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m13178getBothEVpEnUU(), (AbstractC5824e) null), 0, 0, null, 15695871, null);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.1
                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C5443s.f8405a;
                }
            });
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(":", (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, textStyleM12783copyp1EtxEg$default, composer2, 6, 0, 65530);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i9) {
                    TimePickerKt.DisplaySeparator(modifier, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        if ((i & 6) == 0) {
            i8 = ((i & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i8, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i8 & 126);
            composerStartRestartGroup.startReplaceGroup(919638492);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
                InterfaceC6469a constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                }
                Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i9 = i8 << 3;
                HorizontalPeriodToggle(SizeKt.m7311sizeVpY3zN4(companion, timePickerTokens.m9963getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m9962getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i9 & 896) | (i9 & 112) | 6);
                composerStartRestartGroup.endNode();
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.HorizontalClockDisplay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i) {
        int i8;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= (i & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i8, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Measurable measurable = list.get(i9);
                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, measureScope.mo6897roundToPx0680j_4(TimePickerTokens.INSTANCE.m9964getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    Measurable measurable2 = list.get(i10);
                                    if (!AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    arrayList2.add(((Measurable) arrayList.get(i11)).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, Constraints.m13258getMaxWidthimpl(j7) / 2, 0, 0, 12, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m13258getMaxWidthimpl(j7), Constraints.m13257getMaxHeightimpl(j7), null, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // p152r6.InterfaceC6471c
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C5443s.f8405a;
                                    }

                                    public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), arrayList2.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, arrayList2.get(0).getWidth() - (placeableMo12033measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            AbstractC5830k.m5328e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), composerStartRestartGroup, (i8 & 14) | 3072 | (i8 & 112) | (i8 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.HorizontalPeriodToggle.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    TimePickerKt.HorizontalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HorizontalTimePicker(@org.jetbrains.annotations.NotNull final androidx.compose.material3.AnalogTimePickerState r18, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r19, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r20, final boolean r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i) {
        int i8;
        Shape shape3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= (i & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(measurePolicy) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            shape3 = shape2;
            i8 |= composerStartRestartGroup.changed(shape3) ? 131072 : 65536;
        } else {
            shape3 = shape2;
        }
        if ((74899 & i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i8, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke borderStrokeM6783BorderStrokecXLIe8U = BorderStrokeKt.m6783BorderStrokecXLIe8U(timePickerTokens.m9964getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape value = ShapesKt.getValue(timePickerTokens.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            AbstractC5830k.m5328e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.INSTANCE;
            final String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_time_picker_period_toggle_description), composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(strM9393getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9393getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (InterfaceC6471c) objRememberedValue, 1, null)), borderStrokeM6783BorderStrokecXLIe8U, cornerBasedShape);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            boolean z8 = !timePickerState.isAfternoon();
            int i9 = i8 & 112;
            boolean z9 = i9 == 32 || ((i8 & 64) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InterfaceC6469a() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m9145invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m9145invoke() {
                        timePickerState.setAfternoon(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i10 = (i8 << 3) & 7168;
            int i11 = i8;
            ToggleItem(z8, shape, (InterfaceC6469a) objRememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m8376getLambda1$material3_release(), composerStartRestartGroup, ((i8 >> 9) & 112) | 24576 | i10);
            SpacerKt.Spacer(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), 2.0f), 0.0f, 1, null), timePickerColors.getPeriodSelectorBorderColor(), null, 2, null), composerStartRestartGroup, 0);
            boolean z10 = false;
            boolean zIsAfternoon = timePickerState.isAfternoon();
            if (i9 == 32 || ((i11 & 64) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) {
                z10 = true;
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new InterfaceC6469a() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m9146invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m9146invoke() {
                        timePickerState.setAfternoon(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ToggleItem(zIsAfternoon, shape3, (InterfaceC6469a) objRememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m8377getLambda2$material3_release(), composerStartRestartGroup, ((i11 >> 12) & 112) | 24576 | i10);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.PeriodToggleImpl.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TimeInput(@org.jetbrains.annotations.NotNull final androidx.compose.material3.TimePickerState r7, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r8, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            r0 = -760850373(0xffffffffd2a6583b, float:-3.5722242E11)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto Le
            r1 = r11 | 6
            goto L27
        Le:
            r1 = r11 & 6
            if (r1 != 0) goto L26
            r1 = r11 & 8
            if (r1 != 0) goto L1b
            boolean r1 = r10.changed(r7)
            goto L1f
        L1b:
            boolean r1 = r10.changedInstance(r7)
        L1f:
            if (r1 == 0) goto L23
            r1 = 4
            goto L24
        L23:
            r1 = 2
        L24:
            r1 = r1 | r11
            goto L27
        L26:
            r1 = r11
        L27:
            r2 = r12 & 2
            if (r2 == 0) goto L2e
            r1 = r1 | 48
            goto L3e
        L2e:
            r3 = r11 & 48
            if (r3 != 0) goto L3e
            boolean r3 = r10.changed(r8)
            if (r3 == 0) goto L3b
            r3 = 32
            goto L3d
        L3b:
            r3 = 16
        L3d:
            r1 = r1 | r3
        L3e:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L52
            r3 = r12 & 4
            if (r3 != 0) goto L4f
            boolean r3 = r10.changed(r9)
            if (r3 == 0) goto L4f
            r3 = 256(0x100, float:3.59E-43)
            goto L51
        L4f:
            r3 = 128(0x80, float:1.8E-43)
        L51:
            r1 = r1 | r3
        L52:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L65
            boolean r3 = r10.getSkipping()
            if (r3 != 0) goto L5f
            goto L65
        L5f:
            r10.skipToGroupEnd()
        L62:
            r3 = r8
            r4 = r9
            goto Lb1
        L65:
            r10.startDefaults()
            r3 = r11 & 1
            r4 = 6
            if (r3 == 0) goto L7e
            boolean r3 = r10.getDefaultsInvalid()
            if (r3 == 0) goto L74
            goto L7e
        L74:
            r10.skipToGroupEnd()
            r2 = r12 & 4
            if (r2 == 0) goto L8d
        L7b:
            r1 = r1 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L8d
        L7e:
            if (r2 == 0) goto L82
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p011ui.Modifier.INSTANCE
        L82:
            r2 = r12 & 4
            if (r2 == 0) goto L8d
            androidx.compose.material3.TimePickerDefaults r9 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            androidx.compose.material3.TimePickerColors r9 = r9.colors(r10, r4)
            goto L7b
        L8d:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L9c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInput (TimePicker.kt:260)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L9c:
            int r0 = r1 >> 3
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r1 = r1 << r4
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            TimeInputImpl(r8, r9, r7, r10, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L62
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L62
        Lb1:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 == 0) goto Lc2
            androidx.compose.material3.TimePickerKt$TimeInput$1 r1 = new androidx.compose.material3.TimePickerKt$TimeInput$1
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>()
            r8.updateScope(r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= (i & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i8, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.INSTANCE;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            int i9 = i8 & 896;
            boolean z8 = i9 == 256 || ((i8 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(TimePickerKt.getHourForDisplay(timePickerState), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (AbstractC5824e) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            boolean z9 = i9 == 256 || ((i8 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InterfaceC6469a() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (AbstractC5824e) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (InterfaceC6469a) objRememberedValue2, composerStartRestartGroup, 0, 4);
            int i10 = i8;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TextStyle.m12783copyp1EtxEg$default(TypographyKt.getValue(timeInputTokens.getTimeFieldLabelTextFont(), composerStartRestartGroup, 6), timePickerColors.m9128timeSelectorContentColorvNxB06k$material3_release(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m13189getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11) {
                    if ((i11 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1306700887, i11, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:987)");
                    }
                    final MutableState<TextFieldValue> mutableState = mutableStateRememberSaveable;
                    final TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    final MutableState<TextFieldValue> mutableState2 = mutableStateRememberSaveable2;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer2);
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion5, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
                    if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    boolean zChanged = composer2.changed(mutableState) | composer2.changedInstance(timePickerState2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m9147invokeZmokQxo(((KeyEvent) obj).m11752unboximpl());
                            }

                            @NotNull
                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m9147invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                                int iM11765getUtf16CodePointZmokQxo = KeyEvent_androidKt.m11765getUtf16CodePointZmokQxo(keyEvent);
                                if (48 <= iM11765getUtf16CodePointZmokQxo && iM11765getUtf16CodePointZmokQxo < 58 && TextRange.m12770getStartimpl(TimePickerKt.TimeInputImpl$lambda$6(mutableState).getSelection()) == 2 && TimePickerKt.TimeInputImpl$lambda$6(mutableState).getText().length() == 2) {
                                    timePickerState2.mo8143setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI());
                                }
                                return Boolean.FALSE;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion4, (InterfaceC6471c) objRememberedValue3);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$6 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                    boolean zChangedInstance = composer2.changedInstance(timePickerState2) | composer2.changed(mutableState);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldValue) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull TextFieldValue textFieldValue) {
                                int iM9166getHouryecRtBI = TimePickerSelectionMode.INSTANCE.m9166getHouryecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$62 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                                int i12 = timePickerState2.getIs24hour() ? 23 : 12;
                                final MutableState<TextFieldValue> mutableState3 = mutableState;
                                TimePickerKt.m9144timeInputOnChangez7XvuPQ(iM9166getHouryecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$62, i12, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p152r6.InterfaceC6471c
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextFieldValue) obj);
                                        return C5443s.f8405a;
                                    }

                                    public final void invoke(@NotNull TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue4;
                    TimePickerSelectionMode.Companion companion6 = TimePickerSelectionMode.INSTANCE;
                    int iM9166getHouryecRtBI = companion6.m9166getHouryecRtBI();
                    ImeAction.Companion companion7 = ImeAction.INSTANCE;
                    int iM12952getNexteUduSuo = companion7.m12952getNexteUduSuo();
                    KeyboardType.Companion companion8 = KeyboardType.INSTANCE;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion8.m13006getNumberPjHm6EE(), iM12952getNexteUduSuo, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (AbstractC5824e) null);
                    boolean zChangedInstance2 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$3$1
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyboardActionScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo8143setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    TimePickerKt.m9133TimePickerTextField1vLObsk(modifierOnKeyEvent, textFieldValueTimeInputImpl$lambda$6, interfaceC6471c, timePickerState2, iM9166getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (InterfaceC6471c) objRememberedValue5, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    TimePickerKt.DisplaySeparator(SizeKt.m7311sizeVpY3zN4(companion4, TimePickerKt.DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m9951getPeriodSelectorContainerHeightD9Ej5fM()), composer2, 6);
                    boolean zChanged2 = composer2.changed(mutableState2) | composer2.changedInstance(timePickerState2);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m9148invokeZmokQxo(((KeyEvent) obj).m11752unboximpl());
                            }

                            @NotNull
                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m9148invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                                boolean z10 = KeyEvent_androidKt.m11765getUtf16CodePointZmokQxo(keyEvent) == 0 && TextRange.m12770getStartimpl(TimePickerKt.TimeInputImpl$lambda$9(mutableState2).getSelection()) == 0;
                                if (z10) {
                                    timePickerState2.mo8143setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m9166getHouryecRtBI());
                                }
                                return Boolean.valueOf(z10);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion4, (InterfaceC6471c) objRememberedValue6);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$9 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                    boolean zChangedInstance3 = composer2.changedInstance(timePickerState2) | composer2.changed(mutableState2);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldValue) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull TextFieldValue textFieldValue) {
                                int iM9167getMinuteyecRtBI = TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$92 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                                final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                TimePickerKt.m9144timeInputOnChangez7XvuPQ(iM9167getMinuteyecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$92, 59, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p152r6.InterfaceC6471c
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextFieldValue) obj);
                                        return C5443s.f8405a;
                                    }

                                    public final void invoke(@NotNull TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) objRememberedValue7;
                    int iM9167getMinuteyecRtBI = companion6.m9167getMinuteyecRtBI();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion8.m13006getNumberPjHm6EE(), companion7.m12950getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (AbstractC5824e) null);
                    boolean zChangedInstance4 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$6$1
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyboardActionScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo8143setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    TimePickerKt.m9133TimePickerTextField1vLObsk(modifierOnPreviewKeyEvent, textFieldValueTimeInputImpl$lambda$9, interfaceC6471c2, timePickerState2, iM9167getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (InterfaceC6471c) objRememberedValue8, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.startReplaceGroup(511443242);
            if (!timePickerState.getIs24hour()) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM7266paddingqDBjuR0$default2 = PaddingKt.m7266paddingqDBjuR0$default(companion4, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default2);
                InterfaceC6469a constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                }
                Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                VerticalPeriodToggle(SizeKt.m7311sizeVpY3zN4(companion4, timeInputTokens.m9952getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m9951getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, ((i10 >> 3) & 112) | 6 | ((i10 << 3) & 896));
                composerStartRestartGroup.endNode();
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.TimeInputImpl.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$6(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$9(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9132TimePickermT9BvqQ(@org.jetbrains.annotations.NotNull final androidx.compose.material3.TimePickerState r13, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r14, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r15, int r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m9132TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final TimePickerState TimePickerState(int i, int i8, boolean z8) {
        return new TimePickerStateImpl(i, i8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9133TimePickerTextField1vLObsk(final androidx.compose.p011ui.Modifier r112, final androidx.compose.p011ui.text.input.TextFieldValue r113, final p152r6.InterfaceC6471c r114, androidx.compose.material3.TimePickerState r115, final int r116, androidx.compose.foundation.text.KeyboardOptions r117, androidx.compose.foundation.text.KeyboardActions r118, final androidx.compose.material3.TimePickerColors r119, androidx.compose.runtime.Composer r120, final int r121, final int r122) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m9133TimePickerTextField1vLObsk(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, r6.c, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TimeSelector-SAnMeKU, reason: not valid java name */
    public static final void m9134TimeSelectorSAnMeKU(final Modifier modifier, final int i, final TimePickerState timePickerState, final int i8, final TimePickerColors timePickerColors, Composer composer, final int i9) {
        int i10;
        int iM9323constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1148055889);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= (i9 & 512) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(i8) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        if ((i10 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148055889, i10, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
            }
            boolean zM9162equalsimpl0 = TimePickerSelectionMode.m9162equalsimpl0(timePickerState.mo8142getSelectionyecRtBI(), i8);
            if (TimePickerSelectionMode.m9162equalsimpl0(i8, TimePickerSelectionMode.INSTANCE.m9166getHouryecRtBI())) {
                Strings.Companion companion = Strings.INSTANCE;
                iM9323constructorimpl = Strings.m9323constructorimpl(C1776R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.INSTANCE;
                iM9323constructorimpl = Strings.m9323constructorimpl(C1776R.string.m3c_time_picker_minute_selection);
            }
            final String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(iM9323constructorimpl, composerStartRestartGroup, 0);
            long jM9127timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m9127timeSelectorContainerColorvNxB06k$material3_release(zM9162equalsimpl0);
            final long jM9128timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m9128timeSelectorContentColorvNxB06k$material3_release(zM9162equalsimpl0);
            boolean zChanged = composerStartRestartGroup.changed(strM9393getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12537getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9393getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (InterfaceC6471c) objRememberedValue);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6);
            boolean z8 = ((i10 & 896) == 256 || ((i10 & 512) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) | ((i10 & 7168) == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InterfaceC6469a() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m9149invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m9149invoke() {
                        if (TimePickerSelectionMode.m9162equalsimpl0(i8, timePickerState.mo8142getSelectionyecRtBI())) {
                            return;
                        }
                        timePickerState.mo8143setSelection6_8s6DQ(i8);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8956Surfaced85dljk(zM9162equalsimpl0, (InterfaceC6469a) objRememberedValue2, modifierSemantics, false, value, jM9127timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (InterfaceC6473e) ComposableLambdaKt.rememberComposableLambda(-1477282471, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i11) {
                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1477282471, i11, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)");
                    }
                    final String strM9142numberContentDescriptiondSwYdS4 = TimePickerKt.m9142numberContentDescriptiondSwYdS4(i8, timePickerState.getIs24hour(), i, composer3, 0);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    int i12 = i;
                    long j7 = jM9128timeSelectorContentColorvNxB06k$material3_release;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer3);
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion4, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    boolean zChanged2 = composer3.changed(strM9142numberContentDescriptiondSwYdS4);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9142numberContentDescriptiondSwYdS4);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    TextKt.m9105Text4IGK_g(CalendarLocale_jvmKt.toLocalString$default(i12, 2, 0, false, 6, null), SemanticsModifierKt.semantics$default(companion3, false, (InterfaceC6471c) objRememberedValue3, 1, null), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer3, 0, 0, 131064);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i11) {
                    TimePickerKt.m9134TimeSelectorSAnMeKU(modifier, i, timePickerState, i8, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ToggleItem(final boolean z8, final Shape shape, final InterfaceC6469a interfaceC6469a, final TimePickerColors timePickerColors, final InterfaceC6474f interfaceC6474f, Composer composer, final int i) {
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i8, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
            }
            long jM9126periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m9126periodSelectorContentColorvNxB06k$material3_release(z8);
            long jM9125periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m9125periodSelectorContainerColorvNxB06k$material3_release(z8);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z8 ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z9 = (i8 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z8);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ButtonKt.TextButton(interfaceC6469a, SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (InterfaceC6471c) objRememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m8204textButtonColorsro_MJ88(jM9125periodSelectorContainerColorvNxB06k$material3_release, jM9126periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, composerStartRestartGroup, 24576, 12), null, null, PaddingKt.m7255PaddingValues0680j_4(C2331Dp.m13305constructorimpl(0)), null, interfaceC6474f, composerStartRestartGroup, ((i8 >> 6) & 14) | 12582912 | ((i8 << 6) & 7168) | ((i8 << 15) & 1879048192), 356);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.ToggleItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i9) {
                    TimePickerKt.ToggleItem(z8, shape, interfaceC6469a, timePickerColors, interfaceC6474f, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        if ((i & 6) == 0) {
            i8 = ((i & 8) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i8, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i8 & 126);
            composerStartRestartGroup.startReplaceGroup(-709485014);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
                InterfaceC6469a constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                }
                Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i9 = i8 << 3;
                VerticalPeriodToggle(SizeKt.m7311sizeVpY3zN4(companion, timePickerTokens.m9966getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m9965getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i9 & 896) | (i9 & 112) | 6);
                composerStartRestartGroup.endNode();
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.VerticalClockDisplay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i) {
        int i8;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= (i & 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i8, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Measurable measurable = list.get(i9);
                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, measureScope.mo6897roundToPx0680j_4(TimePickerTokens.INSTANCE.m9964getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    Measurable measurable2 = list.get(i10);
                                    if (!AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    arrayList2.add(((Measurable) arrayList.get(i11)).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, Constraints.m13257getMaxHeightimpl(j7) / 2, 3, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m13258getMaxWidthimpl(j7), Constraints.m13257getMaxHeightimpl(j7), null, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // p152r6.InterfaceC6471c
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C5443s.f8405a;
                                    }

                                    public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), 0, arrayList2.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, arrayList2.get(0).getHeight() - (placeableMo12033measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            AbstractC5830k.m5328e(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), composerStartRestartGroup, (i8 & 14) | 3072 | (i8 & 112) | (i8 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TimePickerKt.VerticalPeriodToggle.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    TimePickerKt.VerticalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VerticalTimePicker(@org.jetbrains.annotations.NotNull final androidx.compose.material3.AnalogTimePickerState r9, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r10, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r11, final boolean r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f, float f7) {
        float fAtan2 = ((float) Math.atan2(f, f7)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + FullCircle : fAtan2;
    }

    private static final float dist(float f, float f7, int i, int i8) {
        return (float) Math.hypot(i - f, i8 - f7);
    }

    private static final Modifier drawSelector(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt.drawSelector.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull ContentDrawScope contentDrawScope) {
                long jOffset = OffsetKt.Offset(contentDrawScope.mo6903toPx0680j_4(DpOffset.m13366getXD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))), contentDrawScope.mo6903toPx0680j_4(DpOffset.m13368getYD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))));
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                float f = 2;
                float fMo6903toPx0680j_4 = contentDrawScope.mo6903toPx0680j_4(timePickerTokens.m9959getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
                long selectorColor = timePickerColors.getSelectorColor();
                long jM10708getBlack0d7_KjU = Color.INSTANCE.m10708getBlack0d7_KjU();
                BlendMode.Companion companion = BlendMode.INSTANCE;
                DrawScope.m11214drawCircleVaOC9Bg$default(contentDrawScope, jM10708getBlack0d7_KjU, fMo6903toPx0680j_4, jOffset, 0.0f, null, null, companion.m10597getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                DrawScope.m11214drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, fMo6903toPx0680j_4, jOffset, 0.0f, null, null, companion.m10625getXor0nO6VwU(), 56, null);
                DrawScope.m11219drawLineNGM6Ib0$default(contentDrawScope, selectorColor, androidx.compose.p011ui.geometry.SizeKt.m10520getCenteruvyYCjk(contentDrawScope.mo11233getSizeNHjbRc()), Offset.m10445minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * fMo6903toPx0680j_4, ((float) Math.sin(analogTimePickerState.getCurrentAngle())) * fMo6903toPx0680j_4)), contentDrawScope.mo6903toPx0680j_4(timePickerTokens.m9960getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m10624getSrcOver0nO6VwU(), 240, null);
                DrawScope.m11214drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, contentDrawScope.mo6903toPx0680j_4(timePickerTokens.m9958getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, androidx.compose.p011ui.geometry.SizeKt.m10520getCenteruvyYCjk(contentDrawScope.mo11233getSizeNHjbRc()), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                DrawScope.m11214drawCircleVaOC9Bg$default(contentDrawScope, timePickerColors.m9109clockDialContentColorvNxB06k$material3_release(true), fMo6903toPx0680j_4, jOffset, 0.0f, null, null, companion.m10607getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    public static final int getHourForDisplay(@NotNull TimePickerState timePickerState) {
        if (timePickerState.getIs24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return timePickerState.isAfternoon() ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    public static final long getSelectorPos(@NotNull AnalogTimePickerState analogTimePickerState) {
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f = 2;
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(timePickerTokens.m9959getClockDialSelectorHandleContainerSizeD9Ej5fM() / f);
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(((analogTimePickerState.getIs24hour() && analogTimePickerState.isAfternoon() && TimePickerSelectionMode.m9162equalsimpl0(analogTimePickerState.mo8142getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m9166getHouryecRtBI())) ? InnerCircleRadius : OuterCircleSizeRadius) - fM13305constructorimpl) + fM13305constructorimpl);
        return DpKt.m13326DpOffsetYgX7TsA(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(timePickerTokens.m9957getClockDialContainerSizeD9Ej5fM() / f) + C2331Dp.m13305constructorimpl(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * fM13305constructorimpl2)), C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(timePickerTokens.m9957getClockDialContainerSizeD9Ej5fM() / f) + C2331Dp.m13305constructorimpl(fM13305constructorimpl2 * ((float) Math.sin(analogTimePickerState.getCurrentAngle())))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    public static final void m9141moveSelectord3b8Pxo(TimePickerState timePickerState, float f, float f7, float f8, long j7) {
        if (TimePickerSelectionMode.m9162equalsimpl0(timePickerState.mo8142getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m9166getHouryecRtBI()) && timePickerState.getIs24hour()) {
            timePickerState.setAfternoon(dist(f, f7, IntOffset.m13433getXimpl(j7), IntOffset.m13434getYimpl(j7)) < f8);
        }
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    /* renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m9142numberContentDescriptiondSwYdS4(int i, boolean z8, int i8, @Nullable Composer composer, int i9) {
        int iM9323constructorimpl;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i9, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
        }
        if (TimePickerSelectionMode.m9162equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI())) {
            Strings.Companion companion = Strings.INSTANCE;
            iM9323constructorimpl = Strings.m9323constructorimpl(C1776R.string.m3c_time_picker_minute_suffix);
        } else if (z8) {
            Strings.Companion companion2 = Strings.INSTANCE;
            iM9323constructorimpl = Strings.m9323constructorimpl(C1776R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.INSTANCE;
            iM9323constructorimpl = Strings.m9323constructorimpl(C1776R.string.m3c_time_picker_hour_suffix);
        }
        String strM9394getStringqBjtwXw = Strings_androidKt.m9394getStringqBjtwXw(iM9323constructorimpl, new Object[]{Integer.valueOf(i8)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM9394getStringqBjtwXw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: onTap-rOwcSBo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9143onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState r11, float r12, float r13, float r14, boolean r15, long r16, p075h6.InterfaceC5631c<? super p045d6.C5443s> r18) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m9143onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, h6.c):java.lang.Object");
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final TimePickerState rememberTimePickerState(int i, int i8, boolean z8, @Nullable Composer composer, int i9, int i10) {
        final int i11 = (i10 & 1) != 0 ? 0 : i;
        final int i12 = (i10 & 2) != 0 ? 0 : i8;
        final boolean zIs24HourFormat = (i10 & 4) != 0 ? TimeFormat_androidKt.is24HourFormat(composer, 0) : z8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i9, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.INSTANCE.Saver();
        boolean z9 = ((((i9 & 14) ^ 6) > 4 && composer.changed(i11)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && composer.changed(i12)) || (i9 & 48) == 32) | ((((i9 & 896) ^ 384) > 256 && composer.changed(zIs24HourFormat)) || (i9 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$state$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final TimePickerStateImpl invoke() {
                    return new TimePickerStateImpl(i11, i12, zIs24HourFormat);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: timeInputOnChange-z7XvuPQ, reason: not valid java name */
    public static final void m9144timeInputOnChangez7XvuPQ(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i8, InterfaceC6471c interfaceC6471c) {
        if (AbstractC5830k.m5325b(textFieldValue.getText(), textFieldValue2.getText())) {
            interfaceC6471c.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (TimePickerSelectionMode.m9162equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m9166getHouryecRtBI())) {
                timePickerState.setHour(0);
            } else {
                timePickerState.setMinute(0);
            }
            interfaceC6471c.invoke(TextFieldValue.m13014copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            int iM6445j = (textFieldValue.getText().length() == 3 && TextRange.m12770getStartimpl(textFieldValue.getSelection()) == 1) ? AbstractC6768a.m6445j(textFieldValue.getText().charAt(0)) : Integer.parseInt(textFieldValue.getText());
            if (iM6445j <= i8) {
                TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.INSTANCE;
                if (TimePickerSelectionMode.m9162equalsimpl0(i, companion.m9166getHouryecRtBI())) {
                    timePickerState.setHour(iM6445j);
                    if (iM6445j > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.mo8143setSelection6_8s6DQ(companion.m9167getMinuteyecRtBI());
                    }
                } else {
                    timePickerState.setMinute(iM6445j);
                }
                interfaceC6471c.invoke(textFieldValue.getText().length() <= 2 ? textFieldValue : TextFieldValue.m13014copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null));
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    @Stable
    private static final Modifier visible(Modifier modifier, final boolean z8) {
        return modifier.then(new VisibleModifier(z8, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("visible");
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z8));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
