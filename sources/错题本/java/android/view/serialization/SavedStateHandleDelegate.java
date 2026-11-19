package android.view.serialization;

import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.view.SavedStateHandle;
import android.view.SavedStateRegistry;
import android.view.internal.CanonicalName_jvmKt;
import android.view.serialization.SavedStateConfiguration;
import android.view.serialization.SavedStateDecoderKt;
import android.view.serialization.SavedStateEncoderKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6469a;
import p177u6.InterfaceC6624c;
import p207y6.InterfaceC6792p;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00028\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001d\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006%"}, m5110d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lu6/c;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Li7/b;", "serializer", "", "key", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "Lkotlin/Function0;", "init", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Li7/b;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lr6/a;)V", "loadValue", "(Ljava/lang/String;)Ljava/lang/Object;", "Ld6/s;", "registerSave", "(Ljava/lang/String;)V", "thisRef", "Ly6/p;", "property", "createDefaultKey", "(Ljava/lang/Object;Ly6/p;)Ljava/lang/String;", "getValue", "(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Ly6/p;Ljava/lang/Object;)V", "Landroidx/lifecycle/SavedStateHandle;", "Li7/b;", "Ljava/lang/String;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "Lr6/a;", "Ljava/lang/Object;", "lifecycle-viewmodel-savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class SavedStateHandleDelegate<T> implements InterfaceC6624c {

    @NotNull
    private final SavedStateConfiguration configuration;

    @NotNull
    private final InterfaceC6469a init;

    @Nullable
    private final String key;

    @NotNull
    private final SavedStateHandle savedStateHandle;

    @NotNull
    private final InterfaceC5686b serializer;
    private T value;

    public SavedStateHandleDelegate(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC5686b serializer, @Nullable String str, @NotNull SavedStateConfiguration configuration, @NotNull InterfaceC6469a init) {
        AbstractC5830k.m5330g(savedStateHandle, "savedStateHandle");
        AbstractC5830k.m5330g(serializer, "serializer");
        AbstractC5830k.m5330g(configuration, "configuration");
        AbstractC5830k.m5330g(init, "init");
        this.savedStateHandle = savedStateHandle;
        this.serializer = serializer;
        this.key = str;
        this.configuration = configuration;
        this.init = init;
    }

    private final String createDefaultKey(Object thisRef, InterfaceC6792p property) {
        String str;
        if (thisRef != null) {
            str = CanonicalName_jvmKt.getCanonicalName(AbstractC5832m.m5340a(thisRef.getClass())) + '.';
        } else {
            str = "";
        }
        StringBuilder sbM97v = AbstractC0037f.m97v(str);
        sbM97v.append(property.getName());
        return sbM97v.toString();
    }

    private final T loadValue(String key) {
        Bundle bundle = (Bundle) this.savedStateHandle.get(key);
        if (bundle != null) {
            return (T) SavedStateDecoderKt.decodeFromSavedState(this.serializer, bundle, this.configuration);
        }
        return null;
    }

    private final void registerSave(String key) {
        this.savedStateHandle.setSavedStateProvider(key, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.serialization.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleDelegate.registerSave$lambda$1(this.f1187a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSave$lambda$1(SavedStateHandleDelegate savedStateHandleDelegate) {
        InterfaceC5686b interfaceC5686b = savedStateHandleDelegate.serializer;
        T t8 = savedStateHandleDelegate.value;
        if (t8 != null) {
            return SavedStateEncoderKt.encodeToSavedState(interfaceC5686b, t8, savedStateHandleDelegate.configuration);
        }
        AbstractC5830k.m5339p("value");
        throw null;
    }

    @NotNull
    public T getValue(@Nullable Object thisRef, @NotNull InterfaceC6792p property) {
        AbstractC5830k.m5330g(property, "property");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(thisRef, property);
            }
            registerSave(strCreateDefaultKey);
            T tLoadValue = loadValue(strCreateDefaultKey);
            if (tLoadValue == null) {
                tLoadValue = (T) this.init.invoke();
            }
            this.value = tLoadValue;
        }
        T t8 = this.value;
        if (t8 != null) {
            return t8;
        }
        AbstractC5830k.m5339p("value");
        throw null;
    }

    public void setValue(@Nullable Object thisRef, @NotNull InterfaceC6792p property, @NotNull T value) {
        AbstractC5830k.m5330g(property, "property");
        AbstractC5830k.m5330g(value, "value");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(thisRef, property);
            }
            registerSave(strCreateDefaultKey);
        }
        this.value = value;
    }
}
