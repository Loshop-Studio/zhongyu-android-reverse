.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$e;
.super Ldb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->g(Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$e;->b:Lhd/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ldb/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public i(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$e;->b:Lhd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
