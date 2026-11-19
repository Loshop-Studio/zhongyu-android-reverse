package androidx.compose.p013ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends ViewAdapter> T getOrAddAdapter(View view, int i10, InterfaceC10559a interfaceC10559a) {
        ViewAdapter viewAdapter;
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i11);
            if (viewAdapter.getId() == i10) {
                break;
            }
            i11++;
        }
        T t10 = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) interfaceC10559a.invoke();
        viewAdapter2.getAdapters().add(t11);
        return t11;
    }

    public static final MergedViewAdapter getViewAdapter(View view) {
        int i10 = viewAdaptersKey;
        Object tag = view.getTag(i10);
        MergedViewAdapter mergedViewAdapter = tag instanceof MergedViewAdapter ? (MergedViewAdapter) tag : null;
        if (mergedViewAdapter != null) {
            return mergedViewAdapter;
        }
        MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
        view.setTag(i10, mergedViewAdapter2);
        return mergedViewAdapter2;
    }

    public static final MergedViewAdapter getViewAdapterIfExists(View view) {
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(String str) {
        return str.hashCode() | 50331648;
    }
}
