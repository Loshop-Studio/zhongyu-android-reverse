package androidx.compose.p013ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawTransform;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010I\u001a\u00020\u00142\u0006\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020\u0001J\b\u0010L\u001a\u00020\u0014H\u0002J\u0012\u0010M\u001a\u00020\u00142\b\u0010N\u001a\u0004\u0018\u00010OH\u0002J\u001a\u0010P\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020;H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0001H\u0002J\u001e\u0010V\u001a\u00020\u00142\u0006\u0010W\u001a\u00020&2\u0006\u0010X\u001a\u00020&2\u0006\u0010Y\u001a\u00020&J\u0016\u0010Z\u001a\u00020\u00142\u0006\u0010J\u001a\u00020&2\u0006\u0010Y\u001a\u00020&J\b\u0010[\u001a\u00020\u001fH\u0016J\b\u0010\\\u001a\u00020\u0014H\u0002J\b\u0010]\u001a\u00020\u0014H\u0002J\f\u0010^\u001a\u00020\u0014*\u00020_H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00102\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R$\u00105\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R$\u00108\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R&\u0010<\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020;@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R$\u0010@\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R$\u0010C\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R\u0014\u0010F\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u001eR\u001a\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, m13558d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "()V", "children", "", "clipPath", "Landroidx/compose/ui/graphics/Path;", "value", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "groupMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "invalidateListener", "Lkotlin/Function1;", "", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function1;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "isClipPathDirty", "", "isMatrixDirty", "<set-?>", "isTintable", "()Z", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "numChildren", "", "getNumChildren", "()I", "", "pivotX", "getPivotX", "()F", "setPivotX", "(F)V", "pivotY", "getPivotY", "setPivotY", Key.ROTATION, "getRotation", "setRotation", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "Landroidx/compose/ui/graphics/Color;", "tintColor", "getTintColor-0d7_KjU", "()J", "J", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "willClipPath", "getWillClipPath", "wrappedListener", "insertAt", "index", "instance", "markNotTintable", "markTintForBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "markTintForColor", TypedValues.Custom.S_COLOR, "markTintForColor-8_81llA", "(J)V", "markTintForVNode", "node", "move", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "remove", "toString", "updateClipPath", "updateMatrix", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,642:1\n635#2:643\n640#2:644\n249#3,8:645\n257#3:654\n259#3,4:661\n1#4:653\n34#5,6:655\n34#5,6:665\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n409#1:643\n410#1:644\n608#1:645,8\n608#1:654\n608#1:661,4\n615#1:655,6\n621#1:665,6\n*E\n"})
/* loaded from: classes2.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private Function1<? super VNode, Unit> invalidateListener;
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
    private final Function1<VNode, Unit> wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VNode vNode) {
                invoke2(vNode);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VNode vNode) {
                this.this$0.markTintForVNode(vNode);
                Function1<VNode, Unit> invalidateListener$ui_release = this.this$0.getInvalidateListener$ui_release();
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
        this.tintColor = Color.INSTANCE.m21012getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m21655markTintForColor8_81llA(((SolidColor) brush).getValue());
            } else {
                markNotTintable();
            }
        }
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m21655markTintForColor8_81llA(long color) {
        if (this.isTintable && color != 16) {
            long j10 = this.tintColor;
            if (j10 == 16) {
                this.tintColor = color;
            } else {
                if (VectorKt.m21678rgbEqualOWjLjI(j10, color)) {
                    return;
                }
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode node) {
        if (node instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) node;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (node instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) node;
            if (groupComponent.isTintable && this.isTintable) {
                m21655markTintForColor8_81llA(groupComponent.tintColor);
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
        float[] fArrM21206constructorimpl$default = this.groupMatrix;
        if (fArrM21206constructorimpl$default == null) {
            fArrM21206constructorimpl$default = Matrix.m21206constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM21206constructorimpl$default;
        } else {
            Matrix.m21215resetimpl(fArrM21206constructorimpl$default);
        }
        float[] fArr = fArrM21206constructorimpl$default;
        Matrix.m21228translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m21220rotateZimpl(fArr, this.rotation);
        Matrix.m21221scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m21228translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.p013ui.graphics.vector.VNode
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
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo21456transform58bKbWc(Matrix.m21204boximpl(fArr).m21229unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.m21583clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).draw(drawScope);
            }
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            throw th;
        }
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.p013ui.graphics.vector.VNode
    public Function1<VNode, Unit> getInvalidateListener$ui_release() {
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

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int index, VNode instance) {
        if (index < getNumChildren()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        markTintForVNode(instance);
        instance.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    /* renamed from: isTintable, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    public final void move(int from, int to, int count) {
        int i10 = 0;
        if (from > to) {
            while (i10 < count) {
                VNode vNode = this.children.get(from);
                this.children.remove(from);
                this.children.add(to, vNode);
                to++;
                i10++;
            }
        } else {
            while (i10 < count) {
                VNode vNode2 = this.children.get(from);
                this.children.remove(from);
                this.children.add(to - 1, vNode2);
                i10++;
            }
        }
        invalidate();
    }

    public final void remove(int index, int count) {
        for (int i10 = 0; i10 < count; i10++) {
            if (index < this.children.size()) {
                this.children.get(index).setInvalidateListener$ui_release(null);
                this.children.remove(index);
            }
        }
        invalidate();
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.p013ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(Function1<? super VNode, Unit> function1) {
        this.invalidateListener = function1;
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
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            VNode vNode = list.get(i10);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }
}
