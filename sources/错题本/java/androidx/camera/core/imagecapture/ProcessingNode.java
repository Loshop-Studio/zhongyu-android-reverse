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
public class ProcessingNode implements Node<AbstractC0335In, Void> {
    private static final String TAG = "ProcessingNode";
    private Operation<Bitmap2JpegBytes.AbstractC0329In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;

    @NonNull
    final Executor mBlockingExecutor;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.AbstractC0333In, Packet<byte[]>> mImage2JpegBytes;

    @Nullable
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private AbstractC0335In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.AbstractC0334In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    @AutoValue
    /* renamed from: androidx.camera.core.imagecapture.ProcessingNode$In */
    public static abstract class AbstractC0335In {
        /* renamed from: of */
        public static AbstractC0335In m635of(int i, int i8) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i, i8);
        }

        public abstract Edge<InputPacket> getEdge();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract Edge<InputPacket> getPostviewEdge();
    }

    @AutoValue
    public static abstract class InputPacket {
        /* renamed from: of */
        public static InputPacket m636of(@NonNull ProcessingRequest processingRequest, @NonNull ImageProxy imageProxy) {
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

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i) throws ImageCaptureException {
        Preconditions.checkState(ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            packetApply = operation.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.AbstractC0329In.m614of(packetApply, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(InputPacket inputPacket) {
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            this.mBlockingExecutor.execute(new RunnableC0344f(this, inputPacket, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$3(InputPacket inputPacket) {
        if (!inputPacket.getProcessingRequest().isAborted()) {
            this.mBlockingExecutor.execute(new RunnableC0344f(this, inputPacket, 0));
        } else {
            Logger.m591w(TAG, "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        }
    }

    private static void sendError(@NonNull ProcessingRequest processingRequest, @NonNull ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new RunnableC0346h(0, processingRequest, imageCaptureException));
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
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0333In.m624of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        return this.mJpegImage2Result.apply(packetApply);
    }

    @WorkerThread
    /* renamed from: processInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$0(@NonNull InputPacket inputPacket) {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                CameraXExecutors.mainThreadExecutor().execute(new RunnableC0346h(1, processingRequest, processInMemoryCapture(inputPacket)));
            } else {
                CameraXExecutors.mainThreadExecutor().execute(new RunnableC0346h(2, processingRequest, processOnDiskCapture(inputPacket)));
            }
        } catch (ImageCaptureException e) {
            sendError(processingRequest, e);
        } catch (OutOfMemoryError e4) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e4));
        } catch (RuntimeException e8) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e8));
        }
    }

    @NonNull
    @WorkerThread
    public ImageCapture.OutputFileResults processOnDiskCapture(@NonNull InputPacket inputPacket) throws ImageCaptureException {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(ImageUtil.isJpegFormats(outputFormat), "On-disk capture only support JPEG and JPEG/R output formats. Output format: " + outputFormat);
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0333In.m624of(this.mInput2Packet.apply(inputPacket), processingRequest.getJpegQuality()));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, processingRequest.getJpegQuality());
        }
        Operation<JpegBytes2Disk.AbstractC0334In, ImageCapture.OutputFileResults> operation = this.mJpegBytes2Disk;
        ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
        Objects.requireNonNull(outputFileOptions);
        return operation.apply(JpegBytes2Disk.AbstractC0334In.m625of(packetApply, outputFileOptions));
    }

    @WorkerThread
    /* renamed from: processPostviewInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$2(@NonNull InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(outputFormat == 35 || outputFormat == 256, "Postview only support YUV and JPEG output formats. Output format: " + outputFormat);
        try {
            CameraXExecutors.mainThreadExecutor().execute(new RunnableC0346h(3, inputPacket.getProcessingRequest(), this.mImage2Bitmap.apply(this.mInput2Packet.apply(inputPacket))));
        } catch (Exception e) {
            inputPacket.getImageProxy().close();
            Logger.m588e(TAG, "process postview input packet failed.", e);
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
    public Void transform(@NonNull AbstractC0335In abstractC0335In) {
        this.mInputEdge = abstractC0335In;
        final int i = 0;
        abstractC0335In.getEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.g

            /* renamed from: b */
            public final /* synthetic */ ProcessingNode f432b;

            {
                this.f432b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f432b.lambda$transform$1((ProcessingNode.InputPacket) obj);
                        break;
                    default:
                        this.f432b.lambda$transform$3((ProcessingNode.InputPacket) obj);
                        break;
                }
            }
        });
        final int i8 = 1;
        abstractC0335In.getPostviewEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.g

            /* renamed from: b */
            public final /* synthetic */ ProcessingNode f432b;

            {
                this.f432b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        this.f432b.lambda$transform$1((ProcessingNode.InputPacket) obj);
                        break;
                    default:
                        this.f432b.lambda$transform$3((ProcessingNode.InputPacket) obj);
                        break;
                }
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (abstractC0335In.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
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
