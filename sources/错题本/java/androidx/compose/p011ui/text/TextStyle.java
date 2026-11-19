package androidx.compose.p011ui.text;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.Hyphens;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextDirection;
import androidx.compose.p011ui.text.style.TextForegroundStyle;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bI\b\u0007\u0018\u0000 ¬\u00012\u00020\u0001:\u0002¬\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB×\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b\b\u0010,Bï\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b\b\u0010/B\u0087\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b\b\u00104B\u009f\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u00109B\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010:B¡\u0002\b\u0016\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010?B©\u0002\b\u0017\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010@J\u000f\u0010A\u001a\u00020\u0002H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0004H\u0007¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u00020\u00002\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\bF\u0010GJ \u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ¨\u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0002H\u0007¢\u0006\u0004\bF\u0010LJ\u0017\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0004H\u0007¢\u0006\u0004\bF\u0010MJ\u0018\u0010N\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\bN\u0010GJ\u0018\u0010N\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\bN\u0010MJ\u0018\u0010N\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\bN\u0010LJà\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010PJø\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0090\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ¨\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u009e\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00108\u001a\u0004\u0018\u000107ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ²\u0002\u0010Q\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0007ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J¨\u0002\u0010Q\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00108\u001a\u0004\u0018\u000107ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J\u001a\u0010_\u001a\u00020^2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020^2\u0006\u0010E\u001a\u00020\u0000¢\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001a\u00020^2\u0006\u0010E\u001a\u00020\u0000¢\u0006\u0004\bc\u0010bJ\u000f\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020dH\u0000¢\u0006\u0004\bg\u0010fJ\u000f\u0010i\u001a\u00020\u0017H\u0016¢\u0006\u0004\bi\u0010jR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010m\u001a\u0004\bn\u0010DR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010o\u001a\u0004\bp\u0010qR\u0013\u0010<\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0017\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0011\u0010>\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bx\u0010uR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010jR\u0018\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010uR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010uR\u0015\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0015\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0015\u00106\u001a\u0004\u0018\u0001058F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010&\u001a\u00020%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010fR'\u0010\u0095\u0001\u001a\u0004\u0018\u00010%8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010(\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010fR'\u0010\u009a\u0001\u001a\u0004\u0018\u00010'8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b\u0099\u0001\u0010\u0094\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010)\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010uR\u0015\u0010+\u001a\u0004\u0018\u00010*8F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0015\u0010.\u001a\u0004\u0018\u00010-8F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u00103\u001a\u0002028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b \u0001\u0010fR'\u0010¤\u0001\u001a\u0004\u0018\u0001028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b£\u0001\u0010\u0094\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u00101\u001a\u0002008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010fR'\u0010©\u0001\u001a\u0004\u0018\u0001008GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b¨\u0001\u0010\u0094\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u0015\u00108\u001a\u0004\u0018\u0001078F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u00ad\u0001"}, m5110d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformStyle", "<init>", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "background", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/e;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/e;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/e;)V", "toSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "toParagraphStyle", "()Landroidx/compose/ui/text/ParagraphStyle;", "other", "merge", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;", "merge-dA7vx0o", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "merge-Z1GrekI", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/TextStyle;", "plus", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy", "copy-NOaFTUo", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-CXVQc50", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/TextStyle;", "copy-v2rsoow", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-p1EtxEg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-aIRg9q4", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-Ns73l9s", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "", "equals", "(Ljava/lang/Object;)Z", "hasSameLayoutAffectingAttributes", "(Landroidx/compose/ui/text/TextStyle;)Z", "hasSameDrawAffectingAttributes", "", "hashCode", "()I", "hashCodeLayoutAffectingAttributes$ui_text_release", "hashCodeLayoutAffectingAttributes", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyle$ui_text_release", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyle$ui_text_release", "Landroidx/compose/ui/text/PlatformTextStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "()J", "getAlpha", "()F", "getFontSize-XSAIIZE", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "getLetterSpacing-XSAIIZE", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getBackground-0d7_KjU", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getTextAlign-e0LSkKk", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U$annotations", "()V", "deprecated_boxing_textAlign", "getTextDirection-s_7X-co", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to$annotations", "deprecated_boxing_textDirection", "getLineHeight-XSAIIZE", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getHyphens-vmbZdU8", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns$annotations", "deprecated_boxing_hyphens", "getLineBreak-rAG3T2k", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo$annotations", "deprecated_boxing_lineBreak", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "Companion", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TextStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (AbstractC5824e) null);

    @NotNull
    private final ParagraphStyle paragraphStyle;

    @Nullable
    private final PlatformTextStyle platformStyle;

    @NotNull
    private final SpanStyle spanStyle;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @NotNull
        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion, AbstractC5824e abstractC5824e) {
        this(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, drawStyle, i, i8, j11, textIndent, platformTextStyle, lineHeightStyle, i9, i10, textMotion);
    }

    /* renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m12778copyCXVQc50$default(TextStyle textStyle, long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, Object obj) {
        Hyphens hyphensM13080boximpl;
        LineBreak lineBreak2;
        long jM12711getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m12711getColor0d7_KjU() : j7;
        long fontSize = (i & 2) != 0 ? textStyle.spanStyle.getFontSize() : j8;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j9;
        BaselineShift baselineShift2 = (i & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j12 = jM12711getColor0d7_KjU;
        long background = (i & 2048) != 0 ? textStyle.spanStyle.getBackground() : j10;
        TextDecoration background2 = (i & 4096) != 0 ? textStyle.spanStyle.getBackground() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration2 = background2;
        TextAlign textAlignM13182boximpl = (i & 16384) != 0 ? TextAlign.m13182boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM13196boximpl = (i & 32768) != 0 ? TextDirection.m13196boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long jM12663getLineHeightXSAIIZE = (i & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j11;
        TextIndent textIndent2 = (i & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM13090boximpl = (i & 1048576) != 0 ? LineBreak.m13090boximpl(textStyle.paragraphStyle.getLineBreak()) : lineBreak;
        if ((i & 2097152) != 0) {
            lineBreak2 = lineBreakM13090boximpl;
            hyphensM13080boximpl = Hyphens.m13080boximpl(textStyle.paragraphStyle.getHyphens());
        } else {
            hyphensM13080boximpl = hyphens;
            lineBreak2 = lineBreakM13090boximpl;
        }
        return textStyle.m12791copyCXVQc50(j12, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, textAlignM13182boximpl, textDirectionM13196boximpl, jM12663getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphensM13080boximpl);
    }

    /* renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m12779copyHL5avdY$default(TextStyle textStyle, long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, int i, Object obj) {
        long jM12711getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m12711getColor0d7_KjU() : j7;
        return textStyle.m12792copyHL5avdY(jM12711getColor0d7_KjU, (i & 2) != 0 ? textStyle.spanStyle.getFontSize() : j8, (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight, (i & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle, (i & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis, (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str, (i & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j9, (i & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift, (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList, (i & 2048) != 0 ? textStyle.spanStyle.getBackground() : j10, (i & 4096) != 0 ? textStyle.spanStyle.getBackground() : textDecoration, (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow, (i & 16384) != 0 ? TextAlign.m13182boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign, (i & 32768) != 0 ? TextDirection.m13196boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection, (i & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j11, (i & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m12780copyNOaFTUo$default(TextStyle textStyle, long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long jM12711getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m12711getColor0d7_KjU() : j7;
        long fontSize = (i & 2) != 0 ? textStyle.spanStyle.getFontSize() : j8;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j9;
        BaselineShift baselineShift2 = (i & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j12 = jM12711getColor0d7_KjU;
        long background = (i & 2048) != 0 ? textStyle.spanStyle.getBackground() : j10;
        TextDecoration background2 = (i & 4096) != 0 ? textStyle.spanStyle.getBackground() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration2 = background2;
        TextAlign textAlignM13182boximpl = (i & 16384) != 0 ? TextAlign.m13182boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM13196boximpl = (i & 32768) != 0 ? TextDirection.m13196boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long jM12663getLineHeightXSAIIZE = (i & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j11;
        TextIndent textIndent2 = (i & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i & 524288) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m12793copyNOaFTUo(j12, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, textAlignM13182boximpl, textDirectionM13196boximpl, jM12663getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m12781copyNs73l9s$default(TextStyle textStyle, Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion, int i11, Object obj) {
        TextMotion textMotion2;
        int i12;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i13;
        int i14;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j11;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j12;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j13;
        long j14;
        Brush brush2;
        float f7;
        int i15;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i11 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f;
        long fontSize = (i11 & 4) != 0 ? textStyle.spanStyle.getFontSize() : j7;
        FontWeight fontWeight3 = (i11 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle3 = (i11 & 16) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis3 = (i11 & 32) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily3 = (i11 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i11 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i11 & 256) != 0 ? textStyle.spanStyle.getLetterSpacing() : j8;
        BaselineShift baselineShift3 = (i11 & 512) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i11 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i11 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long background = (i11 & 4096) != 0 ? textStyle.spanStyle.getBackground() : j9;
        float f8 = alpha;
        TextDecoration background2 = (i11 & 8192) != 0 ? textStyle.spanStyle.getBackground() : textDecoration;
        Shadow shadow3 = (i11 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i11 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int iM12665getTextAligne0LSkKk = (i11 & 65536) != 0 ? textStyle.paragraphStyle.getTextAlign() : i;
        int iM12667getTextDirections_7Xco = (i11 & 131072) != 0 ? textStyle.paragraphStyle.getTextDirection() : i8;
        long jM12663getLineHeightXSAIIZE = (i11 & 262144) != 0 ? textStyle.paragraphStyle.getLineHeight() : j10;
        TextIndent textIndent3 = (i11 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i11 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i11 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iM12662getLineBreakrAG3T2k = (i11 & 4194304) != 0 ? textStyle.paragraphStyle.getLineBreak() : i9;
        int iM12660getHyphensvmbZdU8 = (i11 & 8388608) != 0 ? textStyle.paragraphStyle.getHyphens() : i10;
        if ((i11 & 16777216) != 0) {
            i12 = iM12660getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = background2;
            drawStyle2 = drawStyle3;
            i13 = iM12665getTextAligne0LSkKk;
            i14 = iM12667getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            i15 = iM12662getLineBreakrAG3T2k;
            shadow2 = shadow3;
            j11 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j12 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j13 = background;
            j14 = jM12663getLineHeightXSAIIZE;
            brush2 = brush;
            f7 = f8;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            i12 = iM12660getHyphensvmbZdU8;
            textDecoration2 = background2;
            drawStyle2 = drawStyle3;
            i13 = iM12665getTextAligne0LSkKk;
            i14 = iM12667getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j11 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            str2 = fontFeatureSettings;
            j12 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j13 = background;
            j14 = jM12663getLineHeightXSAIIZE;
            brush2 = brush;
            f7 = f8;
            i15 = iM12662getLineBreakrAG3T2k;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m12794copyNs73l9s(brush2, f7, j11, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j12, baselineShift2, textGeometricTransform2, localeList2, j13, textDecoration2, shadow2, drawStyle2, i13, i14, j14, textIndent2, platformTextStyle2, lineHeightStyle2, i15, i12, textMotion2);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m12782copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        TextAlign textAlign2;
        TextDirection textDirection2;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j11;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j12;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j13;
        long j14;
        Brush brush2;
        float f7;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i & 2) != 0 ? textStyle.spanStyle.getAlpha() : f;
        long fontSize = (i & 4) != 0 ? textStyle.spanStyle.getFontSize() : j7;
        FontWeight fontWeight3 = (i & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle3 = (i & 16) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis3 = (i & 32) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily3 = (i & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i & 256) != 0 ? textStyle.spanStyle.getLetterSpacing() : j8;
        BaselineShift baselineShift3 = (i & 512) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long background = (i & 4096) != 0 ? textStyle.spanStyle.getBackground() : j9;
        float f8 = alpha;
        TextDecoration background2 = (i & 8192) != 0 ? textStyle.spanStyle.getBackground() : textDecoration;
        Shadow shadow3 = (i & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM13182boximpl = (i & 65536) != 0 ? TextAlign.m13182boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM13196boximpl = (i & 131072) != 0 ? TextDirection.m13196boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long jM12663getLineHeightXSAIIZE = (i & 262144) != 0 ? textStyle.paragraphStyle.getLineHeight() : j10;
        TextIndent textIndent3 = (i & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM13090boximpl = (i & 4194304) != 0 ? LineBreak.m13090boximpl(textStyle.paragraphStyle.getLineBreak()) : lineBreak;
        Hyphens hyphensM13080boximpl = (i & 8388608) != 0 ? Hyphens.m13080boximpl(textStyle.paragraphStyle.getHyphens()) : hyphens;
        if ((i & 16777216) != 0) {
            hyphens2 = hyphensM13080boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = background2;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM13182boximpl;
            textDirection2 = textDirectionM13196boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = lineBreakM13090boximpl;
            shadow2 = shadow3;
            j11 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j12 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j13 = background;
            j14 = jM12663getLineHeightXSAIIZE;
            brush2 = brush;
            f7 = f8;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM13080boximpl;
            textDecoration2 = background2;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM13182boximpl;
            textDirection2 = textDirectionM13196boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j11 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            str2 = fontFeatureSettings;
            j12 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j13 = background;
            j14 = jM12663getLineHeightXSAIIZE;
            brush2 = brush;
            f7 = f8;
            lineBreak2 = lineBreakM13090boximpl;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m12795copyaIRg9q4(brush2, f7, j11, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j12, baselineShift2, textGeometricTransform2, localeList2, j13, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection2, j14, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m12783copyp1EtxEg$default(TextStyle textStyle, long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion, int i11, Object obj) {
        TextMotion textMotion2;
        int i12;
        long jM12711getColor0d7_KjU = (i11 & 1) != 0 ? textStyle.spanStyle.m12711getColor0d7_KjU() : j7;
        long fontSize = (i11 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j8;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i11 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i11 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i11 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i11 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i11 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j9;
        BaselineShift baselineShift2 = (i11 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j12 = jM12711getColor0d7_KjU;
        long background = (i11 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j10;
        TextDecoration background2 = (i11 & 4096) != 0 ? textStyle.spanStyle.getBackground() : textDecoration;
        Shadow shadow2 = (i11 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration2 = background2;
        DrawStyle drawStyle2 = (i11 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int iM12665getTextAligne0LSkKk = (i11 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : i;
        int iM12667getTextDirections_7Xco = (i11 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : i8;
        long jM12663getLineHeightXSAIIZE = (i11 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j11;
        TextIndent textIndent2 = (i11 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i11 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i11 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iM12662getLineBreakrAG3T2k = (i11 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : i9;
        int iM12660getHyphensvmbZdU8 = (i11 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : i10;
        if ((i11 & 8388608) != 0) {
            i12 = iM12660getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i12 = iM12660getHyphensvmbZdU8;
        }
        return textStyle.m12796copyp1EtxEg(j12, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, drawStyle2, iM12665getTextAligne0LSkKk, iM12667getTextDirections_7Xco, jM12663getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, iM12662getLineBreakrAG3T2k, i12, textMotion2);
    }

    /* renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m12784copyv2rsoow$default(TextStyle textStyle, long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        long jM12711getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m12711getColor0d7_KjU() : j7;
        long fontSize = (i & 2) != 0 ? textStyle.spanStyle.getFontSize() : j8;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j9;
        BaselineShift baselineShift2 = (i & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j12 = jM12711getColor0d7_KjU;
        long background = (i & 2048) != 0 ? textStyle.spanStyle.getBackground() : j10;
        TextDecoration background2 = (i & 4096) != 0 ? textStyle.spanStyle.getBackground() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration2 = background2;
        DrawStyle drawStyle2 = (i & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM13182boximpl = (i & 32768) != 0 ? TextAlign.m13182boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM13196boximpl = (i & 65536) != 0 ? TextDirection.m13196boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long jM12663getLineHeightXSAIIZE = (i & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j11;
        TextIndent textIndent2 = (i & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM13090boximpl = (i & 2097152) != 0 ? LineBreak.m13090boximpl(textStyle.paragraphStyle.getLineBreak()) : lineBreak;
        Hyphens hyphensM13080boximpl = (i & 4194304) != 0 ? Hyphens.m13080boximpl(textStyle.paragraphStyle.getHyphens()) : hyphens;
        if ((i & 8388608) != 0) {
            hyphens2 = hyphensM13080boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM13080boximpl;
        }
        return textStyle.m12797copyv2rsoow(j12, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, drawStyle2, textAlignM13182boximpl, textDirectionM13196boximpl, jM12663getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreakM13090boximpl, hyphens2, textMotion2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m12785getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m12786getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m12787getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m12788getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m12791copyCXVQc50(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m10683equalsimpl0(color, this.spanStyle.m12711getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m13210from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, getDrawStyle(), (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), getTextMotion(), (AbstractC5824e) null), platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m12792copyHL5avdY(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new TextStyle(new SpanStyle(Color.m10683equalsimpl0(color, this.spanStyle.m12711getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m13210from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), lineHeight, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m12808getLineBreakrAG3T2k(), m12805getHyphensvmbZdU8(), getTextMotion(), (AbstractC5824e) null), this.platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m12793copyNOaFTUo(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m10683equalsimpl0(color, this.spanStyle.m12711getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m13210from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, m12808getLineBreakrAG3T2k(), m12805getHyphensvmbZdU8(), getTextMotion(), (AbstractC5824e) null), platformStyle);
    }

    @NotNull
    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m12794copyNs73l9s(@Nullable Brush brush, float alpha, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (AbstractC5824e) null), platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m12795copyaIRg9q4(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), textMotion, (AbstractC5824e) null), platformStyle);
    }

    @NotNull
    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m12796copyp1EtxEg(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m10683equalsimpl0(color, this.spanStyle.m12711getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m13210from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (AbstractC5824e) null), platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m12797copyv2rsoow(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m10683equalsimpl0(color, this.spanStyle.m12711getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m13210from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), textMotion, (AbstractC5824e) null), platformStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return AbstractC5830k.m5325b(this.spanStyle, textStyle.spanStyle) && AbstractC5830k.m5325b(this.paragraphStyle, textStyle.paragraphStyle) && AbstractC5830k.m5325b(this.platformStyle, textStyle.platformStyle);
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m12798getBackground0d7_KjU() {
        return this.spanStyle.getBackground();
    }

    @Nullable
    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m12799getBaselineShift5SSeXJ0() {
        return this.spanStyle.getBaselineShift();
    }

    @Nullable
    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m12800getColor0d7_KjU() {
        return this.spanStyle.m12711getColor0d7_KjU();
    }

    @Nullable
    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m12801getFontSizeXSAIIZE() {
        return this.spanStyle.getFontSize();
    }

    @Nullable
    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m12802getFontStyle4Lr2A7w() {
        return this.spanStyle.getFontStyle();
    }

    @Nullable
    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m12803getFontSynthesisZQGJjVo() {
        return this.spanStyle.getFontSynthesis();
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    @JvmName(name = "getHyphens-EaSxIns")
    @Nullable
    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m12804getHyphensEaSxIns() {
        return Hyphens.m13080boximpl(m12805getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m12805getHyphensvmbZdU8() {
        return this.paragraphStyle.getHyphens();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m12806getLetterSpacingXSAIIZE() {
        return this.spanStyle.getLetterSpacing();
    }

    @JvmName(name = "getLineBreak-LgCVezo")
    @Nullable
    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m12807getLineBreakLgCVezo() {
        return LineBreak.m13090boximpl(m12808getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m12808getLineBreakrAG3T2k() {
        return this.paragraphStyle.getLineBreak();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m12809getLineHeightXSAIIZE() {
        return this.paragraphStyle.getLineHeight();
    }

    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    @NotNull
    /* renamed from: getParagraphStyle$ui_text_release, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @Nullable
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    @NotNull
    /* renamed from: getSpanStyle$ui_text_release, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    @JvmName(name = "getTextAlign-buA522U")
    @Nullable
    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m12810getTextAlignbuA522U() {
        return TextAlign.m13182boximpl(m12811getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m12811getTextAligne0LSkKk() {
        return this.paragraphStyle.getTextAlign();
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getBackground();
    }

    @JvmName(name = "getTextDirection-mmuk1to")
    @Nullable
    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m12812getTextDirectionmmuk1to() {
        return TextDirection.m13196boximpl(m12813getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m12813getTextDirections_7Xco() {
        return this.paragraphStyle.getTextDirection();
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    @Nullable
    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(@NotNull TextStyle other) {
        return this == other || this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(other.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(@NotNull TextStyle other) {
        if (this != other) {
            return AbstractC5830k.m5325b(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(other.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCode() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iHashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    @Stable
    @NotNull
    public final TextStyle merge(@Nullable TextStyle other) {
        return (other == null || other.equals(Default)) ? this : new TextStyle(toSpanStyle().merge(other.toSpanStyle()), toParagraphStyle().merge(other.toParagraphStyle()));
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m12814mergeZ1GrekI(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformStyle, TextMotion textMotion) {
        SpanStyle spanStyleM12716fastMergedSHsh3o = SpanStyleKt.m12716fastMergedSHsh3o(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM12668fastMergej5T8yCg = ParagraphStyleKt.m12668fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == spanStyleM12716fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM12668fastMergej5T8yCg) ? this : new TextStyle(spanStyleM12716fastMergedSHsh3o, paragraphStyleM12668fastMergej5T8yCg);
    }

    @Stable
    @NotNull
    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m12815mergedA7vx0o(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable PlatformTextStyle platformStyle, @Nullable TextMotion textMotion) {
        SpanStyle spanStyleM12716fastMergedSHsh3o = SpanStyleKt.m12716fastMergedSHsh3o(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM12668fastMergej5T8yCg = ParagraphStyleKt.m12668fastMergej5T8yCg(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == spanStyleM12716fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM12668fastMergej5T8yCg) ? this : new TextStyle(spanStyleM12716fastMergedSHsh3o, paragraphStyleM12668fastMergej5T8yCg);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull TextStyle other) {
        return merge(other);
    }

    @Stable
    @NotNull
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    @NotNull
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    @NotNull
    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m10690toStringimpl(m12800getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m13506toStringimpl(m12801getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m12802getFontStyle4Lr2A7w() + ", fontSynthesis=" + m12803getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m13506toStringimpl(m12806getLetterSpacingXSAIIZE())) + ", baselineShift=" + m12799getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m10690toStringimpl(m12798getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m13187toStringimpl(m12811getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m13201toStringimpl(m12813getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m13506toStringimpl(m12809getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m13101toStringimpl(m12808getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m13085toStringimpl(m12805getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC5824e abstractC5824e) {
        this(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, drawStyle, textAlign, textDirection, j11, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull ParagraphStyle other) {
        return merge(other);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, AbstractC5824e abstractC5824e) {
        this(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, textAlign, textDirection, j11, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull SpanStyle other) {
        return merge(other);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, AbstractC5824e abstractC5824e) {
        this(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, textAlign, textDirection, j11, textIndent, platformTextStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, AbstractC5824e abstractC5824e) {
        this(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, textAlign, textDirection, j11, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion, AbstractC5824e abstractC5824e) {
        this(brush, f, j7, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j8, baselineShift, textGeometricTransform, localeList, j9, textDecoration, shadow, drawStyle, i, i8, j10, textIndent, platformTextStyle, lineHeightStyle, i9, i10, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC5824e abstractC5824e) {
        this(brush, f, j7, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j8, baselineShift, textGeometricTransform, localeList, j9, textDecoration, shadow, drawStyle, textAlign, textDirection, j10, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull SpanStyle other) {
        return new TextStyle(toSpanStyle().merge(other), toParagraphStyle());
    }

    public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle, @Nullable PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull ParagraphStyle other) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(other));
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i, AbstractC5824e abstractC5824e) {
        this(spanStyle, paragraphStyle, (i & 4) != 0 ? null : platformTextStyle);
    }

    public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, int i, AbstractC5824e abstractC5824e) {
        long jM10718getUnspecified0d7_KjU = (i & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM13510getUnspecifiedXSAIIZE = (i & 2) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j8;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        long jM13510getUnspecifiedXSAIIZE2 = (i & 128) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j9;
        BaselineShift baselineShift2 = (i & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        long jM10718getUnspecified0d7_KjU2 = (i & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? null : textDecoration;
        long j12 = jM10718getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & 32768) != 0 ? null : textDirection;
        long jM13510getUnspecifiedXSAIIZE3 = (i & 65536) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j11;
        long j13 = jM13510getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j14 = jM13510getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j15 = jM10718getUnspecified0d7_KjU2;
        this(j12, j13, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j14, baselineShift3, textGeometricTransform3, localeList3, j15, textDecoration3, shadow2, textAlign2, textDirection2, jM13510getUnspecifiedXSAIIZE3, (i & 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent) {
        SpanStyle spanStyle = new SpanStyle(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (AbstractC5824e) null);
        this(spanStyle, new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), j11, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC5824e) null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, AbstractC5824e abstractC5824e) {
        long jM10718getUnspecified0d7_KjU = (i & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM13510getUnspecifiedXSAIIZE = (i & 2) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j8;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        long jM13510getUnspecifiedXSAIIZE2 = (i & 128) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j9;
        BaselineShift baselineShift2 = (i & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        long jM10718getUnspecified0d7_KjU2 = (i & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? null : textDecoration;
        long j12 = jM10718getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & 32768) != 0 ? null : textDirection;
        long jM13510getUnspecifiedXSAIIZE3 = (i & 65536) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j11;
        TextIndent textIndent2 = (i & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & 262144) != 0 ? null : platformTextStyle;
        long j13 = jM13510getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j14 = jM13510getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j15 = jM10718getUnspecified0d7_KjU2;
        this(j12, j13, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j14, baselineShift3, textGeometricTransform3, localeList3, j15, textDecoration3, shadow2, textAlign2, textDirection2, jM13510getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, (i & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), j11, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC5824e) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, AbstractC5824e abstractC5824e) {
        long jM10718getUnspecified0d7_KjU = (i & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM13510getUnspecifiedXSAIIZE = (i & 2) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j8;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        long jM13510getUnspecifiedXSAIIZE2 = (i & 128) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j9;
        BaselineShift baselineShift2 = (i & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        long jM10718getUnspecified0d7_KjU2 = (i & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? null : textDecoration;
        long j12 = jM10718getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & 32768) != 0 ? null : textDirection;
        long jM13510getUnspecifiedXSAIIZE3 = (i & 65536) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j11;
        TextIndent textIndent2 = (i & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & 262144) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 524288) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i & 1048576) != 0 ? null : lineBreak;
        long j13 = jM13510getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j14 = jM13510getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j15 = jM10718getUnspecified0d7_KjU2;
        this(j12, j13, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j14, baselineShift3, textGeometricTransform3, localeList3, j15, textDecoration3, shadow2, textAlign2, textDirection2, jM13510getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, (i & 2097152) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        SpanStyle spanStyle = new SpanStyle(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, 32768, (AbstractC5824e) null);
        int value = textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk();
        int value2 = textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco();
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        this(spanStyle, new ParagraphStyle(value, value2, j11, textIndent, paragraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), (TextMotion) null, 256, (AbstractC5824e) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, AbstractC5824e abstractC5824e) {
        long jM10718getUnspecified0d7_KjU = (i & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM13510getUnspecifiedXSAIIZE = (i & 2) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j8;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        long jM13510getUnspecifiedXSAIIZE2 = (i & 128) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j9;
        BaselineShift baselineShift2 = (i & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        long jM10718getUnspecified0d7_KjU2 = (i & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? null : textDecoration;
        long j12 = jM10718getUnspecified0d7_KjU;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i & 16384) != 0 ? null : drawStyle;
        TextAlign textAlign2 = (i & 32768) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i & 65536) != 0 ? null : textDirection;
        long jM13510getUnspecifiedXSAIIZE3 = (i & 131072) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j11;
        TextIndent textIndent2 = (i & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 1048576) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i & 2097152) != 0 ? null : lineBreak;
        Hyphens hyphens2 = (i & 4194304) != 0 ? null : hyphens;
        long j13 = jM13510getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j14 = jM13510getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j15 = jM10718getUnspecified0d7_KjU2;
        this(j12, j13, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j14, baselineShift3, textGeometricTransform3, localeList3, j15, textDecoration3, shadow2, drawStyle2, textAlign2, textDirection2, jM13510getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, (i & 8388608) != 0 ? null : textMotion, (AbstractC5824e) null);
    }

    private TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), j11, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), textMotion, (AbstractC5824e) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion, int i11, AbstractC5824e abstractC5824e) {
        long jM10718getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM13510getUnspecifiedXSAIIZE = (i11 & 2) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j8;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i11 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i11 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i11 & 32) != 0 ? null : fontFamily;
        String str2 = (i11 & 64) != 0 ? null : str;
        long jM13510getUnspecifiedXSAIIZE2 = (i11 & 128) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j9;
        BaselineShift baselineShift2 = (i11 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? null : localeList;
        long jM10718getUnspecified0d7_KjU2 = (i11 & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        TextDecoration textDecoration2 = (i11 & 4096) != 0 ? null : textDecoration;
        long j12 = jM10718getUnspecified0d7_KjU;
        Shadow shadow2 = (i11 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i11 & 16384) != 0 ? null : drawStyle;
        int iM13195getUnspecifiede0LSkKk = (i11 & 32768) != 0 ? TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk() : i;
        int iM13208getUnspecifieds_7Xco = (i11 & 65536) != 0 ? TextDirection.INSTANCE.m13208getUnspecifieds_7Xco() : i8;
        long jM13510getUnspecifiedXSAIIZE3 = (i11 & 131072) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j11;
        TextIndent textIndent2 = (i11 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i11 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i11 & 1048576) != 0 ? null : lineHeightStyle;
        int iM13110getUnspecifiedrAG3T2k = (i11 & 2097152) != 0 ? LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k() : i9;
        int iM13089getUnspecifiedvmbZdU8 = (i11 & 4194304) != 0 ? Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8() : i10;
        long j13 = jM13510getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j14 = jM13510getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j15 = jM10718getUnspecified0d7_KjU2;
        this(j12, j13, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j14, baselineShift3, textGeometricTransform3, localeList3, j15, textDecoration3, shadow2, drawStyle2, iM13195getUnspecifiede0LSkKk, iM13208getUnspecifieds_7Xco, jM13510getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, iM13110getUnspecifiedrAG3T2k, iM13089getUnspecifiedvmbZdU8, (i11 & 8388608) != 0 ? null : textMotion, (AbstractC5824e) null);
    }

    private TextStyle(long j7, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion) {
        this(new SpanStyle(j7, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(i, i8, j11, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i9, i10, textMotion, (AbstractC5824e) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion, int i11, AbstractC5824e abstractC5824e) {
        this(brush, (i11 & 2) != 0 ? Float.NaN : f, (i11 & 4) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j7, (i11 & 8) != 0 ? null : fontWeight, (i11 & 16) != 0 ? null : fontStyle, (i11 & 32) != 0 ? null : fontSynthesis, (i11 & 64) != 0 ? null : fontFamily, (i11 & 128) != 0 ? null : str, (i11 & 256) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j8, (i11 & 512) != 0 ? null : baselineShift, (i11 & 1024) != 0 ? null : textGeometricTransform, (i11 & 2048) != 0 ? null : localeList, (i11 & 4096) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9, (i11 & 8192) != 0 ? null : textDecoration, (i11 & 16384) != 0 ? null : shadow, (32768 & i11) != 0 ? null : drawStyle, (65536 & i11) != 0 ? TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk() : i, (131072 & i11) != 0 ? TextDirection.INSTANCE.m13208getUnspecifieds_7Xco() : i8, (262144 & i11) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j10, (524288 & i11) != 0 ? null : textIndent, (1048576 & i11) != 0 ? null : platformTextStyle, (2097152 & i11) != 0 ? null : lineHeightStyle, (4194304 & i11) != 0 ? LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k() : i9, (8388608 & i11) != 0 ? Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8() : i10, (i11 & 16777216) != 0 ? null : textMotion, (AbstractC5824e) null);
    }

    private TextStyle(Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i8, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i9, int i10, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j7, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j8, baselineShift, textGeometricTransform, localeList, j9, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(i, i8, j10, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i9, i10, textMotion, (AbstractC5824e) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, AbstractC5824e abstractC5824e) {
        this(brush, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j7, (i & 8) != 0 ? null : fontWeight, (i & 16) != 0 ? null : fontStyle, (i & 32) != 0 ? null : fontSynthesis, (i & 64) != 0 ? null : fontFamily, (i & 128) != 0 ? null : str, (i & 256) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j8, (i & 512) != 0 ? null : baselineShift, (i & 1024) != 0 ? null : textGeometricTransform, (i & 2048) != 0 ? null : localeList, (i & 4096) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9, (i & 8192) != 0 ? null : textDecoration, (i & 16384) != 0 ? null : shadow, (32768 & i) != 0 ? null : drawStyle, (65536 & i) != 0 ? null : textAlign, (131072 & i) != 0 ? null : textDirection, (262144 & i) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : j10, (524288 & i) != 0 ? null : textIndent, (1048576 & i) != 0 ? null : platformTextStyle, (2097152 & i) != 0 ? null : lineHeightStyle, (4194304 & i) != 0 ? null : lineBreak, (8388608 & i) != 0 ? null : hyphens, (i & 16777216) != 0 ? null : textMotion, (AbstractC5824e) null);
    }

    private TextStyle(Brush brush, float f, long j7, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j8, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j9, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j7, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j8, baselineShift, textGeometricTransform, localeList, j9, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC5824e) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m13208getUnspecifieds_7Xco(), j10, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8(), textMotion, (AbstractC5824e) null), platformTextStyle);
    }
}
