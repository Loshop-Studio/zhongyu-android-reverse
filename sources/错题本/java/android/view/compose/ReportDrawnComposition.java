package android.view.compose;

import android.view.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m5110d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "", "predicate", "<init>", "(Landroidx/activity/FullyDrawnReporter;Lr6/a;)V", "observeReporter", "(Lr6/a;)V", "invoke", "()V", "removeReporter", "Landroidx/activity/FullyDrawnReporter;", "Lr6/a;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Lkotlin/Function1;", "checkReporter", "Lr6/c;", "activity-compose_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnComposition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/* loaded from: classes.dex */
final class ReportDrawnComposition implements InterfaceC6469a {

    @NotNull
    private final InterfaceC6471c checkReporter;

    @NotNull
    private final FullyDrawnReporter fullyDrawnReporter;

    @NotNull
    private final InterfaceC6469a predicate;

    @NotNull
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(@NotNull FullyDrawnReporter fullyDrawnReporter, @NotNull InterfaceC6469a interfaceC6469a) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = interfaceC6469a;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new InterfaceC6471c() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC6469a) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InterfaceC6469a interfaceC6469a2) {
                interfaceC6469a2.invoke();
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
        observeReporter(interfaceC6469a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final InterfaceC6469a predicate) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        this.snapshotStateObserver.observeReads(predicate, this.checkReporter, new InterfaceC6469a() { // from class: androidx.activity.compose.ReportDrawnComposition.observeReporter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m6512invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m6512invoke() {
                ref$BooleanRef.element = ((Boolean) predicate.invoke()).booleanValue();
            }
        });
        if (ref$BooleanRef.element) {
            removeReporter();
        }
    }

    @Override // p152r6.InterfaceC6469a
    public /* bridge */ /* synthetic */ Object invoke() {
        m6511invoke();
        return C5443s.f8405a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        m6511invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m6511invoke() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
