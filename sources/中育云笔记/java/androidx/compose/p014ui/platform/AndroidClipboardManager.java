package androidx.compose.p014ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 8;
    private final ClipboardManager clipboardManager;

    public AndroidClipboardManager(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    @Override // androidx.compose.p014ui.platform.ClipboardManager
    public ClipEntry getClip() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.p014ui.platform.ClipboardManager
    public ClipboardManager getNativeClipboard() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.p014ui.platform.ClipboardManager
    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.p014ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.p014ui.platform.ClipboardManager
    public void setClip(ClipEntry clipEntry) {
        if (clipEntry != null) {
            this.clipboardManager.setPrimaryClip(clipEntry.getClipData());
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28ClipboardManagerClipClear.clearPrimaryClip(this.clipboardManager);
        } else {
            this.clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    @Override // androidx.compose.p014ui.platform.ClipboardManager
    public void setText(AnnotatedString annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidClipboardManager(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
