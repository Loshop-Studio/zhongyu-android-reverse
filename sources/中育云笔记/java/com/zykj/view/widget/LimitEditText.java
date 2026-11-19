package com.zykj.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.MenuKt;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes6.dex */
public final class LimitEditText extends AppCompatEditText {

    /* renamed from: com.zykj.view.widget.LimitEditText$a */
    public static final class ActionModeCallbackC8893a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            List listM24139q = AbstractC10978w.m24139q("粘贴", "全选");
            if (menu == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            for (MenuItem menuItem : MenuKt.getChildren(menu)) {
                if (!AbstractC10947g0.m23932e0(listM24139q, menuItem.getTitle())) {
                    arrayList.add(Integer.valueOf(menuItem.getItemId()));
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                menu.removeItem(((Number) obj).intValue());
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LimitEditText(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC9979u.m20294g(context, "context");
    }

    public /* synthetic */ LimitEditText(Context context, AttributeSet attributeSet, int i10, AbstractC9972n abstractC9972n) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitEditText(Context context, AttributeSet attributeSet) {
        Object objM20054c;
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
        try {
            Result.C9921a c9921a = Result.f23263d;
            Field declaredField = LimitEditText.class.getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mDeviceProvisionedState");
            declaredField.setAccessible(true);
            declaredField.set(this, 1);
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            Log.i("zzzz", String.valueOf(thM20056e));
        }
        setCustomInsertionActionModeCallback(new ActionModeCallbackC8893a());
    }
}
