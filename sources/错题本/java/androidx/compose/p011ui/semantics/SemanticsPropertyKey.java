package androidx.compose.p011ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;
import p207y6.InterfaceC6792p;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR0\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m5110d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", ExifInterface.GPS_DIRECTION_TRUE, "", "", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lr6/e;)V", "", "isImportantForAccessibility", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;ZLr6/e;)V", "parentValue", "childValue", "merge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "thisRef", "Ly6/p;", "property", "getValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ly6/p;)Ljava/lang/Object;", "value", "Ld6/s;", "setValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ly6/p;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "Lr6/e;", "getMergePolicy$ui_release", "()Lr6/e;", "<set-?>", "Z", "isImportantForAccessibility$ui_release", "()Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;

    @NotNull
    private final InterfaceC6473e mergePolicy;

    @NotNull
    private final String name;

    public SemanticsPropertyKey(@NotNull String str, @NotNull InterfaceC6473e interfaceC6473e) {
        this.name = str;
        this.mergePolicy = interfaceC6473e;
    }

    @NotNull
    /* renamed from: getMergePolicy$ui_release, reason: from getter */
    public final InterfaceC6473e getMergePolicy() {
        return this.mergePolicy;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final T getValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull InterfaceC6792p property) {
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    /* renamed from: isImportantForAccessibility$ui_release, reason: from getter */
    public final boolean getIsImportantForAccessibility() {
        return this.isImportantForAccessibility;
    }

    @Nullable
    public final T merge(@Nullable T parentValue, T childValue) {
        return (T) this.mergePolicy.invoke(parentValue, childValue);
    }

    public final void setValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull InterfaceC6792p property, T value) {
        thisRef.set(this, value);
    }

    @NotNull
    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, InterfaceC6473e interfaceC6473e, int i, AbstractC5824e abstractC5824e) {
        this(str, (i & 2) != 0 ? new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // p152r6.InterfaceC6473e
            public final T invoke(T t8, T t9) {
                return t8 == null ? t9 : t8;
            }
        } : interfaceC6473e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@NotNull String str, boolean z8) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z8;
    }

    public SemanticsPropertyKey(@NotNull String str, boolean z8, @NotNull InterfaceC6473e interfaceC6473e) {
        this(str, interfaceC6473e);
        this.isImportantForAccessibility = z8;
    }
}
