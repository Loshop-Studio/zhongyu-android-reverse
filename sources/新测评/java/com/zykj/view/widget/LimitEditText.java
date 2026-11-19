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
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"Lcom/zykj/view/widget/LimitEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class LimitEditText extends AppCompatEditText {

    /* renamed from: com.zykj.view.widget.LimitEditText$a */
    public static final class ActionModeCallbackC7270a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"粘贴", "全选"});
            if (menu == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            for (MenuItem menuItem : MenuKt.getChildren(menu)) {
                if (!CollectionsKt.contains(listListOf, menuItem.getTitle())) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LimitEditText(Context context, AttributeSet attributeSet) {
        Object objM24299constructorimpl;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = LimitEditText.class.getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mDeviceProvisionedState");
            declaredField.setAccessible(true);
            declaredField.set(this, 1);
            objM24299constructorimpl = Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24302exceptionOrNullimpl = Result.m24302exceptionOrNullimpl(objM24299constructorimpl);
        if (thM24302exceptionOrNullimpl != null) {
            Log.i("zzzz", String.valueOf(thM24302exceptionOrNullimpl));
        }
        setCustomInsertionActionModeCallback(new ActionModeCallbackC7270a());
    }
}
