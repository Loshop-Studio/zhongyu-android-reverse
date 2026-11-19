.class final Lz1/b$b$g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b$g$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b$g$a;

.field final synthetic b:Lcom/zykj/message/server/bean/UserInfo;


# direct methods
.method constructor <init>(Lz1/b$b$g$a;Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$g$a$a;->a:Lz1/b$b$g$a;

    iput-object p2, p0, Lz1/b$b$g$a$a;->b:Lcom/zykj/message/server/bean/UserInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/b$b$g$a$a;->a:Lz1/b$b$g$a;

    iget-object v0, v0, Lz1/b$b$g$a;->a:Lz1/b$b$g;

    iget-object v0, v0, Lz1/b$b$g;->b:Lx2/l;

    iget-object v1, p0, Lz1/b$b$g$a$a;->b:Lcom/zykj/message/server/bean/UserInfo;

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0, v1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
