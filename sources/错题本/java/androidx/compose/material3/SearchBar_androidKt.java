package androidx.compose.material3;

import android.view.BackEventCompat;
import androidx.collection.AbstractC0584a;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009b\u0001\u0010\u0018\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0091\u0001\u0010\u001b\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0093\u0002\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010 \u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00042\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0089\u0002\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010 \u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00042\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a»\u0001\u00108\u001a\u00020\u00012\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,2\u0006\u00101\u001a\u0002002\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103022\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103022\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u0096\u0001\u0010:\u001a\u00020\u00012\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,2\u0006\u00101\u001a\u0002002\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103022\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u00109\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b:\u0010;\u001a)\u0010=\u001a\u00020-2\b\u00105\u001a\u0004\u0018\u0001032\u0006\u0010<\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0002¢\u0006\u0004\b=\u0010>\u001aD\u0010H\u001a\u00020A2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\b\u00105\u001a\u0004\u0018\u0001032\u0006\u0010D\u001a\u00020C2\u0006\u0010<\u001a\u00020-2\u0006\u0010E\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001aN\u0010M\u001a\u00020A2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\b\u00105\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010I\u001a\u00020A2\u0006\u0010J\u001a\u00020A2\u0006\u0010E\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010L\"\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P\"\u0014\u0010Q\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010R\"\u0014\u0010S\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010R\"\u0014\u0010T\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010R\"\u001a\u0010U\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bU\u0010V\u0012\u0004\bW\u0010X\"\u001a\u0010Y\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[\"\u0014\u0010\\\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010V\"\u001a\u0010]\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010[\"\u0014\u0010_\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010V\"\u001a\u0010`\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010V\u001a\u0004\ba\u0010[\"\u0014\u0010b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010V\"\u0014\u0010c\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010V\"\u0014\u0010d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010V\"\u0014\u0010e\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010V\"\u0014\u0010f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010V\"\u0014\u0010g\u001a\u00020A8\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010h\"\u0014\u0010i\u001a\u00020A8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010h\"\u0014\u0010j\u001a\u00020A8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010h\"\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m\"\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010m\"\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020-0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q\"\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020-0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010q\"\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020-0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010q\"\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020t0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010q\"\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020t0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010q\"\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y\"\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u007f²\u0006\f\u0010}\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010~\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m5110d2 = {"Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "inputField", "", "expanded", "Lkotlin/Function1;", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/SearchBarColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "SearchBar-Y92LkZI", "(Lr6/e;ZLr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "SearchBar", "DockedSearchBar-EQC0FA8", "(Lr6/e;ZLr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLr6/f;Landroidx/compose/runtime/Composer;II)V", "DockedSearchBar", "", "query", "onQueryChange", "onSearch", "active", "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lr6/c;Lr6/c;ZLr6/c;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Landroidx/compose/runtime/Composer;III)V", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lr6/c;Lr6/c;ZLr6/c;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animationProgress", "Landroidx/compose/runtime/MutableFloatState;", "finalBackProgress", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "firstBackEvent", "currentBackEvent", "SearchBarImpl-j1jLAyQ", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;III)V", "SearchBarImpl", "surface", "SearchBarLayout", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "progress", "calculatePredictiveBackMultiplier", "(Landroidx/activity/BackEventCompat;FF)F", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "minMargin", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "predictiveBackMultiplier", "calculatePredictiveBackOffsetX-rOvwMX4", "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I", "calculatePredictiveBackOffsetX", "height", "maxOffsetY", "calculatePredictiveBackOffsetY-dzo92Q0", "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I", "calculatePredictiveBackOffsetY", "Landroidx/compose/material3/TextFieldColors;", "UnspecifiedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "LayoutIdInputField", "Ljava/lang/String;", "LayoutIdSurface", "LayoutIdSearchContent", "SearchBarCornerRadius", "F", "getSearchBarCornerRadius$annotations", "()V", "DockedExpandedTableMinHeight", "getDockedExpandedTableMinHeight", "()F", "DockedExpandedTableMaxHeightScreenRatio", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarMaxWidth", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "SearchBarIconOffsetX", "SearchBarPredictiveBackMinScale", "SearchBarPredictiveBackMinMargin", "SearchBarPredictiveBackMaxOffsetXRatio", "SearchBarPredictiveBackMaxOffsetY", "AnimationEnterDurationMillis", "I", "AnimationExitDurationMillis", "AnimationDelayMillis", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationExitEasing", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationExitFloatSpec", "AnimationPredictiveBackExitFloatSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationEnterSizeSpec", "AnimationExitSizeSpec", "Landroidx/compose/animation/EnterTransition;", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "useFullScreenShape", "showContent", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1243:1\n1223#2,6:1244\n1223#2,6:1250\n1223#2,6:1256\n1223#2,6:1262\n1223#2,6:1268\n1223#2,6:1274\n1223#2,6:1280\n1223#2,6:1286\n1223#2,6:1293\n1223#2,6:1299\n1223#2,6:1305\n1223#2,6:1311\n1223#2,6:1317\n1223#2,6:1323\n77#3:1292\n78#4,6:1329\n85#4,4:1344\n89#4,2:1354\n78#4,6:1364\n85#4,4:1379\n89#4,2:1389\n93#4:1395\n78#4,6:1404\n85#4,4:1419\n89#4,2:1429\n93#4:1435\n78#4,6:1444\n85#4,4:1459\n89#4,2:1469\n93#4:1475\n93#4:1479\n368#5,9:1335\n377#5:1356\n368#5,9:1370\n377#5:1391\n378#5,2:1393\n368#5,9:1410\n377#5:1431\n378#5,2:1433\n368#5,9:1450\n377#5:1471\n378#5,2:1473\n378#5,2:1477\n4032#6,6:1348\n4032#6,6:1383\n4032#6,6:1423\n4032#6,6:1463\n71#7:1357\n68#7,6:1358\n74#7:1392\n78#7:1396\n71#7:1397\n68#7,6:1398\n74#7:1432\n78#7:1436\n71#7:1437\n68#7,6:1438\n74#7:1472\n78#7:1476\n81#8:1480\n81#8:1481\n71#9:1482\n148#10:1483\n148#10:1484\n148#10:1485\n148#10:1486\n148#10:1487\n148#10:1488\n148#10:1489\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n179#1:1244,6\n180#1:1250,6\n181#1:1256,6\n182#1:1262,6\n184#1:1268,6\n200#1:1274,6\n201#1:1280,6\n326#1:1286,6\n873#1:1293,6\n877#1:1299,6\n904#1:1305,6\n946#1:1311,6\n951#1:1317,6\n966#1:1323,6\n869#1:1292\n947#1:1329,6\n947#1:1344,4\n947#1:1354,2\n956#1:1364,6\n956#1:1379,4\n956#1:1389,2\n956#1:1395\n957#1:1404,6\n957#1:1419,4\n957#1:1429,2\n957#1:1435\n961#1:1444,6\n961#1:1459,4\n961#1:1469,2\n961#1:1475\n947#1:1479\n947#1:1335,9\n947#1:1356\n956#1:1370,9\n956#1:1391\n956#1:1393,2\n957#1:1410,9\n957#1:1431\n957#1:1433,2\n961#1:1450,9\n961#1:1471\n961#1:1473,2\n947#1:1477,2\n947#1:1348,6\n956#1:1383,6\n957#1:1423,6\n961#1:1463,6\n956#1:1357\n956#1:1358,6\n956#1:1392\n956#1:1396\n957#1:1397\n957#1:1398,6\n957#1:1432\n957#1:1436\n961#1:1437\n961#1:1438,6\n961#1:1472\n961#1:1476\n873#1:1480\n904#1:1481\n1191#1:1482\n1192#1:1483\n1194#1:1484\n1195#1:1485\n1196#1:1486\n1198#1:1487\n1200#1:1488\n1202#1:1489\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;

    @NotNull
    private static final CubicBezierEasing AnimationEnterEasing;

    @NotNull
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;

    @NotNull
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;

    @NotNull
    private static final CubicBezierEasing AnimationExitEasing;

    @NotNull
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;

    @NotNull
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;

    @NotNull
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;

    @NotNull
    private static final EnterTransition DockedEnterTransition;

    @NotNull
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final float DockedExpandedTableMinHeight;

    @NotNull
    private static final String LayoutIdInputField = "InputField";

    @NotNull
    private static final String LayoutIdSearchContent = "Content";

    @NotNull
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarCornerRadius;
    private static final float SearchBarIconOffsetX;
    private static final float SearchBarMaxWidth;
    private static final float SearchBarMinWidth;
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMaxOffsetY;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;

    @NotNull
    private static final TextFieldColors UnspecifiedTextFieldColors;

    static {
        Color.Companion companion = Color.INSTANCE;
        UnspecifiedTextFieldColors = new TextFieldColors(companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), new TextSelectionColors(companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), null), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), companion.m10718getUnspecified0d7_KjU(), null);
        SearchBarCornerRadius = C2331Dp.m13305constructorimpl(SearchBarDefaults.INSTANCE.m8824getInputFieldHeightD9Ej5fM() / 2);
        DockedExpandedTableMinHeight = C2331Dp.m13305constructorimpl(240);
        SearchBarMinWidth = C2331Dp.m13305constructorimpl(360);
        SearchBarMaxWidth = C2331Dp.m13305constructorimpl(720);
        float f = 8;
        SearchBarVerticalPadding = C2331Dp.m13305constructorimpl(f);
        SearchBarIconOffsetX = C2331Dp.m13305constructorimpl(4);
        SearchBarPredictiveBackMinMargin = C2331Dp.m13305constructorimpl(f);
        SearchBarPredictiveBackMaxOffsetY = C2331Dp.m13305constructorimpl(24);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tweenSpecTween;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tweenSpecTween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tweenSpecTween3;
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tweenSpecTween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8829DockedSearchBarEQC0FA8(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r26, final boolean r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r30, @org.jetbrains.annotations.Nullable androidx.compose.material3.SearchBarColors r31, float r32, float r33, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m8829DockedSearchBarEQC0FA8(r6.e, boolean, r6.c, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @kotlin.ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    @androidx.compose.runtime.Composable
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8830DockedSearchBareWTbjVg(@org.jetbrains.annotations.NotNull final java.lang.String r34, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r36, final boolean r37, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r38, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r39, boolean r40, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r41, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r42, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r43, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r44, @org.jetbrains.annotations.Nullable androidx.compose.material3.SearchBarColors r45, float r46, float r47, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r48, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r49, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m8830DockedSearchBareWTbjVg(java.lang.String, r6.c, r6.c, boolean, r6.c, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.interaction.MutableInteractionSource, r6.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @kotlin.ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    @androidx.compose.runtime.Composable
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8831SearchBarWuY5d9Q(@org.jetbrains.annotations.NotNull final java.lang.String r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r36, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r37, final boolean r38, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r39, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r40, boolean r41, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r42, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r43, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r44, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r45, @org.jetbrains.annotations.Nullable androidx.compose.material3.SearchBarColors r46, float r47, float r48, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r49, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r50, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r51, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m8831SearchBarWuY5d9Q(java.lang.String, r6.c, r6.c, boolean, r6.c, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, r6.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8832SearchBarY92LkZI(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r29, final boolean r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r32, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r33, @org.jetbrains.annotations.Nullable androidx.compose.material3.SearchBarColors r34, float r35, float r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r37, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r38, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m8832SearchBarY92LkZI(r6.e, boolean, r6.c, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8833SearchBarImplj1jLAyQ(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r27, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableFloatState r28, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableState<android.view.BackEventCompat> r29, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableState<android.view.BackEventCompat> r30, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r32, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r33, @org.jetbrains.annotations.Nullable androidx.compose.material3.SearchBarColors r34, float r35, float r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r37, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r38, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r39, final int r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m8833SearchBarImplj1jLAyQ(androidx.compose.animation.core.Animatable, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, Composer composer, final int i) {
        int i8;
        final MutableFloatState mutableFloatState2;
        MutableState<BackEventCompat> mutableState3;
        MutableState<BackEventCompat> mutableState4;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(70029564);
        if ((i & 6) == 0) {
            i8 = ((i & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            mutableFloatState2 = mutableFloatState;
            i8 |= composerStartRestartGroup.changed(mutableFloatState2) ? 32 : 16;
        } else {
            mutableFloatState2 = mutableFloatState;
        }
        if ((i & 384) == 0) {
            mutableState3 = mutableState;
            i8 |= composerStartRestartGroup.changed(mutableState3) ? 256 : 128;
        } else {
            mutableState3 = mutableState;
        }
        if ((i & 3072) == 0) {
            mutableState4 = mutableState2;
            i8 |= composerStartRestartGroup.changed(mutableState4) ? 2048 : 1024;
        } else {
            mutableState4 = mutableState2;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i8) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70029564, i8, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableWindowInsets(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            boolean z8 = (i8 & 458752) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((WindowInsets) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull WindowInsets windowInsets2) {
                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (InterfaceC6471c) objRememberedValue2), windowInsets);
            boolean z9 = ((i8 & 7168) == 2048) | ((i8 & 14) == 4 || ((i8 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable))) | ((i8 & 112) == 32) | ((i8 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue3 == companion.getEmpty()) {
                final MutableState<BackEventCompat> mutableState5 = mutableState3;
                final MutableState<BackEventCompat> mutableState6 = mutableState4;
                i9 = i8;
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, final long j7) {
                        Measurable measurable;
                        final Placeable placeableMo12033measureBRTryo0;
                        int iM13257getMaxHeightimpl;
                        MeasureScope measureScope2 = measureScope;
                        long j8 = j7;
                        final float fFloatValue = animatable.getValue().floatValue();
                        int size = list.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Measurable measurable2 = list.get(i10);
                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                                int size2 = list.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Measurable measurable3 = list.get(i11);
                                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                                        int size3 = list.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i12);
                                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                                break;
                                            }
                                            i12++;
                                        }
                                        Measurable measurable4 = measurable;
                                        final int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding()) + mutableWindowInsets.getTop(measureScope2);
                                        int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(j8, measurable2.maxIntrinsicWidth(Constraints.m13257getMaxHeightimpl(j8)));
                                        int iM13274constrainHeightK40F9xA = ConstraintsKt.m13274constrainHeightK40F9xA(j8, measurable2.minIntrinsicHeight(Constraints.m13258getMaxWidthimpl(j8)));
                                        int iM6241q = AbstractC6600a.m6241q(Constraints.m13258getMaxWidthimpl(j8) * 0.9f);
                                        int iM6241q2 = AbstractC6600a.m6241q(Constraints.m13257getMaxHeightimpl(j8) * 0.9f);
                                        final float fCalculatePredictiveBackMultiplier = SearchBar_androidKt.calculatePredictiveBackMultiplier(mutableState6.getValue(), fFloatValue, mutableFloatState2.getFloatValue());
                                        int iLerp = MathHelpersKt.lerp(iM13275constrainWidthK40F9xA, iM6241q, fCalculatePredictiveBackMultiplier);
                                        int i13 = iMo6897roundToPx0680j_4 + iM13274constrainHeightK40F9xA;
                                        int iLerp2 = MathHelpersKt.lerp(i13, iM6241q2, fCalculatePredictiveBackMultiplier);
                                        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j8);
                                        int iM13257getMaxHeightimpl2 = Constraints.m13257getMaxHeightimpl(j8);
                                        int iLerp3 = MathHelpersKt.lerp(iLerp, iM13258getMaxWidthimpl, fFloatValue);
                                        final int iLerp4 = MathHelpersKt.lerp(iLerp2, iM13257getMaxHeightimpl2, fFloatValue);
                                        final int iLerp5 = MathHelpersKt.lerp(iMo6897roundToPx0680j_4, 0, fFloatValue);
                                        final int iLerp6 = MathHelpersKt.lerp(0, iMo6897roundToPx0680j_42, fFloatValue);
                                        final Placeable placeableMo12033measureBRTryo02 = measurable2.mo12033measureBRTryo0(ConstraintsKt.Constraints(iLerp3, iM13258getMaxWidthimpl, iM13274constrainHeightK40F9xA, iM13274constrainHeightK40F9xA));
                                        int width = placeableMo12033measureBRTryo02.getWidth();
                                        final Placeable placeableMo12033measureBRTryo03 = measurable3.mo12033measureBRTryo0(Constraints.INSTANCE.m13268fixedJhjzzOo(width, iLerp4 - iLerp5));
                                        if (measurable4 != null) {
                                            if (Constraints.m13253getHasBoundedHeightimpl(j7)) {
                                                iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7) - (i13 + iMo6897roundToPx0680j_42);
                                                if (iM13257getMaxHeightimpl < 0) {
                                                    iM13257getMaxHeightimpl = 0;
                                                }
                                            } else {
                                                iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
                                            }
                                            placeableMo12033measureBRTryo0 = measurable4.mo12033measureBRTryo0(ConstraintsKt.Constraints(width, width, 0, iM13257getMaxHeightimpl));
                                        } else {
                                            placeableMo12033measureBRTryo0 = null;
                                        }
                                        final MutableState<BackEventCompat> mutableState7 = mutableState6;
                                        final MutableState<BackEventCompat> mutableState8 = mutableState5;
                                        return MeasureScope.layout$default(measureScope, width, iLerp4, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // p152r6.InterfaceC6471c
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((Placeable.PlacementScope) obj);
                                                return C5443s.f8405a;
                                            }

                                            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                                int iMo6897roundToPx0680j_43 = measureScope.mo6897roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMinMargin);
                                                int iM8836calculatePredictiveBackOffsetXrOvwMX4 = SearchBar_androidKt.m8836calculatePredictiveBackOffsetXrOvwMX4(j7, iMo6897roundToPx0680j_43, mutableState7.getValue(), measureScope.getLayoutDirection(), fFloatValue, fCalculatePredictiveBackMultiplier);
                                                int iM8837calculatePredictiveBackOffsetYdzo92Q0 = SearchBar_androidKt.m8837calculatePredictiveBackOffsetYdzo92Q0(j7, iMo6897roundToPx0680j_43, mutableState7.getValue(), mutableState8.getValue(), iLerp4, measureScope.mo6897roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMaxOffsetY), fCalculatePredictiveBackMultiplier);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo03, iM8836calculatePredictiveBackOffsetXrOvwMX4, iM8837calculatePredictiveBackOffsetYdzo92Q0 + iLerp5, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo02, iM8836calculatePredictiveBackOffsetXrOvwMX4, iM8837calculatePredictiveBackOffsetYdzo92Q0 + iMo6897roundToPx0680j_4, 0.0f, 4, null);
                                                Placeable placeable = placeableMo12033measureBRTryo0;
                                                if (placeable != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iM8836calculatePredictiveBackOffsetXrOvwMX4, placeableMo12033measureBRTryo02.getHeight() + iM8837calculatePredictiveBackOffsetYdzo92Q0 + iMo6897roundToPx0680j_4 + iLerp6, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    i11++;
                                    measureScope2 = measureScope;
                                    j8 = j7;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i10++;
                            measureScope2 = measureScope;
                            j8 = j7;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicy);
                objRememberedValue3 = measurePolicy;
            } else {
                i9 = i8;
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue3;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierConsumeWindowInsets);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicy2, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion3, LayoutIdSurface);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC6469a constructor2 = companion2.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC6473e2.invoke(composerStartRestartGroup, Integer.valueOf((i9 >> 21) & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion3, LayoutIdInputField);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            InterfaceC6469a constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            interfaceC6473e.invoke(composerStartRestartGroup, Integer.valueOf((i9 >> 18) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-1107184481);
            if (interfaceC6473e3 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion3, LayoutIdSearchContent);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                InterfaceC6469a constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM10109constructorimpl4, currentCompositionLocalMap4);
                if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r4);
                }
                Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                interfaceC6473e3.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBarLayout.4
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
                    SearchBar_androidKt.SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, interfaceC6473e, interfaceC6473e2, interfaceC6473e3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f, float f7) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f7)) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        return f / f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m8836calculatePredictiveBackOffsetXrOvwMX4(long j7, int i, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f, float f7) {
        if (backEventCompat == null || f7 == 0.0f) {
            return 0;
        }
        return AbstractC6600a.m6241q((1 - f) * ((Constraints.m13258getMaxWidthimpl(j7) * SearchBarPredictiveBackMaxOffsetXRatio) - i) * f7 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m8837calculatePredictiveBackOffsetYdzo92Q0(long j7, int i, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i8, int i9, float f) {
        if (backEventCompat2 == null || backEventCompat == null || f == 0.0f) {
            return 0;
        }
        int iMin = Math.min(Math.max(0, ((Constraints.m13257getMaxHeightimpl(j7) - i8) / 2) - i), i9);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float fAbs = Math.abs(touchY) / Constraints.m13257getMaxHeightimpl(j7);
        return AbstractC6600a.m6241q(MathHelpersKt.lerp(0, iMin, fAbs) * f * Math.signum(touchY));
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }
}
