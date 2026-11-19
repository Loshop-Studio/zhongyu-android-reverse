package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    private Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m21199consumeZmokQxo(KeyEvent keyEvent) {
        int iM25359getUtf16CodePointZmokQxo = KeyEvent_androidKt.m25359getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & iM25359getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(iM25359getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(iM25359getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM25359getUtf16CodePointZmokQxo));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iM25359getUtf16CodePointZmokQxo) : num2;
    }
}
