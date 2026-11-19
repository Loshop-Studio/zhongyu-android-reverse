.class final Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/repair/CommandImageRepairer;->l(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.repair.CommandImageRepairer$repairPageImages$4"
    f = "CommandImageRepairer.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lkotlin/jvm/internal/Ref$IntRef;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;->d:Lkotlin/jvm/internal/Ref$IntRef;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;->d:Lkotlin/jvm/internal/Ref$IntRef;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;->d:Lkotlin/jvm/internal/Ref$IntRef;

    .line 12
    .line 13
    iget p1, p1, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "\u5df2\u6210\u529f\u6062\u590d "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, " \u5f20\u56fe\u7247\uff0c\u91cd\u65b0\u8fdb\u5165\u9875\u9762\u5373\u53ef\u67e5\u770b"

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x0

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method
