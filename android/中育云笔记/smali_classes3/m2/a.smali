.class public final Lm2/a;
.super Landroid/widget/PopupWindow;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm2/a$a;
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lm2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroid/widget/PopupWindow;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lm2/a;->a:Landroid/content/Context;

    .line 10
    .line 11
    new-instance v0, Lm2/b;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0}, Lm2/b;-><init>(Landroid/content/Context;Landroid/widget/PopupWindow;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm2/a;->b:Lm2/b;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic a(Lm2/a;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lm2/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()Lm2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/a;->b:Lm2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/a;->b:Lm2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm2/b;->a()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/a;->b:Lm2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm2/b;->a()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method
