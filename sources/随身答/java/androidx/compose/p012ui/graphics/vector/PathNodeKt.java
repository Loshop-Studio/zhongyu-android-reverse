package androidx.compose.p012ui.graphics.vector;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.compose.p012ui.graphics.vector.PathNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p071uc.crashsdk.export.ExitType;
import com.taobao.sophix.PatchStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000@\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0002\u001ai\u0010'\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b28\b\u0004\u0010)\u001a2\u0012\u0013\u0012\u00110%¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020#0*H\u0082\b\u001a&\u0010/\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0002\u001a4\u00100\u001a\u00020 *\u00020\u00012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#01j\b\u0012\u0004\u0012\u00020#`22\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, m13413d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathMoveNodeFromArgs", "", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "count", "pathNodesFromArgs", "numArgs", "nodeFor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "subArray", "start", "pathRelativeMoveNodeFromArgs", "addPathNodes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ui-graphics_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,329:1\n254#1,7:330\n254#1,7:337\n254#1,7:344\n254#1,7:351\n254#1,7:358\n254#1,7:365\n254#1,7:372\n254#1,7:379\n254#1,7:386\n254#1,7:393\n254#1,7:400\n254#1,7:407\n254#1,7:414\n254#1,7:421\n254#1,7:428\n254#1,7:435\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n130#1:330,7\n134#1:337,7\n138#1:344,7\n142#1:351,7\n146#1:358,7\n150#1:365,7\n154#1:372,7\n165#1:379,7\n176#1:386,7\n185#1:393,7\n194#1:400,7\n203#1:407,7\n212#1:414,7\n216#1:421,7\n220#1:428,7\n232#1:435,7\n*E\n"})
/* loaded from: classes2.dex */
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

    public static final void addPathNodes(char c10, ArrayList<PathNode> arrayList, float[] fArr, int i9) {
        int i10 = 0;
        switch (c10) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                int i11 = i9 - 7;
                for (int i12 = 0; i12 <= i11; i12 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], Float.compare(fArr[i12 + 3], 0.0f) != 0, Float.compare(fArr[i12 + 4], 0.0f) != 0, fArr[i12 + 5], fArr[i12 + 6]));
                }
                return;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                int i13 = i9 - 6;
                while (i10 <= i13) {
                    arrayList.add(new PathNode.CurveTo(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]));
                    i10 += 6;
                }
                return;
            case PatchStatus.CODE_LOAD_AES_DECRYPT /* 72 */:
                int i14 = i9 - 1;
                while (i10 <= i14) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i10]));
                    i10++;
                }
                return;
            case PatchStatus.CODE_LOAD_SOPHIX_VERSION /* 76 */:
                int i15 = i9 - 2;
                while (i10 <= i15) {
                    arrayList.add(new PathNode.LineTo(fArr[i10], fArr[i10 + 1]));
                    i10 += 2;
                }
                return;
            case PatchStatus.CODE_LOAD_NOT_ZIP_FORMAT /* 77 */:
                pathMoveNodeFromArgs(arrayList, fArr, i9);
                return;
            case PatchStatus.CODE_LOAD_HANDLE_DEX /* 81 */:
                int i16 = i9 - 4;
                while (i10 <= i16) {
                    arrayList.add(new PathNode.QuadTo(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                    i10 += 4;
                }
                return;
            case PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR /* 83 */:
                int i17 = i9 - 4;
                while (i10 <= i17) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                    i10 += 4;
                }
                return;
            case PatchStatus.CODE_LOAD_FIND_METHOD /* 84 */:
                int i18 = i9 - 2;
                while (i10 <= i18) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i10], fArr[i10 + 1]));
                    i10 += 2;
                }
                return;
            case PatchStatus.CODE_LOAD_ILLEGAL_ACCESS /* 86 */:
                int i19 = i9 - 1;
                while (i10 <= i19) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i10]));
                    i10++;
                }
                return;
            case 'Z':
            case PatchStatus.CODE_LOAD_RES_UPDATECONFIG /* 122 */:
                arrayList.add(PathNode.Close.INSTANCE);
                return;
            case ExitType.UNEXP_FOREGROUND_CRASH /* 97 */:
                int i20 = i9 - 7;
                for (int i21 = 0; i21 <= i20; i21 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i21], fArr[i21 + 1], fArr[i21 + 2], Float.compare(fArr[i21 + 3], 0.0f) != 0, Float.compare(fArr[i21 + 4], 0.0f) != 0, fArr[i21 + 5], fArr[i21 + 6]));
                }
                return;
            case 'c':
                int i22 = i9 - 6;
                while (i10 <= i22) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]));
                    i10 += 6;
                }
                return;
            case 'h':
                int i23 = i9 - 1;
                while (i10 <= i23) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i10]));
                    i10++;
                }
                return;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                int i24 = i9 - 2;
                while (i10 <= i24) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i10], fArr[i10 + 1]));
                    i10 += 2;
                }
                return;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i9);
                return;
            case 'q':
                int i25 = i9 - 4;
                while (i10 <= i25) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                    i10 += 4;
                }
                return;
            case 's':
                int i26 = i9 - 4;
                while (i10 <= i26) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                    i10 += 4;
                }
                return;
            case 't':
                int i27 = i9 - 2;
                while (i10 <= i27) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i10], fArr[i10 + 1]));
                    i10 += 2;
                }
                return;
            case 'v':
                int i28 = i9 - 1;
                while (i10 <= i28) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i10]));
                    i10++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c10);
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i9) {
        int i10 = i9 - 2;
        if (i10 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i11 = 2; i11 <= i10; i11 += 2) {
                list.add(new PathNode.LineTo(fArr[i11], fArr[i11 + 1]));
            }
        }
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i9, int i10, Function2<? super float[], ? super Integer, ? extends PathNode> function2) {
        int i11 = i9 - i10;
        int i12 = 0;
        while (i12 <= i11) {
            list.add(function2.invoke(fArr, Integer.valueOf(i12)));
            i12 += i10;
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i9) {
        int i10 = i9 - 2;
        if (i10 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i11 = 2; i11 <= i10; i11 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i11], fArr[i11 + 1]));
            }
        }
    }
}
