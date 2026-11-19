.class public final synthetic Lo6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/v;->a:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;

    iput-object p2, p0, Lo6/v;->b:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo6/v;->a:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;

    iget-object v1, p0, Lo6/v;->b:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->b(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;Landroid/view/View;)V

    return-void
.end method
