.class public final Lcom/zykj/http/bean/HeaderLiveData;
.super Landroidx/lifecycle/s;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/s<",
        "Lcom/zykj/http/bean/HeaderBean;",
        ">;"
    }
.end annotation


# instance fields
.field private final lessonDeauthorized:Li3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li3/e<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final offlineMode:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final unauthorized:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Lcom/zykj/lib/error/code/ErrorCode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0}, Landroidx/lifecycle/s;-><init>()V

    iput-object v0, p0, Lcom/zykj/http/bean/HeaderLiveData;->unauthorized:Landroidx/lifecycle/s;

    .line 3
    new-instance v0, Landroidx/lifecycle/s;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/zykj/http/bean/HeaderLiveData;->offlineMode:Landroidx/lifecycle/s;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x7

    .line 4
    invoke-static {v0, v0, v1, v2, v1}, Li3/j;->b(IILh3/a;ILjava/lang/Object;)Li3/e;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/http/bean/HeaderLiveData;->lessonDeauthorized:Li3/e;

    return-void
.end method


# virtual methods
.method public final getLessonDeauthorized()Li3/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li3/e<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/http/bean/HeaderLiveData;->lessonDeauthorized:Li3/e;

    return-object v0
.end method

.method public final getOfflineMode()Landroidx/lifecycle/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/http/bean/HeaderLiveData;->offlineMode:Landroidx/lifecycle/s;

    return-object v0
.end method

.method public final getUnauthorized()Landroidx/lifecycle/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/s<",
            "Lcom/zykj/lib/error/code/ErrorCode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/http/bean/HeaderLiveData;->unauthorized:Landroidx/lifecycle/s;

    return-object v0
.end method
