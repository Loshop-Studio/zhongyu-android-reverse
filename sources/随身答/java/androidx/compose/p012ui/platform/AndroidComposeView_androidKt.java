package androidx.compose.p012ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p012ui.graphics.Matrix;
import androidx.compose.p012ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p012ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p012ui.text.input.PlatformTextInputService;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u0015H\u0002\u001a\u001e\u0010\u0019\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010\u001d\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m13413d2 = {"ONE_FRAME_120_HERTZ_IN_MILLISECONDS", "", "platformTextInputServiceInterceptor", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "getPlatformTextInputServiceInterceptor", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "containsDescendant", "", "Landroid/view/View;", "other", "getContentCaptureSessionCompat", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "preTransform", "", "preTransform-JiSxe2E", "([F[F)V", "preTranslate", "x", "y", "tmpMatrix", "preTranslate-cG2Xzmc", "([FFF[F)V", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,3125:1\n52#2,2:3126\n52#2,2:3128\n52#2,2:3130\n52#2,2:3132\n52#2,2:3134\n52#2,2:3136\n52#2,2:3138\n52#2,2:3140\n52#2,2:3142\n52#2,2:3144\n52#2,2:3146\n52#2,2:3148\n52#2,2:3150\n52#2,2:3152\n52#2,2:3154\n52#2,2:3156\n49#2:3158\n49#2:3159\n49#2:3160\n49#2:3161\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2949#1:3126,2\n2950#1:3128,2\n2951#1:3130,2\n2952#1:3132,2\n2953#1:3134,2\n2954#1:3136,2\n2955#1:3138,2\n2956#1:3140,2\n2957#1:3142,2\n2958#1:3144,2\n2959#1:3146,2\n2960#1:3148,2\n2961#1:3150,2\n2962#1:3152,2\n2963#1:3154,2\n2964#1:3156,2\n2976#1:3158\n2977#1:3159\n2978#1:3160\n2979#1:3161\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = new Function1<PlatformTextInputService, PlatformTextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // kotlin.jvm.functions.Function1
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m23139dotp89u6pk(float[] fArr, int i9, float[] fArr2, int i10) {
        int i11 = i9 * 4;
        return (fArr[i11] * fArr2[i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 3] * fArr2[12 + i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final Function1<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m23140preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM23139dotp89u6pk = m23139dotp89u6pk(fArr2, 0, fArr, 0);
        float fM23139dotp89u6pk2 = m23139dotp89u6pk(fArr2, 0, fArr, 1);
        float fM23139dotp89u6pk3 = m23139dotp89u6pk(fArr2, 0, fArr, 2);
        float fM23139dotp89u6pk4 = m23139dotp89u6pk(fArr2, 0, fArr, 3);
        float fM23139dotp89u6pk5 = m23139dotp89u6pk(fArr2, 1, fArr, 0);
        float fM23139dotp89u6pk6 = m23139dotp89u6pk(fArr2, 1, fArr, 1);
        float fM23139dotp89u6pk7 = m23139dotp89u6pk(fArr2, 1, fArr, 2);
        float fM23139dotp89u6pk8 = m23139dotp89u6pk(fArr2, 1, fArr, 3);
        float fM23139dotp89u6pk9 = m23139dotp89u6pk(fArr2, 2, fArr, 0);
        float fM23139dotp89u6pk10 = m23139dotp89u6pk(fArr2, 2, fArr, 1);
        float fM23139dotp89u6pk11 = m23139dotp89u6pk(fArr2, 2, fArr, 2);
        float fM23139dotp89u6pk12 = m23139dotp89u6pk(fArr2, 2, fArr, 3);
        float fM23139dotp89u6pk13 = m23139dotp89u6pk(fArr2, 3, fArr, 0);
        float fM23139dotp89u6pk14 = m23139dotp89u6pk(fArr2, 3, fArr, 1);
        float fM23139dotp89u6pk15 = m23139dotp89u6pk(fArr2, 3, fArr, 2);
        float fM23139dotp89u6pk16 = m23139dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM23139dotp89u6pk;
        fArr[1] = fM23139dotp89u6pk2;
        fArr[2] = fM23139dotp89u6pk3;
        fArr[3] = fM23139dotp89u6pk4;
        fArr[4] = fM23139dotp89u6pk5;
        fArr[5] = fM23139dotp89u6pk6;
        fArr[6] = fM23139dotp89u6pk7;
        fArr[7] = fM23139dotp89u6pk8;
        fArr[8] = fM23139dotp89u6pk9;
        fArr[9] = fM23139dotp89u6pk10;
        fArr[10] = fM23139dotp89u6pk11;
        fArr[11] = fM23139dotp89u6pk12;
        fArr[12] = fM23139dotp89u6pk13;
        fArr[13] = fM23139dotp89u6pk14;
        fArr[14] = fM23139dotp89u6pk15;
        fArr[15] = fM23139dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m23141preTranslatecG2Xzmc(float[] fArr, float f10, float f11, float[] fArr2) {
        Matrix.m21648resetimpl(fArr2);
        Matrix.m21661translateimpl$default(fArr2, f10, f11, 0.0f, 4, null);
        m23140preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> function1) {
        platformTextInputServiceInterceptor = function1;
    }
}
