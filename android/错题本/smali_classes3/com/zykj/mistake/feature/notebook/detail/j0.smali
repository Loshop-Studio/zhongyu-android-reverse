.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lz4/e;

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

.field public final synthetic c:Lcom/zykj/mistake/feature/notebook/detail/k1;

.field public final synthetic d:Lcom/zykj/mistake/dialog/ImageDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lz4/e;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/notebook/detail/k1;Lcom/zykj/mistake/dialog/ImageDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->a:Lz4/e;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->c:Lcom/zykj/mistake/feature/notebook/detail/k1;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->d:Lcom/zykj/mistake/dialog/ImageDialogFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->a:Lz4/e;

    .line 7
    .line 8
    iget-object v1, v1, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 9
    .line 10
    new-instance v2, Landroidx/lifecycle/compose/a;

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 14
    .line 15
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->c:Lcom/zykj/mistake/feature/notebook/detail/k1;

    .line 16
    .line 17
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/j0;->d:Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 18
    .line 19
    invoke-direct {v2, v4, v5, v3, v6}, Landroidx/lifecycle/compose/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v2, v0, Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;->c:Lr6/a;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "getSupportFragmentManager(...)"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->k(Landroidx/fragment/app/FragmentManager;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 37
    .line 38
    return-object v0
.end method
