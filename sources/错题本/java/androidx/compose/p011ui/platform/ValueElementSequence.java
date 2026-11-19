package androidx.compose.p011ui.platform;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p214z6.InterfaceC6830h;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/ui/platform/ValueElementSequence;", "Lz6/h;", "Landroidx/compose/ui/platform/ValueElement;", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;", "", HintConstants.AUTOFILL_HINT_NAME, "", "value", "Ld6/s;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "elements", "Ljava/util/List;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ValueElementSequence implements InterfaceC6830h {
    public static final int $stable = 8;

    @NotNull
    private final List<ValueElement> elements = new ArrayList();

    @Override // p214z6.InterfaceC6830h
    @NotNull
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(@NotNull String name, @Nullable Object value) {
        this.elements.add(new ValueElement(name, value));
    }
}
