.class public final Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;-><init>(Lk6/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

.field public final synthetic b:Ls6/k0;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;Ls6/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a;->b:Ls6/k0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/paging/PagingSource;
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;

    .line 2
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;->r()Lk6/g;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a;->b:Ls6/k0;

    invoke-virtual {v2}, Ls6/k0;->n()Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    move-result-object v2

    .line 4
    new-instance v3, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a$a;

    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

    invoke-direct {v3, v4}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a$a;-><init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;)V

    .line 5
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;-><init>(Lk6/g;Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$a;->invoke()Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
