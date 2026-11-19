package androidx.compose.p013ui.input.pointer;

/* loaded from: classes2.dex */
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m25564constructorimpl(0);
    }

    /* renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m25462getAreAnyPressedaHzCxE(int i10) {
        return i10 != 0;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m25463indexOfFirstPressedaHzCxE(int i10) {
        if (i10 == 0) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); (i12 & 1) == 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m25464indexOfLastPressedaHzCxE(int i10) {
        int i11 = -1;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); i12 != 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m25465isAltGraphPressed5xRPYO0(int i10) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m25466isAltPressed5xRPYO0(int i10) {
        return (i10 & 2) != 0;
    }

    /* renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m25467isBackPressedaHzCxE(int i10) {
        return (i10 & 8) != 0;
    }

    /* renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m25468isCapsLockOn5xRPYO0(int i10) {
        return (i10 & 1048576) != 0;
    }

    /* renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m25469isCtrlPressed5xRPYO0(int i10) {
        return (i10 & 4096) != 0;
    }

    /* renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m25470isForwardPressedaHzCxE(int i10) {
        return (i10 & 16) != 0;
    }

    /* renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m25471isFunctionPressed5xRPYO0(int i10) {
        return (i10 & 8) != 0;
    }

    /* renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m25472isMetaPressed5xRPYO0(int i10) {
        return (i10 & 65536) != 0;
    }

    /* renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m25473isNumLockOn5xRPYO0(int i10) {
        return (i10 & 2097152) != 0;
    }

    /* renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m25474isPressedbNIWhpI(int i10, int i11) {
        return i11 != 0 ? i11 != 1 ? (i11 == 2 || i11 == 3 || i11 == 4) ? (i10 & (1 << i11)) != 0 : (i10 & (1 << (i11 + 2))) != 0 : m25477isSecondaryPressedaHzCxE(i10) : m25475isPrimaryPressedaHzCxE(i10);
    }

    /* renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m25475isPrimaryPressedaHzCxE(int i10) {
        return (i10 & 33) != 0;
    }

    /* renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m25476isScrollLockOn5xRPYO0(int i10) {
        return (i10 & 4194304) != 0;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m25477isSecondaryPressedaHzCxE(int i10) {
        return (i10 & 66) != 0;
    }

    /* renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m25478isShiftPressed5xRPYO0(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m25479isSymPressed5xRPYO0(int i10) {
        return (i10 & 4) != 0;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m25480isTertiaryPressedaHzCxE(int i10) {
        return (i10 & 4) != 0;
    }
}
