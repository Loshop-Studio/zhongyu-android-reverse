package androidx.compose.p014ui.text.font;

/* loaded from: classes2.dex */
public final class FontSynthesis_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m33098synthesizeTypefaceFxwP2eA(int r5, java.lang.Object r6, androidx.compose.p014ui.text.font.Font r7, androidx.compose.p014ui.text.font.FontWeight r8, int r9) {
        /*
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r6
        L5:
            boolean r0 = androidx.compose.p014ui.text.font.FontSynthesis.m33091isWeightOnimpl$ui_text_release(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L33
            androidx.compose.ui.text.font.FontWeight r0 = r7.getWeight()
            boolean r0 = kotlin.jvm.internal.AbstractC9979u.m20289b(r0, r8)
            if (r0 != 0) goto L33
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.p014ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r3 = androidx.compose.p014ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r0)
            int r3 = r8.compareTo(r3)
            if (r3 < 0) goto L33
            androidx.compose.ui.text.font.FontWeight r3 = r7.getWeight()
            androidx.compose.ui.text.font.FontWeight r0 = androidx.compose.p014ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r0)
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L33
            r0 = r2
            goto L34
        L33:
            r0 = r1
        L34:
            boolean r5 = androidx.compose.p014ui.text.font.FontSynthesis.m33090isStyleOnimpl$ui_text_release(r5)
            if (r5 == 0) goto L46
            int r5 = r7.mo33030getStyle_LCdwA()
            boolean r5 = androidx.compose.p014ui.text.font.FontStyle.m33077equalsimpl0(r9, r5)
            if (r5 != 0) goto L46
            r5 = r2
            goto L47
        L46:
            r5 = r1
        L47:
            if (r5 != 0) goto L4c
            if (r0 != 0) goto L4c
            return r6
        L4c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L6c
            if (r5 == 0) goto L61
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.p014ui.text.font.FontStyle.Companion
            int r5 = r5.m33083getItalic_LCdwA()
            boolean r5 = androidx.compose.p014ui.text.font.FontStyle.m33077equalsimpl0(r9, r5)
            if (r5 == 0) goto L61
            r1 = r2
        L61:
            int r5 = androidx.compose.p014ui.text.font.AndroidFontUtils_androidKt.getAndroidTypefaceStyle(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L6c:
            if (r0 == 0) goto L73
            int r8 = r8.getWeight()
            goto L7b
        L73:
            androidx.compose.ui.text.font.FontWeight r8 = r7.getWeight()
            int r8 = r8.getWeight()
        L7b:
            if (r5 == 0) goto L88
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.p014ui.text.font.FontStyle.Companion
            int r5 = r5.m33083getItalic_LCdwA()
            boolean r5 = androidx.compose.p014ui.text.font.FontStyle.m33077equalsimpl0(r9, r5)
            goto L96
        L88:
            int r5 = r7.mo33030getStyle_LCdwA()
            androidx.compose.ui.text.font.FontStyle$Companion r7 = androidx.compose.p014ui.text.font.FontStyle.Companion
            int r7 = r7.m33083getItalic_LCdwA()
            boolean r5 = androidx.compose.p014ui.text.font.FontStyle.m33077equalsimpl0(r5, r7)
        L96:
            androidx.compose.ui.text.font.TypefaceHelperMethodsApi28 r7 = androidx.compose.p014ui.text.font.TypefaceHelperMethodsApi28.INSTANCE
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = r7.create(r6, r8, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.font.FontSynthesis_androidKt.m33098synthesizeTypefaceFxwP2eA(int, java.lang.Object, androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.FontWeight, int):java.lang.Object");
    }
}
