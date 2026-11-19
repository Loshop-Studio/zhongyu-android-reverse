package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.LiveRegionMode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.ScrollAxisRange;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aT\u0010\"\u001a\u00020\u00002\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0084\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a6\u00101\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00162\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070-H\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u009c\u0001\u0010>\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00162#\u00107\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u008f\u0001\u0010?\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u00020\u00112!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b?\u0010@\u001aZ\u0010G\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u008f\u0001\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2\b\u00102\u001a\u0004\u0018\u00010\u00112!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bJ\u0010K\u001aK\u0010L\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@¢\u0006\u0004\bL\u0010M\u001a\u001f\u0010N\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bN\u0010O\u001ax\u0010W\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010R\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010\u00112\b\u0010T\u001a\u0004\u0018\u00010\u00112\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010Z\u001a\u00020Y2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\bZ\u0010[\u001a9\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000bH\u0003¢\u0006\u0004\bb\u0010c\u001ap\u0010k\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u000b2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020a2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\bk\u0010l\u001ab\u0010o\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00112!\u0010n\u001a\u001d\u0012\u0013\u0012\u00110Y¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bo\u0010p\u001a`\u0010r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000b2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020a2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\br\u0010s\u001ai\u0010{\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020\u000b2\u0006\u0010w\u001a\u00020a2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b{\u0010|\u001aB\u0010~\u001a\u00020\u00072\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010}\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b~\u0010\u007f\u001a?\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u00012\u0007\u0010\u0001\u001a\u00030\u0080\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020a2\u0007\u0010\u0084\u0001\u001a\u00020aH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u001f\u0010\u0089\u0001\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u001f\u0010\u008d\u0001\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008a\u0001\u001a\u0006\b\u008e\u0001\u0010\u008c\u0001\"\u001f\u0010\u008f\u0001\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u008a\u0001\u001a\u0006\b\u0090\u0001\u0010\u008c\u0001\" \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0018\u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0093\u0001\"\u0018\u0010\u0097\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0093\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008a\u0001\"\u0017\u0010\u0099\u0001\u001a\u00020Y8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0017\u0010\u009b\u0001\u001a\u00020Y8\u0002X\u0082T¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009a\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u009c\u0001²\u0006\u000e\u0010v\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"Landroidx/compose/material3/DatePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DatePicker", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lr6/e;Lr6/e;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lx6/f;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "rememberDatePickerState-EU0dCGE", "(Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "rememberDatePickerState", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DatePickerState-sHin3Bw", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;", "DatePickerState", "modeToggleButton", "Landroidx/compose/ui/text/TextStyle;", "headlineTextStyle", "Landroidx/compose/ui/unit/Dp;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLr6/e;Landroidx/compose/runtime/Composer;I)V", "DateEntryContainer", "displayMode", "Lkotlin/Function1;", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILr6/c;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "selectedDateMillis", "displayedMonthMillis", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dateInMillis", "onDateSelectionChange", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "SwitchableDateEntryContent-d7iavvg", "(Ljava/lang/Long;JILr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "DatePickerContent", "(Ljava/lang/Long;JLr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lr6/e;JJFLr6/e;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "HorizontalMonthsList", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lr6/c;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Lh6/c;)Ljava/lang/Object;", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/internal/CalendarMonth;", "month", "todayMillis", "startDateMillis", "endDateMillis", "Landroidx/compose/material3/SelectedRangeInfo;", "rangeSelectionInfo", "Month", "(Landroidx/compose/material3/internal/CalendarMonth;Lr6/c;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "", "numberOfMonthsInRange", "(Lx6/f;)I", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "", "dayContentDescription", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "Day", "(Landroidx/compose/ui/Modifier;ZLr6/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "year", "onYearSelected", "YearPicker", "(Landroidx/compose/ui/Modifier;JLr6/c;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "currentYear", "Year", "(Landroidx/compose/ui/Modifier;ZZLr6/a;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "MonthsNavigation", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "expanded", "YearPickerMenuButton", "(Lr6/a;ZLandroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Lkotlinx/coroutines/v;", "coroutineScope", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customScrollActions", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/v;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "RecommendedSizeForAccessibility", "F", "getRecommendedSizeForAccessibility", "()F", "MonthYearHeight", "getMonthYearHeight", "DatePickerHorizontalPadding", "getDatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerModeTogglePadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerTitlePadding", "DatePickerHeadlinePadding", "YearsVerticalPadding", "MaxCalendarRows", "I", "YearsInRow", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 16 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2272:1\n1223#2,6:2273\n1223#2,6:2279\n1223#2,6:2285\n1223#2,6:2331\n1223#2,6:2337\n1223#2,6:2346\n1223#2,6:2352\n1223#2,3:2363\n1226#2,3:2369\n1223#2,6:2410\n1223#2,6:2416\n1223#2,6:2422\n1223#2,6:2552\n1223#2,6:2558\n1223#2,6:2600\n1223#2,6:2650\n1223#2,6:2724\n1223#2,6:2730\n1223#2,6:2736\n1223#2,6:2754\n1223#2,6:2760\n1223#2,6:2766\n85#3:2291\n82#3,6:2292\n88#3:2326\n92#3:2330\n85#3:2373\n81#3,7:2374\n88#3:2409\n85#3:2465\n82#3,6:2466\n88#3:2500\n92#3:2504\n92#3:2512\n85#3:2513\n83#3,5:2514\n88#3:2547\n92#3:2551\n85#3:2657\n83#3,5:2658\n88#3:2691\n92#3:2749\n78#4,6:2298\n85#4,4:2313\n89#4,2:2323\n93#4:2329\n78#4,6:2381\n85#4,4:2396\n89#4,2:2406\n78#4,6:2436\n85#4,4:2451\n89#4,2:2461\n78#4,6:2472\n85#4,4:2487\n89#4,2:2497\n93#4:2503\n93#4:2507\n93#4:2511\n78#4,6:2519\n85#4,4:2534\n89#4,2:2544\n93#4:2550\n78#4,6:2567\n85#4,4:2582\n89#4,2:2592\n78#4,6:2612\n85#4,4:2627\n89#4,2:2637\n93#4:2643\n93#4:2648\n78#4,6:2663\n85#4,4:2678\n89#4,2:2688\n78#4,6:2695\n85#4,4:2710\n89#4,2:2720\n93#4:2744\n93#4:2748\n78#4,6:2775\n85#4,4:2790\n89#4,2:2800\n93#4:2806\n368#5,9:2304\n377#5:2325\n378#5,2:2327\n368#5,9:2387\n377#5:2408\n368#5,9:2442\n377#5:2463\n368#5,9:2478\n377#5:2499\n378#5,2:2501\n378#5,2:2505\n378#5,2:2509\n368#5,9:2525\n377#5:2546\n378#5,2:2548\n368#5,9:2573\n377#5:2594\n368#5,9:2618\n377#5:2639\n378#5,2:2641\n378#5,2:2646\n368#5,9:2669\n377#5:2690\n368#5,9:2701\n377#5:2722\n378#5,2:2742\n378#5,2:2746\n368#5,9:2781\n377#5:2802\n378#5,2:2804\n4032#6,6:2317\n4032#6,6:2400\n4032#6,6:2455\n4032#6,6:2491\n4032#6,6:2538\n4032#6,6:2586\n4032#6,6:2631\n4032#6,6:2682\n4032#6,6:2714\n4032#6,6:2794\n77#7:2343\n77#7:2808\n1#8:2344\n148#9:2345\n148#9:2812\n148#9:2813\n148#9:2814\n148#9:2815\n148#9:2816\n148#9:2817\n148#9:2818\n488#10:2358\n487#10,4:2359\n491#10,2:2366\n495#10:2372\n487#11:2368\n71#12:2428\n67#12,7:2429\n74#12:2464\n78#12:2508\n71#12:2606\n69#12,5:2607\n74#12:2640\n78#12:2644\n98#13,3:2564\n101#13:2595\n105#13:2649\n98#13,3:2692\n101#13:2723\n105#13:2745\n98#13,3:2772\n101#13:2803\n105#13:2807\n33#14,4:2596\n38#14:2645\n86#15:2656\n156#16:2750\n159#16:2751\n168#16:2752\n114#16:2753\n81#17:2809\n107#17,2:2810\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n172#1:2273,6\n191#1:2279,6\n367#1:2285,6\n1364#1:2331,6\n1371#1:2337,6\n1408#1:2346,6\n1498#1:2352,6\n1510#1:2363,3\n1510#1:2369,3\n1524#1:2410,6\n1536#1:2416,6\n1548#1:2422,6\n1660#1:2552,6\n1697#1:2558,6\n1751#1:2600,6\n1786#1:2650,6\n1831#1:2724,6\n1859#1:2730,6\n1865#1:2736,6\n1952#1:2754,6\n2100#1:2760,6\n2118#1:2766,6\n1310#1:2291\n1310#1:2292,6\n1310#1:2326\n1310#1:2330\n1513#1:2373\n1513#1:2374,7\n1513#1:2409\n1553#1:2465\n1553#1:2466,6\n1553#1:2500\n1553#1:2504\n1513#1:2512\n1630#1:2513\n1630#1:2514,5\n1630#1:2547\n1630#1:2551\n1796#1:2657\n1796#1:2658,5\n1796#1:2691\n1796#1:2749\n1310#1:2298,6\n1310#1:2313,4\n1310#1:2323,2\n1310#1:2329\n1513#1:2381,6\n1513#1:2396,4\n1513#1:2406,2\n1552#1:2436,6\n1552#1:2451,4\n1552#1:2461,2\n1553#1:2472,6\n1553#1:2487,4\n1553#1:2497,2\n1553#1:2503\n1552#1:2507\n1513#1:2511\n1630#1:2519,6\n1630#1:2534,4\n1630#1:2544,2\n1630#1:2550\n1742#1:2567,6\n1742#1:2582,4\n1742#1:2592,2\n1749#1:2612,6\n1749#1:2627,4\n1749#1:2637,2\n1749#1:2643\n1742#1:2648\n1796#1:2663,6\n1796#1:2678,4\n1796#1:2688,2\n1803#1:2695,6\n1803#1:2710,4\n1803#1:2720,2\n1803#1:2744\n1796#1:2748\n2152#1:2775,6\n2152#1:2790,4\n2152#1:2800,2\n2152#1:2806\n1310#1:2304,9\n1310#1:2325\n1310#1:2327,2\n1513#1:2387,9\n1513#1:2408\n1552#1:2442,9\n1552#1:2463\n1553#1:2478,9\n1553#1:2499\n1553#1:2501,2\n1552#1:2505,2\n1513#1:2509,2\n1630#1:2525,9\n1630#1:2546\n1630#1:2548,2\n1742#1:2573,9\n1742#1:2594\n1749#1:2618,9\n1749#1:2639\n1749#1:2641,2\n1742#1:2646,2\n1796#1:2669,9\n1796#1:2690\n1803#1:2701,9\n1803#1:2722\n1803#1:2742,2\n1796#1:2746,2\n2152#1:2781,9\n2152#1:2802\n2152#1:2804,2\n1310#1:2317,6\n1513#1:2400,6\n1552#1:2455,6\n1553#1:2491,6\n1630#1:2538,6\n1742#1:2586,6\n1749#1:2631,6\n1796#1:2682,6\n1803#1:2714,6\n2152#1:2794,6\n1400#1:2343\n2213#1:2808\n1400#1:2345\n2260#1:2812\n2261#1:2813\n2262#1:2814\n2263#1:2815\n2265#1:2816\n2266#1:2817\n2268#1:2818\n1510#1:2358\n1510#1:2359,4\n1510#1:2366,2\n1510#1:2372\n1510#1:2368\n1552#1:2428\n1552#1:2429,7\n1552#1:2464\n1552#1:2508\n1749#1:2606\n1749#1:2607,5\n1749#1:2640\n1749#1:2644\n1742#1:2564,3\n1742#1:2595\n1742#1:2649\n1803#1:2692,3\n1803#1:2723\n1803#1:2745\n2152#1:2772,3\n2152#1:2803\n2152#1:2807\n1748#1:2596,4\n1748#1:2645\n1798#1:2656\n1915#1:2750\n1917#1:2751\n1919#1:2752\n1924#1:2753\n1511#1:2809\n1511#1:2810,2\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerKt {

    @NotNull
    private static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;

    @NotNull
    private static final PaddingValues DatePickerModeTogglePadding;

    @NotNull
    private static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding;
    private static final float RecommendedSizeForAccessibility = C2331Dp.m13305constructorimpl(48);
    private static final float MonthYearHeight = C2331Dp.m13305constructorimpl(56);

    static {
        float f = 12;
        DatePickerHorizontalPadding = C2331Dp.m13305constructorimpl(f);
        DatePickerModeTogglePadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(0.0f, 0.0f, C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f), 3, null);
        float f7 = 24;
        float f8 = 16;
        DatePickerTitlePadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(C2331Dp.m13305constructorimpl(f7), C2331Dp.m13305constructorimpl(f8), C2331Dp.m13305constructorimpl(f), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(C2331Dp.m13305constructorimpl(f7), 0.0f, C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f), 2, null);
        YearsVerticalPadding = C2331Dp.m13305constructorimpl(f8);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m8412DateEntryContainerau3_HiA(@NotNull final Modifier modifier, @Nullable final InterfaceC6473e interfaceC6473e, @Nullable final InterfaceC6473e interfaceC6473e2, @Nullable final InterfaceC6473e interfaceC6473e3, @NotNull final DatePickerColors datePickerColors, @NotNull final TextStyle textStyle, final float f, @NotNull final InterfaceC6473e interfaceC6473e4, @Nullable Composer composer, final int i) {
        int i8;
        InterfaceC6473e interfaceC6473e5;
        InterfaceC6473e interfaceC6473e6;
        InterfaceC6473e interfaceC6473e7;
        DatePickerColors datePickerColors2;
        TextStyle textStyle2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1507356255);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            interfaceC6473e5 = interfaceC6473e;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 32 : 16;
        } else {
            interfaceC6473e5 = interfaceC6473e;
        }
        if ((i & 384) == 0) {
            interfaceC6473e6 = interfaceC6473e2;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e6) ? 256 : 128;
        } else {
            interfaceC6473e6 = interfaceC6473e2;
        }
        if ((i & 3072) == 0) {
            interfaceC6473e7 = interfaceC6473e3;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e7) ? 2048 : 1024;
        } else {
            interfaceC6473e7 = interfaceC6473e3;
        }
        if ((i & 24576) == 0) {
            datePickerColors2 = datePickerColors;
            i8 |= composerStartRestartGroup.changed(datePickerColors2) ? 16384 : 8192;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((196608 & i) == 0) {
            textStyle2 = textStyle;
            i8 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? 8388608 : 4194304;
        }
        if ((4793491 & i8) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i8, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1308)");
            }
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SemanticsModifierKt.semantics$default(SizeKt.m7313sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m9559getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), datePickerColors2.getContainerColor(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6754backgroundbw27NRU$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            final InterfaceC6473e interfaceC6473e8 = interfaceC6473e5;
            final InterfaceC6473e interfaceC6473e9 = interfaceC6473e6;
            final InterfaceC6473e interfaceC6473e10 = interfaceC6473e7;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final TextStyle textStyle3 = textStyle2;
            m8413DatePickerHeaderpc5RIQQ(Modifier.INSTANCE, interfaceC6473e, datePickerColors2.getTitleContentColor(), datePickerColors2.getHeadlineContentColor(), f, ComposableLambdaKt.rememberComposableLambda(-229007058, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
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
                public final void invoke(@Nullable Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229007058, i9, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1326)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    final InterfaceC6473e interfaceC6473e11 = interfaceC6473e9;
                    InterfaceC6473e interfaceC6473e12 = interfaceC6473e10;
                    InterfaceC6473e interfaceC6473e13 = interfaceC6473e8;
                    DatePickerColors datePickerColors4 = datePickerColors3;
                    TextStyle textStyle4 = textStyle3;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion3.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor2 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer3);
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
                    if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Arrangement.Horizontal start = (interfaceC6473e11 == null || interfaceC6473e12 == null) ? interfaceC6473e11 != null ? arrangement.getStart() : arrangement.getEnd() : arrangement.getSpaceBetween();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    InterfaceC6469a constructor3 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composer3);
                    InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy, composerM10109constructorimpl3, currentCompositionLocalMap3);
                    if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                    final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1287344744);
                    if (interfaceC6473e11 != null) {
                        TextKt.ProvideTextStyle(textStyle4, ComposableLambdaKt.rememberComposableLambda(-962031352, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer4, int i10) {
                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-962031352, i10, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1340)");
                                }
                                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                InterfaceC6473e interfaceC6473e14 = interfaceC6473e11;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierWeight$default);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                InterfaceC6469a constructor4 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composer4);
                                InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion5, composerM10109constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl4, currentCompositionLocalMap4);
                                if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r4);
                                }
                                Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (AbstractC0584a.m924y(composer4, 0, interfaceC6473e14)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1287336668);
                    if (interfaceC6473e12 != null) {
                        interfaceC6473e12.invoke(composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.startReplaceGroup(1995137078);
                    if (interfaceC6473e13 != null || interfaceC6473e11 != null || interfaceC6473e12 != null) {
                        DividerKt.m8467HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors4.getDividerColor(), composer3, 0, 3);
                    }
                    if (AbstractC0584a.m923x(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 112) | 196614 | (57344 & (i8 >> 6)));
            composer2 = composerStartRestartGroup;
            if (AbstractC0584a.m924y(composer2, (i8 >> 21) & 14, interfaceC6473e4)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$3
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
                    DatePickerKt.m8412DateEntryContainerau3_HiA(modifier, interfaceC6473e, interfaceC6473e2, interfaceC6473e3, datePickerColors, textStyle, f, interfaceC6473e4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DatePicker(@org.jetbrains.annotations.NotNull final androidx.compose.material3.DatePickerState r25, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerFormatter r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r29, boolean r30, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerColors r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, r6.e, r6.e, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03df  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DatePickerContent(final java.lang.Long r31, final long r32, final p152r6.InterfaceC6471c r34, final p152r6.InterfaceC6471c r35, final androidx.compose.material3.internal.CalendarModel r36, final p200x6.C6756f r37, final androidx.compose.material3.DatePickerFormatter r38, final androidx.compose.material3.SelectableDates r39, final androidx.compose.material3.DatePickerColors r40, androidx.compose.runtime.Composer r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePickerContent(java.lang.Long, long, r6.c, r6.c, androidx.compose.material3.internal.CalendarModel, x6.f, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent$lambda$11(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8413DatePickerHeaderpc5RIQQ(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.Modifier r17, @org.jetbrains.annotations.Nullable final p152r6.InterfaceC6473e r18, final long r19, final long r21, final float r23, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, final int r26) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m8413DatePickerHeaderpc5RIQQ(androidx.compose.ui.Modifier, r6.e, long, long, float, r6.e, androidx.compose.runtime.Composer, int):void");
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m8414DatePickerStatesHin3Bw(@NotNull Locale locale, @Nullable Long l, @Nullable Long l3, @NotNull C6756f c6756f, int i, @NotNull SelectableDates selectableDates) {
        return new DatePickerStateImpl(l, l3, c6756f, i, selectableDates, locale, null);
    }

    /* renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m8415DatePickerStatesHin3Bw$default(Locale locale, Long l, Long l3, C6756f c6756f, int i, SelectableDates selectableDates, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            l = null;
        }
        if ((i8 & 4) != 0) {
            l3 = l;
        }
        if ((i8 & 8) != 0) {
            c6756f = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i8 & 16) != 0) {
            i = DisplayMode.INSTANCE.m8464getPickerjFl4v0();
        }
        if ((i8 & 32) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        SelectableDates selectableDates2 = selectableDates;
        C6756f c6756f2 = c6756f;
        return m8414DatePickerStatesHin3Bw(locale, l, l3, c6756f2, i, selectableDates2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Day(final Modifier modifier, final boolean z8, final InterfaceC6469a interfaceC6469a, final boolean z9, final boolean z10, final boolean z11, final boolean z12, final String str, final DatePickerColors datePickerColors, final InterfaceC6473e interfaceC6473e, Composer composer, final int i) {
        int i8;
        boolean z13;
        boolean z14;
        boolean z15;
        DatePickerColors datePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1434777861);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z13 = z9;
            i8 |= composerStartRestartGroup.changed(z13) ? 2048 : 1024;
        } else {
            z13 = z9;
        }
        if ((i & 24576) == 0) {
            z14 = z10;
            i8 |= composerStartRestartGroup.changed(z14) ? 16384 : 8192;
        } else {
            z14 = z10;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(z11) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z15 = z12;
            i8 |= composerStartRestartGroup.changed(z15) ? 1048576 : 524288;
        } else {
            z15 = z12;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i8 |= composerStartRestartGroup.changed(datePickerColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((805306368 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 536870912 : 268435456;
        }
        int i9 = i8;
        if ((306783379 & i9) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i9, -1, "androidx.compose.material3.Day (DatePicker.kt:1941)");
            }
            boolean z16 = (29360128 & i9) == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z16 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$Day$1$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12532getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (InterfaceC6471c) objRememberedValue);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Shape value = ShapesKt.getValue(datePickerModalTokens.getDateContainerShape(), composerStartRestartGroup, 6);
            int i10 = i9 >> 3;
            int i11 = i9 >> 15;
            long jM10692unboximpl = datePickerColors2.dayContainerColor$material3_release(z8, z14, z13, composerStartRestartGroup, (i11 & 7168) | (i10 & 14) | ((i9 >> 9) & 112) | (i10 & 896)).getValue().m10692unboximpl();
            int i12 = i9 >> 12;
            SurfaceKt.m8956Surfaced85dljk(z8, interfaceC6469a, modifierSemantics, z10, value, jM10692unboximpl, datePickerColors.dayContentColor$material3_release(z11, z8, z15, z10, composerStartRestartGroup, (i11 & 14) | (i9 & 112) | (i12 & 896) | (i10 & 7168) | (i12 & 57344)).getValue().m10692unboximpl(), 0.0f, 0.0f, (!z11 || z8) ? null : BorderStrokeKt.m6783BorderStrokecXLIe8U(datePickerModalTokens.m9564getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor()), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-2031780827, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.Day.2
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
                public final void invoke(@Nullable Composer composer2, int i13) {
                    if ((i13 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2031780827, i13, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:1980)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    DatePickerModalTokens datePickerModalTokens2 = DatePickerModalTokens.INSTANCE;
                    Modifier modifierM7303requiredSizeVpY3zN4 = SizeKt.m7303requiredSizeVpY3zN4(companion, datePickerModalTokens2.m9563getDateStateLayerWidthD9Ej5fM(), datePickerModalTokens2.m9562getDateStateLayerHeightD9Ej5fM());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM7303requiredSizeVpY3zN4);
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
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i10 & 7294, 48, 1408);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.Day.3
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
                    DatePickerKt.Day(modifier, z8, interfaceC6469a, z9, z10, z11, z12, str, datePickerColors, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: DisplayModeToggleButton-tER2X8s, reason: not valid java name */
    public static final void m8416DisplayModeToggleButtontER2X8s(@NotNull Modifier modifier, final int i, @NotNull final InterfaceC6471c interfaceC6471c, @Nullable Composer composer, final int i8) {
        int i9;
        boolean z8;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1393846115);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i9, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1361)");
            }
            if (DisplayMode.m8459equalsimpl0(i, DisplayMode.INSTANCE.m8464getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(-411219388);
                z8 = (i9 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m8424invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m8424invoke() {
                            interfaceC6471c.invoke(DisplayMode.m8456boximpl(DisplayMode.INSTANCE.m8463getInputjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                modifier2 = modifier;
                IconButtonKt.IconButton((InterfaceC6469a) objRememberedValue, modifier2, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m8347getLambda1$material3_release(), composerStartRestartGroup, ((i9 << 3) & 112) | ProfileVerifier.CompilationStatus.f1352xf2722a21, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-410937381);
                z8 = (i9 & 896) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m8425invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m8425invoke() {
                            interfaceC6471c.invoke(DisplayMode.m8456boximpl(DisplayMode.INSTANCE.m8464getPickerjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifier2 = modifier;
                IconButtonKt.IconButton((InterfaceC6469a) objRememberedValue2, modifier2, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m8348getLambda2$material3_release(), composerStartRestartGroup, ((i9 << 3) & 112) | ProfileVerifier.CompilationStatus.f1352xf2722a21, 28);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
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
                    DatePickerKt.m8416DisplayModeToggleButtontER2X8s(modifier2, i, interfaceC6471c, composer2, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalMonthsList(LazyListState lazyListState, final Long l, final InterfaceC6471c interfaceC6471c, final InterfaceC6471c interfaceC6471c2, final CalendarModel calendarModel, final C6756f c6756f, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i8;
        Long l3;
        final InterfaceC6471c interfaceC6471c3;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        Object datePickerKt$HorizontalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1994757941);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(lazyListState2) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            l3 = l;
            i8 |= composerStartRestartGroup.changed(l3) ? 32 : 16;
        } else {
            l3 = l;
        }
        if ((i & 384) == 0) {
            interfaceC6471c3 = interfaceC6471c;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c3) ? 256 : 128;
        } else {
            interfaceC6471c3 = interfaceC6471c;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(c6756f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            selectableDates2 = selectableDates;
            i8 |= composerStartRestartGroup.changed(selectableDates2) ? 8388608 : 4194304;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((100663296 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i8 |= composerStartRestartGroup.changed(datePickerColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((38347923 & i8) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994757941, i8, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1656)");
            }
            final CalendarDate today = calendarModel.getToday();
            boolean zChanged = composerStartRestartGroup.changed(c6756f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(c6756f.f11420a, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final SelectableDates selectableDates3 = selectableDates2;
            final Long l8 = l3;
            int i9 = i8;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1504086906, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1
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
                public final void invoke(@Nullable Composer composer2, int i10) {
                    if ((i10 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1504086906, i10, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1666)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1
                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.1
                                @Override // p152r6.InterfaceC6469a
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.2
                                @Override // p152r6.InterfaceC6469a
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    FlingBehavior flingBehaviorRememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState3, null, composer2, 384, 2);
                    boolean zChangedInstance = composer2.changedInstance(c6756f) | composer2.changedInstance(calendarModel) | composer2.changed(calendarMonth) | composer2.changed(interfaceC6471c3) | composer2.changed(today) | composer2.changed(l8) | composer2.changedInstance(datePickerFormatter) | composer2.changed(selectableDates3) | composer2.changed(datePickerColors3);
                    final C6756f c6756f2 = c6756f;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final InterfaceC6471c interfaceC6471c4 = interfaceC6471c3;
                    final CalendarDate calendarDate = today;
                    final Long l9 = l8;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates4 = selectableDates3;
                    final DatePickerColors datePickerColors4 = datePickerColors3;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LazyListScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull LazyListScope lazyListScope) {
                                int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(c6756f2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final InterfaceC6471c interfaceC6471c5 = interfaceC6471c4;
                                final CalendarDate calendarDate2 = calendarDate;
                                final Long l10 = l9;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates5 = selectableDates4;
                                final DatePickerColors datePickerColors5 = datePickerColors4;
                                LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(1137566309, true, new InterfaceC6475g() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // p152r6.InterfaceC6475g
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                        return C5443s.f8405a;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i11, @Nullable Composer composer3, int i12) {
                                        int i13;
                                        if ((i12 & 6) == 0) {
                                            i13 = i12 | (composer3.changed(lazyItemScope) ? 4 : 2);
                                        } else {
                                            i13 = i12;
                                        }
                                        if ((i12 & 48) == 0) {
                                            i13 |= composer3.changed(i11) ? 32 : 16;
                                        }
                                        if ((i13 & 147) == 146 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1137566309, i13, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1678)");
                                        }
                                        CalendarMonth calendarMonthPlusMonths = calendarModel3.plusMonths(calendarMonth3, i11);
                                        Modifier modifierFillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
                                        InterfaceC6471c interfaceC6471c6 = interfaceC6471c5;
                                        CalendarDate calendarDate3 = calendarDate2;
                                        Long l11 = l10;
                                        DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                        SelectableDates selectableDates6 = selectableDates5;
                                        DatePickerColors datePickerColors6 = datePickerColors5;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillParentMaxWidth$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        InterfaceC6469a constructor = companion.getConstructor();
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
                                        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                                        if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                                        }
                                        Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        DatePickerKt.Month(calendarMonthPlusMonths, interfaceC6471c6, calendarDate3.getUtcTimeMillis(), l11, null, null, datePickerFormatter4, selectableDates6, datePickerColors6, composer3, 221184);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    LazyDslKt.LazyRow(modifierSemantics$default, lazyListState3, null, false, null, null, flingBehaviorRememberSnapFlingBehavior$material3_release, false, (InterfaceC6471c) objRememberedValue2, composer2, 0, 188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            int i10 = i9 & 14;
            boolean zChangedInstance = (i10 == 4) | ((i9 & 7168) == 2048) | composerStartRestartGroup.changedInstance(calendarModel) | composerStartRestartGroup.changedInstance(c6756f);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                lazyListState2 = lazyListState;
                datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, interfaceC6471c2, calendarModel, c6756f, null);
                composerStartRestartGroup.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1);
            } else {
                datePickerKt$HorizontalMonthsList$2$1 = objRememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (InterfaceC6473e) datePickerKt$HorizontalMonthsList$2$1, composerStartRestartGroup, i10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.3
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
                    DatePickerKt.HorizontalMonthsList(lazyListState2, l, interfaceC6471c, interfaceC6471c2, calendarModel, c6756f, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x043a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Month(@org.jetbrains.annotations.NotNull final androidx.compose.material3.internal.CalendarMonth r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r31, final long r32, @org.jetbrains.annotations.Nullable final java.lang.Long r34, @org.jetbrains.annotations.Nullable final java.lang.Long r35, @org.jetbrains.annotations.Nullable final androidx.compose.material3.SelectedRangeInfo r36, @org.jetbrains.annotations.NotNull final androidx.compose.material3.DatePickerFormatter r37, @org.jetbrains.annotations.NotNull final androidx.compose.material3.SelectableDates r38, @org.jetbrains.annotations.NotNull final androidx.compose.material3.DatePickerColors r39, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.Month(androidx.compose.material3.internal.CalendarMonth, r6.c, long, java.lang.Long, java.lang.Long, androidx.compose.material3.SelectedRangeInfo, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MonthsNavigation(final Modifier modifier, final boolean z8, final boolean z9, final boolean z10, final String str, final InterfaceC6469a interfaceC6469a, final InterfaceC6469a interfaceC6469a2, final InterfaceC6469a interfaceC6469a3, DatePickerColors datePickerColors, Composer composer, final int i) {
        int i8;
        InterfaceC6469a interfaceC6469a4;
        DatePickerColors datePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-773929258);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(z9) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            interfaceC6469a4 = interfaceC6469a3;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a4) ? 8388608 : 4194304;
        } else {
            interfaceC6469a4 = interfaceC6469a3;
        }
        if ((100663296 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i8 |= composerStartRestartGroup.changed(datePickerColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((38347923 & i8) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-773929258, i8, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2150)");
            }
            Modifier modifierM7298requiredHeight3ABfNKs = SizeKt.m7298requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(z10 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7298requiredHeight3ABfNKs);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            final InterfaceC6469a interfaceC6469a5 = interfaceC6469a4;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(datePickerColors2.getNavigationContentColor())), ComposableLambdaKt.rememberComposableLambda(-962805198, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1
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
                        ComposerKt.traceEventStart(-962805198, i9, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2163)");
                    }
                    InterfaceC6469a interfaceC6469a6 = interfaceC6469a5;
                    boolean z11 = z10;
                    final String str2 = str;
                    DatePickerKt.YearPickerMenuButton(interfaceC6469a6, z11, null, ComposableLambdaKt.rememberComposableLambda(1377272806, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1.1
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
                                ComposerKt.traceEventStart(1377272806, i10, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2167)");
                            }
                            String str3 = str2;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            boolean zChanged = composer3.changed(str3);
                            final String str4 = str2;
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1$1$1
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
                                        SemanticsPropertiesKt.m12550setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m12524getPolite0phEisY());
                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            TextKt.m9105Text4IGK_g(str3, SemanticsModifierKt.semantics$default(companion2, false, (InterfaceC6471c) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer3, 0, 0, 131068);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3072, 4);
                    if (!z10) {
                        InterfaceC6469a interfaceC6469a7 = interfaceC6469a2;
                        boolean z12 = z9;
                        InterfaceC6469a interfaceC6469a8 = interfaceC6469a;
                        boolean z13 = z8;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor2 = companion3.getConstructor();
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
                        InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
                        if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        ComposableSingletons$DatePickerKt composableSingletons$DatePickerKt = ComposableSingletons$DatePickerKt.INSTANCE;
                        IconButtonKt.IconButton(interfaceC6469a7, null, z12, null, null, composableSingletons$DatePickerKt.m8349getLambda3$material3_release(), composer2, ProfileVerifier.CompilationStatus.f1352xf2722a21, 26);
                        IconButtonKt.IconButton(interfaceC6469a8, null, z13, null, null, composableSingletons$DatePickerKt.m8350getLambda4$material3_release(), composer2, ProfileVerifier.CompilationStatus.f1352xf2722a21, 26);
                        composer2.endNode();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final DatePickerColors datePickerColors3 = datePickerColors2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.MonthsNavigation.2
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
                    DatePickerKt.MonthsNavigation(modifier, z8, z9, z10, str, interfaceC6469a, interfaceC6469a2, interfaceC6469a3, datePickerColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SwitchableDateEntryContent-d7iavvg, reason: not valid java name */
    public static final void m8417SwitchableDateEntryContentd7iavvg(final Long l, final long j7, final int i, final InterfaceC6471c interfaceC6471c, final InterfaceC6471c interfaceC6471c2, final CalendarModel calendarModel, final C6756f c6756f, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i8) {
        int i9;
        InterfaceC6471c interfaceC6471c3;
        InterfaceC6471c interfaceC6471c4;
        CalendarModel calendarModel2;
        C6756f c6756f2;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-895379221);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            interfaceC6471c3 = interfaceC6471c;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6471c3) ? 2048 : 1024;
        } else {
            interfaceC6471c3 = interfaceC6471c;
        }
        if ((i8 & 24576) == 0) {
            interfaceC6471c4 = interfaceC6471c2;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6471c4) ? 16384 : 8192;
        } else {
            interfaceC6471c4 = interfaceC6471c2;
        }
        if ((196608 & i8) == 0) {
            calendarModel2 = calendarModel;
            i9 |= composerStartRestartGroup.changedInstance(calendarModel2) ? 131072 : 65536;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((1572864 & i8) == 0) {
            c6756f2 = c6756f;
            i9 |= composerStartRestartGroup.changedInstance(c6756f2) ? 1048576 : 524288;
        } else {
            c6756f2 = c6756f;
        }
        if ((12582912 & i8) == 0) {
            i9 |= (16777216 & i8) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i8) == 0) {
            selectableDates2 = selectableDates;
            i9 |= composerStartRestartGroup.changed(selectableDates2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((805306368 & i8) == 0) {
            datePickerColors2 = datePickerColors;
            i9 |= composerStartRestartGroup.changed(datePickerColors2) ? 536870912 : 268435456;
        } else {
            datePickerColors2 = datePickerColors;
        }
        int i10 = i9;
        if ((306783379 & i10) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895379221, i10, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1396)");
            }
            final int i11 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(48));
            DisplayMode displayModeM8456boximpl = DisplayMode.m8456boximpl(i);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null);
            boolean zChanged = composerStartRestartGroup.changed(i11);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    @NotNull
                    public final ContentTransform invoke(@NotNull AnimatedContentTransitionScope<DisplayMode> animatedContentTransitionScope) {
                        ContentTransform contentTransform;
                        if (DisplayMode.m8459equalsimpl0(animatedContentTransitionScope.getTargetState().getValue(), DisplayMode.INSTANCE.m8463getInputjFl4v0())) {
                            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.1
                                @NotNull
                                public final Integer invoke(int i12) {
                                    return Integer.valueOf(i12);
                                }

                                @Override // p152r6.InterfaceC6471c
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }
                            }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null));
                            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null);
                            final int i12 = i11;
                            contentTransform = AnimatedContentKt.togetherWith(enterTransitionPlus, exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically$default(null, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @NotNull
                                public final Integer invoke(int i13) {
                                    return Integer.valueOf(i12);
                                }

                                @Override // p152r6.InterfaceC6471c
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }
                            }, 1, null)));
                        } else {
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 50, null, 5, null);
                            final int i13 = i11;
                            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p152r6.InterfaceC6471c
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }

                                @NotNull
                                public final Integer invoke(int i14) {
                                    return Integer.valueOf(i13);
                                }
                            }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically$default(null, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.4
                                @NotNull
                                public final Integer invoke(int i14) {
                                    return Integer.valueOf(i14);
                                }

                                @Override // p152r6.InterfaceC6471c
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }
                            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null)));
                        }
                        return animatedContentTransitionScope.using(contentTransform, AnimatedContentKt.SizeTransform(true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.5
                            @Override // p152r6.InterfaceC6473e
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return m8427invokeTemP2vQ(((IntSize) obj).m13480unboximpl(), ((IntSize) obj2).m13480unboximpl());
                            }

                            @NotNull
                            /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                            public final FiniteAnimationSpec<IntSize> m8427invokeTemP2vQ(long j8, long j9) {
                                return AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier(), 2, null);
                            }
                        }));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final InterfaceC6471c interfaceC6471c5 = interfaceC6471c3;
            final InterfaceC6471c interfaceC6471c6 = interfaceC6471c4;
            final CalendarModel calendarModel3 = calendarModel2;
            final C6756f c6756f3 = c6756f2;
            final SelectableDates selectableDates3 = selectableDates2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            composer2 = composerStartRestartGroup;
            AnimatedContentKt.AnimatedContent(displayModeM8456boximpl, modifierSemantics$default, (InterfaceC6471c) objRememberedValue, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(-459778869, true, new InterfaceC6475g() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // p152r6.InterfaceC6475g
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    m8428invokefYndouo((AnimatedContentScope) obj, ((DisplayMode) obj2).getValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* renamed from: invoke-fYndouo, reason: not valid java name */
                public final void m8428invokefYndouo(@NotNull AnimatedContentScope animatedContentScope, int i12, @Nullable Composer composer3, int i13) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-459778869, i13, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1452)");
                    }
                    DisplayMode.Companion companion = DisplayMode.INSTANCE;
                    if (DisplayMode.m8459equalsimpl0(i12, companion.m8464getPickerjFl4v0())) {
                        composer3.startReplaceGroup(-1870116901);
                        DatePickerKt.DatePickerContent(l, j7, interfaceC6471c5, interfaceC6471c6, calendarModel3, c6756f3, datePickerFormatter, selectableDates3, datePickerColors3, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (DisplayMode.m8459equalsimpl0(i12, companion.m8463getInputjFl4v0())) {
                        composer3.startReplaceGroup(-1870098348);
                        DateInputKt.DateInputContent(l, interfaceC6471c5, calendarModel3, c6756f3, datePickerFormatter, selectableDates3, datePickerColors3, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-2138080579);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i10 >> 6) & 14) | 1597440, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i12) {
                    DatePickerKt.m8417SwitchableDateEntryContentd7iavvg(l, j7, i, interfaceC6471c, interfaceC6471c2, calendarModel, c6756f, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void WeekDays(@NotNull final DatePickerColors datePickerColors, @NotNull final CalendarModel calendarModel, @Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849465391);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(calendarModel) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i8, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1728)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i9 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i10 = i9; i10 < size; i10++) {
                arrayList.add(weekdayNames.get(i10));
            }
            ?? r8 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                arrayList.add(weekdayNames.get(i11));
            }
            TextStyle value = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m7294defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(396197267);
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                final Pair pair = (Pair) arrayList.get(i12);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zChanged = composerStartRestartGroup.changed(pair);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$1$1$1$1
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
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, pair.getFirst());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (InterfaceC6471c) objRememberedValue);
                float f = RecommendedSizeForAccessibility;
                Modifier modifierM7311sizeVpY3zN4 = SizeKt.m7311sizeVpY3zN4(modifierClearAndSetSemantics, f, f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), r8);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r8);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7311sizeVpY3zN4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                Composer composer3 = composerStartRestartGroup;
                TextKt.m9105Text4IGK_g((String) pair.getSecond(), SizeKt.wrapContentSize$default(companion2, null, false, 3, null), datePickerColors.getWeekdayContentColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13182boximpl(TextAlign.INSTANCE.m13189getCentere0LSkKk()), 0L, 0, false, 0, 0, (InterfaceC6471c) null, value, composer3, 48, 0, 65016);
                composer3.endNode();
                i12++;
                composerStartRestartGroup = composer3;
                arrayList = arrayList;
                r8 = 0;
            }
            composer2 = composerStartRestartGroup;
            if (AbstractC0584a.m923x(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.WeekDays.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer4, int i13) {
                    DatePickerKt.WeekDays(datePickerColors, calendarModel, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Year(final Modifier modifier, final boolean z8, final boolean z9, final InterfaceC6469a interfaceC6469a, final boolean z10, final String str, final DatePickerColors datePickerColors, final InterfaceC6473e interfaceC6473e, Composer composer, final int i) {
        int i8;
        Object objM6783BorderStrokecXLIe8U;
        Composer composerStartRestartGroup = composer.startRestartGroup(238547184);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(z9) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(z10) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 8388608 : 4194304;
        }
        if ((4793491 & i8) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(238547184, i8, -1, "androidx.compose.material3.Year (DatePicker.kt:2097)");
            }
            int i9 = i8 & 112;
            boolean z11 = ((i8 & 896) == 256) | (i9 == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objM6783BorderStrokecXLIe8U = (!z9 || z8) ? null : BorderStrokeKt.m6783BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m9564getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor());
                composerStartRestartGroup.updateRememberedValue(objM6783BorderStrokecXLIe8U);
            } else {
                objM6783BorderStrokecXLIe8U = objRememberedValue;
            }
            BorderStroke borderStroke = (BorderStroke) objM6783BorderStrokecXLIe8U;
            boolean z12 = (458752 & i8) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$Year$1$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12532getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i10 = i8 >> 3;
            int i11 = i10 & 14;
            int i12 = i8 >> 9;
            int i13 = i8 >> 6;
            SurfaceKt.m8956Surfaced85dljk(z8, interfaceC6469a, SemanticsModifierKt.semantics(modifier, true, (InterfaceC6471c) objRememberedValue2), z10, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), composerStartRestartGroup, 6), datePickerColors.yearContainerColor$material3_release(z8, z10, composerStartRestartGroup, i11 | (i12 & 112) | ((i8 >> 12) & 896)).getValue().m10692unboximpl(), datePickerColors.yearContentColor$material3_release(z9, z8, z10, composerStartRestartGroup, (i13 & 14) | i9 | (i13 & 896) | (i12 & 7168)).getValue().m10692unboximpl(), 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-1573188346, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.Year.2
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
                public final void invoke(@Nullable Composer composer2, int i14) {
                    if ((i14 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1573188346, i14, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2130)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion.getConstructor();
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
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i11 | (i13 & 112) | (i10 & 7168), 48, 1408);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.Year.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i14) {
                    DatePickerKt.Year(modifier, z8, z9, interfaceC6469a, z10, str, datePickerColors, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void YearPicker(final Modifier modifier, final long j7, final InterfaceC6471c interfaceC6471c, final SelectableDates selectableDates, final CalendarModel calendarModel, final C6756f c6756f, final DatePickerColors datePickerColors, Composer composer, final int i) {
        Modifier modifier2;
        int i8;
        InterfaceC6471c interfaceC6471c2;
        SelectableDates selectableDates2;
        CalendarModel calendarModel2;
        C6756f c6756f2;
        DatePickerColors datePickerColors2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1286899812);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i8 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            interfaceC6471c2 = interfaceC6471c;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c2) ? 256 : 128;
        } else {
            interfaceC6471c2 = interfaceC6471c;
        }
        if ((i & 3072) == 0) {
            selectableDates2 = selectableDates;
            i8 |= composerStartRestartGroup.changed(selectableDates2) ? 2048 : 1024;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i & 24576) == 0) {
            calendarModel2 = calendarModel;
            i8 |= composerStartRestartGroup.changedInstance(calendarModel2) ? 16384 : 8192;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((196608 & i) == 0) {
            c6756f2 = c6756f;
            i8 |= composerStartRestartGroup.changedInstance(c6756f2) ? 131072 : 65536;
        } else {
            c6756f2 = c6756f;
        }
        if ((1572864 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i8 |= composerStartRestartGroup.changed(datePickerColors2) ? 1048576 : 524288;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((599187 & i8) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1286899812, i8, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2003)");
            }
            final Modifier modifier3 = modifier2;
            final InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
            final SelectableDates selectableDates3 = selectableDates2;
            final CalendarModel calendarModel3 = calendarModel2;
            final C6756f c6756f3 = c6756f2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1301915789, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1
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
                        ComposerKt.traceEventStart(1301915789, i9, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2005)");
                    }
                    CalendarModel calendarModel4 = calendarModel3;
                    final int year = calendarModel4.getMonth(calendarModel4.getToday()).getYear();
                    final int year2 = calendarModel3.getMonth(j7).getYear();
                    final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - c6756f3.f11420a) - 3), 0, composer2, 0, 2);
                    long containerColor = datePickerColors3.getContainerColor();
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    final InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    Strings.Companion companion2 = Strings.INSTANCE;
                    final String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_picker_scroll_to_earlier_years), composer2, 0);
                    final String strM9393getString2EP1pXo2 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_picker_scroll_to_later_years), composer2, 0);
                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m6754backgroundbw27NRU$default(modifier3, containerColor, null, 2, null), false, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1
                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.1
                                @Override // p152r6.InterfaceC6469a
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.2
                                @Override // p152r6.InterfaceC6469a
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_4 = arrangement.m7143spacedBy0680j_4(DatePickerKt.YearsVerticalPadding);
                    boolean zChangedInstance = composer2.changedInstance(c6756f3) | composer2.changed(lazyGridStateRememberLazyGridState) | composer2.changedInstance(coroutineScope) | composer2.changed(strM9393getString2EP1pXo) | composer2.changed(strM9393getString2EP1pXo2) | composer2.changed(year2) | composer2.changed(year) | composer2.changed(interfaceC6471c3) | composer2.changed(selectableDates3) | composer2.changed(datePickerColors3);
                    final C6756f c6756f4 = c6756f3;
                    final InterfaceC6471c interfaceC6471c4 = interfaceC6471c3;
                    final SelectableDates selectableDates4 = selectableDates3;
                    final DatePickerColors datePickerColors4 = datePickerColors3;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        Object obj = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((LazyGridScope) obj2);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull LazyGridScope lazyGridScope) {
                                int size;
                                Iterable iterable = c6756f4;
                                AbstractC5830k.m5330g(iterable, "<this>");
                                if (iterable instanceof Collection) {
                                    size = ((Collection) iterable).size();
                                } else {
                                    Iterator it = iterable.iterator();
                                    size = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        size++;
                                        if (size < 0) {
                                            AbstractC5806u.m5257K();
                                            throw null;
                                        }
                                    }
                                }
                                final C6756f c6756f5 = c6756f4;
                                final LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                                final InterfaceC6009v interfaceC6009v = coroutineScope;
                                final String str = strM9393getString2EP1pXo;
                                final String str2 = strM9393getString2EP1pXo2;
                                final int i10 = year2;
                                final int i11 = year;
                                final InterfaceC6471c interfaceC6471c5 = interfaceC6471c4;
                                final SelectableDates selectableDates5 = selectableDates4;
                                final DatePickerColors datePickerColors5 = datePickerColors4;
                                LazyGridScope.items$default(lazyGridScope, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(1040623618, true, new InterfaceC6475g() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // p152r6.InterfaceC6475g
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                        invoke((LazyGridItemScope) obj2, ((Number) obj3).intValue(), (Composer) obj4, ((Number) obj5).intValue());
                                        return C5443s.f8405a;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, final int i12, @Nullable Composer composer3, int i13) {
                                        int i14;
                                        if ((i13 & 48) == 0) {
                                            i14 = i13 | (composer3.changed(i12) ? 32 : 16);
                                        } else {
                                            i14 = i13;
                                        }
                                        if ((i14 & 145) == 144 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1040623618, i14, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2034)");
                                        }
                                        final int i15 = i12 + c6756f5.f11420a;
                                        final String localString$default = CalendarLocale_jvmKt.toLocalString$default(i15, 0, 0, false, 7, null);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                                        Modifier modifierM7303requiredSizeVpY3zN4 = SizeKt.m7303requiredSizeVpY3zN4(companion3, datePickerModalTokens.m9571getSelectionYearContainerWidthD9Ej5fM(), datePickerModalTokens.m9570getSelectionYearContainerHeightD9Ej5fM());
                                        boolean zChanged = ((i14 & 112) == 32) | composer3.changed(lazyGridState) | composer3.changedInstance(interfaceC6009v) | composer3.changed(str) | composer3.changed(str2);
                                        final LazyGridState lazyGridState2 = lazyGridState;
                                        final InterfaceC6009v interfaceC6009v2 = interfaceC6009v;
                                        final String str3 = str;
                                        final String str4 = str2;
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            InterfaceC6471c interfaceC6471c6 = new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // p152r6.InterfaceC6471c
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SemanticsPropertyReceiver) obj2);
                                                    return C5443s.f8405a;
                                                }

                                                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    LazyGridItemInfo lazyGridItemInfo;
                                                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, (lazyGridState2.getFirstVisibleItemIndex() == i12 || ((lazyGridItemInfo = (LazyGridItemInfo) AbstractC5805t.m5236p0(lazyGridState2.getLayoutInfo().getVisibleItemsInfo())) != null && lazyGridItemInfo.getIndex() == i12)) ? DatePickerKt.customScrollActions(lazyGridState2, interfaceC6009v2, str3, str4) : EmptyList.INSTANCE);
                                                }
                                            };
                                            composer3.updateRememberedValue(interfaceC6471c6);
                                            objRememberedValue3 = interfaceC6471c6;
                                        }
                                        Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierM7303requiredSizeVpY3zN4, false, (InterfaceC6471c) objRememberedValue3, 1, null);
                                        boolean z8 = i15 == i10;
                                        boolean z9 = i15 == i11;
                                        boolean zChanged2 = composer3.changed(interfaceC6471c5) | composer3.changed(i15);
                                        final InterfaceC6471c interfaceC6471c7 = interfaceC6471c5;
                                        Object objRememberedValue4 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // p152r6.InterfaceC6469a
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m8429invoke();
                                                    return C5443s.f8405a;
                                                }

                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m8429invoke() {
                                                    interfaceC6471c7.invoke(Integer.valueOf(i15));
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue4);
                                        }
                                        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue4;
                                        boolean zIsSelectableYear = selectableDates5.isSelectableYear(i15);
                                        Strings.Companion companion4 = Strings.INSTANCE;
                                        DatePickerKt.Year(modifierSemantics$default2, z8, z9, interfaceC6469a, zIsSelectableYear, String.format(Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_picker_navigate_to_year_description), composer3, 0), Arrays.copyOf(new Object[]{localString$default}, 1)), datePickerColors5, ComposableLambdaKt.rememberComposableLambda(882189459, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // p152r6.InterfaceC6473e
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                                return C5443s.f8405a;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i16) {
                                                if ((i16 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(882189459, i16, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2074)");
                                                }
                                                TextKt.m9105Text4IGK_g(localString$default, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new InterfaceC6471c() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3.1
                                                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // p152r6.InterfaceC6471c
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((SemanticsPropertyReceiver) obj2);
                                                        return C5443s.f8405a;
                                                    }
                                                }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13182boximpl(TextAlign.INSTANCE.m13189getCentere0LSkKk()), 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer4, 0, 0, 130556);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 12582912);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 14, null);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        objRememberedValue2 = obj;
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierSemantics$default, lazyGridStateRememberLazyGridState, null, false, horizontalOrVerticalM7143spacedBy0680j_4, spaceEvenly, null, false, (InterfaceC6471c) objRememberedValue2, composer2, 1769472, 408);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.2
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
                    DatePickerKt.YearPicker(modifier, j7, interfaceC6471c, selectableDates, calendarModel, c6756f, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void YearPickerMenuButton(final p152r6.InterfaceC6469a r19, final boolean r20, androidx.compose.p011ui.Modifier r21, final p152r6.InterfaceC6473e r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.YearPickerMenuButton(r6.a, boolean, androidx.compose.ui.Modifier, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyGridState lazyGridState, final InterfaceC6009v interfaceC6009v, String str, String str2) {
        return AbstractC5806u.m5287z(new CustomAccessibilityAction(str, new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1", m5303f = "DatePicker.kt", m5304i = {}, m5305l = {2242}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1 */
            public static final class C16201 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16201(LazyGridState lazyGridState, InterfaceC5631c<? super C16201> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$state = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    return new C16201(this.$state, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        LazyGridState lazyGridState = this.$state;
                        int firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex() - 3;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
                    return ((C16201) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Boolean invoke() {
                boolean z8;
                if (lazyGridState.getCanScrollBackward()) {
                    AbstractC6014x.m5651v(interfaceC6009v, null, null, new C16201(lazyGridState, null), 3);
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
        }), new CustomAccessibilityAction(str2, new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1", m5303f = "DatePicker.kt", m5304i = {}, m5305l = {2250}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1 */
            public static final class C16191 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16191(LazyGridState lazyGridState, InterfaceC5631c<? super C16191> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$state = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    return new C16191(this.$state, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        LazyGridState lazyGridState = this.$state;
                        int firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex() + 3;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
                    return ((C16191) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Boolean invoke() {
                boolean z8;
                if (lazyGridState.getCanScrollForward()) {
                    AbstractC6014x.m5651v(interfaceC6009v, null, null, new C16191(lazyGridState, null), 3);
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
        }));
    }

    @Composable
    private static final String dayContentDescription(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1909)");
        }
        StringBuilder sb = new StringBuilder();
        composer.startReplaceGroup(-647730741);
        if (z8) {
            if (z10) {
                composer.startReplaceGroup(-647727716);
                Strings.Companion companion = Strings.INSTANCE;
                sb.append(Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_range_picker_start_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z11) {
                composer.startReplaceGroup(-647723718);
                Strings.Companion companion2 = Strings.INSTANCE;
                sb.append(Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_range_picker_end_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z12) {
                composer.startReplaceGroup(-647719783);
                Strings.Companion companion3 = Strings.INSTANCE;
                sb.append(Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_range_picker_day_in_range), composer, 0));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1395591750);
                composer.endReplaceGroup();
            }
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-647717033);
        if (z9) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Strings.Companion companion4 = Strings.INSTANCE;
            sb.append(Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_picker_today_description), composer, 0));
        }
        composer.endReplaceGroup();
        String string = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    @NotNull
    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final int numberOfMonthsInRange(@NotNull C6756f c6756f) {
        return ((c6756f.f11421b - c6756f.f11420a) + 1) * 12;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m8419rememberDatePickerStateEU0dCGE(@Nullable Long l, @Nullable Long l3, @Nullable C6756f c6756f, int i, @Nullable SelectableDates selectableDates, @Nullable Composer composer, int i8, int i9) {
        if ((i9 & 1) != 0) {
            l = null;
        }
        final Long l8 = l;
        final Long l9 = (i9 & 2) != 0 ? l8 : l3;
        if ((i9 & 4) != 0) {
            c6756f = DatePickerDefaults.INSTANCE.getYearRange();
        }
        final C6756f c6756f2 = c6756f;
        if ((i9 & 8) != 0) {
            i = DisplayMode.INSTANCE.m8464getPickerjFl4v0();
        }
        final int i10 = i;
        if ((i9 & 16) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        final SelectableDates selectableDates2 = selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, i8, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:364)");
        }
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DatePickerStateImpl, Object> Saver = DatePickerStateImpl.INSTANCE.Saver(selectableDates2, localeDefaultLocale);
        boolean zChangedInstance = ((((57344 & i8) ^ 24576) > 16384 && composer.changed(selectableDates2)) || (i8 & 24576) == 16384) | ((((i8 & 14) ^ 6) > 4 && composer.changed(l8)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && composer.changed(l9)) || (i8 & 48) == 32) | composer.changedInstance(c6756f2) | ((((i8 & 7168) ^ 3072) > 2048 && composer.changed(i10)) || (i8 & 3072) == 2048) | composer.changedInstance(localeDefaultLocale);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt$rememberDatePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final DatePickerStateImpl invoke() {
                    return new DatePickerStateImpl(l8, l9, c6756f2, i10, selectableDates2, localeDefaultLocale, null);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 0, 4);
        datePickerStateImpl.setSelectableDates(selectableDates2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerStateImpl;
    }

    @Nullable
    public static final Object updateDisplayedMonth(@NotNull final LazyListState lazyListState, @NotNull final InterfaceC6471c interfaceC6471c, @NotNull final CalendarModel calendarModel, @NotNull final C6756f c6756f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(lazyListState.getFirstVisibleItemIndex());
            }
        }).collect(new InterfaceC5912g() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.3
            @Override // kotlinx.coroutines.flow.InterfaceC5912g
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC5631c interfaceC5631c2) {
                return emit(((Number) obj).intValue(), (InterfaceC5631c<? super C5443s>) interfaceC5631c2);
            }

            @Nullable
            public final Object emit(int i, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c2) {
                int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() / 12;
                interfaceC6471c.invoke(new Long(calendarModel.getMonth(c6756f.f11420a + firstVisibleItemIndex, (lazyListState.getFirstVisibleItemIndex() % 12) + 1).getStartUtcTimeMillis()));
                return C5443s.f8405a;
            }
        }, interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }
}
