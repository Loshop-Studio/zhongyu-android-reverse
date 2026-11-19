package androidx.compose.p013ui.graphics;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.InterfaceC8317b;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class IntervalTree<T> {
    public IntervalTree<T>.Node root;
    public final ArrayList<IntervalTree<T>.Node> stack;
    public final IntervalTree<T>.Node terminator;

    public final class Node extends Interval<T> {
        private int color;
        private IntervalTree<T>.Node left;
        private float max;
        private float min;
        private IntervalTree<T>.Node parent;
        private IntervalTree<T>.Node right;

        public Node(float f10, float f11, T t10, int i10) {
            super(f10, f11, t10);
            this.color = i10;
            this.min = f10;
            this.max = f11;
            IntervalTree<T>.Node node = IntervalTree.this.terminator;
            this.left = node;
            this.right = node;
            this.parent = node;
        }

        public final int getColor() {
            return this.color;
        }

        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final float getMax() {
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        public final IntervalTree<T>.Node lowestNode() {
            Node node = this;
            while (true) {
                IntervalTree<T>.Node node2 = node.left;
                if (node2 == IntervalTree.this.terminator) {
                    return node;
                }
                node = node2;
            }
        }

        public final IntervalTree<T>.Node next() {
            IntervalTree<T>.Node node = this.right;
            if (node != IntervalTree.this.terminator) {
                return node.lowestNode();
            }
            IntervalTree<T>.Node node2 = this.parent;
            Node node3 = this;
            while (node2 != IntervalTree.this.terminator && node3 == node2.right) {
                node3 = node2;
                node2 = node2.parent;
            }
            return node2;
        }

        public final void setColor(int i10) {
            this.color = i10;
        }

        public final void setLeft(IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final void setMax(float f10) {
            this.max = f10;
        }

        public final void setMin(float f10) {
            this.min = f10;
        }

        public final void setParent(IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final void setRight(IntervalTree<T>.Node node) {
            this.right = node;
        }
    }

    /* renamed from: androidx.compose.ui.graphics.IntervalTree$iterator$1 */
    public static final class C26791 implements Iterator<Interval<T>>, InterfaceC10668a {
        private IntervalTree<T>.Node next;
        final /* synthetic */ IntervalTree<T> this$0;

        public C26791(IntervalTree<T> intervalTree) {
            this.this$0 = intervalTree;
            this.next = intervalTree.root.lowestNode();
        }

        public final IntervalTree<T>.Node getNext() {
            return this.next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != this.this$0.terminator;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNext(IntervalTree<T>.Node node) {
            this.next = node;
        }

        @Override // java.util.Iterator
        public Interval<T> next() {
            IntervalTree<T>.Node node = this.next;
            this.next = node.next();
            return node;
        }
    }

    public IntervalTree() {
        IntervalTree<T>.Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.terminator = node;
        this.root = node;
        this.stack = new ArrayList<>();
    }

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree intervalTree, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return intervalTree.findFirstOverlap(f10, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, InterfaceC8317b interfaceC8317b, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(interfaceC8317b, list);
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(IntervalTree intervalTree, float f10, float f11, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        IntervalTree<T>.Node node = intervalTree.root;
        if (node != intervalTree.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = intervalTree.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(f10, f11)) {
                    interfaceC10570l.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != intervalTree.terminator && nodeRemove.getLeft().getMax() >= f10) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != intervalTree.terminator && nodeRemove.getRight().getMin() <= f11) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    private final void rebalance(IntervalTree<T>.Node node) {
        while (node != this.root && node.getParent().getColor() == 0) {
            IntervalTree<T>.Node parent = node.getParent().getParent();
            if (node.getParent() == parent.getLeft()) {
                IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.setColor(1);
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    node = parent;
                } else {
                    if (node == node.getParent().getRight()) {
                        node = node.getParent();
                        rotateLeft(node);
                    }
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    rotateRight(parent);
                }
            } else {
                IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.setColor(1);
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    node = parent;
                } else {
                    if (node == node.getParent().getLeft()) {
                        node = node.getParent();
                        rotateRight(node);
                    }
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    rotateLeft(parent);
                }
            }
        }
        this.root.setColor(1);
    }

    private final void rotateLeft(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node right = node.getRight();
        node.setRight(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().setParent(node);
        }
        right.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = right;
        } else if (node.getParent().getLeft() == node) {
            node.getParent().setLeft(right);
        } else {
            node.getParent().setRight(right);
        }
        right.setLeft(node);
        node.setParent(right);
        updateNodeData(node);
    }

    private final void rotateRight(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node left = node.getLeft();
        node.setLeft(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().setParent(node);
        }
        left.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = left;
        } else if (node.getParent().getRight() == node) {
            node.getParent().setRight(left);
        } else {
            node.getParent().setLeft(left);
        }
        left.setRight(node);
        node.setParent(left);
        updateNodeData(node);
    }

    private final void updateNodeData(IntervalTree<T>.Node node) {
        while (node != this.terminator) {
            node.setMin(Math.min(node.getStart(), Math.min(node.getLeft().getMin(), node.getRight().getMin())));
            node.setMax(Math.max(node.getEnd(), Math.max(node.getLeft().getMax(), node.getRight().getMax())));
            node = node.getParent();
        }
    }

    public final void addInterval(float f10, float f11, T t10) {
        IntervalTree<T>.Node node = new Node(f10, f11, t10, 0);
        IntervalTree<T>.Node node2 = this.terminator;
        for (IntervalTree<T>.Node left = this.root; left != this.terminator; left = node.getStart() <= left.getStart() ? left.getLeft() : left.getRight()) {
            node2 = left;
        }
        node.setParent(node2);
        if (node2 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node2.getStart()) {
            node2.setLeft(node);
        } else {
            node2.setRight(node);
        }
        updateNodeData(node);
        rebalance(node);
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final boolean contains(float f10) {
        return findFirstOverlap(f10, f10) != IntervalTreeKt.getEmptyInterval();
    }

    public final Interval<T> findFirstOverlap(InterfaceC8317b interfaceC8317b) {
        return findFirstOverlap(((Number) interfaceC8317b.getStart()).floatValue(), ((Number) interfaceC8317b.getEndInclusive()).floatValue());
    }

    public final List<Interval<T>> findOverlaps(InterfaceC8317b interfaceC8317b, List<Interval<T>> list) {
        return findOverlaps(((Number) interfaceC8317b.getStart()).floatValue(), ((Number) interfaceC8317b.getEndInclusive()).floatValue(), list);
    }

    public final void forEach$ui_graphics_release(InterfaceC8317b interfaceC8317b, InterfaceC10570l interfaceC10570l) {
        float fFloatValue = ((Number) interfaceC8317b.getStart()).floatValue();
        float fFloatValue2 = ((Number) interfaceC8317b.getEndInclusive()).floatValue();
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(fFloatValue, fFloatValue2)) {
                    interfaceC10570l.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= fFloatValue) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= fFloatValue2) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final Iterator<Interval<T>> iterator() {
        return new C26791(this);
    }

    public final void plusAssign(Interval<T> interval) {
        addInterval(interval.getStart(), interval.getEnd(), interval.getData());
    }

    public final boolean contains(InterfaceC8317b interfaceC8317b) {
        return findFirstOverlap(((Number) interfaceC8317b.getStart()).floatValue(), ((Number) interfaceC8317b.getEndInclusive()).floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    public final Interval<T> findFirstOverlap(float f10, float f11) {
        IntervalTree<T>.Node node = this.root;
        IntervalTree<T>.Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(f10, f11)) {
                    return nodeRemove;
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= f10) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= f11) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
        Interval<T> interval = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        AbstractC9133u.m16131e(interval, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return interval;
    }

    public final List<Interval<T>> findOverlaps(float f10, float f11, List<Interval<T>> list) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(f10, f11)) {
                    list.add(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= f10) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= f11) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, float f10, float f11, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        if ((i10 & 4) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(f10, f11, list);
    }

    public final void forEach$ui_graphics_release(float f10, float f11, InterfaceC10570l interfaceC10570l) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(f10, f11)) {
                    interfaceC10570l.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= f10) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= f11) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }
}
