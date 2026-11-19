.class public Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/Observer;

.field public final synthetic b:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;


# direct methods
.method public constructor <init>(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;Landroidx/lifecycle/Observer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->b:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->a:Landroidx/lifecycle/Observer;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/Observer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->a:Landroidx/lifecycle/Observer;

    .line 2
    .line 3
    return-object v0
.end method

.method public onChanged(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->b:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->a(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->a:Landroidx/lifecycle/Observer;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->b:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->a(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->a:Landroidx/lifecycle/Observer;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->b:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->a(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->a:Landroidx/lifecycle/Observer;

    .line 42
    .line 43
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    if-nez p1, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->b:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;

    .line 51
    .line 52
    iget-boolean v0, v0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->a:Z

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    :cond_0
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData$a;->a:Landroidx/lifecycle/Observer;

    .line 57
    .line 58
    invoke-interface {v0, p1}, Landroidx/lifecycle/Observer;->onChanged(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method
