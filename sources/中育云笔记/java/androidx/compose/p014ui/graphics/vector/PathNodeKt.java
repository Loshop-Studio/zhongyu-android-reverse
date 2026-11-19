package androidx.compose.p014ui.graphics.vector;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.p014ui.graphics.vector.PathNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import java.util.ArrayList;
import java.util.List;
import p181hd.InterfaceC9544p;

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

    public static final void addPathNodes(char c10, ArrayList<PathNode> arrayList, float[] fArr, int i10) {
        int i11 = 0;
        switch (c10) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                int i12 = i10 - 7;
                for (int i13 = 0; i13 <= i12; i13 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], Float.compare(fArr[i13 + 3], 0.0f) != 0, Float.compare(fArr[i13 + 4], 0.0f) != 0, fArr[i13 + 5], fArr[i13 + 6]));
                }
                return;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                int i14 = i10 - 6;
                while (i11 <= i14) {
                    arrayList.add(new PathNode.CurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case PatchStatus.CODE_LOAD_AES_DECRYPT /* 72 */:
                int i15 = i10 - 1;
                while (i11 <= i15) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i11]));
                    i11++;
                }
                return;
            case PatchStatus.CODE_LOAD_SOPHIX_VERSION /* 76 */:
                int i16 = i10 - 2;
                while (i11 <= i16) {
                    arrayList.add(new PathNode.LineTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'M':
                pathMoveNodeFromArgs(arrayList, fArr, i10);
                return;
            case PatchStatus.CODE_LOAD_HANDLE_DEX /* 81 */:
                int i17 = i10 - 4;
                while (i11 <= i17) {
                    arrayList.add(new PathNode.QuadTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR /* 83 */:
                int i18 = i10 - 4;
                while (i11 <= i18) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case PatchStatus.CODE_LOAD_FIND_METHOD /* 84 */:
                int i19 = i10 - 2;
                while (i11 <= i19) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case PatchStatus.CODE_LOAD_ILLEGAL_ACCESS /* 86 */:
                int i20 = i10 - 1;
                while (i11 <= i20) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i11]));
                    i11++;
                }
                return;
            case C7843ab.b.API_MYNA_INIT /* 90 */:
            case 'z':
                arrayList.add(PathNode.Close.INSTANCE);
                return;
            case 'a':
                int i21 = i10 - 7;
                for (int i22 = 0; i22 <= i21; i22 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i22], fArr[i22 + 1], fArr[i22 + 2], Float.compare(fArr[i22 + 3], 0.0f) != 0, Float.compare(fArr[i22 + 4], 0.0f) != 0, fArr[i22 + 5], fArr[i22 + 6]));
                }
                return;
            case 'c':
                int i23 = i10 - 6;
                while (i11 <= i23) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'h':
                int i24 = i10 - 1;
                while (i11 <= i24) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i11]));
                    i11++;
                }
                return;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                int i25 = i10 - 2;
                while (i11 <= i25) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i10);
                return;
            case 'q':
                int i26 = i10 - 4;
                while (i11 <= i26) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 's':
                int i27 = i10 - 4;
                while (i11 <= i27) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 't':
                int i28 = i10 - 2;
                while (i11 <= i28) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'v':
                int i29 = i10 - 1;
                while (i11 <= i29) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i11]));
                    i11++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c10);
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new PathNode.LineTo(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i10, int i11, InterfaceC9544p interfaceC9544p) {
        int i12 = i10 - i11;
        int i13 = 0;
        while (i13 <= i12) {
            list.add(interfaceC9544p.invoke(fArr, Integer.valueOf(i13)));
            i13 += i11;
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
