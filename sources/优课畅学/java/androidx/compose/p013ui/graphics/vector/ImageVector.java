package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@Immutable
/* loaded from: classes2.dex */
public final class ImageVector {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int imageVectorCount;
    private static final Object lock;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    @StabilityInferred(parameters = 0)
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        public static final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, TXLiteAVCode.EVT_CAMERA_REMOVED, null);
            }

            public final List<VectorNode> getChildren() {
                return this.children;
            }

            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            public final String getName() {
                return this.name;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(List<VectorNode> list) {
                this.children = list;
            }

            public final void setClipPathData(List<? extends PathNode> list) {
                this.clipPathData = list;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setPivotX(float f10) {
                this.pivotX = f10;
            }

            public final void setPivotY(float f10) {
                this.pivotY = f10;
            }

            public final void setRotate(float f10) {
                this.rotate = f10;
            }

            public final void setScaleX(float f10) {
                this.scaleX = f10;
            }

            public final void setScaleY(float f10) {
                this.scaleY = f10;
            }

            public final void setTranslationX(float f10) {
                this.translationX = f10;
            }

            public final void setTranslationY(float f10) {
                this.translationY = f10;
            }

            public GroupParams(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends PathNode> list, List<VectorNode> list2) {
                this.name = str;
                this.rotate = f10;
                this.pivotX = f11;
                this.pivotY = f12;
                this.scaleX = f13;
                this.scaleY = f14;
                this.translationX = f15;
                this.translationY = f16;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ GroupParams(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, AbstractC9126n abstractC9126n) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        @InterfaceC8721a
        public /* synthetic */ Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, AbstractC9126n abstractC9126n) {
            this(str, f10, f11, f12, f13, j10, i10);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "";
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 4) != 0) {
                f11 = 0.0f;
            }
            if ((i10 & 8) != 0) {
                f12 = 0.0f;
            }
            if ((i10 & 16) != 0) {
                f13 = 1.0f;
            }
            if ((i10 & 32) != 0) {
                f14 = 1.0f;
            }
            if ((i10 & 64) != 0) {
                f15 = 0.0f;
            }
            if ((i10 & 128) != 0) {
                f16 = 0.0f;
            }
            if ((i10 & 256) != 0) {
                list = VectorKt.getEmptyPath();
            }
            float f17 = f16;
            List list2 = list;
            float f18 = f15;
            float f19 = f13;
            return builder.addGroup(str, f10, f11, f12, f19, f14, f18, f17, list2);
        }

        /* renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m24961addPathoIyEayM$default(Builder builder, List list, int i10, String str, Brush brush, float f10, Brush brush2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, int i13, Object obj) {
            return builder.m24962addPathoIyEayM(list, (i13 & 2) != 0 ? VectorKt.getDefaultFillType() : i10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : brush, (i13 & 16) != 0 ? 1.0f : f10, (i13 & 32) == 0 ? brush2 : null, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? 0.0f : f12, (i13 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i11, (i13 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i12, (i13 & 1024) != 0 ? 4.0f : f13, (i13 & 2048) != 0 ? 0.0f : f14, (i13 & 4096) == 0 ? f15 : 1.0f, (i13 & 8192) != 0 ? 0.0f : f16);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (this.isConsumed) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) ImageVectorKt.peek(this.nodes);
        }

        public final Builder addGroup(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.push(this.nodes, new GroupParams(str, f10, f11, f12, f13, f14, f15, f16, list, null, 512, null));
            return this;
        }

        /* renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m24962addPathoIyEayM(List<? extends PathNode> list, int i10, String str, Brush brush, float f10, Brush brush2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i10, brush, f10, brush2, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) ImageVectorKt.pop(this.nodes)));
            return this;
        }

        public /* synthetic */ Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, AbstractC9126n abstractC9126n) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        private Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.name = str;
            this.defaultWidth = f10;
            this.defaultHeight = f11;
            this.viewportWidth = f12;
            this.viewportHeight = f13;
            this.tintColor = j10;
            this.tintBlendMode = i10;
            this.autoMirror = z10;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, TXLiteAVCode.EVT_CAMERA_REMOVED, null);
            this.root = groupParams;
            ImageVectorKt.push(arrayList, groupParams);
        }

        public /* synthetic */ Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, AbstractC9126n abstractC9126n) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10, (i11 & 64) != 0 ? BlendMode.Companion.m24216getSrcIn0nO6VwU() : i10, (i11 & 128) != 0 ? false : z10, (AbstractC9126n) null);
        }

        public /* synthetic */ Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, int i11, AbstractC9126n abstractC9126n) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10, (i11 & 64) != 0 ? BlendMode.Companion.m24216getSrcIn0nO6VwU() : i10, (AbstractC9126n) null);
        }

        private Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10) {
            this(str, f10, f11, f12, f13, j10, i10, false, (AbstractC9126n) null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final int generateImageVectorId$ui_release() {
            int i10;
            synchronized (ImageVector.lock) {
                i10 = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i10 + 1;
            }
            return i10;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        lock = companion;
    }

    public /* synthetic */ ImageVector(String str, float f10, float f11, float f12, float f13, VectorGroup vectorGroup, long j10, int i10, boolean z10, int i11, AbstractC9126n abstractC9126n) {
        this(str, f10, f11, f12, f13, vectorGroup, j10, i10, z10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return AbstractC9133u.m16128b(this.name, imageVector.name) && C3156Dp.m26904equalsimpl0(this.defaultWidth, imageVector.defaultWidth) && C3156Dp.m26904equalsimpl0(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && AbstractC9133u.m16128b(this.root, imageVector.root) && Color.m24277equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m24187equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m24957getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m24958getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final int getGenId$ui_release() {
        return this.genId;
    }

    public final String getName() {
        return this.name;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m24959getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m24960getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + C3156Dp.m26905hashCodeimpl(this.defaultWidth)) * 31) + C3156Dp.m26905hashCodeimpl(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m24283hashCodeimpl(this.tintColor)) * 31) + BlendMode.m24188hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    private ImageVector(String str, float f10, float f11, float f12, float f13, VectorGroup vectorGroup, long j10, int i10, boolean z10, int i11) {
        this.name = str;
        this.defaultWidth = f10;
        this.defaultHeight = f11;
        this.viewportWidth = f12;
        this.viewportHeight = f13;
        this.root = vectorGroup;
        this.tintColor = j10;
        this.tintBlendMode = i10;
        this.autoMirror = z10;
        this.genId = i11;
    }

    public /* synthetic */ ImageVector(String str, float f10, float f11, float f12, float f13, VectorGroup vectorGroup, long j10, int i10, boolean z10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(str, f10, f11, f12, f13, vectorGroup, j10, i10, z10, (i12 & 512) != 0 ? Companion.generateImageVectorId$ui_release() : i11, null);
    }
}
