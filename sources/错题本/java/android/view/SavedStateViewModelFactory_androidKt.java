package android.view;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5434j;

@Metadata(m5109d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0000¢\u0006\u0002\u0010\n\u001a6\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\fH\u0000\"\u0018\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m5110d2 = {"newInstance", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "constructor", "Ljava/lang/reflect/Constructor;", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "ANDROID_VIEWMODEL_SIGNATURE", "", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "signature", "lifecycle-viewmodel-savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class SavedStateViewModelFactory_androidKt {

    @NotNull
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = AbstractC5806u.m5287z(Application.class, SavedStateHandle.class);

    @NotNull
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = AbstractC5806u.m5286y(SavedStateHandle.class);

    @Nullable
    public static final <T> Constructor<T> findMatchingConstructor(@NotNull Class<T> modelClass, @NotNull List<? extends Class<?>> signature) {
        AbstractC5830k.m5330g(modelClass, "modelClass");
        AbstractC5830k.m5330g(signature, "signature");
        C5434j c5434jM5335l = AbstractC5830k.m5335l(modelClass.getConstructors());
        while (c5434jM5335l.hasNext()) {
            Constructor<T> constructor = (Constructor) c5434jM5335l.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC5830k.m5329f(parameterTypes, "getParameterTypes(...)");
            List listM5204e0 = AbstractC5802q.m5204e0(parameterTypes);
            if (signature.equals(listM5204e0)) {
                return constructor;
            }
            if (signature.size() == listM5204e0.size() && listM5204e0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(@NotNull Class<T> modelClass, @NotNull Constructor<T> constructor, @NotNull Object... params) {
        AbstractC5830k.m5330g(modelClass, "modelClass");
        AbstractC5830k.m5330g(constructor, "constructor");
        AbstractC5830k.m5330g(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + modelClass, e);
        } catch (InstantiationException e4) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e4);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e8.getCause());
        }
    }
}
