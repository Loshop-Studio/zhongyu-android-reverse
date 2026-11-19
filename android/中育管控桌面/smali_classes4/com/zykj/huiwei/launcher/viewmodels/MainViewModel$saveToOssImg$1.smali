.class final Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->m(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel"
    f = "MainViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x89
    }
    m = "saveToOssImg"
    n = {
        "uri",
        "fileExt"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$1;->e:I

    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$saveToOssImg$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->m(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
