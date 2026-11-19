package androidx.compose.p011ui.graphics.vector;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.graphics.vector.PathNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ap\u0010\u0014\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000728\b\u0004\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0016\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001a\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001a\"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001a\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001a\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001a\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001a\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001a\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001a\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001a\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001a\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u001a\"\u0014\u0010,\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001a\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u001a\"\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010/\"\u0014\u00103\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010/\"\u0014\u00105\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010/\"\u0014\u00106\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010/\"\u0014\u00107\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010/¨\u00068"}, m5110d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "Ld6/s;", "addPathNodes", "(CLjava/util/ArrayList;[FI)V", "", "numArgs", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "subArray", "start", "nodeFor", "pathNodesFromArgs", "(Ljava/util/List;[FIILr6/e;)V", "pathMoveNodeFromArgs", "(Ljava/util/List;[FI)V", "pathRelativeMoveNodeFromArgs", "RelativeCloseKey", "C", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", "I", "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,329:1\n254#1,7:330\n254#1,7:337\n254#1,7:344\n254#1,7:351\n254#1,7:358\n254#1,7:365\n254#1,7:372\n254#1,7:379\n254#1,7:386\n254#1,7:393\n254#1,7:400\n254#1,7:407\n254#1,7:414\n254#1,7:421\n254#1,7:428\n254#1,7:435\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n130#1:330,7\n134#1:337,7\n138#1:344,7\n142#1:351,7\n146#1:358,7\n150#1:365,7\n154#1:372,7\n165#1:379,7\n176#1:386,7\n185#1:393,7\n194#1:400,7\n203#1:407,7\n212#1:414,7\n216#1:421,7\n220#1:428,7\n232#1:435,7\n*E\n"})
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c, @NotNull ArrayList<PathNode> arrayList, @NotNull float[] fArr, int i) {
        int i8 = 0;
        switch (c) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                int i9 = i - 7;
                for (int i10 = 0; i10 <= i9; i10 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], Float.compare(fArr[i10 + 3], 0.0f) != 0, Float.compare(fArr[i10 + 4], 0.0f) != 0, fArr[i10 + 5], fArr[i10 + 6]));
                }
                return;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                int i11 = i - 6;
                while (i8 <= i11) {
                    arrayList.add(new PathNode.CurveTo(fArr[i8], fArr[i8 + 1], fArr[i8 + 2], fArr[i8 + 3], fArr[i8 + 4], fArr[i8 + 5]));
                    i8 += 6;
                }
                return;
            case 'H':
                int i12 = i - 1;
                while (i8 <= i12) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i8]));
                    i8++;
                }
                return;
            case 'L':
                int i13 = i - 2;
                while (i8 <= i13) {
                    arrayList.add(new PathNode.LineTo(fArr[i8], fArr[i8 + 1]));
                    i8 += 2;
                }
                return;
            case 'M':
                pathMoveNodeFromArgs(arrayList, fArr, i);
                return;
            case 'Q':
                int i14 = i - 4;
                while (i8 <= i14) {
                    arrayList.add(new PathNode.QuadTo(fArr[i8], fArr[i8 + 1], fArr[i8 + 2], fArr[i8 + 3]));
                    i8 += 4;
                }
                return;
            case 'S':
                int i15 = i - 4;
                while (i8 <= i15) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i8], fArr[i8 + 1], fArr[i8 + 2], fArr[i8 + 3]));
                    i8 += 4;
                }
                return;
            case 'T':
                int i16 = i - 2;
                while (i8 <= i16) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i8], fArr[i8 + 1]));
                    i8 += 2;
                }
                return;
            case 'V':
                int i17 = i - 1;
                while (i8 <= i17) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i8]));
                    i8++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(PathNode.Close.INSTANCE);
                return;
            case 'a':
                int i18 = i - 7;
                for (int i19 = 0; i19 <= i18; i19 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i19], fArr[i19 + 1], fArr[i19 + 2], Float.compare(fArr[i19 + 3], 0.0f) != 0, Float.compare(fArr[i19 + 4], 0.0f) != 0, fArr[i19 + 5], fArr[i19 + 6]));
                }
                return;
            case 'c':
                int i20 = i - 6;
                while (i8 <= i20) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i8], fArr[i8 + 1], fArr[i8 + 2], fArr[i8 + 3], fArr[i8 + 4], fArr[i8 + 5]));
                    i8 += 6;
                }
                return;
            case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                int i21 = i - 1;
                while (i8 <= i21) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i8]));
                    i8++;
                }
                return;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                int i22 = i - 2;
                while (i8 <= i22) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i8], fArr[i8 + 1]));
                    i8 += 2;
                }
                return;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i);
                return;
            case 'q':
                int i23 = i - 4;
                while (i8 <= i23) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i8], fArr[i8 + 1], fArr[i8 + 2], fArr[i8 + 3]));
                    i8 += 4;
                }
                return;
            case 's':
                int i24 = i - 4;
                while (i8 <= i24) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i8], fArr[i8 + 1], fArr[i8 + 2], fArr[i8 + 3]));
                    i8 += 4;
                }
                return;
            case 't':
                int i25 = i - 2;
                while (i8 <= i25) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i8], fArr[i8 + 1]));
                    i8 += 2;
                }
                return;
            case 'v':
                int i26 = i - 1;
                while (i8 <= i26) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i8]));
                    i8++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c);
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i8 = i - 2;
        if (i8 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i9 = 2; i9 <= i8; i9 += 2) {
                list.add(new PathNode.LineTo(fArr[i9], fArr[i9 + 1]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i, int i8, InterfaceC6473e interfaceC6473e) {
        int i9 = i - i8;
        int i10 = 0;
        while (i10 <= i9) {
            list.add(interfaceC6473e.invoke(fArr, Integer.valueOf(i10)));
            i10 += i8;
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i8 = i - 2;
        if (i8 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i9 = 2; i9 <= i8; i9 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i9], fArr[i9 + 1]));
            }
        }
    }
}
