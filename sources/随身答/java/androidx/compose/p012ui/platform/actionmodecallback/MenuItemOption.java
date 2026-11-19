package androidx.compose.p012ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import androidx.compose.p012ui.C2567R;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m13413d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "order", "getOrder", "titleResource", "getTitleResource", "Copy", "Paste", "Cut", "SelectAll", "Autofill", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MenuItemOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MenuItemOption[] $VALUES;
    private final int id;
    private final int order;
    public static final MenuItemOption Copy = new MenuItemOption("Copy", 0, 0);
    public static final MenuItemOption Paste = new MenuItemOption("Paste", 1, 1);
    public static final MenuItemOption Cut = new MenuItemOption("Cut", 2, 2);
    public static final MenuItemOption SelectAll = new MenuItemOption("SelectAll", 3, 3);
    public static final MenuItemOption Autofill = new MenuItemOption("Autofill", 4, 4);

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[MenuItemOption.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemOption.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemOption.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemOption.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MenuItemOption[] $values() {
        return new MenuItemOption[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    static {
        MenuItemOption[] menuItemOptionArr$values = $values();
        $VALUES = menuItemOptionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(menuItemOptionArr$values);
    }

    private MenuItemOption(String str, int i9, int i10) {
        this.id = i10;
        this.order = i10;
    }

    public static EnumEntries<MenuItemOption> getEntries() {
        return $ENTRIES;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i9 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i9 == 1) {
            return R.string.copy;
        }
        if (i9 == 2) {
            return R.string.paste;
        }
        if (i9 == 3) {
            return R.string.cut;
        }
        if (i9 == 4) {
            return R.string.selectAll;
        }
        if (i9 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? C2567R.string.autofill : R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }
}
