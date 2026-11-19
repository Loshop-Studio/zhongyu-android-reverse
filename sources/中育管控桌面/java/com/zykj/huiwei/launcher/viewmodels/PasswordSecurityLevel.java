package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000e\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;", "", "Lkotlin/text/Regex;", "regex", "allowedCharsRegex", "", "toastResId", "placeholderResId", "<init>", "(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V", "a", "Lkotlin/text/Regex;", "c", "()Lkotlin/text/Regex;", "b", "getAllowedCharsRegex", "I", "d", "()I", "e", "f", "g", "h", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class PasswordSecurityLevel {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: f */
    public static final PasswordSecurityLevel f7292f = new PasswordSecurityLevel("LEVEL_1", 0, new Regex("^(?=.*\\d)(?=.*[a-zA-Z])[a-zA-Z\\d]{8,16}$"), new Regex("[a-zA-Z\\d]*"), R.string.psd_change_perform_l1, R.string.new_pwd_hint_l1);

    /* renamed from: g */
    public static final PasswordSecurityLevel f7293g = new PasswordSecurityLevel("LEVEL_2", 1, new Regex("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z\\d]{8,16}$"), new Regex("[a-zA-Z\\d]*"), R.string.psd_change_perform_l2, R.string.new_pwd_hint_l2);

    /* renamed from: h */
    public static final PasswordSecurityLevel f7294h = new PasswordSecurityLevel("LEVEL_3", 2, new Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[`~!@#\\$%^&*()_\\-+=|{}':;\",\\[\\].<>/?])[a-zA-Z\\d`~!@#\\$%^&*()_\\-+=|{}':;\",\\[\\].<>/?]{8,16}$"), new Regex("^[a-zA-Z0-9`~!@#$%^&*()_\\-+=|{}':;\",\\[\\].<>/?\\\\]*$"), R.string.psd_change_perform_l3, R.string.new_pwd_hint_l3);

    /* renamed from: i */
    public static final /* synthetic */ PasswordSecurityLevel[] f7295i;

    /* renamed from: j */
    public static final /* synthetic */ EnumEntries f7296j;

    /* renamed from: a, reason: from kotlin metadata */
    public final Regex regex;

    /* renamed from: b, reason: from kotlin metadata */
    public final Regex allowedCharsRegex;

    /* renamed from: c, reason: from kotlin metadata */
    public final int toastResId;

    /* renamed from: d, reason: from kotlin metadata */
    public final int placeholderResId;

    /* renamed from: com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PasswordSecurityLevel m6188a(int i6) {
            return i6 != 2 ? i6 != 3 ? PasswordSecurityLevel.f7292f : PasswordSecurityLevel.f7294h : PasswordSecurityLevel.f7293g;
        }

        public Companion() {
        }
    }

    static {
        PasswordSecurityLevel[] passwordSecurityLevelArrM6184a = m6184a();
        f7295i = passwordSecurityLevelArrM6184a;
        f7296j = EnumEntriesKt.enumEntries(passwordSecurityLevelArrM6184a);
        INSTANCE = new Companion(null);
    }

    public PasswordSecurityLevel(String str, int i6, Regex regex, Regex regex2, int i7, int i8) {
        this.regex = regex;
        this.allowedCharsRegex = regex2;
        this.toastResId = i7;
        this.placeholderResId = i8;
    }

    /* renamed from: a */
    public static final /* synthetic */ PasswordSecurityLevel[] m6184a() {
        return new PasswordSecurityLevel[]{f7292f, f7293g, f7294h};
    }

    public static PasswordSecurityLevel valueOf(String str) {
        return (PasswordSecurityLevel) Enum.valueOf(PasswordSecurityLevel.class, str);
    }

    public static PasswordSecurityLevel[] values() {
        return (PasswordSecurityLevel[]) f7295i.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getPlaceholderResId() {
        return this.placeholderResId;
    }

    /* renamed from: c, reason: from getter */
    public final Regex getRegex() {
        return this.regex;
    }

    /* renamed from: d, reason: from getter */
    public final int getToastResId() {
        return this.toastResId;
    }
}
