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
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;

/* loaded from: classes5.dex */
public final class LimitEditText extends AppCompatEditText {

    /* renamed from: com.zykj.view.widget.LimitEditText$a */
    public static final class ActionModeCallbackC8261a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            List listM14774q = AbstractC8809v.m14774q("粘贴", "全选");
            if (menu == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            for (MenuItem menuItem : MenuKt.getChildren(menu)) {
                if (!AbstractC8778f0.m14556d0(listM14774q, menuItem.getTitle())) {
                    arrayList.add(Integer.valueOf(menuItem.getItemId()));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                menu.removeItem(((Number) it.next()).intValue());
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitEditText(Context context, AttributeSet attributeSet) {
        Object objM15909b;
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        try {
            Result.C9076a c9076a = Result.f17350b;
            Field declaredField = LimitEditText.class.getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mDeviceProvisionedState");
            declaredField.setAccessible(true);
            declaredField.set(this, 1);
            objM15909b = Result.m15909b(C8736p.f16368a);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        Throwable thM15911d = Result.m15911d(objM15909b);
        if (thM15911d != null) {
            Log.i("zzzz", String.valueOf(thM15911d));
        }
        setCustomInsertionActionModeCallback(new ActionModeCallbackC8261a());
    }
}
