.class public final Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/appcompat/app/AppCompatActivity;

.field public final b:Z

.field public final c:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Z)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->b:Z

    .line 12
    .line 13
    new-instance p1, Le4/a;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Le4/a;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c:Lkotlin/Lazy;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->b(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->b:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Le4/g;->a:Le4/g;

    .line 6
    .line 7
    invoke-virtual {p0}, Le4/g;->a()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->f(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 1

    .line 1
    and-int/lit8 p10, p9, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p10, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p10, p9, 0x4

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p10, p9, 0x8

    .line 13
    .line 14
    if-eqz p10, :cond_2

    .line 15
    .line 16
    move-object p4, v0

    .line 17
    :cond_2
    and-int/lit8 p10, p9, 0x10

    .line 18
    .line 19
    if-eqz p10, :cond_3

    .line 20
    .line 21
    move-object p5, v0

    .line 22
    :cond_3
    and-int/lit8 p10, p9, 0x20

    .line 23
    .line 24
    if-eqz p10, :cond_4

    .line 25
    .line 26
    move-object p6, v0

    .line 27
    :cond_4
    and-int/lit8 p10, p9, 0x40

    .line 28
    .line 29
    if-eqz p10, :cond_5

    .line 30
    .line 31
    move-object p7, v0

    .line 32
    :cond_5
    and-int/lit16 p9, p9, 0x80

    .line 33
    .line 34
    if-eqz p9, :cond_6

    .line 35
    .line 36
    move-object p8, v0

    .line 37
    :cond_6
    invoke-virtual/range {p0 .. p8}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->h(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 1

    .line 1
    and-int/lit8 p10, p9, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p10, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p10, p9, 0x4

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p10, p9, 0x8

    .line 13
    .line 14
    if-eqz p10, :cond_2

    .line 15
    .line 16
    move-object p4, v0

    .line 17
    :cond_2
    and-int/lit8 p10, p9, 0x10

    .line 18
    .line 19
    if-eqz p10, :cond_3

    .line 20
    .line 21
    move-object p5, v0

    .line 22
    :cond_3
    and-int/lit8 p10, p9, 0x20

    .line 23
    .line 24
    if-eqz p10, :cond_4

    .line 25
    .line 26
    move-object p6, v0

    .line 27
    :cond_4
    and-int/lit8 p10, p9, 0x40

    .line 28
    .line 29
    if-eqz p10, :cond_5

    .line 30
    .line 31
    move-object p7, v0

    .line 32
    :cond_5
    and-int/lit16 p9, p9, 0x80

    .line 33
    .line 34
    if-eqz p9, :cond_6

    .line 35
    .line 36
    move-object p8, v0

    .line 37
    :cond_6
    invoke-virtual/range {p0 .. p8}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->j(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 8
    .line 9
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isVisible()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final e(Z)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;->k(Z)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 10

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v5, p4

    .line 14
    move-object v6, p5

    .line 15
    move-object/from16 v7, p6

    .line 16
    .line 17
    move-object/from16 v8, p7

    .line 18
    .line 19
    move-object/from16 v9, p8

    .line 20
    .line 21
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;->m(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final j(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 10

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v5, p4

    .line 14
    move-object v6, p5

    .line 15
    move-object/from16 v7, p6

    .line 16
    .line 17
    move-object/from16 v8, p7

    .line 18
    .line 19
    move-object/from16 v9, p8

    .line 20
    .line 21
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;->n(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;
    .locals 1

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;->o(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, ""

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    if-nez v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->c()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 45
    .line 46
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw v0
.end method
