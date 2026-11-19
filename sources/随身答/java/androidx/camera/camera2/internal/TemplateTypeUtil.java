package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.camera.core.ExperimentalZeroShutterLag;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* loaded from: classes.dex */
public class TemplateTypeUtil {

    /* renamed from: androidx.camera.camera2.internal.TemplateTypeUtil$1 */
    public static /* synthetic */ class C03011 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        static final /* synthetic */ int[] f201x65b8d150;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f201x65b8d150 = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f201x65b8d150[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f201x65b8d150[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f201x65b8d150[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f201x65b8d150[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private TemplateTypeUtil() {
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    public static int getCaptureConfigTemplateType(@NonNull UseCaseConfigFactory.CaptureType captureType, int i9) {
        int i10 = C03011.f201x65b8d150[captureType.ordinal()];
        return i10 != 1 ? i10 != 2 ? 1 : 3 : i9 == 2 ? 5 : 2;
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    public static int getSessionConfigTemplateType(@NonNull UseCaseConfigFactory.CaptureType captureType, int i9) {
        int i10 = C03011.f201x65b8d150[captureType.ordinal()];
        return i10 != 1 ? i10 != 2 ? 1 : 3 : i9 == 2 ? 5 : 1;
    }
}
