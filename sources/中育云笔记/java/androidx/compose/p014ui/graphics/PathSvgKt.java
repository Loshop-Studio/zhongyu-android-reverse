package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.PathSegment;
import androidx.compose.p014ui.graphics.vector.PathParser;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class PathSvgKt {

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

    public static final void addSvg(Path path, String str) {
        new PathParser().parsePathString(str).toPath(path);
    }

    private static final String command(PathSegment.Type type, PathSegment.Type type2) {
        if (type == type2) {
            return " ";
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? "" : "Z" : "C" : "Q" : "L" : "M";
    }

    public static final String toSvg(Path path, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        Rect bounds = path.getBounds();
        if (z10) {
            sb2.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            sb2.append("viewBox=\"" + bounds.getLeft() + ' ' + bounds.getTop() + ' ' + (bounds.getRight() - bounds.getLeft()) + ' ' + (bounds.getBottom() - bounds.getTop()) + "\">");
            AbstractC9979u.m20293f(sb2, "append(...)");
            sb2.append('\n');
            AbstractC9979u.m20293f(sb2, "append(...)");
        }
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type type = PathSegment.Type.Done;
        if (it.hasNext()) {
            if (z10) {
                if (PathFillType.m31156equalsimpl0(path.mo30769getFillTypeRgk1Os(), PathFillType.Companion.m31160getEvenOddRgk1Os())) {
                    sb2.append("  <path fill-rule=\"evenodd\" d=\"");
                } else {
                    sb2.append("  <path d=\"");
                }
            }
            while (it.hasNext()) {
                PathSegment.Type typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                switch (WhenMappings.$EnumSwitchMapping$0[typeNext$default.ordinal()]) {
                    case 1:
                        sb2.append(command(PathSegment.Type.Move, type) + fArr[0] + ' ' + fArr[1]);
                        type = typeNext$default;
                        break;
                    case 2:
                        sb2.append(command(PathSegment.Type.Line, type) + fArr[2] + ' ' + fArr[3]);
                        type = typeNext$default;
                        break;
                    case 3:
                        sb2.append(command(PathSegment.Type.Quadratic, type));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(fArr[2]);
                        sb3.append(' ');
                        sb3.append(fArr[3]);
                        sb3.append(' ');
                        sb3.append(fArr[4]);
                        sb3.append(' ');
                        sb3.append(fArr[5]);
                        sb2.append(sb3.toString());
                        type = typeNext$default;
                        break;
                    case 4:
                    case 7:
                        break;
                    case 5:
                        sb2.append(command(PathSegment.Type.Cubic, type));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(fArr[2]);
                        sb4.append(' ');
                        sb4.append(fArr[3]);
                        sb4.append(' ');
                        sb2.append(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(fArr[4]);
                        sb5.append(' ');
                        sb5.append(fArr[5]);
                        sb5.append(' ');
                        sb2.append(sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(fArr[6]);
                        sb6.append(' ');
                        sb6.append(fArr[7]);
                        sb2.append(sb6.toString());
                        type = typeNext$default;
                        break;
                    case 6:
                        sb2.append(command(PathSegment.Type.Close, type));
                        type = typeNext$default;
                        break;
                    default:
                        type = typeNext$default;
                        break;
                }
            }
            if (z10) {
                sb2.append("\"/>");
                AbstractC9979u.m20293f(sb2, "append(...)");
                sb2.append('\n');
                AbstractC9979u.m20293f(sb2, "append(...)");
            }
        }
        if (z10) {
            sb2.append("</svg>");
            AbstractC9979u.m20293f(sb2, "append(...)");
            sb2.append('\n');
            AbstractC9979u.m20293f(sb2, "append(...)");
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String toSvg$default(Path path, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toSvg(path, z10);
    }
}
