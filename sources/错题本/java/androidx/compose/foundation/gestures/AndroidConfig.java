package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "viewConfiguration", "Landroid/view/ViewConfiguration;", "(Landroid/view/ViewConfiguration;)V", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "calculateMouseWheelScroll", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerEvent;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,67:1\n113#2:68\n113#2:69\n269#3,3:70\n34#3,6:73\n272#3:79\n1#4:80\n65#5:81\n69#5:84\n60#6:82\n70#6:85\n53#6,3:87\n22#7:83\n30#8:86\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n41#1:68\n48#1:69\n52#1:70,3\n52#1:73,6\n52#1:79\n53#1:81\n53#1:84\n53#1:82\n53#1:85\n53#1:87,3\n53#1:83\n53#1:86\n*E\n"})
/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {

    @NotNull
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(@NotNull ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo6925calculateMouseWheelScroll8xgXZGE(@NotNull Density density, @NotNull PointerEvent pointerEvent, long j7) {
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration) : density.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(64)));
        float f7 = -(i > 26 ? ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration) : density.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(64)));
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM10430boximpl = Offset.m10430boximpl(Offset.INSTANCE.m10457getZeroF1C5BW0());
        int size = changes.size();
        for (int i8 = 0; i8 < size; i8++) {
            offsetM10430boximpl = Offset.m10430boximpl(Offset.m10446plusMKHz9U(offsetM10430boximpl.m10451unboximpl(), changes.get(i8).getScrollDelta()));
        }
        long jM10451unboximpl = offsetM10430boximpl.m10451unboximpl();
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM10451unboximpl >> 32)) * f7) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM10451unboximpl & 4294967295L)) * f) & 4294967295L));
    }

    @NotNull
    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }
}
