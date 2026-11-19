package com.liulishuo.okdownload.core.exception;

import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ResumeFailedException extends IOException {

    /* renamed from: a */
    public final ResumeFailedCause f5336a;

    public ResumeFailedException(ResumeFailedCause resumeFailedCause) {
        super("Resume failed because of " + resumeFailedCause);
        this.f5336a = resumeFailedCause;
    }
}
