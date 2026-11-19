package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:125:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27773BasicText4YKlhWE(final androidx.compose.p014ui.text.AnnotatedString r27, androidx.compose.p014ui.Modifier r28, androidx.compose.p014ui.text.TextStyle r29, p181hd.InterfaceC9540l r30, int r31, boolean r32, int r33, java.util.Map r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27773BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27775BasicTextBpD7jsM(final java.lang.String r23, androidx.compose.p014ui.Modifier r24, androidx.compose.p014ui.text.TextStyle r25, p181hd.InterfaceC9540l r26, int r27, boolean r28, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27775BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-CL7eQgs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27776BasicTextCL7eQgs(androidx.compose.p014ui.text.AnnotatedString r37, androidx.compose.p014ui.Modifier r38, androidx.compose.p014ui.text.TextStyle r39, p181hd.InterfaceC9540l r40, int r41, boolean r42, int r43, int r44, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r45, androidx.compose.p014ui.graphics.ColorProducer r46, androidx.compose.foundation.text.TextAutoSize r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27776BasicTextCL7eQgs(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[PHI: r21
      0x011b: PHI (r21v15 int) = (r21v4 int), (r21v10 int), (r21v11 int) binds: [B:100:0x0119, B:110:0x0136, B:109:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27778BasicTextRWo7tUw(java.lang.String r38, androidx.compose.p014ui.Modifier r39, androidx.compose.p014ui.text.TextStyle r40, p181hd.InterfaceC9540l r41, int r42, boolean r43, int r44, int r45, androidx.compose.p014ui.graphics.ColorProducer r46, androidx.compose.foundation.text.TextAutoSize r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27778BasicTextRWo7tUw(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27780BasicTextVhcvRP8(final java.lang.String r26, androidx.compose.p014ui.Modifier r27, androidx.compose.p014ui.text.TextStyle r28, p181hd.InterfaceC9540l r29, int r30, boolean r31, int r32, int r33, androidx.compose.p014ui.graphics.ColorProducer r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27780BasicTextVhcvRP8(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final AnnotatedString BasicText_CL7eQgs$lambda$5(MutableState<AnnotatedString> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27781LayoutWithLinksAndInlineContent11Od_4g(final androidx.compose.p014ui.Modifier r29, androidx.compose.p014ui.text.AnnotatedString r30, final p181hd.InterfaceC9540l r31, final boolean r32, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r33, final androidx.compose.p014ui.text.TextStyle r34, final int r35, final boolean r36, final int r37, final int r38, final androidx.compose.ui.text.font.FontFamily.Resolver r39, final androidx.compose.foundation.text.modifiers.SelectionController r40, final androidx.compose.p014ui.graphics.ColorProducer r41, final p181hd.InterfaceC9540l r42, final androidx.compose.foundation.text.TextAutoSize r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27781LayoutWithLinksAndInlineContent11Od_4g(androidx.compose.ui.Modifier, androidx.compose.ui.text.AnnotatedString, hd.l, boolean, java.util.Map, androidx.compose.ui.text.TextStyle, int, boolean, int, int, androidx.compose.ui.text.font.FontFamily$Resolver, androidx.compose.foundation.text.modifiers.SelectionController, androidx.compose.ui.graphics.ColorProducer, hd.l, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<Placeable, InterfaceC9529a>> measureWithTextRangeMeasureConstraints(List<? extends Measurable> list, InterfaceC9529a interfaceC9529a) {
        if (!((Boolean) interfaceC9529a.invoke()).booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Measurable measurable = list.get(i10);
            Object parentData = measurable.getParentData();
            AbstractC9979u.m20292e(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult textRangeLayoutMeasureResultMeasure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
            arrayList.add(new Pair(measurable.mo32229measureBRTryo0(Constraints.Companion.m33463fitPrioritizingWidthZbe2FdA(textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getHeight(), textRangeLayoutMeasureResultMeasure.getHeight())), textRangeLayoutMeasureResultMeasure.getPlace()));
        }
        return arrayList;
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SaverScope) obj, ((Number) obj2).longValue());
            }

            public final Long invoke(SaverScope saverScope, long j10) {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j10)) {
                    return Long.valueOf(j10);
                }
                return null;
            }
        }, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final Long invoke(long j10) {
                return Long.valueOf(j10);
            }
        });
    }

    /* renamed from: textModifier-CL7eQgs, reason: not valid java name */
    private static final Modifier m27783textModifierCL7eQgs(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, InterfaceC9540l interfaceC9540l3, TextAutoSize textAutoSize) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, interfaceC9540l, i10, z10, i11, i12, list, interfaceC9540l2, null, colorProducer, textAutoSize, interfaceC9540l3, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, interfaceC9540l, i10, z10, i11, i12, list, interfaceC9540l2, selectionController, colorProducer, textAutoSize, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27774BasicText4YKlhWE(final java.lang.String r25, androidx.compose.p014ui.Modifier r26, androidx.compose.p014ui.text.TextStyle r27, p181hd.InterfaceC9540l r28, int r29, boolean r30, int r31, int r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27774BasicText4YKlhWE(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27779BasicTextVhcvRP8(final androidx.compose.p014ui.text.AnnotatedString r28, androidx.compose.p014ui.Modifier r29, androidx.compose.p014ui.text.TextStyle r30, p181hd.InterfaceC9540l r31, int r32, boolean r33, int r34, int r35, java.util.Map r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27779BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27777BasicTextRWo7tUw(final androidx.compose.p014ui.text.AnnotatedString r29, androidx.compose.p014ui.Modifier r30, androidx.compose.p014ui.text.TextStyle r31, p181hd.InterfaceC9540l r32, int r33, boolean r34, int r35, int r36, java.util.Map r37, androidx.compose.p014ui.graphics.ColorProducer r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m27777BasicTextRWo7tUw(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, hd.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }
}
