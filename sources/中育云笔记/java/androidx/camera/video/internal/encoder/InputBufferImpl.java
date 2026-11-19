package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class InputBufferImpl implements InputBuffer {
    private final int mBufferIndex;
    private final ByteBuffer mByteBuffer;
    private final MediaCodec mMediaCodec;
    private final CallbackToFutureAdapter.Completer<Void> mTerminationCompleter;
    private final ListenableFuture<Void> mTerminationFuture;
    private final AtomicBoolean mTerminated = new AtomicBoolean(false);
    private long mPresentationTimeUs = 0;
    private boolean mIsEndOfStream = false;

    public InputBufferImpl(@NonNull MediaCodec mediaCodec, @IntRange(from = 0) int i10) {
        this.mMediaCodec = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.mBufferIndex = Preconditions.checkArgumentNonnegative(i10);
        this.mByteBuffer = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.mTerminationFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.q0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return InputBufferImpl.m857a(atomicReference, completer);
            }
        });
        this.mTerminationCompleter = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: a */
    public static /* synthetic */ Object m857a(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "Terminate InputBuffer";
    }

    private void throwIfTerminated() {
        if (this.mTerminated.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean cancel() throws MediaCodec.CryptoException {
        if (this.mTerminated.getAndSet(true)) {
            return false;
        }
        try {
            this.mMediaCodec.queueInputBuffer(this.mBufferIndex, 0, 0, 0L, 0);
            this.mTerminationCompleter.set(null);
        } catch (IllegalStateException e10) {
            this.mTerminationCompleter.setException(e10);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    @NonNull
    public ByteBuffer getByteBuffer() {
        throwIfTerminated();
        return this.mByteBuffer;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    @NonNull
    public ListenableFuture<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setEndOfStream(boolean z10) {
        throwIfTerminated();
        this.mIsEndOfStream = z10;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setPresentationTimeUs(long j10) {
        throwIfTerminated();
        Preconditions.checkArgument(j10 >= 0);
        this.mPresentationTimeUs = j10;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean submit() throws MediaCodec.CryptoException {
        if (this.mTerminated.getAndSet(true)) {
            return false;
        }
        try {
            this.mMediaCodec.queueInputBuffer(this.mBufferIndex, this.mByteBuffer.position(), this.mByteBuffer.limit(), this.mPresentationTimeUs, this.mIsEndOfStream ? 4 : 0);
            this.mTerminationCompleter.set(null);
            return true;
        } catch (IllegalStateException e10) {
            this.mTerminationCompleter.setException(e10);
            return false;
        }
    }
}
