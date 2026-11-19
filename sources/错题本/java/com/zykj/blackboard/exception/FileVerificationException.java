package com.zykj.blackboard.exception;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m5110d2 = {"Lcom/zykj/blackboard/exception/FileVerificationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "filePath", "", "validate", "(Ljava/lang/String;Ljava/lang/String;)V", "message", "getMessage", "()Ljava/lang/String;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FileVerificationException extends Exception {

    @NotNull
    private final String filePath;

    @NotNull
    private final String validate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileVerificationException(@NotNull String filePath, @NotNull String validate) {
        super(filePath);
        AbstractC5830k.m5330g(filePath, "filePath");
        AbstractC5830k.m5330g(validate, "validate");
        this.filePath = filePath;
        this.validate = validate;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.filePath + " 校验值:" + this.validate;
    }
}
