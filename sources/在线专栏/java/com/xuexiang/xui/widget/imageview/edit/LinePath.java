package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
class LinePath {
    private final Paint mDrawPaint;
    private final Path mDrawPath;

    LinePath(Path path, Paint paint) {
        this.mDrawPaint = new Paint(paint);
        this.mDrawPath = new Path(path);
    }

    Paint getDrawPaint() {
        return this.mDrawPaint;
    }

    Path getDrawPath() {
        return this.mDrawPath;
    }
}
