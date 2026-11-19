.class public abstract Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/edit/IBoardControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static synthetic a(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ld5/k;
    .locals 0

    .line 1
    if-nez p4, :cond_2

    .line 2
    .line 3
    and-int/lit8 p4, p3, 0x1

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    sget-object p2, Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;->a:Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;

    .line 13
    .line 14
    :cond_1
    invoke-interface {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/IBoardControl;->b(ZLkotlin/jvm/functions/Function0;)Ld5/k;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Super calls with default arguments not supported in this target, function: createPage"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/edit/IBoardControl;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;->a:Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/IBoardControl;->c(ILkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: deletePage"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method
