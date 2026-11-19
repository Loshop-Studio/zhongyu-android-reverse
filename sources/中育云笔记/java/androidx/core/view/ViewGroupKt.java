package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import id.InterfaceC9624a;
import java.util.Iterator;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p296pd.InterfaceC10659g;

/* loaded from: classes2.dex */
public final class ViewGroupKt {

    /* renamed from: androidx.core.view.ViewGroupKt$iterator$1 */
    public static final class C35341 implements Iterator<View>, InterfaceC9624a {
        final /* synthetic */ ViewGroup $this_iterator;
        private int index;

        public C35341(ViewGroup viewGroup) {
            this.$this_iterator = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.$this_iterator;
            int i10 = this.index - 1;
            this.index = i10;
            viewGroup.removeViewAt(i10);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public View next() {
            ViewGroup viewGroup = this.$this_iterator;
            int i10 = this.index;
            this.index = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(ViewGroup viewGroup, View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, InterfaceC9540l interfaceC9540l) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            interfaceC9540l.invoke(viewGroup.getChildAt(i10));
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, InterfaceC9544p interfaceC9544p) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            interfaceC9544p.invoke(Integer.valueOf(i10), viewGroup.getChildAt(i10));
        }
    }

    public static final View get(ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }

    public static final InterfaceC10659g getChildren(final ViewGroup viewGroup) {
        return new InterfaceC10659g() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // p296pd.InterfaceC10659g
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final InterfaceC10659g getDescendants(final ViewGroup viewGroup) {
        return new InterfaceC10659g() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // p296pd.InterfaceC10659g
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), new InterfaceC9540l() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                    @Override // p181hd.InterfaceC9540l
                    public final Iterator<View> invoke(View view) {
                        InterfaceC10659g children;
                        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup2 == null || (children = ViewGroupKt.getChildren(viewGroup2)) == null) {
                            return null;
                        }
                        return children.iterator();
                    }
                });
            }
        };
    }

    public static final C10405j getIndices(ViewGroup viewGroup) {
        return AbstractC10410o.m21768u(0, viewGroup.getChildCount());
    }

    public static final int getSize(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        return new C35341(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i10) {
        marginLayoutParams.setMargins(i10, i10, i10, i10);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.leftMargin;
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.rightMargin;
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.getMarginStart();
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.getMarginEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }
}
