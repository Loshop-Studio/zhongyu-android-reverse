.class final Lz1/b$b$e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b$e$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b$e$a;

.field final synthetic b:Lcom/zykj/message/server/bean/ServerInfo;


# direct methods
.method constructor <init>(Lz1/b$b$e$a;Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$e$a$a;->a:Lz1/b$b$e$a;

    iput-object p2, p0, Lz1/b$b$e$a$a;->b:Lcom/zykj/message/server/bean/ServerInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/b$b$e$a$a;->a:Lz1/b$b$e$a;

    iget-object v0, v0, Lz1/b$b$e$a;->a:Lz1/b$b$e;

    iget-object v0, v0, Lz1/b$b$e;->b:Lx2/l;

    iget-object v1, p0, Lz1/b$b$e$a$a;->b:Lcom/zykj/message/server/bean/ServerInfo;

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0, v1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
