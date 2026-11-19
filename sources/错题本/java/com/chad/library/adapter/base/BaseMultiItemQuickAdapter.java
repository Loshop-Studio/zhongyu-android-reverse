package com.chad.library.adapter.base;

import android.support.v4.media.AbstractC0037f;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBaseMultiItemQuickAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMultiItemQuickAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemQuickAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseMultiItemQuickAdapter<T, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {

    /* renamed from: e */
    public final Object f2641e;

    public BaseMultiItemQuickAdapter() {
        super(0);
        this.f2641e = AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new InterfaceC6469a() { // from class: com.chad.library.adapter.base.BaseMultiItemQuickAdapter$layouts$2
            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final SparseIntArray invoke() {
                return new SparseIntArray();
            }
        });
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: d */
    public final int mo2496d(int i) {
        this.f2645b.get(i).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.e, java.lang.Object] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: h */
    public final BaseViewHolder mo2497h(ViewGroup viewGroup, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BaseViewHolder baseViewHolder;
        BaseViewHolder baseViewHolder2;
        Type genericSuperclass;
        Class cls;
        int i8 = ((SparseIntArray) this.f2641e.getValue()).get(i);
        if (i8 == 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "ViewType: ", " found layoutResId，please use addItemType() first!").toString());
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i8, viewGroup, false);
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
}
