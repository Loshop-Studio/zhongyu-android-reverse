.class public final synthetic Li0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;

.field public final synthetic b:Landroidx/lifecycle/Observer;


# direct methods
.method public synthetic constructor <init>(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;Landroidx/lifecycle/Observer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/a;->a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;

    iput-object p2, p0, Li0/a;->b:Landroidx/lifecycle/Observer;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/a;->a:Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;

    iget-object v1, p0, Li0/a;->b:Landroidx/lifecycle/Observer;

    invoke-static {v0, v1, p1}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->a(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;Landroidx/lifecycle/Observer;Ljava/lang/Object;)V

    return-void
.end method
