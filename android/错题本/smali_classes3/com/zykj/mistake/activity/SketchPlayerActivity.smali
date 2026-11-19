.class public final Lcom/zykj/mistake/activity/SketchPlayerActivity;
.super Lcom/zykj/mistake/base/BaseMVPActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseMVPActivity<",
        "Lcom/zykj/mistake/presenter/SketchPlayerPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityLessonPlayerBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/zykj/mistake/activity/SketchPlayerActivity;",
        "Lcom/zykj/mistake/base/BaseMVPActivity;",
        "Lcom/zykj/mistake/presenter/SketchPlayerPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityLessonPlayerBinding;",
        "",
        "<init>",
        "()V",
        "io/reactivex/internal/operators/observable/c",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic g:I


# instance fields
.field public e:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Lessons"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/mistake/activity/SketchPlayerActivity;->f:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final o()I
    .locals 1

    .line 1
    # RE layout layout/activity_lesson_player (0x7f0c001d), APK res/_-.xml
    sget v0, Lcom/zykj/mistake/R$layout;->activity_lesson_player:I

    .line 2
    .line 3
    return v0
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "audio"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Landroid/media/AudioManager;

    .line 18
    .line 19
    const/16 v1, 0x18

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/16 v3, 0x8

    .line 23
    .line 24
    const/4 v4, 0x3

    .line 25
    const/4 v5, 0x1

    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    const/16 v1, 0x19

    .line 29
    .line 30
    if-eq p1, v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, -0x1

    .line 34
    invoke-virtual {v0, v4, v1, v5}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3, v5, v2}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0, v4, v5, v5}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3, v5, v2}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
.end method

.method public final q()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/mistake/R$id;->sketch_play_fragment:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "null cannot be cast to non-null type com.zykj.view.board.play.SketchPlayFragment"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/mistake/activity/SketchPlayerActivity;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 19
    .line 20
    new-instance v1, Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 21
    .line 22
    new-instance v3, Lcom/zykj/mistake/activity/b0;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v3, p0, v2}, Lcom/zykj/mistake/activity/b0;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 26
    .line 27
    .line 28
    const/16 v12, 0x2fd

    .line 29
    .line 30
    const/4 v13, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x1

    .line 39
    const/4 v11, 0x0

    .line 40
    invoke-direct/range {v1 .. v13}, Lcom/zykj/view/board/play/NewPlayerConfig;-><init>(ZLr6/a;Lr6/a;ZLr6/a;Ljava/util/List;Lr6/a;Lcom/zykj/view/board/play/PlayActionListener;ZZILkotlin/jvm/internal/e;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->setNewPlayerConfig(Lcom/zykj/view/board/play/NewPlayerConfig;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final s()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/mistake/presenter/SketchPlayerPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "url"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ""

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move-object v0, v1

    .line 16
    :cond_0
    sget-object v2, Lcom/zykj/mistake/utils/f;->a:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x6

    .line 20
    const/16 v4, 0x2f

    .line 21
    .line 22
    invoke-static {v0, v4, v2, v3}, Lkotlin/text/p;->S(Ljava/lang/CharSequence;CII)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x1

    .line 27
    const/4 v4, -0x1

    .line 28
    if-ne v2, v4, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    add-int/2addr v2, v3

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "substring(...)"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    const-string v2, ".zip"

    .line 42
    .line 43
    invoke-static {v1, v2}, Lkotlin/text/p;->X(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lcom/zykj/mistake/activity/SketchPlayerActivity;->f:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v5, "/"

    .line 58
    .line 59
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-string v5, "examId"

    .line 78
    .line 79
    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    const-string v6, "questionId"

    .line 88
    .line 89
    invoke-virtual {v5, v6, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {p0, v3}, Lcom/zykj/mistake/base/BaseMVPActivity;->d(Z)V

    .line 94
    .line 95
    .line 96
    new-instance v3, Lcom/zykj/mistake/utils/h;

    .line 97
    .line 98
    invoke-direct {v3, v1, v0}, Lcom/zykj/mistake/utils/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Lcom/zykj/mistake/activity/f0;

    .line 102
    .line 103
    invoke-direct {v5, p0, v1, v2, v4}, Lcom/zykj/mistake/activity/f0;-><init>(Lcom/zykj/mistake/activity/SketchPlayerActivity;Ljava/lang/String;II)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Lcom/zykj/mistake/activity/g0;

    .line 107
    .line 108
    invoke-direct {v1, p0, v2, v4}, Lcom/zykj/mistake/activity/g0;-><init>(Lcom/zykj/mistake/activity/SketchPlayerActivity;II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/zykj/mistake/utils/h;->e()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    invoke-virtual {v5}, Lcom/zykj/mistake/activity/f0;->invoke()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_2
    invoke-virtual {v3, v0, v5, v1}, Lcom/zykj/mistake/utils/h;->a(Ljava/lang/String;Lr6/a;Lr6/a;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method
