package com.zykj.camera;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(m13556bv = {1, 0, 3}, m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0087 ¢\u0006\u0002\u0010\u000bJP\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0087 ¢\u0006\u0002\u0010\u0011JF\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bH\u0087 ¢\u0006\u0002\u0010\u0016J\u008e\u0001\u0010\u0017\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b2\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b2\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\b2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0087 ¢\u0006\u0002\u0010\u001dJ\u009e\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b2\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b2\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\b2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0087 ¢\u0006\u0002\u0010#Jf\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0087 ¢\u0006\u0002\u0010&¨\u0006'"}, m13558d2 = {"Lcom/zykj/camera/AnswerSheetNative;", "", "()V", "nativeCutImage", "", "srcBitmap", "Landroid/graphics/Bitmap;", "outPoints", "", "Landroid/graphics/Point;", "previewBitmap", "(Landroid/graphics/Bitmap;[Landroid/graphics/Point;Landroid/graphics/Bitmap;)I", "nativeGetAnswerSheetIds", "points", "configJson", "", "pages", "(Landroid/graphics/Bitmap;[Landroid/graphics/Point;Ljava/lang/String;[Ljava/lang/String;Landroid/graphics/Bitmap;)I", "nativePreScanImageInfo", "limitRect", "Landroid/graphics/RectF;", "previewBitmaps", "(Landroid/graphics/Bitmap;[Landroid/graphics/RectF;[Landroid/graphics/Point;[Landroid/graphics/Bitmap;)I", "nativeScanAnswerSheet", "page", "choicesStr", "choicesRatio", "blankBitmaps", "summaryBitmaps", "(Landroid/graphics/Bitmap;[Landroid/graphics/Point;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;[Landroid/graphics/Bitmap;[Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)I", "nativeScanAnswerSheetEx", "tfModelBuffer", "", "bufferSize", "", "([BJLandroid/graphics/Bitmap;[Landroid/graphics/Point;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;[Landroid/graphics/Bitmap;[Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)I", "nativeScanAnswerSheetInChoice", "", "([BJLandroid/graphics/Bitmap;[Landroid/graphics/Point;Ljava/lang/String;I[Ljava/lang/String;Landroid/graphics/Bitmap;)Z", "camera_release"}, m13559k = 1, m13560mv = {1, 1, 15})
/* loaded from: classes4.dex */
public final class AnswerSheetNative {

    /* renamed from: a */
    public static final AnswerSheetNative f8576a = new AnswerSheetNative();

    static {
        System.loadLibrary("answer_sheet");
    }

    @JvmStatic
    public static final native int nativeCutImage(Bitmap srcBitmap, Point[] outPoints, Bitmap previewBitmap);

    @JvmStatic
    public static final native int nativeGetAnswerSheetIds(Bitmap srcBitmap, Point[] points, String configJson, String[] pages, Bitmap previewBitmap);

    @JvmStatic
    public static final native int nativePreScanImageInfo(Bitmap srcBitmap, RectF[] limitRect, Point[] outPoints, Bitmap[] previewBitmaps);

    @Deprecated(message = "选择识别准确率低")
    @JvmStatic
    public static final native int nativeScanAnswerSheet(Bitmap srcBitmap, Point[] points, String configJson, int page, String[] choicesStr, String[] choicesRatio, Bitmap[] blankBitmaps, Bitmap[] summaryBitmaps, Bitmap previewBitmap);

    @Deprecated(message = "主观题框选位置准确率低，添加调整逻辑，框选逻辑外置")
    @JvmStatic
    public static final native int nativeScanAnswerSheetEx(byte[] tfModelBuffer, long bufferSize, Bitmap srcBitmap, Point[] points, String configJson, int page, String[] choicesStr, String[] choicesRatio, Bitmap[] blankBitmaps, Bitmap[] summaryBitmaps, Bitmap previewBitmap);

    @JvmStatic
    public static final native boolean nativeScanAnswerSheetInChoice(byte[] tfModelBuffer, long bufferSize, Bitmap srcBitmap, Point[] points, String configJson, int page, String[] choicesStr, Bitmap previewBitmap);
}
