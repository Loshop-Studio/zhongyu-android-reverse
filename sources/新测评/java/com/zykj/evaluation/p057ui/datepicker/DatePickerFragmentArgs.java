package com.zykj.evaluation.p057ui.datepicker;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \b2\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0017"}, m13558d2 = {"Lcom/zykj/evaluation/ui/datepicker/DatePickerFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "start", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DatePickerFragmentArgs implements NavArgs {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String start;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String end;

    /* renamed from: com.zykj.evaluation.ui.datepicker.DatePickerFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DatePickerFragmentArgs m9246a(Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(DatePickerFragmentArgs.class.getClassLoader());
            String string2 = "";
            if (bundle.containsKey("start")) {
                string = bundle.getString("start");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
                }
            } else {
                string = "";
            }
            if (bundle.containsKey("end") && (string2 = bundle.getString("end")) == null) {
                throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
            }
            return new DatePickerFragmentArgs(string, string2);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerFragmentArgs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JvmStatic
    public static final DatePickerFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m9246a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* renamed from: b, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* renamed from: c */
    public final Bundle m9245c() {
        Bundle bundle = new Bundle();
        bundle.putString("start", this.start);
        bundle.putString("end", this.end);
        return bundle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatePickerFragmentArgs)) {
            return false;
        }
        DatePickerFragmentArgs datePickerFragmentArgs = (DatePickerFragmentArgs) other;
        return Intrinsics.areEqual(this.start, datePickerFragmentArgs.start) && Intrinsics.areEqual(this.end, datePickerFragmentArgs.end);
    }

    public int hashCode() {
        return (this.start.hashCode() * 31) + this.end.hashCode();
    }

    public String toString() {
        return "DatePickerFragmentArgs(start=" + this.start + ", end=" + this.end + ")";
    }

    public DatePickerFragmentArgs(String start, String end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
    }

    public /* synthetic */ DatePickerFragmentArgs(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
