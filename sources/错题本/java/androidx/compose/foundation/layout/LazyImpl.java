package androidx.compose.foundation.layout;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m5110d2 = {"Landroidx/compose/foundation/layout/LazyImpl;", "Ld6/e;", "", "Lkotlin/Function0;", "initializer", "", "errorMessage", "<init>", "(Lr6/a;Ljava/lang/String;)V", "", "isInitialized", "()Z", "toString", "()Ljava/lang/String;", "Lr6/a;", "getInitializer", "()Lr6/a;", "Ljava/lang/String;", "getErrorMessage", "_value", "I", "getValue", "()Ljava/lang/Integer;", "value", "Companion", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class LazyImpl implements InterfaceC5429e {
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value = -1;

    @NotNull
    private final String errorMessage;

    @NotNull
    private final InterfaceC6469a initializer;

    public LazyImpl(@NotNull InterfaceC6469a interfaceC6469a, @NotNull String str) {
        this.initializer = interfaceC6469a;
        this.errorMessage = str;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final InterfaceC6469a getInitializer() {
        return this.initializer;
    }

    public boolean isInitialized() {
        return this._value != -1;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : this.errorMessage;
    }

    @Override // p045d6.InterfaceC5429e
    @NotNull
    public Integer getValue() {
        if (this._value == -1) {
            this._value = ((Number) this.initializer.invoke()).intValue();
        }
        int i = this._value;
        if (i != -1) {
            return Integer.valueOf(i);
        }
        throw new IllegalStateException(this.errorMessage);
    }
}
