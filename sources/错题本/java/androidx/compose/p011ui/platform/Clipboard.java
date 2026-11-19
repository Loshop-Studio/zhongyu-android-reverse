package androidx.compose.p011ui.platform;

import android.content.ClipboardManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u00060\tj\u0002`\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/platform/Clipboard;", "", "Landroidx/compose/ui/platform/ClipEntry;", "getClipEntry", "(Lh6/c;)Ljava/lang/Object;", "clipEntry", "Ld6/s;", "setClipEntry", "(Landroidx/compose/ui/platform/ClipEntry;Lh6/c;)Ljava/lang/Object;", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/NativeClipboard;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "nativeClipboard", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface Clipboard {
    @Nullable
    Object getClipEntry(@NotNull InterfaceC5631c<? super ClipEntry> interfaceC5631c);

    @NotNull
    ClipboardManager getNativeClipboard();

    @Nullable
    Object setClipEntry(@Nullable ClipEntry clipEntry, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);
}
