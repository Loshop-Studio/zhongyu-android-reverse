package androidx.compose.p013ui.text;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.Hyphens;
import androidx.compose.p013ui.text.style.LineBreak;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextDirection;
import androidx.compose.p013ui.text.style.TextForegroundStyle;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(m13557d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bU\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 £\u00012\u00020\u0001:\u0002£\u0001B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006BÕ\u0001\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010(Bí\u0001\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010-B\u0085\u0002\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101¢\u0006\u0002\u00102B\u009d\u0002\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u00107B\u0095\u0002\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020/\u0012\b\b\u0002\u00100\u001a\u000201\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u00108B\u009f\u0002\b\u0016\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010;\u001a\u00020<\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020/\u0012\b\b\u0002\u00100\u001a\u000201\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010=B§\u0002\b\u0017\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010;\u001a\u00020<\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010>B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010?J«\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00105\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001Jµ\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J¡\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00105\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J«\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001Jã\u0001\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0007ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001Jû\u0001\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0093\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0007ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0016\u0010\u0091\u0001\u001a\u00030\u0092\u00012\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0011\u0010\u0094\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0000J\u0011\u0010\u0095\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0000J\n\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016J\u0010\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0000¢\u0006\u0003\b\u0099\u0001J£\u0002\u0010\u009a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J«\u0002\u0010\u009a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0012\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0005H\u0007J\u0012\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0003H\u0007J\u0016\u0010\u009a\u0001\u001a\u00020\u00002\u000b\b\u0002\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0000H\u0007J\u0013\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0005H\u0087\u0002J\u0013\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0003H\u0087\u0002J\u0013\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0000H\u0087\u0002J\t\u0010 \u0001\u001a\u00020\u0005H\u0007J\t\u0010¡\u0001\u001a\u00020\u0003H\u0007J\t\u0010¢\u0001\u001a\u00020\u0014H\u0016R\u0011\u0010;\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010\u001c\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010CR\"\u0010I\u001a\u0004\u0018\u0001018GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010N\u001a\u0004\u0018\u00010/8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bO\u0010K\u001a\u0004\bP\u0010QR\"\u0010R\u001a\u0004\u0018\u00010\"8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bS\u0010K\u001a\u0004\bT\u0010UR\"\u0010V\u001a\u0004\u0018\u00010$8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bW\u0010K\u001a\u0004\bX\u0010YR\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0017\u0010\t\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b`\u0010CR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000e8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0017\u00100\u001a\u0002018Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0017\u0010\u0015\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bi\u0010CR\u0017\u0010.\u001a\u00020/8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0017\u0010%\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u0010CR\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0017\u0010!\u001a\u00020\"8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bx\u0010hR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0017\u0010#\u001a\u00020$8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b{\u0010hR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u00105\u001a\u0004\u0018\u0001068F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0001"}, m13558d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getHyphens-vmbZdU8", "()I", "getLetterSpacing-XSAIIZE", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getParagraphStyle$ui_text_release", "()Landroidx/compose/ui/text/ParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getSpanStyle$ui_text_release", "()Landroidx/compose/ui/text/SpanStyle;", "getTextAlign-e0LSkKk", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextDirection-s_7X-co", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-Ns73l9s", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-aIRg9q4", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-p1EtxEg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-v2rsoow", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy-NOaFTUo", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-CXVQc50", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/TextStyle;", "equals", "", "other", "hasSameDrawAffectingAttributes", "hasSameLayoutAffectingAttributes", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text_release", "merge", "merge-dA7vx0o", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "merge-Z1GrekI", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "plus", "toParagraphStyle", "toSpanStyle", "toString", "Companion", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class TextStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (DefaultConstructorMarker) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, drawStyle, i10, i11, j14, textIndent, platformTextStyle, lineHeightStyle, i12, i13, textMotion);
    }

    /* renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m23035copyCXVQc50$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, Object obj) {
        Hyphens hyphensM23336boximpl;
        LineBreak lineBreak2;
        long jM22968getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m22968getColor0d7_KjU() : j10;
        long fontSize = (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM22968getColor0d7_KjU;
        long background = (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlignM23438boximpl = (i10 & 16384) != 0 ? TextAlign.m23438boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM23452boximpl = (i10 & 32768) != 0 ? TextDirection.m23452boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long lineHeight = (i10 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM23346boximpl = (i10 & 1048576) != 0 ? LineBreak.m23346boximpl(textStyle.paragraphStyle.getLineBreak()) : lineBreak;
        if ((i10 & 2097152) != 0) {
            lineBreak2 = lineBreakM23346boximpl;
            hyphensM23336boximpl = Hyphens.m23336boximpl(textStyle.paragraphStyle.getHyphens());
        } else {
            hyphensM23336boximpl = hyphens;
            lineBreak2 = lineBreakM23346boximpl;
        }
        return textStyle.m23048copyCXVQc50(j15, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, textAlignM23438boximpl, textDirectionM23452boximpl, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphensM23336boximpl);
    }

    /* renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m23036copyHL5avdY$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, int i10, Object obj) {
        long jM22968getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m22968getColor0d7_KjU() : j10;
        return textStyle.m23049copyHL5avdY(jM22968getColor0d7_KjU, (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11, (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight, (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle, (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis, (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str, (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12, (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift, (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList, (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13, (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration, (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow, (i10 & 16384) != 0 ? TextAlign.m23438boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign, (i10 & 32768) != 0 ? TextDirection.m23452boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection, (i10 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14, (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m23037copyNOaFTUo$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, Object obj) {
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long jM22968getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m22968getColor0d7_KjU() : j10;
        long fontSize = (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM22968getColor0d7_KjU;
        long background = (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlignM23438boximpl = (i10 & 16384) != 0 ? TextAlign.m23438boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM23452boximpl = (i10 & 32768) != 0 ? TextDirection.m23452boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long lineHeight = (i10 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i10 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i10 & 524288) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m23050copyNOaFTUo(j15, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, textAlignM23438boximpl, textDirectionM23452boximpl, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m23038copyNs73l9s$default(TextStyle textStyle, Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, Object obj) {
        TextMotion textMotion2;
        int i15;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i16;
        int i17;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j14;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j15;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j16;
        long j17;
        Brush brush2;
        float f11;
        int i18;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i14 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f10;
        long fontSize = (i14 & 4) != 0 ? textStyle.spanStyle.getFontSize() : j10;
        FontWeight fontWeight3 = (i14 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle3 = (i14 & 16) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis3 = (i14 & 32) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily3 = (i14 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i14 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i14 & 256) != 0 ? textStyle.spanStyle.getLetterSpacing() : j11;
        BaselineShift baselineShift3 = (i14 & 512) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i14 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i14 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long background = (i14 & 4096) != 0 ? textStyle.spanStyle.getBackground() : j12;
        float f12 = alpha;
        TextDecoration textDecoration3 = (i14 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i14 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i14 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int textAlign = (i14 & 65536) != 0 ? textStyle.paragraphStyle.getTextAlign() : i10;
        int textDirection = (i14 & 131072) != 0 ? textStyle.paragraphStyle.getTextDirection() : i11;
        long lineHeight = (i14 & 262144) != 0 ? textStyle.paragraphStyle.getLineHeight() : j13;
        TextIndent textIndent3 = (i14 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i14 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i14 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int lineBreak = (i14 & 4194304) != 0 ? textStyle.paragraphStyle.getLineBreak() : i12;
        int hyphens = (i14 & 8388608) != 0 ? textStyle.paragraphStyle.getHyphens() : i13;
        if ((i14 & 16777216) != 0) {
            i15 = hyphens;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i16 = textAlign;
            i17 = textDirection;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            i18 = lineBreak;
            shadow2 = shadow3;
            j14 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j15 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = background;
            j17 = lineHeight;
            brush2 = brush;
            f11 = f12;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            i15 = hyphens;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i16 = textAlign;
            i17 = textDirection;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j14 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            str2 = fontFeatureSettings;
            j15 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = background;
            j17 = lineHeight;
            brush2 = brush;
            f11 = f12;
            i18 = lineBreak;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m23051copyNs73l9s(brush2, f11, j14, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j15, baselineShift2, textGeometricTransform2, localeList2, j16, textDecoration2, shadow2, drawStyle2, i16, i17, j17, textIndent2, platformTextStyle2, lineHeightStyle2, i18, i15, textMotion2);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m23039copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
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
        long j14;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j15;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j16;
        long j17;
        Brush brush2;
        float f11;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i10 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f10;
        long fontSize = (i10 & 4) != 0 ? textStyle.spanStyle.getFontSize() : j10;
        FontWeight fontWeight3 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle3 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis3 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily3 = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 256) != 0 ? textStyle.spanStyle.getLetterSpacing() : j11;
        BaselineShift baselineShift3 = (i10 & 512) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i10 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i10 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long background = (i10 & 4096) != 0 ? textStyle.spanStyle.getBackground() : j12;
        float f12 = alpha;
        TextDecoration textDecoration3 = (i10 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i10 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i10 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM23438boximpl = (i10 & 65536) != 0 ? TextAlign.m23438boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM23452boximpl = (i10 & 131072) != 0 ? TextDirection.m23452boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long lineHeight = (i10 & 262144) != 0 ? textStyle.paragraphStyle.getLineHeight() : j13;
        TextIndent textIndent3 = (i10 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i10 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i10 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM23346boximpl = (i10 & 4194304) != 0 ? LineBreak.m23346boximpl(textStyle.paragraphStyle.getLineBreak()) : lineBreak;
        Hyphens hyphensM23336boximpl = (i10 & 8388608) != 0 ? Hyphens.m23336boximpl(textStyle.paragraphStyle.getHyphens()) : hyphens;
        if ((i10 & 16777216) != 0) {
            hyphens2 = hyphensM23336boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM23438boximpl;
            textDirection2 = textDirectionM23452boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = lineBreakM23346boximpl;
            shadow2 = shadow3;
            j14 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j15 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = background;
            j17 = lineHeight;
            brush2 = brush;
            f11 = f12;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM23336boximpl;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM23438boximpl;
            textDirection2 = textDirectionM23452boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j14 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            str2 = fontFeatureSettings;
            j15 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = background;
            j17 = lineHeight;
            brush2 = brush;
            f11 = f12;
            lineBreak2 = lineBreakM23346boximpl;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m23052copyaIRg9q4(brush2, f11, j14, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j15, baselineShift2, textGeometricTransform2, localeList2, j16, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection2, j17, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m23040copyp1EtxEg$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, Object obj) {
        TextMotion textMotion2;
        int i15;
        long jM22968getColor0d7_KjU = (i14 & 1) != 0 ? textStyle.spanStyle.m22968getColor0d7_KjU() : j10;
        long fontSize = (i14 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeight2 = (i14 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i14 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i14 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i14 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i14 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i14 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        BaselineShift baselineShift2 = (i14 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i14 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i14 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM22968getColor0d7_KjU;
        long background = (i14 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13;
        TextDecoration textDecoration2 = (i14 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i14 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i14 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int textAlign = (i14 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : i10;
        int textDirection = (i14 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : i11;
        long lineHeight = (i14 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndent2 = (i14 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i14 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int lineBreak = (i14 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : i12;
        int hyphens = (i14 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : i13;
        if ((i14 & 8388608) != 0) {
            i15 = hyphens;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i15 = hyphens;
        }
        return textStyle.m23053copyp1EtxEg(j15, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, drawStyle2, textAlign, textDirection, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak, i15, textMotion2);
    }

    /* renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m23041copyv2rsoow$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        long jM22968getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m22968getColor0d7_KjU() : j10;
        long fontSize = (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM22968getColor0d7_KjU;
        long background = (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i10 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM23438boximpl = (i10 & 32768) != 0 ? TextAlign.m23438boximpl(textStyle.paragraphStyle.getTextAlign()) : textAlign;
        TextDirection textDirectionM23452boximpl = (i10 & 65536) != 0 ? TextDirection.m23452boximpl(textStyle.paragraphStyle.getTextDirection()) : textDirection;
        long lineHeight = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndent2 = (i10 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM23346boximpl = (i10 & 2097152) != 0 ? LineBreak.m23346boximpl(textStyle.paragraphStyle.getLineBreak()) : lineBreak;
        Hyphens hyphensM23336boximpl = (i10 & 4194304) != 0 ? Hyphens.m23336boximpl(textStyle.paragraphStyle.getHyphens()) : hyphens;
        if ((i10 & 8388608) != 0) {
            hyphens2 = hyphensM23336boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM23336boximpl;
        }
        return textStyle.m23054copyv2rsoow(j15, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, drawStyle2, textAlignM23438boximpl, textDirectionM23452boximpl, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreakM23346boximpl, hyphens2, textMotion2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m23042getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m23043getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m23044getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m23045getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m23048copyCXVQc50(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m20977equalsimpl0(color, this.spanStyle.m22968getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m23466from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, getDrawStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m23049copyHL5avdY(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new TextStyle(new SpanStyle(Color.m20977equalsimpl0(color, this.spanStyle.m22968getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m23466from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m23065getLineBreakrAG3T2k(), m23062getHyphensvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), this.platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m23050copyNOaFTUo(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m20977equalsimpl0(color, this.spanStyle.m22968getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m23466from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, m23065getLineBreakrAG3T2k(), m23062getHyphensvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), platformStyle);
    }

    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m23051copyNs73l9s(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m23052copyaIRg9q4(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformStyle);
    }

    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m23053copyp1EtxEg(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m20977equalsimpl0(color, this.spanStyle.m22968getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m23466from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m23054copyv2rsoow(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m20977equalsimpl0(color, this.spanStyle.m22968getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m23466from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Intrinsics.areEqual(this.spanStyle, textStyle.spanStyle) && Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.areEqual(this.platformStyle, textStyle.platformStyle);
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m23055getBackground0d7_KjU() {
        return this.spanStyle.getBackground();
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m23056getBaselineShift5SSeXJ0() {
        return this.spanStyle.getBaselineShift();
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m23057getColor0d7_KjU() {
        return this.spanStyle.m22968getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m23058getFontSizeXSAIIZE() {
        return this.spanStyle.getFontSize();
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m23059getFontStyle4Lr2A7w() {
        return this.spanStyle.getFontStyle();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m23060getFontSynthesisZQGJjVo() {
        return this.spanStyle.getFontSynthesis();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    @JvmName(name = "getHyphens-EaSxIns")
    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m23061getHyphensEaSxIns() {
        return Hyphens.m23336boximpl(m23062getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m23062getHyphensvmbZdU8() {
        return this.paragraphStyle.getHyphens();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m23063getLetterSpacingXSAIIZE() {
        return this.spanStyle.getLetterSpacing();
    }

    @JvmName(name = "getLineBreak-LgCVezo")
    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m23064getLineBreakLgCVezo() {
        return LineBreak.m23346boximpl(m23065getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m23065getLineBreakrAG3T2k() {
        return this.paragraphStyle.getLineBreak();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m23066getLineHeightXSAIIZE() {
        return this.paragraphStyle.getLineHeight();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    /* renamed from: getParagraphStyle$ui_text_release, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    /* renamed from: getSpanStyle$ui_text_release, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    @JvmName(name = "getTextAlign-buA522U")
    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m23067getTextAlignbuA522U() {
        return TextAlign.m23438boximpl(m23068getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m23068getTextAligne0LSkKk() {
        return this.paragraphStyle.getTextAlign();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    @JvmName(name = "getTextDirection-mmuk1to")
    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m23069getTextDirectionmmuk1to() {
        return TextDirection.m23452boximpl(m23070getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m23070getTextDirections_7Xco() {
        return this.paragraphStyle.getTextDirection();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle other) {
        return this == other || this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(other.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle other) {
        if (this != other) {
            return Intrinsics.areEqual(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(other.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iHashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCodeLayoutAffectingAttributes$ui_text_release + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    @Stable
    public final TextStyle merge(TextStyle other) {
        return (other == null || Intrinsics.areEqual(other, Default)) ? this : new TextStyle(toSpanStyle().merge(other.toSpanStyle()), toParagraphStyle().merge(other.toParagraphStyle()));
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m23071mergeZ1GrekI(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformStyle, TextMotion textMotion) {
        SpanStyle spanStyleM22973fastMergedSHsh3o = SpanStyleKt.m22973fastMergedSHsh3o(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM22925fastMergej5T8yCg = ParagraphStyleKt.m22925fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == spanStyleM22973fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM22925fastMergej5T8yCg) ? this : new TextStyle(spanStyleM22973fastMergedSHsh3o, paragraphStyleM22925fastMergej5T8yCg);
    }

    @Stable
    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m23072mergedA7vx0o(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, PlatformTextStyle platformStyle, TextMotion textMotion) {
        SpanStyle spanStyleM22973fastMergedSHsh3o = SpanStyleKt.m22973fastMergedSHsh3o(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM22925fastMergej5T8yCg = ParagraphStyleKt.m22925fastMergej5T8yCg(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == spanStyleM22973fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM22925fastMergej5T8yCg) ? this : new TextStyle(spanStyleM22973fastMergedSHsh3o, paragraphStyleM22925fastMergej5T8yCg);
    }

    @Stable
    public final TextStyle plus(TextStyle other) {
        return merge(other);
    }

    @Stable
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m20984toStringimpl(m23057getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m23762toStringimpl(m23058getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m23059getFontStyle4Lr2A7w() + ", fontSynthesis=" + m23060getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m23762toStringimpl(m23063getLetterSpacingXSAIIZE())) + ", baselineShift=" + m23056getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m20984toStringimpl(m23055getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m23443toStringimpl(m23068getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m23457toStringimpl(m23070getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m23762toStringimpl(m23066getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m23357toStringimpl(m23065getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m23341toStringimpl(m23062getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, drawStyle, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Stable
    public final TextStyle plus(ParagraphStyle other) {
        return merge(other);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Stable
    public final TextStyle plus(SpanStyle other) {
        return merge(other);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, drawStyle, i10, i11, j13, textIndent, platformTextStyle, lineHeightStyle, i12, i13, textMotion);
    }

    @Stable
    public final TextStyle merge(SpanStyle other) {
        return new TextStyle(toSpanStyle().merge(other), toParagraphStyle());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, drawStyle, textAlign, textDirection, j13, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    public final TextStyle merge(ParagraphStyle other) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(other));
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanStyle, paragraphStyle, (i10 & 4) != 0 ? null : platformTextStyle);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jM21012getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM23766getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM23766getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM21012getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM21012getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM23766getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j14;
        long j16 = jM23766getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM23766getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM21012getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM23766getUnspecifiedXSAIIZE3, (i10 & 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent) {
        SpanStyle spanStyle = new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (DefaultConstructorMarker) null);
        this(spanStyle, new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j14, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jM21012getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM23766getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM23766getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM21012getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM21012getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM23766getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? null : platformTextStyle;
        long j16 = jM23766getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM23766getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM21012getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM23766getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, (i10 & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jM21012getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM23766getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM23766getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM21012getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM21012getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM23766getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 524288) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i10 & 1048576) != 0 ? null : lineBreak;
        long j16 = jM23766getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM23766getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM21012getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM23766getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, (i10 & 2097152) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        SpanStyle spanStyle = new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
        int value = textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk();
        int value2 = textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco();
        PlatformParagraphStyle paragraphSyle = platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null;
        this(spanStyle, new ParagraphStyle(value, value2, j14, textIndent, paragraphSyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), (TextMotion) null, 256, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jM21012getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM23766getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM23766getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM21012getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM21012getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i10 & 16384) != 0 ? null : drawStyle;
        TextAlign textAlign2 = (i10 & 32768) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 65536) != 0 ? null : textDirection;
        long jM23766getUnspecifiedXSAIIZE3 = (i10 & 131072) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 1048576) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i10 & 2097152) != 0 ? null : lineBreak;
        Hyphens hyphens2 = (i10 & 4194304) != 0 ? null : hyphens;
        long j16 = jM23766getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM23766getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM21012getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, drawStyle2, textAlign2, textDirection2, jM23766getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, (i10 & 8388608) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        long jM21012getUnspecified0d7_KjU = (i14 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM23766getUnspecifiedXSAIIZE = (i14 & 2) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i14 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i14 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i14 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i14 & 32) != 0 ? null : fontFamily;
        String str2 = (i14 & 64) != 0 ? null : str;
        long jM23766getUnspecifiedXSAIIZE2 = (i14 & 128) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i14 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i14 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i14 & 1024) != 0 ? null : localeList;
        long jM21012getUnspecified0d7_KjU2 = (i14 & 2048) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i14 & 4096) != 0 ? null : textDecoration;
        long j15 = jM21012getUnspecified0d7_KjU;
        Shadow shadow2 = (i14 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i14 & 16384) != 0 ? null : drawStyle;
        int iM23451getUnspecifiede0LSkKk = (i14 & 32768) != 0 ? TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk() : i10;
        int iM23464getUnspecifieds_7Xco = (i14 & 65536) != 0 ? TextDirection.INSTANCE.m23464getUnspecifieds_7Xco() : i11;
        long jM23766getUnspecifiedXSAIIZE3 = (i14 & 131072) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i14 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i14 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 1048576) != 0 ? null : lineHeightStyle;
        int iM23366getUnspecifiedrAG3T2k = (i14 & 2097152) != 0 ? LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k() : i12;
        int iM23345getUnspecifiedvmbZdU8 = (i14 & 4194304) != 0 ? Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8() : i13;
        long j16 = jM23766getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM23766getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM21012getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, drawStyle2, iM23451getUnspecifiede0LSkKk, iM23464getUnspecifieds_7Xco, jM23766getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, iM23366getUnspecifiedrAG3T2k, iM23345getUnspecifiedvmbZdU8, (i14 & 8388608) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i10, i11, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, i12, i13, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i14 & 2) != 0 ? Float.NaN : f10, (i14 & 4) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j10, (i14 & 8) != 0 ? null : fontWeight, (i14 & 16) != 0 ? null : fontStyle, (i14 & 32) != 0 ? null : fontSynthesis, (i14 & 64) != 0 ? null : fontFamily, (i14 & 128) != 0 ? null : str, (i14 & 256) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j11, (i14 & 512) != 0 ? null : baselineShift, (i14 & 1024) != 0 ? null : textGeometricTransform, (i14 & 2048) != 0 ? null : localeList, (i14 & 4096) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12, (i14 & 8192) != 0 ? null : textDecoration, (i14 & 16384) != 0 ? null : shadow, (32768 & i14) != 0 ? null : drawStyle, (65536 & i14) != 0 ? TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk() : i10, (131072 & i14) != 0 ? TextDirection.INSTANCE.m23464getUnspecifieds_7Xco() : i11, (262144 & i14) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j13, (524288 & i14) != 0 ? null : textIndent, (1048576 & i14) != 0 ? null : platformTextStyle, (2097152 & i14) != 0 ? null : lineHeightStyle, (4194304 & i14) != 0 ? LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k() : i12, (8388608 & i14) != 0 ? Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8() : i13, (i14 & 16777216) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        this(new SpanStyle(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i10, i11, j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, i12, i13, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : fontWeight, (i10 & 16) != 0 ? null : fontStyle, (i10 & 32) != 0 ? null : fontSynthesis, (i10 & 64) != 0 ? null : fontFamily, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j11, (i10 & 512) != 0 ? null : baselineShift, (i10 & 1024) != 0 ? null : textGeometricTransform, (i10 & 2048) != 0 ? null : localeList, (i10 & 4096) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12, (i10 & 8192) != 0 ? null : textDecoration, (i10 & 16384) != 0 ? null : shadow, (32768 & i10) != 0 ? null : drawStyle, (65536 & i10) != 0 ? null : textAlign, (131072 & i10) != 0 ? null : textDirection, (262144 & i10) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j13, (524288 & i10) != 0 ? null : textIndent, (1048576 & i10) != 0 ? null : platformTextStyle, (2097152 & i10) != 0 ? null : lineHeightStyle, (4194304 & i10) != 0 ? null : lineBreak, (8388608 & i10) != 0 ? null : hyphens, (i10 & 16777216) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }
}
