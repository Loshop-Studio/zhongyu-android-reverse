package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    public interface Interval {
        default InterfaceC9540l getKey() {
            return null;
        }

        default InterfaceC9540l getType() {
            return new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                public final Void invoke(int i10) {
                    return null;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            };
        }
    }

    public final Object getContentType(int i10) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i10);
        return interval.getValue().getType().invoke(Integer.valueOf(i10 - interval.getStartIndex()));
    }

    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final Object getKey(int i10) {
        Object objInvoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i10);
        int startIndex = i10 - interval.getStartIndex();
        InterfaceC9540l key = interval.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(i10) : objInvoke;
    }

    public final <T> T withInterval(int i10, InterfaceC9544p interfaceC9544p) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i10);
        return (T) interfaceC9544p.invoke(Integer.valueOf(i10 - interval.getStartIndex()), interval.getValue());
    }
}
