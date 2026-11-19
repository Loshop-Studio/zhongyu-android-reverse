package com.zykj.camera.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zykj.camera.AnswerSheetNative;
import com.zykj.camera.R$id;
import com.zykj.camera.R$layout;
import java.util.ArrayList;
import p099g5.AbstractC7531f;
import p110h5.C7629a;

/* loaded from: classes4.dex */
public class AnswerSheetView extends AbstractC7531f {
    public AnswerSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // p099g5.AbstractAsyncTaskC7530e.a
    /* renamed from: a */
    public C7629a mo8634a(byte[] bArr, int i10, int i11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Log.e("processData", "拍照完成");
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Matrix matrix = new Matrix();
        Camera.getCameraInfo(0, new Camera.CameraInfo());
        matrix.postRotate(r0.orientation);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
        bitmapDecodeByteArray.recycle();
        Log.e("processData", "旋转90°");
        Log.e("AnswerSheetView", "decodeByteArray times-->" + (System.currentTimeMillis() - jCurrentTimeMillis));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Point[] pointArr = new Point[100];
        Bitmap[] bitmapArr = new Bitmap[1];
        int iNativePreScanImageInfo = AnswerSheetNative.nativePreScanImageInfo(bitmapCreateBitmap, getLimitRectF(), pointArr, bitmapArr);
        Log.e("AnswerSheetView", "识别四个定位点 times-->" + (System.currentTimeMillis() - jCurrentTimeMillis2));
        Log.e("AnswerSheetView", ">>>>count=" + iNativePreScanImageInfo);
        C7629a c7629a = iNativePreScanImageInfo == 4 ? new C7629a(true, iNativePreScanImageInfo, bitmapCreateBitmap, bitmapCreateBitmap, pointArr, -1L, -1) : new C7629a(false, iNativePreScanImageInfo, bitmapCreateBitmap, bitmapArr[0], pointArr, -1L, -1);
        Log.e("AnswerSheetView", "times-->" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return c7629a;
    }

    public RectF[] getLimitRectF() {
        int width = getWidth();
        int height = getHeight();
        RectF[] rectFArr = new RectF[4];
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f12454g.findViewById(R$id.view1));
        arrayList.add(this.f12454g.findViewById(R$id.view2));
        arrayList.add(this.f12454g.findViewById(R$id.view3));
        arrayList.add(this.f12454g.findViewById(R$id.view4));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view = (View) arrayList.get(i10);
            float f10 = width;
            float f11 = height;
            rectFArr[i10] = new RectF(view.getLeft() / f10, view.getTop() / f11, view.getRight() / f10, view.getBottom() / f11);
        }
        return rectFArr;
    }

    @Override // p099g5.AbstractC7531f
    public View getTipsView() {
        return LayoutInflater.from(getContext()).inflate(R$layout.camera_scan_box_tips, (ViewGroup) null);
    }

    /* renamed from: r */
    public final void m8635r() {
    }

    public AnswerSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m8635r();
    }
}
