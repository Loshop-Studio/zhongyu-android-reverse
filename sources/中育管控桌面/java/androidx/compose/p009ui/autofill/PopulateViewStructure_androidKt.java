package androidx.compose.p009ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0001¨\u0006\u000b"}, m7880d2 = {"populate", "", "Landroid/view/ViewStructure;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "packageName", "", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nPopulateViewStructure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,192:1\n357#2,4:193\n329#2,6:197\n339#2,3:204\n342#2,9:208\n361#2:217\n357#2,4:218\n329#2,6:222\n339#2,3:229\n342#2,9:233\n361#2:242\n1399#3:203\n1270#3:207\n1399#3:228\n1270#3:232\n1#4:243\n34#5,6:244\n*S KotlinDebug\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n*L\n70#1:193,4\n70#1:197,6\n70#1:204,3\n70#1:208,9\n70#1:217\n93#1:218,4\n93#1:222,6\n93#1:229,3\n93#1:233,9\n93#1:242\n70#1:203\n70#1:207\n93#1:228\n93#1:232\n160#1:244,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[PHI: r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x0187: PHI (r21v6 androidx.compose.ui.autofill.ContentDataType) = (r21v5 androidx.compose.ui.autofill.ContentDataType), (r21v7 androidx.compose.ui.autofill.ContentDataType) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r22v6 boolean) = (r22v5 boolean), (r22v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r23v10 androidx.compose.ui.state.ToggleableState) = (r23v9 androidx.compose.ui.state.ToggleableState), (r23v11 androidx.compose.ui.state.ToggleableState) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r24v6 androidx.compose.ui.autofill.ContentType) = (r24v5 androidx.compose.ui.autofill.ContentType), (r24v7 androidx.compose.ui.autofill.ContentType) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r26v6 androidx.compose.ui.semantics.Role) = (r26v5 androidx.compose.ui.semantics.Role), (r26v7 androidx.compose.ui.semantics.Role) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r28v6 java.lang.Integer) = (r28v5 java.lang.Integer), (r28v7 java.lang.Integer) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r29v6 androidx.compose.ui.text.AnnotatedString) = (r29v5 androidx.compose.ui.text.AnnotatedString), (r29v7 androidx.compose.ui.text.AnnotatedString) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024a  */
    @androidx.annotation.RequiresApi(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void populate(final android.view.ViewStructure r38, androidx.compose.p009ui.semantics.SemanticsInfo r39, android.view.autofill.AutofillId r40, java.lang.String r41, androidx.compose.p009ui.spatial.RectManager r42) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p009ui.autofill.PopulateViewStructure_androidKt.populate(android.view.ViewStructure, androidx.compose.ui.semantics.SemanticsInfo, android.view.autofill.AutofillId, java.lang.String, androidx.compose.ui.spatial.RectManager):void");
    }
}
