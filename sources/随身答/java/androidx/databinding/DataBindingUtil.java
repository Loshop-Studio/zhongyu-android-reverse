package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class DataBindingUtil {
    private static DataBinderMapper sMapper = new DataBinderMapperImpl();
    private static DataBindingComponent sDefaultComponent = null;

    private DataBindingUtil() {
    }

    @Nullable
    public static <T extends ViewDataBinding> T bind(@NonNull View view) {
        return (T) bind(view, sDefaultComponent);
    }

    private static <T extends ViewDataBinding> T bindToAddedViews(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i9, int i10) {
        int childCount = viewGroup.getChildCount();
        int i11 = childCount - i9;
        if (i11 == 1) {
            return (T) bind(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i10);
        }
        View[] viewArr = new View[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            viewArr[i12] = viewGroup.getChildAt(i12 + i9);
        }
        return (T) bind(dataBindingComponent, viewArr, i10);
    }

    @Nullable
    public static String convertBrIdToString(int i9) {
        return sMapper.convertBrIdToString(i9);
    }

    @Nullable
    public static <T extends ViewDataBinding> T findBinding(@NonNull View view) {
        while (view != null) {
            T t9 = (T) ViewDataBinding.getBinding(view);
            if (t9 != null) {
                return t9;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    if (cCharAt == '/') {
                        if (iIndexOf == -1) {
                            return null;
                        }
                    } else if (cCharAt == '-' && iIndexOf != -1 && str.indexOf(47, iIndexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @Nullable
    public static <T extends ViewDataBinding> T getBinding(@NonNull View view) {
        return (T) ViewDataBinding.getBinding(view);
    }

    @Nullable
    public static DataBindingComponent getDefaultComponent() {
        return sDefaultComponent;
    }

    public static <T extends ViewDataBinding> T inflate(@NonNull LayoutInflater layoutInflater, int i9, @Nullable ViewGroup viewGroup, boolean z9) {
        return (T) inflate(layoutInflater, i9, viewGroup, z9, sDefaultComponent);
    }

    public static <T extends ViewDataBinding> T setContentView(@NonNull Activity activity, int i9) {
        return (T) setContentView(activity, i9, sDefaultComponent);
    }

    public static void setDefaultComponent(@Nullable DataBindingComponent dataBindingComponent) {
        sDefaultComponent = dataBindingComponent;
    }

    @Nullable
    public static <T extends ViewDataBinding> T bind(@NonNull View view, DataBindingComponent dataBindingComponent) {
        T t9 = (T) getBinding(view);
        if (t9 != null) {
            return t9;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int layoutId = sMapper.getLayoutId((String) tag);
        if (layoutId != 0) {
            return (T) sMapper.getDataBinder(dataBindingComponent, view, layoutId);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    public static <T extends ViewDataBinding> T inflate(@NonNull LayoutInflater layoutInflater, int i9, @Nullable ViewGroup viewGroup, boolean z9, @Nullable DataBindingComponent dataBindingComponent) {
        boolean z10 = viewGroup != null && z9;
        return z10 ? (T) bindToAddedViews(dataBindingComponent, viewGroup, z10 ? viewGroup.getChildCount() : 0, i9) : (T) bind(dataBindingComponent, layoutInflater.inflate(i9, viewGroup, z9), i9);
    }

    public static <T extends ViewDataBinding> T setContentView(@NonNull Activity activity, int i9, @Nullable DataBindingComponent dataBindingComponent) {
        activity.setContentView(i9);
        return (T) bindToAddedViews(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i9);
    }

    public static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View[] viewArr, int i9) {
        return (T) sMapper.getDataBinder(dataBindingComponent, viewArr, i9);
    }

    public static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View view, int i9) {
        return (T) sMapper.getDataBinder(dataBindingComponent, view, i9);
    }
}
