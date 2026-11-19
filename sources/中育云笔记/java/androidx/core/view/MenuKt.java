package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p296pd.InterfaceC10659g;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class MenuKt {

    /* renamed from: androidx.core.view.MenuKt$iterator$1 */
    public static final class C35271 implements Iterator<MenuItem>, InterfaceC9624a {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        public C35271(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            C10786q c10786q;
            Menu menu = this.$this_iterator;
            int i10 = this.index - 1;
            this.index = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                c10786q = C10786q.f26013a;
            } else {
                c10786q = null;
            }
            if (c10786q == null) {
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
            if (AbstractC9979u.m20289b(menu.getItem(i10), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, InterfaceC9540l interfaceC9540l) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9540l.invoke(menu.getItem(i10));
        }
    }

    public static final void forEachIndexed(Menu menu, InterfaceC9544p interfaceC9544p) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9544p.invoke(Integer.valueOf(i10), menu.getItem(i10));
        }
    }

    public static final MenuItem get(Menu menu, int i10) {
        return menu.getItem(i10);
    }

    public static final InterfaceC10659g getChildren(final Menu menu) {
        return new InterfaceC10659g() { // from class: androidx.core.view.MenuKt$children$1
            @Override // p296pd.InterfaceC10659g
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
        return new C35271(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i10) {
        C10786q c10786q;
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            c10786q = C10786q.f26013a;
        } else {
            c10786q = null;
        }
        if (c10786q == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
