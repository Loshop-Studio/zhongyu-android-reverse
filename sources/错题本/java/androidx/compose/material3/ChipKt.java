package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
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

@Metadata(m5109d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aª\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a¨\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001aª\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u0016\u001a¨\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a²\u0001\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a²\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001f\u0010\u001e\u001aÉ\u0001\u0010!\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0093\u0001\u0010$\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b$\u0010%\u001a\u0091\u0001\u0010$\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b$\u0010&\u001a\u0093\u0001\u0010'\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b'\u0010%\u001a\u0091\u0001\u0010'\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010&\u001a»\u0001\u00102\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÐ\u0001\u00105\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010)\u001a\u00020(2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u0094\u0001\u0010:\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a-\u0010>\u001a\u00020.2\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010<\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\"\u0014\u0010D\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010C\"\u0014\u0010E\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010C\"\u0014\u0010G\u001a\u00020F8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020F8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010H\"\u0014\u0010J\u001a\u00020F8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010H\"\u0018\u0010N\u001a\u00020\r*\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, m5110d2 = {"Lkotlin/Function0;", "Ld6/s;", "onClick", "Landroidx/compose/runtime/Composable;", ChipKt.LabelLayoutId, "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", ChipKt.LeadingIconLayoutId, ChipKt.TrailingIconLayoutId, "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/ChipColors;", "colors", "Landroidx/compose/material3/ChipElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "AssistChip", "(Lr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "(Lr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedAssistChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "FilterChip", "(ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedFilterChip", "avatar", "InputChip", "(ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "icon", "SuggestionChip", "(Lr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Lr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ElevatedSuggestionChip", "Landroidx/compose/ui/text/TextStyle;", "labelTextStyle", "Landroidx/compose/ui/graphics/Color;", "labelColor", "Landroidx/compose/ui/unit/Dp;", "minHeight", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lr6/a;ZLr6/e;Landroidx/compose/ui/text/TextStyle;JLr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Chip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lr6/a;ZLr6/e;Landroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SelectableChip", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lr6/e;Landroidx/compose/ui/text/TextStyle;JLr6/e;Lr6/e;Lr6/e;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ChipContent", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "inputChipPadding", "(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;", "HorizontalElementsPadding", "F", "AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "SuggestionChipPadding", "", "LeadingIconLayoutId", "Ljava/lang/String;", "LabelLayoutId", "TrailingIconLayoutId", "Landroidx/compose/material3/ColorScheme;", "getDefaultSuggestionChipColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultSuggestionChipColors", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1223#2,6:2788\n1223#2,6:2794\n1223#2,6:2800\n1223#2,6:2806\n1223#2,6:2812\n1223#2,6:2819\n148#3:2818\n148#3:2825\n148#3:2827\n148#3:2828\n148#3:2829\n1#4:2826\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n*L\n218#1:2788,6\n380#1:2794,6\n829#1:2800,6\n985#1:2806,6\n1966#1:2812,6\n2012#1:2819,6\n1973#1:2818\n2021#1:2825\n2767#1:2827\n2768#1:2828\n2773#1:2829\n*E\n"})
/* loaded from: classes.dex */
public final class ChipKt {

    @NotNull
    private static final PaddingValues AssistChipPadding;

    @NotNull
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;

    @NotNull
    private static final String LabelLayoutId = "label";

    @NotNull
    private static final String LeadingIconLayoutId = "leadingIcon";

    @NotNull
    private static final PaddingValues SuggestionChipPadding;

    @NotNull
    private static final String TrailingIconLayoutId = "trailingIcon";

    static {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(8);
        HorizontalElementsPadding = fM13305constructorimpl;
        AssistChipPadding = PaddingKt.m7257PaddingValuesYgX7TsA$default(fM13305constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m7257PaddingValuesYgX7TsA$default(fM13305constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m7257PaddingValuesYgX7TsA$default(fM13305constructorimpl, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AssistChip(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r37, boolean r38, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r39, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r40, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r41, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipColors r42, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipElevation r43, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r44, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Chip-nkUnTEs, reason: not valid java name */
    public static final void m8259ChipnkUnTEs(final Modifier modifier, final InterfaceC6469a interfaceC6469a, final boolean z8, final InterfaceC6473e interfaceC6473e, final TextStyle textStyle, final long j7, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i8) {
        int i9;
        InterfaceC6473e interfaceC6473e4;
        int i10;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1400504719);
        if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(z8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6473e4 = interfaceC6473e;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? 2048 : 1024;
        } else {
            interfaceC6473e4 = interfaceC6473e;
        }
        if ((i & 24576) == 0) {
            i9 |= composerStartRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 0) {
            i9 |= composerStartRestartGroup.changed(j7) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changed(shape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(chipElevation) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        int i11 = i10;
        if ((i9 & 306783379) == 306783378 && (i11 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i9, i11, "androidx.compose.material3.Chip (Chip.kt:1963)");
            }
            composerStartRestartGroup.startReplaceGroup(1985614987);
            if (mutableInteractionSource2 == null) {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC6471c() { // from class: androidx.compose.material3.ChipKt$Chip$1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12532getButtono7Vup1c());
                }
            }, 1, null);
            long jM8240containerColorvNxB06k$material3_release = chipColors.m8240containerColorvNxB06k$material3_release(z8);
            composerStartRestartGroup.startReplaceGroup(1985624506);
            State<C2331Dp> stateShadowElevation$material3_release = chipElevation != null ? chipElevation.shadowElevation$material3_release(z8, mutableInteractionSource2, composerStartRestartGroup, ((i9 >> 6) & 14) | ((i11 << 6) & 896)) : null;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            int i12 = i9;
            final InterfaceC6473e interfaceC6473e5 = interfaceC6473e4;
            SurfaceKt.m8958Surfaceo_FOJdg(interfaceC6469a, modifierSemantics$default, z8, shape, jM8240containerColorvNxB06k$material3_release, 0L, 0.0f, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m13319unboximpl() : C2331Dp.m13305constructorimpl(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1985962652, true, new InterfaceC6473e() { // from class: androidx.compose.material3.ChipKt$Chip$2
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
                public final void invoke(@Nullable Composer composer3, int i13) {
                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1985962652, i13, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1976)");
                    }
                    ChipKt.m8260ChipContentfe0OD_I(interfaceC6473e5, textStyle, j7, interfaceC6473e2, null, interfaceC6473e3, chipColors.m8251leadingIconContentColorvNxB06k$material3_release(z8), chipColors.m8252trailingIconContentColorvNxB06k$material3_release(z8), f, paddingValues, composer3, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, ((i12 >> 15) & 7168) | ((i12 >> 3) & 14) | (i12 & 896) | ((i11 << 21) & 234881024), 6, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ChipKt$Chip$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i13) {
                    ChipKt.m8259ChipnkUnTEs(modifier, interfaceC6469a, z8, interfaceC6473e, textStyle, j7, interfaceC6473e2, interfaceC6473e3, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    public static final void m8260ChipContentfe0OD_I(final InterfaceC6473e interfaceC6473e, final TextStyle textStyle, final long j7, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, final InterfaceC6473e interfaceC6473e4, final long j8, final long j9, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i8;
        InterfaceC6473e interfaceC6473e5;
        InterfaceC6473e interfaceC6473e6;
        InterfaceC6473e interfaceC6473e7;
        long j10;
        long j11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782878228);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6473e) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6473e5 = interfaceC6473e2;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 2048 : 1024;
        } else {
            interfaceC6473e5 = interfaceC6473e2;
        }
        if ((i & 24576) == 0) {
            interfaceC6473e6 = interfaceC6473e3;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e6) ? 16384 : 8192;
        } else {
            interfaceC6473e6 = interfaceC6473e3;
        }
        if ((196608 & i) == 0) {
            interfaceC6473e7 = interfaceC6473e4;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e7) ? 131072 : 65536;
        } else {
            interfaceC6473e7 = interfaceC6473e4;
        }
        if ((1572864 & i) == 0) {
            j10 = j8;
            i8 |= composerStartRestartGroup.changed(j10) ? 1048576 : 524288;
        } else {
            j10 = j8;
        }
        if ((12582912 & i) == 0) {
            j11 = j9;
            i8 |= composerStartRestartGroup.changed(j11) ? 8388608 : 4194304;
        } else {
            j11 = j9;
        }
        if ((100663296 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i8 |= composerStartRestartGroup.changed(paddingValues) ? 536870912 : 268435456;
        }
        if ((i8 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i8, -1, "androidx.compose.material3.ChipContent (Chip.kt:2051)");
            }
            final InterfaceC6473e interfaceC6473e8 = interfaceC6473e5;
            final InterfaceC6473e interfaceC6473e9 = interfaceC6473e6;
            final InterfaceC6473e interfaceC6473e10 = interfaceC6473e7;
            final long j12 = j10;
            final long j13 = j11;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(j7)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.rememberComposableLambda(1748799148, true, new InterfaceC6473e() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
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
                        ComposerKt.traceEventStart(1748799148, i9, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2056)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m7294defaultMinSizeVpY3zN4$default(companion, 0.0f, f, 1, null), paddingValues);
                    C15671 c15671 = new MeasurePolicy() { // from class: androidx.compose.material3.ChipKt$ChipContent$1.1
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        @NotNull
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j14) {
                            Measurable measurable;
                            Measurable measurable2;
                            int size = list.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    measurable = null;
                                    break;
                                }
                                measurable = list.get(i10);
                                if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                                    break;
                                }
                                i10++;
                            }
                            Measurable measurable3 = measurable;
                            final Placeable placeableMo12033measureBRTryo0 = measurable3 != null ? measurable3.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j14, 0, 0, 0, 0, 10, null)) : null;
                            final int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo0);
                            final int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo0);
                            int size2 = list.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    measurable2 = null;
                                    break;
                                }
                                measurable2 = list.get(i11);
                                if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                                    break;
                                }
                                i11++;
                            }
                            Measurable measurable4 = measurable2;
                            Placeable placeableMo12033measureBRTryo02 = measurable4 != null ? measurable4.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j14, 0, 0, 0, 0, 10, null)) : null;
                            int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo02);
                            final int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo02);
                            int size3 = list.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                Measurable measurable5 = list.get(i12);
                                if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                    final Placeable placeableMo12033measureBRTryo03 = measurable5.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(j14, -(iWidthOrZero + iWidthOrZero2), 0, 2, null));
                                    int width = placeableMo12033measureBRTryo03.getWidth() + iWidthOrZero + iWidthOrZero2;
                                    final int iMax = Math.max(iHeightOrZero, Math.max(placeableMo12033measureBRTryo03.getHeight(), iHeightOrZero2));
                                    final Placeable placeable = placeableMo12033measureBRTryo02;
                                    return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC6471c() { // from class: androidx.compose.material3.ChipKt.ChipContent.1.1.1
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
                                            Placeable.PlacementScope placementScope2;
                                            Placeable placeable2 = placeableMo12033measureBRTryo0;
                                            if (placeable2 != null) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, Alignment.INSTANCE.getCenterVertically().align(iHeightOrZero, iMax), 0.0f, 4, null);
                                                placementScope2 = placementScope;
                                            } else {
                                                placementScope2 = placementScope;
                                            }
                                            Placeable.PlacementScope.placeRelative$default(placementScope2, placeableMo12033measureBRTryo03, iWidthOrZero, 0, 0.0f, 4, null);
                                            Placeable placeable3 = placeable;
                                            if (placeable3 != null) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable3, placeableMo12033measureBRTryo03.getWidth() + iWidthOrZero, Alignment.INSTANCE.getCenterVertically().align(iHeightOrZero2, iMax), 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    };
                    InterfaceC6473e interfaceC6473e11 = interfaceC6473e9;
                    InterfaceC6473e interfaceC6473e12 = interfaceC6473e8;
                    InterfaceC6473e interfaceC6473e13 = interfaceC6473e10;
                    long j14 = j12;
                    InterfaceC6473e interfaceC6473e14 = interfaceC6473e;
                    long j15 = j13;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
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
                    Updater.m10116setimpl(composerM10109constructorimpl, c15671, companion2.getSetMeasurePolicy());
                    Updater.m10116setimpl(composerM10109constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    InterfaceC6473e setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    composer2.startReplaceGroup(-1293169671);
                    if (interfaceC6473e11 != null || interfaceC6473e12 != null) {
                        Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "leadingIcon");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierLayoutId);
                        InterfaceC6469a constructor2 = companion2.getConstructor();
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
                        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                        if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (interfaceC6473e11 != null) {
                            composer2.startReplaceGroup(832680499);
                            interfaceC6473e11.invoke(composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (interfaceC6473e12 != null) {
                            composer2.startReplaceGroup(832788565);
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(j14)), interfaceC6473e12, composer2, ProvidedValue.$stable);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(833040347);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(LayoutIdKt.layoutId(companion, "label"), ChipKt.HorizontalElementsPadding, C2331Dp.m13305constructorimpl(0));
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM7263paddingVpY3zN4);
                    InterfaceC6469a constructor3 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composer2);
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy, composerM10109constructorimpl3, currentCompositionLocalMap3);
                    if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    interfaceC6473e14.invoke(composer2, 0);
                    composer2.endNode();
                    composer2.startReplaceGroup(-1293135324);
                    if (interfaceC6473e13 != null) {
                        Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "trailingIcon");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierLayoutId2);
                        InterfaceC6469a constructor4 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl4, currentCompositionLocalMap4);
                        if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r3);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(j15)), interfaceC6473e13, composer2, ProvidedValue.$stable);
                        composer2.endNode();
                    }
                    if (AbstractC0584a.m923x(composer2)) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
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
                    ChipKt.m8260ChipContentfe0OD_I(interfaceC6473e, textStyle, j7, interfaceC6473e2, interfaceC6473e3, interfaceC6473e4, j8, j9, f, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedAssistChip(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r37, boolean r38, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r39, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r40, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r41, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipColors r42, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipElevation r43, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r44, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedFilterChip(final boolean r36, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r37, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r38, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r39, boolean r40, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r41, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r42, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r43, @org.jetbrains.annotations.Nullable androidx.compose.material3.SelectableChipColors r44, @org.jetbrains.annotations.Nullable androidx.compose.material3.SelectableChipElevation r45, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r46, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r47, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedSuggestionChip(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r32, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r33, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r34, boolean r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r37, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipColors r38, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipElevation r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(final boolean r41, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r42, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r43, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r44, boolean r45, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r46, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r47, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r48, @org.jetbrains.annotations.Nullable androidx.compose.material3.SelectableChipColors r49, @org.jetbrains.annotations.Nullable androidx.compose.material3.SelectableChipElevation r50, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r51, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InputChip(final boolean r42, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r43, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r44, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r45, boolean r46, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r47, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r48, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r49, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r50, @org.jetbrains.annotations.Nullable androidx.compose.material3.SelectableChipColors r51, @org.jetbrains.annotations.Nullable androidx.compose.material3.SelectableChipElevation r52, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r53, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r54, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    public static final void m8261SelectableChipu0RnIRE(final boolean z8, final Modifier modifier, final InterfaceC6469a interfaceC6469a, final boolean z9, final InterfaceC6473e interfaceC6473e, final TextStyle textStyle, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, final InterfaceC6473e interfaceC6473e4, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i8) {
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(402951308);
        if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(z9) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 0) {
            i9 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(selectableChipColors) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i8 & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 0) {
            i10 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        int i11 = i10;
        if ((i9 & 306783379) == 306783378 && (74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i9, i11, "androidx.compose.material3.SelectableChip (Chip.kt:2009)");
            }
            composerStartRestartGroup.startReplaceGroup(2072749057);
            if (mutableInteractionSource == null) {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i12 = i9;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC6471c() { // from class: androidx.compose.material3.ChipKt$SelectableChip$1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12534getCheckboxo7Vup1c());
                }
            }, 1, null);
            long jM8866containerColorWaAFU9c$material3_release = selectableChipColors.m8866containerColorWaAFU9c$material3_release(z9, z8);
            composerStartRestartGroup.startReplaceGroup(2072762384);
            State<C2331Dp> stateShadowElevation$material3_release = selectableChipElevation != null ? selectableChipElevation.shadowElevation$material3_release(z9, mutableInteractionSource2, composerStartRestartGroup, ((i12 >> 9) & 14) | ((i11 << 3) & 896)) : null;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8956Surfaced85dljk(z8, interfaceC6469a, modifierSemantics$default, z9, shape, jM8866containerColorWaAFU9c$material3_release, 0L, 0.0f, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m13319unboximpl() : C2331Dp.m13305constructorimpl(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-577614814, true, new InterfaceC6473e() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
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
                public final void invoke(@Nullable Composer composer3, int i13) {
                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-577614814, i13, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2024)");
                    }
                    ChipKt.m8260ChipContentfe0OD_I(interfaceC6473e, textStyle, selectableChipColors.m8868labelColorWaAFU9c$material3_release(z9, z8), interfaceC6473e2, interfaceC6473e3, interfaceC6473e4, selectableChipColors.m8869leadingIconContentColorWaAFU9c$material3_release(z9, z8), selectableChipColors.m8870trailingIconContentColorWaAFU9c$material3_release(z9, z8), f, paddingValues, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, (i12 & 14) | ((i12 >> 3) & 112) | (i12 & 7168) | ((i12 >> 15) & 57344) | ((i11 << 21) & 1879048192), 48, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ChipKt$SelectableChip$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i13) {
                    ChipKt.m8261SelectableChipu0RnIRE(z8, modifier, interfaceC6469a, z9, interfaceC6473e, textStyle, interfaceC6473e2, interfaceC6473e3, interfaceC6473e4, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SuggestionChip(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r32, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r33, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r34, boolean r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r37, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipColors r38, @org.jetbrains.annotations.Nullable androidx.compose.material3.ChipElevation r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    public static final ChipColors getDefaultSuggestionChipColors(@NotNull ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached = colorScheme.getDefaultSuggestionChipColorsCached();
        if (defaultSuggestionChipColorsCached != null) {
            return defaultSuggestionChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM10717getTransparent0d7_KjU = companion.m10717getTransparent0d7_KjU();
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(jM10717getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor()), companion.m10718getUnspecified0d7_KjU(), companion.m10717getTransparent0d7_KjU(), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), suggestionChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLeadingIconColor()), suggestionChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m10718getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    private static final PaddingValues inputChipPadding(boolean z8, boolean z9, boolean z10) {
        return PaddingKt.m7259PaddingValuesa9UjIt4$default(C2331Dp.m13305constructorimpl((z8 || !z9) ? 4 : 8), 0.0f, C2331Dp.m13305constructorimpl(z10 ? 8 : 4), 0.0f, 10, null);
    }

    public static /* synthetic */ PaddingValues inputChipPadding$default(boolean z8, boolean z9, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        if ((i & 2) != 0) {
            z9 = false;
        }
        if ((i & 4) != 0) {
            z10 = false;
        }
        return inputChipPadding(z8, z9, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @kotlin.ReplaceWith(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedAssistChip(final p152r6.InterfaceC6469a r35, final p152r6.InterfaceC6473e r36, androidx.compose.p011ui.Modifier r37, boolean r38, p152r6.InterfaceC6473e r39, p152r6.InterfaceC6473e r40, androidx.compose.p011ui.graphics.Shape r41, androidx.compose.material3.ChipColors r42, androidx.compose.material3.ChipElevation r43, androidx.compose.material3.ChipBorder r44, androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @kotlin.ReplaceWith(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(final p152r6.InterfaceC6469a r32, final p152r6.InterfaceC6473e r33, androidx.compose.p011ui.Modifier r34, boolean r35, p152r6.InterfaceC6473e r36, androidx.compose.p011ui.graphics.Shape r37, androidx.compose.material3.ChipColors r38, androidx.compose.material3.ChipElevation r39, androidx.compose.material3.ChipBorder r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @kotlin.ReplaceWith(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void AssistChip(final p152r6.InterfaceC6469a r35, final p152r6.InterfaceC6473e r36, androidx.compose.p011ui.Modifier r37, boolean r38, p152r6.InterfaceC6473e r39, p152r6.InterfaceC6473e r40, androidx.compose.p011ui.graphics.Shape r41, androidx.compose.material3.ChipColors r42, androidx.compose.material3.ChipElevation r43, androidx.compose.material3.ChipBorder r44, androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010a  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @kotlin.ReplaceWith(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void SuggestionChip(final p152r6.InterfaceC6469a r32, final p152r6.InterfaceC6473e r33, androidx.compose.p011ui.Modifier r34, boolean r35, p152r6.InterfaceC6473e r36, androidx.compose.p011ui.graphics.Shape r37, androidx.compose.material3.ChipColors r38, androidx.compose.material3.ChipElevation r39, androidx.compose.material3.ChipBorder r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
