.class public final Lk5/h$g;
.super Lk5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:Lk5/h$h;

.field public final b:Lk5/h$d;

.field public final c:Lk5/h$b;

.field public final d:Lk5/h$g;


# direct methods
.method public constructor <init>(Lk5/h$h;Lk5/h$d;Lk5/h$b;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk5/d;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lk5/h$g;->d:Lk5/h$g;

    .line 5
    .line 6
    iput-object p1, p0, Lk5/h$g;->a:Lk5/h$h;

    .line 7
    .line 8
    iput-object p2, p0, Lk5/h$g;->b:Lk5/h$d;

    .line 9
    .line 10
    iput-object p3, p0, Lk5/h$g;->c:Lk5/h$b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Lk8/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h$g;->c:Lk5/h$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/h$b;->a()Lk8/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lcom/zykj/evaluation/ui/MainFragment;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;)V
    .locals 0

    .line 1
    return-void
.end method
