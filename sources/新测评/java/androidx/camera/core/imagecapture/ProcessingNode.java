package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ProcessingNode implements Node<AbstractC0534In, Void> {
    private static final String TAG = "ProcessingNode";
    private Operation<Bitmap2JpegBytes.AbstractC0528In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;

    @NonNull
    final Executor mBlockingExecutor;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.AbstractC0532In, Packet<byte[]>> mImage2JpegBytes;

    @Nullable
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private AbstractC0534In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.AbstractC0533In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    @AutoValue
    /* renamed from: androidx.camera.core.imagecapture.ProcessingNode$In */
    public static abstract class AbstractC0534In {
        /* renamed from: of */
        public static AbstractC0534In m774of(int i10, int i11) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i10, i11);
        }

        public abstract Edge<InputPacket> getEdge();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract Edge<InputPacket> getPostviewEdge();
    }

    @AutoValue
    public static abstract class InputPacket {
        /* renamed from: of */
        public static InputPacket m775of(@NonNull ProcessingRequest processingRequest, @NonNull ImageProxy imageProxy) {
            return new AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }

        @NonNull
        public abstract ImageProxy getImageProxy();

        @NonNull
        public abstract ProcessingRequest getProcessingRequest();
    }

    @VisibleForTesting
    public ProcessingNode(@NonNull Executor executor) {
        this(executor, null, DeviceQuirks.getAll());
    }

    /* renamed from: b */
    public static /* synthetic */ void m767b(final ProcessingNode processingNode, final InputPacket inputPacket) {
        processingNode.getClass();
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            processingNode.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f748a.processInputPacket(inputPacket);
                }
            });
        }
    }

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i10) throws ImageCaptureException {
        Preconditions.checkState(ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            packetApply = operation.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.AbstractC0528In.m753of(packetApply, i10));
    }

    /* renamed from: d */
    public static /* synthetic */ void m769d(final ProcessingNode processingNode, final InputPacket inputPacket) {
        processingNode.getClass();
        if (!inputPacket.getProcessingRequest().isAborted()) {
            processingNode.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f736a.processPostviewInputPacket(inputPacket);
                }
            });
        } else {
            Logger.m729w(TAG, "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        }
    }

    private static void sendError(@NonNull final ProcessingRequest processingRequest, @NonNull final ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.n
            @Override // java.lang.Runnable
            public final void run() {
                processingRequest.onProcessFailure(imageCaptureException);
            }
        });
    }

    @VisibleForTesting
    public void injectProcessingInput2Packet(@NonNull Operation<InputPacket, Packet<ImageProxy>> operation) {
        this.mInput2Packet = operation;
    }

    @NonNull
    @WorkerThread
    public ImageProxy processInMemoryCapture(@NonNull InputPacket inputPacket) throws ImageCaptureException {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        if ((packetApply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && this.mInputEdge.getOutputFormat() == 256) {
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0532In.m763of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        return this.mJpegImage2Result.apply(packetApply);
    }

    @WorkerThread
    public void processInputPacket(@NonNull InputPacket inputPacket) {
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                final ImageProxy imageProxyProcessInMemoryCapture = processInMemoryCapture(inputPacket);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        processingRequest.onFinalResult(imageProxyProcessInMemoryCapture);
                    }
                });
            } else {
                final ImageCapture.OutputFileResults outputFileResultsProcessOnDiskCapture = processOnDiskCapture(inputPacket);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        processingRequest.onFinalResult(outputFileResultsProcessOnDiskCapture);
                    }
                });
            }
        } catch (ImageCaptureException e10) {
            sendError(processingRequest, e10);
        } catch (OutOfMemoryError e11) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e12));
        }
    }

    @NonNull
    @WorkerThread
    public ImageCapture.OutputFileResults processOnDiskCapture(@NonNull InputPacket inputPacket) throws ImageCaptureException {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(ImageUtil.isJpegFormats(outputFormat), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(outputFormat)));
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0532In.m763of(this.mInput2Packet.apply(inputPacket), processingRequest.getJpegQuality()));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, processingRequest.getJpegQuality());
        }
        Operation<JpegBytes2Disk.AbstractC0533In, ImageCapture.OutputFileResults> operation = this.mJpegBytes2Disk;
        ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
        Objects.requireNonNull(outputFileOptions);
        return operation.apply(JpegBytes2Disk.AbstractC0533In.m764of(packetApply, outputFileOptions));
    }

    @WorkerThread
    public void processPostviewInputPacket(@NonNull InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(outputFormat == 35 || outputFormat == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(outputFormat)));
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            final Bitmap bitmapApply = this.mImage2Bitmap.apply(this.mInput2Packet.apply(inputPacket));
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.q
                @Override // java.lang.Runnable
                public final void run() {
                    processingRequest.onPostviewBitmapAvailable(bitmapApply);
                }
            });
        } catch (Exception e10) {
            inputPacket.getImageProxy().close();
            Logger.m726e(TAG, "process postview input packet failed.", e10);
        }
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }

    @VisibleForTesting
    public ProcessingNode(@NonNull Executor executor, @NonNull Quirks quirks) {
        this(executor, null, quirks);
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    public Void transform(@NonNull AbstractC0534In abstractC0534In) {
        this.mInputEdge = abstractC0534In;
        abstractC0534In.getEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.l
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ProcessingNode.m767b(this.f738a, (ProcessingNode.InputPacket) obj);
            }
        });
        abstractC0534In.getPostviewEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.m
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ProcessingNode.m769d(this.f739a, (ProcessingNode.InputPacket) obj);
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (abstractC0534In.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new BitmapEffect(internalImageProcessor);
        return null;
    }

    public ProcessingNode(@NonNull Executor executor, @Nullable InternalImageProcessor internalImageProcessor) {
        this(executor, internalImageProcessor, DeviceQuirks.getAll());
    }

    public ProcessingNode(@NonNull Executor executor, @Nullable InternalImageProcessor internalImageProcessor, @NonNull Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }
}
