.class public final synthetic Lo1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV5;

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:Landroidx/lifecycle/Observer;


# direct methods
.method public synthetic constructor <init>(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV5;Ljava/lang/Integer;Landroidx/lifecycle/Observer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/b;->a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV5;

    iput-object p2, p0, Lo1/b;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lo1/b;->c:Landroidx/lifecycle/Observer;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo1/b;->a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV5;

    iget-object v1, p0, Lo1/b;->b:Ljava/lang/Integer;

    iget-object v2, p0, Lo1/b;->c:Landroidx/lifecycle/Observer;

    invoke-static {v0, v1, v2, p1}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV5;->a(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV5;Ljava/lang/Integer;Landroidx/lifecycle/Observer;Ljava/lang/Object;)V

    return-void
.end method
