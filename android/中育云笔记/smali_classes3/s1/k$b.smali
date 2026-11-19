.class public Ls1/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Ls1/k;


# direct methods
.method public constructor <init>(Ls1/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1/k$b;->a:Ls1/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls1/k;Ls1/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ls1/k$b;-><init>(Ls1/k;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k$b;->a:Ls1/k;

    .line 2
    .line 3
    invoke-static {v0}, Ls1/k;->a(Ls1/k;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls1/k$b;->a()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
