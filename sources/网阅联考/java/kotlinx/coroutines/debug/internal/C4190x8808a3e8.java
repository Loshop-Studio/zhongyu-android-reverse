package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3335ai;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

@Metadata(m5174d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5175d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, C3335ai.f1705at, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m5176k = 3, m5177mv = {1, 6, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 */
/* loaded from: classes2.dex */
public final class C4190x8808a3e8<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t3, T t4) {
        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t3).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t4).info.sequenceNumber));
    }
}
