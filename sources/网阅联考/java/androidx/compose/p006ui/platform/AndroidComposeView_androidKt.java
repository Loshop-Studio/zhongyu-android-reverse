package androidx.compose.p006ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.compose.p006ui.InternalComposeUiApi;
import androidx.compose.p006ui.text.input.PlatformTextInputService;
import androidx.compose.p006ui.text.input.TextInputService;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002\u001a!\u0010\u001b\u001a\u00020\u001c*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m5175d2 = {"textInputServiceFactory", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputServiceFactory$annotations", "()V", "getTextInputServiceFactory", "()Lkotlin/jvm/functions/Function1;", "setTextInputServiceFactory", "(Lkotlin/jvm/functions/Function1;)V", "localeLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "layoutDirectionFromInt", "layoutDirection", "preTransform", "", "other", "preTransform-JiSxe2E", "([F[F)V", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,1941:1\n42#2,2:1942\n42#2,2:1944\n42#2,2:1946\n42#2,2:1948\n42#2,2:1950\n42#2,2:1952\n42#2,2:1954\n42#2,2:1956\n42#2,2:1958\n42#2,2:1960\n42#2,2:1962\n42#2,2:1964\n42#2,2:1966\n42#2,2:1968\n42#2,2:1970\n42#2,2:1972\n39#2:1974\n39#2:1975\n39#2:1976\n39#2:1977\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n1838#1:1942,2\n1839#1:1944,2\n1840#1:1946,2\n1841#1:1948,2\n1842#1:1950,2\n1843#1:1952,2\n1844#1:1954,2\n1845#1:1956,2\n1846#1:1958,2\n1847#1:1960,2\n1848#1:1962,2\n1849#1:1964,2\n1850#1:1966,2\n1851#1:1968,2\n1852#1:1970,2\n1853#1:1972,2\n1858#1:1974\n1859#1:1975\n1860#1:1976\n1861#1:1977\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static Function1<? super PlatformTextInputService, ? extends TextInputService> textInputServiceFactory = new Function1<PlatformTextInputService, TextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$textInputServiceFactory$1
        @Override // kotlin.jvm.functions.Function1
        public final TextInputService invoke(PlatformTextInputService it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new TextInputService(it);
        }
    };

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m10849dotp89u6pk(float[] fArr, int i4, float[] fArr2, int i5) {
        int i6 = i4 * 4;
        return (fArr[i6 + 0] * fArr2[0 + i5]) + (fArr[i6 + 1] * fArr2[4 + i5]) + (fArr[i6 + 2] * fArr2[8 + i5]) + (fArr[i6 + 3] * fArr2[12 + i5]);
    }

    public static final LayoutDirection getLocaleLayoutDirection(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    public static final Function1<PlatformTextInputService, TextInputService> getTextInputServiceFactory() {
        return textInputServiceFactory;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getTextInputServiceFactory$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i4) {
        return i4 != 0 ? i4 != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl : LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m10850preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM10849dotp89u6pk = m10849dotp89u6pk(fArr2, 0, fArr, 0);
        float fM10849dotp89u6pk2 = m10849dotp89u6pk(fArr2, 0, fArr, 1);
        float fM10849dotp89u6pk3 = m10849dotp89u6pk(fArr2, 0, fArr, 2);
        float fM10849dotp89u6pk4 = m10849dotp89u6pk(fArr2, 0, fArr, 3);
        float fM10849dotp89u6pk5 = m10849dotp89u6pk(fArr2, 1, fArr, 0);
        float fM10849dotp89u6pk6 = m10849dotp89u6pk(fArr2, 1, fArr, 1);
        float fM10849dotp89u6pk7 = m10849dotp89u6pk(fArr2, 1, fArr, 2);
        float fM10849dotp89u6pk8 = m10849dotp89u6pk(fArr2, 1, fArr, 3);
        float fM10849dotp89u6pk9 = m10849dotp89u6pk(fArr2, 2, fArr, 0);
        float fM10849dotp89u6pk10 = m10849dotp89u6pk(fArr2, 2, fArr, 1);
        float fM10849dotp89u6pk11 = m10849dotp89u6pk(fArr2, 2, fArr, 2);
        float fM10849dotp89u6pk12 = m10849dotp89u6pk(fArr2, 2, fArr, 3);
        float fM10849dotp89u6pk13 = m10849dotp89u6pk(fArr2, 3, fArr, 0);
        float fM10849dotp89u6pk14 = m10849dotp89u6pk(fArr2, 3, fArr, 1);
        float fM10849dotp89u6pk15 = m10849dotp89u6pk(fArr2, 3, fArr, 2);
        float fM10849dotp89u6pk16 = m10849dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM10849dotp89u6pk;
        fArr[1] = fM10849dotp89u6pk2;
        fArr[2] = fM10849dotp89u6pk3;
        fArr[3] = fM10849dotp89u6pk4;
        fArr[4] = fM10849dotp89u6pk5;
        fArr[5] = fM10849dotp89u6pk6;
        fArr[6] = fM10849dotp89u6pk7;
        fArr[7] = fM10849dotp89u6pk8;
        fArr[8] = fM10849dotp89u6pk9;
        fArr[9] = fM10849dotp89u6pk10;
        fArr[10] = fM10849dotp89u6pk11;
        fArr[11] = fM10849dotp89u6pk12;
        fArr[12] = fM10849dotp89u6pk13;
        fArr[13] = fM10849dotp89u6pk14;
        fArr[14] = fM10849dotp89u6pk15;
        fArr[15] = fM10849dotp89u6pk16;
    }

    public static final void setTextInputServiceFactory(Function1<? super PlatformTextInputService, ? extends TextInputService> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        textInputServiceFactory = function1;
    }
}
