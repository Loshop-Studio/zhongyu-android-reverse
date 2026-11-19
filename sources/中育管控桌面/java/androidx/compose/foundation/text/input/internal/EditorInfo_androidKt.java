package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.p009ui.text.TextRange;
import androidx.compose.p009ui.text.input.ImeAction;
import androidx.compose.p009ui.text.input.ImeOptions;
import androidx.compose.p009ui.text.input.KeyboardCapitalization;
import androidx.compose.p009ui.text.input.KeyboardType;
import androidx.compose.p009ui.text.input.PlatformImeOptions;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a@\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m7880d2 = {"hasFlag", "", "bits", "", "flag", "update", "", "Landroid/view/inputmethod/EditorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "contentMimeTypes", "", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/EditorInfo_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
/* loaded from: classes.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i6, int i7) {
        return (i6 & i7) == i7;
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m11107updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j6, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i6 = 3;
        int i7 = 6;
        if (ImeAction.m16116equalsimpl0(imeAction, companion.m16129getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i7 = 0;
            }
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16133getNoneeUduSuo())) {
            i7 = 1;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16131getGoeUduSuo())) {
            i7 = 2;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16132getNexteUduSuo())) {
            i7 = 5;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16134getPreviouseUduSuo())) {
            i7 = 7;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16135getSearcheUduSuo())) {
            i7 = 3;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16136getSendeUduSuo())) {
            i7 = 4;
        } else if (!ImeAction.m16116equalsimpl0(imeAction, companion.m16130getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i7;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16190getTextPjHm6EE())) {
            i6 = 1;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16183getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i6 = 1;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16186getNumberPjHm6EE())) {
            i6 = 2;
        } else if (!KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16189getPhonePjHm6EE())) {
            if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16192getUriPjHm6EE())) {
                i6 = 17;
            } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16185getEmailPjHm6EE())) {
                i6 = 33;
            } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16188getPasswordPjHm6EE())) {
                i6 = 129;
            } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16187getNumberPasswordPjHm6EE())) {
                i6 = 18;
            } else {
                if (!KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16184getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i6 = 8194;
            }
        }
        editorInfo.inputType = i6;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m16116equalsimpl0(imeOptions.getImeAction(), companion.m16129getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m16152equalsimpl0(capitalization, companion3.m16161getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m16152equalsimpl0(capitalization, companion3.m16165getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m16152equalsimpl0(capitalization, companion3.m16163getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m15950getStartimpl(j6);
        editorInfo.initialSelEnd = TextRange.m15945getEndimpl(j6);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m16169equalsimpl0(imeOptions.getKeyboardType(), companion2.m16188getPasswordPjHm6EE()) || KeyboardType.m16169equalsimpl0(imeOptions.getKeyboardType(), companion2.m16187getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m11108updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j6, ImeOptions imeOptions, String[] strArr, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            strArr = null;
        }
        m11107updatepLxbY9I(editorInfo, charSequence, j6, imeOptions, strArr);
    }
}
