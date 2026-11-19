.class public final Lcom/zykj/message/server/MessageManage$INSTANCES$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/server/MessageManage$INSTANCES;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/server/MessageManage$INSTANCES;


# direct methods
.method public constructor <init>(Lcom/zykj/message/server/MessageManage$INSTANCES;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/server/MessageManage$INSTANCES$a;->a:Lcom/zykj/message/server/MessageManage$INSTANCES;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "service"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/message/server/MessageManage$INSTANCES$a;->a:Lcom/zykj/message/server/MessageManage$INSTANCES;

    .line 12
    .line 13
    invoke-static {p2}, Lm4/b$a;->p(Landroid/os/IBinder;)Lm4/b;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p2}, Lcom/zykj/message/server/MessageManage$INSTANCES;->e(Lcom/zykj/message/server/MessageManage$INSTANCES;Lm4/b;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/message/server/MessageManage$INSTANCES$a;->a:Lcom/zykj/message/server/MessageManage$INSTANCES;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, Lcom/zykj/message/server/MessageManage$INSTANCES;->e(Lcom/zykj/message/server/MessageManage$INSTANCES;Lm4/b;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
