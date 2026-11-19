package androidx.core.os;

import android.p010os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.text.android.AbstractC2310b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p075h6.InterfaceC5631c;

@RequiresApi(31)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"R", "", ExifInterface.LONGITUDE_EAST, "Lh6/c;", "Landroid/os/OutcomeReceiver;", "asOutcomeReceiver", "(Lh6/c;)Landroid/os/OutcomeReceiver;", "core-ktx_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    @NotNull
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(@NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return AbstractC2310b.m1419h(new ContinuationOutcomeReceiver(interfaceC5631c));
    }
}
