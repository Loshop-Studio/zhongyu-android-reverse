package com.zykj.sketch.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.listener.IControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/ViewGraph;", "Lcom/zykj/sketch/core/graph/BoundedContainerGraph;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "compressImage", "Landroid/graphics/Bitmap;", "image", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class ViewGraph extends BoundedContainerGraph {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGraph(@NotNull IControl control) {
        super(control);
        AbstractC5830k.m5330g(control, "control");
    }

    @Nullable
    public final Bitmap compressImage(@NotNull Bitmap image) {
        AbstractC5830k.m5330g(image, "image");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 5, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
    }
}
