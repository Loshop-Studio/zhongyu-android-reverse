.class public final synthetic Lkb/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/z;->a:Lcom/zykj/view/board/board/BoardFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/z;->a:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->Q(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Boolean;)V

    return-void
.end method
