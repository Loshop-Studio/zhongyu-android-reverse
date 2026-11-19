package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class DefaultPagerState extends PagerState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<DefaultPagerState, ?> Saver = ListSaverKt.listSaver(new InterfaceC10574p() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$1
        @Override // p300x7.InterfaceC10574p
        public final List<Object> invoke(SaverScope saverScope, DefaultPagerState defaultPagerState) {
            return AbstractC8809v.m14774q(Integer.valueOf(defaultPagerState.getCurrentPage()), Float.valueOf(AbstractC8323h.m13517l(defaultPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.getPageCount()));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2
        @Override // p300x7.InterfaceC10570l
        public final DefaultPagerState invoke(final List<? extends Object> list) {
            Object obj = list.get(0);
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new DefaultPagerState(iIntValue, ((Float) obj2).floatValue(), new InterfaceC10559a() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Integer invoke() {
                    Object obj3 = list.get(2);
                    AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });
    private MutableState<InterfaceC10559a> pageCountState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<DefaultPagerState, ?> getSaver() {
            return DefaultPagerState.Saver;
        }

        private Companion() {
        }
    }

    public DefaultPagerState(int i10, float f10, InterfaceC10559a interfaceC10559a) {
        super(i10, f10);
        this.pageCountState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC10559a, null, 2, null);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return ((Number) this.pageCountState.getValue().invoke()).intValue();
    }

    public final MutableState<InterfaceC10559a> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(MutableState<InterfaceC10559a> mutableState) {
        this.pageCountState = mutableState;
    }
}
