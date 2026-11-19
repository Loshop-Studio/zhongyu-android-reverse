package androidx.compose.p011ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawTransform;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0007*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0003R\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R*\u00101\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u001b8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R6\u00108\u001a\b\u0012\u0004\u0012\u000206052\f\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010/R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R0\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010A8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010CR*\u0010I\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0016\"\u0004\bL\u0010MR*\u0010O\u001a\u00020N2\u0006\u00107\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010U\u001a\u00020N2\u0006\u00107\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010P\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR*\u0010X\u001a\u00020N2\u0006\u00107\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010P\u001a\u0004\bY\u0010R\"\u0004\bZ\u0010TR*\u0010[\u001a\u00020N2\u0006\u00107\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010P\u001a\u0004\b\\\u0010R\"\u0004\b]\u0010TR*\u0010^\u001a\u00020N2\u0006\u00107\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010P\u001a\u0004\b_\u0010R\"\u0004\b`\u0010TR*\u0010a\u001a\u00020N2\u0006\u00107\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010P\u001a\u0004\bb\u0010R\"\u0004\bc\u0010TR*\u0010d\u001a\u00020N2\u0006\u00107\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010P\u001a\u0004\be\u0010R\"\u0004\bf\u0010TR\u0016\u0010g\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010/R\u0011\u0010j\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, m5110d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", "index", "instance", "Ld6/s;", "insertAt", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move", "(III)V", "remove", "(II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Brush;", "brush", "markTintForBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "markTintForColor-8_81llA", "(J)V", "markTintForColor", "node", "markTintForVNode", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "markNotTintable", "updateClipPath", "updateMatrix", "Landroidx/compose/ui/graphics/Matrix;", "groupMatrix", "[F", "", "children", "Ljava/util/List;", "", "<set-?>", "isTintable", "Z", "()Z", "tintColor", "J", "getTintColor-0d7_KjU", "()J", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "value", "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "isClipPathDirty", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/Function1;", "invalidateListener", "Lr6/c;", "getInvalidateListener$ui_release", "()Lr6/c;", "setInvalidateListener$ui_release", "(Lr6/c;)V", "wrappedListener", HintConstants.AUTOFILL_HINT_NAME, "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "", Key.ROTATION, "F", "getRotation", "()F", "setRotation", "(F)V", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "isMatrixDirty", "getNumChildren", "()I", "numChildren", "getWillClipPath", "willClipPath", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,642:1\n635#2:643\n640#2:644\n249#3,8:645\n257#3:654\n259#3,4:661\n1#4:653\n34#5,6:655\n34#5,6:665\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n409#1:643\n410#1:644\n608#1:645,8\n608#1:654\n608#1:661,4\n615#1:655,6\n621#1:665,6\n*E\n"})
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;

    @NotNull
    private final List<VNode> children;

    @Nullable
    private Path clipPath;

    @NotNull
    private List<? extends PathNode> clipPathData;

    @Nullable
    private float[] groupMatrix;

    @Nullable
    private InterfaceC6471c invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;

    @NotNull
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;

    @NotNull
    private final InterfaceC6471c wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VNode) obj);
                return C5443s.f8405a;
            }

            public final void invoke(VNode vNode) {
                this.this$0.markTintForVNode(vNode);
                InterfaceC6471c invalidateListener = this.this$0.getInvalidateListener();
                if (invalidateListener != null) {
                    invalidateListener.invoke(vNode);
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
        this.tintColor = Color.INSTANCE.m10718getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m11361markTintForColor8_81llA(((SolidColor) brush).getValue());
            } else {
                markNotTintable();
            }
        }
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m11361markTintForColor8_81llA(long color) {
        if (this.isTintable && color != 16) {
            long j7 = this.tintColor;
            if (j7 == 16) {
                this.tintColor = color;
            } else {
                if (VectorKt.m11385rgbEqualOWjLjI(j7, color)) {
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
                m11361markTintForColor8_81llA(groupComponent.tintColor);
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
        float[] fArrM10912constructorimpl$default = this.groupMatrix;
        if (fArrM10912constructorimpl$default == null) {
            fArrM10912constructorimpl$default = Matrix.m10912constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM10912constructorimpl$default;
        } else {
            Matrix.m10921resetimpl(fArrM10912constructorimpl$default);
        }
        float[] fArr = fArrM10912constructorimpl$default;
        Matrix.m10934translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m10926rotateZimpl(fArr, this.rotation);
        Matrix.m10927scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m10934translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.p011ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo11162transform58bKbWc(Matrix.m10910boximpl(fArr).m10935unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.m11289clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).draw(drawScope);
            }
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        } catch (Throwable th) {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
            throw th;
        }
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.p011ui.graphics.vector.VNode
    @Nullable
    /* renamed from: getInvalidateListener$ui_release, reason: from getter */
    public InterfaceC6471c getInvalidateListener() {
        return this.invalidateListener;
    }

    @NotNull
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

    public final void insertAt(int index, @NotNull VNode instance) {
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
        int i = 0;
        if (from > to) {
            while (i < count) {
                VNode vNode = this.children.get(from);
                this.children.remove(from);
                this.children.add(to, vNode);
                to++;
                i++;
            }
        } else {
            while (i < count) {
                VNode vNode2 = this.children.get(from);
                this.children.remove(from);
                this.children.add(to - 1, vNode2);
                i++;
            }
        }
        invalidate();
    }

    public final void remove(int index, int count) {
        for (int i = 0; i < count; i++) {
            if (index < this.children.size()) {
                this.children.get(index).setInvalidateListener$ui_release(null);
                this.children.remove(index);
            }
        }
        invalidate();
    }

    public final void setClipPathData(@NotNull List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.p011ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.invalidateListener = interfaceC6471c;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = list.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }
}
