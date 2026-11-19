package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10978w;

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

    private final void resizeNodeData(int i10) {
        float[] fArr = this.nodeData;
        if (i10 >= fArr.length) {
            float[] fArr2 = new float[i10 * 2];
            this.nodeData = fArr2;
            AbstractC10964p.m24020m(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final PathParser addPathNodes(List<? extends PathNode> list) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        }
        arrayList.addAll(list);
        return this;
    }

    public final void clear() {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final PathParser parsePathString(String str) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(str, arrayList);
        return this;
    }

    public final ArrayList<PathNode> pathStringToNodes(String str, ArrayList<PathNode> arrayList) {
        int i10;
        char cCharAt;
        int i11;
        int length = str.length();
        int i12 = 0;
        while (i12 < length && AbstractC9979u.m20296i(str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && AbstractC9979u.m20296i(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                cCharAt = str.charAt(i12);
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
                        if (i10 >= length || AbstractC9979u.m20296i(str.charAt(i10), 32) > 0) {
                            long jNextFloat = FastFloatParserKt.nextFloat(str, i10, length);
                            i11 = (int) (jNextFloat >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jNextFloat & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i15 = i13 + 1;
                                fArr[i13] = fIntBitsToFloat;
                                if (i15 >= fArr.length) {
                                    float[] fArr2 = new float[i15 * 2];
                                    this.nodeData = fArr2;
                                    AbstractC10964p.m24020m(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i15;
                            }
                            while (i11 < length && str.charAt(i11) == ',') {
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
                PathNodeKt.addPathNodes(cCharAt, arrayList, this.nodeData, i13);
            }
            i12 = i10;
        }
        return arrayList;
    }

    public final List<PathNode> toNodes() {
        ArrayList<PathNode> arrayList = this.nodes;
        return arrayList != null ? arrayList : AbstractC10978w.m24136n();
    }

    public final Path toPath(Path path) {
        Path path2;
        ArrayList<PathNode> arrayList = this.nodes;
        return (arrayList == null || (path2 = PathParserKt.toPath(arrayList, path)) == null) ? AndroidPath_androidKt.Path() : path2;
    }
}
