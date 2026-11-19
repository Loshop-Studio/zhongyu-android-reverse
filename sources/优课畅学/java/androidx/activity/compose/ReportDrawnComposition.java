package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.Ref$BooleanRef;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class ReportDrawnComposition implements InterfaceC10559a {
    private final InterfaceC10570l checkReporter;
    private final FullyDrawnReporter fullyDrawnReporter;
    private final InterfaceC10559a predicate;
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, InterfaceC10559a interfaceC10559a) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = interfaceC10559a;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new InterfaceC10570l() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC10559a) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InterfaceC10559a interfaceC10559a2) {
                interfaceC10559a2.invoke();
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
        observeReporter(interfaceC10559a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final InterfaceC10559a interfaceC10559a) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        this.snapshotStateObserver.observeReads(interfaceC10559a, this.checkReporter, new InterfaceC10559a() { // from class: androidx.activity.compose.ReportDrawnComposition.observeReporter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m20106invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20106invoke() {
                ref$BooleanRef.f17469a = ((Boolean) interfaceC10559a.invoke()).booleanValue();
            }
        });
        if (ref$BooleanRef.f17469a) {
            removeReporter();
        }
    }

    @Override // p300x7.InterfaceC10559a
    public /* bridge */ /* synthetic */ Object invoke() {
        m20105invoke();
        return C8736p.f16368a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        m20105invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m20105invoke() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
