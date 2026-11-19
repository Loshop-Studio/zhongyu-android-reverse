package p345t6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.magical.ViewParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11246a {

    /* renamed from: a */
    public static final List f26990a = new ArrayList();

    /* renamed from: a */
    public static void m25085a() {
        List list = f26990a;
        if (list.size() > 0) {
            list.clear();
        }
    }

    /* renamed from: b */
    public static void m25086b(List list, int i10, int i11, int i12) {
        if (i11 > 0) {
            while (i11 >= 1) {
                list.add(0, null);
                i11--;
            }
        }
        if (i12 < i10) {
            for (int i13 = (i10 - 1) - i12; i13 >= 1; i13--) {
                list.add(null);
            }
        }
    }

    /* renamed from: c */
    public static void m25087c(ViewGroup viewGroup, int i10) {
        int childCount;
        int count;
        int firstVisiblePosition;
        int lastVisiblePosition;
        ArrayList arrayList = new ArrayList();
        boolean z10 = viewGroup instanceof RecyclerView;
        if (z10) {
            childCount = ((RecyclerView) viewGroup).getChildCount();
        } else {
            if (!(viewGroup instanceof ListView)) {
                throw new IllegalArgumentException(viewGroup.getClass().getCanonicalName() + " Must be " + RecyclerView.class + " or " + ListView.class);
            }
            childCount = ((ListView) viewGroup).getChildCount();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        if (z10) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
            if (gridLayoutManager == null) {
                return;
            }
            count = gridLayoutManager.getItemCount();
            firstVisiblePosition = gridLayoutManager.findFirstVisibleItemPosition();
            lastVisiblePosition = gridLayoutManager.findLastVisibleItemPosition();
        } else {
            ListView listView = (ListView) viewGroup;
            ListAdapter adapter = listView.getAdapter();
            if (adapter == null) {
                return;
            }
            count = adapter.getCount();
            firstVisiblePosition = listView.getFirstVisiblePosition();
            lastVisiblePosition = listView.getLastVisiblePosition();
        }
        if (lastVisiblePosition > count) {
            lastVisiblePosition = count - 1;
        }
        m25086b(arrayList, count, firstVisiblePosition, lastVisiblePosition);
        f26990a.clear();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            View view = (View) arrayList.get(i12);
            ViewParams viewParams = new ViewParams();
            if (view == null) {
                viewParams.m9464b(0);
                viewParams.m9465c(0);
                viewParams.m9466g(0);
                viewParams.m9463a(0);
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                viewParams.m9464b(iArr[0]);
                viewParams.m9465c(iArr[1] - i10);
                viewParams.m9466g(view.getWidth());
                viewParams.m9463a(view.getHeight());
            }
            f26990a.add(viewParams);
        }
    }

    /* renamed from: d */
    public static ViewParams m25088d(int i10) {
        List list = f26990a;
        if (list.size() > i10) {
            return (ViewParams) list.get(i10);
        }
        return null;
    }
}
