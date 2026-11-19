package com.zykj.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MenuKt;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/view/widget/LimitEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class LimitEditText extends AppCompatEditText {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LimitEditText(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ LimitEditText(Context context, AttributeSet attributeSet, int i, AbstractC5824e abstractC5824e) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LimitEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Object objM13956constructorimpl;
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        try {
            Field declaredField = LimitEditText.class.getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mDeviceProvisionedState");
            declaredField.setAccessible(true);
            declaredField.set(this, 1);
            objM13956constructorimpl = Result.m13956constructorimpl(C5443s.f8405a);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
        if (thM13959exceptionOrNullimpl != null) {
            Log.i("zzzz", String.valueOf(thM13959exceptionOrNullimpl));
        }
        setCustomInsertionActionModeCallback(new ActionMode.Callback() { // from class: com.zykj.view.widget.LimitEditText.3
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                List listM5287z = AbstractC5806u.m5287z("粘贴", "全选");
                if (menu == null) {
                    return true;
                }
                ArrayList arrayList = new ArrayList();
                for (MenuItem menuItem : MenuKt.getChildren(menu)) {
                    if (!AbstractC5805t.m5224d0(listM5287z, menuItem.getTitle())) {
                        arrayList.add(Integer.valueOf(menuItem.getItemId()));
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    menu.removeItem(((Number) obj).intValue());
                }
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode mode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }
        });
    }
}
