.class public abstract Ll5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ll5/b;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Ll5/b$a$a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/zykj/base/bean/toast/ToastInfoMessage;

    .line 11
    .line 12
    check-cast p0, Ll5/b$a$a;

    .line 13
    .line 14
    invoke-virtual {p0}, Ll5/b$a$a;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/zykj/base/bean/toast/ToastInfoMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1, v2, v1}, Lo5/h;->d(Lcom/zykj/base/bean/toast/ToastMessage;Ljava/lang/String;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 28
    .line 29
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p0
.end method
