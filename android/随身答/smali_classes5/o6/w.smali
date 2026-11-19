.class public final synthetic Lo6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

.field public final synthetic b:Lp6/k;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;Lp6/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/w;->a:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    iput-object p2, p0, Lo6/w;->b:Lp6/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo6/w;->a:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    iget-object v1, p0, Lo6/w;->b:Lp6/k;

    invoke-static {v0, v1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;->g(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;Lp6/k;)V

    return-void
.end method
