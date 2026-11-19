.class final Lz1/b$b$n$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b$n;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lz1/b$b$n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz1/b$b$n$a;

    invoke-direct {v0}, Lz1/b$b$n$a;-><init>()V

    sput-object v0, Lz1/b$b$n$a;->a:Lz1/b$b$n$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0
    .param p1    # Lcom/zykj/message/server/bean/UserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    invoke-virtual {p0, p1}, Lz1/b$b$n$a;->a(Lcom/zykj/message/server/bean/UserInfo;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
