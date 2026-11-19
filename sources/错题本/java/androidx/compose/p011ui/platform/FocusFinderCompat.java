package androidx.compose.p011ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200x6.C6756f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0014\u001a\u0004\u0018\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000fR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m5110d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "<init>", "()V", "Ld6/s;", "FocusFinder", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "focused", "getEffectiveRoot", "(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;", "", "direction", "findNextUserSpecifiedFocus", "(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroidx/collection/MutableObjectList;", "focusables", "findNextFocus", "(Landroid/view/ViewGroup;Landroid/view/View;ILandroidx/collection/MutableObjectList;)Landroid/view/View;", "findNextFocusInRelativeDirection", "(Landroidx/collection/MutableObjectList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroidx/collection/ObjectList;", "count", "", "outLooped", "getNextFocusable", "(Landroid/view/View;Landroidx/collection/ObjectList;I[Z)Landroid/view/View;", "getPreviousFocusable", "id", "", "isValidId", "(I)Z", "findNextFocus1d", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "userSpecifiedFocusComparator", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "tmpList", "Landroidx/collection/MutableObjectList;", "Companion", "UserSpecifiedFocusComparator", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"})
/* loaded from: classes2.dex */
public final class FocusFinderCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 FocusFinderThreadLocal = new ThreadLocal<FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public FocusFinderCompat initialValue() {
            return new FocusFinderCompat();
        }
    };

    @NotNull
    private final Rect focusedRect = new Rect();

    @NotNull
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new UserSpecifiedFocusComparator.NextFocusGetter() { // from class: androidx.compose.ui.platform.j
        @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
        public final View get(View view, View view2) {
            return FocusFinderCompat.userSpecifiedFocusComparator$lambda$0(this.f921a, view, view2);
        }
    });

    @NotNull
    private final MutableObjectList<View> tmpList = new MutableObjectList<>(0, 1, null);

    @Metadata(m5109d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$Companion;", "", "()V", "FocusFinderThreadLocal", "androidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "instance", "Landroidx/compose/ui/platform/FocusFinderCompat;", "getInstance", "()Landroidx/compose/ui/platform/FocusFinderCompat;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final FocusFinderCompat getInstance() {
            FocusFinderCompat focusFinderCompat = FocusFinderCompat.FocusFinderThreadLocal.get();
            AbstractC5830k.m5327d(focusFinderCompat);
            return focusFinderCompat;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001$B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006%"}, m5110d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "mNextFocusGetter", "<init>", "(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V", "Ld6/s;", "recycle", "()V", "Landroidx/collection/ObjectList;", "focusables", "root", "setFocusables", "(Landroidx/collection/ObjectList;Landroid/view/View;)V", "head", "setHeadOfChain", "(Landroid/view/View;)V", "first", "second", "", "compare", "(Landroid/view/View;Landroid/view/View;)I", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "Landroidx/collection/MutableScatterMap;", "nextFoci", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "isConnectedTo", "Landroidx/collection/MutableScatterSet;", "headsOfChains", "Landroidx/collection/MutableObjectIntMap;", "originalOrdinal", "Landroidx/collection/MutableObjectIntMap;", "Landroid/view/View;", "NextFocusGetter", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,463:1\n301#2,6:464\n84#2:470\n84#2:471\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n*L\n265#1:464,6\n267#1:470\n276#1:471\n*E\n"})
    public static final class UserSpecifiedFocusComparator implements Comparator<View> {

        @NotNull
        private final NextFocusGetter mNextFocusGetter;

        @Nullable
        private View root;

        @NotNull
        private final MutableScatterMap<View, View> nextFoci = ScatterMapKt.mutableScatterMapOf();

        @NotNull
        private final MutableScatterSet<View> isConnectedTo = ScatterSetKt.mutableScatterSetOf();

        @NotNull
        private final MutableScatterMap<View, View> headsOfChains = ScatterMapKt.mutableScatterMapOf();

        @NotNull
        private final MutableObjectIntMap<View> originalOrdinal = ObjectIntMapKt.mutableObjectIntMapOf();

        @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "", "get", "Landroid/view/View;", "root", "view", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public interface NextFocusGetter {
            @Nullable
            View get(@NotNull View root, @NotNull View view);
        }

        public UserSpecifiedFocusComparator(@NotNull NextFocusGetter nextFocusGetter) {
            this.mNextFocusGetter = nextFocusGetter;
        }

        public final void recycle() {
            this.root = null;
            this.headsOfChains.clear();
            this.isConnectedTo.clear();
            this.originalOrdinal.clear();
            this.nextFoci.clear();
        }

        public final void setFocusables(@NotNull ObjectList<View> focusables, @NotNull View root) {
            this.root = root;
            Object[] objArr = focusables.content;
            int i = focusables._size;
            for (int i8 = 0; i8 < i; i8++) {
                this.originalOrdinal.set((View) objArr[i8], i8);
            }
            C6756f c6756fM5260N = AbstractC5806u.m5260N(0, focusables._size);
            int i9 = c6756fM5260N.f11420a;
            int i10 = c6756fM5260N.f11421b;
            if (i9 <= i10) {
                while (true) {
                    View view = focusables.get(i10);
                    View view2 = this.mNextFocusGetter.get(root, view);
                    if (view2 != null && this.originalOrdinal.containsKey(view2)) {
                        this.nextFoci.set(view, view2);
                        this.isConnectedTo.add(view2);
                    }
                    if (i10 == i9) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            C6756f c6756fM5260N2 = AbstractC5806u.m5260N(0, focusables._size);
            int i11 = c6756fM5260N2.f11420a;
            int i12 = c6756fM5260N2.f11421b;
            if (i11 > i12) {
                return;
            }
            while (true) {
                View view3 = focusables.get(i12);
                if (this.nextFoci.get(view3) != null && !this.isConnectedTo.contains(view3)) {
                    setHeadOfChain(view3);
                }
                if (i12 == i11) {
                    return;
                } else {
                    i12--;
                }
            }
        }

        public final void setHeadOfChain(@NotNull View head) {
            View view = head;
            while (head != null) {
                View view2 = this.headsOfChains.get(head);
                if (view2 != null) {
                    if (view2 == view) {
                        return;
                    }
                    head = view;
                    view = view2;
                }
                this.headsOfChains.set(head, view);
                head = this.nextFoci.get(head);
            }
        }

        @Override // java.util.Comparator
        public int compare(@Nullable View first, @Nullable View second) {
            if (first == second) {
                return 0;
            }
            if (first == null) {
                return -1;
            }
            if (second == null) {
                return 1;
            }
            View view = this.headsOfChains.get(first);
            View view2 = this.headsOfChains.get(second);
            if (view == view2 && view != null) {
                if (first == view) {
                    return -1;
                }
                return (second == view || this.nextFoci.get(first) == null) ? 1 : -1;
            }
            if (view != null) {
                first = view;
            }
            if (view2 != null) {
                second = view2;
            }
            if (view == null && view2 == null) {
                return 0;
            }
            return this.originalOrdinal.get(first) < this.originalOrdinal.get(second) ? -1 : 1;
        }
    }

    private final void FocusFinder() {
    }

    private final View findNextFocus(ViewGroup root, View focused, int direction, MutableObjectList<View> focusables) {
        Rect rect = this.focusedRect;
        focused.getFocusedRect(rect);
        root.offsetDescendantRectToMyCoords(focused, rect);
        return findNextFocusInRelativeDirection(focusables, root, focused, direction);
    }

    @SuppressLint({"AsCollectionCall"})
    private final View findNextFocusInRelativeDirection(MutableObjectList<View> focusables, ViewGroup root, View focused, int direction) {
        try {
            UserSpecifiedFocusComparator userSpecifiedFocusComparator = this.userSpecifiedFocusComparator;
            AbstractC5830k.m5327d(root);
            userSpecifiedFocusComparator.setFocusables(focusables, root);
            Collections.sort(focusables.asMutableList(), this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.recycle();
            int size = focusables.getSize();
            View previousFocusable = null;
            if (size < 2) {
                return null;
            }
            boolean[] zArr = new boolean[1];
            if (direction == 1) {
                previousFocusable = getPreviousFocusable(focused, focusables, size, zArr);
            } else if (direction == 2) {
                previousFocusable = getNextFocusable(focused, focusables, size, zArr);
            }
            return previousFocusable == null ? focusables.get(size - 1) : previousFocusable;
        } catch (Throwable th) {
            this.userSpecifiedFocusComparator.recycle();
            throw th;
        }
    }

    private final View findNextUserSpecifiedFocus(ViewGroup root, View focused, int direction) {
        View viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(focused, root, direction);
        boolean z8 = true;
        View viewFindUserSetNextFocus2 = viewFindUserSetNextFocus;
        while (viewFindUserSetNextFocus != null) {
            if (viewFindUserSetNextFocus.isFocusable() && viewFindUserSetNextFocus.getVisibility() == 0 && (!viewFindUserSetNextFocus.isInTouchMode() || viewFindUserSetNextFocus.isFocusableInTouchMode())) {
                return viewFindUserSetNextFocus;
            }
            viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus, root, direction);
            boolean z9 = !z8;
            if (!z8) {
                viewFindUserSetNextFocus2 = viewFindUserSetNextFocus2 != null ? FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus2, root, direction) : null;
                if (viewFindUserSetNextFocus2 == viewFindUserSetNextFocus) {
                    break;
                }
            }
            z8 = z9;
        }
        return null;
    }

    private final ViewGroup getEffectiveRoot(ViewGroup root, View focused) {
        if (focused != null && focused != root) {
            ViewParent parent = focused.getParent();
            ViewGroup viewGroup = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == root) {
                    if (viewGroup == null) {
                        break;
                    }
                    return viewGroup;
                }
                ViewGroup viewGroup2 = (ViewGroup) parent;
                if (viewGroup2.getTouchscreenBlocksFocus() && focused.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup = viewGroup2;
                }
                parent = viewGroup2.getParent();
            }
        }
        return root;
    }

    private final View getNextFocusable(View focused, ObjectList<View> focusables, int count, boolean[] outLooped) {
        int i;
        if (count < 2) {
            return null;
        }
        int iLastIndexOf = focusables.lastIndexOf(focused);
        if (iLastIndexOf >= 0 && (i = iLastIndexOf + 1) < count) {
            return focusables.get(i);
        }
        outLooped[0] = true;
        return focusables.get(0);
    }

    private final View getPreviousFocusable(View focused, ObjectList<View> focusables, int count, boolean[] outLooped) {
        int iIndexOf;
        if (count < 2) {
            return null;
        }
        if (focused != null && (iIndexOf = focusables.indexOf(focused)) > 0) {
            return focusables.get(iIndexOf - 1);
        }
        outLooped[0] = true;
        return focusables.get(count - 1);
    }

    private final boolean isValidId(int id) {
        return (id == 0 || id == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View userSpecifiedFocusComparator$lambda$0(FocusFinderCompat focusFinderCompat, View view, View view2) {
        if (focusFinderCompat.isValidId(view2.getNextFocusForwardId())) {
            return FocusFinderCompat_androidKt.findUserSetNextFocus(view2, view, 2);
        }
        return null;
    }

    @Nullable
    public final View findNextFocus1d(@NotNull ViewGroup root, @NotNull View focused, int direction) {
        ViewGroup effectiveRoot = getEffectiveRoot(root, focused);
        View viewFindNextUserSpecifiedFocus = findNextUserSpecifiedFocus(effectiveRoot, focused, direction);
        if (viewFindNextUserSpecifiedFocus != null) {
            return viewFindNextUserSpecifiedFocus;
        }
        MutableObjectList<View> mutableObjectList = this.tmpList;
        try {
            mutableObjectList.clear();
            FocusFinderCompat_androidKt.addFocusableViews(effectiveRoot, mutableObjectList, direction);
            if (!mutableObjectList.isEmpty()) {
                viewFindNextUserSpecifiedFocus = findNextFocus(effectiveRoot, focused, direction, mutableObjectList);
            }
            return viewFindNextUserSpecifiedFocus;
        } finally {
            mutableObjectList.clear();
        }
    }
}
