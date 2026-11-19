package androidx.compose.p012ui.layout;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13413d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,159:1\n155#1:160\n158#1:164\n155#1:168\n158#1:172\n57#2:161\n61#2:165\n57#2:169\n61#2:173\n57#2:176\n61#2:179\n60#3:162\n70#3:166\n60#3:170\n70#3:174\n60#3:177\n70#3:180\n22#4:163\n22#4:167\n22#4:171\n22#4:175\n22#4:178\n22#4:181\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n*L\n143#1:160\n144#1:164\n149#1:168\n150#1:172\n143#1:161\n144#1:165\n149#1:169\n150#1:173\n155#1:176\n158#1:179\n143#1:162\n144#1:166\n149#1:170\n150#1:174\n155#1:177\n158#1:180\n143#1:163\n144#1:167\n149#1:171\n150#1:175\n155#1:178\n158#1:181\n*E\n"})
/* loaded from: classes2.dex */
public final class ContentScaleKt {
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    private static final float m22753computeFillHeightiLBOSCw(long j9, long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m22754computeFillMaxDimensioniLBOSCw(long j9, long j10) {
        return Math.max(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m22755computeFillMinDimensioniLBOSCw(long j9, long j10) {
        return Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    private static final float m22756computeFillWidthiLBOSCw(long j9, long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32));
    }
}
