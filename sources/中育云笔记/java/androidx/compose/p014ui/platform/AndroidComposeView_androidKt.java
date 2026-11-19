package androidx.compose.p014ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p014ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p014ui.text.input.PlatformTextInputService;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static InterfaceC9540l platformTextInputServiceInterceptor = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // p181hd.InterfaceC9540l
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (AbstractC9979u.m20289b(view2, view)) {
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
    private static final float m32634dotp89u6pk(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final InterfaceC9540l getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m32635preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM32634dotp89u6pk = m32634dotp89u6pk(fArr2, 0, fArr, 0);
        float fM32634dotp89u6pk2 = m32634dotp89u6pk(fArr2, 0, fArr, 1);
        float fM32634dotp89u6pk3 = m32634dotp89u6pk(fArr2, 0, fArr, 2);
        float fM32634dotp89u6pk4 = m32634dotp89u6pk(fArr2, 0, fArr, 3);
        float fM32634dotp89u6pk5 = m32634dotp89u6pk(fArr2, 1, fArr, 0);
        float fM32634dotp89u6pk6 = m32634dotp89u6pk(fArr2, 1, fArr, 1);
        float fM32634dotp89u6pk7 = m32634dotp89u6pk(fArr2, 1, fArr, 2);
        float fM32634dotp89u6pk8 = m32634dotp89u6pk(fArr2, 1, fArr, 3);
        float fM32634dotp89u6pk9 = m32634dotp89u6pk(fArr2, 2, fArr, 0);
        float fM32634dotp89u6pk10 = m32634dotp89u6pk(fArr2, 2, fArr, 1);
        float fM32634dotp89u6pk11 = m32634dotp89u6pk(fArr2, 2, fArr, 2);
        float fM32634dotp89u6pk12 = m32634dotp89u6pk(fArr2, 2, fArr, 3);
        float fM32634dotp89u6pk13 = m32634dotp89u6pk(fArr2, 3, fArr, 0);
        float fM32634dotp89u6pk14 = m32634dotp89u6pk(fArr2, 3, fArr, 1);
        float fM32634dotp89u6pk15 = m32634dotp89u6pk(fArr2, 3, fArr, 2);
        float fM32634dotp89u6pk16 = m32634dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM32634dotp89u6pk;
        fArr[1] = fM32634dotp89u6pk2;
        fArr[2] = fM32634dotp89u6pk3;
        fArr[3] = fM32634dotp89u6pk4;
        fArr[4] = fM32634dotp89u6pk5;
        fArr[5] = fM32634dotp89u6pk6;
        fArr[6] = fM32634dotp89u6pk7;
        fArr[7] = fM32634dotp89u6pk8;
        fArr[8] = fM32634dotp89u6pk9;
        fArr[9] = fM32634dotp89u6pk10;
        fArr[10] = fM32634dotp89u6pk11;
        fArr[11] = fM32634dotp89u6pk12;
        fArr[12] = fM32634dotp89u6pk13;
        fArr[13] = fM32634dotp89u6pk14;
        fArr[14] = fM32634dotp89u6pk15;
        fArr[15] = fM32634dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m32636preTranslatecG2Xzmc(float[] fArr, float f10, float f11, float[] fArr2) {
        Matrix.m31117resetimpl(fArr2);
        Matrix.m31130translateimpl$default(fArr2, f10, f11, 0.0f, 4, null);
        m32635preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(InterfaceC9540l interfaceC9540l) {
        platformTextInputServiceInterceptor = interfaceC9540l;
    }
}
