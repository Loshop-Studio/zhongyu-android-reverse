package androidx.compose.p009ui.graphics;

import androidx.compose.p009ui.graphics.PathSegment;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m7880d2 = {"CloseSegment", "Landroidx/compose/ui/graphics/PathSegment;", "getCloseSegment", "()Landroidx/compose/ui/graphics/PathSegment;", "DoneSegment", "getDoneSegment", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class PathSegmentKt {
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new float[0], 0.0f);
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new float[0], 0.0f);

    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
