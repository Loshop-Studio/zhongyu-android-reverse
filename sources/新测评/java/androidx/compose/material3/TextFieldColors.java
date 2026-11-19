package androidx.compose.material3;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÝ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0002\u0010/J-\u0010^\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bc\u0010dJÀ\u0003\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010a\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020`2\b\u0010k\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010l\u001a\u00020mH\u0016J-\u0010n\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010dJ-\u0010p\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010dJ-\u0010r\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010dJ-\u0010t\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010dJ-\u0010v\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010dJ-\u0010x\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010dJ-\u0010z\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010dJ-\u0010|\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b}\u0010dJ-\u0010~\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010dJ%\u0010\u0080\u0001\u001a\u00020\u000e*\u0004\u0018\u00010\u000e2\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0082\u0001H\u0000¢\u0006\u0003\b\u0083\u0001R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b3\u00101R\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b4\u00101R\u0019\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b5\u00101R\u0019\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b6\u00101R\u0019\u0010!\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b7\u00101R\u0019\u0010)\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b8\u00101R\u0019\u0010-\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b9\u00101R\u0019\u0010%\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b:\u00101R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b;\u00101R\u0019\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b<\u00101R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b=\u00101R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b>\u00101R\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b?\u00101R\u0019\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b@\u00101R\u0019\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bA\u00101R\u0019\u0010\"\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bB\u00101R\u0019\u0010*\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bC\u00101R\u0019\u0010.\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bD\u00101R\u0019\u0010&\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bE\u00101R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bF\u00101R\u0019\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bG\u00101R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bH\u00101R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bI\u00101R\u0019\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bJ\u00101R\u0019\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bK\u00101R\u0019\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bL\u00101R\u0019\u0010'\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bM\u00101R\u0019\u0010+\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bN\u00101R\u0019\u0010#\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bO\u00101R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bP\u00101R\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bQ\u00101R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bT\u00101R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bU\u00101R\u0019\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bV\u00101R\u0019\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bW\u00101R\u0019\u0010 \u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bX\u00101R\u0019\u0010(\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bY\u00101R\u0019\u0010,\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bZ\u00101R\u0019\u0010$\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b[\u00101R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b\\\u00101R\u0019\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b]\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0001"}, m13558d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "textSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCursorColor-0d7_KjU", "()J", "J", "getDisabledContainerColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getDisabledPlaceholderColor-0d7_KjU", "getDisabledPrefixColor-0d7_KjU", "getDisabledSuffixColor-0d7_KjU", "getDisabledSupportingTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getErrorLabelColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getErrorPlaceholderColor-0d7_KjU", "getErrorPrefixColor-0d7_KjU", "getErrorSuffixColor-0d7_KjU", "getErrorSupportingTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getFocusedIndicatorColor-0d7_KjU", "getFocusedLabelColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getFocusedPlaceholderColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "getFocusedSuffixColor-0d7_KjU", "getFocusedSupportingTextColor-0d7_KjU", "getFocusedTextColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getUnfocusedContainerColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getUnfocusedLabelColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getUnfocusedPlaceholderColor-0d7_KjU", "getUnfocusedPrefixColor-0d7_KjU", "getUnfocusedSuffixColor-0d7_KjU", "getUnfocusedSupportingTextColor-0d7_KjU", "getUnfocusedTextColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "containerColor", "enabled", "", "isError", "focused", "containerColor-XeAY9LY$material3_release", "(ZZZ)J", "copy", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "cursorColor-vNxB06k$material3_release", "(Z)J", "equals", "other", "hashCode", "", "indicatorColor", "indicatorColor-XeAY9LY$material3_release", "labelColor", "labelColor-XeAY9LY$material3_release", "leadingIconColor", "leadingIconColor-XeAY9LY$material3_release", "placeholderColor", "placeholderColor-XeAY9LY$material3_release", "prefixColor", "prefixColor-XeAY9LY$material3_release", "suffixColor", "suffixColor-XeAY9LY$material3_release", "supportingTextColor", "supportingTextColor-XeAY9LY$material3_release", "textColor", "textColor-XeAY9LY$material3_release", "trailingIconColor", "trailingIconColor-XeAY9LY$material3_release", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse$material3_release", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1698:1\n708#2:1699\n696#2:1700\n708#2:1701\n696#2:1702\n708#2:1703\n696#2:1704\n708#2:1705\n696#2:1706\n708#2:1707\n696#2:1708\n708#2:1709\n696#2:1710\n708#2:1711\n696#2:1712\n708#2:1713\n696#2:1714\n708#2:1715\n696#2:1716\n708#2:1717\n696#2:1718\n708#2:1719\n696#2:1720\n708#2:1721\n696#2:1722\n708#2:1723\n696#2:1724\n708#2:1725\n696#2:1726\n708#2:1727\n696#2:1728\n708#2:1729\n696#2:1730\n708#2:1731\n696#2:1732\n708#2:1733\n696#2:1734\n708#2:1735\n696#2:1736\n708#2:1737\n696#2:1738\n708#2:1739\n696#2:1740\n708#2:1741\n696#2:1742\n708#2:1743\n696#2:1744\n708#2:1745\n696#2:1746\n708#2:1747\n696#2:1748\n708#2:1749\n696#2:1750\n708#2:1751\n696#2:1752\n708#2:1753\n696#2:1754\n708#2:1755\n696#2:1756\n708#2:1757\n696#2:1758\n708#2:1759\n696#2:1760\n708#2:1761\n696#2:1762\n708#2:1763\n696#2:1764\n708#2:1765\n696#2:1766\n708#2:1767\n696#2:1768\n708#2:1769\n696#2:1770\n708#2:1771\n696#2:1772\n708#2:1773\n696#2:1774\n708#2:1775\n696#2:1776\n708#2:1777\n696#2:1778\n708#2:1779\n696#2:1780\n708#2:1781\n696#2:1782\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1342#1:1699\n1342#1:1700\n1343#1:1701\n1343#1:1702\n1344#1:1703\n1344#1:1704\n1345#1:1705\n1345#1:1706\n1346#1:1707\n1346#1:1708\n1347#1:1709\n1347#1:1710\n1348#1:1711\n1348#1:1712\n1349#1:1713\n1349#1:1714\n1350#1:1715\n1350#1:1716\n1351#1:1717\n1351#1:1718\n1353#1:1719\n1353#1:1720\n1354#1:1721\n1354#1:1722\n1355#1:1723\n1355#1:1724\n1356#1:1725\n1356#1:1726\n1357#1:1727\n1357#1:1728\n1358#1:1729\n1358#1:1730\n1359#1:1731\n1359#1:1732\n1360#1:1733\n1360#1:1734\n1361#1:1735\n1361#1:1736\n1362#1:1737\n1362#1:1738\n1363#1:1739\n1363#1:1740\n1364#1:1741\n1364#1:1742\n1365#1:1743\n1365#1:1744\n1366#1:1745\n1366#1:1746\n1367#1:1747\n1367#1:1748\n1368#1:1749\n1368#1:1750\n1369#1:1751\n1369#1:1752\n1370#1:1753\n1370#1:1754\n1371#1:1755\n1371#1:1756\n1372#1:1757\n1372#1:1758\n1373#1:1759\n1373#1:1760\n1374#1:1761\n1374#1:1762\n1375#1:1763\n1375#1:1764\n1376#1:1765\n1376#1:1766\n1377#1:1767\n1377#1:1768\n1378#1:1769\n1378#1:1770\n1379#1:1771\n1379#1:1772\n1380#1:1773\n1380#1:1774\n1381#1:1775\n1381#1:1776\n1382#1:1777\n1382#1:1778\n1383#1:1779\n1383#1:1780\n1384#1:1781\n1384#1:1782\n*E\n"})
/* loaded from: classes2.dex */
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
    private final SelectionColors textSelectionColors;
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

    public /* synthetic */ TextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, SelectionColors selectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, selectionColors, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51);
    }

    /* renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m19346copyejIjP34$default(TextFieldColors textFieldColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, SelectionColors selectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, int i10, int i11, Object obj) {
        long j52;
        long j53;
        long j54 = (i10 & 1) != 0 ? textFieldColors.focusedTextColor : j10;
        long j55 = (i10 & 2) != 0 ? textFieldColors.unfocusedTextColor : j11;
        long j56 = (i10 & 4) != 0 ? textFieldColors.disabledTextColor : j12;
        long j57 = (i10 & 8) != 0 ? textFieldColors.errorTextColor : j13;
        long j58 = (i10 & 16) != 0 ? textFieldColors.focusedContainerColor : j14;
        long j59 = (i10 & 32) != 0 ? textFieldColors.unfocusedContainerColor : j15;
        if ((i10 & 64) != 0) {
            j52 = j54;
            j53 = textFieldColors.disabledContainerColor;
        } else {
            j52 = j54;
            j53 = j16;
        }
        return textFieldColors.m19348copyejIjP34(j52, j55, j56, j57, j58, j59, j53, (i10 & 128) != 0 ? textFieldColors.errorContainerColor : j17, (i10 & 256) != 0 ? textFieldColors.cursorColor : j18, (i10 & 512) != 0 ? textFieldColors.errorCursorColor : j19, (i10 & 1024) != 0 ? textFieldColors.textSelectionColors : selectionColors, (i10 & 2048) != 0 ? textFieldColors.focusedIndicatorColor : j20, (i10 & 4096) != 0 ? textFieldColors.unfocusedIndicatorColor : j21, (i10 & 8192) != 0 ? textFieldColors.disabledIndicatorColor : j22, (i10 & 16384) != 0 ? textFieldColors.errorIndicatorColor : j23, (i10 & 32768) != 0 ? textFieldColors.focusedLeadingIconColor : j24, (i10 & 65536) != 0 ? textFieldColors.unfocusedLeadingIconColor : j25, (i10 & 131072) != 0 ? textFieldColors.disabledLeadingIconColor : j26, (i10 & 262144) != 0 ? textFieldColors.errorLeadingIconColor : j27, (i10 & 524288) != 0 ? textFieldColors.focusedTrailingIconColor : j28, (i10 & 1048576) != 0 ? textFieldColors.unfocusedTrailingIconColor : j29, (i10 & 2097152) != 0 ? textFieldColors.disabledTrailingIconColor : j30, (i10 & 4194304) != 0 ? textFieldColors.errorTrailingIconColor : j31, (i10 & 8388608) != 0 ? textFieldColors.focusedLabelColor : j32, (i10 & 16777216) != 0 ? textFieldColors.unfocusedLabelColor : j33, (i10 & 33554432) != 0 ? textFieldColors.disabledLabelColor : j34, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? textFieldColors.errorLabelColor : j35, (i10 & 134217728) != 0 ? textFieldColors.focusedPlaceholderColor : j36, (i10 & 268435456) != 0 ? textFieldColors.unfocusedPlaceholderColor : j37, (i10 & 536870912) != 0 ? textFieldColors.disabledPlaceholderColor : j38, (i10 & 1073741824) != 0 ? textFieldColors.errorPlaceholderColor : j39, (i10 & Integer.MIN_VALUE) != 0 ? textFieldColors.focusedSupportingTextColor : j40, (i11 & 1) != 0 ? textFieldColors.unfocusedSupportingTextColor : j41, (i11 & 2) != 0 ? textFieldColors.disabledSupportingTextColor : j42, (i11 & 4) != 0 ? textFieldColors.errorSupportingTextColor : j43, (i11 & 8) != 0 ? textFieldColors.focusedPrefixColor : j44, (i11 & 16) != 0 ? textFieldColors.unfocusedPrefixColor : j45, (i11 & 32) != 0 ? textFieldColors.disabledPrefixColor : j46, (i11 & 64) != 0 ? textFieldColors.errorPrefixColor : j47, (i11 & 128) != 0 ? textFieldColors.focusedSuffixColor : j48, (i11 & 256) != 0 ? textFieldColors.unfocusedSuffixColor : j49, (i11 & 512) != 0 ? textFieldColors.disabledSuffixColor : j50, (i11 & 1024) != 0 ? textFieldColors.errorSuffixColor : j51);
    }

    @Stable
    /* renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19347containerColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledContainerColor : isError ? this.errorContainerColor : focused ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m19348copyejIjP34(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, SelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new TextFieldColors(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, takeOrElse$material3_release(textSelectionColors, new Function0<SelectionColors>() { // from class: androidx.compose.material3.TextFieldColors$copy$11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SelectionColors invoke() {
                return this.this$0.getTextSelectionColors();
            }
        }), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    @Stable
    /* renamed from: cursorColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19349cursorColorvNxB06k$material3_release(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.m20977equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m20977equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m20977equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m20977equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m20977equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m20977equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m20977equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m20977equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m20977equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m20977equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && Intrinsics.areEqual(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m20977equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m20977equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m20977equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m20977equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m20977equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m20977equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m20977equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m20977equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m20977equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m20977equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m20977equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m20977equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m20977equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m20977equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m20977equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m20977equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m20977equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m20977equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m20977equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m20977equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m20977equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m20977equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m20977equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m20977equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m20977equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m20977equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m20977equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m20977equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m20977equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m20977equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m20977equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m20977equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
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

    public final SelectionColors getTextSelectionColors() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m20983hashCodeimpl(this.focusedTextColor) * 31) + Color.m20983hashCodeimpl(this.unfocusedTextColor)) * 31) + Color.m20983hashCodeimpl(this.disabledTextColor)) * 31) + Color.m20983hashCodeimpl(this.errorTextColor)) * 31) + Color.m20983hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m20983hashCodeimpl(this.errorContainerColor)) * 31) + Color.m20983hashCodeimpl(this.cursorColor)) * 31) + Color.m20983hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m20983hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m20983hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m20983hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m20983hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m20983hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m20983hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m20983hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m20983hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m20983hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m20983hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m20983hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m20983hashCodeimpl(this.errorLabelColor)) * 31) + Color.m20983hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m20983hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m20983hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m20983hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m20983hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m20983hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m20983hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m20983hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m20983hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m20983hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m20983hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m20983hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m20983hashCodeimpl(this.errorSuffixColor);
    }

    @Stable
    /* renamed from: indicatorColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19392indicatorColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledIndicatorColor : isError ? this.errorIndicatorColor : focused ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    @Stable
    /* renamed from: labelColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19393labelColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLabelColor : isError ? this.errorLabelColor : focused ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    @Stable
    /* renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19394leadingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLeadingIconColor : isError ? this.errorLeadingIconColor : focused ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    @Stable
    /* renamed from: placeholderColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19395placeholderColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPlaceholderColor : isError ? this.errorPlaceholderColor : focused ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    @Stable
    /* renamed from: prefixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19396prefixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPrefixColor : isError ? this.errorPrefixColor : focused ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    @Stable
    /* renamed from: suffixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19397suffixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSuffixColor : isError ? this.errorSuffixColor : focused ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    @Stable
    /* renamed from: supportingTextColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19398supportingTextColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSupportingTextColor : isError ? this.errorSupportingTextColor : focused ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public final SelectionColors takeOrElse$material3_release(SelectionColors selectionColors, Function0<SelectionColors> function0) {
        return selectionColors == null ? function0.invoke() : selectionColors;
    }

    @Stable
    /* renamed from: textColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19399textColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTextColor : isError ? this.errorTextColor : focused ? this.focusedTextColor : this.unfocusedTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m19400trailingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTrailingIconColor : isError ? this.errorTrailingIconColor : focused ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    private TextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, SelectionColors selectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51) {
        this.focusedTextColor = j10;
        this.unfocusedTextColor = j11;
        this.disabledTextColor = j12;
        this.errorTextColor = j13;
        this.focusedContainerColor = j14;
        this.unfocusedContainerColor = j15;
        this.disabledContainerColor = j16;
        this.errorContainerColor = j17;
        this.cursorColor = j18;
        this.errorCursorColor = j19;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j20;
        this.unfocusedIndicatorColor = j21;
        this.disabledIndicatorColor = j22;
        this.errorIndicatorColor = j23;
        this.focusedLeadingIconColor = j24;
        this.unfocusedLeadingIconColor = j25;
        this.disabledLeadingIconColor = j26;
        this.errorLeadingIconColor = j27;
        this.focusedTrailingIconColor = j28;
        this.unfocusedTrailingIconColor = j29;
        this.disabledTrailingIconColor = j30;
        this.errorTrailingIconColor = j31;
        this.focusedLabelColor = j32;
        this.unfocusedLabelColor = j33;
        this.disabledLabelColor = j34;
        this.errorLabelColor = j35;
        this.focusedPlaceholderColor = j36;
        this.unfocusedPlaceholderColor = j37;
        this.disabledPlaceholderColor = j38;
        this.errorPlaceholderColor = j39;
        this.focusedSupportingTextColor = j40;
        this.unfocusedSupportingTextColor = j41;
        this.disabledSupportingTextColor = j42;
        this.errorSupportingTextColor = j43;
        this.focusedPrefixColor = j44;
        this.unfocusedPrefixColor = j45;
        this.disabledPrefixColor = j46;
        this.errorPrefixColor = j47;
        this.focusedSuffixColor = j48;
        this.unfocusedSuffixColor = j49;
        this.disabledSuffixColor = j50;
        this.errorSuffixColor = j51;
    }
}
