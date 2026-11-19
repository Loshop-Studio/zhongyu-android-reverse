package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p185i1.C9562a;
import p185i1.C9564c;
import p185i1.C9565d;
import p185i1.C9566e;
import p185i1.C9567f;
import p185i1.InterfaceC9563b;
import p230l1.C10106c;
import p268o1.InterfaceC10424a;
import p268o1.InterfaceC10425b;
import p268o1.InterfaceC10426c;
import p268o1.InterfaceC10427d;
import p268o1.InterfaceC10429f;
import p285p1.AbstractC10600b;
import p285p1.AbstractC10601c;
import p285p1.C10599a;
import p285p1.InterfaceC10602d;
import p309qc.InterfaceC10770a;
import p314r1.AbstractC10834a;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> {
    public static final C5908a Companion = new C5908a(null);
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;
    private InterfaceC9563b adapterAnimation;
    private boolean animationEnable;
    private final LinkedHashSet<Integer> childClickViewIds;
    private final LinkedHashSet<Integer> childLongClickViewIds;
    private List<T> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;
    private BrvahAsyncDiffer mDiffHelper;
    private C10599a mDraggableModule;
    private FrameLayout mEmptyLayout;
    private LinearLayout mFooterLayout;
    private LinearLayout mHeaderLayout;
    private int mLastPosition;
    private AbstractC10600b mLoadMoreModule;
    private InterfaceC10425b mOnItemChildClickListener;
    private InterfaceC10426c mOnItemChildLongClickListener;
    private InterfaceC10427d mOnItemClickListener;
    private InterfaceC10429f mOnItemLongClickListener;
    private InterfaceC10424a mSpanSizeLookup;
    private AbstractC10601c mUpFetchModule;
    private RecyclerView recyclerViewOrNull;

    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$a */
    public static final class C5908a {
        public /* synthetic */ C5908a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5908a() {
        }
    }

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$b */
    public /* synthetic */ class C5909b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5416a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            iArr[AnimationType.AlphaIn.ordinal()] = 1;
            iArr[AnimationType.ScaleIn.ordinal()] = 2;
            iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            iArr[AnimationType.SlideInRight.ordinal()] = 5;
            f5416a = iArr;
        }
    }

    public /* synthetic */ BaseQuickAdapter(int i10, List list, int i11, AbstractC9972n abstractC9972n) {
        this(i10, (i11 & 2) != 0 ? null : list);
    }

    public static final /* synthetic */ InterfaceC10424a access$getMSpanSizeLookup$p(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.getClass();
        return null;
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i12 & 2) != 0) {
            i10 = -1;
        }
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i10, i11);
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i12 & 2) != 0) {
            i10 = -1;
        }
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i10, i11);
    }

    /* renamed from: d */
    public static final void m4683d(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v10) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        AbstractC9979u.m20293f(v10, "v");
        this$0.setOnItemChildClick(v10, headerLayoutCount);
    }

    /* renamed from: e */
    public static final void m4684e(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v10) {
        AbstractC9979u.m20294g(viewHolder, "$viewHolder");
        AbstractC9979u.m20294g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        AbstractC9979u.m20293f(v10, "v");
        this$0.setOnItemClick(v10, headerLayoutCount);
    }

    public static /* synthetic */ void setDiffNewData$default(BaseQuickAdapter baseQuickAdapter, List list, Runnable runnable, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDiffNewData");
        }
        if ((i10 & 2) != 0) {
            runnable = null;
        }
        baseQuickAdapter.setDiffNewData(list, runnable);
    }

    public static /* synthetic */ int setFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        return baseQuickAdapter.setFooterView(view, i10, i11);
    }

    public static /* synthetic */ int setHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        return baseQuickAdapter.setHeaderView(view, i10, i11);
    }

    public final void addChildClickViewIds(@IdRes int... viewIds) {
        AbstractC9979u.m20294g(viewIds, "viewIds");
        for (int i10 : viewIds) {
            this.childClickViewIds.add(Integer.valueOf(i10));
        }
    }

    public final void addChildLongClickViewIds(@IdRes int... viewIds) {
        AbstractC9979u.m20294g(viewIds, "viewIds");
        for (int i10 : viewIds) {
            this.childLongClickViewIds.add(Integer.valueOf(i10));
        }
    }

    public void addData(@IntRange(from = 0) int i10, T t10) {
        this.data.add(i10, t10);
        notifyItemInserted(i10 + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public final int addFooterView(View view) {
        AbstractC9979u.m20294g(view, "view");
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    public final int addHeaderView(View view) {
        AbstractC9979u.m20294g(view, "view");
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    public void bindViewClickListener(final VH viewHolder, int i10) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
        if (this.mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: h1.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseQuickAdapter.m4684e(viewHolder, this, view);
                }
            });
        }
        if (this.mOnItemChildClickListener != null) {
            Iterator<Integer> it = getChildClickViewIds().iterator();
            while (it.hasNext()) {
                Integer id2 = it.next();
                View view = viewHolder.itemView;
                AbstractC9979u.m20293f(id2, "id");
                View viewFindViewById = view.findViewById(id2.intValue());
                if (viewFindViewById != null) {
                    AbstractC9979u.m20293f(viewFindViewById, "findViewById<View>(id)");
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: h1.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BaseQuickAdapter.m4683d(viewHolder, this, view2);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: c */
    public final void m4685c(RecyclerView.ViewHolder viewHolder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || viewHolder.getLayoutPosition() > this.mLastPosition) {
                InterfaceC9563b c9562a = this.adapterAnimation;
                if (c9562a == null) {
                    c9562a = new C9562a(0.0f, 1, null);
                }
                View view = viewHolder.itemView;
                AbstractC9979u.m20293f(view, "holder.itemView");
                for (Animator animator : c9562a.mo18806a(view)) {
                    startAnim(animator, viewHolder.getLayoutPosition());
                }
                this.mLastPosition = viewHolder.getLayoutPosition();
            }
        }
    }

    public final void compatibilityDataSizeChanged(int i10) {
        if (this.data.size() == i10) {
            notifyDataSetChanged();
        }
    }

    public abstract void convert(BaseViewHolder baseViewHolder, Object obj);

    public void convert(BaseViewHolder holder, Object obj, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
    }

    public VH createBaseViewHolder(ViewGroup parent, @LayoutRes int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        return (VH) createBaseViewHolder(AbstractC10834a.m23320a(parent, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m4686f() {
        if (this instanceof InterfaceC10602d) {
            this.mDraggableModule = ((InterfaceC10602d) this).addDraggableModule(this);
        }
    }

    /* renamed from: g */
    public final BaseViewHolder m4687g(Class cls, View view) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(View.class);
                AbstractC9979u.m20293f(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                declaredConstructor.setAccessible(true);
                T tNewInstance = declaredConstructor.newInstance(view);
                if (tNewInstance != null) {
                    return (BaseViewHolder) tNewInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            AbstractC9979u.m20293f(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
            declaredConstructor2.setAccessible(true);
            T tNewInstance2 = declaredConstructor2.newInstance(this, view);
            if (tNewInstance2 != null) {
                return (BaseViewHolder) tNewInstance2;
            }
            throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (InstantiationException e11) {
            e11.printStackTrace();
            return null;
        } catch (NoSuchMethodException e12) {
            e12.printStackTrace();
            return null;
        } catch (InvocationTargetException e13) {
            e13.printStackTrace();
            return null;
        }
    }

    public final InterfaceC9563b getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    public final Context getContext() {
        Context context = getRecyclerView().getContext();
        AbstractC9979u.m20293f(context, "recyclerView.context");
        return context;
    }

    public final List<T> getData() {
        return this.data;
    }

    public int getDefItemCount() {
        return this.data.size();
    }

    public int getDefItemViewType(int i10) {
        return super.getItemViewType(i10);
    }

    @InterfaceC10770a
    public final BrvahAsyncDiffer getDiffHelper() {
        return getDiffer();
    }

    public final BrvahAsyncDiffer getDiffer() {
        BrvahAsyncDiffer brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer == null) {
            throw new IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!");
        }
        AbstractC9979u.m20291d(brvahAsyncDiffer);
        return brvahAsyncDiffer;
    }

    public final C10599a getDraggableModule() {
        C10599a c10599a = this.mDraggableModule;
        if (c10599a == null) {
            throw new IllegalStateException("Please first implements DraggableModule");
        }
        AbstractC9979u.m20291d(c10599a);
        return c10599a;
    }

    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        AbstractC9979u.m20312y("mEmptyLayout");
        return null;
    }

    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC9979u.m20312y("mFooterLayout");
        return null;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return getHeaderLayoutCount() + this.data.size();
        }
        int i10 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        if (this.footerWithEmptyEnable) {
            return i10;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC9979u.m20312y("mHeaderLayout");
        return null;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public T getItem(@IntRange(from = 0) int i10) {
        return this.data.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!hasEmptyView()) {
            return getHeaderLayoutCount() + getDefItemCount() + getFooterLayoutCount();
        }
        int i10 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        return (this.footerWithEmptyEnable && hasFooterLayout()) ? i10 + 1 : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    public T getItemOrNull(@IntRange(from = 0) int i10) {
        return (T) AbstractC10947g0.m23947p0(this.data, i10);
    }

    public int getItemPosition(T t10) {
        if (t10 == null || this.data.isEmpty()) {
            return -1;
        }
        return this.data.indexOf(t10);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (hasEmptyView()) {
            boolean z10 = this.headerWithEmptyEnable && hasHeaderLayout();
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? EMPTY_VIEW : FOOTER_VIEW : z10 ? EMPTY_VIEW : FOOTER_VIEW : z10 ? HEADER_VIEW : EMPTY_VIEW;
        }
        boolean zHasHeaderLayout = hasHeaderLayout();
        if (zHasHeaderLayout && i10 == 0) {
            return HEADER_VIEW;
        }
        if (zHasHeaderLayout) {
            i10--;
        }
        int size = this.data.size();
        return i10 < size ? getDefItemViewType(i10) : i10 - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    public final AbstractC10600b getLoadMoreModule() {
        throw new IllegalStateException("Please first implements LoadMoreModule");
    }

    public final AbstractC10600b getMLoadMoreModule$com_github_CymChad_brvah() {
        return null;
    }

    public final InterfaceC10425b getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    public final InterfaceC10426c getOnItemChildLongClickListener() {
        return null;
    }

    public final InterfaceC10427d getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public final InterfaceC10429f getOnItemLongClickListener() {
        return null;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()");
        }
        AbstractC9979u.m20291d(recyclerView);
        return recyclerView;
    }

    public final RecyclerView getRecyclerViewOrNull() {
        return this.recyclerViewOrNull;
    }

    public final AbstractC10601c getUpFetchModule() {
        throw new IllegalStateException("Please first implements UpFetchModule");
    }

    public final View getViewByPosition(int i10, @IdRes int i11) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i10)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(i11);
    }

    /* renamed from: h */
    public final Class m4688h(Class cls) {
        try {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            AbstractC9979u.m20293f(types, "types");
            for (Type type : types) {
                if (type instanceof Class) {
                    if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (TypeNotPresentException e10) {
            e10.printStackTrace();
            return null;
        } catch (GenericSignatureFormatError e11) {
            e11.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                AbstractC9979u.m20312y("mEmptyLayout");
                frameLayout = null;
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            AbstractC9979u.m20312y("mFooterLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            AbstractC9979u.m20312y("mHeaderLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean isAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public boolean isFixedViewType(int i10) {
        return i10 == 268436821 || i10 == 268435729 || i10 == 268436275 || i10 == 268436002;
    }

    public final boolean isUseEmpty() {
        return this.isUseEmpty;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC9979u.m20294g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerViewOrNull = recyclerView;
        C10599a c10599a = this.mDraggableModule;
        if (c10599a != null) {
            c10599a.m22421a(recyclerView);
        }
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.onAttachedToRecyclerView.1
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i10) {
                    int itemViewType = BaseQuickAdapter.this.getItemViewType(i10);
                    if (itemViewType == 268435729 && BaseQuickAdapter.this.getHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && BaseQuickAdapter.this.getFooterViewAsFlow()) {
                        return 1;
                    }
                    BaseQuickAdapter.access$getMSpanSizeLookup$p(BaseQuickAdapter.this);
                    return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? ((GridLayoutManager) layoutManager).getSpanCount() : spanSizeLookup.getSpanSize(i10);
                }
            });
        }
    }

    public VH onCreateDefViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        return (VH) createBaseViewHolder(parent, this.layoutResId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        AbstractC9979u.m20294g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerViewOrNull = null;
    }

    public void onItemViewHolderCreated(VH viewHolder, int i10) {
        AbstractC9979u.m20294g(viewHolder, "viewHolder");
    }

    @InterfaceC10770a
    public void remove(@IntRange(from = 0) int i10) {
        removeAt(i10);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                AbstractC9979u.m20312y("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                AbstractC9979u.m20312y("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@IntRange(from = 0) int i10) {
        if (i10 >= this.data.size()) {
            return;
        }
        this.data.remove(i10);
        int headerLayoutCount = i10 + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                AbstractC9979u.m20312y("mEmptyLayout");
                frameLayout = null;
            }
            frameLayout.removeAllViews();
        }
    }

    public final void removeFooterView(View footer) {
        int footerViewPosition;
        AbstractC9979u.m20294g(footer, "footer");
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC9979u.m20312y("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeView(footer);
            LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                AbstractC9979u.m20312y("mFooterLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(View header) {
        int headerViewPosition;
        AbstractC9979u.m20294g(header, "header");
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC9979u.m20312y("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeView(header);
            LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                AbstractC9979u.m20312y("mHeaderLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    @InterfaceC10770a
    public void replaceData(Collection<? extends T> newData) {
        AbstractC9979u.m20294g(newData, "newData");
        setList(newData);
    }

    public final void setAdapterAnimation(InterfaceC9563b interfaceC9563b) {
        this.animationEnable = true;
        this.adapterAnimation = interfaceC9563b;
    }

    public final void setAnimationEnable(boolean z10) {
        this.animationEnable = z10;
    }

    public final void setAnimationFirstOnly(boolean z10) {
        this.isAnimationFirstOnly = z10;
    }

    public final void setAnimationWithDefault(AnimationType animationType) {
        InterfaceC9563b c9562a;
        AbstractC9979u.m20294g(animationType, "animationType");
        int i10 = C5909b.f5416a[animationType.ordinal()];
        if (i10 == 1) {
            c9562a = new C9562a(0.0f, 1, null);
        } else if (i10 == 2) {
            c9562a = new C9564c(0.0f, 1, null);
        } else if (i10 == 3) {
            c9562a = new C9565d();
        } else if (i10 == 4) {
            c9562a = new C9566e();
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            c9562a = new C9567f();
        }
        setAdapterAnimation(c9562a);
    }

    public void setData(@IntRange(from = 0) int i10, T t10) {
        if (i10 >= this.data.size()) {
            return;
        }
        this.data.set(i10, t10);
        notifyItemChanged(i10 + getHeaderLayoutCount());
    }

    public final void setData$com_github_CymChad_brvah(List<T> list) {
        AbstractC9979u.m20294g(list, "<set-?>");
        this.data = list;
    }

    public final void setDiffCallback(DiffUtil.ItemCallback<T> diffCallback) {
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        setDiffConfig(new C10106c.a(diffCallback).m21137a());
    }

    public final void setDiffConfig(C10106c config) {
        AbstractC9979u.m20294g(config, "config");
        this.mDiffHelper = new BrvahAsyncDiffer(this, config);
    }

    public final void setDiffNewData(List<T> list) {
        setDiffNewData$default(this, list, null, 2, null);
    }

    public final void setEmptyView(View emptyView) {
        boolean z10;
        AbstractC9979u.m20294g(emptyView, "emptyView");
        int itemCount = getItemCount();
        FrameLayout frameLayout = null;
        if (this.mEmptyLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout2;
            ViewGroup.LayoutParams layoutParams = emptyView.getLayoutParams();
            frameLayout2.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
            z10 = true;
        } else {
            ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    AbstractC9979u.m20312y("mEmptyLayout");
                    frameLayout3 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                layoutParams3.width = layoutParams2.width;
                layoutParams3.height = layoutParams2.height;
                FrameLayout frameLayout4 = this.mEmptyLayout;
                if (frameLayout4 == null) {
                    AbstractC9979u.m20312y("mEmptyLayout");
                    frameLayout4 = null;
                }
                frameLayout4.setLayoutParams(layoutParams3);
            }
            z10 = false;
        }
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            AbstractC9979u.m20312y("mEmptyLayout");
            frameLayout5 = null;
        }
        frameLayout5.removeAllViews();
        FrameLayout frameLayout6 = this.mEmptyLayout;
        if (frameLayout6 == null) {
            AbstractC9979u.m20312y("mEmptyLayout");
        } else {
            frameLayout = frameLayout6;
        }
        frameLayout.addView(emptyView);
        this.isUseEmpty = true;
        if (z10 && hasEmptyView()) {
            int i10 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i10);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public final int setFooterView(View view) {
        AbstractC9979u.m20294g(view, "view");
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final void setFooterViewAsFlow(boolean z10) {
        this.footerViewAsFlow = z10;
    }

    public final void setFooterWithEmptyEnable(boolean z10) {
        this.footerWithEmptyEnable = z10;
    }

    public void setFullSpan(RecyclerView.ViewHolder holder) {
        AbstractC9979u.m20294g(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public final int setHeaderView(View view) {
        AbstractC9979u.m20294g(view, "view");
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setHeaderViewAsFlow(boolean z10) {
        this.headerViewAsFlow = z10;
    }

    public final void setHeaderWithEmptyEnable(boolean z10) {
        this.headerWithEmptyEnable = z10;
    }

    public void setList(Collection<? extends T> collection) {
        List<T> list = this.data;
        if (collection != list) {
            list.clear();
            if (collection != null && !collection.isEmpty()) {
                this.data.addAll(collection);
            }
        } else if (collection == null || collection.isEmpty()) {
            this.data.clear();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            this.data.clear();
            this.data.addAll(arrayList);
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
    }

    @InterfaceC10770a
    public void setNewData(List<T> list) {
        setNewInstance(list);
    }

    public void setNewInstance(List<T> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.data = list;
        this.mLastPosition = -1;
        notifyDataSetChanged();
    }

    public void setOnItemChildClick(View v10, int i10) {
        AbstractC9979u.m20294g(v10, "v");
        InterfaceC10425b interfaceC10425b = this.mOnItemChildClickListener;
        if (interfaceC10425b != null) {
            interfaceC10425b.mo18642a(this, v10, i10);
        }
    }

    public final void setOnItemChildClickListener(InterfaceC10425b interfaceC10425b) {
        this.mOnItemChildClickListener = interfaceC10425b;
    }

    public boolean setOnItemChildLongClick(View v10, int i10) {
        AbstractC9979u.m20294g(v10, "v");
        return false;
    }

    public void setOnItemClick(View v10, int i10) {
        AbstractC9979u.m20294g(v10, "v");
        InterfaceC10427d interfaceC10427d = this.mOnItemClickListener;
        if (interfaceC10427d != null) {
            interfaceC10427d.mo2825a(this, v10, i10);
        }
    }

    public final void setOnItemClickListener(InterfaceC10427d interfaceC10427d) {
        this.mOnItemClickListener = interfaceC10427d;
    }

    public boolean setOnItemLongClick(View v10, int i10) {
        AbstractC9979u.m20294g(v10, "v");
        return false;
    }

    public final void setUseEmpty(boolean z10) {
        this.isUseEmpty = z10;
    }

    public void startAnim(Animator anim, int i10) {
        AbstractC9979u.m20294g(anim, "anim");
        anim.start();
    }

    public BaseQuickAdapter(int i10, List list) {
        this.layoutResId = i10;
        this.data = list == null ? new ArrayList() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        m4686f();
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    public final int addFooterView(View view, int i10) {
        AbstractC9979u.m20294g(view, "view");
        return addFooterView$default(this, view, i10, 0, 4, null);
    }

    public final int addHeaderView(View view, int i10) {
        AbstractC9979u.m20294g(view, "view");
        return addHeaderView$default(this, view, i10, 0, 4, null);
    }

    public VH createBaseViewHolder(View view) {
        AbstractC9979u.m20294g(view, "view");
        Class clsM4688h = null;
        for (Class<?> superclass = getClass(); clsM4688h == null && superclass != null; superclass = superclass.getSuperclass()) {
            clsM4688h = m4688h(superclass);
        }
        VH vh = clsM4688h == null ? (VH) new BaseViewHolder(view) : (VH) m4687g(clsM4688h, view);
        return vh == null ? (VH) new BaseViewHolder(view) : vh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        onBindViewHolder((BaseQuickAdapter<T, VH>) viewHolder, i10, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        View view = null;
        switch (i10) {
            case HEADER_VIEW /* 268435729 */:
                LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    AbstractC9979u.m20312y("mHeaderLayout");
                    linearLayout = null;
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        AbstractC9979u.m20312y("mHeaderLayout");
                        linearLayout2 = null;
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    AbstractC9979u.m20312y("mHeaderLayout");
                } else {
                    view = linearLayout3;
                }
                return (VH) createBaseViewHolder(view);
            case LOAD_MORE_VIEW /* 268436002 */:
                AbstractC9979u.m20291d(null);
                throw null;
            case FOOTER_VIEW /* 268436275 */:
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    AbstractC9979u.m20312y("mFooterLayout");
                    linearLayout4 = null;
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        AbstractC9979u.m20312y("mFooterLayout");
                        linearLayout5 = null;
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 == null) {
                    AbstractC9979u.m20312y("mFooterLayout");
                } else {
                    view = linearLayout6;
                }
                return (VH) createBaseViewHolder(view);
            case EMPTY_VIEW /* 268436821 */:
                FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    AbstractC9979u.m20312y("mEmptyLayout");
                    frameLayout = null;
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        AbstractC9979u.m20312y("mEmptyLayout");
                        frameLayout2 = null;
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    AbstractC9979u.m20312y("mEmptyLayout");
                } else {
                    view = frameLayout3;
                }
                return (VH) createBaseViewHolder(view);
            default:
                VH vh = (VH) onCreateDefViewHolder(parent, i10);
                bindViewClickListener(vh, i10);
                C10599a c10599a = this.mDraggableModule;
                if (c10599a != null) {
                    c10599a.m22428h(vh);
                }
                onItemViewHolderCreated(vh, i10);
                return vh;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(VH holder) {
        AbstractC9979u.m20294g(holder, "holder");
        super.onViewAttachedToWindow((BaseQuickAdapter<T, VH>) holder);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(holder);
        } else {
            m4685c(holder);
        }
    }

    public void remove(T t10) {
        int iIndexOf = this.data.indexOf(t10);
        if (iIndexOf == -1) {
            return;
        }
        removeAt(iIndexOf);
    }

    public void setDiffNewData(List<T> list, Runnable runnable) {
        if (hasEmptyView()) {
            setNewInstance(list);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        BrvahAsyncDiffer brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            brvahAsyncDiffer.m4699f(list, runnable);
        }
    }

    public final int setFooterView(View view, int i10) {
        AbstractC9979u.m20294g(view, "view");
        return setFooterView$default(this, view, i10, 0, 4, null);
    }

    public final int setHeaderView(View view, int i10) {
        AbstractC9979u.m20294g(view, "view");
        return setHeaderView$default(this, view, i10, 0, 4, null);
    }

    public final int addFooterView(View view, int i10, int i11) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        AbstractC9979u.m20294g(view, "view");
        LinearLayout linearLayout = null;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout2;
            linearLayout2.setOrientation(i11);
            LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                AbstractC9979u.m20312y("mFooterLayout");
                linearLayout3 = null;
            }
            if (i11 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            AbstractC9979u.m20312y("mFooterLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (i10 < 0 || i10 > childCount) {
            i10 = childCount;
        }
        LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            AbstractC9979u.m20312y("mFooterLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, i10);
        LinearLayout linearLayout6 = this.mFooterLayout;
        if (linearLayout6 == null) {
            AbstractC9979u.m20312y("mFooterLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i10;
    }

    public final int addHeaderView(View view, int i10, int i11) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        AbstractC9979u.m20294g(view, "view");
        LinearLayout linearLayout = null;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout2;
            linearLayout2.setOrientation(i11);
            LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                AbstractC9979u.m20312y("mHeaderLayout");
                linearLayout3 = null;
            }
            if (i11 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            AbstractC9979u.m20312y("mHeaderLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (i10 < 0 || i10 > childCount) {
            i10 = childCount;
        }
        LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            AbstractC9979u.m20312y("mHeaderLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, i10);
        LinearLayout linearLayout6 = this.mHeaderLayout;
        if (linearLayout6 == null) {
            AbstractC9979u.m20312y("mHeaderLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case LOAD_MORE_VIEW /* 268436002 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            default:
                convert(holder, getItem(i10 - getHeaderLayoutCount()));
                break;
        }
    }

    public final int setFooterView(View view, int i10, int i11) {
        AbstractC9979u.m20294g(view, "view");
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC9979u.m20312y("mFooterLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > i10) {
                LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    AbstractC9979u.m20312y("mFooterLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(i10);
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    AbstractC9979u.m20312y("mFooterLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, i10);
                return i10;
            }
        }
        return addFooterView(view, i10, i11);
    }

    public final int setHeaderView(View view, int i10, int i11) {
        AbstractC9979u.m20294g(view, "view");
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC9979u.m20312y("mHeaderLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > i10) {
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    AbstractC9979u.m20312y("mHeaderLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(i10);
                LinearLayout linearLayout4 = this.mHeaderLayout;
                if (linearLayout4 == null) {
                    AbstractC9979u.m20312y("mHeaderLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, i10);
                return i10;
            }
        }
        return addHeaderView(view, i10, i11);
    }

    public void addData(@NonNull T t10) {
        this.data.add(t10);
        notifyItemInserted(this.data.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void onBindViewHolder(VH holder, int i10, List<Object> payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseQuickAdapter<T, VH>) holder, i10);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case LOAD_MORE_VIEW /* 268436002 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            default:
                convert(holder, getItem(i10 - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    public void setDiffNewData(@NonNull DiffUtil.DiffResult diffResult, List<T> list) {
        AbstractC9979u.m20294g(diffResult, "diffResult");
        AbstractC9979u.m20294g(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.dispatchUpdatesTo(new BrvahListUpdateCallback(this));
            this.data = list;
        }
    }

    public void addData(@IntRange(from = 0) int i10, Collection<? extends T> newData) {
        AbstractC9979u.m20294g(newData, "newData");
        this.data.addAll(i10, newData);
        notifyItemRangeInserted(i10 + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void addData(@NonNull Collection<? extends T> newData) {
        AbstractC9979u.m20294g(newData, "newData");
        this.data.addAll(newData);
        notifyItemRangeInserted((this.data.size() - newData.size()) + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final void setEmptyView(int i10) {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView != null) {
            View view = LayoutInflater.from(recyclerView.getContext()).inflate(i10, (ViewGroup) recyclerView, false);
            AbstractC9979u.m20293f(view, "view");
            setEmptyView(view);
        }
    }

    public final void setGridSpanSizeLookup(InterfaceC10424a interfaceC10424a) {
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(AbstractC10600b abstractC10600b) {
    }

    public final void setOnItemChildLongClickListener(InterfaceC10426c interfaceC10426c) {
    }

    public final void setOnItemLongClickListener(InterfaceC10429f interfaceC10429f) {
    }
}
