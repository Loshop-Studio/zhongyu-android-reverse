package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.model.WorkSpec;
import p379vd.InterfaceC11594c;

/* loaded from: classes3.dex */
public interface ConstraintController {
    boolean hasConstraint(WorkSpec workSpec);

    boolean isCurrentlyConstrained(WorkSpec workSpec);

    InterfaceC11594c track(Constraints constraints);
}
