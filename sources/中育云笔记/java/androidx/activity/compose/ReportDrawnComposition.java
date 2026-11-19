package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class ReportDrawnComposition implements InterfaceC9529a {
    private final InterfaceC9540l checkReporter;
    private final FullyDrawnReporter fullyDrawnReporter;
    private final InterfaceC9529a predicate;
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, InterfaceC9529a interfaceC9529a) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = interfaceC9529a;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new InterfaceC9540l() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC9529a) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InterfaceC9529a interfaceC9529a2) {
                interfaceC9529a2.invoke();
            }
        });
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        observeReporter(interfaceC9529a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final InterfaceC9529a interfaceC9529a) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        this.snapshotStateObserver.observeReads(interfaceC9529a, this.checkReporter, new InterfaceC9529a() { // from class: androidx.activity.compose.ReportDrawnComposition.observeReporter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m26708invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26708invoke() {
                ref$BooleanRef.f23398c = ((Boolean) interfaceC9529a.invoke()).booleanValue();
            }
        });
        if (ref$BooleanRef.f23398c) {
            removeReporter();
        }
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m26707invoke();
        return C10786q.f26013a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        m26707invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m26707invoke() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
