package com.zykj.sketch.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class TempView extends View {
    public Map<Integer, View> _$_findViewCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        }
        Paint paint = new Paint();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStrokeWidth(15.0f);
        Path path = new Path();
        path.moveTo(10.0f, 10.0f);
        path.lineTo(20.0f, 20.0f);
        path.lineTo(30.0f, 30.0f);
        path.lineTo(40.0f, 40.0f);
        path.lineTo(200.0f, 200.0f);
        Path path2 = new Path();
        path.offset(0.0f, 1.0f, path2);
        path.addPath(path2);
        path2.close();
        RegionIterator regionIterator = new RegionIterator(rectConvertRegion(path));
        Rect rect = new Rect();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        while (regionIterator.next(rect)) {
            if (canvas != null) {
                canvas.drawRect(rect, paint);
            }
        }
        super.onDraw(canvas);
    }

    public final Region rectConvertRegion(Path path) {
        AbstractC9979u.m20294g(path, "path");
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(path, new Region(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom)));
        return region;
    }
}
