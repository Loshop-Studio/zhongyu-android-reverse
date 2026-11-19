.class public final synthetic Lkb/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardFragment;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/a0;->c:Lcom/zykj/view/board/board/BoardFragment;

    iput p2, p0, Lkb/a0;->d:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkb/a0;->c:Lcom/zykj/view/board/board/BoardFragment;

    iget v1, p0, Lkb/a0;->d:I

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method
