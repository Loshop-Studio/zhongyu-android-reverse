.class public final La2/b;
.super La2/a;
.source "SourceFile"


# instance fields
.field private final b:Lx2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/l<",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final c:Lx2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/l<",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx2/l;Lx2/l;)V
    .locals 1
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lo2/r;",
            ">;",
            "Lx2/l<",
            "-",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "serverCallBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userCallBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, La2/a;-><init>()V

    iput-object p1, p0, La2/b;->b:Lx2/l;

    iput-object p2, p0, La2/b;->c:Lx2/l;

    return-void
.end method


# virtual methods
.method public o(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1
    .param p1    # Lcom/zykj/message/server/bean/ServerInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, La2/b;->b:Lx2/l;

    invoke-interface {v0, p1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public t(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 1
    .param p1    # Lcom/zykj/message/server/bean/UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, La2/b;->c:Lx2/l;

    invoke-interface {v0, p1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
