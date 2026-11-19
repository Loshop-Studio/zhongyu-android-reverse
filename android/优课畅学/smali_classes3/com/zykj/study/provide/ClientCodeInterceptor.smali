.class public final Lcom/zykj/study/provide/ClientCodeInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/x;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/provide/ClientCodeInterceptor$a;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CLIENT_CODE:Ljava/lang/String; = "ClientCode"

.field public static final Companion:Lcom/zykj/study/provide/ClientCodeInterceptor$a;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field public clientCodeLiveData:Lcom/zykj/study/bean/ClientCodeLiveData;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/provide/ClientCodeInterceptor$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/study/provide/ClientCodeInterceptor$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/provide/ClientCodeInterceptor;->Companion:Lcom/zykj/study/provide/ClientCodeInterceptor$a;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    sput v1, Lcom/zykj/study/provide/ClientCodeInterceptor;->$stable:I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getName(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/zykj/study/provide/ClientCodeInterceptor;->TAG:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/provide/ClientCodeInterceptor;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final getClientCodeLiveData()Lcom/zykj/study/bean/ClientCodeLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/provide/ClientCodeInterceptor;->clientCodeLiveData:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "clientCodeLiveData"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public intercept(Li9/x$a;)Li9/d0;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Li9/x$a;->a()Li9/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Li9/b0;->i()Li9/b0$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/provide/ClientCodeInterceptor;->getClientCodeLiveData()Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const-string v2, "ClientCode"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Li9/b0$a;->o(Ljava/lang/String;Ljava/lang/String;)Li9/b0$a;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Li9/b0$a;->b()Li9/b0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {p1, v0}, Li9/x$a;->b(Li9/b0;)Li9/d0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public final setClientCodeLiveData(Lcom/zykj/study/bean/ClientCodeLiveData;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/provide/ClientCodeInterceptor;->clientCodeLiveData:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 7
    .line 8
    return-void
.end method
