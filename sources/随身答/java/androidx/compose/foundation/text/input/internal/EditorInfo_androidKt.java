package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.input.ImeAction;
import androidx.compose.p012ui.text.input.ImeOptions;
import androidx.compose.p012ui.text.input.KeyboardCapitalization;
import androidx.compose.p012ui.text.input.KeyboardType;
import androidx.compose.p012ui.text.input.PlatformImeOptions;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a@\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m13413d2 = {"hasFlag", "", "bits", "", "flag", "update", "", "Landroid/view/inputmethod/EditorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "contentMimeTypes", "", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/EditorInfo_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
/* loaded from: classes.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i9, int i10) {
        return (i9 & i10) == i10;
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m18617updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j9, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i9 = 3;
        int i10 = 6;
        if (ImeAction.m23626equalsimpl0(imeAction, companion.m23639getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (ImeAction.m23626equalsimpl0(imeAction, companion.m23643getNoneeUduSuo())) {
            i10 = 1;
        } else if (ImeAction.m23626equalsimpl0(imeAction, companion.m23641getGoeUduSuo())) {
            i10 = 2;
        } else if (ImeAction.m23626equalsimpl0(imeAction, companion.m23642getNexteUduSuo())) {
            i10 = 5;
        } else if (ImeAction.m23626equalsimpl0(imeAction, companion.m23644getPreviouseUduSuo())) {
            i10 = 7;
        } else if (ImeAction.m23626equalsimpl0(imeAction, companion.m23645getSearcheUduSuo())) {
            i10 = 3;
        } else if (ImeAction.m23626equalsimpl0(imeAction, companion.m23646getSendeUduSuo())) {
            i10 = 4;
        } else if (!ImeAction.m23626equalsimpl0(imeAction, companion.m23640getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23700getTextPjHm6EE())) {
            i9 = 1;
        } else if (KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23693getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i9 = 1;
        } else if (KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23696getNumberPjHm6EE())) {
            i9 = 2;
        } else if (!KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23699getPhonePjHm6EE())) {
            if (KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23702getUriPjHm6EE())) {
                i9 = 17;
            } else if (KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23695getEmailPjHm6EE())) {
                i9 = 33;
            } else if (KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23698getPasswordPjHm6EE())) {
                i9 = 129;
            } else if (KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23697getNumberPasswordPjHm6EE())) {
                i9 = 18;
            } else {
                if (!KeyboardType.m23679equalsimpl0(keyboardType, companion2.m23694getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i9 = 8194;
            }
        }
        editorInfo.inputType = i9;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m23626equalsimpl0(imeOptions.getImeAction(), companion.m23639getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m23662equalsimpl0(capitalization, companion3.m23671getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m23662equalsimpl0(capitalization, companion3.m23675getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m23662equalsimpl0(capitalization, companion3.m23673getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m23460getStartimpl(j9);
        editorInfo.initialSelEnd = TextRange.m23455getEndimpl(j9);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m23679equalsimpl0(imeOptions.getKeyboardType(), companion2.m23698getPasswordPjHm6EE()) || KeyboardType.m23679equalsimpl0(imeOptions.getKeyboardType(), companion2.m23697getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m18618updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j9, ImeOptions imeOptions, String[] strArr, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            strArr = null;
        }
        m18617updatepLxbY9I(editorInfo, charSequence, j9, imeOptions, strArr);
    }
}
