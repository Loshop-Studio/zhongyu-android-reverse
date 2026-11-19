package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.annotation.IntRange;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import androidx.core.view.PointerIconCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b&\b'\u0018\u00002\u00020\u0001:\u0006¥\u0001¦\u0001§\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0011\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0016J'\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\"J'\u0010\u001d\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020$2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\"J'\u0010\u001d\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020&2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\"J8\u0010\u001d\u001a\u00020\u00172\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0(\"\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\"¢\u0006\u0002\u0010)J.\u0010*\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u0010.\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b0\u00101J.\u00102\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u0010.\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b3\u00101J.\u00104\u001a\u0002052\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u0010.\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b6\u00107J:\u00108\u001a\u00020 2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u00109\u001a\u00020/2\b\b\u0002\u0010:\u001a\u00020;H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=J.\u0010>\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u0010.\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b?\u00101J¾\u0001\u0010@\u001a\u00020 2\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0(\"\u0004\u0018\u00010-2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020/2\b\b\u0002\u0010D\u001a\u00020/2\b\b\u0002\u0010E\u001a\u00020\u00072\b\b\u0002\u0010F\u001a\u00020/2\b\b\u0002\u0010G\u001a\u00020/2\b\b\u0002\u0010H\u001a\u00020/2\b\b\u0002\u0010I\u001a\u00020/2\b\b\u0002\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020Tø\u0001\u0000¢\u0006\u0004\bV\u0010WJª\u0001\u0010@\u001a\u00020 2\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0(\"\u0004\u0018\u00010-2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020/2\b\b\u0002\u0010D\u001a\u00020/2\b\b\u0002\u0010E\u001a\u00020\u00072\b\b\u0002\u0010X\u001a\u00020/2\b\b\u0002\u0010Y\u001a\u00020/2\b\b\u0002\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020Tø\u0001\u0000¢\u0006\u0004\bZ\u0010[J \u0001\u0010@\u001a\u00020 2\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0(\"\u0004\u0018\u00010-2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020/2\b\b\u0002\u0010D\u001a\u00020/2\b\b\u0002\u0010E\u001a\u00020\u00072\b\b\u0002\u0010\\\u001a\u00020/2\b\b\u0002\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020Tø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u0094\u0001\u0010_\u001a\u00020 2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0001\u0010`\u001a\u00020\u00072\b\b\u0001\u0010a\u001a\u00020\u00072\b\b\u0002\u0010b\u001a\u00020B2\b\b\u0002\u0010c\u001a\u00020/2\b\b\u0002\u0010d\u001a\u00020/2\b\b\u0002\u0010e\u001a\u00020;2\b\b\u0002\u0010f\u001a\u00020;2\u000e\b\u0002\u0010g\u001a\b\u0012\u0004\u0012\u00020h0(2\u000e\b\u0002\u0010i\u001a\b\u0012\u0004\u0012\u00020j0(2\b\b\u0002\u0010k\u001a\u00020lø\u0001\u0000¢\u0006\u0004\bm\u0010nJ\u0018\u0010o\u001a\u00020+2\u0006\u0010p\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\u000e\u0010o\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010t\u001a\u00020+2\u0006\u0010p\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\bu\u0010rJ\u000e\u0010t\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010v\u001a\u0002052\u0006\u0010p\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u000e\u0010v\u001a\u0002052\u0006\u0010s\u001a\u00020QJ\u0018\u0010y\u001a\u00020+2\u0006\u0010p\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\bz\u0010rJ\u000e\u0010y\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010{\u001a\u00020+2\u0006\u0010p\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b|\u0010rJ\u000e\u0010{\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010}\u001a\u0002052\u0006\u0010p\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b~\u0010xJ\u000e\u0010}\u001a\u0002052\u0006\u0010s\u001a\u00020QJ\b\u0010\u007f\u001a\u00020\u0007H\u0002J-\u0010\u0080\u0001\u001a\u00020$2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\n\b\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001¢\u0006\u0003\u0010\u0083\u0001J<\u0010\u0084\u0001\u001a\u00020 2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u00109\u001a\u00020/2\b\b\u0002\u0010:\u001a\u00020;H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010=J0\u0010\u0086\u0001\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u0010.\u001a\u00020/ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u00101J0\u0010\u0088\u0001\u001a\u0002052\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\b\b\u0002\u0010.\u001a\u00020/ø\u0001\u0000¢\u0006\u0005\b\u0089\u0001\u00107J-\u0010\u008a\u0001\u001a\u00020&2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0(\"\u00020-2\n\b\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001¢\u0006\u0003\u0010\u008b\u0001J\u0015\u0010\u008c\u0001\u001a\u00020B2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u008e\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u008f\u0001\u001a\u00020\u0017H\u0016J\u0012\u0010\u0090\u0001\u001a\u00020\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0007H\u0002J\u0013\u0010\u0092\u0001\u001a\u00020\u0004*\u00020-H\u0000¢\u0006\u0003\b\u0093\u0001Jz\u0010\u0094\u0001\u001a\u00020-*\u00020-2\t\b\u0002\u0010\u0095\u0001\u001a\u00020/2\t\b\u0002\u0010\u0096\u0001\u001a\u00020/2\t\b\u0002\u0010\u0097\u0001\u001a\u00020/2\t\b\u0002\u0010\u0098\u0001\u001a\u00020/2\t\b\u0002\u0010\u0099\u0001\u001a\u00020/2\t\b\u0002\u0010\u009a\u0001\u001a\u00020/2\t\b\u0002\u0010\u009b\u0001\u001a\u00020/2\t\b\u0002\u0010\u009c\u0001\u001a\u00020/2\t\b\u0002\u0010\u009d\u0001\u001a\u00020Qø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001JN\u0010 \u0001\u001a\u00020-*\u00020-2\t\b\u0002\u0010\u0095\u0001\u001a\u00020/2\t\b\u0002\u0010\u0097\u0001\u001a\u00020/2\t\b\u0002\u0010\u0099\u0001\u001a\u00020/2\t\b\u0002\u0010\u009b\u0001\u001a\u00020/2\t\b\u0002\u0010\u009d\u0001\u001a\u00020Qø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JN\u0010£\u0001\u001a\u00020-*\u00020-2\t\b\u0002\u0010\u0096\u0001\u001a\u00020/2\t\b\u0002\u0010\u0098\u0001\u001a\u00020/2\t\b\u0002\u0010\u009a\u0001\u001a\u00020/2\t\b\u0002\u0010\u009c\u0001\u001a\u00020/2\t\b\u0002\u0010\u009d\u0001\u001a\u00020Qø\u0001\u0000¢\u0006\u0006\b¤\u0001\u0010¢\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u00148\u0004X\u0085\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006¨\u0001"}, m7880d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "()V", "extendFrom", "Landroidx/constraintlayout/core/parser/CLObject;", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "HelpersStartId", "", "containerObject", "getContainerObject$annotations", "getContainerObject", "()Landroidx/constraintlayout/core/parser/CLObject;", "helperId", "helpersHashCode", "getHelpersHashCode$annotations", "getHelpersHashCode", "()I", "setHelpersHashCode", "(I)V", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "getTasks$annotations", "getTasks", "()Ljava/util/List;", "applyTo", "state", "constrain", "Landroidx/constraintlayout/compose/ConstrainScope;", "ref", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "constrainBlock", "Lkotlin/ExtensionFunctionType;", "Landroidx/constraintlayout/compose/HorizontalChainScope;", "Landroidx/constraintlayout/compose/HorizontalChainReference;", "Landroidx/constraintlayout/compose/VerticalChainScope;", "Landroidx/constraintlayout/compose/VerticalChainReference;", "refs", "", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V", "createAbsoluteLeftBarrier", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "elements", "Landroidx/constraintlayout/compose/LayoutReference;", "margin", "Landroidx/compose/ui/unit/Dp;", "createAbsoluteLeftBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createAbsoluteRightBarrier", "createAbsoluteRightBarrier-3ABfNKs", "createBottomBarrier", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createBottomBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createColumn", "spacing", "weights", "", "createColumn-lG28NQ4", "([Landroidx/constraintlayout/compose/LayoutReference;F[F)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "createEndBarrier", "createEndBarrier-3ABfNKs", "createFlow", "flowVertically", "", "verticalGap", "horizontalGap", "maxElement", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "wrapMode", "Landroidx/constraintlayout/compose/Wrap;", "verticalAlign", "Landroidx/constraintlayout/compose/VerticalAlign;", "horizontalAlign", "Landroidx/constraintlayout/compose/HorizontalAlign;", "horizontalFlowBias", "", "verticalFlowBias", "verticalStyle", "Landroidx/constraintlayout/compose/FlowStyle;", "horizontalStyle", "createFlow-Fgo90cY", "([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "paddingHorizontal", "paddingVertical", "createFlow-6oEtc9w", "([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "padding", "createFlow-IkjhEj4", "([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "createGrid", "rows", "columns", "isHorizontalArrangement", "verticalSpacing", "horizontalSpacing", "rowWeights", "columnWeights", "skips", "Landroidx/constraintlayout/compose/Skip;", "spans", "Landroidx/constraintlayout/compose/Span;", "flags", "Landroidx/constraintlayout/compose/GridFlag;", "createGrid-Hu23Yyw", "([Landroidx/constraintlayout/compose/LayoutReference;IIZFF[F[F[Landroidx/constraintlayout/compose/Skip;[Landroidx/constraintlayout/compose/Span;I)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "createGuidelineFromAbsoluteLeft", TypedValues.CycleType.S_WAVE_OFFSET, "createGuidelineFromAbsoluteLeft-0680j_4", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "fraction", "createGuidelineFromAbsoluteRight", "createGuidelineFromAbsoluteRight-0680j_4", "createGuidelineFromBottom", "createGuidelineFromBottom-0680j_4", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createGuidelineFromEnd", "createGuidelineFromEnd-0680j_4", "createGuidelineFromStart", "createGuidelineFromStart-0680j_4", "createGuidelineFromTop", "createGuidelineFromTop-0680j_4", "createHelperId", "createHorizontalChain", "chainStyle", "Landroidx/constraintlayout/compose/ChainStyle;", "([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/HorizontalChainReference;", "createRow", "createRow-lG28NQ4", "createStartBarrier", "createStartBarrier-3ABfNKs", "createTopBarrier", "createTopBarrier-3ABfNKs", "createVerticalChain", "([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;", "equals", "other", "hashCode", "reset", "updateHelpersHashCode", "value", "asCLContainer", "asCLContainer$constraintlayout_compose_release", "withChainParams", "startMargin", "topMargin", "endMargin", "bottomMargin", "startGoneMargin", "topGoneMargin", "endGoneMargin", "bottomGoneMargin", "weight", "withChainParams-ouYQatA", "(Landroidx/constraintlayout/compose/LayoutReference;FFFFFFFFF)Landroidx/constraintlayout/compose/LayoutReference;", "withHorizontalChainParams", "withHorizontalChainParams-YLPp7PM", "(Landroidx/constraintlayout/compose/LayoutReference;FFFFF)Landroidx/constraintlayout/compose/LayoutReference;", "withVerticalChainParams", "withVerticalChainParams-YLPp7PM", "BaselineAnchor", "HorizontalAnchor", "VerticalAnchor", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayoutBaseScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/LayoutReference\n*L\n1#1,1456:1\n13579#2,2:1457\n13579#2,2:1459\n13579#2,2:1461\n13579#2,2:1464\n13579#2,2:1466\n13579#2,2:1469\n13579#2,2:1471\n13579#2,2:1474\n13579#2,2:1476\n13579#2,2:1479\n13579#2,2:1481\n13579#2,2:1484\n13579#2,2:1486\n13579#2,2:1496\n13579#2,2:1498\n13579#2,2:1508\n13579#2:1512\n13580#2:1514\n13579#2,2:1515\n13579#2:1517\n13580#2:1519\n13579#2,2:1520\n149#3:1463\n149#3:1468\n149#3:1473\n149#3:1478\n149#3:1483\n149#3:1488\n149#3:1489\n149#3:1490\n149#3:1491\n149#3:1492\n149#3:1493\n149#3:1494\n149#3:1495\n149#3:1500\n149#3:1501\n149#3:1502\n149#3:1503\n149#3:1504\n149#3:1505\n149#3:1506\n149#3:1507\n149#3:1510\n149#3:1511\n149#3:1522\n149#3:1523\n149#3:1524\n149#3:1525\n149#3:1526\n149#3:1527\n149#3:1528\n149#3:1529\n149#3:1530\n149#3:1531\n149#3:1532\n149#3:1533\n149#3:1534\n149#3:1535\n149#3:1536\n149#3:1537\n149#3:1538\n149#3:1539\n149#3:1540\n149#3:1541\n149#3:1542\n149#3:1543\n149#3:1544\n149#3:1545\n1110#4:1513\n1110#4:1518\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n*L\n139#1:1457,2\n333#1:1459,2\n343#1:1461,2\n356#1:1464,2\n366#1:1466,2\n376#1:1469,2\n386#1:1471,2\n396#1:1474,2\n406#1:1476,2\n419#1:1479,2\n429#1:1481,2\n439#1:1484,2\n449#1:1486,2\n612#1:1496,2\n640#1:1498,2\n788#1:1508,2\n837#1:1512\n837#1:1514\n865#1:1515,2\n882#1:1517\n882#1:1519\n910#1:1520,2\n329#1:1463\n351#1:1468\n372#1:1473\n392#1:1478\n414#1:1483\n435#1:1488\n478#1:1489\n479#1:1490\n481#1:1491\n535#1:1492\n536#1:1493\n538#1:1494\n539#1:1495\n595#1:1500\n596#1:1501\n598#1:1502\n599#1:1503\n600#1:1504\n601#1:1505\n661#1:1506\n694#1:1507\n767#1:1510\n768#1:1511\n944#1:1522\n945#1:1523\n946#1:1524\n947#1:1525\n948#1:1526\n949#1:1527\n950#1:1528\n951#1:1529\n1002#1:1530\n1004#1:1531\n1006#1:1532\n1008#1:1533\n994#1:1534\n995#1:1535\n996#1:1536\n997#1:1537\n1043#1:1538\n1045#1:1539\n1047#1:1540\n1049#1:1541\n1036#1:1542\n1037#1:1543\n1038#1:1544\n1039#1:1545\n838#1:1513\n883#1:1518\n*E\n"})
/* loaded from: classes2.dex */
public abstract class ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int HelpersStartId;
    private final CLObject containerObject;
    private int helperId;
    private int helpersHashCode;
    private final List<Function1<State, Unit>> tasks;

    @Stable
    @Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\u00020\u0001HÀ\u0003¢\u0006\u0002\b\u000bJ\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m7880d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "id", TypedValues.Custom.S_REFERENCE, "Landroidx/constraintlayout/compose/LayoutReference;", "(Ljava/lang/Object;Landroidx/constraintlayout/compose/LayoutReference;)V", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "component1", "component1$constraintlayout_compose_release", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
    public static final /* data */ class BaselineAnchor {
        public static final int $stable = 0;
        private final Object id;
        private final LayoutReference reference;

        public BaselineAnchor(Object obj, LayoutReference layoutReference) {
            this.id = obj;
            this.reference = layoutReference;
        }

        public static /* synthetic */ BaselineAnchor copy$default(BaselineAnchor baselineAnchor, Object obj, LayoutReference layoutReference, int i6, Object obj2) {
            if ((i6 & 1) != 0) {
                obj = baselineAnchor.id;
            }
            if ((i6 & 2) != 0) {
                layoutReference = baselineAnchor.reference;
            }
            return baselineAnchor.copy(obj, layoutReference);
        }

        /* renamed from: component1$constraintlayout_compose_release, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final LayoutReference getReference() {
            return this.reference;
        }

        public final BaselineAnchor copy(Object id, LayoutReference reference) {
            return new BaselineAnchor(id, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaselineAnchor)) {
                return false;
            }
            BaselineAnchor baselineAnchor = (BaselineAnchor) other;
            return Intrinsics.areEqual(this.id, baselineAnchor.id) && Intrinsics.areEqual(this.reference, baselineAnchor.reference);
        }

        public final Object getId$constraintlayout_compose_release() {
            return this.id;
        }

        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ", reference=" + this.reference + ')';
        }
    }

    @Stable
    @Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u0001HÀ\u0003¢\u0006\u0002\b\u000fJ\u000e\u0010\u0010\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0011J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m7880d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "id", "index", "", TypedValues.Custom.S_REFERENCE, "Landroidx/constraintlayout/compose/LayoutReference;", "(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "getIndex$constraintlayout_compose_release", "()I", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "component1", "component1$constraintlayout_compose_release", "component2", "component2$constraintlayout_compose_release", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
    public static final /* data */ class HorizontalAnchor {
        public static final int $stable = 0;
        private final Object id;
        private final int index;
        private final LayoutReference reference;

        public HorizontalAnchor(Object obj, int i6, LayoutReference layoutReference) {
            this.id = obj;
            this.index = i6;
            this.reference = layoutReference;
        }

        public static /* synthetic */ HorizontalAnchor copy$default(HorizontalAnchor horizontalAnchor, Object obj, int i6, LayoutReference layoutReference, int i7, Object obj2) {
            if ((i7 & 1) != 0) {
                obj = horizontalAnchor.id;
            }
            if ((i7 & 2) != 0) {
                i6 = horizontalAnchor.index;
            }
            if ((i7 & 4) != 0) {
                layoutReference = horizontalAnchor.reference;
            }
            return horizontalAnchor.copy(obj, i6, layoutReference);
        }

        /* renamed from: component1$constraintlayout_compose_release, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* renamed from: component2$constraintlayout_compose_release, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component3, reason: from getter */
        public final LayoutReference getReference() {
            return this.reference;
        }

        public final HorizontalAnchor copy(Object id, int index, LayoutReference reference) {
            return new HorizontalAnchor(id, index, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) other;
            return Intrinsics.areEqual(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index && Intrinsics.areEqual(this.reference, horizontalAnchor.reference);
        }

        public final Object getId$constraintlayout_compose_release() {
            return this.id;
        }

        public final int getIndex$constraintlayout_compose_release() {
            return this.index;
        }

        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    @Stable
    @Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u0001HÀ\u0003¢\u0006\u0002\b\u000fJ\u000e\u0010\u0010\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0011J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m7880d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "id", "index", "", TypedValues.Custom.S_REFERENCE, "Landroidx/constraintlayout/compose/LayoutReference;", "(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "getIndex$constraintlayout_compose_release", "()I", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "component1", "component1$constraintlayout_compose_release", "component2", "component2$constraintlayout_compose_release", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
    public static final /* data */ class VerticalAnchor {
        public static final int $stable = 0;
        private final Object id;
        private final int index;
        private final LayoutReference reference;

        public VerticalAnchor(Object obj, int i6, LayoutReference layoutReference) {
            this.id = obj;
            this.index = i6;
            this.reference = layoutReference;
        }

        public static /* synthetic */ VerticalAnchor copy$default(VerticalAnchor verticalAnchor, Object obj, int i6, LayoutReference layoutReference, int i7, Object obj2) {
            if ((i7 & 1) != 0) {
                obj = verticalAnchor.id;
            }
            if ((i7 & 2) != 0) {
                i6 = verticalAnchor.index;
            }
            if ((i7 & 4) != 0) {
                layoutReference = verticalAnchor.reference;
            }
            return verticalAnchor.copy(obj, i6, layoutReference);
        }

        /* renamed from: component1$constraintlayout_compose_release, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* renamed from: component2$constraintlayout_compose_release, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component3, reason: from getter */
        public final LayoutReference getReference() {
            return this.reference;
        }

        public final VerticalAnchor copy(Object id, int index, LayoutReference reference) {
            return new VerticalAnchor(id, index, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) other;
            return Intrinsics.areEqual(this.id, verticalAnchor.id) && this.index == verticalAnchor.index && Intrinsics.areEqual(this.reference, verticalAnchor.reference);
        }

        public final Object getId$constraintlayout_compose_release() {
            return this.id;
        }

        public final int getIndex$constraintlayout_compose_release() {
            return this.index;
        }

        public final LayoutReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    public ConstraintLayoutBaseScope(CLObject cLObject) {
        CLObject cLObjectMo16966clone;
        this.tasks = new ArrayList();
        this.containerObject = (cLObject == null || (cLObjectMo16966clone = cLObject.mo16966clone()) == null) ? new CLObject(new char[0]) : cLObjectMo16966clone;
        this.HelpersStartId = 1000;
        this.helperId = 1000;
    }

    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m16774createAbsoluteLeftBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteLeftBarrier-3ABfNKs");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        return constraintLayoutBaseScope.m16789createAbsoluteLeftBarrier3ABfNKs(layoutReferenceArr, f6);
    }

    /* renamed from: createAbsoluteRightBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m16775createAbsoluteRightBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteRightBarrier-3ABfNKs");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        return constraintLayoutBaseScope.m16790createAbsoluteRightBarrier3ABfNKs(layoutReferenceArr, f6);
    }

    /* renamed from: createBottomBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m16776createBottomBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        return constraintLayoutBaseScope.m16791createBottomBarrier3ABfNKs(layoutReferenceArr, f6);
    }

    /* renamed from: createColumn-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m16777createColumnlG28NQ4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, float[] fArr, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createColumn-lG28NQ4");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 4) != 0) {
            fArr = new float[0];
        }
        return constraintLayoutBaseScope.m16792createColumnlG28NQ4(layoutReferenceArr, f6, fArr);
    }

    /* renamed from: createEndBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m16778createEndBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        return constraintLayoutBaseScope.m16793createEndBarrier3ABfNKs(layoutReferenceArr, f6);
    }

    /* renamed from: createFlow-6oEtc9w$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m16779createFlow6oEtc9w$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z6, float f6, float f7, int i6, float f8, float f9, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f10, float f11, FlowStyle flowStyle, FlowStyle flowStyle2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-6oEtc9w");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return constraintLayoutBaseScope.m16794createFlow6oEtc9w(layoutReferenceArr, z6, (i7 & 4) != 0 ? C2452Dp.m16484constructorimpl(0) : f6, (i7 & 8) != 0 ? C2452Dp.m16484constructorimpl(0) : f7, (i7 & 16) != 0 ? 0 : i6, (i7 & 32) != 0 ? C2452Dp.m16484constructorimpl(0) : f8, (i7 & 64) != 0 ? C2452Dp.m16484constructorimpl(0) : f9, (i7 & 128) != 0 ? Wrap.INSTANCE.getNone() : wrap, (i7 & 256) != 0 ? VerticalAlign.INSTANCE.getCenter() : verticalAlign, (i7 & 512) != 0 ? HorizontalAlign.INSTANCE.getCenter() : horizontalAlign, (i7 & 1024) != 0 ? 0.0f : f10, (i7 & 2048) == 0 ? f11 : 0.0f, (i7 & 4096) != 0 ? FlowStyle.INSTANCE.getPacked() : flowStyle, (i7 & 8192) != 0 ? FlowStyle.INSTANCE.getPacked() : flowStyle2);
    }

    /* renamed from: createFlow-Fgo90cY$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m16780createFlowFgo90cY$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z6, float f6, float f7, int i6, float f8, float f9, float f10, float f11, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f12, float f13, FlowStyle flowStyle, FlowStyle flowStyle2, int i7, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m16795createFlowFgo90cY(layoutReferenceArr, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? C2452Dp.m16484constructorimpl(0) : f6, (i7 & 8) != 0 ? C2452Dp.m16484constructorimpl(0) : f7, (i7 & 16) != 0 ? 0 : i6, (i7 & 32) != 0 ? C2452Dp.m16484constructorimpl(0) : f8, (i7 & 64) != 0 ? C2452Dp.m16484constructorimpl(0) : f9, (i7 & 128) != 0 ? C2452Dp.m16484constructorimpl(0) : f10, (i7 & 256) != 0 ? C2452Dp.m16484constructorimpl(0) : f11, (i7 & 512) != 0 ? Wrap.INSTANCE.getNone() : wrap, (i7 & 1024) != 0 ? VerticalAlign.INSTANCE.getCenter() : verticalAlign, (i7 & 2048) != 0 ? HorizontalAlign.INSTANCE.getCenter() : horizontalAlign, (i7 & 4096) != 0 ? 0.0f : f12, (i7 & 8192) == 0 ? f13 : 0.0f, (i7 & 16384) != 0 ? FlowStyle.INSTANCE.getPacked() : flowStyle, (i7 & 32768) != 0 ? FlowStyle.INSTANCE.getPacked() : flowStyle2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-Fgo90cY");
    }

    /* renamed from: createFlow-IkjhEj4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m16781createFlowIkjhEj4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, boolean z6, float f6, float f7, int i6, float f8, Wrap wrap, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float f9, float f10, FlowStyle flowStyle, FlowStyle flowStyle2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow-IkjhEj4");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        return constraintLayoutBaseScope.m16796createFlowIkjhEj4(layoutReferenceArr, z6, f6, (i7 & 8) != 0 ? C2452Dp.m16484constructorimpl(0) : f7, (i7 & 16) != 0 ? 0 : i6, (i7 & 32) != 0 ? C2452Dp.m16484constructorimpl(0) : f8, (i7 & 64) != 0 ? Wrap.INSTANCE.getNone() : wrap, (i7 & 128) != 0 ? VerticalAlign.INSTANCE.getCenter() : verticalAlign, (i7 & 256) != 0 ? HorizontalAlign.INSTANCE.getCenter() : horizontalAlign, (i7 & 512) != 0 ? 0.0f : f9, (i7 & 1024) == 0 ? f10 : 0.0f, (i7 & 2048) != 0 ? FlowStyle.INSTANCE.getPacked() : flowStyle, (i7 & 4096) != 0 ? FlowStyle.INSTANCE.getPacked() : flowStyle2);
    }

    /* renamed from: createGrid-Hu23Yyw$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m16782createGridHu23Yyw$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, int i6, int i7, boolean z6, float f6, float f7, float[] fArr, float[] fArr2, Skip[] skipArr, Span[] spanArr, int i8, int i9, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m16797createGridHu23Yyw(layoutReferenceArr, i6, i7, (i9 & 8) != 0 ? true : z6, (i9 & 16) != 0 ? C2452Dp.m16484constructorimpl(0) : f6, (i9 & 32) != 0 ? C2452Dp.m16484constructorimpl(0) : f7, (i9 & 64) != 0 ? new float[0] : fArr, (i9 & 128) != 0 ? new float[0] : fArr2, (i9 & 256) != 0 ? new Skip[0] : skipArr, (i9 & 512) != 0 ? new Span[0] : spanArr, (i9 & 1024) != 0 ? GridFlag.INSTANCE.m16856getNonedTRCCdc() : i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createGrid-Hu23Yyw");
    }

    private final int createHelperId() {
        int i6 = this.helperId;
        this.helperId = i6 + 1;
        return i6;
    }

    public static /* synthetic */ HorizontalChainReference createHorizontalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, ChainStyle chainStyle, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHorizontalChain");
        }
        if ((i6 & 2) != 0) {
            chainStyle = ChainStyle.INSTANCE.getSpread();
        }
        return constraintLayoutBaseScope.createHorizontalChain(layoutReferenceArr, chainStyle);
    }

    /* renamed from: createRow-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ ConstrainedLayoutReference m16783createRowlG28NQ4$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, float[] fArr, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRow-lG28NQ4");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 4) != 0) {
            fArr = new float[0];
        }
        return constraintLayoutBaseScope.m16804createRowlG28NQ4(layoutReferenceArr, f6, fArr);
    }

    /* renamed from: createStartBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m16784createStartBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        return constraintLayoutBaseScope.m16805createStartBarrier3ABfNKs(layoutReferenceArr, f6);
    }

    /* renamed from: createTopBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m16785createTopBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, float f6, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs");
        }
        if ((i6 & 2) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        return constraintLayoutBaseScope.m16806createTopBarrier3ABfNKs(layoutReferenceArr, f6);
    }

    public static /* synthetic */ VerticalChainReference createVerticalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference[] layoutReferenceArr, ChainStyle chainStyle, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVerticalChain");
        }
        if ((i6 & 2) != 0) {
            chainStyle = ChainStyle.INSTANCE.getSpread();
        }
        return constraintLayoutBaseScope.createVerticalChain(layoutReferenceArr, chainStyle);
    }

    @PublishedApi
    public static /* synthetic */ void getContainerObject$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getHelpersHashCode$annotations() {
    }

    @Deprecated(message = "Tasks is unused, it breaks the immutability promise.")
    public static /* synthetic */ void getTasks$annotations() {
    }

    private final void updateHelpersHashCode(int value) {
        this.helpersHashCode = ((this.helpersHashCode * PointerIconCompat.TYPE_VERTICAL_TEXT) + value) % 1000000007;
    }

    /* renamed from: withChainParams-ouYQatA$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m16786withChainParamsouYQatA$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, int i6, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m16807withChainParamsouYQatA(layoutReference, (i6 & 1) != 0 ? C2452Dp.m16484constructorimpl(0) : f6, (i6 & 2) != 0 ? C2452Dp.m16484constructorimpl(0) : f7, (i6 & 4) != 0 ? C2452Dp.m16484constructorimpl(0) : f8, (i6 & 8) != 0 ? C2452Dp.m16484constructorimpl(0) : f9, (i6 & 16) != 0 ? C2452Dp.m16484constructorimpl(0) : f10, (i6 & 32) != 0 ? C2452Dp.m16484constructorimpl(0) : f11, (i6 & 64) != 0 ? C2452Dp.m16484constructorimpl(0) : f12, (i6 & 128) != 0 ? C2452Dp.m16484constructorimpl(0) : f13, (i6 & 256) != 0 ? Float.NaN : f14);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withChainParams-ouYQatA");
    }

    /* renamed from: withHorizontalChainParams-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m16787withHorizontalChainParamsYLPp7PM$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f6, float f7, float f8, float f9, float f10, int i6, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m16808withHorizontalChainParamsYLPp7PM(layoutReference, (i6 & 1) != 0 ? C2452Dp.m16484constructorimpl(0) : f6, (i6 & 2) != 0 ? C2452Dp.m16484constructorimpl(0) : f7, (i6 & 4) != 0 ? C2452Dp.m16484constructorimpl(0) : f8, (i6 & 8) != 0 ? C2452Dp.m16484constructorimpl(0) : f9, (i6 & 16) != 0 ? Float.NaN : f10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withHorizontalChainParams-YLPp7PM");
    }

    /* renamed from: withVerticalChainParams-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ LayoutReference m16788withVerticalChainParamsYLPp7PM$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, LayoutReference layoutReference, float f6, float f7, float f8, float f9, float f10, int i6, Object obj) {
        if (obj == null) {
            return constraintLayoutBaseScope.m16809withVerticalChainParamsYLPp7PM(layoutReference, (i6 & 1) != 0 ? C2452Dp.m16484constructorimpl(0) : f6, (i6 & 2) != 0 ? C2452Dp.m16484constructorimpl(0) : f7, (i6 & 4) != 0 ? C2452Dp.m16484constructorimpl(0) : f8, (i6 & 8) != 0 ? C2452Dp.m16484constructorimpl(0) : f9, (i6 & 16) != 0 ? Float.NaN : f10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withVerticalChainParams-YLPp7PM");
    }

    public final void applyTo(State state) {
        ConstraintSetParser.populateState(this.containerObject, state, new ConstraintSetParser.LayoutVariables());
    }

    public final CLObject asCLContainer$constraintlayout_compose_release(LayoutReference layoutReference) {
        String string = layoutReference.getId().toString();
        if (this.containerObject.getObjectOrNull(string) == null) {
            this.containerObject.put(string, new CLObject(new char[0]));
        }
        return this.containerObject.getObject(string);
    }

    public final HorizontalChainScope constrain(HorizontalChainReference ref, Function1<? super HorizontalChainScope, Unit> constrainBlock) {
        HorizontalChainScope horizontalChainScope = new HorizontalChainScope(ref.getId(), asCLContainer$constraintlayout_compose_release(ref));
        constrainBlock.invoke(horizontalChainScope);
        return horizontalChainScope;
    }

    /* renamed from: createAbsoluteLeftBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m16789createAbsoluteLeftBarrier3ABfNKs(LayoutReference[] elements, float margin) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            cLArray.add(CLString.from(layoutReference.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "left");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("margin", margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(11);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(margin));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createAbsoluteRightBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m16790createAbsoluteRightBarrier3ABfNKs(LayoutReference[] elements, float margin) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            cLArray.add(CLString.from(layoutReference.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "right");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("margin", margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(14);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(margin));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createBottomBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m16791createBottomBarrier3ABfNKs(LayoutReference[] elements, float margin) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            cLArray.add(CLString.from(layoutReference.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "bottom");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("margin", margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(15);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(margin));
        return new HorizontalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    @SuppressLint({HttpHeaders.RANGE})
    /* renamed from: createColumn-lG28NQ4, reason: not valid java name */
    public final ConstrainedLayoutReference m16792createColumnlG28NQ4(LayoutReference[] elements, float spacing, float[] weights) {
        if ((weights.length == 0) || elements.length == weights.length) {
            return m16782createGridHu23Yyw$default(this, (LayoutReference[]) Arrays.copyOf(elements, elements.length), 0, 1, false, spacing, 0.0f, weights, null, null, null, 0, 1960, null);
        }
        throw new IllegalArgumentException("Number of weights (" + weights.length + ") should match number of elements (" + elements.length + ").");
    }

    /* renamed from: createEndBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m16793createEndBarrier3ABfNKs(LayoutReference[] elements, float margin) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            cLArray.add(CLString.from(layoutReference.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "end");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("margin", margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(13);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(margin));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createFlow-6oEtc9w, reason: not valid java name */
    public final ConstrainedLayoutReference m16794createFlow6oEtc9w(LayoutReference[] elements, boolean flowVertically, float verticalGap, float horizontalGap, int maxElement, float paddingHorizontal, float paddingVertical, Wrap wrapMode, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float horizontalFlowBias, float verticalFlowBias, FlowStyle verticalStyle, FlowStyle horizontalStyle) {
        return m16795createFlowFgo90cY((LayoutReference[]) Arrays.copyOf(elements, elements.length), flowVertically, verticalGap, horizontalGap, maxElement, paddingHorizontal, paddingVertical, paddingHorizontal, paddingVertical, wrapMode, verticalAlign, horizontalAlign, horizontalFlowBias, verticalFlowBias, verticalStyle, horizontalStyle);
    }

    /* renamed from: createFlow-Fgo90cY, reason: not valid java name */
    public final ConstrainedLayoutReference m16795createFlowFgo90cY(LayoutReference[] elements, boolean flowVertically, float verticalGap, float horizontalGap, int maxElement, float paddingLeft, float paddingTop, float paddingRight, float paddingBottom, Wrap wrapMode, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float horizontalFlowBias, float verticalFlowBias, FlowStyle verticalStyle, FlowStyle horizontalStyle) {
        ConstrainedLayoutReference constrainedLayoutReference = new ConstrainedLayoutReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            if (layoutReference != null) {
                cLArray.add(CLString.from(layoutReference.getId().toString()));
            }
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(new CLNumber(paddingLeft));
        cLArray2.add(new CLNumber(paddingTop));
        cLArray2.add(new CLNumber(paddingRight));
        cLArray2.add(new CLNumber(paddingBottom));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constrainedLayoutReference);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, flowVertically ? "vFlow" : "hFlow");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("vGap", verticalGap);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("hGap", horizontalGap);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("maxElement", maxElement);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("padding", cLArray2);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("wrap", wrapMode.getName());
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("vAlign", verticalAlign.getName());
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("hAlign", horizontalAlign.getName());
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("hFlowBias", horizontalFlowBias);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("vFlowBias", verticalFlowBias);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("vStyle", verticalStyle.getName());
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("hStyle", horizontalStyle.getName());
        updateHelpersHashCode(16);
        int length = elements.length;
        for (int i6 = 0; i6 < length; i6++) {
            LayoutReference layoutReference2 = elements[i6];
            updateHelpersHashCode(layoutReference2 != null ? layoutReference2.hashCode() : 0);
        }
        return constrainedLayoutReference;
    }

    /* renamed from: createFlow-IkjhEj4, reason: not valid java name */
    public final ConstrainedLayoutReference m16796createFlowIkjhEj4(LayoutReference[] elements, boolean flowVertically, float verticalGap, float horizontalGap, int maxElement, float padding, Wrap wrapMode, VerticalAlign verticalAlign, HorizontalAlign horizontalAlign, float horizontalFlowBias, float verticalFlowBias, FlowStyle verticalStyle, FlowStyle horizontalStyle) {
        return m16795createFlowFgo90cY((LayoutReference[]) Arrays.copyOf(elements, elements.length), flowVertically, verticalGap, horizontalGap, maxElement, padding, padding, padding, padding, wrapMode, verticalAlign, horizontalAlign, horizontalFlowBias, verticalFlowBias, verticalStyle, horizontalStyle);
    }

    /* renamed from: createGrid-Hu23Yyw, reason: not valid java name */
    public final ConstrainedLayoutReference m16797createGridHu23Yyw(LayoutReference[] elements, @IntRange(from = 1) int rows, @IntRange(from = 1) int columns, boolean isHorizontalArrangement, float verticalSpacing, float horizontalSpacing, float[] rowWeights, float[] columnWeights, Skip[] skips, Span[] spans, int flags) {
        CLElement cLElement;
        String strJoinToString$default;
        String str;
        String strJoinToString$default2;
        if (!(rowWeights.length == 0) && rows > 0 && rows != rowWeights.length) {
            throw new IllegalArgumentException("Number of weights (" + rowWeights.length + ") should match number of rows (" + rows + ").");
        }
        if (!(columnWeights.length == 0) && columns > 0 && columns != columnWeights.length) {
            throw new IllegalArgumentException("Number of weights (" + columnWeights.length + ") should match number of columns (" + columns + ").");
        }
        ConstrainedLayoutReference constrainedLayoutReference = new ConstrainedLayoutReference(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            cLArray.add(CLString.from(layoutReference.getId().toString()));
        }
        if (rowWeights.length > 1) {
            cLElement = cLArray;
            strJoinToString$default = ArraysKt.joinToString$default(rowWeights, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        } else {
            cLElement = cLArray;
            strJoinToString$default = "";
        }
        if (columnWeights.length > 1) {
            str = strJoinToString$default;
            strJoinToString$default2 = ArraysKt.joinToString$default(columnWeights, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        } else {
            str = strJoinToString$default;
            strJoinToString$default2 = "";
        }
        String strJoinToString$default3 = !(skips.length == 0) ? ArraysKt.joinToString$default(skips, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<Skip, CharSequence>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createGrid$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Skip skip) {
                return m16810invokefXgvMDs(skip.m16942unboximpl());
            }

            /* renamed from: invoke-fXgvMDs, reason: not valid java name */
            public final CharSequence m16810invokefXgvMDs(String str2) {
                return str2;
            }
        }, 30, (Object) null) : "";
        String strJoinToString$default4 = spans.length == 0 ? "" : ArraysKt.joinToString$default(spans, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<Span, CharSequence>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createGrid$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Span span) {
                return m16811invoke56oDYsA(span.m16951unboximpl());
            }

            /* renamed from: invoke-56oDYsA, reason: not valid java name */
            public final CharSequence m16811invoke56oDYsA(String str2) {
                return str2;
            }
        }, 30, (Object) null);
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constrainedLayoutReference);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLElement);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "grid");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("orientation", isHorizontalArrangement ? 0.0f : 1.0f);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("rows", rows);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("columns", columns);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("vGap", verticalSpacing);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("hGap", horizontalSpacing);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("rowWeights", str);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("columnWeights", strJoinToString$default2);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("skips", strJoinToString$default3);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("spans", strJoinToString$default4);
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("flags", flags);
        return constrainedLayoutReference;
    }

    public final VerticalAnchor createGuidelineFromAbsoluteLeft(float fraction) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("percent", fraction);
        updateHelpersHashCode(4);
        updateHelpersHashCode(Float.hashCode(fraction));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createGuidelineFromAbsoluteLeft-0680j_4, reason: not valid java name */
    public final VerticalAnchor m16798createGuidelineFromAbsoluteLeft0680j_4(float offset) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("left", offset);
        updateHelpersHashCode(2);
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(offset));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    public final VerticalAnchor createGuidelineFromAbsoluteRight(float fraction) {
        return createGuidelineFromAbsoluteLeft(1.0f - fraction);
    }

    /* renamed from: createGuidelineFromAbsoluteRight-0680j_4, reason: not valid java name */
    public final VerticalAnchor m16799createGuidelineFromAbsoluteRight0680j_4(float offset) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("right", offset);
        updateHelpersHashCode(6);
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(offset));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    public final HorizontalAnchor createGuidelineFromBottom(float fraction) {
        return createGuidelineFromTop(1.0f - fraction);
    }

    /* renamed from: createGuidelineFromBottom-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m16800createGuidelineFromBottom0680j_4(float offset) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("end", offset);
        updateHelpersHashCode(9);
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(offset));
        return new HorizontalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    public final VerticalAnchor createGuidelineFromEnd(float fraction) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from("end"));
        cLArray.add(new CLNumber(fraction));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.hashCode(fraction));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createGuidelineFromEnd-0680j_4, reason: not valid java name */
    public final VerticalAnchor m16801createGuidelineFromEnd0680j_4(float offset) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("end", offset);
        updateHelpersHashCode(5);
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(offset));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    public final VerticalAnchor createGuidelineFromStart(float fraction) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from("start"));
        cLArray.add(new CLNumber(fraction));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.hashCode(fraction));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createGuidelineFromStart-0680j_4, reason: not valid java name */
    public final VerticalAnchor m16802createGuidelineFromStart0680j_4(float offset) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("start", offset);
        updateHelpersHashCode(1);
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(offset));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    public final HorizontalAnchor createGuidelineFromTop(float fraction) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("percent", fraction);
        updateHelpersHashCode(8);
        updateHelpersHashCode(Float.hashCode(fraction));
        return new HorizontalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createGuidelineFromTop-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m16803createGuidelineFromTop0680j_4(float offset) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("start", offset);
        updateHelpersHashCode(7);
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(offset));
        return new HorizontalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLObject] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.constraintlayout.core.parser.CLString] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.constraintlayout.compose.ConstraintLayoutBaseScope] */
    public final HorizontalChainReference createHorizontalChain(LayoutReference[] elements, ChainStyle chainStyle) {
        ?? From;
        HorizontalChainReference horizontalChainReference = new HorizontalChainReference(Integer.valueOf(createHelperId()));
        ?? cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            Object obj = layoutReference.helperParamsMap.get(Reflection.getOrCreateKotlinClass(ChainParams.class).getSimpleName());
            if (!(obj instanceof ChainParams)) {
                obj = null;
            }
            ChainParams chainParams = (ChainParams) obj;
            if (chainParams != null) {
                From = new CLArray(new char[0]);
                From.add(CLString.from(layoutReference.getId().toString()));
                From.add(new CLNumber(chainParams.getWeight()));
                From.add(new CLNumber(chainParams.getStartMargin()));
                From.add(new CLNumber(chainParams.getEndMargin()));
                From.add(new CLNumber(chainParams.getStartGoneMargin()));
                From.add(new CLNumber(chainParams.getEndGoneMargin()));
            } else {
                From = CLString.from(layoutReference.getId().toString());
            }
            cLArray.add(From);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName()));
        Float bias = chainStyle.getBias();
        cLArray2.add(new CLNumber(bias != null ? bias.floatValue() : 0.5f));
        ?? AsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(horizontalChainReference);
        AsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "hChain");
        AsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        AsCLContainer$constraintlayout_compose_release.put("style", cLArray2);
        updateHelpersHashCode(16);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return horizontalChainReference;
    }

    @SuppressLint({HttpHeaders.RANGE})
    /* renamed from: createRow-lG28NQ4, reason: not valid java name */
    public final ConstrainedLayoutReference m16804createRowlG28NQ4(LayoutReference[] elements, float spacing, float[] weights) {
        if ((weights.length == 0) || elements.length == weights.length) {
            return m16782createGridHu23Yyw$default(this, (LayoutReference[]) Arrays.copyOf(elements, elements.length), 1, 0, false, 0.0f, spacing, null, weights, null, null, 0, 1880, null);
        }
        throw new IllegalArgumentException("Number of weights (" + weights.length + ") should match number of elements (" + elements.length + ").");
    }

    /* renamed from: createStartBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m16805createStartBarrier3ABfNKs(LayoutReference[] elements, float margin) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            cLArray.add(CLString.from(layoutReference.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "start");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("margin", margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(10);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(margin));
        return new VerticalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* renamed from: createTopBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m16806createTopBarrier3ABfNKs(LayoutReference[] elements, float margin) {
        LayoutReferenceImpl layoutReferenceImpl = new LayoutReferenceImpl(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            cLArray.add(CLString.from(layoutReference.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(layoutReferenceImpl);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "top");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("margin", margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(12);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(C2452Dp.m16490hashCodeimpl(margin));
        return new HorizontalAnchor(layoutReferenceImpl.getId(), 0, layoutReferenceImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLObject] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.constraintlayout.core.parser.CLString] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.constraintlayout.compose.ConstraintLayoutBaseScope] */
    public final VerticalChainReference createVerticalChain(LayoutReference[] elements, ChainStyle chainStyle) {
        ?? From;
        VerticalChainReference verticalChainReference = new VerticalChainReference(Integer.valueOf(createHelperId()));
        ?? cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            Object obj = layoutReference.helperParamsMap.get(Reflection.getOrCreateKotlinClass(ChainParams.class).getSimpleName());
            if (!(obj instanceof ChainParams)) {
                obj = null;
            }
            ChainParams chainParams = (ChainParams) obj;
            if (chainParams != null) {
                From = new CLArray(new char[0]);
                From.add(CLString.from(layoutReference.getId().toString()));
                From.add(new CLNumber(chainParams.getWeight()));
                From.add(new CLNumber(chainParams.getTopMargin()));
                From.add(new CLNumber(chainParams.getBottomMargin()));
                From.add(new CLNumber(chainParams.getTopGoneMargin()));
                From.add(new CLNumber(chainParams.getBottomGoneMargin()));
            } else {
                From = CLString.from(layoutReference.getId().toString());
            }
            cLArray.add(From);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName()));
        Float bias = chainStyle.getBias();
        cLArray2.add(new CLNumber(bias != null ? bias.floatValue() : 0.5f));
        ?? AsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(verticalChainReference);
        AsCLContainer$constraintlayout_compose_release.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "vChain");
        AsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        AsCLContainer$constraintlayout_compose_release.put("style", cLArray2);
        updateHelpersHashCode(17);
        for (LayoutReference layoutReference2 : elements) {
            updateHelpersHashCode(layoutReference2.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return verticalChainReference;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ConstraintLayoutBaseScope) {
            return Intrinsics.areEqual(this.containerObject, ((ConstraintLayoutBaseScope) other).containerObject);
        }
        return false;
    }

    public final CLObject getContainerObject() {
        return this.containerObject;
    }

    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    public final List<Function1<State, Unit>> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.containerObject.hashCode();
    }

    public void reset() {
        this.containerObject.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public final void setHelpersHashCode(int i6) {
        this.helpersHashCode = i6;
    }

    /* renamed from: withChainParams-ouYQatA, reason: not valid java name */
    public final LayoutReference m16807withChainParamsouYQatA(LayoutReference layoutReference, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        layoutReference.setHelperParams$constraintlayout_compose_release(new ChainParams(f6, f7, f8, f9, f10, f11, f12, f13, f14, null));
        return layoutReference;
    }

    /* renamed from: withHorizontalChainParams-YLPp7PM, reason: not valid java name */
    public final LayoutReference m16808withHorizontalChainParamsYLPp7PM(LayoutReference layoutReference, float f6, float f7, float f8, float f9, float f10) {
        float f11 = 0;
        return m16807withChainParamsouYQatA(layoutReference, f6, C2452Dp.m16484constructorimpl(f11), f7, C2452Dp.m16484constructorimpl(f11), f8, C2452Dp.m16484constructorimpl(f11), f9, C2452Dp.m16484constructorimpl(f11), f10);
    }

    /* renamed from: withVerticalChainParams-YLPp7PM, reason: not valid java name */
    public final LayoutReference m16809withVerticalChainParamsYLPp7PM(LayoutReference layoutReference, float f6, float f7, float f8, float f9, float f10) {
        float f11 = 0;
        return m16807withChainParamsouYQatA(layoutReference, C2452Dp.m16484constructorimpl(f11), f6, C2452Dp.m16484constructorimpl(f11), f7, C2452Dp.m16484constructorimpl(f11), f8, C2452Dp.m16484constructorimpl(f11), f9, f10);
    }

    public final VerticalChainScope constrain(VerticalChainReference ref, Function1<? super VerticalChainScope, Unit> constrainBlock) {
        VerticalChainScope verticalChainScope = new VerticalChainScope(ref.getId(), asCLContainer$constraintlayout_compose_release(ref));
        constrainBlock.invoke(verticalChainScope);
        return verticalChainScope;
    }

    public final ConstrainScope constrain(ConstrainedLayoutReference ref, Function1<? super ConstrainScope, Unit> constrainBlock) {
        ConstrainScope constrainScope = new ConstrainScope(ref.getId(), asCLContainer$constraintlayout_compose_release(ref));
        constrainBlock.invoke(constrainScope);
        return constrainScope;
    }

    public final void constrain(ConstrainedLayoutReference[] refs, Function1<? super ConstrainScope, Unit> constrainBlock) {
        for (ConstrainedLayoutReference constrainedLayoutReference : refs) {
            constrain(constrainedLayoutReference, constrainBlock);
        }
    }

    public ConstraintLayoutBaseScope() {
        this(null);
    }
}
