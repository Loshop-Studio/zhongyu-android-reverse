.class final Lcom/zykj/base/BaseViewModel$launchAsyncData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/base/BaseViewModel;->launchAsyncData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
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
    c = "com.zykj.base.BaseViewModel"
    f = "BaseViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x7d
    }
    m = "launchAsyncData"
    n = {
        "toastLiveData",
        "isDialogVisible",
        "block",
        "async"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/zykj/base/BaseViewModel;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/zykj/base/BaseViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsyncData$1;->f:Lcom/zykj/base/BaseViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsyncData$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/base/BaseViewModel$launchAsyncData$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/base/BaseViewModel$launchAsyncData$1;->g:I

    iget-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsyncData$1;->f:Lcom/zykj/base/BaseViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lcom/zykj/base/BaseViewModel;->launchAsyncData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
