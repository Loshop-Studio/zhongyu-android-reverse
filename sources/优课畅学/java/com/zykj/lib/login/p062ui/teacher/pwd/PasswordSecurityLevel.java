package com.zykj.lib.login.p062ui.teacher.pwd;

import com.zykj.lib.login.R$string;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.text.Regex;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PasswordSecurityLevel {

    /* renamed from: e */
    public static final C7353a f10084e;

    /* renamed from: f */
    public static final PasswordSecurityLevel f10085f = new PasswordSecurityLevel("LEVEL_1", 0, new Regex("^(?=.*\\d)(?=.*[a-zA-Z])[a-zA-Z\\d]{8,16}$"), new Regex("[a-zA-Z\\d]*"), R$string.psd_change_perform_l1, R$string.new_pwd_hint_l1);

    /* renamed from: g */
    public static final PasswordSecurityLevel f10086g = new PasswordSecurityLevel("LEVEL_2", 1, new Regex("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z\\d]{8,16}$"), new Regex("[a-zA-Z\\d]*"), R$string.psd_change_perform_l2, R$string.new_pwd_hint_l2);

    /* renamed from: h */
    public static final PasswordSecurityLevel f10087h = new PasswordSecurityLevel("LEVEL_3", 2, new Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[`~!@#\\$%^&*()_\\-+=|{}':;\",\\[\\].<>/?])[a-zA-Z\\d`~!@#\\$%^&*()_\\-+=|{}':;\",\\[\\].<>/?]{8,16}$"), new Regex("^[a-zA-Z0-9`~!@#$%^&*()_\\-+=|{}':;\",\\[\\].<>/?\\\\]*$"), R$string.psd_change_perform_l3, R$string.new_pwd_hint_l3);

    /* renamed from: i */
    public static final /* synthetic */ PasswordSecurityLevel[] f10088i;

    /* renamed from: j */
    public static final /* synthetic */ InterfaceC9760a f10089j;

    /* renamed from: a */
    public final Regex f10090a;

    /* renamed from: b */
    public final Regex f10091b;

    /* renamed from: c */
    public final int f10092c;

    /* renamed from: d */
    public final int f10093d;

    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.PasswordSecurityLevel$a */
    public static final class C7353a {
        public /* synthetic */ C7353a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final PasswordSecurityLevel m9366a(int i10) {
            return i10 != 2 ? i10 != 3 ? PasswordSecurityLevel.f10085f : PasswordSecurityLevel.f10087h : PasswordSecurityLevel.f10086g;
        }

        public C7353a() {
        }
    }

    static {
        PasswordSecurityLevel[] passwordSecurityLevelArrM9362a = m9362a();
        f10088i = passwordSecurityLevelArrM9362a;
        f10089j = AbstractC9108a.m16085a(passwordSecurityLevelArrM9362a);
        f10084e = new C7353a(null);
    }

    public PasswordSecurityLevel(String str, int i10, Regex regex, Regex regex2, int i11, int i12) {
        this.f10090a = regex;
        this.f10091b = regex2;
        this.f10092c = i11;
        this.f10093d = i12;
    }

    /* renamed from: a */
    public static final /* synthetic */ PasswordSecurityLevel[] m9362a() {
        return new PasswordSecurityLevel[]{f10085f, f10086g, f10087h};
    }

    public static PasswordSecurityLevel valueOf(String str) {
        return (PasswordSecurityLevel) Enum.valueOf(PasswordSecurityLevel.class, str);
    }

    public static PasswordSecurityLevel[] values() {
        return (PasswordSecurityLevel[]) f10088i.clone();
    }

    /* renamed from: b */
    public final int m9363b() {
        return this.f10093d;
    }

    /* renamed from: c */
    public final Regex m9364c() {
        return this.f10090a;
    }

    /* renamed from: d */
    public final int m9365d() {
        return this.f10092c;
    }
}
