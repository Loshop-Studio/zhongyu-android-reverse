package com.zykj.sketch.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.zykj.sketch.core.listener.IControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public abstract class ViewGraph extends BoundedContainerGraph {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGraph(IControl control) {
        super(control);
        AbstractC9979u.m20294g(control, "control");
    }

    public final Bitmap compressImage(Bitmap image) {
        AbstractC9979u.m20294g(image, "image");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 5, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
    }
}
