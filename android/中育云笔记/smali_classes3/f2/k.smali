.class public final Lf2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/k$a;
    }
.end annotation


# static fields
.field public static final d:Lf2/k$a;

.field public static final e:I


# instance fields
.field public a:Landroid/view/View;

.field public b:I

.field public c:Lhd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf2/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lf2/k$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lf2/k;->d:Lf2/k$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lf2/k;->e:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lf2/k;->a:Landroid/view/View;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance v0, Lf2/j;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lf2/j;-><init>(Lf2/k;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public static synthetic a(Lf2/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lf2/k;->b(Lf2/k;)V

    return-void
.end method

.method public static final b(Lf2/k;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lf2/k;->a:Landroid/view/View;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Lf2/k;->b:I

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    iput v0, p0, Lf2/k;->b:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    if-ne v1, v0, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    sub-int v2, v1, v0

    .line 28
    .line 29
    const/16 v3, 0xc8

    .line 30
    .line 31
    if-le v2, v3, :cond_4

    .line 32
    .line 33
    iget-object v2, p0, Lf2/k;->c:Lhd/p;

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    sub-int/2addr v1, v0

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v2, v3, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_3
    iput v0, p0, Lf2/k;->b:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    sub-int v2, v0, v1

    .line 51
    .line 52
    if-le v2, v3, :cond_6

    .line 53
    .line 54
    iget-object v2, p0, Lf2/k;->c:Lhd/p;

    .line 55
    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 59
    .line 60
    sub-int v1, v0, v1

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v2, v3, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_5
    iput v0, p0, Lf2/k;->b:I

    .line 70
    .line 71
    :cond_6
    :goto_0
    return-void
.end method

.method public static final synthetic c(Lf2/k;Lhd/p;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lf2/k;->d(Lhd/p;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final d(Lhd/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf2/k;->c:Lhd/p;

    .line 2
    .line 3
    return-void
.end method
