package androidx.compose.p011ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.autofill.HintConstants;
import androidx.camera.core.ImageCapture;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000 @2\u00020\u0001:\u0001@B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0017J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001f\u0010 J=\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0007¢\u0006\u0004\b+\u0010\u0015J\u0019\u0010+\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0013H'¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010-R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u00103R\u0011\u0010<\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b;\u00103R\u0014\u0010=\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010>\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006A"}, m5110d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "", HintConstants.AUTOFILL_HINT_NAME, "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/e;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/e;)V", "component", "", "getMinValue", "(I)F", "getMaxValue", "r", "g", "b", "", "toXyz", "(FFF)[F", "v", "([F)[F", "v0", "v1", "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getName", "J", "getModel-xdoWZVw", "()J", "I", "getId$ui_graphics_release", "getComponentCount", "componentCount", "isWideGamut", "()Z", "isSrgb", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,717:1\n53#2,3:718\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n246#1:718,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class ColorSpace {
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;

    @NotNull
    private final String name;

    public /* synthetic */ ColorSpace(String str, long j7, int i, AbstractC5824e abstractC5824e) {
        this(str, j7, i);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) other;
        if (this.id == colorSpace.id && AbstractC5830k.m5325b(this.name, colorSpace.name)) {
            return ColorModel.m11089equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    @Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public final float[] fromXyz(float x3, float y2, float z8) {
        float[] fArr = new float[ColorModel.m11090getComponentCountimpl(this.model)];
        fArr[0] = x3;
        fArr[1] = y2;
        fArr[2] = z8;
        return fromXyz(fArr);
    }

    @Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public abstract float[] fromXyz(@Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) @NotNull float[] v2);

    @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID, m247to = 4)
    public final int getComponentCount() {
        return ColorModel.m11090getComponentCountimpl(this.model);
    }

    /* renamed from: getId$ui_graphics_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float getMaxValue(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) int component);

    public abstract float getMinValue(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) int component);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name and from getter */
    public final long getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((ColorModel.m11091hashCodeimpl(this.model) + (this.name.hashCode() * 31)) * 31) + this.id;
    }

    /* renamed from: isSrgb */
    public boolean getIsSrgb() {
        return false;
    }

    /* renamed from: isWideGamut */
    public abstract boolean getIsWideGamut();

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m11092toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics_release(float v02, float v12, float v2) {
        float[] xyz = toXyz(v02, v12, v2);
        float f = xyz[0];
        float f7 = xyz[1];
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    @Size(ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public final float[] toXyz(float r, float g6, float b6) {
        return toXyz(new float[]{r, g6, b6});
    }

    @Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS)
    @NotNull
    public abstract float[] toXyz(@Size(min = ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) @NotNull float[] v2);

    public float toZ$ui_graphics_release(float v02, float v12, float v2) {
        return toXyz(v02, v12, v2)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo11099xyzaToColorJlNiLsg$ui_graphics_release(float x3, float y2, float z8, float a9, @NotNull ColorSpace colorSpace) {
        float[] fArrFromXyz = fromXyz(x3, y2, z8);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], a9, colorSpace);
    }

    public /* synthetic */ ColorSpace(String str, long j7, AbstractC5824e abstractC5824e) {
        this(str, j7);
    }

    private ColorSpace(String str, long j7, int i) {
        this.name = str;
        this.model = j7;
        this.id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ColorSpace(String str, long j7) {
        this(str, j7, -1, null);
    }
}
