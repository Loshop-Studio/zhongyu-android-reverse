.class public final Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;-><init>(Lk6/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

.field public final synthetic b:Ls6/k0;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;Ls6/k0;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->b:Ls6/k0;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->c:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/paging/PagingSource;
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomePagingSource;

    .line 2
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->n(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;)Lk6/g;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->b:Ls6/k0;

    iget-wide v3, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->c:J

    invoke-virtual {v2, v3, v4}, Ls6/k0;->o(J)Lcom/zykj/student/dialogue/bean/req/SessionsReq;

    move-result-object v2

    .line 4
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a$a;

    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    invoke-direct {v3, v4}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a$a;-><init>(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;)V

    .line 5
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/student/dialogue/ui/home/HomePagingSource;-><init>(Lk6/g;Lcom/zykj/student/dialogue/bean/req/SessionsReq;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$a;->invoke()Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
