package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Immutable
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100JÀ\u0003\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00108\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r04H\u0000¢\u0006\u0004\b6\u00107J-\u0010?\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J-\u0010A\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010>J-\u0010C\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010>J-\u0010E\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010>J-\u0010G\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010>J-\u0010I\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010>J-\u0010K\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010>J-\u0010M\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010>J-\u0010O\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010>J-\u0010Q\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010>J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010;\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010U\u001a\u0002092\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010Z\u001a\u0004\b[\u0010\\R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010Z\u001a\u0004\b]\u0010\\R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010Z\u001a\u0004\b^\u0010\\R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010Z\u001a\u0004\b_\u0010\\R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010Z\u001a\u0004\b`\u0010\\R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\ba\u0010\\R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\bb\u0010\\R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\bc\u0010\\R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\bd\u0010\\R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\be\u0010\\R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010f\u001a\u0004\bg\u0010hR\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\bi\u0010\\R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\bj\u0010\\R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\bk\u0010\\R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010Z\u001a\u0004\bl\u0010\\R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\bm\u0010\\R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\bn\u0010\\R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\bo\u0010\\R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\bp\u0010\\R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\bq\u0010\\R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010Z\u001a\u0004\br\u0010\\R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\bs\u0010\\R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\bt\u0010\\R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\bu\u0010\\R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\bv\u0010\\R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010Z\u001a\u0004\bw\u0010\\R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010Z\u001a\u0004\bx\u0010\\R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010Z\u001a\u0004\by\u0010\\R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010Z\u001a\u0004\bz\u0010\\R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b{\u0010\\R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010Z\u001a\u0004\b|\u0010\\R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010Z\u001a\u0004\b}\u0010\\R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010Z\u001a\u0004\b~\u0010\\R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010Z\u001a\u0004\b\u007f\u0010\\R\u001e\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b&\u0010Z\u001a\u0005\b\u0080\u0001\u0010\\R\u001e\u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b'\u0010Z\u001a\u0005\b\u0081\u0001\u0010\\R\u001e\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b(\u0010Z\u001a\u0005\b\u0082\u0001\u0010\\R\u001e\u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b)\u0010Z\u001a\u0005\b\u0083\u0001\u0010\\R\u001e\u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b*\u0010Z\u001a\u0005\b\u0084\u0001\u0010\\R\u001e\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b+\u0010Z\u001a\u0005\b\u0085\u0001\u0010\\R\u001e\u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b,\u0010Z\u001a\u0005\b\u0086\u0001\u0010\\R\u001e\u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b-\u0010Z\u001a\u0005\b\u0087\u0001\u0010\\R\u001e\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b.\u0010Z\u001a\u0005\b\u0088\u0001\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, m5110d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/e;)V", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3_release", "(Landroidx/compose/foundation/text/selection/TextSelectionColors;Lr6/a;)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "takeOrElse", "", "enabled", "isError", "focused", "leadingIconColor-XeAY9LY$material3_release", "(ZZZ)J", "leadingIconColor", "trailingIconColor-XeAY9LY$material3_release", "trailingIconColor", "indicatorColor-XeAY9LY$material3_release", "indicatorColor", "containerColor-XeAY9LY$material3_release", "containerColor", "placeholderColor-XeAY9LY$material3_release", "placeholderColor", "labelColor-XeAY9LY$material3_release", "labelColor", "textColor-XeAY9LY$material3_release", "textColor", "supportingTextColor-XeAY9LY$material3_release", "supportingTextColor", "prefixColor-XeAY9LY$material3_release", "prefixColor", "suffixColor-XeAY9LY$material3_release", "suffixColor", "cursorColor-vNxB06k$material3_release", "(Z)J", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getFocusedTextColor-0d7_KjU", "()J", "getUnfocusedTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getUnfocusedContainerColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getCursorColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "getFocusedLabelColor-0d7_KjU", "getUnfocusedLabelColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getErrorLabelColor-0d7_KjU", "getFocusedPlaceholderColor-0d7_KjU", "getUnfocusedPlaceholderColor-0d7_KjU", "getDisabledPlaceholderColor-0d7_KjU", "getErrorPlaceholderColor-0d7_KjU", "getFocusedSupportingTextColor-0d7_KjU", "getUnfocusedSupportingTextColor-0d7_KjU", "getDisabledSupportingTextColor-0d7_KjU", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "getUnfocusedPrefixColor-0d7_KjU", "getDisabledPrefixColor-0d7_KjU", "getErrorPrefixColor-0d7_KjU", "getFocusedSuffixColor-0d7_KjU", "getUnfocusedSuffixColor-0d7_KjU", "getDisabledSuffixColor-0d7_KjU", "getErrorSuffixColor-0d7_KjU", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1698:1\n708#2:1699\n696#2:1700\n708#2:1701\n696#2:1702\n708#2:1703\n696#2:1704\n708#2:1705\n696#2:1706\n708#2:1707\n696#2:1708\n708#2:1709\n696#2:1710\n708#2:1711\n696#2:1712\n708#2:1713\n696#2:1714\n708#2:1715\n696#2:1716\n708#2:1717\n696#2:1718\n708#2:1719\n696#2:1720\n708#2:1721\n696#2:1722\n708#2:1723\n696#2:1724\n708#2:1725\n696#2:1726\n708#2:1727\n696#2:1728\n708#2:1729\n696#2:1730\n708#2:1731\n696#2:1732\n708#2:1733\n696#2:1734\n708#2:1735\n696#2:1736\n708#2:1737\n696#2:1738\n708#2:1739\n696#2:1740\n708#2:1741\n696#2:1742\n708#2:1743\n696#2:1744\n708#2:1745\n696#2:1746\n708#2:1747\n696#2:1748\n708#2:1749\n696#2:1750\n708#2:1751\n696#2:1752\n708#2:1753\n696#2:1754\n708#2:1755\n696#2:1756\n708#2:1757\n696#2:1758\n708#2:1759\n696#2:1760\n708#2:1761\n696#2:1762\n708#2:1763\n696#2:1764\n708#2:1765\n696#2:1766\n708#2:1767\n696#2:1768\n708#2:1769\n696#2:1770\n708#2:1771\n696#2:1772\n708#2:1773\n696#2:1774\n708#2:1775\n696#2:1776\n708#2:1777\n696#2:1778\n708#2:1779\n696#2:1780\n708#2:1781\n696#2:1782\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1342#1:1699\n1342#1:1700\n1343#1:1701\n1343#1:1702\n1344#1:1703\n1344#1:1704\n1345#1:1705\n1345#1:1706\n1346#1:1707\n1346#1:1708\n1347#1:1709\n1347#1:1710\n1348#1:1711\n1348#1:1712\n1349#1:1713\n1349#1:1714\n1350#1:1715\n1350#1:1716\n1351#1:1717\n1351#1:1718\n1353#1:1719\n1353#1:1720\n1354#1:1721\n1354#1:1722\n1355#1:1723\n1355#1:1724\n1356#1:1725\n1356#1:1726\n1357#1:1727\n1357#1:1728\n1358#1:1729\n1358#1:1730\n1359#1:1731\n1359#1:1732\n1360#1:1733\n1360#1:1734\n1361#1:1735\n1361#1:1736\n1362#1:1737\n1362#1:1738\n1363#1:1739\n1363#1:1740\n1364#1:1741\n1364#1:1742\n1365#1:1743\n1365#1:1744\n1366#1:1745\n1366#1:1746\n1367#1:1747\n1367#1:1748\n1368#1:1749\n1368#1:1750\n1369#1:1751\n1369#1:1752\n1370#1:1753\n1370#1:1754\n1371#1:1755\n1371#1:1756\n1372#1:1757\n1372#1:1758\n1373#1:1759\n1373#1:1760\n1374#1:1761\n1374#1:1762\n1375#1:1763\n1375#1:1764\n1376#1:1765\n1376#1:1766\n1377#1:1767\n1377#1:1768\n1378#1:1769\n1378#1:1770\n1379#1:1771\n1379#1:1772\n1380#1:1773\n1380#1:1774\n1381#1:1775\n1381#1:1776\n1382#1:1777\n1382#1:1778\n1383#1:1779\n1383#1:1780\n1384#1:1781\n1384#1:1782\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;

    @NotNull
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, TextSelectionColors textSelectionColors, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, textSelectionColors, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48);
    }

    /* renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m9021copyejIjP34$default(TextFieldColors textFieldColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, TextSelectionColors textSelectionColors, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i8, Object obj) {
        long j49;
        long j50;
        long j51 = (i & 1) != 0 ? textFieldColors.focusedTextColor : j7;
        long j52 = (i & 2) != 0 ? textFieldColors.unfocusedTextColor : j8;
        long j53 = (i & 4) != 0 ? textFieldColors.disabledTextColor : j9;
        long j54 = (i & 8) != 0 ? textFieldColors.errorTextColor : j10;
        long j55 = (i & 16) != 0 ? textFieldColors.focusedContainerColor : j11;
        long j56 = (i & 32) != 0 ? textFieldColors.unfocusedContainerColor : j12;
        if ((i & 64) != 0) {
            j49 = j51;
            j50 = textFieldColors.disabledContainerColor;
        } else {
            j49 = j51;
            j50 = j13;
        }
        return textFieldColors.m9023copyejIjP34(j49, j52, j53, j54, j55, j56, j50, (i & 128) != 0 ? textFieldColors.errorContainerColor : j14, (i & 256) != 0 ? textFieldColors.cursorColor : j15, (i & 512) != 0 ? textFieldColors.errorCursorColor : j16, (i & 1024) != 0 ? textFieldColors.textSelectionColors : textSelectionColors, (i & 2048) != 0 ? textFieldColors.focusedIndicatorColor : j17, (i & 4096) != 0 ? textFieldColors.unfocusedIndicatorColor : j18, (i & 8192) != 0 ? textFieldColors.disabledIndicatorColor : j19, (i & 16384) != 0 ? textFieldColors.errorIndicatorColor : j20, (i & 32768) != 0 ? textFieldColors.focusedLeadingIconColor : j21, (i & 65536) != 0 ? textFieldColors.unfocusedLeadingIconColor : j22, (i & 131072) != 0 ? textFieldColors.disabledLeadingIconColor : j23, (i & 262144) != 0 ? textFieldColors.errorLeadingIconColor : j24, (i & 524288) != 0 ? textFieldColors.focusedTrailingIconColor : j25, (i & 1048576) != 0 ? textFieldColors.unfocusedTrailingIconColor : j26, (i & 2097152) != 0 ? textFieldColors.disabledTrailingIconColor : j27, (i & 4194304) != 0 ? textFieldColors.errorTrailingIconColor : j28, (i & 8388608) != 0 ? textFieldColors.focusedLabelColor : j29, (i & 16777216) != 0 ? textFieldColors.unfocusedLabelColor : j30, (i & 33554432) != 0 ? textFieldColors.disabledLabelColor : j31, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? textFieldColors.errorLabelColor : j32, (i & 134217728) != 0 ? textFieldColors.focusedPlaceholderColor : j33, (i & 268435456) != 0 ? textFieldColors.unfocusedPlaceholderColor : j34, (i & 536870912) != 0 ? textFieldColors.disabledPlaceholderColor : j35, (i & BasicMeasure.EXACTLY) != 0 ? textFieldColors.errorPlaceholderColor : j36, (i & Integer.MIN_VALUE) != 0 ? textFieldColors.focusedSupportingTextColor : j37, (i8 & 1) != 0 ? textFieldColors.unfocusedSupportingTextColor : j38, (i8 & 2) != 0 ? textFieldColors.disabledSupportingTextColor : j39, (i8 & 4) != 0 ? textFieldColors.errorSupportingTextColor : j40, (i8 & 8) != 0 ? textFieldColors.focusedPrefixColor : j41, (i8 & 16) != 0 ? textFieldColors.unfocusedPrefixColor : j42, (i8 & 32) != 0 ? textFieldColors.disabledPrefixColor : j43, (i8 & 64) != 0 ? textFieldColors.errorPrefixColor : j44, (i8 & 128) != 0 ? textFieldColors.focusedSuffixColor : j45, (i8 & 256) != 0 ? textFieldColors.unfocusedSuffixColor : j46, (i8 & 512) != 0 ? textFieldColors.disabledSuffixColor : j47, (i8 & 1024) != 0 ? textFieldColors.errorSuffixColor : j48);
    }

    @Stable
    /* renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9022containerColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledContainerColor : isError ? this.errorContainerColor : focused ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    @NotNull
    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m9023copyejIjP34(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, @Nullable TextSelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new TextFieldColors(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, takeOrElse$material3_release(textSelectionColors, new InterfaceC6469a() { // from class: androidx.compose.material3.TextFieldColors$copy$11
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final TextSelectionColors invoke() {
                return this.this$0.getTextSelectionColors();
            }
        }), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    @Stable
    /* renamed from: cursorColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9024cursorColorvNxB06k$material3_release(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.m10683equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m10683equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m10683equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m10683equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m10683equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m10683equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m10683equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m10683equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m10683equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m10683equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && AbstractC5830k.m5325b(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m10683equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m10683equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m10683equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m10683equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m10683equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m10683equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m10683equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m10683equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m10683equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m10683equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m10683equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m10683equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m10683equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m10683equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m10683equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m10683equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m10683equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m10683equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m10683equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m10683equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m10683equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m10683equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m10683equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m10683equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m10683equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m10683equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m10683equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m10683equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m10683equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m10683equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m10683equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m10683equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCursorColor() {
        return this.cursorColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIndicatorColor() {
        return this.disabledIndicatorColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLabelColor() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledPlaceholderColor() {
        return this.disabledPlaceholderColor;
    }

    /* renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledPrefixColor() {
        return this.disabledPrefixColor;
    }

    /* renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSuffixColor() {
        return this.disabledSuffixColor;
    }

    /* renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSupportingTextColor() {
        return this.disabledSupportingTextColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorContainerColor() {
        return this.errorContainerColor;
    }

    /* renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorCursorColor() {
        return this.errorCursorColor;
    }

    /* renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorIndicatorColor() {
        return this.errorIndicatorColor;
    }

    /* renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorLabelColor() {
        return this.errorLabelColor;
    }

    /* renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorLeadingIconColor() {
        return this.errorLeadingIconColor;
    }

    /* renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorPlaceholderColor() {
        return this.errorPlaceholderColor;
    }

    /* renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorPrefixColor() {
        return this.errorPrefixColor;
    }

    /* renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorSuffixColor() {
        return this.errorSuffixColor;
    }

    /* renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorSupportingTextColor() {
        return this.errorSupportingTextColor;
    }

    /* renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorTextColor() {
        return this.errorTextColor;
    }

    /* renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorTrailingIconColor() {
        return this.errorTrailingIconColor;
    }

    /* renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedContainerColor() {
        return this.focusedContainerColor;
    }

    /* renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedIndicatorColor() {
        return this.focusedIndicatorColor;
    }

    /* renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedLabelColor() {
        return this.focusedLabelColor;
    }

    /* renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedLeadingIconColor() {
        return this.focusedLeadingIconColor;
    }

    /* renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedPlaceholderColor() {
        return this.focusedPlaceholderColor;
    }

    /* renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedPrefixColor() {
        return this.focusedPrefixColor;
    }

    /* renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedSuffixColor() {
        return this.focusedSuffixColor;
    }

    /* renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedSupportingTextColor() {
        return this.focusedSupportingTextColor;
    }

    /* renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedTextColor() {
        return this.focusedTextColor;
    }

    /* renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedTrailingIconColor() {
        return this.focusedTrailingIconColor;
    }

    @NotNull
    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedContainerColor() {
        return this.unfocusedContainerColor;
    }

    /* renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedIndicatorColor() {
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedLabelColor() {
        return this.unfocusedLabelColor;
    }

    /* renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedLeadingIconColor() {
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedPlaceholderColor() {
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedPrefixColor() {
        return this.unfocusedPrefixColor;
    }

    /* renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedSuffixColor() {
        return this.unfocusedSuffixColor;
    }

    /* renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedSupportingTextColor() {
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedTextColor() {
        return this.unfocusedTextColor;
    }

    /* renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedTrailingIconColor() {
        return this.unfocusedTrailingIconColor;
    }

    public int hashCode() {
        return Color.m10689hashCodeimpl(this.errorSuffixColor) + AbstractC0584a.m904e(this.disabledSuffixColor, AbstractC0584a.m904e(this.unfocusedSuffixColor, AbstractC0584a.m904e(this.focusedSuffixColor, AbstractC0584a.m904e(this.errorPrefixColor, AbstractC0584a.m904e(this.disabledPrefixColor, AbstractC0584a.m904e(this.unfocusedPrefixColor, AbstractC0584a.m904e(this.focusedPrefixColor, AbstractC0584a.m904e(this.errorSupportingTextColor, AbstractC0584a.m904e(this.disabledSupportingTextColor, AbstractC0584a.m904e(this.unfocusedSupportingTextColor, AbstractC0584a.m904e(this.focusedSupportingTextColor, AbstractC0584a.m904e(this.errorPlaceholderColor, AbstractC0584a.m904e(this.disabledPlaceholderColor, AbstractC0584a.m904e(this.unfocusedPlaceholderColor, AbstractC0584a.m904e(this.focusedPlaceholderColor, AbstractC0584a.m904e(this.errorLabelColor, AbstractC0584a.m904e(this.disabledLabelColor, AbstractC0584a.m904e(this.unfocusedLabelColor, AbstractC0584a.m904e(this.focusedLabelColor, AbstractC0584a.m904e(this.errorTrailingIconColor, AbstractC0584a.m904e(this.disabledTrailingIconColor, AbstractC0584a.m904e(this.unfocusedTrailingIconColor, AbstractC0584a.m904e(this.focusedTrailingIconColor, AbstractC0584a.m904e(this.errorLeadingIconColor, AbstractC0584a.m904e(this.disabledLeadingIconColor, AbstractC0584a.m904e(this.unfocusedLeadingIconColor, AbstractC0584a.m904e(this.focusedLeadingIconColor, AbstractC0584a.m904e(this.errorIndicatorColor, AbstractC0584a.m904e(this.disabledIndicatorColor, AbstractC0584a.m904e(this.unfocusedIndicatorColor, AbstractC0584a.m904e(this.focusedIndicatorColor, (this.textSelectionColors.hashCode() + AbstractC0584a.m904e(this.errorCursorColor, AbstractC0584a.m904e(this.cursorColor, AbstractC0584a.m904e(this.errorContainerColor, AbstractC0584a.m904e(this.disabledContainerColor, AbstractC0584a.m904e(this.unfocusedContainerColor, AbstractC0584a.m904e(this.focusedContainerColor, AbstractC0584a.m904e(this.errorTextColor, AbstractC0584a.m904e(this.disabledTextColor, AbstractC0584a.m904e(this.unfocusedTextColor, Color.m10689hashCodeimpl(this.focusedTextColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: indicatorColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9067indicatorColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledIndicatorColor : isError ? this.errorIndicatorColor : focused ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    @Stable
    /* renamed from: labelColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9068labelColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLabelColor : isError ? this.errorLabelColor : focused ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    @Stable
    /* renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9069leadingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLeadingIconColor : isError ? this.errorLeadingIconColor : focused ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    @Stable
    /* renamed from: placeholderColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9070placeholderColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPlaceholderColor : isError ? this.errorPlaceholderColor : focused ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    @Stable
    /* renamed from: prefixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9071prefixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPrefixColor : isError ? this.errorPrefixColor : focused ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    @Stable
    /* renamed from: suffixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9072suffixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSuffixColor : isError ? this.errorSuffixColor : focused ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    @Stable
    /* renamed from: supportingTextColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9073supportingTextColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSupportingTextColor : isError ? this.errorSupportingTextColor : focused ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    @NotNull
    public final TextSelectionColors takeOrElse$material3_release(@Nullable TextSelectionColors textSelectionColors, @NotNull InterfaceC6469a interfaceC6469a) {
        return textSelectionColors == null ? (TextSelectionColors) interfaceC6469a.invoke() : textSelectionColors;
    }

    @Stable
    /* renamed from: textColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9074textColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTextColor : isError ? this.errorTextColor : focused ? this.focusedTextColor : this.unfocusedTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9075trailingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTrailingIconColor : isError ? this.errorTrailingIconColor : focused ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    private TextFieldColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, TextSelectionColors textSelectionColors, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        this.focusedTextColor = j7;
        this.unfocusedTextColor = j8;
        this.disabledTextColor = j9;
        this.errorTextColor = j10;
        this.focusedContainerColor = j11;
        this.unfocusedContainerColor = j12;
        this.disabledContainerColor = j13;
        this.errorContainerColor = j14;
        this.cursorColor = j15;
        this.errorCursorColor = j16;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j17;
        this.unfocusedIndicatorColor = j18;
        this.disabledIndicatorColor = j19;
        this.errorIndicatorColor = j20;
        this.focusedLeadingIconColor = j21;
        this.unfocusedLeadingIconColor = j22;
        this.disabledLeadingIconColor = j23;
        this.errorLeadingIconColor = j24;
        this.focusedTrailingIconColor = j25;
        this.unfocusedTrailingIconColor = j26;
        this.disabledTrailingIconColor = j27;
        this.errorTrailingIconColor = j28;
        this.focusedLabelColor = j29;
        this.unfocusedLabelColor = j30;
        this.disabledLabelColor = j31;
        this.errorLabelColor = j32;
        this.focusedPlaceholderColor = j33;
        this.unfocusedPlaceholderColor = j34;
        this.disabledPlaceholderColor = j35;
        this.errorPlaceholderColor = j36;
        this.focusedSupportingTextColor = j37;
        this.unfocusedSupportingTextColor = j38;
        this.disabledSupportingTextColor = j39;
        this.errorSupportingTextColor = j40;
        this.focusedPrefixColor = j41;
        this.unfocusedPrefixColor = j42;
        this.disabledPrefixColor = j43;
        this.errorPrefixColor = j44;
        this.focusedSuffixColor = j45;
        this.unfocusedSuffixColor = j46;
        this.disabledSuffixColor = j47;
        this.errorSuffixColor = j48;
    }
}
