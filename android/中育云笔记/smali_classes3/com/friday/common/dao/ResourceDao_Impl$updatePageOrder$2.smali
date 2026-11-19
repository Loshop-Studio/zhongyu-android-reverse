.class final Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/dao/ResourceDao_Impl;->o(Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/l;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.dao.ResourceDao_Impl$updatePageOrder$2"
    f = "ResourceDao_Impl.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/dao/ResourceDao_Impl;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/util/Map;

.field public final synthetic g:J


# direct methods
.method public constructor <init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/util/Map;JLvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->d:Lcom/friday/common/dao/ResourceDao_Impl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->e:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->f:Ljava/util/Map;

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->g:J

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->d:Lcom/friday/common/dao/ResourceDao_Impl;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->e:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->f:Ljava/util/Map;

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->g:J

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/util/Map;JLvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->invoke(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->d:Lcom/friday/common/dao/ResourceDao_Impl;

    .line 28
    .line 29
    move p1, v2

    .line 30
    iget-object v2, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->f:Ljava/util/Map;

    .line 33
    .line 34
    iget-wide v4, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->g:J

    .line 35
    .line 36
    iput p1, p0, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;->c:I

    .line 37
    .line 38
    move-object v6, p0

    .line 39
    invoke-static/range {v1 .. v6}, Lcom/friday/common/dao/ResourceDao_Impl;->H0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p1
.end method
