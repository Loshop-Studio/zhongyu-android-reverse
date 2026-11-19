.class final Lcom/zykj/subscriber/MainActivity$f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity;->R()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/subscriber/MainActivity$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/subscriber/MainActivity$f;

    invoke-direct {v0}, Lcom/zykj/subscriber/MainActivity$f;-><init>()V

    sput-object v0, Lcom/zykj/subscriber/MainActivity$f;->a:Lcom/zykj/subscriber/MainActivity$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1
    .param p1    # Lcom/zykj/message/server/bean/ServerInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    :goto_0
    sget-object v0, Lcom/zykj/message/server/bean/Status;->b:Lcom/zykj/message/server/bean/Status;

    if-eq p1, v0, :cond_1

    .line 2
    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object p1

    invoke-virtual {p1}, Lz1/a;->c()V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$f;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
