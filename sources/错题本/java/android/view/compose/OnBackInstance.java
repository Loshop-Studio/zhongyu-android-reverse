package android.view.compose;

import android.view.BackEventCompat;
import android.view.OnBackPressedCallback;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC5876e;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00127\u0010\u000e\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0013\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u0019\"\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m5110d2 = {"Landroidx/activity/compose/OnBackInstance;", "", "Lkotlinx/coroutines/v;", "scope", "", "isPredictiveBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "Lh6/c;", "Ld6/s;", "onBack", "Landroidx/activity/OnBackPressedCallback;", "callback", "<init>", "(Lkotlinx/coroutines/v;ZLr6/e;Landroidx/activity/OnBackPressedCallback;)V", "backEvent", "Lkotlinx/coroutines/channels/h;", "send-JP2dKIU", "(Landroidx/activity/BackEventCompat;)Ljava/lang/Object;", "send", "close", "()Z", "cancel", "()V", "Z", "setPredictiveBack", "(Z)V", "Lkotlinx/coroutines/channels/e;", "channel", "Lkotlinx/coroutines/channels/e;", "getChannel", "()Lkotlinx/coroutines/channels/e;", "Lkotlinx/coroutines/w0;", "job", "Lkotlinx/coroutines/w0;", "getJob", "()Lkotlinx/coroutines/w0;", "activity-compose_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class OnBackInstance {

    @NotNull
    private final InterfaceC5876e channel = AbstractC5882k.m5511a(-2, 4, BufferOverflow.SUSPEND);
    private boolean isPredictiveBack;

    @NotNull
    private final InterfaceC6013w0 job;

    public OnBackInstance(@NotNull InterfaceC6009v interfaceC6009v, boolean z8, @NotNull InterfaceC6473e interfaceC6473e, @NotNull OnBackPressedCallback onBackPressedCallback) {
        this.isPredictiveBack = z8;
        this.job = AbstractC6014x.m5651v(interfaceC6009v, null, null, new OnBackInstance$job$1(onBackPressedCallback, interfaceC6473e, this, null), 3);
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        this.job.cancel(null);
    }

    public final boolean close() {
        return this.channel.mo5489l(null);
    }

    @NotNull
    public final InterfaceC5876e getChannel() {
        return this.channel;
    }

    @NotNull
    public final InterfaceC6013w0 getJob() {
        return this.job;
    }

    /* renamed from: isPredictiveBack, reason: from getter */
    public final boolean getIsPredictiveBack() {
        return this.isPredictiveBack;
    }

    @NotNull
    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m6510sendJP2dKIU(@NotNull BackEventCompat backEvent) {
        return this.channel.mo5481a(backEvent);
    }

    public final void setPredictiveBack(boolean z8) {
        this.isPredictiveBack = z8;
    }
}
