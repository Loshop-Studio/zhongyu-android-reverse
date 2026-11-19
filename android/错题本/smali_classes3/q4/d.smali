.class public final synthetic Lq4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/fragment/NoteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq4/d;->a:I

    iput-object p1, p0, Lq4/d;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lq4/d;->a:I

    .line 2
    .line 3
    check-cast p1, Landroid/net/Uri;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iget-object v1, p0, Lq4/d;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/base/BaseMVPFragment;->d(Z)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->r(Landroid/net/Uri;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "getAbsolutePath(...)"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lcom/zykj/mistake/fragment/NoteFragment;->l(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iget-object v1, p0, Lq4/d;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/base/BaseMVPFragment;->d(Z)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->r(Landroid/net/Uri;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "getAbsolutePath(...)"

    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1}, Lcom/zykj/mistake/fragment/NoteFragment;->l(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_1
    const-string v0, "uri"

    .line 63
    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lq4/d;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    .line 68
    .line 69
    iget-object v1, v0, Lcom/zykj/mistake/fragment/NoteFragment;->h:Lcom/zykj/view/utils/ImagePicker;

    .line 70
    .line 71
    new-instance v2, Lq4/d;

    .line 72
    .line 73
    const/4 v3, 0x2

    .line 74
    invoke-direct {v2, v0, v3}, Lq4/d;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1, v2}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
