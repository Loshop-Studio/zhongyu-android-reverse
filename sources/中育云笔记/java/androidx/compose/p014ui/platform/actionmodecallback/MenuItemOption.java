package androidx.compose.p014ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import androidx.compose.p014ui.C2638R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MenuItemOption {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ MenuItemOption[] $VALUES;

    /* renamed from: id */
    private final int f1263id;
    private final int order;
    public static final MenuItemOption Copy = new MenuItemOption("Copy", 0, 0);
    public static final MenuItemOption Paste = new MenuItemOption("Paste", 1, 1);
    public static final MenuItemOption Cut = new MenuItemOption("Cut", 2, 2);
    public static final MenuItemOption SelectAll = new MenuItemOption("SelectAll", 3, 3);
    public static final MenuItemOption Autofill = new MenuItemOption("Autofill", 4, 4);

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
        $ENTRIES = AbstractC9953a.m20230a(menuItemOptionArr$values);
    }

    private MenuItemOption(String str, int i10, int i11) {
        this.f1263id = i11;
        this.order = i11;
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f1263id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        if (i10 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? C2638R.string.autofill : R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }
}
