package com.chad.library.adapter.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.C0362d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.mistake.adapter.DetailNoteImageAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p006a5.ViewOnClickListenerC0015f;
import p059f5.C5527a;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBaseQuickAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQuickAdapter.kt\ncom/chad/library/adapter/base/BaseQuickAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1362:1\n1#2:1363\n13579#3,2:1364\n*S KotlinDebug\n*F\n+ 1 BaseQuickAdapter.kt\ncom/chad/library/adapter/base/BaseQuickAdapter\n*L\n1052#1:1364,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    public final int f2644a;

    /* renamed from: b */
    public final List f2645b = new ArrayList();

    /* renamed from: c */
    public C0362d f2646c;

    /* renamed from: d */
    public final C5527a f2647d;

    public BaseQuickAdapter(int i) {
        this.f2644a = i;
        if (this instanceof DetailNoteImageAdapter) {
            this.f2647d = new C5527a((DetailNoteImageAdapter) this);
        }
        new LinkedHashSet();
        new LinkedHashSet();
    }

    /* renamed from: a */
    public void mo2493a(BaseViewHolder viewHolder, int i) {
        AbstractC5830k.m5330g(viewHolder, "viewHolder");
        if (this.f2646c != null) {
            viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0015f(15, viewHolder, this));
        }
    }

    /* renamed from: b */
    public abstract void mo2494b(BaseViewHolder baseViewHolder, Object obj);

    /* renamed from: c */
    public void mo2495c(BaseViewHolder holder, Object obj, List payloads) {
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(payloads, "payloads");
    }

    /* renamed from: d */
    public int mo2496d(int i) {
        return super.getItemViewType(i);
    }

    /* renamed from: e */
    public boolean mo2500e(int i) {
        return i == 268436821 || i == 268435729 || i == 268436275 || i == 268436002;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseViewHolder holder, int i) {
        AbstractC5830k.m5330g(holder, "holder");
        switch (holder.getItemViewType()) {
            case 268435729:
            case 268436002:
            case 268436275:
            case 268436821:
                break;
            default:
                mo2494b(holder, this.f2645b.get(i));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseViewHolder holder, int i, List payloads) {
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
        }
        switch (holder.getItemViewType()) {
            case 268435729:
            case 268436002:
            case 268436275:
            case 268436821:
                break;
            default:
                mo2495c(holder, this.f2645b.get(i), payloads);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2645b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int size = this.f2645b.size();
        return i < size ? mo2496d(i) : i - size < 0 ? 268436275 : 268436002;
    }

    /* renamed from: h */
    public BaseViewHolder mo2497h(ViewGroup viewGroup, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BaseViewHolder baseViewHolder;
        BaseViewHolder baseViewHolder2;
        Type genericSuperclass;
        Class cls;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f2644a, viewGroup, false);
        AbstractC5830k.m5329f(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        BaseViewHolder baseViewHolder3 = null;
        Class cls2 = null;
        for (Class<?> superclass = getClass(); cls2 == null && superclass != null; superclass = superclass.getSuperclass()) {
            try {
                genericSuperclass = superclass.getGenericSuperclass();
            } catch (TypeNotPresentException e) {
                e.printStackTrace();
            } catch (GenericSignatureFormatError e4) {
                e4.printStackTrace();
            } catch (MalformedParameterizedTypeException e8) {
                e8.printStackTrace();
            }
            if (genericSuperclass instanceof ParameterizedType) {
                Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                AbstractC5830k.m5329f(types, "types");
                for (Type type : types) {
                    if (!(type instanceof Class)) {
                        if (type instanceof ParameterizedType) {
                            Type rawType = ((ParameterizedType) type).getRawType();
                            if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                                cls = (Class) rawType;
                                cls2 = cls;
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                            cls = (Class) type;
                            cls2 = cls;
                            break;
                        }
                    }
                }
                cls2 = null;
            } else {
                cls2 = null;
            }
        }
        if (cls2 == null) {
            baseViewHolder = new BaseViewHolder(viewInflate);
        } else {
            try {
                if (!cls2.isMemberClass() || Modifier.isStatic(cls2.getModifiers())) {
                    Constructor<T> declaredConstructor = cls2.getDeclaredConstructor(View.class);
                    AbstractC5830k.m5329f(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                    declaredConstructor.setAccessible(true);
                    T tNewInstance = declaredConstructor.newInstance(viewInflate);
                    AbstractC5830k.m5328e(tNewInstance, "null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
                    baseViewHolder2 = (BaseViewHolder) tNewInstance;
                } else {
                    Constructor<T> declaredConstructor2 = cls2.getDeclaredConstructor(getClass(), View.class);
                    AbstractC5830k.m5329f(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
                    declaredConstructor2.setAccessible(true);
                    T tNewInstance2 = declaredConstructor2.newInstance(this, viewInflate);
                    AbstractC5830k.m5328e(tNewInstance2, "null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
                    baseViewHolder2 = (BaseViewHolder) tNewInstance2;
                }
                baseViewHolder3 = baseViewHolder2;
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
            } catch (InstantiationException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
            baseViewHolder = baseViewHolder3;
        }
        return baseViewHolder == null ? new BaseViewHolder(viewInflate) : baseViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        AbstractC5830k.m5330g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (mo2500e(holder.getItemViewType())) {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5830k.m5330g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C5527a c5527a = this.f2647d;
        if (c5527a != null) {
            ItemTouchHelper itemTouchHelper = c5527a.f14c;
            if (itemTouchHelper == null) {
                AbstractC5830k.m5339p("itemTouchHelper");
                throw null;
            }
            itemTouchHelper.attachToRecyclerView(recyclerView);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            final GridLayoutManager gridLayoutManager2 = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.onAttachedToRecyclerView.1
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public final int getSpanSize(int i) {
                    BaseQuickAdapter baseQuickAdapter = BaseQuickAdapter.this;
                    int itemViewType = baseQuickAdapter.getItemViewType(i);
                    if (itemViewType == 268435729) {
                        baseQuickAdapter.getClass();
                    }
                    if (itemViewType == 268436275) {
                        baseQuickAdapter.getClass();
                    }
                    baseQuickAdapter.getClass();
                    return baseQuickAdapter.mo2500e(itemViewType) ? ((GridLayoutManager) gridLayoutManager2).getSpanCount() : spanSizeLookup.getSpanSize(i);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC5830k.m5330g(parent, "parent");
        switch (i) {
            case 268435729:
                AbstractC5830k.m5339p("mHeaderLayout");
                throw null;
            case 268436002:
                AbstractC5830k.m5327d(null);
                throw null;
            case 268436275:
                AbstractC5830k.m5339p("mFooterLayout");
                throw null;
            case 268436821:
                AbstractC5830k.m5339p("mEmptyLayout");
                throw null;
            default:
                BaseViewHolder baseViewHolderMo2497h = mo2497h(parent, i);
                mo2493a(baseViewHolderMo2497h, i);
                return baseViewHolderMo2497h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        AbstractC5830k.m5330g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
    }
}
