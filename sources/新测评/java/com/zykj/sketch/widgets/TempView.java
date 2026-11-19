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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0015J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m13558d2 = {"Lcom/zykj/sketch/widgets/TempView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "rectConvertRegion", "Landroid/graphics/Region;", "path", "Landroid/graphics/Path;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class TempView extends View {
    public Map<Integer, View> _$_findViewCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
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
        Intrinsics.checkNotNullParameter(path, "path");
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(path, new Region(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom)));
        return region;
    }
}
