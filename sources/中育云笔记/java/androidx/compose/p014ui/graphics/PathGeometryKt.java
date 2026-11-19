package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.graphics.PathSegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10968r;

/* loaded from: classes2.dex */
public final class PathGeometryKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.Path.Direction computeDirection(androidx.compose.p014ui.graphics.Path r32) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.PathGeometryKt.computeDirection(androidx.compose.ui.graphics.Path):androidx.compose.ui.graphics.Path$Direction");
    }

    public static final List<Path> divide(Path path, List<Path> list) {
        Path Path = AndroidPath_androidKt.Path();
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
        Path Path2 = Path;
        boolean z10 = true;
        boolean z11 = true;
        while (typeNext$default != PathSegment.Type.Done) {
            switch (WhenMappings.$EnumSwitchMapping$0[typeNext$default.ordinal()]) {
                case 1:
                    if (!z10 && !z11) {
                        list.add(Path2);
                        Path2 = AndroidPath_androidKt.Path();
                    }
                    Path2.moveTo(fArr[0], fArr[1]);
                    z10 = false;
                    z11 = true;
                    typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 2:
                    Path2.lineTo(fArr[2], fArr[3]);
                    z11 = false;
                    typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 3:
                    Path2.quadraticTo(fArr[2], fArr[3], fArr[4], fArr[5]);
                    z11 = false;
                    typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 4:
                case 7:
                    break;
                case 5:
                    Path2.cubicTo(fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    z11 = false;
                    typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 6:
                    Path2.close();
                    typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                default:
                    typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
            }
        }
        if (!z10 && !z11) {
            list.add(Path2);
        }
        return list;
    }

    public static /* synthetic */ List divide$default(Path path, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return divide(path, list);
    }

    private static final int floatCountForType(PathSegment.Type type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
            case 5:
                return 8;
            case 6:
            case 7:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Path reverse(Path path, Path path2) {
        boolean z10;
        float[] fArr;
        PathIterator it = path.iterator();
        int iCalculateSize = it.calculateSize(false);
        ArrayList arrayList = new ArrayList(iCalculateSize);
        ArrayList arrayList2 = new ArrayList(iCalculateSize);
        float[] fArr2 = new float[8];
        for (PathSegment.Type typeNext$default = PathIterator.next$default(it, fArr2, 0, 2, null); typeNext$default != PathSegment.Type.Done; typeNext$default = PathIterator.next$default(it, fArr2, 0, 2, null)) {
            arrayList.add(typeNext$default);
            if (typeNext$default != PathSegment.Type.Close) {
                float[] fArrCopyOf = Arrays.copyOf(fArr2, floatCountForType(typeNext$default));
                AbstractC9979u.m20293f(fArrCopyOf, "copyOf(...)");
                arrayList2.add(fArrCopyOf);
            }
        }
        int size = arrayList2.size();
        boolean z11 = false;
        boolean z12 = true;
        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
            if (z12) {
                size--;
                fArr = (float[]) arrayList2.get(size);
                int iM24112x0 = AbstractC10968r.m24112x0(fArr);
                path2.moveTo(fArr[iM24112x0 - 1], fArr[iM24112x0]);
                z10 = false;
            } else {
                z10 = z12;
                fArr = (float[]) arrayList2.get(size);
            }
            int i10 = size;
            int i11 = WhenMappings.$EnumSwitchMapping$0[((PathSegment.Type) arrayList.get(size2)).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    float[] fArr3 = fArr;
                    path2.lineTo(fArr3[0], fArr3[1]);
                } else if (i11 == 3) {
                    float[] fArr4 = fArr;
                    path2.quadraticTo(fArr4[2], fArr4[3], fArr4[0], fArr4[1]);
                } else if (i11 != 5) {
                    if (i11 == 6) {
                        z11 = true;
                    }
                    size = i10;
                    z12 = z10;
                } else {
                    float[] fArr5 = fArr;
                    path2.cubicTo(fArr[4], fArr[5], fArr[2], fArr5[3], fArr5[0], fArr5[1]);
                }
                i10--;
                size = i10;
                z12 = z10;
            } else {
                if (z11) {
                    path2.close();
                    z11 = false;
                }
                z12 = true;
                size = i10;
            }
        }
        if (z11) {
            path2.close();
        }
        return path2;
    }

    public static /* synthetic */ Path reverse$default(Path path, Path path2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path2 = AndroidPath_androidKt.Path();
        }
        return reverse(path, path2);
    }
}
