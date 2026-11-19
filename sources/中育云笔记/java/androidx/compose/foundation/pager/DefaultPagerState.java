package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
final class DefaultPagerState extends PagerState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<DefaultPagerState, ?> Saver = ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final List<Object> invoke(SaverScope saverScope, DefaultPagerState defaultPagerState) {
            return AbstractC10978w.m24139q(Integer.valueOf(defaultPagerState.getCurrentPage()), Float.valueOf(AbstractC10410o.m21760m(defaultPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.getPageCount()));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final DefaultPagerState invoke(final List<? extends Object> list) {
            Object obj = list.get(0);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new DefaultPagerState(iIntValue, ((Float) obj2).floatValue(), new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Integer invoke() {
                    Object obj3 = list.get(2);
                    AbstractC9979u.m20292e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });
    private MutableState<InterfaceC9529a> pageCountState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<DefaultPagerState, ?> getSaver() {
            return DefaultPagerState.Saver;
        }

        private Companion() {
        }
    }

    public DefaultPagerState(int i10, float f10, InterfaceC9529a interfaceC9529a) {
        super(i10, f10);
        this.pageCountState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC9529a, null, 2, null);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return ((Number) this.pageCountState.getValue().invoke()).intValue();
    }

    public final MutableState<InterfaceC9529a> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(MutableState<InterfaceC9529a> mutableState) {
        this.pageCountState = mutableState;
    }
}
