package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
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
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p172m0.C9291a;
import p172m0.InterfaceC9292b;
import p205p0.C9634a;
import p205p0.C9635b;
import p238s0.InterfaceC9962a;
import p238s0.InterfaceC9963b;
import p238s0.InterfaceC9964c;
import p238s0.InterfaceC9965d;
import p238s0.InterfaceC9967f;
import p249t0.AbstractC10086b;
import p249t0.C10085a;
import p249t0.InterfaceC10087c;
import p271v0.AbstractC10238a;

/* loaded from: classes3.dex */
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: u */
    public static final C5489a f3640u = new C5489a(null);

    /* renamed from: a */
    public final int f3641a;

    /* renamed from: b */
    public List f3642b;

    /* renamed from: c */
    public boolean f3643c;

    /* renamed from: d */
    public boolean f3644d;

    /* renamed from: e */
    public boolean f3645e;

    /* renamed from: f */
    public boolean f3646f;

    /* renamed from: g */
    public boolean f3647g;

    /* renamed from: h */
    public boolean f3648h;

    /* renamed from: i */
    public boolean f3649i;

    /* renamed from: j */
    public InterfaceC9292b f3650j;

    /* renamed from: k */
    public C9634a f3651k;

    /* renamed from: l */
    public LinearLayout f3652l;

    /* renamed from: m */
    public LinearLayout f3653m;

    /* renamed from: n */
    public FrameLayout f3654n;

    /* renamed from: o */
    public int f3655o;

    /* renamed from: p */
    public InterfaceC9967f f3656p;

    /* renamed from: q */
    public C10085a f3657q;

    /* renamed from: r */
    public RecyclerView f3658r;

    /* renamed from: s */
    public final LinkedHashSet f3659s;

    /* renamed from: t */
    public final LinkedHashSet f3660t;

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$a */
    public static final class C5489a {
        public /* synthetic */ C5489a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C5489a() {
        }
    }

    public BaseQuickAdapter(int i10, List list) {
        this.f3641a = i10;
        this.f3642b = list == null ? new ArrayList() : list;
        this.f3645e = true;
        this.f3649i = true;
        this.f3655o = -1;
        m3504h();
        this.f3659s = new LinkedHashSet();
        this.f3660t = new LinkedHashSet();
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC9962a m3484d(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.getClass();
        return null;
    }

    /* renamed from: g */
    public static final boolean m3485g(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v10) {
        AbstractC9133u.m16133g(viewHolder, "$viewHolder");
        AbstractC9133u.m16133g(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int iM3514u = bindingAdapterPosition - this$0.m3514u();
        AbstractC9133u.m16132f(v10, "v");
        return this$0.m3500S(v10, iM3514u);
    }

    /* renamed from: A */
    public final InterfaceC9964c m3486A() {
        return null;
    }

    /* renamed from: B */
    public final InterfaceC9965d m3487B() {
        return null;
    }

    /* renamed from: C */
    public final InterfaceC9967f m3488C() {
        return this.f3656p;
    }

    /* renamed from: D */
    public final RecyclerView m3489D() {
        RecyclerView recyclerView = this.f3658r;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()");
        }
        AbstractC9133u.m16130d(recyclerView);
        return recyclerView;
    }

    /* renamed from: E */
    public final boolean m3490E() {
        FrameLayout frameLayout = this.f3654n;
        if (frameLayout != null) {
            if (frameLayout == null) {
                AbstractC9133u.m16151y("mEmptyLayout");
                frameLayout = null;
            }
            if (frameLayout.getChildCount() != 0 && this.f3645e) {
                return this.f3642b.isEmpty();
            }
            return false;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m3491F() {
        LinearLayout linearLayout = this.f3653m;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            AbstractC9133u.m16151y("mFooterLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    /* renamed from: G */
    public final boolean m3492G() {
        LinearLayout linearLayout = this.f3652l;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            AbstractC9133u.m16151y("mHeaderLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    /* renamed from: H */
    public boolean mo3458H(int i10) {
        return i10 == 268436821 || i10 == 268435729 || i10 == 268436275 || i10 == 268436002;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        switch (holder.getItemViewType()) {
            case 268435729:
            case 268436002:
            case 268436275:
            case 268436821:
                break;
            default:
                mo3450i(holder, getItem(i10 - m3514u()));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseViewHolder holder, int i10, List payloads) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i10);
        }
        switch (holder.getItemViewType()) {
            case 268435729:
            case 268436002:
            case 268436275:
            case 268436821:
                break;
            default:
                mo3451j(holder, getItem(i10 - m3514u()), payloads);
                break;
        }
    }

    /* renamed from: K */
    public BaseViewHolder mo3440K(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        return m3507m(parent, this.f3641a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        View view = null;
        switch (i10) {
            case 268435729:
                LinearLayout linearLayout = this.f3652l;
                if (linearLayout == null) {
                    AbstractC9133u.m16151y("mHeaderLayout");
                    linearLayout = null;
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.f3652l;
                    if (linearLayout2 == null) {
                        AbstractC9133u.m16151y("mHeaderLayout");
                        linearLayout2 = null;
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.f3652l;
                if (linearLayout3 == null) {
                    AbstractC9133u.m16151y("mHeaderLayout");
                } else {
                    view = linearLayout3;
                }
                return m3506l(view);
            case 268436002:
                AbstractC9133u.m16130d(null);
                throw null;
            case 268436275:
                LinearLayout linearLayout4 = this.f3653m;
                if (linearLayout4 == null) {
                    AbstractC9133u.m16151y("mFooterLayout");
                    linearLayout4 = null;
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.f3653m;
                    if (linearLayout5 == null) {
                        AbstractC9133u.m16151y("mFooterLayout");
                        linearLayout5 = null;
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.f3653m;
                if (linearLayout6 == null) {
                    AbstractC9133u.m16151y("mFooterLayout");
                } else {
                    view = linearLayout6;
                }
                return m3506l(view);
            case 268436821:
                FrameLayout frameLayout = this.f3654n;
                if (frameLayout == null) {
                    AbstractC9133u.m16151y("mEmptyLayout");
                    frameLayout = null;
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.f3654n;
                    if (frameLayout2 == null) {
                        AbstractC9133u.m16151y("mEmptyLayout");
                        frameLayout2 = null;
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.f3654n;
                if (frameLayout3 == null) {
                    AbstractC9133u.m16151y("mEmptyLayout");
                } else {
                    view = frameLayout3;
                }
                return m3506l(view);
            default:
                BaseViewHolder baseViewHolderMo3440K = mo3440K(parent, i10);
                mo3447f(baseViewHolderMo3440K, i10);
                C10085a c10085a = this.f3657q;
                if (c10085a != null) {
                    c10085a.m18828h(baseViewHolderMo3440K);
                }
                m3496M(baseViewHolderMo3440K, i10);
                return baseViewHolderMo3440K;
        }
    }

    /* renamed from: M */
    public void m3496M(BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (mo3458H(holder.getItemViewType())) {
            m3499Q(holder);
        } else {
            m3503e(holder);
        }
    }

    /* renamed from: O */
    public final void m3497O(DiffUtil.ItemCallback diffCallback) {
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        m3498P(new C9635b.a(diffCallback).m18200a());
    }

    /* renamed from: P */
    public final void m3498P(C9635b config) {
        AbstractC9133u.m16133g(config, "config");
        this.f3651k = new C9634a(this, config);
    }

    /* renamed from: Q */
    public void m3499Q(RecyclerView.ViewHolder holder) {
        AbstractC9133u.m16133g(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    /* renamed from: R */
    public void mo3459R(Collection collection) {
        List list = this.f3642b;
        if (collection != list) {
            list.clear();
            if (collection != null && !collection.isEmpty()) {
                this.f3642b.addAll(collection);
            }
        } else if (collection == null || collection.isEmpty()) {
            this.f3642b.clear();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            this.f3642b.clear();
            this.f3642b.addAll(arrayList);
        }
        this.f3655o = -1;
        notifyDataSetChanged();
    }

    /* renamed from: S */
    public boolean m3500S(View v10, int i10) {
        AbstractC9133u.m16133g(v10, "v");
        InterfaceC9967f interfaceC9967f = this.f3656p;
        if (interfaceC9967f != null) {
            return interfaceC9967f.mo11539a(this, v10, i10);
        }
        return false;
    }

    /* renamed from: T */
    public final void m3501T(InterfaceC9967f interfaceC9967f) {
        this.f3656p = interfaceC9967f;
    }

    /* renamed from: U */
    public void m3502U(Animator anim, int i10) {
        AbstractC9133u.m16133g(anim, "anim");
        anim.start();
    }

    /* renamed from: e */
    public final void m3503e(RecyclerView.ViewHolder viewHolder) {
        if (this.f3648h) {
            if (!this.f3649i || viewHolder.getLayoutPosition() > this.f3655o) {
                InterfaceC9292b c9291a = this.f3650j;
                if (c9291a == null) {
                    c9291a = new C9291a(0.0f, 1, null);
                }
                View view = viewHolder.itemView;
                AbstractC9133u.m16132f(view, "holder.itemView");
                for (Animator animator : c9291a.mo17095a(view)) {
                    m3502U(animator, viewHolder.getLayoutPosition());
                }
                this.f3655o = viewHolder.getLayoutPosition();
            }
        }
    }

    /* renamed from: f */
    public void mo3447f(final BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        if (this.f3656p != null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l0.g
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseQuickAdapter.m3485g(viewHolder, this, view);
                }
            });
        }
    }

    public Object getItem(int i10) {
        return this.f3642b.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!m3490E()) {
            return m3514u() + m3510p() + m3512s();
        }
        int i10 = (this.f3643c && m3492G()) ? 2 : 1;
        return (this.f3644d && m3491F()) ? i10 + 1 : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (m3490E()) {
            boolean z10 = this.f3643c && m3492G();
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? 268436821 : 268436275 : z10 ? 268436821 : 268436275 : z10 ? 268435729 : 268436821;
        }
        boolean zM3492G = m3492G();
        if (zM3492G && i10 == 0) {
            return 268435729;
        }
        if (zM3492G) {
            i10--;
        }
        int size = this.f3642b.size();
        return i10 < size ? mo3452q(i10) : i10 - size < m3491F() ? 268436275 : 268436002;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m3504h() {
        if (this instanceof InterfaceC10087c) {
            this.f3657q = ((InterfaceC10087c) this).mo9928a(this);
        }
    }

    /* renamed from: i */
    public abstract void mo3450i(BaseViewHolder baseViewHolder, Object obj);

    /* renamed from: j */
    public void mo3451j(BaseViewHolder holder, Object obj, List payloads) {
        AbstractC9133u.m16133g(holder, "holder");
        AbstractC9133u.m16133g(payloads, "payloads");
    }

    /* renamed from: k */
    public final BaseViewHolder m3505k(Class cls, View view) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(View.class);
                AbstractC9133u.m16132f(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                declaredConstructor.setAccessible(true);
                T tNewInstance = declaredConstructor.newInstance(view);
                if (tNewInstance != null) {
                    return (BaseViewHolder) tNewInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            AbstractC9133u.m16132f(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
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

    /* renamed from: l */
    public BaseViewHolder m3506l(View view) {
        AbstractC9133u.m16133g(view, "view");
        Class clsM3516w = null;
        for (Class<?> superclass = getClass(); clsM3516w == null && superclass != null; superclass = superclass.getSuperclass()) {
            clsM3516w = m3516w(superclass);
        }
        BaseViewHolder baseViewHolder = clsM3516w == null ? new BaseViewHolder(view) : m3505k(clsM3516w, view);
        return baseViewHolder == null ? new BaseViewHolder(view) : baseViewHolder;
    }

    /* renamed from: m */
    public BaseViewHolder m3507m(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        return m3506l(AbstractC10238a.m19152a(parent, i10));
    }

    /* renamed from: n */
    public final Context m3508n() {
        Context context = m3489D().getContext();
        AbstractC9133u.m16132f(context, "recyclerView.context");
        return context;
    }

    /* renamed from: o */
    public final List m3509o() {
        return this.f3642b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f3658r = recyclerView;
        C10085a c10085a = this.f3657q;
        if (c10085a != null) {
            c10085a.m18821a(recyclerView);
        }
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.onAttachedToRecyclerView.1
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i10) {
                    int itemViewType = BaseQuickAdapter.this.getItemViewType(i10);
                    if (itemViewType == 268435729 && BaseQuickAdapter.this.m3515v()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && BaseQuickAdapter.this.m3513t()) {
                        return 1;
                    }
                    BaseQuickAdapter.m3484d(BaseQuickAdapter.this);
                    return BaseQuickAdapter.this.mo3458H(itemViewType) ? ((GridLayoutManager) layoutManager).getSpanCount() : spanSizeLookup.getSpanSize(i10);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f3658r = null;
    }

    /* renamed from: p */
    public int m3510p() {
        return this.f3642b.size();
    }

    /* renamed from: q */
    public int mo3452q(int i10) {
        return super.getItemViewType(i10);
    }

    /* renamed from: r */
    public final C10085a m3511r() {
        C10085a c10085a = this.f3657q;
        if (c10085a == null) {
            throw new IllegalStateException("Please first implements DraggableModule");
        }
        AbstractC9133u.m16130d(c10085a);
        return c10085a;
    }

    /* renamed from: s */
    public final int m3512s() {
        return m3491F() ? 1 : 0;
    }

    /* renamed from: t */
    public final boolean m3513t() {
        return this.f3647g;
    }

    /* renamed from: u */
    public final int m3514u() {
        return m3492G() ? 1 : 0;
    }

    /* renamed from: v */
    public final boolean m3515v() {
        return this.f3646f;
    }

    /* renamed from: w */
    public final Class m3516w(Class cls) {
        try {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            AbstractC9133u.m16132f(types, "types");
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

    /* renamed from: x */
    public Object m3517x(int i10) {
        return AbstractC8778f0.m14569o0(this.f3642b, i10);
    }

    /* renamed from: y */
    public final AbstractC10086b m3518y() {
        return null;
    }

    /* renamed from: z */
    public final InterfaceC9963b m3519z() {
        return null;
    }
}
