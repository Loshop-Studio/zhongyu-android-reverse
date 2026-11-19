package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.concurrent.Executor;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.AbstractC11106e0;
import sd.AbstractC11115g1;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class ImageCaptureExtKt {
    @VisibleForTesting
    public static final TakePictureRequest getTakePictureRequest(ImageCapture imageCapture) {
        AbstractC9979u.m20294g(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    public static final Object takePicture(ImageCapture imageCapture, final InterfaceC9529a interfaceC9529a, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, InterfaceC11588c<? super ImageProxy> interfaceC11588c) {
        Executor executorDirectExecutor;
        InterfaceC9945d.b bVar = interfaceC11588c.getContext().get(InterfaceC9944c.f23354a0);
        DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        AbstractC11106e0 abstractC11106e0 = bVar instanceof AbstractC11106e0 ? (AbstractC11106e0) bVar : null;
        if (abstractC11106e0 == null || (executorDirectExecutor = AbstractC11115g1.m24720a(abstractC11106e0)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            AbstractC9979u.m20293f(executorDirectExecutor, "directExecutor()");
        }
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i10) {
                InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
                if (interfaceC9540l3 != null) {
                    interfaceC9540l3.invoke(Integer.valueOf(i10));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                if (interfaceC9529a2 != null) {
                    interfaceC9529a2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                AbstractC9979u.m20294g(imageProxy, "imageProxy");
                Object obj = ref$ObjectRef.f23402c;
                if (obj == null) {
                    AbstractC9979u.m20312y("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
                c9997c.resumeWith(Result.m20054c(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                AbstractC9979u.m20294g(exception, "exception");
                Object obj = ref$ObjectRef.f23402c;
                if (obj == null) {
                    AbstractC9979u.m20312y("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
                InterfaceC11125j interfaceC11125j = c9997c;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                AbstractC9979u.m20294g(bitmap, "bitmap");
                InterfaceC9540l interfaceC9540l3 = interfaceC9540l2;
                if (interfaceC9540l3 != null) {
                    interfaceC9540l3.invoke(bitmap);
                }
            }
        });
        c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Throwable th) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Object obj = ref$ObjectRef.f23402c;
                if (obj == null) {
                    AbstractC9979u.m20312y("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
            }
        });
        Object obj = ref$ObjectRef.f23402c;
        if (obj == null) {
            AbstractC9979u.m20312y("delegatingCallback");
        } else {
            delegatingImageCapturedCallback = (DelegatingImageCapturedCallback) obj;
        }
        imageCapture.takePicture(executorDirectExecutor, delegatingImageCapturedCallback);
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l2 = null;
        }
        return takePicture(imageCapture, interfaceC9529a, interfaceC9540l, interfaceC9540l2, interfaceC11588c);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l2 = null;
        }
        return takePicture(imageCapture, outputFileOptions, interfaceC9529a, interfaceC9540l, interfaceC9540l2, interfaceC11588c);
    }

    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, final InterfaceC9529a interfaceC9529a, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, InterfaceC11588c<? super ImageCapture.OutputFileResults> interfaceC11588c) {
        Executor executorDirectExecutor;
        InterfaceC9945d.b bVar = interfaceC11588c.getContext().get(InterfaceC9944c.f23354a0);
        DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        AbstractC11106e0 abstractC11106e0 = bVar instanceof AbstractC11106e0 ? (AbstractC11106e0) bVar : null;
        if (abstractC11106e0 == null || (executorDirectExecutor = AbstractC11115g1.m24720a(abstractC11106e0)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            AbstractC9979u.m20293f(executorDirectExecutor, "directExecutor()");
        }
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i10) {
                InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
                if (interfaceC9540l3 != null) {
                    interfaceC9540l3.invoke(Integer.valueOf(i10));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                if (interfaceC9529a2 != null) {
                    interfaceC9529a2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                AbstractC9979u.m20294g(exception, "exception");
                Object obj = ref$ObjectRef.f23402c;
                if (obj == null) {
                    AbstractC9979u.m20312y("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
                InterfaceC11125j interfaceC11125j = c9997c;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                AbstractC9979u.m20294g(outputFileResults, "outputFileResults");
                Object obj = ref$ObjectRef.f23402c;
                if (obj == null) {
                    AbstractC9979u.m20312y("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
                c9997c.resumeWith(Result.m20054c(outputFileResults));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                AbstractC9979u.m20294g(bitmap, "bitmap");
                InterfaceC9540l interfaceC9540l3 = interfaceC9540l2;
                if (interfaceC9540l3 != null) {
                    interfaceC9540l3.invoke(bitmap);
                }
            }
        });
        c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Throwable th) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Object obj = ref$ObjectRef.f23402c;
                if (obj == null) {
                    AbstractC9979u.m20312y("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
            }
        });
        Object obj = ref$ObjectRef.f23402c;
        if (obj == null) {
            AbstractC9979u.m20312y("delegatingCallback");
        } else {
            delegatingImageSavedCallback = (DelegatingImageSavedCallback) obj;
        }
        imageCapture.takePicture(outputFileOptions, executorDirectExecutor, delegatingImageSavedCallback);
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }
}
