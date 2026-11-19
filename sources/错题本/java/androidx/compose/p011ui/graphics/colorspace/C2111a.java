package androidx.compose.p011ui.graphics.colorspace;

import android.text.Editable;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextInclusionStrategy;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.internal.InterfaceC3854k;
import com.google.gson.internal.LinkedTreeMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: androidx.compose.ui.graphics.colorspace.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C2111a implements DoubleFunction, TextInclusionStrategy, VisualTransformation, Interpolator, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, InterfaceC3854k {

    /* renamed from: a */
    public final /* synthetic */ int f821a;

    public /* synthetic */ C2111a(int i) {
        this.f821a = i;
    }

    @Override // com.google.gson.internal.InterfaceC3854k
    /* renamed from: a */
    public Object mo671a() {
        switch (this.f821a) {
            case 20:
                return new LinkedTreeMap();
            case 21:
                return new LinkedHashMap();
            case 22:
                return new TreeMap();
            case 23:
                return new ConcurrentHashMap();
            case 24:
                return new ConcurrentSkipListMap();
            case 25:
                return new ArrayList();
            case 26:
                return new LinkedHashSet();
            case 27:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return VisualTransformation.Companion.None$lambda$0(annotatedString);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        switch (this.f821a) {
            case 11:
                return Transition.lambda$getInterpolator$1(f);
            case 12:
                return Transition.lambda$getInterpolator$2(f);
            case 13:
                return Transition.lambda$getInterpolator$3(f);
            case 14:
                return Transition.lambda$getInterpolator$4(f);
            case 15:
                return Transition.lambda$getInterpolator$5(f);
            case 16:
                return Transition.lambda$getInterpolator$6(f);
            default:
                return Transition.lambda$getInterpolator$7(f);
        }
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
    public double invoke(double d9) {
        switch (this.f821a) {
            case 0:
                return ColorSpaces.ExtendedSrgb$lambda$0(d9);
            case 1:
                return ColorSpaces.ExtendedSrgb$lambda$1(d9);
            case 2:
                return ColorSpaces.Bt2020Hlg$lambda$2(d9);
            case 3:
                return ColorSpaces.Bt2020Hlg$lambda$3(d9);
            case 4:
                return ColorSpaces.Bt2020Pq$lambda$4(d9);
            case 5:
                return ColorSpaces.Bt2020Pq$lambda$5(d9);
            default:
                return Rgb.DoubleIdentity$lambda$8(d9);
        }
    }

    @Override // androidx.compose.p011ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        switch (this.f821a) {
            case 7:
                return rect.overlaps(rect2);
            case 8:
                return TextInclusionStrategy.Companion.ContainsAll$lambda$1(rect, rect2);
            default:
                return TextInclusionStrategy.Companion.ContainsCenter$lambda$2(rect, rect2);
        }
    }
}
