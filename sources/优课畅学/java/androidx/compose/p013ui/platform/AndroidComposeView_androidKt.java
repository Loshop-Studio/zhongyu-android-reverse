package androidx.compose.p013ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p013ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p013ui.text.input.PlatformTextInputService;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static InterfaceC10570l platformTextInputServiceInterceptor = new InterfaceC10570l() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // p300x7.InterfaceC10570l
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (AbstractC9133u.m16128b(view2, view)) {
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
    private static final float m26032dotp89u6pk(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final InterfaceC10570l getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m26033preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM26032dotp89u6pk = m26032dotp89u6pk(fArr2, 0, fArr, 0);
        float fM26032dotp89u6pk2 = m26032dotp89u6pk(fArr2, 0, fArr, 1);
        float fM26032dotp89u6pk3 = m26032dotp89u6pk(fArr2, 0, fArr, 2);
        float fM26032dotp89u6pk4 = m26032dotp89u6pk(fArr2, 0, fArr, 3);
        float fM26032dotp89u6pk5 = m26032dotp89u6pk(fArr2, 1, fArr, 0);
        float fM26032dotp89u6pk6 = m26032dotp89u6pk(fArr2, 1, fArr, 1);
        float fM26032dotp89u6pk7 = m26032dotp89u6pk(fArr2, 1, fArr, 2);
        float fM26032dotp89u6pk8 = m26032dotp89u6pk(fArr2, 1, fArr, 3);
        float fM26032dotp89u6pk9 = m26032dotp89u6pk(fArr2, 2, fArr, 0);
        float fM26032dotp89u6pk10 = m26032dotp89u6pk(fArr2, 2, fArr, 1);
        float fM26032dotp89u6pk11 = m26032dotp89u6pk(fArr2, 2, fArr, 2);
        float fM26032dotp89u6pk12 = m26032dotp89u6pk(fArr2, 2, fArr, 3);
        float fM26032dotp89u6pk13 = m26032dotp89u6pk(fArr2, 3, fArr, 0);
        float fM26032dotp89u6pk14 = m26032dotp89u6pk(fArr2, 3, fArr, 1);
        float fM26032dotp89u6pk15 = m26032dotp89u6pk(fArr2, 3, fArr, 2);
        float fM26032dotp89u6pk16 = m26032dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM26032dotp89u6pk;
        fArr[1] = fM26032dotp89u6pk2;
        fArr[2] = fM26032dotp89u6pk3;
        fArr[3] = fM26032dotp89u6pk4;
        fArr[4] = fM26032dotp89u6pk5;
        fArr[5] = fM26032dotp89u6pk6;
        fArr[6] = fM26032dotp89u6pk7;
        fArr[7] = fM26032dotp89u6pk8;
        fArr[8] = fM26032dotp89u6pk9;
        fArr[9] = fM26032dotp89u6pk10;
        fArr[10] = fM26032dotp89u6pk11;
        fArr[11] = fM26032dotp89u6pk12;
        fArr[12] = fM26032dotp89u6pk13;
        fArr[13] = fM26032dotp89u6pk14;
        fArr[14] = fM26032dotp89u6pk15;
        fArr[15] = fM26032dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m26034preTranslatecG2Xzmc(float[] fArr, float f10, float f11, float[] fArr2) {
        Matrix.m24515resetimpl(fArr2);
        Matrix.m24528translateimpl$default(fArr2, f10, f11, 0.0f, 4, null);
        m26033preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(InterfaceC10570l interfaceC10570l) {
        platformTextInputServiceInterceptor = interfaceC10570l;
    }
}
