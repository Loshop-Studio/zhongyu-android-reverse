package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.concurrent.Executor;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8873s0;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ImageCaptureExtKt {
    @VisibleForTesting
    public static final TakePictureRequest getTakePictureRequest(ImageCapture imageCapture) {
        AbstractC9133u.m16133g(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    public static final Object takePicture(ImageCapture imageCapture, final InterfaceC10559a interfaceC10559a, final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2, InterfaceC9324c<? super ImageProxy> interfaceC9324c) {
        Executor executorDirectExecutor;
        InterfaceC9100d.b bVar = interfaceC9324c.getContext().get(InterfaceC9099c.f17441b0);
        DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        CoroutineDispatcher coroutineDispatcher = bVar instanceof CoroutineDispatcher ? (CoroutineDispatcher) bVar : null;
        if (coroutineDispatcher == null || (executorDirectExecutor = AbstractC8873s0.m14907a(coroutineDispatcher)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            AbstractC9133u.m16132f(executorDirectExecutor, "directExecutor()");
        }
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i10) {
                InterfaceC10570l interfaceC10570l3 = interfaceC10570l;
                if (interfaceC10570l3 != null) {
                    interfaceC10570l3.invoke(Integer.valueOf(i10));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                if (interfaceC10559a2 != null) {
                    interfaceC10559a2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                AbstractC9133u.m16133g(imageProxy, "imageProxy");
                Object obj = ref$ObjectRef.f17473a;
                if (obj == null) {
                    AbstractC9133u.m16151y("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
                c9155c.resumeWith(Result.m15909b(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                AbstractC9133u.m16133g(exception, "exception");
                Object obj = ref$ObjectRef.f17473a;
                if (obj == null) {
                    AbstractC9133u.m16151y("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
                InterfaceC8845j interfaceC8845j = c9155c;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                AbstractC9133u.m16133g(bitmap, "bitmap");
                InterfaceC10570l interfaceC10570l3 = interfaceC10570l2;
                if (interfaceC10570l3 != null) {
                    interfaceC10570l3.invoke(bitmap);
                }
            }
        });
        c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Object obj = ref$ObjectRef.f17473a;
                if (obj == null) {
                    AbstractC9133u.m16151y("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = (DelegatingImageCapturedCallback) obj;
                }
                delegatingImageCapturedCallback2.dispose();
            }
        });
        Object obj = ref$ObjectRef.f17473a;
        if (obj == null) {
            AbstractC9133u.m16151y("delegatingCallback");
        } else {
            delegatingImageCapturedCallback = (DelegatingImageCapturedCallback) obj;
        }
        imageCapture.takePicture(executorDirectExecutor, delegatingImageCapturedCallback);
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l2 = null;
        }
        return takePicture(imageCapture, interfaceC10559a, interfaceC10570l, interfaceC10570l2, interfaceC9324c);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10559a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC10570l2 = null;
        }
        return takePicture(imageCapture, outputFileOptions, interfaceC10559a, interfaceC10570l, interfaceC10570l2, interfaceC9324c);
    }

    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, final InterfaceC10559a interfaceC10559a, final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2, InterfaceC9324c<? super ImageCapture.OutputFileResults> interfaceC9324c) {
        Executor executorDirectExecutor;
        InterfaceC9100d.b bVar = interfaceC9324c.getContext().get(InterfaceC9099c.f17441b0);
        DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        CoroutineDispatcher coroutineDispatcher = bVar instanceof CoroutineDispatcher ? (CoroutineDispatcher) bVar : null;
        if (coroutineDispatcher == null || (executorDirectExecutor = AbstractC8873s0.m14907a(coroutineDispatcher)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            AbstractC9133u.m16132f(executorDirectExecutor, "directExecutor()");
        }
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i10) {
                InterfaceC10570l interfaceC10570l3 = interfaceC10570l;
                if (interfaceC10570l3 != null) {
                    interfaceC10570l3.invoke(Integer.valueOf(i10));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                if (interfaceC10559a2 != null) {
                    interfaceC10559a2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                AbstractC9133u.m16133g(exception, "exception");
                Object obj = ref$ObjectRef.f17473a;
                if (obj == null) {
                    AbstractC9133u.m16151y("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
                InterfaceC8845j interfaceC8845j = c9155c;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                AbstractC9133u.m16133g(outputFileResults, "outputFileResults");
                Object obj = ref$ObjectRef.f17473a;
                if (obj == null) {
                    AbstractC9133u.m16151y("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
                c9155c.resumeWith(Result.m15909b(outputFileResults));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                AbstractC9133u.m16133g(bitmap, "bitmap");
                InterfaceC10570l interfaceC10570l3 = interfaceC10570l2;
                if (interfaceC10570l3 != null) {
                    interfaceC10570l3.invoke(bitmap);
                }
            }
        });
        c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Object obj = ref$ObjectRef.f17473a;
                if (obj == null) {
                    AbstractC9133u.m16151y("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = (DelegatingImageSavedCallback) obj;
                }
                delegatingImageSavedCallback2.dispose();
            }
        });
        Object obj = ref$ObjectRef.f17473a;
        if (obj == null) {
            AbstractC9133u.m16151y("delegatingCallback");
        } else {
            delegatingImageSavedCallback = (DelegatingImageSavedCallback) obj;
        }
        imageCapture.takePicture(outputFileOptions, executorDirectExecutor, delegatingImageSavedCallback);
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }
}
