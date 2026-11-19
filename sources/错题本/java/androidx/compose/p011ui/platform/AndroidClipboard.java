package androidx.compose.p011ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m5110d2 = {"Landroidx/compose/ui/platform/AndroidClipboard;", "Landroidx/compose/ui/platform/Clipboard;", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "androidClipboardManager", "<init>", "(Landroidx/compose/ui/platform/AndroidClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/compose/ui/platform/ClipEntry;", "getClipEntry", "(Lh6/c;)Ljava/lang/Object;", "clipEntry", "Ld6/s;", "setClipEntry", "(Landroidx/compose/ui/platform/ClipEntry;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/NativeClipboard;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "nativeClipboard", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AndroidClipboard implements Clipboard {
    public static final int $stable = 8;

    @NotNull
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(@NotNull AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }

    @Override // androidx.compose.p011ui.platform.Clipboard
    @Nullable
    public Object getClipEntry(@NotNull InterfaceC5631c<? super ClipEntry> interfaceC5631c) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.p011ui.platform.Clipboard
    @NotNull
    public ClipboardManager getNativeClipboard() {
        return this.androidClipboardManager.getClipboardManager();
    }

    @Override // androidx.compose.p011ui.platform.Clipboard
    @Nullable
    public Object setClipEntry(@Nullable ClipEntry clipEntry, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        this.androidClipboardManager.setClip(clipEntry);
        return C5443s.f8405a;
    }

    public AndroidClipboard(@NotNull Context context) {
        this(new AndroidClipboardManager(context));
    }
}
