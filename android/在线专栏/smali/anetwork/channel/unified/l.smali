.class Lanetwork/channel/unified/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lanetwork/channel/unified/k;


# direct methods
.method constructor <init>(Lanetwork/channel/unified/k;)V
    .locals 0

    iput-object p1, p0, Lanetwork/channel/unified/l;->a:Lanetwork/channel/unified/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lanetwork/channel/unified/l;->a:Lanetwork/channel/unified/k;

    iget-object v0, v0, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    iget-object v0, v0, Lanetwork/channel/unified/j;->e:Lanetwork/channel/unified/IUnifiedTask;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
