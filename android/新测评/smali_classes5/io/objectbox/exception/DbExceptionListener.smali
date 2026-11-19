.class public interface abstract Lio/objectbox/exception/DbExceptionListener;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static cancelCurrentException()V
    .locals 0

    .line 1
    invoke-static {}, Lio/objectbox/exception/DbExceptionListenerJni;->nativeCancelCurrentException()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract onDbException(Ljava/lang/Exception;)V
.end method
