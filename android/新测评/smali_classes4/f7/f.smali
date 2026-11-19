.class public abstract Lf7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo8/f;


# direct methods
.method public static a(Lkotlinx/coroutines/flow/MutableStateFlow;Lf7/c;Lcom/zykj/evaluation/di/AppDatabase;)Lcom/zykj/evaluation/upload/OssTaskManger;
    .locals 1

    .line 1
    sget-object v0, Lf7/d;->a:Lf7/d;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lf7/d;->b(Lkotlinx/coroutines/flow/MutableStateFlow;Lf7/c;Lcom/zykj/evaluation/di/AppDatabase;)Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lo8/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 12
    .line 13
    return-object p0
.end method
