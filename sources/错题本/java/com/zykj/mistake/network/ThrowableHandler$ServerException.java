package com.zykj.mistake.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"com/zykj/mistake/network/ThrowableHandler$ServerException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "(Lcom/zykj/mistake/network/d;)V", "", "code", "I", "getCode", "()I", "setCode", "(I)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ThrowableHandler$ServerException extends RuntimeException {
    private int code;

    @Nullable
    private String message;
    final /* synthetic */ AbstractC5091d this$0;

    public ThrowableHandler$ServerException(AbstractC5091d abstractC5091d) {
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public void setMessage(@Nullable String str) {
        this.message = str;
    }
}
