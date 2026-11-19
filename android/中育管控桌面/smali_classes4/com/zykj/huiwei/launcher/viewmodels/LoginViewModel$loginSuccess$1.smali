.class final Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->w(Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel"
    f = "LoginViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x1e5,
        0x1f1,
        0x1f3
    }
    m = "loginSuccess"
    n = {
        "loginReq",
        "loginUrlResp",
        "loginResp",
        "needCheckCrack",
        "loginReq",
        "loginUrlResp",
        "loginResp",
        "needCheckCrack",
        "loginReq",
        "loginUrlResp",
        "loginResp",
        "needCheckCrack"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "Z$0",
        "L$0",
        "L$1",
        "L$2",
        "Z$0",
        "L$0",
        "L$1",
        "L$2",
        "Z$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Z

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->f:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->f:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->f(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
