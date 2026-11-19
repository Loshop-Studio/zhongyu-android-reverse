package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import androidx.compose.foundation.C1194R;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TextContextMenuItems {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES;
    public static final TextContextMenuItems Autofill;
    private final int stringId;
    public static final TextContextMenuItems Cut = new TextContextMenuItems("Cut", 0, R.string.cut);
    public static final TextContextMenuItems Copy = new TextContextMenuItems("Copy", 1, R.string.copy);
    public static final TextContextMenuItems Paste = new TextContextMenuItems("Paste", 2, R.string.paste);
    public static final TextContextMenuItems SelectAll = new TextContextMenuItems("SelectAll", 3, R.string.selectAll);

    private static final /* synthetic */ TextContextMenuItems[] $values() {
        return new TextContextMenuItems[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        Autofill = new TextContextMenuItems("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? C1194R.string.autofill : R.string.autofill);
        TextContextMenuItems[] textContextMenuItemsArr$values = $values();
        $VALUES = textContextMenuItemsArr$values;
        $ENTRIES = AbstractC9108a.m16085a(textContextMenuItemsArr$values);
    }

    private TextContextMenuItems(String str, int i10, int i11) {
        this.stringId = i11;
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    @Composable
    @ReadOnlyComposable
    public final String resolvedString(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:131)");
        }
        String strStringResource = StringResources_androidKt.stringResource(this.stringId, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strStringResource;
    }
}
