package androidx.compose.p013ui.window;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SecureFlagPolicy {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ SecureFlagPolicy[] $VALUES;
    public static final SecureFlagPolicy Inherit = new SecureFlagPolicy("Inherit", 0);
    public static final SecureFlagPolicy SecureOn = new SecureFlagPolicy("SecureOn", 1);
    public static final SecureFlagPolicy SecureOff = new SecureFlagPolicy("SecureOff", 2);

    private static final /* synthetic */ SecureFlagPolicy[] $values() {
        return new SecureFlagPolicy[]{Inherit, SecureOn, SecureOff};
    }

    static {
        SecureFlagPolicy[] secureFlagPolicyArr$values = $values();
        $VALUES = secureFlagPolicyArr$values;
        $ENTRIES = AbstractC9108a.m16085a(secureFlagPolicyArr$values);
    }

    private SecureFlagPolicy(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) $VALUES.clone();
    }
}
