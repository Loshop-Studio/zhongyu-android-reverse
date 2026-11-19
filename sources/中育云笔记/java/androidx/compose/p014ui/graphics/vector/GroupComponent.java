package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawTransform;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private InterfaceC9540l invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final InterfaceC9540l wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m30914getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VNode) obj);
                return C10786q.f26013a;
            }

            public final void invoke(VNode vNode) {
                this.this$0.markTintForVNode(vNode);
                InterfaceC9540l invalidateListener$ui_release = this.this$0.getInvalidateListener$ui_release();
                if (invalidateListener$ui_release != null) {
                    invalidateListener$ui_release.invoke(vNode);
                }
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m30914getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m31557markTintForColor8_81llA(((SolidColor) brush).m31213getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m31557markTintForColor8_81llA(long j10) {
        if (this.isTintable && j10 != 16) {
            long j11 = this.tintColor;
            if (j11 == 16) {
                this.tintColor = j10;
            } else {
                if (VectorKt.m31581rgbEqualOWjLjI(j11, j10)) {
                    return;
                }
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m31557markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path Path = this.clipPath;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.clipPath = Path;
            }
            PathParserKt.toPath(this.clipPathData, Path);
        }
    }

    private final void updateMatrix() {
        float[] fArrM31108constructorimpl$default = this.groupMatrix;
        if (fArrM31108constructorimpl$default == null) {
            fArrM31108constructorimpl$default = Matrix.m31108constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM31108constructorimpl$default;
        } else {
            Matrix.m31117resetimpl(fArrM31108constructorimpl$default);
        }
        float[] fArr = fArrM31108constructorimpl$default;
        Matrix.m31130translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m31122rotateZimpl(fArr, this.rotation);
        Matrix.m31123scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m31130translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.p014ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo31358transform58bKbWc(Matrix.m31106boximpl(fArr).m31131unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.m31485clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).draw(drawScope);
            }
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            throw th;
        }
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.p014ui.graphics.vector.VNode
    public InterfaceC9540l getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m31558getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int i10, VNode vNode) {
        if (i10 < getNumChildren()) {
            this.children.set(i10, vNode);
        } else {
            this.children.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    public final void move(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                VNode vNode = this.children.get(i10);
                this.children.remove(i10);
                this.children.add(i11, vNode);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                VNode vNode2 = this.children.get(i10);
                this.children.remove(i10);
                this.children.add(i11 - 1, vNode2);
                i13++;
            }
        }
        invalidate();
    }

    public final void remove(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.children.size()) {
                this.children.get(i10).setInvalidateListener$ui_release(null);
                this.children.remove(i10);
            }
        }
        invalidate();
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.p014ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(InterfaceC9540l interfaceC9540l) {
        this.invalidateListener = interfaceC9540l;
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f10) {
        this.pivotX = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f10) {
        this.pivotY = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f10) {
        this.rotation = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f10) {
        this.scaleX = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f10) {
        this.scaleY = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f10) {
        this.translationX = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f10) {
        this.translationY = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            VNode vNode = list.get(i10);
            sb2.append("\t");
            sb2.append(vNode.toString());
            sb2.append(SignParameters.NEW_LINE);
        }
        return sb2.toString();
    }
}
