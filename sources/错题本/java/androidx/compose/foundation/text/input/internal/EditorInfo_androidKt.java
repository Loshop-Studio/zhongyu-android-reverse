package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.PlatformImeOptions;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m5110d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "", "contentMimeTypes", "Ld6/s;", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "update", "", "bits", "flag", "", "hasFlag", "(II)Z", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/EditorInfo_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
/* loaded from: classes.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i, int i8) {
        return (i & i8) == i8;
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m7793updatepLxbY9I(@NotNull EditorInfo editorInfo, @NotNull CharSequence charSequence, long j7, @NotNull ImeOptions imeOptions, @Nullable String[] strArr) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 3;
        int i8 = 6;
        if (ImeAction.m12936equalsimpl0(imeAction, companion.m12949getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i8 = 0;
            }
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12953getNoneeUduSuo())) {
            i8 = 1;
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12951getGoeUduSuo())) {
            i8 = 2;
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12952getNexteUduSuo())) {
            i8 = 5;
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12954getPreviouseUduSuo())) {
            i8 = 7;
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12955getSearcheUduSuo())) {
            i8 = 3;
        } else if (ImeAction.m12936equalsimpl0(imeAction, companion.m12956getSendeUduSuo())) {
            i8 = 4;
        } else if (!ImeAction.m12936equalsimpl0(imeAction, companion.m12950getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i8;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13010getTextPjHm6EE())) {
            i = 1;
        } else if (KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13003getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i = 1;
        } else if (KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13006getNumberPjHm6EE())) {
            i = 2;
        } else if (!KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13009getPhonePjHm6EE())) {
            if (KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13012getUriPjHm6EE())) {
                i = 17;
            } else if (KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13005getEmailPjHm6EE())) {
                i = 33;
            } else if (KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13008getPasswordPjHm6EE())) {
                i = 129;
            } else if (KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13007getNumberPasswordPjHm6EE())) {
                i = 18;
            } else {
                if (!KeyboardType.m12989equalsimpl0(keyboardType, companion2.m13004getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i = 8194;
            }
        }
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m12936equalsimpl0(imeOptions.getImeAction(), companion.m12949getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m12972equalsimpl0(capitalization, companion3.m12981getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m12972equalsimpl0(capitalization, companion3.m12985getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m12972equalsimpl0(capitalization, companion3.m12983getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m12770getStartimpl(j7);
        editorInfo.initialSelEnd = TextRange.m12765getEndimpl(j7);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m12989equalsimpl0(imeOptions.getKeyboardType(), companion2.m13008getPasswordPjHm6EE()) || KeyboardType.m12989equalsimpl0(imeOptions.getKeyboardType(), companion2.m13007getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m7794updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j7, ImeOptions imeOptions, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        m7793updatepLxbY9I(editorInfo, charSequence, j7, imeOptions, strArr);
    }
}
