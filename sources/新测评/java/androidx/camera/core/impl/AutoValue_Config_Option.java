package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;

/* loaded from: classes.dex */
final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* renamed from: id */
    private final String f762id;
    private final Object token;
    private final Class<T> valueClass;

    public AutoValue_Config_Option(String str, Class<T> cls, @Nullable Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f762id = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.valueClass = cls;
        this.token = obj;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Config.Option) {
            Config.Option option = (Config.Option) obj;
            if (this.f762id.equals(option.getId()) && this.valueClass.equals(option.getValueClass()) && ((obj2 = this.token) != null ? obj2.equals(option.getToken()) : option.getToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Config.Option
    @NonNull
    public String getId() {
        return this.f762id;
    }

    @Override // androidx.camera.core.impl.Config.Option
    @Nullable
    public Object getToken() {
        return this.token;
    }

    @Override // androidx.camera.core.impl.Config.Option
    @NonNull
    public Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        int iHashCode = (((this.f762id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        Object obj = this.token;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f762id + ", valueClass=" + this.valueClass + ", token=" + this.token + "}";
    }
}
