.class public final synthetic Lq4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/fragment/NoteFragment;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/mistake/dialog/ImageDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/fragment/NoteFragment;Ljava/lang/String;Lcom/zykj/mistake/dialog/ImageDialogFragment;I)V
    .locals 0

    .line 1
    iput p4, p0, Lq4/e;->a:I

    iput-object p1, p0, Lq4/e;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    iput-object p2, p0, Lq4/e;->c:Ljava/lang/String;

    iput-object p3, p0, Lq4/e;->d:Lcom/zykj/mistake/dialog/ImageDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lq4/e;->a:I

    .line 2
    .line 3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lq4/e;->d:Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 7
    .line 8
    iget-object v4, p0, Lq4/e;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v5, p0, Lq4/e;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v5}, Lcom/zykj/mistake/base/BaseMVPFragment;->h()Lcom/zykj/mistake/base/BasePresenter;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/mistake/presenter/NotePresenter;

    .line 20
    .line 21
    iget-wide v5, v5, Lcom/zykj/mistake/fragment/NoteFragment;->e:J

    .line 22
    .line 23
    sget-object v7, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 24
    .line 25
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    new-instance v8, Lcom/zykj/mistake/entity/req/RemovePicReq;

    .line 30
    .line 31
    invoke-direct {v8, v5, v6, v4}, Lcom/zykj/mistake/entity/req/RemovePicReq;-><init>(JLjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v7, v8}, Lcom/zykj/mistake/network/b;->g(Lcom/zykj/mistake/entity/req/RemovePicReq;)Lq5/e;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    new-instance v6, Lb5/h;

    .line 39
    .line 40
    invoke-direct {v6, v0, v4, v2}, Lb5/h;-><init>(Lcom/zykj/mistake/presenter/NotePresenter;Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v5, v6}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_0
    new-instance v0, Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v7, "requireActivity(...)"

    .line 60
    .line 61
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v7, Lq4/e;

    .line 65
    .line 66
    invoke-direct {v7, v5, v4, v3, v2}, Lq4/e;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;Ljava/lang/String;Lcom/zykj/mistake/dialog/ImageDialogFragment;I)V

    .line 67
    .line 68
    .line 69
    iput-object v7, v0, Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;->c:Lr6/a;

    .line 70
    .line 71
    invoke-virtual {v6}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v3, "getSupportFragmentManager(...)"

    .line 76
    .line 77
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->k(Landroidx/fragment/app/FragmentManager;)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
