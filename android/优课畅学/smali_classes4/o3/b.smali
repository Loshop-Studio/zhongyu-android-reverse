.class public final synthetic Lo3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

.field public final synthetic b:Lcom/zykj/message/server/bean/ServerInfo;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/b;->a:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

    iput-object p2, p0, Lo3/b;->b:Lcom/zykj/message/server/bean/ServerInfo;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lo3/b;->a:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

    iget-object v1, p0, Lo3/b;->b:Lcom/zykj/message/server/bean/ServerInfo;

    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    invoke-static {v0, v1, p1}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->g(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;Lcom/zykj/message/server/bean/UserInfo;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
