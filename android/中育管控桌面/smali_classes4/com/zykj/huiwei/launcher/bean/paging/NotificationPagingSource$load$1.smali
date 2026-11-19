.class final Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource"
    f = "NotificationPagingSource.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x18
    }
    m = "load"
    n = {
        "params",
        "page",
        "pageSize"
    }
    s = {
        "L$0",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->this$0:Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->label:I

    iget-object p1, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->this$0:Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
