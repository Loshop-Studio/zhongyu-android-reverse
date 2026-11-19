package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.p014ui.text.input.KeyboardCapitalization;
import androidx.compose.p014ui.text.input.KeyboardType;
import androidx.compose.p014ui.text.input.PlatformImeOptions;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: classes.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m27989updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j10, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int iM33161getImeActioneUduSuo = imeOptions.m33161getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i10 = 3;
        int i11 = 6;
        if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33145getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i11 = 0;
            }
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33149getNoneeUduSuo())) {
            i11 = 1;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33147getGoeUduSuo())) {
            i11 = 2;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33148getNexteUduSuo())) {
            i11 = 5;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33150getPreviouseUduSuo())) {
            i11 = 7;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33151getSearcheUduSuo())) {
            i11 = 3;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33152getSendeUduSuo())) {
            i11 = 4;
        } else if (!ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33146getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i11;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int iM33162getKeyboardTypePjHm6EE = imeOptions.m33162getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33206getTextPjHm6EE())) {
            i10 = 1;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33199getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33202getNumberPjHm6EE())) {
            i10 = 2;
        } else if (!KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33205getPhonePjHm6EE())) {
            if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33208getUriPjHm6EE())) {
                i10 = 17;
            } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33201getEmailPjHm6EE())) {
                i10 = 33;
            } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33204getPasswordPjHm6EE())) {
                i10 = 129;
            } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33203getNumberPasswordPjHm6EE())) {
                i10 = 18;
            } else {
                if (!KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33200getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i10 = 8194;
            }
        }
        editorInfo.inputType = i10;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m33132equalsimpl0(imeOptions.m33161getImeActioneUduSuo(), companion.m33145getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM33160getCapitalizationIUNYP9k = imeOptions.m33160getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m33168equalsimpl0(iM33160getCapitalizationIUNYP9k, companion3.m33177getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m33168equalsimpl0(iM33160getCapitalizationIUNYP9k, companion3.m33181getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m33168equalsimpl0(iM33160getCapitalizationIUNYP9k, companion3.m33179getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m32966getStartimpl(j10);
        editorInfo.initialSelEnd = TextRange.m32961getEndimpl(j10);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m33185equalsimpl0(imeOptions.m33162getKeyboardTypePjHm6EE(), companion2.m33204getPasswordPjHm6EE()) || KeyboardType.m33185equalsimpl0(imeOptions.m33162getKeyboardTypePjHm6EE(), companion2.m33203getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m27990updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j10, ImeOptions imeOptions, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        m27989updatepLxbY9I(editorInfo, charSequence, j10, imeOptions, strArr);
    }
}
