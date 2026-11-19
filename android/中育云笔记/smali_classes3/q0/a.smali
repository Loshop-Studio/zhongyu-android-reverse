.class public Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/f;


# instance fields
.field public final a:Lh0/f;

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lh0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ld1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p1, p0, Lq0/a;->b:Landroid/content/res/Resources;

    .line 11
    .line 12
    invoke-static {p2}, Ld1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lh0/f;

    .line 17
    .line 18
    iput-object p1, p0, Lq0/a;->a:Lh0/f;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lh0/e;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/a;->a:Lh0/f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lh0/f;->a(Ljava/lang/Object;Lh0/e;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Ljava/lang/Object;IILh0/e;)Lj0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/a;->a:Lh0/f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lh0/f;->b(Ljava/lang/Object;IILh0/e;)Lj0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lq0/a;->b:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-static {p2, p1}, Lq0/u;->c(Landroid/content/res/Resources;Lj0/j;)Lj0/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
