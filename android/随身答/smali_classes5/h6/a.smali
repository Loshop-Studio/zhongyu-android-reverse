.class public abstract Lh6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lh6/b;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lh6/b$a$a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lh6/b$a$a;

    .line 12
    .line 13
    invoke-virtual {p0}, Lh6/b$a$a;->a()Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-static {p0, v1, v0, v1}, Li6/b;->g(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p0, Lh6/b$a$b;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lcom/zykj/base/bean/toast/ToastSuccessMessage;

    .line 28
    .line 29
    check-cast p0, Lh6/b$a$b;

    .line 30
    .line 31
    invoke-virtual {p0}, Lh6/b$a$b;->a()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/zykj/base/bean/toast/ToastSuccessMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v2, v1}, Li6/e;->b(Lcom/zykj/base/bean/toast/ToastMessage;Ljava/lang/String;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    instance-of v0, p0, Lh6/b$a$c;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    new-instance v0, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 47
    .line 48
    check-cast p0, Lh6/b$a$c;

    .line 49
    .line 50
    invoke-virtual {p0}, Lh6/b$a$c;->a()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1, v2, v1}, Li6/e;->b(Lcom/zykj/base/bean/toast/ToastMessage;Ljava/lang/String;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 62
    .line 63
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 64
    .line 65
    .line 66
    throw p0
.end method
