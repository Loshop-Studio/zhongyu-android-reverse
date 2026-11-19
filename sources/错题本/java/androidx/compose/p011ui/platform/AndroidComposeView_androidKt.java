package androidx.compose.p011ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p011ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p011ui.text.input.PlatformTextInputService;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a2\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\".\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m5110d2 = {"Landroidx/compose/ui/graphics/Matrix;", "other", "Ld6/s;", "preTransform-JiSxe2E", "([F[F)V", "preTransform", "", "x", "y", "tmpMatrix", "preTranslate-cG2Xzmc", "([FFF[F)V", "preTranslate", "m1", "", "row", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "dot", "Landroid/view/View;", "", "containsDescendant", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSessionCompat", "(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputServiceInterceptor", "Lr6/c;", "getPlatformTextInputServiceInterceptor", "()Lr6/c;", "setPlatformTextInputServiceInterceptor", "(Lr6/c;)V", "", "ONE_FRAME_120_HERTZ_IN_MILLISECONDS", "J", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,3125:1\n52#2,2:3126\n52#2,2:3128\n52#2,2:3130\n52#2,2:3132\n52#2,2:3134\n52#2,2:3136\n52#2,2:3138\n52#2,2:3140\n52#2,2:3142\n52#2,2:3144\n52#2,2:3146\n52#2,2:3148\n52#2,2:3150\n52#2,2:3152\n52#2,2:3154\n52#2,2:3156\n49#2:3158\n49#2:3159\n49#2:3160\n49#2:3161\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2949#1:3126,2\n2950#1:3128,2\n2951#1:3130,2\n2952#1:3132,2\n2953#1:3134,2\n2954#1:3136,2\n2955#1:3138,2\n2956#1:3140,2\n2957#1:3142,2\n2958#1:3144,2\n2959#1:3146,2\n2960#1:3148,2\n2961#1:3150,2\n2962#1:3152,2\n2963#1:3154,2\n2964#1:3156,2\n2976#1:3158\n2977#1:3159\n2978#1:3160\n2979#1:3161\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;

    @NotNull
    private static InterfaceC6471c platformTextInputServiceInterceptor = new InterfaceC6471c() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // p152r6.InterfaceC6471c
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (AbstractC5830k.m5325b(view2, view)) {
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
    private static final float m12438dotp89u6pk(float[] fArr, int i, float[] fArr2, int i8) {
        int i9 = i * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    @NotNull
    public static final InterfaceC6471c getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m12439preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM12438dotp89u6pk = m12438dotp89u6pk(fArr2, 0, fArr, 0);
        float fM12438dotp89u6pk2 = m12438dotp89u6pk(fArr2, 0, fArr, 1);
        float fM12438dotp89u6pk3 = m12438dotp89u6pk(fArr2, 0, fArr, 2);
        float fM12438dotp89u6pk4 = m12438dotp89u6pk(fArr2, 0, fArr, 3);
        float fM12438dotp89u6pk5 = m12438dotp89u6pk(fArr2, 1, fArr, 0);
        float fM12438dotp89u6pk6 = m12438dotp89u6pk(fArr2, 1, fArr, 1);
        float fM12438dotp89u6pk7 = m12438dotp89u6pk(fArr2, 1, fArr, 2);
        float fM12438dotp89u6pk8 = m12438dotp89u6pk(fArr2, 1, fArr, 3);
        float fM12438dotp89u6pk9 = m12438dotp89u6pk(fArr2, 2, fArr, 0);
        float fM12438dotp89u6pk10 = m12438dotp89u6pk(fArr2, 2, fArr, 1);
        float fM12438dotp89u6pk11 = m12438dotp89u6pk(fArr2, 2, fArr, 2);
        float fM12438dotp89u6pk12 = m12438dotp89u6pk(fArr2, 2, fArr, 3);
        float fM12438dotp89u6pk13 = m12438dotp89u6pk(fArr2, 3, fArr, 0);
        float fM12438dotp89u6pk14 = m12438dotp89u6pk(fArr2, 3, fArr, 1);
        float fM12438dotp89u6pk15 = m12438dotp89u6pk(fArr2, 3, fArr, 2);
        float fM12438dotp89u6pk16 = m12438dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM12438dotp89u6pk;
        fArr[1] = fM12438dotp89u6pk2;
        fArr[2] = fM12438dotp89u6pk3;
        fArr[3] = fM12438dotp89u6pk4;
        fArr[4] = fM12438dotp89u6pk5;
        fArr[5] = fM12438dotp89u6pk6;
        fArr[6] = fM12438dotp89u6pk7;
        fArr[7] = fM12438dotp89u6pk8;
        fArr[8] = fM12438dotp89u6pk9;
        fArr[9] = fM12438dotp89u6pk10;
        fArr[10] = fM12438dotp89u6pk11;
        fArr[11] = fM12438dotp89u6pk12;
        fArr[12] = fM12438dotp89u6pk13;
        fArr[13] = fM12438dotp89u6pk14;
        fArr[14] = fM12438dotp89u6pk15;
        fArr[15] = fM12438dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m12440preTranslatecG2Xzmc(float[] fArr, float f, float f7, float[] fArr2) {
        Matrix.m10921resetimpl(fArr2);
        Matrix.m10934translateimpl$default(fArr2, f, f7, 0.0f, 4, null);
        m12439preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(@NotNull InterfaceC6471c interfaceC6471c) {
        platformTextInputServiceInterceptor = interfaceC6471c;
    }
}
