package androidx.compose.p011ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Stable
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/ui/modifier/ModifierLocal;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lr6/a;)V", "Lr6/a;", "getDefaultFactory$ui_release", "()Lr6/a;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;

    @NotNull
    private final InterfaceC6469a defaultFactory;

    public /* synthetic */ ModifierLocal(InterfaceC6469a interfaceC6469a, AbstractC5824e abstractC5824e) {
        this(interfaceC6469a);
    }

    @NotNull
    /* renamed from: getDefaultFactory$ui_release, reason: from getter */
    public final InterfaceC6469a getDefaultFactory() {
        return this.defaultFactory;
    }

    private ModifierLocal(InterfaceC6469a interfaceC6469a) {
        this.defaultFactory = interfaceC6469a;
    }
}
