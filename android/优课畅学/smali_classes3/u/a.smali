.class public Lu/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/e;


# instance fields
.field public final a:Ll/e;

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Ll/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lh0/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p1, p0, Lu/a;->b:Landroid/content/res/Resources;

    .line 11
    .line 12
    invoke-static {p2}, Lh0/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ll/e;

    .line 17
    .line 18
    iput-object p1, p0, Lu/a;->a:Ll/e;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILl/d;)Ln/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/a;->a:Ll/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Ll/e;->a(Ljava/lang/Object;IILl/d;)Ln/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lu/a;->b:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-static {p2, p1}, Lu/y;->c(Landroid/content/res/Resources;Ln/j;)Ln/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public b(Ljava/lang/Object;Ll/d;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu/a;->a:Ll/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ll/e;->b(Ljava/lang/Object;Ll/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
