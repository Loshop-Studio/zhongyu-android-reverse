package p147rx.internal.producers;

import p147rx.Producer;

/* loaded from: classes2.dex */
public final class ProducerArbiter implements Producer {
    static final Producer NULL_PRODUCER = new Producer() { // from class: rx.internal.producers.ProducerArbiter.1
        @Override // p147rx.Producer
        public void request(long j4) {
        }
    };
    Producer currentProducer;
    boolean emitting;
    long missedProduced;
    Producer missedProducer;
    long missedRequested;
    long requested;

    public void emitLoop() {
        while (true) {
            synchronized (this) {
                long j4 = this.missedRequested;
                long j5 = this.missedProduced;
                Producer producer = this.missedProducer;
                if (j4 == 0 && j5 == 0 && producer == null) {
                    this.emitting = false;
                    return;
                }
                this.missedRequested = 0L;
                this.missedProduced = 0L;
                this.missedProducer = null;
                long j6 = this.requested;
                if (j6 != Long.MAX_VALUE) {
                    long j7 = j6 + j4;
                    if (j7 < 0 || j7 == Long.MAX_VALUE) {
                        this.requested = Long.MAX_VALUE;
                        j6 = Long.MAX_VALUE;
                    } else {
                        j6 = j7 - j5;
                        if (j6 < 0) {
                            throw new IllegalStateException("more produced than requested");
                        }
                        this.requested = j6;
                    }
                }
                if (producer == null) {
                    Producer producer2 = this.currentProducer;
                    if (producer2 != null && j4 != 0) {
                        producer2.request(j4);
                    }
                } else if (producer == NULL_PRODUCER) {
                    this.currentProducer = null;
                } else {
                    this.currentProducer = producer;
                    producer.request(j6);
                }
            }
        }
    }

    public void produced(long j4) {
        if (j4 <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            if (this.emitting) {
                this.missedProduced += j4;
                return;
            }
            this.emitting = true;
            try {
                long j5 = this.requested;
                if (j5 != Long.MAX_VALUE) {
                    long j6 = j5 - j4;
                    if (j6 < 0) {
                        throw new IllegalStateException("more items arrived than were requested");
                    }
                    this.requested = j6;
                }
                emitLoop();
            } catch (Throwable th) {
                synchronized (this) {
                    this.emitting = false;
                    throw th;
                }
            }
        }
    }

    @Override // p147rx.Producer
    public void request(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j4 == 0) {
            return;
        }
        synchronized (this) {
            if (this.emitting) {
                this.missedRequested += j4;
                return;
            }
            this.emitting = true;
            try {
                long j5 = this.requested + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.requested = j5;
                Producer producer = this.currentProducer;
                if (producer != null) {
                    producer.request(j4);
                }
                emitLoop();
            } catch (Throwable th) {
                synchronized (this) {
                    this.emitting = false;
                    throw th;
                }
            }
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            if (this.emitting) {
                if (producer == null) {
                    producer = NULL_PRODUCER;
                }
                this.missedProducer = producer;
                return;
            }
            this.emitting = true;
            try {
                this.currentProducer = producer;
                if (producer != null) {
                    producer.request(this.requested);
                }
                emitLoop();
            } catch (Throwable th) {
                synchronized (this) {
                    this.emitting = false;
                    throw th;
                }
            }
        }
    }
}
