package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.InterfaceC8469g;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
public final class MenuKt {

    /* renamed from: androidx.core.view.MenuKt$iterator$1 */
    public static final class C34971 implements Iterator<MenuItem>, InterfaceC10668a {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        public C34971(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            C8736p c8736p;
            Menu menu = this.$this_iterator;
            int i10 = this.index - 1;
            this.index = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                c8736p = C8736p.f16368a;
            } else {
                c8736p = null;
            }
            if (c8736p == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MenuItem next() {
            Menu menu = this.$this_iterator;
            int i10 = this.index;
            this.index = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC9133u.m16128b(menu.getItem(i10), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, InterfaceC10570l interfaceC10570l) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10570l.invoke(menu.getItem(i10));
        }
    }

    public static final void forEachIndexed(Menu menu, InterfaceC10574p interfaceC10574p) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10574p.invoke(Integer.valueOf(i10), menu.getItem(i10));
        }
    }

    public static final MenuItem get(Menu menu, int i10) {
        return menu.getItem(i10);
    }

    public static final InterfaceC8469g getChildren(final Menu menu) {
        return new InterfaceC8469g() { // from class: androidx.core.view.MenuKt$children$1
            @Override // p101f8.InterfaceC8469g
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new C34971(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i10) {
        C8736p c8736p;
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        if (c8736p == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
