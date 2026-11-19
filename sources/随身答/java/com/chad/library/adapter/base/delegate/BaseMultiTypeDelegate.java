package com.chad.library.adapter.base.delegate;

import android.util.SparseIntArray;
import androidx.annotation.LayoutRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\b\u0001\u0010\u000e\u001a\u00020\u000f\"\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u001e\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00020\u000bH&J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m13413d2 = {"Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "", "layouts", "Landroid/util/SparseIntArray;", "(Landroid/util/SparseIntArray;)V", "autoMode", "", "selfMode", "addItemType", "type", "", "layoutResId", "addItemTypeAutoIncrease", "layoutResIds", "", "checkMode", "", "mode", "getItemType", "data", "", RequestParameters.POSITION, "getLayoutId", "viewType", "registerItemType", "com.github.CymChad.brvah"}, m13414k = 1, m13415mv = {1, 6, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseMultiTypeDelegate<T> {
    private boolean autoMode;
    private SparseIntArray layouts;
    private boolean selfMode;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiTypeDelegate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void checkMode(boolean mode) {
        if (mode) {
            throw new IllegalArgumentException("Don't mess two register mode");
        }
    }

    private final void registerItemType(int type, @LayoutRes int layoutResId) {
        this.layouts.put(type, layoutResId);
    }

    public final BaseMultiTypeDelegate<T> addItemType(int type, @LayoutRes int layoutResId) {
        this.selfMode = true;
        checkMode(this.autoMode);
        registerItemType(type, layoutResId);
        return this;
    }

    public final BaseMultiTypeDelegate<T> addItemTypeAutoIncrease(@LayoutRes int... layoutResIds) {
        Intrinsics.checkNotNullParameter(layoutResIds, "layoutResIds");
        this.autoMode = true;
        checkMode(this.selfMode);
        int length = layoutResIds.length;
        for (int i9 = 0; i9 < length; i9++) {
            registerItemType(i9, layoutResIds[i9]);
        }
        return this;
    }

    public abstract int getItemType(List<? extends T> data, int position);

    public final int getLayoutId(int viewType) {
        int i9 = this.layouts.get(viewType);
        if (i9 != 0) {
            return i9;
        }
        throw new IllegalArgumentException(("ViewType: " + viewType + " found layoutResId，please use registerItemType() first!").toString());
    }

    public BaseMultiTypeDelegate(SparseIntArray layouts) {
        Intrinsics.checkNotNullParameter(layouts, "layouts");
        this.layouts = layouts;
    }

    public /* synthetic */ BaseMultiTypeDelegate(SparseIntArray sparseIntArray, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? new SparseIntArray() : sparseIntArray);
    }
}
