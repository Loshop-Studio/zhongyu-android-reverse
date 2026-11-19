.class public abstract Lcom/blankj/utilcode/util/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# static fields
.field public static c:Z = true

.field public static final d:Ljava/lang/Runnable;


# instance fields
.field public a:J

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/f$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/blankj/utilcode/util/f$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/blankj/utilcode/util/f$b;->d:Ljava/lang/Runnable;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/blankj/utilcode/util/f$b;->b:Z

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/blankj/utilcode/util/f$b;->a:J

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Z)Z
    .locals 0

    .line 1
    sput-boolean p0, Lcom/blankj/utilcode/util/f$b;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static b(Landroid/view/View;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/k0;->E(Landroid/view/View;J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public abstract c(Landroid/view/View;)V
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/blankj/utilcode/util/f$b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/blankj/utilcode/util/f$b;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/blankj/utilcode/util/f$b;->c:Z

    .line 11
    .line 12
    sget-object v0, Lcom/blankj/utilcode/util/f$b;->d:Ljava/lang/Runnable;

    .line 13
    .line 14
    iget-wide v1, p0, Lcom/blankj/utilcode/util/f$b;->a:J

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/blankj/utilcode/util/f$b;->c(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/blankj/utilcode/util/f$b;->a:J

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/f$b;->b(Landroid/view/View;J)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/blankj/utilcode/util/f$b;->c(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method
