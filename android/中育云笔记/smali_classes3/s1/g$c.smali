.class public final Ls1/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final c:Ljava/net/Socket;

.field public final synthetic d:Ls1/g;


# direct methods
.method public constructor <init>(Ls1/g;Ljava/net/Socket;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1/g$c;->d:Ls1/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ls1/g$c;->c:Ljava/net/Socket;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/g$c;->d:Ls1/g;

    .line 2
    .line 3
    iget-object v1, p0, Ls1/g$c;->c:Ljava/net/Socket;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ls1/g;->b(Ls1/g;Ljava/net/Socket;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
