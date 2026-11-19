package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.KeyboardCapitalization;
import androidx.compose.p013ui.text.input.KeyboardType;
import androidx.compose.p013ui.text.input.PlatformImeOptions;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: classes.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m21387updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j10, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int iM26559getImeActioneUduSuo = imeOptions.m26559getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i10 = 3;
        int i11 = 6;
        if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26543getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i11 = 0;
            }
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26547getNoneeUduSuo())) {
            i11 = 1;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26545getGoeUduSuo())) {
            i11 = 2;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26546getNexteUduSuo())) {
            i11 = 5;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26548getPreviouseUduSuo())) {
            i11 = 7;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26549getSearcheUduSuo())) {
            i11 = 3;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26550getSendeUduSuo())) {
            i11 = 4;
        } else if (!ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26544getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i11;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int iM26560getKeyboardTypePjHm6EE = imeOptions.m26560getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26604getTextPjHm6EE())) {
            i10 = 1;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26597getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26600getNumberPjHm6EE())) {
            i10 = 2;
        } else if (!KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26603getPhonePjHm6EE())) {
            if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26606getUriPjHm6EE())) {
                i10 = 17;
            } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26599getEmailPjHm6EE())) {
                i10 = 33;
            } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26602getPasswordPjHm6EE())) {
                i10 = 129;
            } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26601getNumberPasswordPjHm6EE())) {
                i10 = 18;
            } else {
                if (!KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26598getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i10 = 8194;
            }
        }
        editorInfo.inputType = i10;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m26530equalsimpl0(imeOptions.m26559getImeActioneUduSuo(), companion.m26543getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM26558getCapitalizationIUNYP9k = imeOptions.m26558getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m26566equalsimpl0(iM26558getCapitalizationIUNYP9k, companion3.m26575getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m26566equalsimpl0(iM26558getCapitalizationIUNYP9k, companion3.m26579getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m26566equalsimpl0(iM26558getCapitalizationIUNYP9k, companion3.m26577getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m26364getStartimpl(j10);
        editorInfo.initialSelEnd = TextRange.m26359getEndimpl(j10);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m26583equalsimpl0(imeOptions.m26560getKeyboardTypePjHm6EE(), companion2.m26602getPasswordPjHm6EE()) || KeyboardType.m26583equalsimpl0(imeOptions.m26560getKeyboardTypePjHm6EE(), companion2.m26601getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m21388updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j10, ImeOptions imeOptions, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        m21387updatepLxbY9I(editorInfo, charSequence, j10, imeOptions, strArr);
    }
}
