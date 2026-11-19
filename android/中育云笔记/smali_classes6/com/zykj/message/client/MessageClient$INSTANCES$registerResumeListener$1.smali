.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->c(Lhd/l;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
