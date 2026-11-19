package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.Executor;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5990p0;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.C5961g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.C5632d;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5634f;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6683l;
import retrofit2.ExecutorC6482a;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aV\u0010\n\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a^\u0010\n\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/camera/core/ImageCapture;", "Lkotlin/Function0;", "Ld6/s;", "onCaptureStarted", "Lkotlin/Function1;", "", "onCaptureProcessProgressed", "Landroid/graphics/Bitmap;", "onPostviewBitmapAvailable", "Landroidx/camera/core/ImageProxy;", "takePicture", "(Landroidx/camera/core/ImageCapture;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;", "Landroidx/camera/core/ImageCapture$OutputFileOptions;", "outputFileOptions", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;", "Landroidx/camera/core/imagecapture/TakePictureRequest;", "getTakePictureRequest", "(Landroidx/camera/core/ImageCapture;)Landroidx/camera/core/imagecapture/TakePictureRequest;", "camera-core_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nImageCaptureExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,203:1\n329#2:204\n329#2:216\n314#3,11:205\n314#3,11:217\n*S KotlinDebug\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n*L\n50#1:204\n102#1:216\n52#1:205,11\n104#1:217,11\n*E\n"})
/* loaded from: classes.dex */
public final class ImageCaptureExtKt {
    @VisibleForTesting
    @Nullable
    public static final TakePictureRequest getTakePictureRequest(@NotNull ImageCapture imageCapture) {
        AbstractC5830k.m5330g(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, androidx.camera.core.DelegatingImageCapturedCallback] */
    @Nullable
    public static final Object takePicture(@NotNull ImageCapture imageCapture, @Nullable final InterfaceC6469a interfaceC6469a, @Nullable final InterfaceC6471c interfaceC6471c, @Nullable final InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC5631c<? super ImageProxy> interfaceC5631c) {
        Executor executorDirectExecutor;
        InterfaceC5634f interfaceC5634f = interfaceC5631c.getContext().get(C5632d.f8764a);
        AbstractC5995r abstractC5995r = interfaceC5634f instanceof AbstractC5995r ? (AbstractC5995r) interfaceC5634f : null;
        if (abstractC5995r != null) {
            AbstractC5990p0 abstractC5990p0 = abstractC5995r instanceof AbstractC5990p0 ? (AbstractC5990p0) abstractC5995r : null;
            if (abstractC5990p0 == null || (executorDirectExecutor = abstractC5990p0.mo4933d()) == null) {
                executorDirectExecutor = new ExecutorC6482a(abstractC5995r);
            }
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            AbstractC5830k.m5329f(executorDirectExecutor, "directExecutor()");
        }
        final C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int progress) {
                InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
                if (interfaceC6471c3 != null) {
                    interfaceC6471c3.invoke(Integer.valueOf(progress));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                InterfaceC6469a interfaceC6469a2 = interfaceC6469a;
                if (interfaceC6469a2 != null) {
                    interfaceC6469a2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(@NotNull ImageProxy imageProxy) {
                AbstractC5830k.m5330g(imageProxy, "imageProxy");
                DelegatingImageCapturedCallback delegatingImageCapturedCallback = ref$ObjectRef.element;
                if (delegatingImageCapturedCallback == null) {
                    AbstractC5830k.m5339p("delegatingCallback");
                    throw null;
                }
                delegatingImageCapturedCallback.dispose();
                c5961g.resumeWith(Result.m13956constructorimpl(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(@NotNull ImageCaptureException exception) {
                AbstractC5830k.m5330g(exception, "exception");
                DelegatingImageCapturedCallback delegatingImageCapturedCallback = ref$ObjectRef.element;
                if (delegatingImageCapturedCallback == null) {
                    AbstractC5830k.m5339p("delegatingCallback");
                    throw null;
                }
                delegatingImageCapturedCallback.dispose();
                c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(@NotNull Bitmap bitmap) {
                AbstractC5830k.m5330g(bitmap, "bitmap");
                InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
                if (interfaceC6471c3 != null) {
                    interfaceC6471c3.invoke(bitmap);
                }
            }
        });
        c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@Nullable Throwable th) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback = ref$ObjectRef.element;
                if (delegatingImageCapturedCallback != null) {
                    delegatingImageCapturedCallback.dispose();
                } else {
                    AbstractC5830k.m5339p("delegatingCallback");
                    throw null;
                }
            }
        });
        T t8 = ref$ObjectRef.element;
        if (t8 == 0) {
            AbstractC5830k.m5339p("delegatingCallback");
            throw null;
        }
        imageCapture.lambda$takePicture$1(executorDirectExecutor, (DelegatingImageCapturedCallback) t8);
        Object objM5583t = c5961g.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5583t;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6469a = null;
        }
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c2 = null;
        }
        return takePicture(imageCapture, interfaceC6469a, interfaceC6471c, interfaceC6471c2, interfaceC5631c);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6469a = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 8) != 0) {
            interfaceC6471c2 = null;
        }
        return takePicture(imageCapture, outputFileOptions, interfaceC6469a, interfaceC6471c, interfaceC6471c2, interfaceC5631c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, androidx.camera.core.DelegatingImageSavedCallback] */
    @Nullable
    public static final Object takePicture(@NotNull ImageCapture imageCapture, @NotNull ImageCapture.OutputFileOptions outputFileOptions, @Nullable final InterfaceC6469a interfaceC6469a, @Nullable final InterfaceC6471c interfaceC6471c, @Nullable final InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC5631c<? super ImageCapture.OutputFileResults> interfaceC5631c) {
        Executor executorDirectExecutor;
        InterfaceC5634f interfaceC5634f = interfaceC5631c.getContext().get(C5632d.f8764a);
        AbstractC5995r abstractC5995r = interfaceC5634f instanceof AbstractC5995r ? (AbstractC5995r) interfaceC5634f : null;
        if (abstractC5995r != null) {
            AbstractC5990p0 abstractC5990p0 = abstractC5995r instanceof AbstractC5990p0 ? (AbstractC5990p0) abstractC5995r : null;
            if (abstractC5990p0 == null || (executorDirectExecutor = abstractC5990p0.mo4933d()) == null) {
                executorDirectExecutor = new ExecutorC6482a(abstractC5995r);
            }
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            AbstractC5830k.m5329f(executorDirectExecutor, "directExecutor()");
        }
        final C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int progress) {
                InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
                if (interfaceC6471c3 != null) {
                    interfaceC6471c3.invoke(Integer.valueOf(progress));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                InterfaceC6469a interfaceC6469a2 = interfaceC6469a;
                if (interfaceC6469a2 != null) {
                    interfaceC6469a2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(@NotNull ImageCaptureException exception) {
                AbstractC5830k.m5330g(exception, "exception");
                DelegatingImageSavedCallback delegatingImageSavedCallback = ref$ObjectRef.element;
                if (delegatingImageSavedCallback == null) {
                    AbstractC5830k.m5339p("delegatingCallback");
                    throw null;
                }
                delegatingImageSavedCallback.dispose();
                c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(@NotNull ImageCapture.OutputFileResults outputFileResults) {
                AbstractC5830k.m5330g(outputFileResults, "outputFileResults");
                DelegatingImageSavedCallback delegatingImageSavedCallback = ref$ObjectRef.element;
                if (delegatingImageSavedCallback == null) {
                    AbstractC5830k.m5339p("delegatingCallback");
                    throw null;
                }
                delegatingImageSavedCallback.dispose();
                c5961g.resumeWith(Result.m13956constructorimpl(outputFileResults));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(@NotNull Bitmap bitmap) {
                AbstractC5830k.m5330g(bitmap, "bitmap");
                InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
                if (interfaceC6471c3 != null) {
                    interfaceC6471c3.invoke(bitmap);
                }
            }
        });
        c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@Nullable Throwable th) {
                DelegatingImageSavedCallback delegatingImageSavedCallback = ref$ObjectRef.element;
                if (delegatingImageSavedCallback != null) {
                    delegatingImageSavedCallback.dispose();
                } else {
                    AbstractC5830k.m5339p("delegatingCallback");
                    throw null;
                }
            }
        });
        T t8 = ref$ObjectRef.element;
        if (t8 != 0) {
            imageCapture.lambda$takePicture$2(outputFileOptions, executorDirectExecutor, (DelegatingImageSavedCallback) t8);
            Object objM5583t = c5961g.m5583t();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM5583t;
        }
        AbstractC5830k.m5339p("delegatingCallback");
        throw null;
    }
}
