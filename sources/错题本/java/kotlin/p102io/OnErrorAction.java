package kotlin.p102io;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m5110d2 = {"Lkotlin/io/OnErrorAction;", "", "SKIP", "TERMINATE", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class OnErrorAction {
    public static final OnErrorAction SKIP;
    public static final OnErrorAction TERMINATE;

    /* renamed from: a */
    public static final /* synthetic */ OnErrorAction[] f9207a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9208b;

    static {
        OnErrorAction onErrorAction = new OnErrorAction("SKIP", 0);
        SKIP = onErrorAction;
        OnErrorAction onErrorAction2 = new OnErrorAction("TERMINATE", 1);
        TERMINATE = onErrorAction2;
        OnErrorAction[] onErrorActionArr = {onErrorAction, onErrorAction2};
        f9207a = onErrorActionArr;
        f9208b = AbstractC5817a.m5310a(onErrorActionArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9208b;
    }

    public static OnErrorAction valueOf(String str) {
        return (OnErrorAction) Enum.valueOf(OnErrorAction.class, str);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[]) f9207a.clone();
    }
}
