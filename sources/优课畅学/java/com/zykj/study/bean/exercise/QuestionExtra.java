package com.zykj.study.bean.exercise;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class QuestionExtra implements Parcelable {
    private final List<String> options;
    public static final Parcelable.Creator<QuestionExtra> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<QuestionExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionExtra createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new QuestionExtra(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionExtra[] newArray(int i10) {
            return new QuestionExtra[i10];
        }
    }

    public QuestionExtra(List<String> list) {
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionExtra copy$default(QuestionExtra questionExtra, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = questionExtra.options;
        }
        return questionExtra.copy(list);
    }

    public final List<String> component1() {
        return this.options;
    }

    public final QuestionExtra copy(List<String> list) {
        return new QuestionExtra(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuestionExtra) && AbstractC9133u.m16128b(this.options, ((QuestionExtra) obj).options);
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public int hashCode() {
        List<String> list = this.options;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "QuestionExtra(options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeStringList(this.options);
    }
}
