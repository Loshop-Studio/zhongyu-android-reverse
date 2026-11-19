package androidx.compose.p011ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6560a;
import p200x6.C6751a;
import p200x6.InterfaceC6752b;

@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\u0010\u0010\n\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0010\u0010\n\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\f\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0010\u0010\n\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0004J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0017J=\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00182\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0018¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00182\u0006\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0018¢\u0006\u0004\b\u001a\u0010\u001cJ8\u0010!\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\u00070\u001dH\u0080\b¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\u00070\u001dH\u0080\b¢\u0006\u0004\b\u001f\u0010\"J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u001e\u0010%\u001a\u00020$2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\u0002¢\u0006\u0004\b%\u0010'J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120(H\u0086\u0002¢\u0006\u0004\b)\u0010*J\u001e\u0010+\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b.\u0010/R\u001e\u00100\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00102\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b2\u00101R8\u00105\u001a&\u0012\u000e\u0012\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u000003j\u0012\u0012\u000e\u0012\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000`48\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m5110d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Landroidx/compose/ui/graphics/IntervalTree$Node;", TypedValues.AttributesType.S_TARGET, "Ld6/s;", "rebalance", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "node", "rotateLeft", "rotateRight", "updateNodeData", "clear", "Lx6/b;", "", "interval", "Landroidx/compose/ui/graphics/Interval;", "findFirstOverlap", "(Lx6/b;)Landroidx/compose/ui/graphics/Interval;", "start", "end", "(FF)Landroidx/compose/ui/graphics/Interval;", "", "results", "findOverlaps", "(Lx6/b;Ljava/util/List;)Ljava/util/List;", "(FFLjava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "block", "forEach$ui_graphics_release", "(Lx6/b;Lr6/c;)V", "forEach", "(FFLr6/c;)V", "value", "", "contains", "(F)Z", "(Lx6/b;)Z", "", "iterator", "()Ljava/util/Iterator;", "plusAssign", "(Landroidx/compose/ui/graphics/Interval;)V", "data", "addInterval", "(FFLjava/lang/Object;)V", "terminator", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "root", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "stack", "Ljava/util/ArrayList;", "Node", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,380:1\n152#1,16:381\n152#1,16:397\n152#1,16:413\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n111#1:381,16\n137#1:397,16\n145#1:413,16\n*E\n"})
/* loaded from: classes.dex */
public final class IntervalTree<T> {

    @JvmField
    @NotNull
    public IntervalTree<T>.Node root;

    @JvmField
    @NotNull
    public final ArrayList<IntervalTree<T>.Node> stack;

    @JvmField
    @NotNull
    public final IntervalTree<T>.Node terminator;

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tJ\u0010\u0010\"\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0010\u0010#\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fR\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R$\u0010\u001f\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013¨\u0006$"}, m5110d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "start", "", "end", "data", TypedValues.Custom.S_COLOR, "", "Landroidx/compose/ui/graphics/TreeColor;", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;I)V", "getColor", "()I", "setColor", "(I)V", "left", "Landroidx/compose/ui/graphics/IntervalTree;", "getLeft", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "setLeft", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "max", "getMax", "()F", "setMax", "(F)V", "min", "getMin", "setMin", "parent", "getParent", "setParent", "right", "getRight", "setRight", "lowestNode", "next", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class Node extends Interval<T> {
        private int color;

        @NotNull
        private IntervalTree<T>.Node left;
        private float max;
        private float min;

        @NotNull
        private IntervalTree<T>.Node parent;

        @NotNull
        private IntervalTree<T>.Node right;

        public Node(float f, float f7, @Nullable T t8, int i) {
            super(f, f7, t8);
            this.color = i;
            this.min = f;
            this.max = f7;
            IntervalTree<T>.Node node = IntervalTree.this.terminator;
            this.left = node;
            this.right = node;
            this.parent = node;
        }

        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final float getMax() {
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        @NotNull
        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        @NotNull
        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        @NotNull
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

        @NotNull
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

        public final void setColor(int i) {
            this.color = i;
        }

        public final void setLeft(@NotNull IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final void setMax(float f) {
            this.max = f;
        }

        public final void setMin(float f) {
            this.min = f;
        }

        public final void setParent(@NotNull IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final void setRight(@NotNull IntervalTree<T>.Node node) {
            this.right = node;
        }
    }

    @Metadata(m5109d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002R$\u0010\u0003\u001a\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m5110d2 = {"androidx/compose/ui/graphics/IntervalTree$iterator$1", "", "Landroidx/compose/ui/graphics/Interval;", "next", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/IntervalTree;", "getNext", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "setNext", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "hasNext", "", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.ui.graphics.IntervalTree$iterator$1 */
    public static final class C21061 implements Iterator<Interval<T>>, InterfaceC6560a {
        private IntervalTree<T>.Node next;
        final /* synthetic */ IntervalTree<T> this$0;

        public C21061(IntervalTree<T> intervalTree) {
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

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree intervalTree, float f, float f7, int i, Object obj) {
        if ((i & 2) != 0) {
            f7 = f;
        }
        return intervalTree.findFirstOverlap(f, f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, InterfaceC6752b interfaceC6752b, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(interfaceC6752b, list);
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(IntervalTree intervalTree, float f, float f7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 2) != 0) {
            f7 = f;
        }
        IntervalTree<T>.Node node = intervalTree.root;
        if (node != intervalTree.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = intervalTree.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(f, f7)) {
                    interfaceC6471c.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != intervalTree.terminator && nodeRemove.getLeft().getMax() >= f) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != intervalTree.terminator && nodeRemove.getRight().getMin() <= f7) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    private final void rebalance(IntervalTree<T>.Node target) {
        while (target != this.root && target.getParent().getColor() == 0) {
            IntervalTree<T>.Node parent = target.getParent().getParent();
            if (target.getParent() == parent.getLeft()) {
                IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.setColor(1);
                    target.getParent().setColor(1);
                    parent.setColor(0);
                    target = parent;
                } else {
                    if (target == target.getParent().getRight()) {
                        target = target.getParent();
                        rotateLeft(target);
                    }
                    target.getParent().setColor(1);
                    parent.setColor(0);
                    rotateRight(parent);
                }
            } else {
                IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.setColor(1);
                    target.getParent().setColor(1);
                    parent.setColor(0);
                    target = parent;
                } else {
                    if (target == target.getParent().getLeft()) {
                        target = target.getParent();
                        rotateRight(target);
                    }
                    target.getParent().setColor(1);
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

    public final void addInterval(float start, float end, @Nullable T data) {
        IntervalTree<T>.Node node = new Node(start, end, data, 0);
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

    public final boolean contains(float value) {
        return findFirstOverlap(value, value) != IntervalTreeKt.getEmptyInterval();
    }

    @NotNull
    public final Interval<T> findFirstOverlap(@NotNull InterfaceC6752b interval) {
        return findFirstOverlap(Float.valueOf(((C6751a) interval).f11418a).floatValue(), Float.valueOf(((C6751a) interval).f11419b).floatValue());
    }

    @NotNull
    public final List<Interval<T>> findOverlaps(@NotNull InterfaceC6752b interval, @NotNull List<Interval<T>> results) {
        return findOverlaps(Float.valueOf(((C6751a) interval).f11418a).floatValue(), Float.valueOf(((C6751a) interval).f11419b).floatValue(), results);
    }

    public final void forEach$ui_graphics_release(@NotNull InterfaceC6752b interval, @NotNull InterfaceC6471c block) {
        float fFloatValue = Float.valueOf(((C6751a) interval).f11418a).floatValue();
        float fFloatValue2 = Float.valueOf(((C6751a) interval).f11419b).floatValue();
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(fFloatValue, fFloatValue2)) {
                    block.invoke(nodeRemove);
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

    @NotNull
    public final Iterator<Interval<T>> iterator() {
        return new C21061(this);
    }

    public final void plusAssign(@NotNull Interval<T> interval) {
        addInterval(interval.getStart(), interval.getEnd(), interval.getData());
    }

    public final boolean contains(@NotNull InterfaceC6752b interval) {
        return findFirstOverlap(Float.valueOf(((C6751a) interval).f11418a).floatValue(), Float.valueOf(((C6751a) interval).f11419b).floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, float f, float f7, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            f7 = f;
        }
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(f, f7, list);
    }

    @NotNull
    public final Interval<T> findFirstOverlap(float start, float end) {
        IntervalTree<T>.Node node = this.root;
        IntervalTree<T>.Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(start, end)) {
                    return nodeRemove;
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= start) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= end) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
        Interval<T> interval = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        AbstractC5830k.m5328e(interval, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return interval;
    }

    @NotNull
    public final List<Interval<T>> findOverlaps(float start, float end, @NotNull List<Interval<T>> results) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(start, end)) {
                    results.add(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= start) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= end) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
        return results;
    }

    public final void forEach$ui_graphics_release(float start, float end, @NotNull InterfaceC6471c block) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                if (nodeRemove.overlaps(start, end)) {
                    block.invoke(nodeRemove);
                }
                if (nodeRemove.getLeft() != this.terminator && nodeRemove.getLeft().getMax() >= start) {
                    arrayList.add(nodeRemove.getLeft());
                }
                if (nodeRemove.getRight() != this.terminator && nodeRemove.getRight().getMin() <= end) {
                    arrayList.add(nodeRemove.getRight());
                }
            }
            arrayList.clear();
        }
    }
}
