package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    private Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m27801consumeZmokQxo(KeyEvent keyEvent) {
        int iM31961getUtf16CodePointZmokQxo = KeyEvent_androidKt.m31961getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & iM31961getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(iM31961getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(iM31961getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM31961getUtf16CodePointZmokQxo));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iM31961getUtf16CodePointZmokQxo) : num2;
    }
}
