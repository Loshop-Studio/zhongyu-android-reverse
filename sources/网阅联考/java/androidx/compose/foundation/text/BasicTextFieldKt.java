package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.p006ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\"\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010$\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010&\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010'¨\u0006("}, m5175d2 = {"BasicTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,390:1\n25#2:391\n25#2:398\n50#2:405\n49#2:406\n36#2:413\n67#2,3:420\n66#2:423\n25#2:430\n50#2:437\n49#2:438\n25#2:445\n25#2:452\n1114#3,6:392\n1114#3,6:399\n1114#3,6:407\n1114#3,6:414\n1114#3,6:424\n1114#3,6:431\n1114#3,6:439\n1114#3,6:446\n1114#3,6:453\n76#4:459\n102#4,2:460\n76#4:462\n102#4,2:463\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n137#1:391\n144#1:398\n150#1:405\n150#1:406\n159#1:413\n163#1:420,3\n163#1:423\n283#1:430\n290#1:437\n290#1:438\n327#1:445\n367#1:452\n137#1:392,6\n144#1:399,6\n150#1:407,6\n159#1:414,6\n163#1:424,6\n283#1:431,6\n290#1:439,6\n327#1:446,6\n367#1:453,6\n144#1:459\n144#1:460,2\n159#1:462\n159#1:463,2\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final java.lang.String r41, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r42, androidx.compose.p006ui.Modifier r43, boolean r44, boolean r45, androidx.compose.p006ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, int r51, androidx.compose.p006ui.text.input.VisualTransformation r52, kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.text.TextLayoutResult, kotlin.Unit> r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, androidx.compose.p006ui.graphics.Brush r55, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.p006ui.text.input.TextFieldValue r37, final kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.text.input.TextFieldValue, kotlin.Unit> r38, androidx.compose.p006ui.Modifier r39, boolean r40, boolean r41, androidx.compose.p006ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.p006ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.text.TextLayoutResult, kotlin.Unit> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.p006ui.graphics.Brush r51, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r38, final kotlin.jvm.functions.Function1 r39, androidx.compose.p006ui.Modifier r40, boolean r41, boolean r42, androidx.compose.p006ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, androidx.compose.p006ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1 r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.p006ui.graphics.Brush r51, kotlin.jvm.functions.Function3 r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.p006ui.text.input.TextFieldValue r38, final kotlin.jvm.functions.Function1 r39, androidx.compose.p006ui.Modifier r40, boolean r41, boolean r42, androidx.compose.p006ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, androidx.compose.p006ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1 r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.p006ui.graphics.Brush r51, kotlin.jvm.functions.Function3 r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
