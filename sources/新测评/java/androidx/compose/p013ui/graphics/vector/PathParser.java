package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Path;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ8\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0011\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082\bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m13558d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "()V", "nodeData", "", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "addPathNodes", "", "clear", "", "parsePathString", "pathData", "", "pathStringToNodes", "resizeNodeData", "dataCount", "", "toNodes", "toPath", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,546:1\n152#1,6:550\n41#2:547\n43#2:548\n22#3:549\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n135#1:550,6\n129#1:547\n130#1:548\n130#1:549\n*E\n"})
/* loaded from: classes2.dex */
public final class PathParser {
    private float[] nodeData = new float[64];
    private ArrayList<PathNode> nodes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser pathParser, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.pathStringToNodes(str, arrayList);
    }

    private final void resizeNodeData(int dataCount) {
        float[] fArr = this.nodeData;
        if (dataCount >= fArr.length) {
            float[] fArr2 = new float[dataCount * 2];
            this.nodeData = fArr2;
            ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final PathParser addPathNodes(List<? extends PathNode> nodes) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        }
        arrayList.addAll(nodes);
        return this;
    }

    public final void clear() {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final PathParser parsePathString(String pathData) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(pathData, arrayList);
        return this;
    }

    public final ArrayList<PathNode> pathStringToNodes(String pathData, ArrayList<PathNode> nodes) {
        int i10;
        char cCharAt;
        int i11;
        int length = pathData.length();
        int i12 = 0;
        while (i12 < length && Intrinsics.compare((int) pathData.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                cCharAt = pathData.charAt(i12);
                int i14 = cCharAt | ' ';
                if ((i14 - 97) * (i14 - 122) <= 0 && i14 != 101) {
                    break;
                }
                if (i10 >= length) {
                    cCharAt = 0;
                    break;
                }
                i12 = i10;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || Intrinsics.compare((int) pathData.charAt(i10), 32) > 0) {
                            long jNextFloat = FastFloatParserKt.nextFloat(pathData, i10, length);
                            i11 = (int) (jNextFloat >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jNextFloat & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i15 = i13 + 1;
                                fArr[i13] = fIntBitsToFloat;
                                if (i15 >= fArr.length) {
                                    float[] fArr2 = new float[i15 * 2];
                                    this.nodeData = fArr2;
                                    ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i15;
                            }
                            while (i11 < length && pathData.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                PathNodeKt.addPathNodes(cCharAt, nodes, this.nodeData, i13);
            }
            i12 = i10;
        }
        return nodes;
    }

    public final List<PathNode> toNodes() {
        ArrayList<PathNode> arrayList = this.nodes;
        return arrayList != null ? arrayList : CollectionsKt.emptyList();
    }

    public final Path toPath(Path target) {
        Path path;
        ArrayList<PathNode> arrayList = this.nodes;
        return (arrayList == null || (path = PathParserKt.toPath(arrayList, target)) == null) ? AndroidPath_androidKt.Path() : path;
    }
}
