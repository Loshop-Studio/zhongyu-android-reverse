package androidx.databinding;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableField<T> extends BaseObservableField implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField(T t8) {
        this.mValue = t8;
    }

    @Nullable
    public T get() {
        return this.mValue;
    }

    public void set(T t8) {
        if (t8 != this.mValue) {
            this.mValue = t8;
            notifyChange();
        }
    }

    public ObservableField() {
    }

    public ObservableField(Observable... observableArr) {
        super(observableArr);
    }
}
